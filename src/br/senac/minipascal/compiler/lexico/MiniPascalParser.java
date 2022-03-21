// Generated from src/MiniPascal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, CONSTANTE=19, IDENTIFICADOR=20, LETRAOUDIGITO=21, CONSTANTEINTEIRA=22, 
		CONSTANTECARACTERE=23, LETRA=24, DIGITO=25, SIMBOLOESPECIAL=26, WS=27, 
		DIV=28, OR=29, AND=30, NOT=31, IF=32, THEN=33, ELSE=34, OF=35, WHILE=36, 
		DO=37, BEGIN=38, END=39, READ=40, WRITE=41, VAR=42, ARRAY=43, FUNCTION=44, 
		PROCEDURE=45, PROGRAM=46, TRUE=47, FALSE=48, CHAR=49, INTEGER=50, BOOLEAN=51;
	public static final int
		RULE_cabecalho = 0, RULE_bloco = 1, RULE_declaracaoVariavel = 2, RULE_valorVariavel = 3, 
		RULE_tipo = 4, RULE_tipoVetor = 5, RULE_tamanhoIndice = 6, RULE_tipoSimples = 7, 
		RULE_declaracaoComposta = 8, RULE_declaracao = 9, RULE_declaracaoSimples = 10, 
		RULE_declaracaoAtributo = 11, RULE_declaracaoRead = 12, RULE_declaracaoWrite = 13, 
		RULE_declaracaoEstrutural = 14, RULE_declaracaoIf = 15, RULE_declaracaoWhile = 16, 
		RULE_expressao = 17, RULE_expressaoSimples = 18, RULE_termo = 19, RULE_fator = 20, 
		RULE_operadorRelacional = 21, RULE_sinal = 22, RULE_operadorAditivo = 23, 
		RULE_operadorMultiplicativo = 24, RULE_variavel = 25, RULE_variavelAnexada = 26, 
		RULE_empty = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"cabecalho", "bloco", "declaracaoVariavel", "valorVariavel", "tipo", 
			"tipoVetor", "tamanhoIndice", "tipoSimples", "declaracaoComposta", "declaracao", 
			"declaracaoSimples", "declaracaoAtributo", "declaracaoRead", "declaracaoWrite", 
			"declaracaoEstrutural", "declaracaoIf", "declaracaoWhile", "expressao", 
			"expressaoSimples", "termo", "fator", "operadorRelacional", "sinal", 
			"operadorAditivo", "operadorMultiplicativo", "variavel", "variavelAnexada", 
			"empty"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'['", "']'", "'..'", "':='", "'('", "')'", 
			"'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CONSTANTE", "IDENTIFICADOR", 
			"LETRAOUDIGITO", "CONSTANTEINTEIRA", "CONSTANTECARACTERE", "LETRA", "DIGITO", 
			"SIMBOLOESPECIAL", "WS", "DIV", "OR", "AND", "NOT", "IF", "THEN", "ELSE", 
			"OF", "WHILE", "DO", "BEGIN", "END", "READ", "WRITE", "VAR", "ARRAY", 
			"FUNCTION", "PROCEDURE", "PROGRAM", "TRUE", "FALSE", "CHAR", "INTEGER", 
			"BOOLEAN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CabecalhoContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(MiniPascalParser.IDENTIFICADOR, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitCabecalho(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(PROGRAM);
			setState(57);
			match(IDENTIFICADOR);
			setState(58);
			match(T__0);
			setState(59);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoCompostaContext declaracaoComposta() {
			return getRuleContext(DeclaracaoCompostaContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			declaracaoVariavel();
			setState(62);
			declaracaoComposta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<ValorVariavelContext> valorVariavel() {
			return getRuleContexts(ValorVariavelContext.class);
		}
		public ValorVariavelContext valorVariavel(int i) {
			return getRuleContext(ValorVariavelContext.class,i);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoVariavel(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavel);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				empty();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(VAR);
				setState(66);
				valorVariavel();
				setState(67);
				match(T__0);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFICADOR) {
					{
					{
					setState(68);
					valorVariavel();
					setState(69);
					match(T__0);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorVariavelContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(MiniPascalParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(MiniPascalParser.IDENTIFICADOR, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ValorVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterValorVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitValorVariavel(this);
		}
	}

	public final ValorVariavelContext valorVariavel() throws RecognitionException {
		ValorVariavelContext _localctx = new ValorVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valorVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IDENTIFICADOR);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(79);
				match(T__1);
				setState(80);
				match(IDENTIFICADOR);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__2);
			setState(87);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TipoVetorContext tipoVetor() {
			return getRuleContext(TipoVetorContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INTEGER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				tipoSimples();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				tipoVetor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoVetorContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TamanhoIndiceContext tamanhoIndice() {
			return getRuleContext(TamanhoIndiceContext.class,0);
		}
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TipoVetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoVetor(this);
		}
	}

	public final TipoVetorContext tipoVetor() throws RecognitionException {
		TipoVetorContext _localctx = new TipoVetorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoVetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ARRAY);
			setState(94);
			match(T__3);
			setState(95);
			tamanhoIndice();
			setState(96);
			match(T__4);
			setState(97);
			match(OF);
			setState(98);
			tipoSimples();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TamanhoIndiceContext extends ParserRuleContext {
		public List<TerminalNode> CONSTANTEINTEIRA() { return getTokens(MiniPascalParser.CONSTANTEINTEIRA); }
		public TerminalNode CONSTANTEINTEIRA(int i) {
			return getToken(MiniPascalParser.CONSTANTEINTEIRA, i);
		}
		public TamanhoIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanhoIndice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTamanhoIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTamanhoIndice(this);
		}
	}

	public final TamanhoIndiceContext tamanhoIndice() throws RecognitionException {
		TamanhoIndiceContext _localctx = new TamanhoIndiceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tamanhoIndice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONSTANTEINTEIRA);
			setState(101);
			match(T__5);
			setState(102);
			match(CONSTANTEINTEIRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoSimplesContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MiniPascalParser.CHAR, 0); }
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public TipoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTipoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTipoSimples(this);
		}
	}

	public final TipoSimplesContext tipoSimples() throws RecognitionException {
		TipoSimplesContext _localctx = new TipoSimplesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipoSimples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INTEGER) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoCompostaContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public DeclaracaoCompostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoComposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoComposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoComposta(this);
		}
	}

	public final DeclaracaoCompostaContext declaracaoComposta() throws RecognitionException {
		DeclaracaoCompostaContext _localctx = new DeclaracaoCompostaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoComposta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(BEGIN);
			setState(107);
			declaracao();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(108);
				match(T__0);
				setState(109);
				declaracao();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoSimplesContext declaracaoSimples() {
			return getRuleContext(DeclaracaoSimplesContext.class,0);
		}
		public DeclaracaoEstruturalContext declaracaoEstrutural() {
			return getRuleContext(DeclaracaoEstruturalContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				declaracaoSimples();
				}
				break;
			case IF:
			case WHILE:
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				declaracaoEstrutural();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoSimplesContext extends ParserRuleContext {
		public DeclaracaoAtributoContext declaracaoAtributo() {
			return getRuleContext(DeclaracaoAtributoContext.class,0);
		}
		public DeclaracaoReadContext declaracaoRead() {
			return getRuleContext(DeclaracaoReadContext.class,0);
		}
		public DeclaracaoWriteContext declaracaoWrite() {
			return getRuleContext(DeclaracaoWriteContext.class,0);
		}
		public DeclaracaoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoSimples(this);
		}
	}

	public final DeclaracaoSimplesContext declaracaoSimples() throws RecognitionException {
		DeclaracaoSimplesContext _localctx = new DeclaracaoSimplesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracaoSimples);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				declaracaoAtributo();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				declaracaoRead();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				declaracaoWrite();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoAtributoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoAtributo(this);
		}
	}

	public final DeclaracaoAtributoContext declaracaoAtributo() throws RecognitionException {
		DeclaracaoAtributoContext _localctx = new DeclaracaoAtributoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			variavel();
			setState(127);
			match(T__6);
			setState(128);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DeclaracaoReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoRead(this);
		}
	}

	public final DeclaracaoReadContext declaracaoRead() throws RecognitionException {
		DeclaracaoReadContext _localctx = new DeclaracaoReadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracaoRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(READ);
			setState(131);
			match(T__7);
			setState(132);
			variavel();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(133);
				match(T__1);
				setState(134);
				variavel();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoWriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DeclaracaoWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoWrite(this);
		}
	}

	public final DeclaracaoWriteContext declaracaoWrite() throws RecognitionException {
		DeclaracaoWriteContext _localctx = new DeclaracaoWriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracaoWrite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WRITE);
			setState(143);
			match(T__7);
			setState(144);
			variavel();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(145);
				match(T__1);
				setState(146);
				variavel();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoEstruturalContext extends ParserRuleContext {
		public DeclaracaoCompostaContext declaracaoComposta() {
			return getRuleContext(DeclaracaoCompostaContext.class,0);
		}
		public DeclaracaoIfContext declaracaoIf() {
			return getRuleContext(DeclaracaoIfContext.class,0);
		}
		public DeclaracaoWhileContext declaracaoWhile() {
			return getRuleContext(DeclaracaoWhileContext.class,0);
		}
		public DeclaracaoEstruturalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEstrutural; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoEstrutural(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoEstrutural(this);
		}
	}

	public final DeclaracaoEstruturalContext declaracaoEstrutural() throws RecognitionException {
		DeclaracaoEstruturalContext _localctx = new DeclaracaoEstruturalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoEstrutural);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				declaracaoComposta();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				declaracaoIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				declaracaoWhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public DeclaracaoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoIf(this);
		}
	}

	public final DeclaracaoIfContext declaracaoIf() throws RecognitionException {
		DeclaracaoIfContext _localctx = new DeclaracaoIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracaoIf);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IF);
				setState(160);
				expressao();
				setState(161);
				match(THEN);
				setState(162);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IF);
				setState(165);
				expressao();
				setState(166);
				match(THEN);
				setState(167);
				declaracao();
				setState(168);
				match(ELSE);
				setState(169);
				declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracaoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterDeclaracaoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitDeclaracaoWhile(this);
		}
	}

	public final DeclaracaoWhileContext declaracaoWhile() throws RecognitionException {
		DeclaracaoWhileContext _localctx = new DeclaracaoWhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaracaoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(WHILE);
			setState(174);
			expressao();
			setState(175);
			match(DO);
			setState(176);
			declaracao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<ExpressaoSimplesContext> expressaoSimples() {
			return getRuleContexts(ExpressaoSimplesContext.class);
		}
		public ExpressaoSimplesContext expressaoSimples(int i) {
			return getRuleContext(ExpressaoSimplesContext.class,i);
		}
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				expressaoSimples();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				expressaoSimples();
				setState(180);
				operadorRelacional();
				setState(181);
				expressaoSimples();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoSimplesContext extends ParserRuleContext {
		public SinalContext sinal() {
			return getRuleContext(SinalContext.class,0);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<OperadorAditivoContext> operadorAditivo() {
			return getRuleContexts(OperadorAditivoContext.class);
		}
		public OperadorAditivoContext operadorAditivo(int i) {
			return getRuleContext(OperadorAditivoContext.class,i);
		}
		public ExpressaoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpressaoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpressaoSimples(this);
		}
	}

	public final ExpressaoSimplesContext expressaoSimples() throws RecognitionException {
		ExpressaoSimplesContext _localctx = new ExpressaoSimplesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoSimples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			sinal();
			setState(186);
			termo();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16) {
				{
				{
				setState(187);
				operadorAditivo();
				setState(188);
				termo();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<OperadorMultiplicativoContext> operadorMultiplicativo() {
			return getRuleContexts(OperadorMultiplicativoContext.class);
		}
		public OperadorMultiplicativoContext operadorMultiplicativo(int i) {
			return getRuleContext(OperadorMultiplicativoContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			fator();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==DIV) {
				{
				{
				setState(196);
				operadorMultiplicativo();
				setState(197);
				fator();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public DeclaracaoCompostaContext declaracaoComposta() {
			return getRuleContext(DeclaracaoCompostaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fator);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				variavel();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				declaracaoComposta();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__7);
				setState(207);
				expressao();
				setState(208);
				match(T__8);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(NOT);
				setState(211);
				fator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadorRelacional(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << OR) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinalContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public SinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSinal(this);
		}
	}

	public final SinalContext sinal() throws RecognitionException {
		SinalContext _localctx = new SinalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sinal);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__16);
				}
				break;
			case T__7:
			case IDENTIFICADOR:
			case NOT:
			case BEGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				empty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorAditivoContext extends ParserRuleContext {
		public OperadorAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadorAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadorAditivo(this);
		}
	}

	public final OperadorAditivoContext operadorAditivo() throws RecognitionException {
		OperadorAditivoContext _localctx = new OperadorAditivoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operadorAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorMultiplicativoContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public OperadorMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterOperadorMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitOperadorMultiplicativo(this);
		}
	}

	public final OperadorMultiplicativoContext operadorMultiplicativo() throws RecognitionException {
		OperadorMultiplicativoContext _localctx = new OperadorMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operadorMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MiniPascalParser.IDENTIFICADOR, 0); }
		public VariavelAnexadaContext variavelAnexada() {
			return getRuleContext(VariavelAnexadaContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variavel);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				variavelAnexada();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelAnexadaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MiniPascalParser.IDENTIFICADOR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelAnexadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelAnexada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariavelAnexada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariavelAnexada(this);
		}
	}

	public final VariavelAnexadaContext variavelAnexada() throws RecognitionException {
		VariavelAnexadaContext _localctx = new VariavelAnexadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variavelAnexada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFICADOR);
			setState(230);
			match(T__3);
			setState(231);
			expressao();
			setState(232);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitEmpty(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\5\3"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nq\n\n\f"+
		"\n\16\nt\13\n\3\n\3\n\3\13\3\13\5\13z\n\13\3\f\3\f\3\f\5\f\177\n\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u008a\n\16\f\16\16\16\u008d"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u00a0\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00ba\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\25\3\25\3\25\3\25\7\25"+
		"\u00ca\n\25\f\25\16\25\u00cd\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00d7\n\26\3\27\3\27\3\30\3\30\3\30\5\30\u00de\n\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\5\33\u00e6\n\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\6\3\2\63\65\4\2\f\21\37 \3\2\22\23\4\2\24\24\36\36\2\u00e8\2"+
		":\3\2\2\2\4?\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16f\3"+
		"\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2"+
		"\2\32\u0084\3\2\2\2\34\u0090\3\2\2\2\36\u009f\3\2\2\2 \u00ad\3\2\2\2\""+
		"\u00af\3\2\2\2$\u00b9\3\2\2\2&\u00bb\3\2\2\2(\u00c5\3\2\2\2*\u00d6\3\2"+
		"\2\2,\u00d8\3\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2\62\u00e1\3\2\2\2\64"+
		"\u00e5\3\2\2\2\66\u00e7\3\2\2\28\u00ec\3\2\2\2:;\7\60\2\2;<\7\26\2\2<"+
		"=\7\3\2\2=>\5\4\3\2>\3\3\2\2\2?@\5\6\4\2@A\5\22\n\2A\5\3\2\2\2BO\58\35"+
		"\2CD\7,\2\2DE\5\b\5\2EK\7\3\2\2FG\5\b\5\2GH\7\3\2\2HJ\3\2\2\2IF\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NB\3\2\2\2NC\3\2\2"+
		"\2O\7\3\2\2\2PU\7\26\2\2QR\7\4\2\2RT\7\26\2\2SQ\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\5\2\2YZ\5\n\6\2Z\t\3\2\2\2[^"+
		"\5\20\t\2\\^\5\f\7\2][\3\2\2\2]\\\3\2\2\2^\13\3\2\2\2_`\7-\2\2`a\7\6\2"+
		"\2ab\5\16\b\2bc\7\7\2\2cd\7%\2\2de\5\20\t\2e\r\3\2\2\2fg\7\30\2\2gh\7"+
		"\b\2\2hi\7\30\2\2i\17\3\2\2\2jk\t\2\2\2k\21\3\2\2\2lm\7(\2\2mr\5\24\13"+
		"\2no\7\3\2\2oq\5\24\13\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tr\3\2\2\2uv\7)\2\2v\23\3\2\2\2wz\5\26\f\2xz\5\36\20\2yw\3\2\2\2y"+
		"x\3\2\2\2z\25\3\2\2\2{\177\5\30\r\2|\177\5\32\16\2}\177\5\34\17\2~{\3"+
		"\2\2\2~|\3\2\2\2~}\3\2\2\2\177\27\3\2\2\2\u0080\u0081\5\64\33\2\u0081"+
		"\u0082\7\t\2\2\u0082\u0083\5$\23\2\u0083\31\3\2\2\2\u0084\u0085\7*\2\2"+
		"\u0085\u0086\7\n\2\2\u0086\u008b\5\64\33\2\u0087\u0088\7\4\2\2\u0088\u008a"+
		"\5\64\33\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7\13\2\2\u008f\33\3\2\2\2\u0090\u0091\7+\2\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0097\5\64\33\2\u0093\u0094\7\4\2\2\u0094\u0096\5\64\33\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\13\2\2\u009b\35\3\2\2"+
		"\2\u009c\u00a0\5\22\n\2\u009d\u00a0\5 \21\2\u009e\u00a0\5\"\22\2\u009f"+
		"\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\37\3\2\2"+
		"\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7#\2\2\u00a4\u00a5"+
		"\5\24\13\2\u00a5\u00ae\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\5$\23\2"+
		"\u00a8\u00a9\7#\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7$\2\2\u00ab\u00ac"+
		"\5\24\13\2\u00ac\u00ae\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad\u00a6\3\2\2\2"+
		"\u00ae!\3\2\2\2\u00af\u00b0\7&\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\'"+
		"\2\2\u00b2\u00b3\5\24\13\2\u00b3#\3\2\2\2\u00b4\u00ba\5&\24\2\u00b5\u00b6"+
		"\5&\24\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\5&\24\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba%\3\2\2\2\u00bb\u00bc\5.\30\2"+
		"\u00bc\u00c2\5(\25\2\u00bd\u00be\5\60\31\2\u00be\u00bf\5(\25\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\'\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00cb\5*\26\2"+
		"\u00c6\u00c7\5\62\32\2\u00c7\u00c8\5*\26\2\u00c8\u00ca\3\2\2\2\u00c9\u00c6"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		")\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d7\5\64\33\2\u00cf\u00d7\5\22\n"+
		"\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\u00d7\3\2\2\2\u00d4\u00d5\7!\2\2\u00d5\u00d7\5*\26\2\u00d6\u00ce\3\2"+
		"\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"+\3\2\2\2\u00d8\u00d9\t\3\2\2\u00d9-\3\2\2\2\u00da\u00de\7\22\2\2\u00db"+
		"\u00de\7\23\2\2\u00dc\u00de\58\35\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de/\3\2\2\2\u00df\u00e0\t\4\2\2\u00e0\61"+
		"\3\2\2\2\u00e1\u00e2\t\5\2\2\u00e2\63\3\2\2\2\u00e3\u00e6\7\26\2\2\u00e4"+
		"\u00e6\5\66\34\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\65\3\2"+
		"\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\5$\23\2\u00ea"+
		"\u00eb\7\7\2\2\u00eb\67\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed9\3\2\2\2\23"+
		"KNU]ry~\u008b\u0097\u009f\u00ad\u00b9\u00c2\u00cb\u00d6\u00dd\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}