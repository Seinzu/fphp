grammar Fphp;

options {
	backtrack=true;
}

tokens{
	INDENT; 
	DEDENT;
}



@members{
int level = 0;
}

// keywords

IF	:	'if'; 	

ELSE	:	'else';

ELIF	:	'elif';
	
RETURN	:	'return';

EQ	:	'eq';

GT	:	'>';

LT	:	'<';

PRINT	:	'print';

CLASS	:	'class';

EXTENDS	:	'extends';

EACH	:	'each';

WHILE	:	'while';

FOR	:	'for';

NEW	:	'new';

L_PAREN	:	'{';

R_PAREN	:	'}';

OBJECT_MEMBER
	:	'.'
	;
	
QUOTE 	:	'"';

VISIBILITY
	:	'public'
	|	'private'
	|	'protected'
	;
	
STATIC	:	'static';

BOOLEAN	:	'true'
	|	'false'
	;		
	
string returns [String value]
  	: QUOTE {$value = "\"";} ( e1=ESC_SEQ {$value += $e1.text + " ";}| e1=~( '\\' | '\n' | QUOTE  ){$value += $e1.text + " ";})*  QUOTE {$value += "\"";} 
    	| '\'' {$value = "\"";} e1=( ESC_SEQ | ~( '\\' | '\n' | '\'' ) )* {$value += $e1.text;}'\'' {$value += "\"";} 
  	;	
	
IDENTIFIER  
	:	 ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 
    	;
    	
