grammar MiniPascal;

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
 */
