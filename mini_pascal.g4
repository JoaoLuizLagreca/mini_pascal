grammar mini_pascal;

options {
	caseInsensitive = true;
}

//TODO: Regras Sintáticas


PROGRAM: 'program' ;
BEGIN: 'begin' ;
END: 'end' ;
IF: 'if' ;
THEN: 'then' ;
TRUE: 'true' ;
FALSE: 'false' ;
ELSE: 'else' ;
WHILE: 'while' ;
DO: 'do' ;
DIV: 'div' ;
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
VAR: 'var' ;

fragment Letra:
	'_'
	| [a-z] ;

fragment Digito:
	[0-9] ;

fragment Operador:
	'*' | '+' | '-' | '/';

WS:
	[ \t\r\n] -> skip;

Numero: Digito (Digito | '.')*;

Identificador: Letra (Letra | Digito)*;

Frase: '\'' ~[<']* '\'';

Comentario: '//' ~('\r' | '\n')*; //TODO: Comentário multi-linha

fragment Simbolos: '(' | ')' | '[' | ']';

fragment Pontuacao: ';' | '.';