VARIABLE
	:	'$'('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;
	
WS	:	(' ')+{$channel=HIDDEN;}
	|	'\t'+
	;

INT 	:	'0'..'9'+
    	;

NEWLINE	:	'\n';



fragment
ESC_SEQ
    	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	|   UNICODE_ESC
    	|   OCTAL_ESC
    	;
    
fragment
OCTAL_ESC
    	:   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7')
    	;

fragment
UNICODE_ESC
    	:   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    	;
    
fragment
HEX_DIGIT 
	: ('0'..'9'|'a'..'f'|'A'..'F')
	;

PLUS	:	'+';

MINUS	:	'-';

MULTIPLY:	'*';

DIVIDE	:	'/';

ASSIGNMENT_OPERATOR
	:	'='
	;

SCOPE	:	'->';

L_BRACKET
	:	'(';
	
R_BRACKET
	:	')';
	
COMMA	:	',';

COLON	:	':';

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;


program returns [String value]
	:	e=statement {$value = "<?php\n " +$e.value;} (e=statement {$value += $e.value;})* EOF;

statement returns [String value]
	:	expression {$value = $expression.value + ";";} 
	|	assignment {$value = $assignment.value + ";";}
	|	function {$value = $function.value;}
	|	RETURN expression {$value = $RETURN.text +" "+ $expression.value + ";";}
	|	{$value = "";}(e1=conditional {$value += $e1.value;})+
	|	NEWLINE {$value = "\n";}
	|	PRINT expression {$value = "print " + $expression.value + ";";}
	|	each {$value = $each.value;}
	|	class_block {$value = $class_block.value;}
	;
	
assignment returns [String value]
	:	VARIABLE ASSIGNMENT_OPERATOR expression {$value = $VARIABLE.text + $ASSIGNMENT_OPERATOR.text + $expression.value;}
	|	array_entry ASSIGNMENT_OPERATOR expression {$value = $array_entry.value + $ASSIGNMENT_OPERATOR.text + $expression.value;}
	|	class_member ASSIGNMENT_OPERATOR expression {$value = $class_member.value + $ASSIGNMENT_OPERATOR.text + $expression.value;}
	;
	
atom returns [String value]
	:	INT {$value = $INT.text;}
	|	VARIABLE {$value = $VARIABLE.text;}
	|	VARIABLE '.' IDENTIFIER {$value = $VARIABLE.text + "->" + $IDENTIFIER.text;}
	|	BOOLEAN {$value = $BOOLEAN.text;}
	|	function_call {$value = $function_call.value;}
	|	NEW e1=instance_call {$value = "new " + $e1.value;}
	|	class_member {$value = $class_member.value;}
	|	new_array {$value = $new_array.value;}
	|	array_entry {$value = $array_entry.value;}
	|	string {$value = $string.value;}
	;
	
hash_key returns [String value]
	:	INT {$value = $INT.text;}
	|	VARIABLE {$value = $VARIABLE.text;}
	|	string {$value = $string.value;}
	;	
	
array_entry returns [String value]
	:	e0=VARIABLE L_PAREN COLON e1=hash_key R_PAREN {$value = $e0.text + "[" + $e1.text + "]";}
	;

new_array returns [String value]
	:	L_PAREN {$value = "new array(";} ( (e0=(IDENTIFIER|VARIABLE) COLON {$value += $e0.text + "=>";})? e3=atom {$value += $e3.value;})? (COMMA {$value += ",";} (e1=(IDENTIFIER|VARIABLE) COLON {$value += $e1.text + "=>";})? e2=atom{$value += $e2.value;})* {$value += ")";} R_PAREN
	;
	
instance_call returns [String value]
	:	IDENTIFIER {$value = $IDENTIFIER.text;} (L_BRACKET {$value+="(";}(arguments {$value += $arguments.value;})? R_BRACKET {$value += ")";})?
	;

expression returns [String value]
	:	e1=atom {$value = $e1.value;} (operator e2=atom {$value += $operator.value + $e2.value;})* 
	;
	
operator returns [String value]
	:	PLUS {$value = $PLUS.text;}
	|	MINUS {$value = $MINUS.text;}
	|	MULTIPLY {$value = $MULTIPLY.text;}
	|	DIVIDE {$value = $DIVIDE.text;}
	;

function returns [String value]
	:	function_definition NEWLINE block {$value = $function_definition.value + "{\n" + $block.value + "\t}\n";};
	
block	returns [String value]
	@init{
		level++;
		$value = "";	
	      }
	@after{
		level--;
		}
	:	 INDENT (e=statement 
							{
for (int i =0 ; i < level; i ++){
	$value += "\t";
}
$value += $e.value;
				   			})+ DEDENT
	;
	
function_definition returns [String value]
	:	{$value ="";}(VISIBILITY {$value += $VISIBILITY.text + " ";})? IDENTIFIER SCOPE L_BRACKET {$value += "function " + $IDENTIFIER.text + "(";} (e1=arguments{$value += $e1.value;})? R_BRACKET {$value +=  ")";}
	;
	
function_call returns [String value]
	:	IDENTIFIER {$value = $IDENTIFIER.text + "(";} L_BRACKET (e1=arguments{$value += $e1.value;})? R_BRACKET {$value += ")";}
	|	VARIABLE '.' IDENTIFIER L_BRACKET {$value = $VARIABLE.text + "->" + $IDENTIFIER.text + "(";}(e1=arguments{$value += $e1.value;})? R_BRACKET  {$value += ")";}
	;
	
conditional returns [String value]
	@init{
		String indents;
		indents = "";
		for (int i = 0; i < level; i++){
			indents += "\t";
		}
	}
	:	e1=if_statement NEWLINE e0=block{$value = $e1.value + "{\n" + $e0.value + indents + "}\n";} 
	|	e1=elif_statement NEWLINE e2=block {$value = $e1.value + "{\n" + $e2.value + indents + "}\n";} 
	|	else_statement NEWLINE e3=block {$value = $else_statement.value + "{\n" + $e3.value + indents + "}\n";}   	
	;
	
if_statement returns [String value]
	:	IF comparison COLON {$value  = "if ("+$comparison.value+")";}
	;
	
elif_statement returns [String value]
	:	ELIF comparison COLON {$value = "else if (" + $comparison.value + ")";};
	
else_statement returns [String value]
	:	ELSE COLON {$value = "else";};
	
comparison returns [String value]
	:	e1=expression comparator e2=expression {$value = $e1.value + " " + $comparator.value + " " + $e2.value;}
	;
	
comparator returns [String value]
	:	GT {$value = ">";}
	|	LT {$value = "<";}
	|	EQ {$value = "==";}
	;
	
arguments returns [String value]
	:	e=argument {$value = $e.value;} (',' e=argument {$value += "," + $e.value;})*
	;

argument returns [String value]
	:	atom {$value = $atom.value;};
	
	
each returns [String value]
	:	VARIABLE OBJECT_MEMBER EACH NEWLINE block {$value = "if (!empty("+$VARIABLE.text+"))\n\tforeach (" + $VARIABLE.text + " as \$key=>\$value){\n\t"+$block.value + "\t}\n";}
	;
	
class_block returns [String value]
	:	class_definition NEWLINE block {$value = $class_definition.value + "{\n" + $block.value + "}";}
	;		
	
class_definition returns [String value]
	:	CLASS IDENTIFIER {$value = "class " + $IDENTIFIER.text; }
	|	CLASS e1=IDENTIFIER EXTENDS e2=IDENTIFIER {$value = "class " + $e1.text + " extends "+ $e2.text;}
	;

class_member returns [String value]
	:	VARIABLE '.' IDENTIFIER {$value = $VARIABLE.text + "->" + $IDENTIFIER.text;}
	;