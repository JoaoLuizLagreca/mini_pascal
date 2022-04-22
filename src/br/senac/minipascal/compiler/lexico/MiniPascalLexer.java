// Generated from src/MiniPascal.g4 by ANTLR 4.9.3
package br.senac.minipascal.compiler.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Digito=19, Letra=20, Frase=21, WS=22, OR=23, DIV=24, AND=25, 
		NOT=26, BEGIN=27, END=28, IF=29, THEN=30, ELSE=31, WHILE=32, DO=33, PROCEDURE=34, 
		VAR=35, PROGRAM=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "Digito", "Letra", "Frase", "WS", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z", "OR", "DIV", "AND", "NOT", "BEGIN", "END", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "PROCEDURE", "VAR", "PROGRAM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "','", "'('", "')'", "'['", "']'", "':'", "':='", 
			"'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Digito", "Letra", "Frase", 
			"WS", "OR", "DIV", "AND", "NOT", "BEGIN", "END", "IF", "THEN", "ELSE", 
			"WHILE", "DO", "PROCEDURE", "VAR", "PROGRAM"
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


	public MiniPascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u00ab"+
		"\n\25\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\26\3\26\3\26"+
		"\7\26\u00b7\n\26\f\26\16\26\u00ba\13\26\3\26\5\26\u00bd\n\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;"+
		"\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W"+
		"\2Y\2[\2]\2_\2a\2c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\3\2!\3\2"+
		"\62;\5\2C\\aac|\4\2$$>>\4\2))>>\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0131\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177"+
		"\3\2\2\2\5\u0081\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2"+
		"\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2"+
		"\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2"+
		"\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a5"+
		"\3\2\2\2\'\u00a7\3\2\2\2)\u00aa\3\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2"+
		"/\u00c2\3\2\2\2\61\u00c4\3\2\2\2\63\u00c6\3\2\2\2\65\u00c8\3\2\2\2\67"+
		"\u00ca\3\2\2\29\u00cc\3\2\2\2;\u00ce\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2"+
		"\2\2A\u00d4\3\2\2\2C\u00d6\3\2\2\2E\u00d8\3\2\2\2G\u00da\3\2\2\2I\u00dc"+
		"\3\2\2\2K\u00de\3\2\2\2M\u00e0\3\2\2\2O\u00e2\3\2\2\2Q\u00e4\3\2\2\2S"+
		"\u00e6\3\2\2\2U\u00e8\3\2\2\2W\u00ea\3\2\2\2Y\u00ec\3\2\2\2[\u00ee\3\2"+
		"\2\2]\u00f0\3\2\2\2_\u00f2\3\2\2\2a\u00f4\3\2\2\2c\u00f6\3\2\2\2e\u00fa"+
		"\3\2\2\2g\u00ff\3\2\2\2i\u0104\3\2\2\2k\u0109\3\2\2\2m\u0110\3\2\2\2o"+
		"\u0115\3\2\2\2q\u0119\3\2\2\2s\u011f\3\2\2\2u\u0125\3\2\2\2w\u012c\3\2"+
		"\2\2y\u0130\3\2\2\2{\u013b\3\2\2\2}\u0140\3\2\2\2\177\u0080\7=\2\2\u0080"+
		"\4\3\2\2\2\u0081\u0082\7\60\2\2\u0082\6\3\2\2\2\u0083\u0084\7.\2\2\u0084"+
		"\b\3\2\2\2\u0085\u0086\7*\2\2\u0086\n\3\2\2\2\u0087\u0088\7+\2\2\u0088"+
		"\f\3\2\2\2\u0089\u008a\7]\2\2\u008a\16\3\2\2\2\u008b\u008c\7_\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7<\2\2\u008e\22\3\2\2\2\u008f\u0090\7<\2\2\u0090"+
		"\u0091\7?\2\2\u0091\24\3\2\2\2\u0092\u0093\7?\2\2\u0093\26\3\2\2\2\u0094"+
		"\u0095\7>\2\2\u0095\u0096\7@\2\2\u0096\30\3\2\2\2\u0097\u0098\7>\2\2\u0098"+
		"\32\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\34\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e\36\3\2\2\2\u009f\u00a0\7@\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6&\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8"+
		"(\3\2\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab*\3\2\2\2\u00ac"+
		"\u00b0\7$\2\2\u00ad\u00af\n\4\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00bd\7$\2\2\u00b4\u00b8\7)\2\2\u00b5\u00b7\n\5\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7)\2\2\u00bc"+
		"\u00ac\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bd,\3\2\2\2\u00be\u00bf\t\6\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\27\2\2\u00c1.\3\2\2\2\u00c2\u00c3\t"+
		"\7\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5\62\3\2\2\2\u00c6\u00c7"+
		"\t\t\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\t\n\2\2\u00c9\66\3\2\2\2\u00ca\u00cb"+
		"\t\13\2\2\u00cb8\3\2\2\2\u00cc\u00cd\t\f\2\2\u00cd:\3\2\2\2\u00ce\u00cf"+
		"\t\r\2\2\u00cf<\3\2\2\2\u00d0\u00d1\t\16\2\2\u00d1>\3\2\2\2\u00d2\u00d3"+
		"\t\17\2\2\u00d3@\3\2\2\2\u00d4\u00d5\t\20\2\2\u00d5B\3\2\2\2\u00d6\u00d7"+
		"\t\21\2\2\u00d7D\3\2\2\2\u00d8\u00d9\t\22\2\2\u00d9F\3\2\2\2\u00da\u00db"+
		"\t\23\2\2\u00dbH\3\2\2\2\u00dc\u00dd\t\24\2\2\u00ddJ\3\2\2\2\u00de\u00df"+
		"\t\25\2\2\u00dfL\3\2\2\2\u00e0\u00e1\t\26\2\2\u00e1N\3\2\2\2\u00e2\u00e3"+
		"\t\27\2\2\u00e3P\3\2\2\2\u00e4\u00e5\t\30\2\2\u00e5R\3\2\2\2\u00e6\u00e7"+
		"\t\31\2\2\u00e7T\3\2\2\2\u00e8\u00e9\t\32\2\2\u00e9V\3\2\2\2\u00ea\u00eb"+
		"\t\33\2\2\u00ebX\3\2\2\2\u00ec\u00ed\t\34\2\2\u00edZ\3\2\2\2\u00ee\u00ef"+
		"\t\35\2\2\u00ef\\\3\2\2\2\u00f0\u00f1\t\36\2\2\u00f1^\3\2\2\2\u00f2\u00f3"+
		"\t\37\2\2\u00f3`\3\2\2\2\u00f4\u00f5\t \2\2\u00f5b\3\2\2\2\u00f6\u00f7"+
		"\5-\27\2\u00f7\u00f8\5K&\2\u00f8\u00f9\5Q)\2\u00f9d\3\2\2\2\u00fa\u00fb"+
		"\5-\27\2\u00fb\u00fc\5\65\33\2\u00fc\u00fd\5? \2\u00fd\u00fe\5Y-\2\u00fe"+
		"f\3\2\2\2\u00ff\u0100\5-\27\2\u0100\u0101\5/\30\2\u0101\u0102\5I%\2\u0102"+
		"\u0103\5\65\33\2\u0103h\3\2\2\2\u0104\u0105\5-\27\2\u0105\u0106\5I%\2"+
		"\u0106\u0107\5K&\2\u0107\u0108\5U+\2\u0108j\3\2\2\2\u0109\u010a\5-\27"+
		"\2\u010a\u010b\5\61\31\2\u010b\u010c\5\67\34\2\u010c\u010d\5;\36\2\u010d"+
		"\u010e\5? \2\u010e\u010f\5I%\2\u010fl\3\2\2\2\u0110\u0111\5-\27\2\u0111"+
		"\u0112\5\67\34\2\u0112\u0113\5I%\2\u0113\u0114\5\65\33\2\u0114n\3\2\2"+
		"\2\u0115\u0116\5-\27\2\u0116\u0117\5? \2\u0117\u0118\59\35\2\u0118p\3"+
		"\2\2\2\u0119\u011a\5-\27\2\u011a\u011b\5U+\2\u011b\u011c\5=\37\2\u011c"+
		"\u011d\5\67\34\2\u011d\u011e\5I%\2\u011er\3\2\2\2\u011f\u0120\5-\27\2"+
		"\u0120\u0121\5\67\34\2\u0121\u0122\5E#\2\u0122\u0123\5S*\2\u0123\u0124"+
		"\5\67\34\2\u0124t\3\2\2\2\u0125\u0126\5-\27\2\u0126\u0127\5[.\2\u0127"+
		"\u0128\5=\37\2\u0128\u0129\5? \2\u0129\u012a\5E#\2\u012a\u012b\5\67\34"+
		"\2\u012bv\3\2\2\2\u012c\u012d\5-\27\2\u012d\u012e\5\65\33\2\u012e\u012f"+
		"\5K&\2\u012fx\3\2\2\2\u0130\u0131\5-\27\2\u0131\u0132\5M\'\2\u0132\u0133"+
		"\5Q)\2\u0133\u0134\5K&\2\u0134\u0135\5\63\32\2\u0135\u0136\5\67\34\2\u0136"+
		"\u0137\5\65\33\2\u0137\u0138\5W,\2\u0138\u0139\5Q)\2\u0139\u013a\5\67"+
		"\34\2\u013az\3\2\2\2\u013b\u013c\5-\27\2\u013c\u013d\5Y-\2\u013d\u013e"+
		"\5/\30\2\u013e\u013f\5Q)\2\u013f|\3\2\2\2\u0140\u0141\5M\'\2\u0141\u0142"+
		"\5Q)\2\u0142\u0143\5K&\2\u0143\u0144\5;\36\2\u0144\u0145\5Q)\2\u0145\u0146"+
		"\5/\30\2\u0146\u0147\5G$\2\u0147\u0148\5-\27\2\u0148~\3\2\2\2\7\2\u00aa"+
		"\u00b0\u00b8\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}