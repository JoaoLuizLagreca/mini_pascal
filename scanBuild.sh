#!/bin/sh
# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
export CLASSPATH="src:/usr/share/java/antlr-$ver-complete.jar:$CLASSPATH"

# localizar arquivos .java na src
javaFiles=$(find src -name "*.java" )

# Compilar
javac $javaFiles -d build && echo "Compilado com sucesso" >&0 || echo "Falha na compilação" >&2

