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
        return pos>=len(code)

    def __nextChar(self):
        if isEOF: return '\0'
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

            match state:
                case 0:
                    ts = __isState0FirstReserved(cc)
                    if ts!=-1:
                        state=ts
                        term="".join((term, cc))
                        break

                    if utils.isWS(cc):
                        state=0
                        break
                    if utils.isDigit(cc):
                        state=1
                        term="".join((term, cc))
                        break
                    if utils.isLetter(cc):
                        state=2
                        term="".join((term, cc))
                        break
                    if cc=='\'':
                        state=3
                        term="".join((term, cc))
                        break
                    if cc=='\\':
                        state=6
                        term="".join((term, cc))
                        break
                    if cc=='*' or cc=='+' or cc=='-':
                        state=7
                        term="".join((term, cc))
                        break;
                    if cc=='{':
                        state=8
                        term="".join((term, cc))
                        break;

                    raise LexicalException("Unrecognized SYMBOL")

                    case 1:
                        if utils.isDigit(cc) or cc='.':
                            state=1
                            term="".join((term, cc))
                            break
                        if utils.isWS(cc) or utils.isOperator(cc) or utils.isPontuation(cc) or utils.isCommentOpen(cc):
                            __back()
                            return token.Token(token.TK_NUMBER ,term)
                        raise LexicalException("Malformed NUMBER")

                    case 2:
                        if utils.isLetter(cc) or utils.isDigit(cc):
                            state=2
                            term="".join((term, cc))
                        if utils.isOperator(cc) or utils.isRelation(cc) or utils.isCommentOpen(cc):
                            __back()
                            return token.Token(token.TK_IDENTIFIER, term)
                        raise LexicalException("Malformed IDENTIFIER")

                    case 3:
                        if cc='\'':
                            state=4
                            term="".join((term, cc))
                            break
                        if cc=='\\':
                            state=5
                            term="".join((term, cc))
                            break
                        term="".join((term, cc))
                        state=3
                        break

                    case 4:
                        __back()
                        return token.Token(token.TK_STRING, term)

                    case 5:
                        if cc=='\'' or utils.isLetter(cc):
                            state=3
                            term="".join((term, cc))
                            break
                        raise LexicalException("Unrecognized char command")

                    case 6:
                        if cc=='/':
                            state=9
                            break
                        __back()
                        return token.Token(token.TK_OPERATOR, term)

                    case 7:
                        __back()
                        return token.Token(token.TK_OPERATOR, term)

                    case 8:
                        if cc=='}':
                            state=9
                            term="".join((term, cc))
                            break
                        state=8
                        term="".join((term, cc))
                        break

                    case 9:
                        __back()
                        return nextToken() # Comentários devem ser desconsiderados

                    # TODO: Reservados




def __isState0FirstReserved(char):
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

class LexicalException(Exception):
