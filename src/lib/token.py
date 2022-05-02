TK_IDENTIFIER = 0;  # letra (letra | digito)*
TK_NUMBER     = 1;  # digito (digito | .) *
TK_OPERATOR   = 2;  # * | + | - | /
TK_STRING     = 3;  # ' qualquer* '
TK_PROGRAM    = 4;  # P R O G R A M
TK_BEGIN      = 5;  # B E G I N
TK_END        = 6;  # E N D
TK_IF         = 7;  # I F
TK_THEN       = 8;  # T H E N
TK_TRUE       = 9;  # T R U E
TK_FALSE      = 10; # F A L S E
TK_WHILE      = 11; # W H I L E
TK_DO         = 12; # D O
TK_DIV        = 13; # D I V
TK_AND        = 14; # A N D
TK_OR         = 15; # O R
TK_NOT        = 16; # N O T
TK_VAR        = 17; # V A R

RESERVED = [TK_PROGRAM, TK_BEGIN, TK_END, TK_IF, TK_THEN, TK_TRUE, TK_FALSE, TK_WHILE, TK_DO, TK_DIV, TK_AND, TK_OR, TK_NOT, TK_VAR]


class Token:

    def __init__(self, id, term):
        self.id = id
        self.term = term

    def getID(self):
        return self.id

    def getTerm(self):
        return self.term
