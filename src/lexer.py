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
            #print(str(state)+": "+cc)  #DEPURAR ENTRADAS

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
                    args=[cc, state, term]
                    r = self.__reservedStates(args)
                    state=args[1]
                    term=args[2]
                    if r==None:
                        continue
                    else:
                        return r
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

    def __reservedStates(self, args): # Python não tem ponteiros, wtf
        lc = args[0].lower()
        cc = args[0]
        match args[1]:
            case 17:
                if lc=='e':
                    args[1]=18
                    args[2]="".join((args[2], cc))
                    return None
            case 18:
                if lc=='g':
                    args[1]=19
                    args[2]="".join((args[2], cc))
                    return None
            case 19:
                if lc=='i':
                    args[1]=20
                    args[2]="".join((args[2], cc))
                    return None
            case 20:
                if lc=='n':
                    args[1]=21
                    args[2]="".join((args[2], cc))
                    return None
            case 21:
                return self.__lastReserved(args, token.TK_BEGIN)
            case 22:
                if lc=='n':
                    args[1]=23
                    args[2]="".join((args[2], cc))
                    return None
                if lc=='l':
                    args[1]=25
                    args[2]="".join((args[2]. cc))
                    return None
            case 23:
                if lc=='d':
                    args[1]=24
                    args[2]="".join((args[2], cc))
                    return None
            case 24:
                return self.__lastReserved(args, token.TK_END)
            case 25:
                if lc=='s':
                    args[1]=26
                    args[2]="".join((args[2], cc))
                    return None
            case 26:
                if lc=='e':
                    args[1]=27
                    args[2]="".join((args[2], cc))
                    return None
            case 27:
                return self.__lastReserved(args, token.TK_ELSE)
            case 28:
                if lc=='f':
                    args[1]=29
                    args[2]="".join((args[2], cc))
                    return None
            case 29:
                return self.__lastReserved(args, token.TK_IF)
            case 30:
                if lc=='h':
                    args[1]=31
                    args[2]="".join((args[2], cc))
                    return None
                if lc=='r':
                    args[1]=34
                    args[2]="".join((args[2], cc))
                    return None
            case 31:
                if lc=='e':
                    args[1]=32
                    args[2]="".join((args[2], cc))
                    return None
            case 32:
                if lc=='n':
                    args[1]=33
                    args[2]="".join((args[2], cc))
                    return None
            case 33:
                return self.__lastReserved(args, token.TK_THEN)
            case 34:
                if lc=='u':
                    args[1]=35
                    args[2]="".join((args[2], cc))
                    return None
            case 35:
                if lc=='e':
                    args[1]=36
                    args[2]="".join((args[2], cc))
                    return None
            case 36:
                return self.__lastReserved(args, token.TK_TRUE)
            case 37:
                if lc=='a':
                    args[1]=38
                    args[2]="".join((args[2], cc))
                    return None
            case 38:
                if lc=='l':
                    args[1]=39
                    args[2]="".join((args[2], cc))
                    return None
            case 39:
                if lc=='s':
                    args[1]=40
                    args[2]="".join((args[2], cc))
                    return None
            case 40:
                if lc=='e':
                    args[1]=41
                    args[2]="".join((args[2], cc))
                    return None
            case 41:
                return self.__lastReserved(args, token.TK_FALSE)
            case 42:
                if lc=='h':
                    args[1]=43
                    args[2]="".join((args[2], cc))
                    return None
            case 43:
                if lc=='i':
                    args[1]=44
                    args[2]="".join((args[2], cc))
                    return None
            case 44:
                if lc=='l':
                    args[1]=45
                    args[2]="".join((args[2], cc))
                    return None
            case 45:
                if lc=='e':
                    args[1]=46
                    args[2]="".join((args[2], cc))
                    return None
            case 46:
                return self.__lastReserved(args, token.TK_WHILE)
            case 47:
                if lc=='o':
                    args[1]=48
                    args[2]="".join((args[2], cc))
                    return None
                if lc=='i':
                    args[1]=49
                    args[2]="".join((args[2], cc))
                    return None
            case 48:
                return self.__lastReserved(args, token.TK_DO)
            case 49:
                if lc=='v':
                    args[1]=50
                    args[2]="".join((args[2], cc))
                    return None
            case 50:
                return self.__lastReserved(args, token.TK_DIV)
            case 51:
                if lc=='n':
                    args[1]=52
                    args[2]="".join((args[2], cc))
                    return None
            case 52:
                if lc=='d':
                    args[1]=53
                    args[2]="".join((args[2], cc))
                    return None
            case 53:
                return self.__lastReserved(args, token.TK_AND)
            case 54:
                if lc=='r':
                    args[1]=55
                    args[2]="".join((args[2], cc))
                    return None
            case 55:
                return self.__lastReserved(args, token.TK_OR)
            case 56:
                if lc=='o':
                    args[1]=57
                    args[2]="".join((args[2], cc))
                    return None
            case 57:
                if lc=='t':
                    args[1]=58
                    args[2]="".join((args[2], cc))
                    return None
            case 58:
                return self.__lastReserved(args, token.TK_NOT)
            case 59:
                if lc=='a':
                    args[1]=60
                    args[2]="".join((args[2], cc))
                    return None
            case 60:
                if lc=='r':
                    args[1]=61
                    args[2]="".join((args[2], cc))
                    return None
            case 61:
                return self.__lastReserved(args, token.TK_VAT)


            case default:
                raise LexicalException("Generic Error!")

        if utils.isDigit(cc) or utils.isLetter(cc):
            args[1]=2
            args[2]="".join((args[2], cc))
            return None

        if cc=='\x00' or utils.isSymbol(cc) or utils.isPontuation(cc) or utils.isOperator(cc) or utils.isRelation(cc) or utils.isCommentOpen(cc) or utils.isWS(cc):
            self.__back()
            return token.Token(token.TK_IDENTIFIER, args[2])

        raise LexicalException("Malformed IDENTIFIER")


    def __lastReserved(self, args, t):
        if utils.isDigit(args[0]) or utils.isLetter(args[0]):
            args[1]=2
            return None

        self.__back()
        return token.Token(t, args[2])


class LexicalException(Exception):
    def __init__(self, *args):
        super().__init__(args)
