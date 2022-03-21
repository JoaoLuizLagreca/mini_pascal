//Criado baseado na documentação: http://www.facom.ufms.br/~ricardo/Courses/CompilerI/Lectures/minipascalsyntax.pdf
//FIXME: NÃO TESTADO
//TODO: Realizar analisadores léxicos para declarações não caso-sensíveis

grammar MiniPascal;

cabecalho
    : 'program' identificador ';' bloco
    ;

bloco
    : declaracaoVariavel declaracaoComposta
    ;

declaracaoVariavel
    : empty
    | var valorVariavel ';' (valorVariavel ';')* //TODO: "var" não é caso-sensível
    ;

valorVariavel
    : identificador (',' identificador)* ':' tipo
    ;

tipo
    : tipoSimples
    | tipoVetor
    ;

tipoVetor
    : array '[' tamanhoIndice ']' of tipoSimples //TODO: "array" e "of" não são caso-sensíveis
    ;

tamanhoIndice
    : constanteInteira '..' constanteInteira
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
    : identificador
    | variavelAnexada
    ;

variavelAnexada
    : identificador '[' expressao ']'
    ;



constante
    : constanteInteira
    | constanteCaractere
    | identificador
    ;

identificador
    : letra (letraOuDigito)*
    ;

letraOuDigito
    : letra
    | digito
    ;

constanteInteira
    : digito (digito)*
    ;

constanteCaractere
    : '\'' letraOuDigito '\''
    | '\"' letraOuDigito (letraOuDigito)* '\"'

letra
    : a
    | b
    | c
    | d
    | e
    | f
    | g
    | h
    | i
    | j
    | k
    | l
    | m
    | n
    | o
    | p
    | q
    | r
    | s
    | t
    | u
    | v
    | w
    | x
    | y
    | z
    | A
    | B
    | C
    | D
    | E
    | F
    | G
    | H
    | I
    | J
    | K
    | L
    | M
    | N
    | O
    | P
    | Q
    | R
    | S
    | T
    | U
    | W
    | X
    | Y
    | Z
    ;

digito
    : 0
    | 1
    | 2
    | 3
    | 4
    | 5
    | 6
    | 7
    | 8
    | 9
    ;

simboloEspecial
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

