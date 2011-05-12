// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/andrewrumble/Fphp.g 2011-05-12 18:25:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class FphpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "IF", "ELSE", "ELIF", "RETURN", "EQ", "GT", "LT", "PRINT", "CLASS", "EXTENDS", "EACH", "WHILE", "FOR", "NEW", "L_PAREN", "R_PAREN", "OBJECT_MEMBER", "QUOTE", "VISIBILITY", "STATIC", "BOOLEAN", "ESC_SEQ", "IDENTIFIER", "VARIABLE", "WS", "INT", "NEWLINE", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "ASSIGNMENT_OPERATOR", "SCOPE", "L_BRACKET", "R_BRACKET", "COMMA", "COLON", "COMMENT", "'\\\\'", "'\\''"
    };
    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int INDENT=4;
    public static final int DEDENT=5;
    public static final int IF=6;
    public static final int ELSE=7;
    public static final int ELIF=8;
    public static final int RETURN=9;
    public static final int EQ=10;
    public static final int GT=11;
    public static final int LT=12;
    public static final int PRINT=13;
    public static final int CLASS=14;
    public static final int EXTENDS=15;
    public static final int EACH=16;
    public static final int WHILE=17;
    public static final int FOR=18;
    public static final int NEW=19;
    public static final int L_PAREN=20;
    public static final int R_PAREN=21;
    public static final int OBJECT_MEMBER=22;
    public static final int QUOTE=23;
    public static final int VISIBILITY=24;
    public static final int STATIC=25;
    public static final int BOOLEAN=26;
    public static final int ESC_SEQ=27;
    public static final int IDENTIFIER=28;
    public static final int VARIABLE=29;
    public static final int WS=30;
    public static final int INT=31;
    public static final int NEWLINE=32;
    public static final int UNICODE_ESC=33;
    public static final int OCTAL_ESC=34;
    public static final int HEX_DIGIT=35;
    public static final int PLUS=36;
    public static final int MINUS=37;
    public static final int MULTIPLY=38;
    public static final int DIVIDE=39;
    public static final int ASSIGNMENT_OPERATOR=40;
    public static final int SCOPE=41;
    public static final int L_BRACKET=42;
    public static final int R_BRACKET=43;
    public static final int COMMA=44;
    public static final int COLON=45;
    public static final int COMMENT=46;

    // delegates
    // delegators


        public FphpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FphpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FphpParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/andrewrumble/Fphp.g"; }


    int level = 0;



    // $ANTLR start "string"
    // /Users/andrewrumble/Fphp.g:70:1: string returns [String value] : ( QUOTE (e1= ESC_SEQ | e1=~ ( '\\\\' | '\\n' | QUOTE ) )* QUOTE | '\\'' (e1= ( ESC_SEQ | ~ ( '\\\\' | '\\n' | '\\'' ) ) )* '\\'' );
    public final String string() throws RecognitionException {
        String value = null;

        Token e1=null;

        try {
            // /Users/andrewrumble/Fphp.g:71:4: ( QUOTE (e1= ESC_SEQ | e1=~ ( '\\\\' | '\\n' | QUOTE ) )* QUOTE | '\\'' (e1= ( ESC_SEQ | ~ ( '\\\\' | '\\n' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==QUOTE) ) {
                alt3=1;
            }
            else if ( (LA3_0==48) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:71:6: QUOTE (e1= ESC_SEQ | e1=~ ( '\\\\' | '\\n' | QUOTE ) )* QUOTE
                    {
                    match(input,QUOTE,FOLLOW_QUOTE_in_string251); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "\"";
                    }
                    // /Users/andrewrumble/Fphp.g:71:29: (e1= ESC_SEQ | e1=~ ( '\\\\' | '\\n' | QUOTE ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==ESC_SEQ) ) {
                            int LA1_2 = input.LA(2);

                            if ( (synpred1_Fphp()) ) {
                                alt1=1;
                            }
                            else if ( (synpred4_Fphp()) ) {
                                alt1=2;
                            }


                        }
                        else if ( ((LA1_0>=INDENT && LA1_0<=OBJECT_MEMBER)||(LA1_0>=VISIBILITY && LA1_0<=BOOLEAN)||(LA1_0>=IDENTIFIER && LA1_0<=INT)||(LA1_0>=UNICODE_ESC && LA1_0<=COMMENT)||LA1_0==48) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:71:31: e1= ESC_SEQ
                    	    {
                    	    e1=(Token)match(input,ESC_SEQ,FOLLOW_ESC_SEQ_in_string259); if (state.failed) return value;
                    	    if ( state.backtracking==0 ) {
                    	      value += (e1!=null?e1.getText():null) + " ";
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/andrewrumble/Fphp.g:71:71: e1=~ ( '\\\\' | '\\n' | QUOTE )
                    	    {
                    	    e1=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=INDENT && input.LA(1)<=OBJECT_MEMBER)||(input.LA(1)>=VISIBILITY && input.LA(1)<=INT)||(input.LA(1)>=UNICODE_ESC && input.LA(1)<=COMMENT)||input.LA(1)==48 ) {
                    	        input.consume();
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return value;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      value += (e1!=null?e1.getText():null) + " ";
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match(input,QUOTE,FOLLOW_QUOTE_in_string286); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += "\"";
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:72:8: '\\'' (e1= ( ESC_SEQ | ~ ( '\\\\' | '\\n' | '\\'' ) ) )* '\\''
                    {
                    match(input,48,FOLLOW_48_in_string298); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "\"";
                    }
                    // /Users/andrewrumble/Fphp.g:72:32: (e1= ( ESC_SEQ | ~ ( '\\\\' | '\\n' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=INDENT && LA2_0<=INT)||(LA2_0>=UNICODE_ESC && LA2_0<=COMMENT)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:0:0: e1= ( ESC_SEQ | ~ ( '\\\\' | '\\n' | '\\'' ) )
                    	    {
                    	    e1=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=INDENT && input.LA(1)<=INT)||(input.LA(1)>=UNICODE_ESC && input.LA(1)<=COMMENT) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return value;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      value += (e1!=null?e1.getText():null);
                    }
                    match(input,48,FOLLOW_48_in_string329); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += "\"";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "string"


    // $ANTLR start "program"
    // /Users/andrewrumble/Fphp.g:148:1: program returns [String value] : e= statement (e= statement )* EOF ;
    public final String program() throws RecognitionException {
        String value = null;

        String e = null;


        try {
            // /Users/andrewrumble/Fphp.g:149:2: (e= statement (e= statement )* EOF )
            // /Users/andrewrumble/Fphp.g:149:4: e= statement (e= statement )* EOF
            {
            pushFollow(FOLLOW_statement_in_program854);
            e=statement();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "<?php\n " +e;
            }
            // /Users/andrewrumble/Fphp.g:149:49: (e= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=IF && LA4_0<=RETURN)||(LA4_0>=PRINT && LA4_0<=CLASS)||(LA4_0>=NEW && LA4_0<=L_PAREN)||(LA4_0>=QUOTE && LA4_0<=VISIBILITY)||LA4_0==BOOLEAN||(LA4_0>=IDENTIFIER && LA4_0<=VARIABLE)||(LA4_0>=INT && LA4_0<=NEWLINE)||LA4_0==48) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:149:50: e= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program861);
            	    e=statement();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	      value += e;
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_program867); if (state.failed) return value;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // /Users/andrewrumble/Fphp.g:151:1: statement returns [String value] : ( expression | assignment | function | RETURN expression | (e1= conditional )+ | NEWLINE | PRINT expression | each | class_block );
    public final String statement() throws RecognitionException {
        String value = null;

        Token RETURN4=null;
        String e1 = null;

        String expression1 = null;

        String assignment2 = null;

        String function3 = null;

        String expression5 = null;

        String expression6 = null;

        String each7 = null;

        String class_block8 = null;


        try {
            // /Users/andrewrumble/Fphp.g:152:2: ( expression | assignment | function | RETURN expression | (e1= conditional )+ | NEWLINE | PRINT expression | each | class_block )
            int alt6=9;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:152:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement880);
                    expression1=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = expression1 + ";";
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:153:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement888);
                    assignment2=assignment();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = assignment2 + ";";
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:154:4: function
                    {
                    pushFollow(FOLLOW_function_in_statement895);
                    function3=function();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = function3;
                    }

                    }
                    break;
                case 4 :
                    // /Users/andrewrumble/Fphp.g:155:4: RETURN expression
                    {
                    RETURN4=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement902); if (state.failed) return value;
                    pushFollow(FOLLOW_expression_in_statement904);
                    expression5=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (RETURN4!=null?RETURN4.getText():null) +" "+ expression5 + ";";
                    }

                    }
                    break;
                case 5 :
                    // /Users/andrewrumble/Fphp.g:156:4: (e1= conditional )+
                    {
                    if ( state.backtracking==0 ) {
                      value = "";
                    }
                    // /Users/andrewrumble/Fphp.g:156:18: (e1= conditional )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case IF:
                            {
                            int LA5_2 = input.LA(2);

                            if ( (synpred16_Fphp()) ) {
                                alt5=1;
                            }


                            }
                            break;
                        case ELIF:
                            {
                            int LA5_3 = input.LA(2);

                            if ( (synpred16_Fphp()) ) {
                                alt5=1;
                            }


                            }
                            break;
                        case ELSE:
                            {
                            int LA5_4 = input.LA(2);

                            if ( (synpred16_Fphp()) ) {
                                alt5=1;
                            }


                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:156:19: e1= conditional
                    	    {
                    	    pushFollow(FOLLOW_conditional_in_statement915);
                    	    e1=conditional();

                    	    state._fsp--;
                    	    if (state.failed) return value;
                    	    if ( state.backtracking==0 ) {
                    	      value += e1;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return value;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 6 :
                    // /Users/andrewrumble/Fphp.g:157:4: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_statement924); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "\n";
                    }

                    }
                    break;
                case 7 :
                    // /Users/andrewrumble/Fphp.g:158:4: PRINT expression
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_statement931); if (state.failed) return value;
                    pushFollow(FOLLOW_expression_in_statement933);
                    expression6=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "print " + expression6 + ";";
                    }

                    }
                    break;
                case 8 :
                    // /Users/andrewrumble/Fphp.g:159:4: each
                    {
                    pushFollow(FOLLOW_each_in_statement940);
                    each7=each();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = each7;
                    }

                    }
                    break;
                case 9 :
                    // /Users/andrewrumble/Fphp.g:160:4: class_block
                    {
                    pushFollow(FOLLOW_class_block_in_statement947);
                    class_block8=class_block();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = class_block8;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "statement"


    // $ANTLR start "assignment"
    // /Users/andrewrumble/Fphp.g:163:1: assignment returns [String value] : ( VARIABLE ASSIGNMENT_OPERATOR expression | array_entry ASSIGNMENT_OPERATOR expression | class_member ASSIGNMENT_OPERATOR expression );
    public final String assignment() throws RecognitionException {
        String value = null;

        Token VARIABLE9=null;
        Token ASSIGNMENT_OPERATOR10=null;
        Token ASSIGNMENT_OPERATOR13=null;
        Token ASSIGNMENT_OPERATOR16=null;
        String expression11 = null;

        String array_entry12 = null;

        String expression14 = null;

        String class_member15 = null;

        String expression17 = null;


        try {
            // /Users/andrewrumble/Fphp.g:164:2: ( VARIABLE ASSIGNMENT_OPERATOR expression | array_entry ASSIGNMENT_OPERATOR expression | class_member ASSIGNMENT_OPERATOR expression )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==VARIABLE) ) {
                switch ( input.LA(2) ) {
                case ASSIGNMENT_OPERATOR:
                    {
                    alt7=1;
                    }
                    break;
                case L_PAREN:
                    {
                    alt7=2;
                    }
                    break;
                case OBJECT_MEMBER:
                    {
                    alt7=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:164:4: VARIABLE ASSIGNMENT_OPERATOR expression
                    {
                    VARIABLE9=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_assignment965); if (state.failed) return value;
                    ASSIGNMENT_OPERATOR10=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignment967); if (state.failed) return value;
                    pushFollow(FOLLOW_expression_in_assignment969);
                    expression11=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (VARIABLE9!=null?VARIABLE9.getText():null) + (ASSIGNMENT_OPERATOR10!=null?ASSIGNMENT_OPERATOR10.getText():null) + expression11;
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:165:4: array_entry ASSIGNMENT_OPERATOR expression
                    {
                    pushFollow(FOLLOW_array_entry_in_assignment976);
                    array_entry12=array_entry();

                    state._fsp--;
                    if (state.failed) return value;
                    ASSIGNMENT_OPERATOR13=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignment978); if (state.failed) return value;
                    pushFollow(FOLLOW_expression_in_assignment980);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = array_entry12 + (ASSIGNMENT_OPERATOR13!=null?ASSIGNMENT_OPERATOR13.getText():null) + expression14;
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:166:4: class_member ASSIGNMENT_OPERATOR expression
                    {
                    pushFollow(FOLLOW_class_member_in_assignment987);
                    class_member15=class_member();

                    state._fsp--;
                    if (state.failed) return value;
                    ASSIGNMENT_OPERATOR16=(Token)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignment989); if (state.failed) return value;
                    pushFollow(FOLLOW_expression_in_assignment991);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = class_member15 + (ASSIGNMENT_OPERATOR16!=null?ASSIGNMENT_OPERATOR16.getText():null) + expression17;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "atom"
    // /Users/andrewrumble/Fphp.g:169:1: atom returns [String value] : ( INT | VARIABLE | VARIABLE '.' IDENTIFIER | BOOLEAN | function_call | NEW e1= instance_call | class_member | new_array | array_entry | string );
    public final String atom() throws RecognitionException {
        String value = null;

        Token INT18=null;
        Token VARIABLE19=null;
        Token VARIABLE20=null;
        Token IDENTIFIER21=null;
        Token BOOLEAN22=null;
        String e1 = null;

        String function_call23 = null;

        String class_member24 = null;

        String new_array25 = null;

        String array_entry26 = null;

        String string27 = null;


        try {
            // /Users/andrewrumble/Fphp.g:170:2: ( INT | VARIABLE | VARIABLE '.' IDENTIFIER | BOOLEAN | function_call | NEW e1= instance_call | class_member | new_array | array_entry | string )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:170:4: INT
                    {
                    INT18=(Token)match(input,INT,FOLLOW_INT_in_atom1009); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (INT18!=null?INT18.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:171:4: VARIABLE
                    {
                    VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atom1016); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (VARIABLE19!=null?VARIABLE19.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:172:4: VARIABLE '.' IDENTIFIER
                    {
                    VARIABLE20=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atom1023); if (state.failed) return value;
                    match(input,OBJECT_MEMBER,FOLLOW_OBJECT_MEMBER_in_atom1025); if (state.failed) return value;
                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom1027); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (VARIABLE20!=null?VARIABLE20.getText():null) + "->" + (IDENTIFIER21!=null?IDENTIFIER21.getText():null);
                    }

                    }
                    break;
                case 4 :
                    // /Users/andrewrumble/Fphp.g:173:4: BOOLEAN
                    {
                    BOOLEAN22=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1034); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (BOOLEAN22!=null?BOOLEAN22.getText():null);
                    }

                    }
                    break;
                case 5 :
                    // /Users/andrewrumble/Fphp.g:174:4: function_call
                    {
                    pushFollow(FOLLOW_function_call_in_atom1041);
                    function_call23=function_call();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = function_call23;
                    }

                    }
                    break;
                case 6 :
                    // /Users/andrewrumble/Fphp.g:175:4: NEW e1= instance_call
                    {
                    match(input,NEW,FOLLOW_NEW_in_atom1048); if (state.failed) return value;
                    pushFollow(FOLLOW_instance_call_in_atom1052);
                    e1=instance_call();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "new " + e1;
                    }

                    }
                    break;
                case 7 :
                    // /Users/andrewrumble/Fphp.g:176:4: class_member
                    {
                    pushFollow(FOLLOW_class_member_in_atom1059);
                    class_member24=class_member();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = class_member24;
                    }

                    }
                    break;
                case 8 :
                    // /Users/andrewrumble/Fphp.g:177:4: new_array
                    {
                    pushFollow(FOLLOW_new_array_in_atom1066);
                    new_array25=new_array();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = new_array25;
                    }

                    }
                    break;
                case 9 :
                    // /Users/andrewrumble/Fphp.g:178:4: array_entry
                    {
                    pushFollow(FOLLOW_array_entry_in_atom1073);
                    array_entry26=array_entry();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = array_entry26;
                    }

                    }
                    break;
                case 10 :
                    // /Users/andrewrumble/Fphp.g:179:4: string
                    {
                    pushFollow(FOLLOW_string_in_atom1080);
                    string27=string();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = string27;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "atom"

    public static class hash_key_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start "hash_key"
    // /Users/andrewrumble/Fphp.g:182:1: hash_key returns [String value] : ( INT | VARIABLE | string );
    public final FphpParser.hash_key_return hash_key() throws RecognitionException {
        FphpParser.hash_key_return retval = new FphpParser.hash_key_return();
        retval.start = input.LT(1);

        Token INT28=null;
        Token VARIABLE29=null;
        String string30 = null;


        try {
            // /Users/andrewrumble/Fphp.g:183:2: ( INT | VARIABLE | string )
            int alt9=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt9=1;
                }
                break;
            case VARIABLE:
                {
                alt9=2;
                }
                break;
            case QUOTE:
            case 48:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:183:4: INT
                    {
                    INT28=(Token)match(input,INT,FOLLOW_INT_in_hash_key1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (INT28!=null?INT28.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:184:4: VARIABLE
                    {
                    VARIABLE29=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_hash_key1105); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = (VARIABLE29!=null?VARIABLE29.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:185:4: string
                    {
                    pushFollow(FOLLOW_string_in_hash_key1112);
                    string30=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.value = string30;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "hash_key"


    // $ANTLR start "array_entry"
    // /Users/andrewrumble/Fphp.g:188:1: array_entry returns [String value] : e0= VARIABLE L_PAREN COLON e1= hash_key R_PAREN ;
    public final String array_entry() throws RecognitionException {
        String value = null;

        Token e0=null;
        FphpParser.hash_key_return e1 = null;


        try {
            // /Users/andrewrumble/Fphp.g:189:2: (e0= VARIABLE L_PAREN COLON e1= hash_key R_PAREN )
            // /Users/andrewrumble/Fphp.g:189:4: e0= VARIABLE L_PAREN COLON e1= hash_key R_PAREN
            {
            e0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_array_entry1133); if (state.failed) return value;
            match(input,L_PAREN,FOLLOW_L_PAREN_in_array_entry1135); if (state.failed) return value;
            match(input,COLON,FOLLOW_COLON_in_array_entry1137); if (state.failed) return value;
            pushFollow(FOLLOW_hash_key_in_array_entry1141);
            e1=hash_key();

            state._fsp--;
            if (state.failed) return value;
            match(input,R_PAREN,FOLLOW_R_PAREN_in_array_entry1143); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = (e0!=null?e0.getText():null) + "[" + (e1!=null?input.toString(e1.start,e1.stop):null) + "]";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "array_entry"


    // $ANTLR start "new_array"
    // /Users/andrewrumble/Fphp.g:192:1: new_array returns [String value] : L_PAREN ( (e0= ( IDENTIFIER | VARIABLE ) COLON )? e3= atom )? ( COMMA (e1= ( IDENTIFIER | VARIABLE ) COLON )? e2= atom )* R_PAREN ;
    public final String new_array() throws RecognitionException {
        String value = null;

        Token e0=null;
        Token e1=null;
        String e3 = null;

        String e2 = null;


        try {
            // /Users/andrewrumble/Fphp.g:193:2: ( L_PAREN ( (e0= ( IDENTIFIER | VARIABLE ) COLON )? e3= atom )? ( COMMA (e1= ( IDENTIFIER | VARIABLE ) COLON )? e2= atom )* R_PAREN )
            // /Users/andrewrumble/Fphp.g:193:4: L_PAREN ( (e0= ( IDENTIFIER | VARIABLE ) COLON )? e3= atom )? ( COMMA (e1= ( IDENTIFIER | VARIABLE ) COLON )? e2= atom )* R_PAREN
            {
            match(input,L_PAREN,FOLLOW_L_PAREN_in_new_array1160); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "new array(";
            }
            // /Users/andrewrumble/Fphp.g:193:37: ( (e0= ( IDENTIFIER | VARIABLE ) COLON )? e3= atom )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=NEW && LA11_0<=L_PAREN)||LA11_0==QUOTE||LA11_0==BOOLEAN||(LA11_0>=IDENTIFIER && LA11_0<=VARIABLE)||LA11_0==INT||LA11_0==48) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:193:39: (e0= ( IDENTIFIER | VARIABLE ) COLON )? e3= atom
                    {
                    // /Users/andrewrumble/Fphp.g:193:39: (e0= ( IDENTIFIER | VARIABLE ) COLON )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==VARIABLE) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==COLON) ) {
                            alt10=1;
                        }
                    }
                    else if ( (LA10_0==IDENTIFIER) ) {
                        int LA10_3 = input.LA(2);

                        if ( (LA10_3==COLON) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/andrewrumble/Fphp.g:193:40: e0= ( IDENTIFIER | VARIABLE ) COLON
                            {
                            e0=(Token)input.LT(1);
                            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=VARIABLE) ) {
                                input.consume();
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return value;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            match(input,COLON,FOLLOW_COLON_in_new_array1175); if (state.failed) return value;
                            if ( state.backtracking==0 ) {
                              value += (e0!=null?e0.getText():null) + "=>";
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_atom_in_new_array1183);
                    e3=atom();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += e3;
                    }

                    }
                    break;

            }

            // /Users/andrewrumble/Fphp.g:193:135: ( COMMA (e1= ( IDENTIFIER | VARIABLE ) COLON )? e2= atom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:193:136: COMMA (e1= ( IDENTIFIER | VARIABLE ) COLON )? e2= atom
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_new_array1190); if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	      value += ",";
            	    }
            	    // /Users/andrewrumble/Fphp.g:193:159: (e1= ( IDENTIFIER | VARIABLE ) COLON )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==VARIABLE) ) {
            	        int LA12_1 = input.LA(2);

            	        if ( (LA12_1==COLON) ) {
            	            alt12=1;
            	        }
            	    }
            	    else if ( (LA12_0==IDENTIFIER) ) {
            	        int LA12_3 = input.LA(2);

            	        if ( (LA12_3==COLON) ) {
            	            alt12=1;
            	        }
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // /Users/andrewrumble/Fphp.g:193:160: e1= ( IDENTIFIER | VARIABLE ) COLON
            	            {
            	            e1=(Token)input.LT(1);
            	            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=VARIABLE) ) {
            	                input.consume();
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return value;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }

            	            match(input,COLON,FOLLOW_COLON_in_new_array1203); if (state.failed) return value;
            	            if ( state.backtracking==0 ) {
            	              value += (e1!=null?e1.getText():null) + "=>";
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_new_array1211);
            	    e2=atom();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	      value += e2;
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              value += ")";
            }
            match(input,R_PAREN,FOLLOW_R_PAREN_in_new_array1218); if (state.failed) return value;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "new_array"


    // $ANTLR start "instance_call"
    // /Users/andrewrumble/Fphp.g:196:1: instance_call returns [String value] : IDENTIFIER ( L_BRACKET ( arguments )? R_BRACKET )? ;
    public final String instance_call() throws RecognitionException {
        String value = null;

        Token IDENTIFIER31=null;
        String arguments32 = null;


        try {
            // /Users/andrewrumble/Fphp.g:197:2: ( IDENTIFIER ( L_BRACKET ( arguments )? R_BRACKET )? )
            // /Users/andrewrumble/Fphp.g:197:4: IDENTIFIER ( L_BRACKET ( arguments )? R_BRACKET )?
            {
            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_instance_call1234); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = (IDENTIFIER31!=null?IDENTIFIER31.getText():null);
            }
            // /Users/andrewrumble/Fphp.g:197:44: ( L_BRACKET ( arguments )? R_BRACKET )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==L_BRACKET) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:197:45: L_BRACKET ( arguments )? R_BRACKET
                    {
                    match(input,L_BRACKET,FOLLOW_L_BRACKET_in_instance_call1239); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value+="(";
                    }
                    // /Users/andrewrumble/Fphp.g:197:69: ( arguments )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=NEW && LA14_0<=L_PAREN)||LA14_0==QUOTE||LA14_0==BOOLEAN||(LA14_0>=IDENTIFIER && LA14_0<=VARIABLE)||LA14_0==INT||LA14_0==48) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/andrewrumble/Fphp.g:197:70: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_instance_call1243);
                            arguments32=arguments();

                            state._fsp--;
                            if (state.failed) return value;
                            if ( state.backtracking==0 ) {
                              value += arguments32;
                            }

                            }
                            break;

                    }

                    match(input,R_BRACKET,FOLLOW_R_BRACKET_in_instance_call1249); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += ")";
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "instance_call"


    // $ANTLR start "expression"
    // /Users/andrewrumble/Fphp.g:200:1: expression returns [String value] : e1= atom ( operator e2= atom )* ;
    public final String expression() throws RecognitionException {
        String value = null;

        String e1 = null;

        String e2 = null;

        String operator33 = null;


        try {
            // /Users/andrewrumble/Fphp.g:201:2: (e1= atom ( operator e2= atom )* )
            // /Users/andrewrumble/Fphp.g:201:4: e1= atom ( operator e2= atom )*
            {
            pushFollow(FOLLOW_atom_in_expression1270);
            e1=atom();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = e1;
            }
            // /Users/andrewrumble/Fphp.g:201:34: ( operator e2= atom )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=PLUS && LA16_0<=DIVIDE)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:201:35: operator e2= atom
            	    {
            	    pushFollow(FOLLOW_operator_in_expression1275);
            	    operator33=operator();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    pushFollow(FOLLOW_atom_in_expression1279);
            	    e2=atom();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	      value += operator33 + e2;
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expression"


    // $ANTLR start "operator"
    // /Users/andrewrumble/Fphp.g:204:1: operator returns [String value] : ( PLUS | MINUS | MULTIPLY | DIVIDE );
    public final String operator() throws RecognitionException {
        String value = null;

        Token PLUS34=null;
        Token MINUS35=null;
        Token MULTIPLY36=null;
        Token DIVIDE37=null;

        try {
            // /Users/andrewrumble/Fphp.g:205:2: ( PLUS | MINUS | MULTIPLY | DIVIDE )
            int alt17=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt17=1;
                }
                break;
            case MINUS:
                {
                alt17=2;
                }
                break;
            case MULTIPLY:
                {
                alt17=3;
                }
                break;
            case DIVIDE:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:205:4: PLUS
                    {
                    PLUS34=(Token)match(input,PLUS,FOLLOW_PLUS_in_operator1300); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (PLUS34!=null?PLUS34.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:206:4: MINUS
                    {
                    MINUS35=(Token)match(input,MINUS,FOLLOW_MINUS_in_operator1307); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (MINUS35!=null?MINUS35.getText():null);
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:207:4: MULTIPLY
                    {
                    MULTIPLY36=(Token)match(input,MULTIPLY,FOLLOW_MULTIPLY_in_operator1314); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (MULTIPLY36!=null?MULTIPLY36.getText():null);
                    }

                    }
                    break;
                case 4 :
                    // /Users/andrewrumble/Fphp.g:208:4: DIVIDE
                    {
                    DIVIDE37=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_operator1321); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (DIVIDE37!=null?DIVIDE37.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "operator"


    // $ANTLR start "function"
    // /Users/andrewrumble/Fphp.g:211:1: function returns [String value] : function_definition NEWLINE block ;
    public final String function() throws RecognitionException {
        String value = null;

        String function_definition38 = null;

        String block39 = null;


        try {
            // /Users/andrewrumble/Fphp.g:212:2: ( function_definition NEWLINE block )
            // /Users/andrewrumble/Fphp.g:212:4: function_definition NEWLINE block
            {
            pushFollow(FOLLOW_function_definition_in_function1338);
            function_definition38=function_definition();

            state._fsp--;
            if (state.failed) return value;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_function1340); if (state.failed) return value;
            pushFollow(FOLLOW_block_in_function1342);
            block39=block();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = function_definition38 + "{\n" + block39 + "\t}\n";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "function"


    // $ANTLR start "block"
    // /Users/andrewrumble/Fphp.g:214:1: block returns [String value] : INDENT (e= statement )+ DEDENT ;
    public final String block() throws RecognitionException {
        String value = null;

        String e = null;



        		level++;
        		value = "";	
        	      
        try {
            // /Users/andrewrumble/Fphp.g:222:2: ( INDENT (e= statement )+ DEDENT )
            // /Users/andrewrumble/Fphp.g:222:5: INDENT (e= statement )+ DEDENT
            {
            match(input,INDENT,FOLLOW_INDENT_in_block1369); if (state.failed) return value;
            // /Users/andrewrumble/Fphp.g:222:12: (e= statement )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=IF && LA18_0<=RETURN)||(LA18_0>=PRINT && LA18_0<=CLASS)||(LA18_0>=NEW && LA18_0<=L_PAREN)||(LA18_0>=QUOTE && LA18_0<=VISIBILITY)||LA18_0==BOOLEAN||(LA18_0>=IDENTIFIER && LA18_0<=VARIABLE)||(LA18_0>=INT && LA18_0<=NEWLINE)||LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:222:13: e= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block1374);
            	    e=statement();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {

            	      for (int i =0 ; i < level; i ++){
            	      	value += "\t";
            	      }
            	      value += e;
            	      				   			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return value;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            match(input,DEDENT,FOLLOW_DEDENT_in_block1388); if (state.failed) return value;

            }

            if ( state.backtracking==0 ) {

              		level--;
              		
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "block"


    // $ANTLR start "function_definition"
    // /Users/andrewrumble/Fphp.g:231:1: function_definition returns [String value] : ( VISIBILITY )? IDENTIFIER SCOPE L_BRACKET (e1= arguments )? R_BRACKET ;
    public final String function_definition() throws RecognitionException {
        String value = null;

        Token VISIBILITY40=null;
        Token IDENTIFIER41=null;
        String e1 = null;


        try {
            // /Users/andrewrumble/Fphp.g:232:2: ( ( VISIBILITY )? IDENTIFIER SCOPE L_BRACKET (e1= arguments )? R_BRACKET )
            // /Users/andrewrumble/Fphp.g:232:4: ( VISIBILITY )? IDENTIFIER SCOPE L_BRACKET (e1= arguments )? R_BRACKET
            {
            if ( state.backtracking==0 ) {
              value ="";
            }
            // /Users/andrewrumble/Fphp.g:232:17: ( VISIBILITY )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==VISIBILITY) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:232:18: VISIBILITY
                    {
                    VISIBILITY40=(Token)match(input,VISIBILITY,FOLLOW_VISIBILITY_in_function_definition1406); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += (VISIBILITY40!=null?VISIBILITY40.getText():null) + " ";
                    }

                    }
                    break;

            }

            IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_definition1412); if (state.failed) return value;
            match(input,SCOPE,FOLLOW_SCOPE_in_function_definition1414); if (state.failed) return value;
            match(input,L_BRACKET,FOLLOW_L_BRACKET_in_function_definition1416); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value += "function " + (IDENTIFIER41!=null?IDENTIFIER41.getText():null) + "(";
            }
            // /Users/andrewrumble/Fphp.g:232:144: (e1= arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=NEW && LA20_0<=L_PAREN)||LA20_0==QUOTE||LA20_0==BOOLEAN||(LA20_0>=IDENTIFIER && LA20_0<=VARIABLE)||LA20_0==INT||LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:232:145: e1= arguments
                    {
                    pushFollow(FOLLOW_arguments_in_function_definition1423);
                    e1=arguments();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += e1;
                    }

                    }
                    break;

            }

            match(input,R_BRACKET,FOLLOW_R_BRACKET_in_function_definition1428); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value +=  ")";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "function_definition"


    // $ANTLR start "function_call"
    // /Users/andrewrumble/Fphp.g:235:1: function_call returns [String value] : ( IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET | VARIABLE '.' IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET );
    public final String function_call() throws RecognitionException {
        String value = null;

        Token IDENTIFIER42=null;
        Token VARIABLE43=null;
        Token IDENTIFIER44=null;
        String e1 = null;


        try {
            // /Users/andrewrumble/Fphp.g:236:2: ( IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET | VARIABLE '.' IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            else if ( (LA23_0==VARIABLE) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:236:4: IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET
                    {
                    IDENTIFIER42=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call1446); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (IDENTIFIER42!=null?IDENTIFIER42.getText():null) + "(";
                    }
                    match(input,L_BRACKET,FOLLOW_L_BRACKET_in_function_call1450); if (state.failed) return value;
                    // /Users/andrewrumble/Fphp.g:236:60: (e1= arguments )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=NEW && LA21_0<=L_PAREN)||LA21_0==QUOTE||LA21_0==BOOLEAN||(LA21_0>=IDENTIFIER && LA21_0<=VARIABLE)||LA21_0==INT||LA21_0==48) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/andrewrumble/Fphp.g:236:61: e1= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_call1455);
                            e1=arguments();

                            state._fsp--;
                            if (state.failed) return value;
                            if ( state.backtracking==0 ) {
                              value += e1;
                            }

                            }
                            break;

                    }

                    match(input,R_BRACKET,FOLLOW_R_BRACKET_in_function_call1460); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += ")";
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:237:4: VARIABLE '.' IDENTIFIER L_BRACKET (e1= arguments )? R_BRACKET
                    {
                    VARIABLE43=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_function_call1467); if (state.failed) return value;
                    match(input,OBJECT_MEMBER,FOLLOW_OBJECT_MEMBER_in_function_call1469); if (state.failed) return value;
                    IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_call1471); if (state.failed) return value;
                    match(input,L_BRACKET,FOLLOW_L_BRACKET_in_function_call1473); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = (VARIABLE43!=null?VARIABLE43.getText():null) + "->" + (IDENTIFIER44!=null?IDENTIFIER44.getText():null) + "(";
                    }
                    // /Users/andrewrumble/Fphp.g:237:96: (e1= arguments )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=NEW && LA22_0<=L_PAREN)||LA22_0==QUOTE||LA22_0==BOOLEAN||(LA22_0>=IDENTIFIER && LA22_0<=VARIABLE)||LA22_0==INT||LA22_0==48) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/andrewrumble/Fphp.g:237:97: e1= arguments
                            {
                            pushFollow(FOLLOW_arguments_in_function_call1479);
                            e1=arguments();

                            state._fsp--;
                            if (state.failed) return value;
                            if ( state.backtracking==0 ) {
                              value += e1;
                            }

                            }
                            break;

                    }

                    match(input,R_BRACKET,FOLLOW_R_BRACKET_in_function_call1484); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value += ")";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "function_call"


    // $ANTLR start "conditional"
    // /Users/andrewrumble/Fphp.g:240:1: conditional returns [String value] : (e1= if_statement NEWLINE e0= block | e1= elif_statement NEWLINE e2= block | else_statement NEWLINE e3= block );
    public final String conditional() throws RecognitionException {
        String value = null;

        String e1 = null;

        String e0 = null;

        String e2 = null;

        String e3 = null;

        String else_statement45 = null;



        		String indents;
        		indents = "";
        		for (int i = 0; i < level; i++){
        			indents += "\t";
        		}
        	
        try {
            // /Users/andrewrumble/Fphp.g:248:2: (e1= if_statement NEWLINE e0= block | e1= elif_statement NEWLINE e2= block | else_statement NEWLINE e3= block )
            int alt24=3;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt24=1;
                }
                break;
            case ELIF:
                {
                alt24=2;
                }
                break;
            case ELSE:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:248:4: e1= if_statement NEWLINE e0= block
                    {
                    pushFollow(FOLLOW_if_statement_in_conditional1510);
                    e1=if_statement();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_conditional1512); if (state.failed) return value;
                    pushFollow(FOLLOW_block_in_conditional1516);
                    e0=block();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = e1 + "{\n" + e0 + indents + "}\n";
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:249:4: e1= elif_statement NEWLINE e2= block
                    {
                    pushFollow(FOLLOW_elif_statement_in_conditional1525);
                    e1=elif_statement();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_conditional1527); if (state.failed) return value;
                    pushFollow(FOLLOW_block_in_conditional1531);
                    e2=block();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = e1 + "{\n" + e2 + indents + "}\n";
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:250:4: else_statement NEWLINE e3= block
                    {
                    pushFollow(FOLLOW_else_statement_in_conditional1539);
                    else_statement45=else_statement();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_conditional1541); if (state.failed) return value;
                    pushFollow(FOLLOW_block_in_conditional1545);
                    e3=block();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = else_statement45 + "{\n" + e3 + indents + "}\n";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "conditional"


    // $ANTLR start "if_statement"
    // /Users/andrewrumble/Fphp.g:253:1: if_statement returns [String value] : IF comparison COLON ;
    public final String if_statement() throws RecognitionException {
        String value = null;

        String comparison46 = null;


        try {
            // /Users/andrewrumble/Fphp.g:254:2: ( IF comparison COLON )
            // /Users/andrewrumble/Fphp.g:254:4: IF comparison COLON
            {
            match(input,IF,FOLLOW_IF_in_if_statement1567); if (state.failed) return value;
            pushFollow(FOLLOW_comparison_in_if_statement1569);
            comparison46=comparison();

            state._fsp--;
            if (state.failed) return value;
            match(input,COLON,FOLLOW_COLON_in_if_statement1571); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "if ("+comparison46+")";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "if_statement"


    // $ANTLR start "elif_statement"
    // /Users/andrewrumble/Fphp.g:257:1: elif_statement returns [String value] : ELIF comparison COLON ;
    public final String elif_statement() throws RecognitionException {
        String value = null;

        String comparison47 = null;


        try {
            // /Users/andrewrumble/Fphp.g:258:2: ( ELIF comparison COLON )
            // /Users/andrewrumble/Fphp.g:258:4: ELIF comparison COLON
            {
            match(input,ELIF,FOLLOW_ELIF_in_elif_statement1589); if (state.failed) return value;
            pushFollow(FOLLOW_comparison_in_elif_statement1591);
            comparison47=comparison();

            state._fsp--;
            if (state.failed) return value;
            match(input,COLON,FOLLOW_COLON_in_elif_statement1593); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "else if (" + comparison47 + ")";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "elif_statement"


    // $ANTLR start "else_statement"
    // /Users/andrewrumble/Fphp.g:260:1: else_statement returns [String value] : ELSE COLON ;
    public final String else_statement() throws RecognitionException {
        String value = null;

        try {
            // /Users/andrewrumble/Fphp.g:261:2: ( ELSE COLON )
            // /Users/andrewrumble/Fphp.g:261:4: ELSE COLON
            {
            match(input,ELSE,FOLLOW_ELSE_in_else_statement1609); if (state.failed) return value;
            match(input,COLON,FOLLOW_COLON_in_else_statement1611); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "else";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "else_statement"


    // $ANTLR start "comparison"
    // /Users/andrewrumble/Fphp.g:263:1: comparison returns [String value] : e1= expression comparator e2= expression ;
    public final String comparison() throws RecognitionException {
        String value = null;

        String e1 = null;

        String e2 = null;

        String comparator48 = null;


        try {
            // /Users/andrewrumble/Fphp.g:264:2: (e1= expression comparator e2= expression )
            // /Users/andrewrumble/Fphp.g:264:4: e1= expression comparator e2= expression
            {
            pushFollow(FOLLOW_expression_in_comparison1629);
            e1=expression();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_comparator_in_comparison1631);
            comparator48=comparator();

            state._fsp--;
            if (state.failed) return value;
            pushFollow(FOLLOW_expression_in_comparison1635);
            e2=expression();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = e1 + " " + comparator48 + " " + e2;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "comparison"


    // $ANTLR start "comparator"
    // /Users/andrewrumble/Fphp.g:267:1: comparator returns [String value] : ( GT | LT | EQ );
    public final String comparator() throws RecognitionException {
        String value = null;

        try {
            // /Users/andrewrumble/Fphp.g:268:2: ( GT | LT | EQ )
            int alt25=3;
            switch ( input.LA(1) ) {
            case GT:
                {
                alt25=1;
                }
                break;
            case LT:
                {
                alt25=2;
                }
                break;
            case EQ:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:268:4: GT
                    {
                    match(input,GT,FOLLOW_GT_in_comparator1653); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = ">";
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:269:4: LT
                    {
                    match(input,LT,FOLLOW_LT_in_comparator1660); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "<";
                    }

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:270:4: EQ
                    {
                    match(input,EQ,FOLLOW_EQ_in_comparator1667); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "==";
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "comparator"


    // $ANTLR start "arguments"
    // /Users/andrewrumble/Fphp.g:273:1: arguments returns [String value] : e= argument ( ',' e= argument )* ;
    public final String arguments() throws RecognitionException {
        String value = null;

        String e = null;


        try {
            // /Users/andrewrumble/Fphp.g:274:2: (e= argument ( ',' e= argument )* )
            // /Users/andrewrumble/Fphp.g:274:4: e= argument ( ',' e= argument )*
            {
            pushFollow(FOLLOW_argument_in_arguments1687);
            e=argument();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = e;
            }
            // /Users/andrewrumble/Fphp.g:274:36: ( ',' e= argument )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:274:37: ',' e= argument
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_arguments1692); if (state.failed) return value;
            	    pushFollow(FOLLOW_argument_in_arguments1696);
            	    e=argument();

            	    state._fsp--;
            	    if (state.failed) return value;
            	    if ( state.backtracking==0 ) {
            	      value += "," + e;
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "argument"
    // /Users/andrewrumble/Fphp.g:277:1: argument returns [String value] : atom ;
    public final String argument() throws RecognitionException {
        String value = null;

        String atom49 = null;


        try {
            // /Users/andrewrumble/Fphp.g:278:2: ( atom )
            // /Users/andrewrumble/Fphp.g:278:4: atom
            {
            pushFollow(FOLLOW_atom_in_argument1715);
            atom49=atom();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = atom49;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "argument"


    // $ANTLR start "each"
    // /Users/andrewrumble/Fphp.g:281:1: each returns [String value] : VARIABLE OBJECT_MEMBER EACH NEWLINE block ;
    public final String each() throws RecognitionException {
        String value = null;

        Token VARIABLE50=null;
        String block51 = null;


        try {
            // /Users/andrewrumble/Fphp.g:282:2: ( VARIABLE OBJECT_MEMBER EACH NEWLINE block )
            // /Users/andrewrumble/Fphp.g:282:4: VARIABLE OBJECT_MEMBER EACH NEWLINE block
            {
            VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_each1733); if (state.failed) return value;
            match(input,OBJECT_MEMBER,FOLLOW_OBJECT_MEMBER_in_each1735); if (state.failed) return value;
            match(input,EACH,FOLLOW_EACH_in_each1737); if (state.failed) return value;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_each1739); if (state.failed) return value;
            pushFollow(FOLLOW_block_in_each1741);
            block51=block();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = "if (!empty("+(VARIABLE50!=null?VARIABLE50.getText():null)+"))\n\tforeach (" + (VARIABLE50!=null?VARIABLE50.getText():null) + " as $key=>$value){\n\t"+block51 + "\t}\n";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "each"


    // $ANTLR start "class_block"
    // /Users/andrewrumble/Fphp.g:285:1: class_block returns [String value] : class_definition NEWLINE block ;
    public final String class_block() throws RecognitionException {
        String value = null;

        String class_definition52 = null;

        String block53 = null;


        try {
            // /Users/andrewrumble/Fphp.g:286:2: ( class_definition NEWLINE block )
            // /Users/andrewrumble/Fphp.g:286:4: class_definition NEWLINE block
            {
            pushFollow(FOLLOW_class_definition_in_class_block1759);
            class_definition52=class_definition();

            state._fsp--;
            if (state.failed) return value;
            match(input,NEWLINE,FOLLOW_NEWLINE_in_class_block1761); if (state.failed) return value;
            pushFollow(FOLLOW_block_in_class_block1763);
            block53=block();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = class_definition52 + "{\n" + block53 + "}";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "class_block"


    // $ANTLR start "class_definition"
    // /Users/andrewrumble/Fphp.g:289:1: class_definition returns [String value] : ( CLASS IDENTIFIER | CLASS e1= IDENTIFIER EXTENDS e2= IDENTIFIER );
    public final String class_definition() throws RecognitionException {
        String value = null;

        Token e1=null;
        Token e2=null;
        Token IDENTIFIER54=null;

        try {
            // /Users/andrewrumble/Fphp.g:290:2: ( CLASS IDENTIFIER | CLASS e1= IDENTIFIER EXTENDS e2= IDENTIFIER )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CLASS) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==IDENTIFIER) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==EXTENDS) ) {
                        alt27=2;
                    }
                    else if ( (LA27_2==NEWLINE) ) {
                        alt27=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:290:4: CLASS IDENTIFIER
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_class_definition1783); if (state.failed) return value;
                    IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_definition1785); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "class " + (IDENTIFIER54!=null?IDENTIFIER54.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:291:4: CLASS e1= IDENTIFIER EXTENDS e2= IDENTIFIER
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_class_definition1792); if (state.failed) return value;
                    e1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_definition1796); if (state.failed) return value;
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_class_definition1798); if (state.failed) return value;
                    e2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_definition1802); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                      value = "class " + (e1!=null?e1.getText():null) + " extends "+ (e2!=null?e2.getText():null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "class_definition"


    // $ANTLR start "class_member"
    // /Users/andrewrumble/Fphp.g:294:1: class_member returns [String value] : VARIABLE '.' IDENTIFIER ;
    public final String class_member() throws RecognitionException {
        String value = null;

        Token VARIABLE55=null;
        Token IDENTIFIER56=null;

        try {
            // /Users/andrewrumble/Fphp.g:295:2: ( VARIABLE '.' IDENTIFIER )
            // /Users/andrewrumble/Fphp.g:295:4: VARIABLE '.' IDENTIFIER
            {
            VARIABLE55=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_class_member1819); if (state.failed) return value;
            match(input,OBJECT_MEMBER,FOLLOW_OBJECT_MEMBER_in_class_member1821); if (state.failed) return value;
            IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_member1823); if (state.failed) return value;
            if ( state.backtracking==0 ) {
              value = (VARIABLE55!=null?VARIABLE55.getText():null) + "->" + (IDENTIFIER56!=null?IDENTIFIER56.getText():null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "class_member"

    // $ANTLR start synpred1_Fphp
    public final void synpred1_Fphp_fragment() throws RecognitionException {   
        Token e1=null;

        // /Users/andrewrumble/Fphp.g:71:31: (e1= ESC_SEQ )
        // /Users/andrewrumble/Fphp.g:71:31: e1= ESC_SEQ
        {
        e1=(Token)match(input,ESC_SEQ,FOLLOW_ESC_SEQ_in_synpred1_Fphp259); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Fphp

    // $ANTLR start synpred4_Fphp
    public final void synpred4_Fphp_fragment() throws RecognitionException {   
        Token e1=null;

        // /Users/andrewrumble/Fphp.g:71:71: (e1=~ ( '\\\\' | '\\n' | QUOTE ) )
        // /Users/andrewrumble/Fphp.g:71:71: e1=~ ( '\\\\' | '\\n' | QUOTE )
        {
        e1=(Token)input.LT(1);
        if ( (input.LA(1)>=INDENT && input.LA(1)<=OBJECT_MEMBER)||(input.LA(1)>=VISIBILITY && input.LA(1)<=INT)||(input.LA(1)>=UNICODE_ESC && input.LA(1)<=COMMENT)||input.LA(1)==48 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred4_Fphp

    // $ANTLR start synpred16_Fphp
    public final void synpred16_Fphp_fragment() throws RecognitionException {   
        String e1 = null;


        // /Users/andrewrumble/Fphp.g:156:19: (e1= conditional )
        // /Users/andrewrumble/Fphp.g:156:19: e1= conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred16_Fphp915);
        e1=conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Fphp

    // $ANTLR start synpred25_Fphp
    public final void synpred25_Fphp_fragment() throws RecognitionException {   
        // /Users/andrewrumble/Fphp.g:172:4: ( VARIABLE '.' IDENTIFIER )
        // /Users/andrewrumble/Fphp.g:172:4: VARIABLE '.' IDENTIFIER
        {
        match(input,VARIABLE,FOLLOW_VARIABLE_in_synpred25_Fphp1023); if (state.failed) return ;
        match(input,OBJECT_MEMBER,FOLLOW_OBJECT_MEMBER_in_synpred25_Fphp1025); if (state.failed) return ;
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred25_Fphp1027); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Fphp

    // $ANTLR start synpred29_Fphp
    public final void synpred29_Fphp_fragment() throws RecognitionException {   
        // /Users/andrewrumble/Fphp.g:176:4: ( class_member )
        // /Users/andrewrumble/Fphp.g:176:4: class_member
        {
        pushFollow(FOLLOW_class_member_in_synpred29_Fphp1059);
        class_member();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Fphp

    // Delegated rules

    public final boolean synpred25_Fphp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Fphp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Fphp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Fphp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Fphp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Fphp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Fphp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Fphp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Fphp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Fphp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA6_eotS =
        "\32\uffff";
    static final String DFA6_eofS =
        "\2\uffff\1\1\12\uffff\1\1\6\uffff\1\1\5\uffff";
    static final String DFA6_minS =
        "\1\6\1\uffff\1\5\1\51\6\uffff\1\20\1\23\1\uffff\1\5\1\uffff\1\27"+
        "\2\25\2\4\1\5\2\4\1\25\1\4\1\25";
    static final String DFA6_maxS =
        "\1\60\1\uffff\1\60\1\52\6\uffff\1\34\1\60\1\uffff\1\60\1\uffff\1"+
        "\60\2\25\5\60\1\25\1\60\1\25";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\4\1\5\1\6\1\7\1\11\2\uffff\1\2\1\uffff"+
        "\1\10\13\uffff";
    static final String DFA6_specialS =
        "\32\uffff}>";
    static final String[] DFA6_transitionS = {
            "\3\6\1\5\3\uffff\1\10\1\11\4\uffff\2\1\2\uffff\1\1\1\4\1\uffff"+
            "\1\1\1\uffff\1\3\1\2\1\uffff\1\1\1\7\17\uffff\1\1",
            "",
            "\5\1\3\uffff\2\1\4\uffff\1\1\1\13\1\uffff\1\12\2\1\1\uffff"+
            "\1\1\1\uffff\2\1\1\uffff\2\1\3\uffff\4\1\1\14\7\uffff\1\1",
            "\1\4\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\13\uffff\1\15",
            "\3\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\14\uffff"+
            "\1\1\1\17\2\uffff\1\1",
            "",
            "\5\1\3\uffff\2\1\4\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\2\1\3\uffff\4\1\1\14\1\uffff\1\1\5\uffff\1\1",
            "",
            "\1\22\5\uffff\1\21\1\uffff\1\20\20\uffff\1\23",
            "\1\24",
            "\1\24",
            "\23\26\1\27\3\26\1\25\4\26\1\uffff\16\26\1\uffff\1\26",
            "\34\30\1\uffff\16\30\1\uffff\1\31",
            "\5\1\3\uffff\2\1\4\uffff\2\1\2\uffff\2\1\1\uffff\1\1\1\uffff"+
            "\2\1\1\uffff\2\1\3\uffff\4\1\1\14\7\uffff\1\1",
            "\23\26\1\27\3\26\1\25\4\26\1\uffff\16\26\1\uffff\1\26",
            "\23\26\1\27\3\26\1\25\4\26\1\uffff\16\26\1\uffff\1\26",
            "\1\24",
            "\34\30\1\uffff\16\30\1\uffff\1\31",
            "\1\24"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "151:1: statement returns [String value] : ( expression | assignment | function | RETURN expression | (e1= conditional )+ | NEWLINE | PRINT expression | each | class_block );";
        }
    }
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\2\uffff\1\12\14\uffff";
    static final String DFA8_minS =
        "\1\23\1\uffff\1\5\5\uffff\1\34\1\23\1\uffff\1\52\3\uffff";
    static final String DFA8_maxS =
        "\1\60\1\uffff\1\60\5\uffff\1\34\1\60\1\uffff\1\52\3\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\10\1\12\2\uffff\1\2\1\uffff\1"+
        "\11\1\3\1\7";
    static final String DFA8_specialS =
        "\13\uffff\1\0\3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\5\1\6\2\uffff\1\7\2\uffff\1\3\1\uffff\1\4\1\2\1\uffff\1\1"+
            "\20\uffff\1\7",
            "",
            "\12\12\4\uffff\1\12\1\11\1\12\1\10\2\12\1\uffff\1\12\1\uffff"+
            "\2\12\1\uffff\2\12\3\uffff\4\12\3\uffff\3\12\2\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "\3\12\1\uffff\1\12\2\uffff\1\12\1\uffff\2\12\1\uffff\1\12\14"+
            "\uffff\1\12\1\14\2\uffff\1\12",
            "",
            "\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "169:1: atom returns [String value] : ( INT | VARIABLE | VARIABLE '.' IDENTIFIER | BOOLEAN | function_call | NEW e1= instance_call | class_member | new_array | array_entry | string );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_11==L_BRACKET) ) {s = 4;}

                        else if ( (synpred25_Fphp()) ) {s = 13;}

                        else if ( (synpred29_Fphp()) ) {s = 14;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_QUOTE_in_string251 = new BitSet(new long[]{0x00017FFEFFFFFFF0L});
    public static final BitSet FOLLOW_ESC_SEQ_in_string259 = new BitSet(new long[]{0x00017FFEFFFFFFF0L});
    public static final BitSet FOLLOW_set_in_string266 = new BitSet(new long[]{0x00017FFEFFFFFFF0L});
    public static final BitSet FOLLOW_QUOTE_in_string286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_string298 = new BitSet(new long[]{0x00017FFEFFFFFFF0L});
    public static final BitSet FOLLOW_set_in_string304 = new BitSet(new long[]{0x00017FFEFFFFFFF0L});
    public static final BitSet FOLLOW_48_in_string329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_program854 = new BitSet(new long[]{0x00010001B59863C0L});
    public static final BitSet FOLLOW_statement_in_program861 = new BitSet(new long[]{0x00010001B59863C0L});
    public static final BitSet FOLLOW_EOF_in_program867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_statement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement902 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_statement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_statement915 = new BitSet(new long[]{0x00000000000001C2L});
    public static final BitSet FOLLOW_NEWLINE_in_statement924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_statement931 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_statement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_each_in_statement940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_block_in_statement947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_assignment965 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignment967 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_assignment969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_entry_in_assignment976 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignment978 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_assignment980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_assignment987 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignment989 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_assignment991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_atom1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_atom1023 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OBJECT_MEMBER_in_atom1025 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_atom1048 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_instance_call_in_atom1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_atom1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_new_array_in_atom1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_entry_in_atom1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_atom1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_hash_key1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_hash_key1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_hash_key1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_array_entry1133 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_L_PAREN_in_array_entry1135 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_array_entry1137 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_hash_key_in_array_entry1141 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_R_PAREN_in_array_entry1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_PAREN_in_new_array1160 = new BitSet(new long[]{0x00011000B4B80000L});
    public static final BitSet FOLLOW_set_in_new_array1169 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_new_array1175 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_atom_in_new_array1183 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_COMMA_in_new_array1190 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_set_in_new_array1197 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_new_array1203 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_atom_in_new_array1211 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_R_PAREN_in_new_array1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_instance_call1234 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_L_BRACKET_in_instance_call1239 = new BitSet(new long[]{0x00010800B4980000L});
    public static final BitSet FOLLOW_arguments_in_instance_call1243 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_R_BRACKET_in_instance_call1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_expression1270 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_operator_in_expression1275 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_atom_in_expression1279 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_PLUS_in_operator1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_operator1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLY_in_operator1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_operator1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function1338 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_function1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_function1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_block1369 = new BitSet(new long[]{0x00010001B59863C0L});
    public static final BitSet FOLLOW_statement_in_block1374 = new BitSet(new long[]{0x00010001B59863E0L});
    public static final BitSet FOLLOW_DEDENT_in_block1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VISIBILITY_in_function_definition1406 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_definition1412 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SCOPE_in_function_definition1414 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_L_BRACKET_in_function_definition1416 = new BitSet(new long[]{0x00010800B4980000L});
    public static final BitSet FOLLOW_arguments_in_function_definition1423 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_R_BRACKET_in_function_definition1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_call1446 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_L_BRACKET_in_function_call1450 = new BitSet(new long[]{0x00010800B4980000L});
    public static final BitSet FOLLOW_arguments_in_function_call1455 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_R_BRACKET_in_function_call1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_function_call1467 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OBJECT_MEMBER_in_function_call1469 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_call1471 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_L_BRACKET_in_function_call1473 = new BitSet(new long[]{0x00010800B4980000L});
    public static final BitSet FOLLOW_arguments_in_function_call1479 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_R_BRACKET_in_function_call1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_conditional1510 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_conditional1512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_conditional1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elif_statement_in_conditional1525 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_conditional1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_conditional1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_statement_in_conditional1539 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_conditional1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_conditional1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1567 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_comparison_in_if_statement1569 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_if_statement1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif_statement1589 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_comparison_in_elif_statement1591 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_elif_statement1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1609 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_else_statement1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_comparison1629 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_comparator_in_comparison1631 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_expression_in_comparison1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_comparator1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_comparator1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_comparator1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argument_in_arguments1687 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_COMMA_in_arguments1692 = new BitSet(new long[]{0x00010000B4980000L});
    public static final BitSet FOLLOW_argument_in_arguments1696 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_atom_in_argument1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_each1733 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OBJECT_MEMBER_in_each1735 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EACH_in_each1737 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_each1739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_each1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_definition_in_class_block1759 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_NEWLINE_in_class_block1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_class_block1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_definition1783 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_definition1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_definition1792 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_definition1796 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EXTENDS_in_class_definition1798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_definition1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_class_member1819 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OBJECT_MEMBER_in_class_member1821 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_member1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESC_SEQ_in_synpred1_Fphp259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_Fphp266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred16_Fphp915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_synpred25_Fphp1023 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OBJECT_MEMBER_in_synpred25_Fphp1025 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred25_Fphp1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_member_in_synpred29_Fphp1059 = new BitSet(new long[]{0x0000000000000002L});

}