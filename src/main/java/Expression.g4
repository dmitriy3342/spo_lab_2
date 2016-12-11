grammar Expression;


//Parser Rules
start: exprBlock ;

exprBlock:
     exprLine
     | exprLine (NEWLINE exprLine)+
     ;

exprLine:
        expr ';'
    ;

expr:
    |   SEP expr SEP
    |   SEP expr
    |       expr SEP
    |   expr (NEWLINE expr)+
	|   left = expr op = ('*'|'/') right = expr
    |	left = expr op = ('+'|'-') right = expr
    |   left = expr  op = '^' right = expr

    |   LPAM exprCenter = expr RPAM

    |   print
    |   elementAssignment
    |   elementValue

    |   date
    |   accord

    |	atom
    |
    ;

print:
        'print(' expr ')';




elementAssignment : //Create element
        SEP IDENTIFIER SEP  '=' expr
    |       IDENTIFIER SEP  '=' expr
    |       IDENTIFIER      '=' expr
        ;

elementValue : // Get element
        SEP IDENTIFIER
    |       IDENTIFIER SEP
    |       IDENTIFIER
    ;




date :
        'date(' SEP* d = DATE SEP* ')';

accord :

        'accord(' SEP* ac = ACCORD SEP* ')'

        ;



atom :
        NUMBER
    |   STRING

    ;

//Lexer Rules


DATE : [0-3]?[0-9]'.'[0-1]?[0-9] ;

ACCORD : [A-H]('b'|'#')?;

IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]*;

STRING : '"'.*?'"';



PLUS  : '+';
MINUS : '-';
DEL   : '/';
MUL   : '*';

LPAM : '(';
RPAM : ')';

NUMBER :
    INT'.'INT EXP? //1.35,1.35E-9,0.3,-4.5
	|  INT EXP //1e10-3e4
	|  INT //-3,45
	;


fragment EXP: [Ee][+\-]? INT;//\-since-means"range"inside[...]

fragment INT: [0-9]+;


SEP : [ \t]+? ;

NEWLINE : [\r\n]+ ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;