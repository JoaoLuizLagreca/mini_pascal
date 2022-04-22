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
    : [aA]
    ;

fragment B
    : [bB]
    ;

fragment C
    : [cC]
    ;

fragment D
    : [dD]
    ;

fragment E
    : [eE]
    ;

fragment F
    : [fF]
    ;

fragment G
    : [gG]
    ;

fragment H
    : [hH]
    ;

fragment I
    : [iI]
    ;

fragment J
    : [jJ]
    ;

fragment K
    : [kK]
    ;

fragment L
    : [lL]
    ;

fragment M
    : [mM]
    ;

fragment N
    : [nN]
    ;

fragment O
    : [oO]
    ;

fragment P
    : [pP]
    ;

fragment Q
    : [qQ]
    ;

fragment R
    : [rR]
    ;

fragment S
    : [sS]
    ;

fragment T
    : [tT]
    ;

fragment U
    : [uU]
    ;

fragment V
    : [vV]
    ;

fragment W
    : [wW]
    ;

fragment X
    : [xX]
    ;

fragment Y
    : [yY]
    ;

fragment Z
    : [zZ]
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
