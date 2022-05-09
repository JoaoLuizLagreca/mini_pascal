grammar mini_pascal;

Letra:
	'_'
	| 'a' | 'A'
	| 'b' | 'B'
	| 'c' | 'C'
	| 'd' | 'D'
	| 'e' | 'E'
	| 'f' | 'F'
	| 'g' | 'G'
	| 'h' | 'H'
	| 'i' | 'I'
	| 'j' | 'J'
	| 'k' | 'K'
	| 'l' | 'L'
	| 'm' | 'M'
	| 'n' | 'N'
	| 'o' | 'O'
	| 'p' | 'P'
	| 'q' | 'Q'
	| 'r' | 'R'
	| 's' | 'S'
	| 't' | 'T'
	| 'u' | 'U'
	| 'v' | 'V'
	| 'w' | 'W'
	| 'x' | 'X'
	| 'y' | 'Y'
	| 'z' | 'Z';

Digito:
	[0-9] ;

Operador:
	'*' | '+' | '-' | '/';

WS:
	[ \t\r\n] -> skip;

numero: Digito (Digito | '.')*;

identificador: Letra (Letra | Digito)*;

frase: '\'' ~[<']* '\'';

comentario: '//' ~('\r' | '\n')*;

simbolos: '(' | ')' | '[' | ']';

pontuacao: ';' | '.';

PROGRAM: [Pp] [Rr] [Oo] [Gg] [Rr] [Aa] [Mm] ;

BEGIN: [Bb] [Ee] [Gg] [Ii] [Nn] ;

END: [Ee] [Nn] [Dd] ;

IF: [Ii] [Ff] ;

THEN: [Tt] [Hh] [Ee] [Nn] ;

TRUE: [Tt] [Rr] [Uu] [Ee] ;

FALSE: [Ff] [Aa] [Ll] [Ss] [Ee] ;

ELSE: [Ee] [Ll] [Ss] [Ee] ;

WHILE: [Ww] [Hh] [Ii] [Ll] [Ee] ;

DO: [Dd] [Oo] ;

DIV: [Dd] [Ii] [Vv] ; 

AND: [Aa] [Nn] [Dd] ;

OR: [Oo] [Rr] ;

NOT: [Nn] [Oo] [Tt] ;

VAR: [Vv] [Aa] [Rr] ;
