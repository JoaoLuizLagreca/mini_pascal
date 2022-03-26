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
    : BEGIN comand '{;' comand '}' END
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
    : IF expressao THEN comand ((ELSE comando) | empty)
    ;

comandoRepetitivo
    : WHILE expressao DO comando
    ;

//Expressões
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
    : ('+' | '-') termo (('+' | '-' | OR) termo)*
    ;

termo
    : fator (('*' | DIV | AND) fator)*
    ;

fator
    : variavel
    | numero
    | '(' expressao ')'
    | NOT fator
    ;

variavel
    : identificador
    | identificador (expressao | empty)
    ;

listaExpressoes
    : expressao (',' empressao)*
    ;

//Números e identificadores
numero
    : digito (digito)*
    ;

digito
    : [0-9]
    ;

identificador
    : letra (letra | digito)*
    ;

letra
    : '_'
    | [a-z]
    | [A-Z]
    ;



empty:
    ;

/*TODO: Casos insensíveis
 OR
 DIV
 AND
 NOT
 BEGIN
 END
 IF
 THEN
 ELSE
 WHILE
 DO
 PROCEDURE
 VAR
 PROGRAM
 */
