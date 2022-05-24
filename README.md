# Projeto MiniPascal
ADO de Teoria da Computação e Compiladores na universidade SENAC

# Tarefas
🟠Análise léxica

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

[@Megiolaro](https://github.com/Megiolaro)

[@JoaoLuizLagreca](https://github.com/JoaoLuizLagreca)

# Dependências
## GNU/LINUX
- ANTLR4
- OpenJDK
- unzip

## Windows
- OpenJDK: https://openjdk.java.net/
- 7zip: https://www.7-zip.org/

# Build
## GNU/Linux
Nota: O projeto foi compilado no Manjaro, outras distribuições podem precisar de adaptações para compilar

`./build.sh`

O programa será empacotado como "MiniPascal.jar" na raiz


## Windows
Instale as dependências

Extraia o OpenJDK em algum lugar, baixe-o por aqui: https://openjdk.java.net/

Abra o build.bat e modifique a variável JAVAEXE_LOCATION com a localização da onde você extraiu o OpenJDK

Abra o CMD no diretório do projeto e execute:

`build.bat`

O programa será empacotado como "MiniPascal.jar" na raiz

# Uso
`java -jar MiniPascal.jar <caminho do código MiniPascal>`
