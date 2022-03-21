//Criado baseado na documentação: http://www.facom.ufms.br/~ricardo/Courses/CompilerI/Lectures/minipascalsyntax.pdf
//FIXME: NÃO TESTADO
//TODO: Realizar analisadores léxicos para declarações não caso-sensíveis

grammar MiniPascal;

cabecalho
    : 'program' IDENTIFICADOR ';' bloco
    ;

bloco
    : declaracaoVariavel declaracaoComposta
    ;

declaracaoVariavel
    : empty
    | VAR valorVariavel ';' (valorVariavel ';')* //TODO: "var" não é caso-sensível
    ;

valorVariavel
    : IDENTIFICADOR (',' IDENTIFICADOR)* ':' tipo
    ;

tipo
    : tipoSimples
    | tipoVetor
    ;

tipoVetor
    : ARRAY '[' tamanhoIndice ']' OF tipoSimples //TODO: "array" e "of" não são caso-sensíveis
    ;

tamanhoIndice
    : CONSTANTEINTEIRA '..' CONSTANTEINTEIRA
    ;

tipoSimples
    : char
    | integer
    | boolean
    //TODO: Não são caso-sensíveis
    ;

declaracaoComposta
    : BEGIN declaracao (';' declaracao)* END //TODO: "begin" e "end" não são caso-sensíves
    ;

declaracao
    : declaracaoSimples
    | declaracaoEstrutural
    ;


declaracaoSimples
    : declaracaoAtributo
    | declaracaoRead
    | declaracaoWrite
    ;

declaracaoAtributo
    : variavel ':=' expressao
    ;

declaracaoRead
    : READ '(' variavel (',' variavel)* ')' //TODO: "read" não é caso-sensível
    ;

declaracaoWrite
    : WRITE '(' variavel (',' variavel)* ')' //TODO: "write" não é caso-sensível
    ;

declaracaoEstrutural
    : declaracaoComposta
    | declaracaoIf
    | declaracaoWhile
    ;

declaracaoIf //TODO: "if", "then" e "else" não são caso-sensíveis
    : IF expressao THEN declaracao
    | IF expressao THEN declaracao ELSE declaracao
    ;

declaracaoWhile
    : WHILE expressao DO declaracao //TODO: "while" e "do" não são caso-sensíveis


expressao
    : expressaoSimples
    | expressaoSimples operadorRelacional expressaoSimples
    ;

expressaoSimples
    : sinal termo (operadorAditivo termo)*
    ;

termo
    : fator (operadorMultiplicativo fator)*
    ;

fator
    : variavel
    | declaracaoComposta
    | '(' expressao ')'
    | NOT fator //TODO: "not" não é caso-sensível
    ;



operadorRelacional
    : '='
    | '<>'
    | '<'
    | '<='
    | '>='
    | '>'
    | OR
    | AND //TODO: "or" e "and" não são caso-sensíveis
    ;

sinal
    : '+'
    | '-'
    | empty
    ;

operadorAditivo
    : '+'
    | '-'
    ;

operadorMultiplicativo
    : '*'
    | DIV //TODO: div não é caso-sensível
    ;


variavel
    : IDENTIFICADOR
    | variavelAnexada
    ;

variavelAnexada
    : IDENTIFICADOR '[' expressao ']'
    ;



CONSTANTE
    : CONSTANTEINTEIRA
    | CONSTANTECARACTERE
    | IDENTIFICADOR
    ;

IDENTIFICADOR
    : LETRA (LETRAOUDIGITO)*
    ;

LETRAOUDIGITO
    : LETRA
    | DIGITO
    ;

CONSTANTEINTEIRA
    : DIGITO (DIGITO)*
    ;

CONSTANTECARACTERE
    : '\'' LETRAOUDIGITO '\''
    | '\"' LETRAOUDIGITO (LETRAOUDIGITO)* '\"'

LETRA
    : [a-z]
    | [A-Z]
    ;

DIGITO
    : [0-9]
    ;

SIMBOLOESPECIAL
    : '+'
    | '-'
    | '*'
    | '='
    | '<>'
    | '<'
    | '>'
    | '<='
    | '>='
    | '>'
    | ('|')* '|' ('|')* //FIXME: Correto?
    | ':='
    | '.'
    | ','
    | ';'
    | ':'
    | '..'
    //TODO: À partir daqui, não são caso-sensíveis
    | DIV
    | OR
    | AND
    | NOT
    | IF
    | THEN
    | ELSE
    | OF
    | WHILE
    | DO
    | BEGIN
    | END
    | READ
    | WRITE
    | VAR
    | ARRAY
    | FUNCTION
    | PROCEDURE
    | PROGRAM
    | TRUE
    | FALSE
    | CHAR
    | INTEGER
    | BOOLEAN
    ;

WS
   : [ \t\r\n ] -> skip
   ;

empty:
    //Vazio ajsjasjaj
    ;



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
