import reader

WS=[' ', '\t', '\r', '\n']
op=['/', '+', '*', '-']
relation=['=', '<', '>']
comment_open=['/', '{']

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

def isWS(char):
    return char in WS
