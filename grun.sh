#!/bin/bash

tmp_grun=/tmp/minipascal_grun

if [ $# -lt 1 ]; then
    echo -e "Uso:\n./grun.sh REGRA [ARGUMENTOS]*\nExemplo:\n./grun.sh identificador -tree -gui"
    exit
fi

#Importar biblioteca
export CLASSPATH="src:/usr/share/java/antlr-complete.jar:$CLASSPATH"

mkdir -p $tmp_grun/src || exit $?
mkdir -p $tmp_grun/build || exit $?

#Construção
echo "Construindo arquivos Java..."
antlr4 mini_pascal.g4 -o $tmp_grun/src || exit $?

#Compilação
echo "Compilando..."
cd $tmp_grun
javac src/*.java -d build/ || exit $?

#Execução
echo "Executando teste (insira as frases):"
cd build
comando="grun mini_pascal $@"
echo "\$$comando"
$comando

rm -r $tmp_grun
