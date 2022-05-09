@echo off
rem Localização do arquivo de descrição do ANTLR
set descricao=mini_pascal.g4
rem Localização do diretório do analisador .java gerado pelo ANTLR
set diretorio_antlr="src\br\senac\minipascal\antlr\"


rem Importar bibliotecas
set CLASSPATH_OLD=%CLASSPATH%
set CLASSPATH=src;libs/antlr-complete.jar;%CLASSPATH%

rem Gerar arquivos Java
java org.antlr.v4.Tool %descricao% -package br.senac.minipascal.antlr -o %diretorio_antlr%
if errorlevel 1 goto final


:final
rem Redefinir variáveis de ambiente
set CLASSPATH=%CLASSPATH_OLD%
