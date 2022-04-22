grammar MiniPascal;

//Programa e Bloco
programa
    : PROGRAM identificador ';'
    bloco '.'
    ;

bloco
    : (partDeclVar | empty)
    (partDeclSubRot | empty)
    comandoComposto
    ;

//Declarações
partDeclVar
    : declVar (';' tipo listaIdentificadores)* ';'
    ;

declVar
    : tipo listaIdentificadores
    ;

listaIdentificadores
    : identificador (',' identificador)*
    ;

partDeclSubRot
    : (declProc ';')*
    ;

declProc
    : PROCEDURE identificador (parFormais | empty) ';' bloco
    ;

parFormais
    : '(' secParFormais (';' secParFormais)* ')'
    ;

secParFormais
    : '[' VAR ']' listaIdentificadores ':' identificador
    ;

//Comandos
comandoComposto
    : BEGIN comando (';' comando )* END
    ;

comando
    : atribuicao
    | chamadaProcedimento
    | comandoComposto
    | comandoCondicional
    | comandoRepetitivo
    ;

atribuicao
    : variavel ':=' expressao
    ;

chamadaProcedimento
    : identificador ('(' listaExpressoes ')' | empty)
    ;

comandoCondicional
    : IF expressao THEN comando ((ELSE comando) | empty)
    ;

comandoRepetitivo
    : WHILE expressao DO comando
    ;

//Expressões

tipo
    : Letra (Letra)*
    ;

expressao
    : expressaoSimples ((relacao expressaoSimples) | empty)
    ;

relacao
    : '='
    | '<>'
    | '<'
    | '<='
    | '>='
    | '>'
    ;

expressaoSimples
    : ('+' | '-' | empty) termo (('+' | '-' | OR) termo)*
    ;

termo
    : fator (('*' | DIV | AND) fator)*
    ;

fator
    : variavel
    | numero
    | '(' expressao ')'
    | Frase
    | NOT fator
    ;

variavel
    : identificador
    | identificador (expressao | empty)
    ;

listaExpressoes
    : expressao (',' expressao)*
    ;

//Números e identificadores
numero
    : Digito (Digito)*
    ;

Digito
    : [0-9]
    ;

identificador
    : Letra (Letra | Digito)*
    ;

Letra
    : '_'
    | [a-z]
    | [A-Z]
    ;

Frase
    : '"' ~[<"]* '"'
    |'\'' ~[<']* '\''
    ;


empty:
    ;

WS
   : [ \t\r\n] -> skip
   ;


// Casos insensíveis
   //Fragmentos
fragment A
    : 'a'
    | 'A'
    ;

fragment B
    : 'b'
    | 'B'
    ;

fragment C
    : 'c'
    | 'C'
    ;

fragment D
    : 'd'
    | 'D'
    ;

fragment E
    : 'e'
    | 'E'
    ;

fragment F
    : 'f'
    | 'F'
    ;

fragment G
    : 'g'
    | 'G'
    ;

fragment H
    : 'h'
    | 'H'
    ;

fragment I
    : 'i'
    | 'I'
    ;

fragment J
    : 'j'
    | 'J'
    ;

fragment K
    : 'k'
    | 'K'
    ;

fragment L
    : 'l'
    | 'L'
    ;

fragment M
    : 'm'
    | 'M'
    ;

fragment N
    : 'n'
    | 'N'
    ;

fragment O
    : 'o'
    | 'O'
    ;

fragment P
    : 'p'
    | 'P'
    ;

fragment Q
    : 'q'
    | 'Q'
    ;

fragment R
    : 'r'
    | 'R'
    ;

fragment S
    : 's'
    | 'S'
    ;

fragment T
    : 't'
    | 'T'
    ;

fragment U
    : 'u'
    | 'U'
    ;

fragment V
    : 'v'
    | 'V'
    ;

fragment W
    : 'w'
    | 'W'
    ;

fragment X
    : 'x'
    | 'X'
    ;

fragment Y
    : 'y'
    | 'Y'
    ;

fragment Z
    : 'z'
    | 'Z'
    ;

    //Terminais
OR: WS O R;
DIV: WS D I V;
AND: WS A N D;
NOT: WS N O T;
BEGIN: WS B E G I N;
END: WS E N D;
IF: WS I F;
THEN: WS T H E N;
ELSE: WS E L S E;
WHILE: WS W H I L E;
DO: WS D O;
PROCEDURE: WS P R O C E D U R E;
VAR: WS V A R;
PROGRAM: P R O G R A M WS;
