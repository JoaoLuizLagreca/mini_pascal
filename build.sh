#!/bin/sh

descricao=mini_pascal.g4 #Localização do arquivo de descrição do ANTLR
diretorio_antlr="src/br/senac/minipascal/antlr/" #Localização do diretório do analisador .java gerado pelo ANTLR


#Importar biblioteca
export CLASSPATH="src:/usr/share/java/antlr-complete.jar:$CLASSPATH"

#Gerar arquivos Java
echo "Gerando analisadores com o ANTLR4..."
mkdir -p $diretorio_antlr
antlr4 $descricao -package br.senac.minipascal.antlr -o $diretorio_antlr || exit $?

#Compilar arquivos
echo "Compilando..."
javaFiles=$(find src -name "*.java")
mkdir -p build
javac $javaFiles -d build || exit $?

#Empacotar
echo "Empacotando..."
unzip -qo /usr/share/java/antlr-complete.jar javax/* org/* -d build/ || exit $?
diretorios=$(ls build/)
cd build
jar cfm ../MiniPascal.jar ../src/manifest.txt $diretorios || exit $?

echo "Build finalizada!"
