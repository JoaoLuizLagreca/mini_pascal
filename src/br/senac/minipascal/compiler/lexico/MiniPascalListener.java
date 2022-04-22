// Generated from src/MiniPascal.g4 by ANTLR 4.9.3
package br.senac.minipascal.compiler.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiniPascalParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiniPascalParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MiniPascalParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MiniPascalParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void enterPartDeclVar(MiniPascalParser.PartDeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#partDeclVar}.
	 * @param ctx the parse tree
	 */
	void exitPartDeclVar(MiniPascalParser.PartDeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(MiniPascalParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(MiniPascalParser.DeclVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentificadores(MiniPascalParser.ListaIdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentificadores(MiniPascalParser.ListaIdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#partDeclSubRot}.
	 * @param ctx the parse tree
	 */
	void enterPartDeclSubRot(MiniPascalParser.PartDeclSubRotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#partDeclSubRot}.
	 * @param ctx the parse tree
	 */
	void exitPartDeclSubRot(MiniPascalParser.PartDeclSubRotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declProc}.
	 * @param ctx the parse tree
	 */
	void enterDeclProc(MiniPascalParser.DeclProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declProc}.
	 * @param ctx the parse tree
	 */
	void exitDeclProc(MiniPascalParser.DeclProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parFormais}.
	 * @param ctx the parse tree
	 */
	void enterParFormais(MiniPascalParser.ParFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parFormais}.
	 * @param ctx the parse tree
	 */
	void exitParFormais(MiniPascalParser.ParFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#secParFormais}.
	 * @param ctx the parse tree
	 */
	void enterSecParFormais(MiniPascalParser.SecParFormaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#secParFormais}.
	 * @param ctx the parse tree
	 */
	void exitSecParFormais(MiniPascalParser.SecParFormaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void enterComandoComposto(MiniPascalParser.ComandoCompostoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#comandoComposto}.
	 * @param ctx the parse tree
	 */
	void exitComandoComposto(MiniPascalParser.ComandoCompostoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MiniPascalParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MiniPascalParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MiniPascalParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MiniPascalParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamadaProcedimento(MiniPascalParser.ChamadaProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamadaProcedimento(MiniPascalParser.ChamadaProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicional(MiniPascalParser.ComandoCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#comandoCondicional}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicional(MiniPascalParser.ComandoCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepetitivo(MiniPascalParser.ComandoRepetitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#comandoRepetitivo}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepetitivo(MiniPascalParser.ComandoRepetitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiniPascalParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiniPascalParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MiniPascalParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MiniPascalParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(MiniPascalParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(MiniPascalParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSimples(MiniPascalParser.ExpressaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSimples(MiniPascalParser.ExpressaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(MiniPascalParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(MiniPascalParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(MiniPascalParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(MiniPascalParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(MiniPascalParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(MiniPascalParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressoes(MiniPascalParser.ListaExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressoes(MiniPascalParser.ListaExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(MiniPascalParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(MiniPascalParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(MiniPascalParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(MiniPascalParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(MiniPascalParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(MiniPascalParser.EmptyContext ctx);
}