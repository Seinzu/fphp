/*
         [The "BSD licence"]
         Copyright (c) 2004 Terence Parr and Loring Craymer
         All rights reserved.

         Redistribution and use in source and binary forms, with or without
         modification, are permitted provided that the following conditions
         are met:
         1. Redistributions of source code must retain the above copyright
         notice, this list of conditions and the following disclaimer.
         2. Redistributions in binary form must reproduce the above copyright
         notice, this list of conditions and the following disclaimer in the
         documentation and/or other materials provided with the distribution.
         3. The name of the author may not be used to endorse or promote products
         derived from this software without specific prior written permission.

         THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
         IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
         OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
         IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
         INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
         NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
         DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
         THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
         (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
         THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/*
	Modified by Andrew Rumble to suit FPHP
 */

import org.antlr.runtime.*;
import java.util.*;

public class FphpTokenSource implements TokenSource{
	public static final int MAX_INDENTS = 100;
    public static final int FIRST_CHAR_POSITION = 0;

    /** The stack of indent levels (column numbers) */
    int[] indentStack = new int[MAX_INDENTS];
    /** stack pointer */
    int sp = -1; // grow upwards

    /** The queue of tokens */
    Vector<Token> tokens = new Vector<Token>();

    /** We pull real tokens from this lexer */
    CommonTokenStream stream;

    int lastTokenAddedIndex = -1;

    String filename;
    boolean inSingle;

    public FphpTokenSource(FphpLexer lexer) {
    }

    public FphpTokenSource(CommonTokenStream stream, String filename) {
        this (stream, filename, false);
    }

    public FphpTokenSource(CommonTokenStream stream, String filename,
            boolean single) {
        this .stream = stream;
        this .filename = filename;
        this .inSingle = single;
        // "state" of indent level is FIRST_CHAR_POSITION
        push(FIRST_CHAR_POSITION);
    }

	public Token nextToken() {
		   // if something in queue, just remove and return it
           if (tokens.size() > 0) {
               Token t = tokens.firstElement();
               tokens.removeElementAt(0);
               //System.out.println(filename + t);
               return t;
           }

           insertImaginaryIndentDedentTokens();

           return nextToken();
       }

       private void generateNewline(Token t) {
           //System.out.println("generating newline from token: " + t);
           CommonToken newline = new CommonToken(FphpLexer.NEWLINE, "\n");
           newline.setLine(t.getLine());
           newline.setCharPositionInLine(t.getCharPositionInLine());
           tokens.addElement(newline);
       }

       private void handleEOF(CommonToken eof, CommonToken prev) {
           //System.out.println("processing eof with token: " + prev);
           if (prev != null) {
               eof.setStartIndex(prev.getStopIndex());
               eof.setStopIndex(prev.getStopIndex());
               eof.setLine(prev.getLine());
               eof.setCharPositionInLine(prev.getCharPositionInLine());
           }
       }

       protected void insertImaginaryIndentDedentTokens() {
           Token t = stream.LT(1);
           stream.consume();

           if (t.getType() == Token.EOF) {
               Token prev = stream.LT(-1);
               handleEOF((CommonToken) t, (CommonToken) prev);
               if (!inSingle) {
                   if (prev == null) {
                       generateNewline(t);
                   } else if (prev.getType() == FphpLexer.WS) {
                       handleDedents(-1, (CommonToken) t);
                       generateNewline(t);
                   } else if (prev.getType() != FphpLexer.NEWLINE) {
                       generateNewline(t);
                       handleDedents(-1, (CommonToken) t);
                   }
               } else {
                   handleDedents(-1, (CommonToken) t);
               }
               enqueue(t);
           } else if (t.getType() == FphpLexer.NEWLINE) {
               // save NEWLINE in the queue
               //System.out.println("found newline: "+t+" stack is "+stackString());
               enqueueHiddens(t);
               tokens.addElement(t);
               Token newline = t;

               // grab first token of next line
               t = stream.LT(1);
               stream.consume();

               List<Token> commentedNewlines = enqueueHiddens(t);

               // compute cpos as the char pos of next non-WS token in line
               int cpos = t.getCharPositionInLine(); // column dictates indent/dedent
               if (t.getType() == Token.EOF) {
                   handleEOF((CommonToken) t, (CommonToken) newline);
                   cpos = -1; // pretend EOF always happens at left edge
               } else if (t.getType() == FphpLexer.WS) {
                   Token next = stream.LT(1);
                   if (next != null && next.getType() == Token.EOF) {
                       stream.consume();
                       return;
                   } else {
                       cpos = t.getText().length();
                   }
               }

               //System.out.println("next token is: "+t);

               // compare to last indent level
               int lastIndent = peek();
               if (cpos > lastIndent) { // they indented; track and gen INDENT
                   handleIndents(cpos, (CommonToken) t);
               } else if (cpos < lastIndent) { // they dedented
                   handleDedents(cpos, (CommonToken) t);
               }

               if (t.getType() == Token.EOF && inSingle) {
                   String newlines = newline.getText();
                   for (int i = 1; i < newlines.length(); i++) {
                       generateNewline(newline);
                   }
                   for (Token c : commentedNewlines) {
                       generateNewline(c);
                   }
               }

               if (t.getType() != FphpLexer.WS) { // discard WS
                   tokens.addElement(t);
               }

           } else {
               enqueue(t);
           }
       }

