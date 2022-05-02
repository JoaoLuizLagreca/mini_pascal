TK_IDENTIFIER = 0;  # letra (letra | digito)*
TK_NUMBER     = 1;  # digito (digito | .) *
TK_OPERATOR   = 2;  # * | + | - | /
TK_STRING     = 3;  # ' qualquer* '
TK_PONTUATION = 4;  # ; | .
TK_SYMBOL     = 5;  # ( | ) | [ | ]
TK_PROGRAM    = 6;  # P R O G R A M
TK_BEGIN      = 7;  # B E G I N
TK_END        = 8;  # E N D
TK_IF         = 9;  # I F
TK_THEN       = 10;  # T H E N
TK_TRUE       = 11;  # T R U E
TK_FALSE      = 12; # F A L S E
TK_WHILE      = 13; # W H I L E
TK_DO         = 14; # D O
TK_DIV        = 15; # D I V
TK_AND        = 16; # A N D
TK_OR         = 17; # O R
TK_NOT        = 18; # N O T
TK_VAR        = 19; # V A R

RESERVED = [TK_PROGRAM, TK_BEGIN, TK_END, TK_IF, TK_THEN, TK_TRUE, TK_FALSE, TK_WHILE, TK_DO, TK_DIV, TK_AND, TK_OR, TK_NOT, TK_VAR]


class Token:

    def __init__(self, id, term):
        self.id = id
        self.term = term

    def getID(self):
        return self.id

    def getTerm(self):
        return self.term
