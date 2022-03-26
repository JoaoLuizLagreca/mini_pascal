grammar MiniPascal;



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
