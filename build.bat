@echo off

rem Configuração pré-build

rem Localização do java.exe versão 11 para cima
set JAVAEXE_LOCATION=%USERPROFILE%\Documents\jdk-18.0.1.1\bin\

rem Localização do arquivo de descrição do ANTLR
set descricao=mini_pascal.g4
rem Localização do diretório do analisador .java gerado pelo ANTLR
set diretorio_antlr=src\br\senac\minipascal\antlr\
set ANTLR_LIB=libs/antlr-complete.jar






if not exist "%JAVAEXE_LOCATION%" (
    echo Voce precisa baixar e extrair o OpenJDK 11 ou superior em um diretorio valido. Especifique a localizacao na variavel %%JAVAEXE_LOCATION%%
    echo Voce pode baixar por aqui: https://openjdk.java.net/
    exit /b 1
)

rem Importar bibliotecas
set CLASSPATH_OLD=%CLASSPATH%
set CLASSPATH=src;%ANTLR_LIB%;%CLASSPATH%

rem Gerar arquivos Java
%JAVAEXE_LOCATION%\java.exe org.antlr.v4.Tool %descricao% -package br.senac.minipascal.antlr -o %diretorio_antlr%
if errorlevel 1 goto final

rem Compilar arquivos
Setlocal EnableDelayedExpansion
for /F %%a in ('forfiles /S /M *.java /P src /C "cmd /c echo @path" ') do (
set ARQ_JAVA=%%a !ARQ_JAVA!
)
%JAVAEXE_LOCATION%\javac.exe %ARQ_JAVA% -d build
if errorlevel 1 goto final

rem Empacotar
mkdir temp
7z x %ANTLR_LIB% -otemp javax/* org/* -r -y > nul
robocopy /S /E build\ temp\ > nul

for /F %%a in ('dir /Ad /b temp') do (
set DIRETORIOS=%%a !DIRETORIOS!
)
cd temp
%JAVAEXE_LOCATION%\jar.exe cfm ../MiniPascal.jar ../src/manifest.txt %DIRETORIOS%
if errorlevel 1 goto apagar_temp
cd ..
rmdir /S /Q temp

:final
rem Redefinir variáveis de ambiente
set CLASSPATH=%CLASSPATH_OLD%
set ARQ_JAVA=
set DIRETORIO=
endlocal
goto EOF

:apagar_temp
cd ..
rmdir /S /Q temp
goto final

:EOF
