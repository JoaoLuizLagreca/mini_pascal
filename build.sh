#!/bin/sh

# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
export CLASSPATH=".:/usr/share/java/antlr-$ver-complete.jar:$CLASSPATH"

echo "livrarias: $CLASSPATH"

echo "Construindo arquivos java..."
antlr4 src/MiniPascal.g4 -package br.senac.minipascal.compiler.lexico -o src/br/senac/minipascal/compiler/lexico
mv src/br/senac/minipascal/compiler/lexico/src/* src/br/senac/minipascal/compiler/lexico
rm -r src/br/senac/minipascal/compiler/lexico/src

echo "Compilando analisador lexico..."
javac src/br/senac/minipascal/compiler/lexico/*.java -d build/lexico/
