#!/bin/sh

# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
export CLASSPATH=".:/usr/share/java/antlr-$ver-complete.jar:$CLASSPATH"

echo "livrarias: $CLASSPATH"

echo "Construindo arquivos java..."
antlr4 src/MiniPascal.g4 -o src/br/senac/minipascal/compiler/lexico/

echo "Compilando analisador lexico..."
javac src/br/senac/minipascal/compiler/lexico/*.java -o build/lexico