       private void enqueue(Token t) {
           enqueueHiddens(t);
           tokens.addElement(t);
       }

       private List<Token> enqueueHiddens(Token t) {
           List<Token> newlines = new ArrayList<Token>();
           if (inSingle && t.getType() == Token.EOF) {
               if (stream.size() > lastTokenAddedIndex + 1) {
                   Token hidden = stream.get(lastTokenAddedIndex + 1);
                   /*if (hidden.getType() == FphpLexer.COMMENT) {
                       String text = hidden.getText();
                       int i = text.indexOf("\n");
                       while (i != -1) {
                           newlines.add(hidden);
                           i = text.indexOf("\n", i + 1);
                       }
                   }*/
               }
           }
           List<Token> hiddenTokens = stream.getTokens(
                   lastTokenAddedIndex + 1, t.getTokenIndex() - 1);
           if (hiddenTokens != null) {
               tokens.addAll(hiddenTokens);
           }
           lastTokenAddedIndex = t.getTokenIndex();
           return newlines;
       }

       private void handleIndents(int cpos, CommonToken t) {
           push(cpos);
           //System.out.println("push("+cpos+"): "+stackString());
           CommonToken indent = new CommonToken(FphpParser.INDENT, "");
           indent.setCharPositionInLine(t.getCharPositionInLine());
           indent.setLine(t.getLine());
           indent.setStartIndex(t.getStartIndex() - 1);
           indent.setStopIndex(t.getStartIndex() - 1);
           tokens.addElement(indent);
       }

       private void handleDedents(int cpos, CommonToken t) {
           // how far back did we dedent?
           int prevIndex = findPreviousIndent(cpos, t);
           //System.out.println("dedented; prevIndex of cpos="+cpos+" is "+prevIndex);
           // generate DEDENTs for each indent level we backed up over
           for (int d = sp - 1; d >= prevIndex; d--) {
               CommonToken dedent = new CommonToken(FphpParser.DEDENT,
                       "");
               dedent.setCharPositionInLine(t.getCharPositionInLine());
               dedent.setLine(t.getLine());

               dedent.setStartIndex(t.getStartIndex() - 1);
               dedent.setStopIndex(t.getStartIndex() - 1);

               tokens.addElement(dedent);
           }
           sp = prevIndex; // pop those off indent level
       }

       //  T O K E N  S T A C K  M E T H O D S

       protected void push(int i) {
           if (sp >= MAX_INDENTS) {
               throw new IllegalStateException("stack overflow");
           }
           sp++;
           indentStack[sp] = i;
       }

       protected int pop() {
           if (sp < 0) {
               throw new IllegalStateException("stack underflow");
           }
           int top = indentStack[sp];
           sp--;
           return top;
       }

       protected int peek() {
           return indentStack[sp];
       }

       /** Return the index on stack of previous indent level == i else -1 */
       protected int findPreviousIndent(int i, Token t) {
           for (int j = sp - 1; j >= 0; j--) {
               if (indentStack[j] == i) {
                   return j;
               }
           }
           //The -2 is for the special case of getCharPositionInLine in multiline str nodes.
           if (i == -1 || i == -2) {
               return FIRST_CHAR_POSITION;
           }
          /* RecognitionException p = new RecognitionException(
                   "unindent does not match any outer indentation level",
                   t.getLine(), t.getCharPositionInLine());
           
           throw p;*/
		   throw new IllegalStateException("unindent does not match any outer indentation level");
       }

       public String stackString() {
           StringBuffer buf = new StringBuffer();
           for (int j = sp; j >= 0; j--) {
               buf.append(" ");
               buf.append(indentStack[j]);
           }
           return buf.toString();
       }

       public String getSourceName() {
           return filename;
       }
	
	
}