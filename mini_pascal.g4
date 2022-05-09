grammar mini_pascal;

options {
	caseInsensitive = true;
}

//Regras sintáticas
programa: PROGRAM identificador ';' bloco '.' ;
bloco: parDeclVar? parDeclSubRot comComp ;

parDeclVar: declVar (';' declVar)* ';' ;
parDeclSubRot: (declProc ';')* ;
declVar: tipo listaIdent ;

comando: atribuicao | chamProc | comComp | comCond | comRep ;
chamProc: identificador ('(' listaExpress ')' )? ;
comComp: BEGIN comando (';' comando)* END ;
comCond: IF expressao THEN comando (ELSE comando)? ;
comRep: WHILE expressao DO comando ;


identificador: Identificador ;
tipo: INT | BOOLEAN ;
listaIdent: identificador (',' identificador)* ;
listaExpress: expressao (',' expressao)* ;
declProc: PROCEDURE identificador paramForm? ';' bloco ;
paramForm: '(' secParamForm (';' secParamForm)* ')' ;
secParamForm: VAR listaIdent ':' identificador ;
atribuicao: variavel ':=' expressao ;
variavel: identificador
	| identificador expressao? ;
expressao: expressaoSimp (relacao expressaoSimp)? ;
expressaoSimp:
	('+' | '-')? termo (('+' | '-' | OR) termo )* ;
termo: fator (('*' | DIV | AND) fator )* ;
fator:
	variavel
	| Frase
	| numero
	| '(' expressao ')'
	| truefalse
	| NOT fator ;

numero: Numero ;
relacao:
	'='
	| '<>'
	| '<'
	| '<='
	| '>='
	| '>' ;
truefalse: TRUE | FALSE ;

//Gramáticas

PROGRAM: 'program' ;
PROCEDURE: 'procedure' ;
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
INT: 'int' ;
BOOLEAN: 'boolean';

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
