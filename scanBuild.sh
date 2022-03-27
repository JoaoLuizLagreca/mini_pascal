#!/bin/sh

antlr_path="/usr/share/java"

# localizar livraria
ver=$(echo `antlr4` | awk '{ print $5 }')
antlr_jar="$antlr_path/antlr-$ver-complete.jar"
export CLASSPATH="src:$antlr_jar:$CLASSPATH"

# localizar arquivos .java na src
javaFiles=$(find src -name "*.java" )

# Compilar
echo "Compilando..."
javac $javaFiles -d build && echo "Compilado com sucesso" >&0 || echo "Falha na compilação" >&2

# Empacotar
echo "Empacotando..."

echo "Extraindo classes necessárias da livraria ANTRL4..."

sucesso=0
unzip -qo $antlr_jar javax/* org/* -d build/ && sucesso=1 || sucesso=0

if [ $sucesso -eq 0 ]; then
    echo "Erro ao extrair biblioteca" >&2
else
    diretorios=$(ls build/)

    cd build
    jar cfm ../Scan.jar ../src/manifest.txt $diretorios && echo "Empacotado com sucesso" >&0 || echo "Falha ao empacotar" >&2
fi
