package br.senac.minipascal;

import java.util.BitSet;
import br.senac.minipascal.antlr.mini_pascalLexer;
import br.senac.minipascal.antlr.mini_pascalParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Scanner{

	public static void main(String args[]){
		try{

            if(args.length<=0)
                throw new Exception("Uso: MiniPascal.jar <Caminho do arquivo MiniPascal>");

            mini_pascalLexer lexer;
            mini_pascalParser parser;
            //Ler o arquivo "Nome do arquivo" sendo entrada para o analisador lexico
            lexer = new mini_pascalLexer(CharStreams.fromFileName(args[0]));

            //cria-se um fluxo de tokens para passar para o parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            //cria-se o parser a partir do tokenStream
            parser = new mini_pascalParser(tokenStream);

            ErrorListener errorL = new ErrorListener();
            TreeListener treeL = new TreeListener();

            parser.addErrorListener(errorL);
            parser.addParseListener(treeL);
            //parser.programa(); //TODO: Iniciar a implementação da descrição sintática

            if(!errorL.isError())
                System.out.println("Análise léxica com sucesso!");

        }
            catch(Exception ex){
                System.err.println("Erro do scanner "+ex.getMessage());
                }
	}

}

class ErrorListener implements ANTLRErrorListener{
//Ouvidor de erros

    private boolean erro=false;

    public void  reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs){

        //System.err.println("Erro de ambiguidade: \nstartIndex: "+startIndex+"\nstopIndex: "+stopIndex+"\nexact: "+exact);

    }

    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs){

         //System.err.println("Erro de ambiguidade: \nstartIndex: "+startIndex+"\nstopIndex: "+stopIndex);

    }

    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs){

         //System.err.println("Erro de ambiguidade: \nstartIndex: "+startIndex+"\nstopIndex: "+stopIndex+"\nprediction: "+prediction);

    }

    public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){

        System.err.println("Erro de sintaxe: ");
        System.err.println(e.getMessage());
        e.printStackTrace();

        erro=true;

    }

    public boolean isError(){
        return erro;
    }

}

class TreeListener implements ParseTreeListener{
//Leitor árvore

    public void visitTerminal(TerminalNode node){
    }

    public void visitErrorNode(ErrorNode node){
    }

    public void enterEveryRule(ParserRuleContext ctx){
    }

    public void exitEveryRule(ParserRuleContext ctx){
    }

}
