class scanner:
    def __init__(self, code):
        self.code = code
        self.__state=0
        self.i=0

    def next(self):
        self.i+=1

    def character(self):
        return self.code[self.i]

    def getState(self):
        return self.__state

    def setState(self, state):
        self.__state=state

    def isEOF(self):
        return self.i>=len(self.code)

    def index(self):
        return self.i
