#!/bin/sh

antlr_path="/usr/share/java"

# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
antlr_jar="$antlr_path/antlr-$ver-complete.jar"
export CLASSPATH=".:$antlr_jar:$CLASSPATH"

echo "Construindo arquivos java..."
rm -r src/br/senac/minipascal/compiler/lexico/*
antlr4 src/MiniPascal.g4 -package br.senac.minipascal.compiler.lexico -o src/br/senac/minipascal/compiler/lexico
mv src/br/senac/minipascal/compiler/lexico/src/* src/br/senac/minipascal/compiler/lexico
rm -r src/br/senac/minipascal/compiler/lexico/src

# echo "Compilando analisador lexico..."
# javac src/br/senac/minipascal/compiler/lexico/*.java -d build/lexico/
