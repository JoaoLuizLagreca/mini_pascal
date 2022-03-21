// Generated from src/MiniPascal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(MiniPascalParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(MiniPascalParser.CabecalhoContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(MiniPascalParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(MiniPascalParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#valorVariavel}.
	 * @param ctx the parse tree
	 */
	void enterValorVariavel(MiniPascalParser.ValorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#valorVariavel}.
	 * @param ctx the parse tree
	 */
	void exitValorVariavel(MiniPascalParser.ValorVariavelContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoVetor}.
	 * @param ctx the parse tree
	 */
	void enterTipoVetor(MiniPascalParser.TipoVetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoVetor}.
	 * @param ctx the parse tree
	 */
	void exitTipoVetor(MiniPascalParser.TipoVetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tamanhoIndice}.
	 * @param ctx the parse tree
	 */
	void enterTamanhoIndice(MiniPascalParser.TamanhoIndiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tamanhoIndice}.
	 * @param ctx the parse tree
	 */
	void exitTamanhoIndice(MiniPascalParser.TamanhoIndiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tipoSimples}.
	 * @param ctx the parse tree
	 */
	void enterTipoSimples(MiniPascalParser.TipoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tipoSimples}.
	 * @param ctx the parse tree
	 */
	void exitTipoSimples(MiniPascalParser.TipoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoComposta}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoComposta(MiniPascalParser.DeclaracaoCompostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoComposta}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoComposta(MiniPascalParser.DeclaracaoCompostaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(MiniPascalParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(MiniPascalParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoSimples}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoSimples(MiniPascalParser.DeclaracaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoSimples}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoSimples(MiniPascalParser.DeclaracaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoAtributo(MiniPascalParser.DeclaracaoAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoAtributo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoAtributo(MiniPascalParser.DeclaracaoAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoRead}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoRead(MiniPascalParser.DeclaracaoReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoRead}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoRead(MiniPascalParser.DeclaracaoReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoWrite}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoWrite(MiniPascalParser.DeclaracaoWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoWrite}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoWrite(MiniPascalParser.DeclaracaoWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoEstrutural}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoEstrutural(MiniPascalParser.DeclaracaoEstruturalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoEstrutural}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoEstrutural(MiniPascalParser.DeclaracaoEstruturalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoIf}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoIf(MiniPascalParser.DeclaracaoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoIf}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoIf(MiniPascalParser.DeclaracaoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#declaracaoWhile}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoWhile(MiniPascalParser.DeclaracaoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#declaracaoWhile}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoWhile(MiniPascalParser.DeclaracaoWhileContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(MiniPascalParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(MiniPascalParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#sinal}.
	 * @param ctx the parse tree
	 */
	void enterSinal(MiniPascalParser.SinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#sinal}.
	 * @param ctx the parse tree
	 */
	void exitSinal(MiniPascalParser.SinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAditivo(MiniPascalParser.OperadorAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAditivo(MiniPascalParser.OperadorAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiplicativo(MiniPascalParser.OperadorMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiplicativo(MiniPascalParser.OperadorMultiplicativoContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#variavelAnexada}.
	 * @param ctx the parse tree
	 */
	void enterVariavelAnexada(MiniPascalParser.VariavelAnexadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variavelAnexada}.
	 * @param ctx the parse tree
	 */
	void exitVariavelAnexada(MiniPascalParser.VariavelAnexadaContext ctx);
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