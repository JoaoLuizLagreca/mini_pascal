import sys
sys.path.insert(0, 'lib')
import reader
import token
import utils

class Scanner:

    def __init__(self, code):
        self.code = code
        self.pos = 0

    def isEOF(self):
        return self.pos>=len(self.code)

    def __nextChar(self):
        if self.isEOF(): return '\0'
        r = self.code[self.pos]
        self.pos+=1
        return r

    def __back(self):
        self.pos-=1

    def nextToken(self):

        if self.isEOF(): return None

        state=0
        cc = None
        term=""
        while True:
            cc = self.__nextChar()
            # print(str(state)+": "+cc)  #DEPURAR ENTRADAS

            match state:
                case 0:
                    ts = self.__isState0FirstReserved(cc)
                    if ts!=-1:
                        state=ts
                        term="".join((term, cc))
                        continue

                    if utils.isWS(cc):
                        state=0
                        continue
                    if utils.isDigit(cc):
                        state=1
                        term="".join((term, cc))
                        continue
                    if utils.isLetter(cc):
                        state=2
                        term="".join((term, cc))
                        continue
                    if cc=='\'':
                        state=3
                        term="".join((term, cc))
                        continue
                    if cc=='\\':
                        state=6
                        term="".join((term, cc))
                        continue
                    if cc=='*' or cc=='+' or cc=='-':
                        state=7
                        term="".join((term, cc))
                        continue;
                    if cc=='{':
                        state=8
                        term="".join((term, cc))
                        continue;

                    if utils.isPontuation(cc):
                        state=62
                        term="".join((term, cc))
                        continue

                    if utils.isSymbol(cc):
                        state=63
                        term="".join((term, cc))
                        continue

                    if cc=='\x00': #EOF
                        return None

                    raise LexicalException("Unrecognized SYMBOL " + cc)

                case 1:
                    if utils.isDigit(cc) or cc=='.':
                        state=1
                        term="".join((term, cc))
                        continue
                    if cc=='\x00' or utils.isSymbol(cc) or utils.isPontuation(cc) or utils.isWS(cc) or utils.isOperator(cc) or utils.isPontuation(cc) or utils.isCommentOpen(cc):
                        self.__back()
                        return token.Token(token.TK_NUMBER ,term)
                    raise LexicalException("Malformed NUMBER")

                case 2:
                    if utils.isLetter(cc) or utils.isDigit(cc):
                        state=2
                        term="".join((term, cc))
                        continue
                    if cc=='\x00' or utils.isSymbol(cc) or utils.isPontuation(cc) or utils.isOperator(cc) or utils.isRelation(cc) or utils.isCommentOpen(cc) or utils.isWS(cc):
                        self.__back()
                        return token.Token(token.TK_IDENTIFIER, term)
                    raise LexicalException("Malformed IDENTIFIER")

                case 3:
                    if cc=='\'':
                        state=4
                        term="".join((term, cc))
                        continue
                    if cc=='\\':
                        state=5
                        term="".join((term, cc))
                        continue
                    term="".join((term, cc))
                    state=3
                    continue

                case 4:
                    self.__back()
                    return token.Token(token.TK_STRING, term)

                case 5:
                    if cc=='\'' or utils.isLetter(cc):
                        state=3
                        term="".join((term, cc))
                        continue
                    raise LexicalException("Unrecognized char command")

                case 6:
                    if cc=='/':
                        state=9
                        continue
                    self.__back()
                    return token.Token(token.TK_OPERATOR, term)

                case 7:
                    self.__back()
                    return token.Token(token.TK_OPERATOR, term)

                case 8:
                    if cc=='}':
                        state=9
                        term="".join((term, cc))
                        continue
                    state=8
                    term="".join((term, cc))
                    continue

                case 9:
                    self.__back()
                    return nextToken() # Comentários devem ser desconsiderados

                case 62:
                    self.__back()
                    return token.Token(token.TK_PONTUATION, term)

                case 63:
                    self.__back()
                    return token.Token(token.TK_SYMBOL, term)

                case default:
                    raise LexicalException("Generic Error!")

                # TODO: Reservados


    def __isState0FirstReserved(self, char):
        cc = char.lower()
        if cc=='v':
            return 59
        if cc=='p':
            return 10
        if cc=='b':
            return 17
        if cc=='e':
            return 22
        if cc=='i':
            return 28
        if cc=='t':
            return 30
        if cc=='f':
            return 37
        if cc=='w':
            return 42
        if cc=='d':
            return 47
        if cc=='a':
            return 51
        if cc=='o':
            return 54
        if cc=='n':
            return 56

        return -1

    #def __reservedStates(self, cc, state,

class LexicalException(Exception):
    def __init__(self, *args):
        super().__init__(args)
