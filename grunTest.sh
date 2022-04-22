#!/bin/bash

if [ $# -lt 1 ]; then
    echo -e "Uso:\n./grunTest.sh REGRA [ARGUMENTOS]*"
fi

antlr_path="/usr/share/java"

#criar diretórios
rm -r lexxerBuild/
mkdir -p lexxerBuild/src
mkdir lexxerBuild/build

# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
antlr_jar="$antlr_path/antlr-$ver-complete.jar"
export CLASSPATH=".:$antlr_jar:$CLASSPATH"

echo "Construindo arquivos java..."
antlr4 src/MiniPascal.g4 -o lexxerBuild/ || exit $?

echo "Compilando..."
cd lexxerBuild
javac src/MiniPascal*.java -d build/ || exit $?

echo "Executando teste (insira as frases):"
cd build
comando="grun MiniPascal $@"
echo "\$$comando"
$comando

