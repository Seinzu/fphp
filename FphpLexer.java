// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/andrewrumble/Fphp.g 2011-05-12 18:25:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FphpLexer extends Lexer {
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

    public FphpLexer() {;} 
    public FphpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FphpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/andrewrumble/Fphp.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:3:7: ( '\\\\' )
            // /Users/andrewrumble/Fphp.g:3:9: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:4:7: ( '\\'' )
            // /Users/andrewrumble/Fphp.g:4:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:20:4: ( 'if' )
            // /Users/andrewrumble/Fphp.g:20:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:22:6: ( 'else' )
            // /Users/andrewrumble/Fphp.g:22:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:24:6: ( 'elif' )
            // /Users/andrewrumble/Fphp.g:24:8: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:26:8: ( 'return' )
            // /Users/andrewrumble/Fphp.g:26:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:28:4: ( 'eq' )
            // /Users/andrewrumble/Fphp.g:28:6: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:30:4: ( '>' )
            // /Users/andrewrumble/Fphp.g:30:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:32:4: ( '<' )
            // /Users/andrewrumble/Fphp.g:32:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:34:7: ( 'print' )
            // /Users/andrewrumble/Fphp.g:34:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:36:7: ( 'class' )
            // /Users/andrewrumble/Fphp.g:36:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:38:9: ( 'extends' )
            // /Users/andrewrumble/Fphp.g:38:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "EACH"
    public final void mEACH() throws RecognitionException {
        try {
            int _type = EACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:40:6: ( 'each' )
            // /Users/andrewrumble/Fphp.g:40:8: 'each'
            {
            match("each"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EACH"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:42:7: ( 'while' )
            // /Users/andrewrumble/Fphp.g:42:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:44:5: ( 'for' )
            // /Users/andrewrumble/Fphp.g:44:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:46:5: ( 'new' )
            // /Users/andrewrumble/Fphp.g:46:7: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "L_PAREN"
    public final void mL_PAREN() throws RecognitionException {
        try {
            int _type = L_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:48:9: ( '{' )
            // /Users/andrewrumble/Fphp.g:48:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_PAREN"

    // $ANTLR start "R_PAREN"
    public final void mR_PAREN() throws RecognitionException {
        try {
            int _type = R_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:50:9: ( '}' )
            // /Users/andrewrumble/Fphp.g:50:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R_PAREN"

    // $ANTLR start "OBJECT_MEMBER"
    public final void mOBJECT_MEMBER() throws RecognitionException {
        try {
            int _type = OBJECT_MEMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:53:2: ( '.' )
            // /Users/andrewrumble/Fphp.g:53:4: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBJECT_MEMBER"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:56:8: ( '\"' )
            // /Users/andrewrumble/Fphp.g:56:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "VISIBILITY"
    public final void mVISIBILITY() throws RecognitionException {
        try {
            int _type = VISIBILITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:59:2: ( 'public' | 'private' | 'protected' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='u') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='r') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='i') ) {
                        alt1=2;
                    }
                    else if ( (LA1_3=='o') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:59:4: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:60:4: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:61:4: 'protected'
                    {
                    match("protected"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VISIBILITY"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:64:8: ( 'static' )
            // /Users/andrewrumble/Fphp.g:64:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:66:9: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:66:11: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:67:4: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:76:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/andrewrumble/Fphp.g:76:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/andrewrumble/Fphp.g:76:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:80:2: ( '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/andrewrumble/Fphp.g:80:4: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            match('$'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/andrewrumble/Fphp.g:80:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:83:4: ( ( ' ' )+ | ( '\\t' )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==' ') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\t') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:83:6: ( ' ' )+
                    {
                    // /Users/andrewrumble/Fphp.g:83:6: ( ' ' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==' ') ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:83:7: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:84:4: ( '\\t' )+
                    {
                    // /Users/andrewrumble/Fphp.g:84:4: ( '\\t' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\t') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:84:4: '\\t'
                    	    {
                    	    match('\t'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:87:6: ( ( '0' .. '9' )+ )
            // /Users/andrewrumble/Fphp.g:87:8: ( '0' .. '9' )+
            {
            // /Users/andrewrumble/Fphp.g:87:8: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/andrewrumble/Fphp.g:87:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:90:9: ( '\\n' )
            // /Users/andrewrumble/Fphp.g:90:11: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/andrewrumble/Fphp.g:96:6: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt9=1;
                    }
                    break;
                case 'u':
                    {
                    alt9=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:96:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:97:10: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:98:10: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/andrewrumble/Fphp.g:103:6: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>='0' && LA10_1<='3')) ) {
                    int LA10_2 = input.LA(3);

                    if ( ((LA10_2>='0' && LA10_2<='7')) ) {
                        int LA10_4 = input.LA(4);

                        if ( ((LA10_4>='0' && LA10_4<='7')) ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else {
                        alt10=3;}
                }
                else if ( ((LA10_1>='4' && LA10_1<='7')) ) {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>='0' && LA10_3<='7')) ) {
                        alt10=2;
                    }
                    else {
                        alt10=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:103:10: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrewrumble/Fphp.g:103:15: ( '0' .. '3' )
                    // /Users/andrewrumble/Fphp.g:103:16: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /Users/andrewrumble/Fphp.g:103:26: ( '0' .. '7' )
                    // /Users/andrewrumble/Fphp.g:103:27: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/andrewrumble/Fphp.g:103:37: ( '0' .. '7' )
                    // /Users/andrewrumble/Fphp.g:103:38: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:104:10: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrewrumble/Fphp.g:104:15: ( '0' .. '7' )
                    // /Users/andrewrumble/Fphp.g:104:16: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /Users/andrewrumble/Fphp.g:104:26: ( '0' .. '7' )
                    // /Users/andrewrumble/Fphp.g:104:27: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /Users/andrewrumble/Fphp.g:105:10: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /Users/andrewrumble/Fphp.g:105:15: ( '0' .. '7' )
                    // /Users/andrewrumble/Fphp.g:105:16: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/andrewrumble/Fphp.g:110:6: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/andrewrumble/Fphp.g:110:10: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/andrewrumble/Fphp.g:115:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/andrewrumble/Fphp.g:115:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:118:6: ( '+' )
            // /Users/andrewrumble/Fphp.g:118:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:120:7: ( '-' )
            // /Users/andrewrumble/Fphp.g:120:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULTIPLY"
    public final void mMULTIPLY() throws RecognitionException {
        try {
            int _type = MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:122:9: ( '*' )
            // /Users/andrewrumble/Fphp.g:122:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:124:8: ( '/' )
            // /Users/andrewrumble/Fphp.g:124:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "ASSIGNMENT_OPERATOR"
    public final void mASSIGNMENT_OPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:127:2: ( '=' )
            // /Users/andrewrumble/Fphp.g:127:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNMENT_OPERATOR"

    // $ANTLR start "SCOPE"
    public final void mSCOPE() throws RecognitionException {
        try {
            int _type = SCOPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:130:7: ( '->' )
            // /Users/andrewrumble/Fphp.g:130:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCOPE"

    // $ANTLR start "L_BRACKET"
    public final void mL_BRACKET() throws RecognitionException {
        try {
            int _type = L_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:133:2: ( '(' )
            // /Users/andrewrumble/Fphp.g:133:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L_BRACKET"

    // $ANTLR start "R_BRACKET"
    public final void mR_BRACKET() throws RecognitionException {
        try {
            int _type = R_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:136:2: ( ')' )
            // /Users/andrewrumble/Fphp.g:136:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R_BRACKET"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:138:7: ( ',' )
            // /Users/andrewrumble/Fphp.g:138:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:140:7: ( ':' )
            // /Users/andrewrumble/Fphp.g:140:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/andrewrumble/Fphp.g:143:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='/') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='*') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/andrewrumble/Fphp.g:143:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/andrewrumble/Fphp.g:143:14: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:143:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // /Users/andrewrumble/Fphp.g:143:28: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/andrewrumble/Fphp.g:143:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/andrewrumble/Fphp.g:144:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/andrewrumble/Fphp.g:144:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/andrewrumble/Fphp.g:144:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/andrewrumble/Fphp.g:1:8: ( T__47 | T__48 | IF | ELSE | ELIF | RETURN | EQ | GT | LT | PRINT | CLASS | EXTENDS | EACH | WHILE | FOR | NEW | L_PAREN | R_PAREN | OBJECT_MEMBER | QUOTE | VISIBILITY | STATIC | BOOLEAN | IDENTIFIER | VARIABLE | WS | INT | NEWLINE | PLUS | MINUS | MULTIPLY | DIVIDE | ASSIGNMENT_OPERATOR | SCOPE | L_BRACKET | R_BRACKET | COMMA | COLON | COMMENT )
        int alt15=39;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /Users/andrewrumble/Fphp.g:1:10: T__47
                {
                mT__47(); 

                }
                break;
            case 2 :
                // /Users/andrewrumble/Fphp.g:1:16: T__48
                {
                mT__48(); 

                }
                break;
            case 3 :
                // /Users/andrewrumble/Fphp.g:1:22: IF
                {
                mIF(); 

                }
                break;
            case 4 :
                // /Users/andrewrumble/Fphp.g:1:25: ELSE
                {
                mELSE(); 

                }
                break;
            case 5 :
                // /Users/andrewrumble/Fphp.g:1:30: ELIF
                {
                mELIF(); 

                }
                break;
            case 6 :
                // /Users/andrewrumble/Fphp.g:1:35: RETURN
                {
                mRETURN(); 

                }
                break;
            case 7 :
                // /Users/andrewrumble/Fphp.g:1:42: EQ
                {
                mEQ(); 

                }
                break;
            case 8 :
                // /Users/andrewrumble/Fphp.g:1:45: GT
                {
                mGT(); 

                }
                break;
            case 9 :
                // /Users/andrewrumble/Fphp.g:1:48: LT
                {
                mLT(); 

                }
                break;
            case 10 :
                // /Users/andrewrumble/Fphp.g:1:51: PRINT
                {
                mPRINT(); 

                }
                break;
            case 11 :
                // /Users/andrewrumble/Fphp.g:1:57: CLASS
                {
                mCLASS(); 

                }
                break;
            case 12 :
                // /Users/andrewrumble/Fphp.g:1:63: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 13 :
                // /Users/andrewrumble/Fphp.g:1:71: EACH
                {
                mEACH(); 

                }
                break;
            case 14 :
                // /Users/andrewrumble/Fphp.g:1:76: WHILE
                {
                mWHILE(); 

                }
                break;
            case 15 :
                // /Users/andrewrumble/Fphp.g:1:82: FOR
                {
                mFOR(); 

                }
                break;
            case 16 :
                // /Users/andrewrumble/Fphp.g:1:86: NEW
                {
                mNEW(); 

                }
                break;
            case 17 :
                // /Users/andrewrumble/Fphp.g:1:90: L_PAREN
                {
                mL_PAREN(); 

                }
                break;
            case 18 :
                // /Users/andrewrumble/Fphp.g:1:98: R_PAREN
                {
                mR_PAREN(); 

                }
                break;
            case 19 :
                // /Users/andrewrumble/Fphp.g:1:106: OBJECT_MEMBER
                {
                mOBJECT_MEMBER(); 

                }
                break;
            case 20 :
                // /Users/andrewrumble/Fphp.g:1:120: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 21 :
                // /Users/andrewrumble/Fphp.g:1:126: VISIBILITY
                {
                mVISIBILITY(); 

                }
                break;
            case 22 :
                // /Users/andrewrumble/Fphp.g:1:137: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 23 :
                // /Users/andrewrumble/Fphp.g:1:144: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 24 :
                // /Users/andrewrumble/Fphp.g:1:152: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 25 :
                // /Users/andrewrumble/Fphp.g:1:163: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 26 :
                // /Users/andrewrumble/Fphp.g:1:172: WS
                {
                mWS(); 

                }
                break;
            case 27 :
                // /Users/andrewrumble/Fphp.g:1:175: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // /Users/andrewrumble/Fphp.g:1:179: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 29 :
                // /Users/andrewrumble/Fphp.g:1:187: PLUS
                {
                mPLUS(); 

                }
                break;
            case 30 :
                // /Users/andrewrumble/Fphp.g:1:192: MINUS
                {
                mMINUS(); 

                }
                break;
            case 31 :
                // /Users/andrewrumble/Fphp.g:1:198: MULTIPLY
                {
                mMULTIPLY(); 

                }
                break;
            case 32 :
                // /Users/andrewrumble/Fphp.g:1:207: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 33 :
                // /Users/andrewrumble/Fphp.g:1:214: ASSIGNMENT_OPERATOR
                {
                mASSIGNMENT_OPERATOR(); 

                }
                break;
            case 34 :
                // /Users/andrewrumble/Fphp.g:1:234: SCOPE
                {
                mSCOPE(); 

                }
                break;
            case 35 :
                // /Users/andrewrumble/Fphp.g:1:240: L_BRACKET
                {
                mL_BRACKET(); 

                }
                break;
            case 36 :
                // /Users/andrewrumble/Fphp.g:1:250: R_BRACKET
                {
                mR_BRACKET(); 

                }
                break;
            case 37 :
                // /Users/andrewrumble/Fphp.g:1:260: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 38 :
                // /Users/andrewrumble/Fphp.g:1:266: COLON
                {
                mCOLON(); 

                }
                break;
            case 39 :
                // /Users/andrewrumble/Fphp.g:1:272: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\3\uffff\3\23\2\uffff\5\23\4\uffff\2\23\6\uffff\1\61\1\uffff\1\63"+
        "\5\uffff\1\64\1\23\1\67\14\23\5\uffff\2\23\1\uffff\10\23\1\120\1"+
        "\23\1\122\2\23\1\125\1\126\1\23\1\130\7\23\1\uffff\1\23\1\uffff"+
        "\1\23\1\142\2\uffff\1\23\1\uffff\1\23\1\145\3\23\1\151\1\152\1\142"+
        "\1\23\1\uffff\1\23\1\155\1\uffff\2\23\1\160\2\uffff\1\161\1\162"+
        "\1\uffff\1\160\1\23\3\uffff\1\23\1\160";
    static final String DFA15_eofS =
        "\165\uffff";
    static final String DFA15_minS =
        "\1\11\2\uffff\1\146\1\141\1\145\2\uffff\1\162\1\154\1\150\1\141"+
        "\1\145\4\uffff\1\164\1\162\6\uffff\1\76\1\uffff\1\52\5\uffff\1\60"+
        "\1\151\1\60\1\164\1\143\1\164\1\151\1\142\1\141\1\151\1\162\1\154"+
        "\1\167\1\141\1\165\5\uffff\1\145\1\146\1\uffff\1\145\1\150\1\165"+
        "\1\156\1\164\1\154\1\163\1\154\1\60\1\163\1\60\1\164\1\145\2\60"+
        "\1\156\1\60\1\162\1\164\1\141\1\145\1\151\1\163\1\145\1\uffff\1"+
        "\145\1\uffff\1\151\1\60\2\uffff\1\144\1\uffff\1\156\1\60\1\164\2"+
        "\143\3\60\1\143\1\uffff\1\163\1\60\1\uffff\1\145\1\164\1\60\2\uffff"+
        "\2\60\1\uffff\1\60\1\145\3\uffff\1\144\1\60";
    static final String DFA15_maxS =
        "\1\175\2\uffff\1\146\1\170\1\145\2\uffff\1\165\1\154\1\150\1\157"+
        "\1\145\4\uffff\1\164\1\162\6\uffff\1\76\1\uffff\1\57\5\uffff\1\172"+
        "\1\163\1\172\1\164\1\143\1\164\1\157\1\142\1\141\1\151\1\162\1\154"+
        "\1\167\1\141\1\165\5\uffff\1\145\1\146\1\uffff\1\145\1\150\1\165"+
        "\1\166\1\164\1\154\1\163\1\154\1\172\1\163\1\172\1\164\1\145\2\172"+
        "\1\156\1\172\1\162\1\164\1\141\1\145\1\151\1\163\1\145\1\uffff\1"+
        "\145\1\uffff\1\151\1\172\2\uffff\1\144\1\uffff\1\156\1\172\1\164"+
        "\2\143\3\172\1\143\1\uffff\1\163\1\172\1\uffff\1\145\1\164\1\172"+
        "\2\uffff\2\172\1\uffff\1\172\1\145\3\uffff\1\144\1\172";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\10\1\11\5\uffff\1\21\1\22\1\23\1\24\2"+
        "\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\37\1\uffff\1\41\1"+
        "\43\1\44\1\45\1\46\17\uffff\1\42\1\36\1\47\1\40\1\3\2\uffff\1\7"+
        "\30\uffff\1\17\1\uffff\1\20\2\uffff\1\4\1\5\1\uffff\1\15\11\uffff"+
        "\1\27\2\uffff\1\12\3\uffff\1\13\1\16\2\uffff\1\6\2\uffff\1\25\1"+
        "\26\1\14\2\uffff";
    static final String DFA15_specialS =
        "\165\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\25\1\27\25\uffff\1\25\1\uffff\1\20\1\uffff\1\24\2\uffff\1"+
            "\2\1\35\1\36\1\32\1\30\1\37\1\31\1\17\1\33\12\26\1\40\1\uffff"+
            "\1\7\1\34\1\6\2\uffff\32\23\1\uffff\1\1\2\uffff\1\23\1\uffff"+
            "\2\23\1\11\1\23\1\4\1\13\2\23\1\3\4\23\1\14\1\23\1\10\1\23\1"+
            "\5\1\21\1\22\2\23\1\12\3\23\1\15\1\uffff\1\16",
            "",
            "",
            "\1\41",
            "\1\45\12\uffff\1\42\4\uffff\1\43\6\uffff\1\44",
            "\1\46",
            "",
            "",
            "\1\47\2\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\54\15\uffff\1\53",
            "\1\55",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "",
            "\1\62\4\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\66\11\uffff\1\65",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\5\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\7\uffff\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\121",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\123",
            "\1\124",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\127",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "",
            "\1\141",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\153",
            "",
            "\1\154",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\156",
            "\1\157",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\163",
            "",
            "",
            "",
            "\1\164",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | IF | ELSE | ELIF | RETURN | EQ | GT | LT | PRINT | CLASS | EXTENDS | EACH | WHILE | FOR | NEW | L_PAREN | R_PAREN | OBJECT_MEMBER | QUOTE | VISIBILITY | STATIC | BOOLEAN | IDENTIFIER | VARIABLE | WS | INT | NEWLINE | PLUS | MINUS | MULTIPLY | DIVIDE | ASSIGNMENT_OPERATOR | SCOPE | L_BRACKET | R_BRACKET | COMMA | COLON | COMMENT );";
        }
    }
 

}