import sys
sys.path.insert(0, 'lib')
import reader
from utils import isLetter
from utils import arrayIndex
from utils import isDigit
from utils import throwError

WS=[' ', '\t', '\r', '\n']

def scan(code):
    scanner = reader.scanner(code)
    while not (scanner.isEOF()):
        char = scanner.character()
        print(str(scanner.index())+" "+char+" "+str(scanner.getState())) #debug

        #FIXME: Adicionar simbolos especiais (revisão 2 do diagrama léxico)

        if char.isalpha(): char = char.lower()

        nextS=checkState(scanner, char)

        scanner.setState(nextS)

        scanner.next()

__states=[
    #0
    [
        ['o', 'd', 'a', 'n', 'b', 'e', 'i', 'w', 'p'],
        [1,   3,   6,   9,   12,  17,  20,  25,  31]
    ],

    #1
    [
        ['r'],
        [2]
    ],

    #2
    [],

    #3
    [
        ['i', 'o'],
        [4,   30]
    ],

    #4
    [
        ['v'],
        [5]
    ],

    #5
    [],

    #6
    [
        ['n'],
        [7]
    ],

    #7
    [
        ['d'],
        [8]
    ],

    #8
    [],

    #9
    [
        ['o'],
        [10]
    ],

    #10
    [
        ['t'],
        [11]
    ],

    #11
    [],

    #12
    [
        ['e'],
        [13]
    ],

    #13
    [
        ['g'],
        [14]
    ],

    #14
    [
        ['i'],
        [15]
    ],

    #15
    [
        ['n'],
        [16]
    ],

    #16
    [],

    #17
    [
        ['n', 'l'],
        [18,  22]
    ],

    #18
    [
        ['d'],
        [19]
    ],

    #19
    [],

    #20
    [
        ['f'],
        [21]
    ],

    #21
    [],

    #22
    [
        ['s'],
        [23]
    ],

    #23
    [
        ['e'],
        [24]
    ],

    #24
    [],

    #25
    [
        ['h'],
        [26]
    ],

    #26
    [
        ['i'],
        [27]
    ],

    #27
    [
        ['l'],
        [28]
    ],

    #28
    [
        ['e'],
        [29]
    ],

    #29
    [],

    #30
    [],

    #31
    [
        ['r'],
        [32]
    ],

    #32
    [
        ['o'],
        [33]
    ],

    #33
    [
        ['c', 'g'],
        [34,  40]
    ],

    #34
    [
        ['e'],
        [35]
    ],

    #35
    [
        ['d'],
        [36]
    ],

    #36
    [
        ['u'],
        [37]
    ],

    #37
    [
        ['r'],
        [38]
    ],

    #38
    [
        ['e'],
        [39]
    ],

    #39
    [],

    #40
    [
        ['r'],
        [41]
    ],

    #41
    [
        ['a'],
        [42]
    ],

    #42
    [
        ['m'],
        [43]
    ],

    #43
    [],

    #44
    [
        ['a'],
        [45]
    ],

    #45
    [
        ['r'],
        [46]
    ],

    #46
    []

]



def checkState(scanner, char):
    match scanner.getState():
            case 0:
                if char in WS: #WS -> skip
                    return 0

                i = arrayIndex(__states[0][0], char) #Analisa próximos estados no estado 0
                if i>-1: return __states[0][1][i]

                if isLetter(char): #É letra?
                    return 47
                if char.isnumeric(): #É número?
                    return 48

            case default:
                return nonInitialState(scanner, char)

def nonInitialState(scanner, char):
    match scanner.getState():

        case 47:
                if isDigit(char):
                    return 47

        case 48:
                if char.isnumeric():
                    return 48

                throwError(scanner)

        case default:
            if char in WS:
                return register(scanner, char)
            return tokenStates(scanner, char)

    if char in WS:
        return register(scanner, char)
    if isDigit(char):
        return 47

def tokenStates(scanner, char):

    if char in WS:
        return register(scanner, char)

    if scanner.getState()<len(__states) and len(__states[scanner.getState()]) > 0:
        i=arrayIndex(__states[scanner.getState()][0], char)
        if i>-1: return __states[scanner.getState()][1][i]

    if isDigit(char):
        return 47



    throwError(scanner)

def register(scanner, char):
    #TODO: Implementar registrador
    return 0
