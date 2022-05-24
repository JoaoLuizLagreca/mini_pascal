@echo off

rem Configuração pré-build

rem Localização do java.exe versão 11 para cima
set JAVAEXE_LOCATION=%USERPROFILE%\Documents\jdk-18.0.1.1\bin\

rem Localização do arquivo de descrição do ANTLR
set descricao=mini_pascal.g4
rem Localização do diretório do analisador .java gerado pelo ANTLR
set diretorio_antlr=src\br\senac\minipascal\antlr\
set ANTLR_LIB=libs/antlr-complete.jar





set TEVE_ERRO=0

if not exist "%JAVAEXE_LOCATION%" (
    echo Voce precisa baixar e extrair o OpenJDK 11 ou superior em um diretorio valido. Especifique a localizacao na variavel %%JAVAEXE_LOCATION%%
    echo Voce pode baixar por aqui: https://openjdk.java.net/
    exit /b 1
)

rem Importar bibliotecas
set CLASSPATH_OLD=%CLASSPATH%
set CLASSPATH=src;%ANTLR_LIB%;%CLASSPATH%

rem Gerar arquivos Java
echo Gerando analisadores com o ANTLR4...
%JAVAEXE_LOCATION%\java.exe org.antlr.v4.Tool %descricao% -package br.senac.minipascal.antlr -o %diretorio_antlr%
if errorlevel 1 goto error

rem Compilar arquivos
echo Compilando...
Setlocal EnableDelayedExpansion
for /F %%a in ('forfiles /S /M *.java /P src /C "cmd /c echo @path" ') do (
set ARQ_JAVA=%%a !ARQ_JAVA!
)
%JAVAEXE_LOCATION%\javac.exe %ARQ_JAVA% -d build
if errorlevel 1 goto error

rem Empacotar
echo Empacotando...
mkdir temp
7z x %ANTLR_LIB% -otemp javax/* org/* -r -y > nul
if errorlevel 1 goto erro_7z
robocopy /S /E build\ temp\ > nul

for /F %%a in ('dir /Ad /b temp') do (
set DIRETORIOS=%%a !DIRETORIOS!
)
cd temp
%JAVAEXE_LOCATION%\jar.exe cfm ../MiniPascal.jar ../src/manifest.txt %DIRETORIOS%
if errorlevel 1 goto apagar_temp
cd ..
rmdir /S /Q temp
echo Build finalizada!

echo Voce encontrara o arquivo como "MiniPascal.jar"

:final
rem Redefinir variáveis de ambiente
set CLASSPATH=%CLASSPATH_OLD%
set ARQ_JAVA=
set DIRETORIO=
endlocal
goto EOF

:erro_7z
echo Voce talvez nao tenha o 7zip instalado, por favor, instale
echo Voce pode baixa-lo aqui: https://www.7-zip.org/
set TEVE_ERRO=1
rmdir /S /Q temp
goto final

:apagar_temp
cd ..
rmdir /S /Q temp
set TEVE_ERRO=1
goto final

:error
set TEVE_ERRO=1
goto final

:EOF
exit /b %TEVE_ERRO%
