import sys
import lexer
sys.path.insert(0, 'lib')
import token

if len(sys.argv)!=2:
    exit("Uso {} ARQUIVO_PASCAL".format(sys.argv[0]))


# Abrir arquivo de programação mini pascal
my_file = open(sys.argv[1], 'r')
codigo=my_file.read()
my_file.close()

scanner = lexer.Scanner(codigo)

retorno=None

while True:
    retorno = scanner.nextToken()
    if retorno==None: break
    print(str(retorno.getID()) + " - " + retorno.getTerm())

