package br.senac.minipascal;

import br.senac.minipascal.compiler.lexico.MiniPascalLexer;
import br.senac.minipascal.compiler.lexico.MiniPascalParser;
import org.antrl.v4.runtime.CharStreams;
import org.antrl.v4.runtime.CommonTokenStream;

public class Scanner{

	public static void main(String args[]){
		try{
            MiniPascalLexer lexer;
            MiniPascalParser parser;
            //Ler o arquivo "Nome do arquivo" sendo entrada para o analisador lexico
            lexer = new MiniPascalLexer(CharStreams.fromFileName("teste.pas"));

            //cria-se um fluxo de tokens para passar para o parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            //cria-se o parser a partir do tokenStream
            parser = new MiniPascalParser(tokenStream);
            parser.cabecalho();
            System.out.println("Copilação Efetuada com sucesso");
        }
            catch(Exception ex){
                System.err.println("Erro "+ex.getMessage());
                }
	}

}
