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
    | 'var' valorVariavel ';' (valorVariavel ';')* //TODO: "var" não é caso-sensível
    ;

valorVariavel
    : IDENTIFICADOR (',' IDENTIFICADOR)* ':' tipo
    ;

tipo
    : tipoSimples
    | tipoVetor
    ;

tipoVetor
    : array '[' tamanhoIndice ']' of tipoSimples //TODO: "array" e "of" não são caso-sensíveis
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
    : begin declaracao (';' declaracao)* end //TODO: "begin" e "end" não são caso-sensíves
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
    : read '(' variavel (',' variavel)* ')' //TODO: "read" não é caso-sensível
    ;

declaracaoWrite
    : write '(' variavel (',' variavel)* ')'
    ;

declaracaoEstrutural
    : declaracaoComposta
    | declaracaoIf
    | declaracaoWhile
    ;

declaracaoIf //TODO: "if", "then" e "else" não são caso-sensíveis
    : if expressao then declaracao
    | if expressao then declaracao else declaracao
    ;

declaracaoWhile
    : while expressao do declaracao //TODO: "whie" e "do" não são caso-sensíveis


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
    | not fator //TODO: "not" não é caso-sensível
    ;



operadorRelacional
    : '='
    | '<>'
    | '<'
    | '<='
    | '>='
    | '>'
    | or
    | and //TODO: "or" e "and" não são caso-sensíveis
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
    | div //TODO: div não é caso-sensível
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
    | div
    | or
    | and
    | not
    | if
    | then
    | else
    | of
    | while
    | do
    | begin
    | end
    | read
    | write
    | var
    | array
    | function
    | procedure
    | program
    | true
    | false
    | char
    | integer
    | boolean
    ;

WS
   : [ \t\r\n ] -> skip
   ;

empty:
    //Vazio ajsjasjaj
    ;

