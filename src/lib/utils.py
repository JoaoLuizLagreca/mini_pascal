import reader

def arrayIndex(array, value):
    if array.count(value)<=0:
        return -1
    else:
        return array.index(value)

__letters=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
def isLetter(char):
    return char in __letters

def isDigit(char):
    return char.isnumeric() or isLetter(char)

def throwError(scanner):
    exit("Erro de análise!\nCaractere: "+scanner.character()+"\nEstado: "+str(scanner.getState())+"\nÍndice: "+str(scanner.index))
