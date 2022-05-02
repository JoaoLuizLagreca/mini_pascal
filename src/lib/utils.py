import reader

WS=[' ', '\t', '\r', '\n']
op=['/', '+', '*', '-']
relation=['=', '<', '>']
comment_open=['/', '{']
symbols=['(' , ')', '[', ']']
pontuation=['.', ';']

def arrayIndex(array, value):
    if array.count(value)<=0:
        return -1
    else:
        return array.index(value)

def isLetter(char):
    return (char >= 'a' and char <= 'z') or (char >='A' and char <='Z') or char == '_'

def isDigit(char):
    return char.isnumeric()

def isOperator(char):
    return char in op

def isPontuation(char):
    return char==';'

def isRelation(char):
    return char in relation

def isCommentOpen(char):
    return char in comment_open

def isSymbol(char):
    return char in symbols

def isPontuation(char):
    return char in pontuation

def isWS(char):
    return char in WS
