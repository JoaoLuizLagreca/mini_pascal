# Projeto MiniPascal
ADO de Teoria da Computação e Compiladores na universidade SENAC

# Tarefas
☑Análise léxica

❌Análise sintática

❌Interpretador ou compilador

## Legenda

✅ = Finalizado

☑ = Finalizado, mas precisa de correção

🟠 = Em desenvolvimento 

❌ = Não realizado

# Integrantes
[@ftimoti](https://github.com/ftimoti)

[@josoarespir5](https://github.com/josoarespir5)

Gian Megiolaro

[@JoaoLuizLagreca](https://github.com/JoaoLuizLagreca)

# Build
Nota: O projeto foi compilado no Manjaro, outras distribuições Arch linux podem funcionar, outros sistemas operacionais como Ubuntu, Debian, Windows, *BSDs podem precisar de modificações para compilar

## Compilação automática
`./build.sh`

## Construir analisadores léxicos

`./lexxerBuild.sh`

Os códigos em java do analisador léxico estará em src/br/senac/minipascal/compiler/lexico/

## Compilar e empacotar em .JAR

`./scanBuild`

O programa será compilado e empacotado com o nome "Scan.jar" na raiz do projeto

# Uso
`java -jar Scan.jar <caminho do código MiniPascal>`
