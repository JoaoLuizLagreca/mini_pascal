import sys
import lexer

if len(sys.argv)!=2:
    exit("Uso {} ARQUIVO_PASCAL".format(sys.argv[0]))


# Abrir arquivo de programação mini pascal
my_file = open(sys.argv[1], 'r')
codigo=my_file.read()
my_file.close()

lexer.scan(codigo)
