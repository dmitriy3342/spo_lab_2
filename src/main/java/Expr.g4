grammar Expr;


//Parser Rules
start :	expr ';' ;

expr:
    	left=expr op=('*'|'/') right=expr
    |	left=expr op=('+'|'-') right=expr
    |   '(' expr ')'
    |	atom=NUMBER
    ;



//Lexer Rules
NEWLINE : [\r\n]+ ;

//PLUS  : '+';
//MINUS : '-';
//DEL   : '/';
//MUL   : '*';

NUMBER
	:  INT'.'INT EXP? //1.35,1.35E-9,0.3,-4.5
	|  INT EXP //1e10-3e4
	|  INT //-3,45
	;



fragment EXP: [Ee][+\-]? INT;//\-since-means"range"inside[...]

fragment INT: [0-9]+;

WS : [\t\n\r]+->skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;