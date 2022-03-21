// Generated from src/pascal_lexico.g4 by ANTLR 4.9.3
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
		T__17=18, CONSTANTE=19, IDENTIFICADOR=20, LETRAOUDIGITO=21, CONSTANTEINTEIRA=22, 
		CONSTANTECARACTERE=23, LETRA=24, DIGITO=25, SIMBOLOESPECIAL=26, WS=27, 
		DIV=28, OR=29, AND=30, NOT=31, IF=32, THEN=33, ELSE=34, OF=35, WHILE=36, 
		DO=37, BEGIN=38, END=39, READ=40, WRITE=41, VAR=42, ARRAY=43, FUNCTION=44, 
		PROCEDURE=45, PROGRAM=46, TRUE=47, FALSE=48, CHAR=49, INTEGER=50, BOOLEAN=51;
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
			"T__17", "CONSTANTE", "IDENTIFICADOR", "LETRAOUDIGITO", "CONSTANTEINTEIRA", 
			"CONSTANTECARACTERE", "LETRA", "DIGITO", "SIMBOLOESPECIAL", "WS", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "DIV", "OR", "AND", 
			"NOT", "IF", "THEN", "ELSE", "OF", "WHILE", "DO", "BEGIN", "END", "READ", 
			"WRITE", "VAR", "ARRAY", "FUNCTION", "PROCEDURE", "PROGRAM", "TRUE", 
			"FALSE", "CHAR", "INTEGER", "BOOLEAN"
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


	public MiniPascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascal_lexico.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01e0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\5\24\u00ca\n\24\3\25\3\25\7\25\u00ce\n\25\f\25\16"+
		"\25\u00d1\13\25\3\26\3\26\5\26\u00d5\n\26\3\27\3\27\7\27\u00d9\n\27\f"+
		"\27\16\27\u00dc\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00e5\n"+
		"\30\f\30\16\30\u00e8\13\30\3\30\3\30\5\30\u00ec\n\30\3\31\5\31\u00ef\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u00fc"+
		"\n\33\f\33\16\33\u00ff\13\33\3\33\3\33\7\33\u0103\n\33\f\33\16\33\u0106"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0125\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\39\3"+
		"9\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\2\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2"+
		"]\2_\2a\2c\2e\2g\2i\2k\2m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085"+
		"*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097"+
		"\63\u0099\64\u009b\65\3\2\"\4\2C\\c|\3\2\62;\5\2,-//??\4\2>>@@\5\2..\60"+
		"\60<=\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2H"+
		"Hhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a1\3\2\2\2\t\u00a3\3\2\2\2\13"+
		"\u00a5\3\2\2\2\r\u00a7\3\2\2\2\17\u00aa\3\2\2\2\21\u00ad\3\2\2\2\23\u00af"+
		"\3\2\2\2\25\u00b1\3\2\2\2\27\u00b3\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3"+
		"\2\2\2\35\u00bb\3\2\2\2\37\u00be\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2"+
		"%\u00c4\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00d4\3\2\2\2-\u00d6\3"+
		"\2\2\2/\u00eb\3\2\2\2\61\u00ee\3\2\2\2\63\u00f0\3\2\2\2\65\u0124\3\2\2"+
		"\2\67\u0126\3\2\2\29\u012a\3\2\2\2;\u012c\3\2\2\2=\u012e\3\2\2\2?\u0130"+
		"\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I"+
		"\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2\2\2Q\u0142\3\2"+
		"\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014c"+
		"\3\2\2\2]\u014e\3\2\2\2_\u0150\3\2\2\2a\u0152\3\2\2\2c\u0154\3\2\2\2e"+
		"\u0156\3\2\2\2g\u0158\3\2\2\2i\u015a\3\2\2\2k\u015c\3\2\2\2m\u015e\3\2"+
		"\2\2o\u0162\3\2\2\2q\u0165\3\2\2\2s\u0169\3\2\2\2u\u016d\3\2\2\2w\u0170"+
		"\3\2\2\2y\u0175\3\2\2\2{\u017a\3\2\2\2}\u017d\3\2\2\2\177\u0183\3\2\2"+
		"\2\u0081\u0186\3\2\2\2\u0083\u018c\3\2\2\2\u0085\u0190\3\2\2\2\u0087\u0195"+
		"\3\2\2\2\u0089\u019b\3\2\2\2\u008b\u019f\3\2\2\2\u008d\u01a5\3\2\2\2\u008f"+
		"\u01ae\3\2\2\2\u0091\u01b8\3\2\2\2\u0093\u01c0\3\2\2\2\u0095\u01c5\3\2"+
		"\2\2\u0097\u01cb\3\2\2\2\u0099\u01d0\3\2\2\2\u009b\u01d8\3\2\2\2\u009d"+
		"\u009e\7=\2\2\u009e\4\3\2\2\2\u009f\u00a0\7.\2\2\u00a0\6\3\2\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4\n\3\2\2\2\u00a5"+
		"\u00a6\7_\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\7\60\2"+
		"\2\u00a9\16\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ac\7?\2\2\u00ac\20\3\2"+
		"\2\2\u00ad\u00ae\7*\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7+\2\2\u00b0\24\3"+
		"\2\2\2\u00b1\u00b2\7?\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5"+
		"\7@\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\32\3\2\2\2\u00b8\u00b9"+
		"\7>\2\2\u00b9\u00ba\7?\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7@\2\2\u00bf \3\2\2\2\u00c0\u00c1"+
		"\7-\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3$\3\2\2\2\u00c4\u00c5"+
		"\7,\2\2\u00c5&\3\2\2\2\u00c6\u00ca\5-\27\2\u00c7\u00ca\5/\30\2\u00c8\u00ca"+
		"\5)\25\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"(\3\2\2\2\u00cb\u00cf\5\61\31\2\u00cc\u00ce\5+\26\2\u00cd\u00cc\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0*"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\5\61\31\2\u00d3\u00d5\5\63\32"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5,\3\2\2\2\u00d6\u00da"+
		"\5\63\32\2\u00d7\u00d9\5\63\32\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db.\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\5+\26\2\u00df\u00e0\7)\2\2\u00e0"+
		"\u00ec\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2\u00e6\5+\26\2\u00e3\u00e5\5+\26"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7$\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e1\3\2\2\2\u00ec\60\3\2\2"+
		"\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\62\3\2\2\2\u00f0\u00f1"+
		"\t\3\2\2\u00f1\64\3\2\2\2\u00f2\u0125\t\4\2\2\u00f3\u00f4\7>\2\2\u00f4"+
		"\u0125\7@\2\2\u00f5\u0125\t\5\2\2\u00f6\u00f7\7>\2\2\u00f7\u0125\7?\2"+
		"\2\u00f8\u00f9\7@\2\2\u00f9\u0125\7?\2\2\u00fa\u00fc\7~\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\7~\2\2\u0101\u0103\7~\2"+
		"\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0125\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7<\2\2\u0108"+
		"\u0125\7?\2\2\u0109\u0125\t\6\2\2\u010a\u010b\7\60\2\2\u010b\u0125\7\60"+
		"\2\2\u010c\u0125\5m\67\2\u010d\u0125\5o8\2\u010e\u0125\5q9\2\u010f\u0125"+
		"\5s:\2\u0110\u0125\5u;\2\u0111\u0125\5w<\2\u0112\u0125\5y=\2\u0113\u0125"+
		"\5{>\2\u0114\u0125\5}?\2\u0115\u0125\5\177@\2\u0116\u0125\5\u0081A\2\u0117"+
		"\u0125\5\u0083B\2\u0118\u0125\5\u0085C\2\u0119\u0125\5\u0087D\2\u011a"+
		"\u0125\5\u0089E\2\u011b\u0125\5\u008bF\2\u011c\u0125\5\u008dG\2\u011d"+
		"\u0125\5\u008fH\2\u011e\u0125\5\u0091I\2\u011f\u0125\5\u0093J\2\u0120"+
		"\u0125\5\u0095K\2\u0121\u0125\5\u0097L\2\u0122\u0125\5\u0099M\2\u0123"+
		"\u0125\5\u009bN\2\u0124\u00f2\3\2\2\2\u0124\u00f3\3\2\2\2\u0124\u00f5"+
		"\3\2\2\2\u0124\u00f6\3\2\2\2\u0124\u00f8\3\2\2\2\u0124\u00fd\3\2\2\2\u0124"+
		"\u0107\3\2\2\2\u0124\u0109\3\2\2\2\u0124\u010a\3\2\2\2\u0124\u010c\3\2"+
		"\2\2\u0124\u010d\3\2\2\2\u0124\u010e\3\2\2\2\u0124\u010f\3\2\2\2\u0124"+
		"\u0110\3\2\2\2\u0124\u0111\3\2\2\2\u0124\u0112\3\2\2\2\u0124\u0113\3\2"+
		"\2\2\u0124\u0114\3\2\2\2\u0124\u0115\3\2\2\2\u0124\u0116\3\2\2\2\u0124"+
		"\u0117\3\2\2\2\u0124\u0118\3\2\2\2\u0124\u0119\3\2\2\2\u0124\u011a\3\2"+
		"\2\2\u0124\u011b\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011d\3\2\2\2\u0124"+
		"\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\66\3\2\2\2\u0126\u0127"+
		"\t\7\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\34\2\2\u01298\3\2\2\2\u012a"+
		"\u012b\t\b\2\2\u012b:\3\2\2\2\u012c\u012d\t\t\2\2\u012d<\3\2\2\2\u012e"+
		"\u012f\t\n\2\2\u012f>\3\2\2\2\u0130\u0131\t\13\2\2\u0131@\3\2\2\2\u0132"+
		"\u0133\t\f\2\2\u0133B\3\2\2\2\u0134\u0135\t\r\2\2\u0135D\3\2\2\2\u0136"+
		"\u0137\t\16\2\2\u0137F\3\2\2\2\u0138\u0139\t\17\2\2\u0139H\3\2\2\2\u013a"+
		"\u013b\t\20\2\2\u013bJ\3\2\2\2\u013c\u013d\t\21\2\2\u013dL\3\2\2\2\u013e"+
		"\u013f\t\22\2\2\u013fN\3\2\2\2\u0140\u0141\t\23\2\2\u0141P\3\2\2\2\u0142"+
		"\u0143\t\24\2\2\u0143R\3\2\2\2\u0144\u0145\t\25\2\2\u0145T\3\2\2\2\u0146"+
		"\u0147\t\26\2\2\u0147V\3\2\2\2\u0148\u0149\t\27\2\2\u0149X\3\2\2\2\u014a"+
		"\u014b\t\30\2\2\u014bZ\3\2\2\2\u014c\u014d\t\31\2\2\u014d\\\3\2\2\2\u014e"+
		"\u014f\t\32\2\2\u014f^\3\2\2\2\u0150\u0151\t\33\2\2\u0151`\3\2\2\2\u0152"+
		"\u0153\t\34\2\2\u0153b\3\2\2\2\u0154\u0155\t\35\2\2\u0155d\3\2\2\2\u0156"+
		"\u0157\t\36\2\2\u0157f\3\2\2\2\u0158\u0159\t\37\2\2\u0159h\3\2\2\2\u015a"+
		"\u015b\t \2\2\u015bj\3\2\2\2\u015c\u015d\t!\2\2\u015dl\3\2\2\2\u015e\u015f"+
		"\5? \2\u015f\u0160\5I%\2\u0160\u0161\5c\62\2\u0161n\3\2\2\2\u0162\u0163"+
		"\5U+\2\u0163\u0164\5[.\2\u0164p\3\2\2\2\u0165\u0166\59\35\2\u0166\u0167"+
		"\5S*\2\u0167\u0168\5? \2\u0168r\3\2\2\2\u0169\u016a\5S*\2\u016a\u016b"+
		"\5U+\2\u016b\u016c\5_\60\2\u016ct\3\2\2\2\u016d\u016e\5I%\2\u016e\u016f"+
		"\5C\"\2\u016fv\3\2\2\2\u0170\u0171\5_\60\2\u0171\u0172\5G$\2\u0172\u0173"+
		"\5A!\2\u0173\u0174\5S*\2\u0174x\3\2\2\2\u0175\u0176\5A!\2\u0176\u0177"+
		"\5O(\2\u0177\u0178\5]/\2\u0178\u0179\5A!\2\u0179z\3\2\2\2\u017a\u017b"+
		"\5U+\2\u017b\u017c\5C\"\2\u017c|\3\2\2\2\u017d\u017e\5e\63\2\u017e\u017f"+
		"\5G$\2\u017f\u0180\5I%\2\u0180\u0181\5O(\2\u0181\u0182\5A!\2\u0182~\3"+
		"\2\2\2\u0183\u0184\5? \2\u0184\u0185\5U+\2\u0185\u0080\3\2\2\2\u0186\u0187"+
		"\5;\36\2\u0187\u0188\5A!\2\u0188\u0189\5E#\2\u0189\u018a\5I%\2\u018a\u018b"+
		"\5S*\2\u018b\u0082\3\2\2\2\u018c\u018d\5A!\2\u018d\u018e\5S*\2\u018e\u018f"+
		"\5? \2\u018f\u0084\3\2\2\2\u0190\u0191\5[.\2\u0191\u0192\5A!\2\u0192\u0193"+
		"\59\35\2\u0193\u0194\5? \2\u0194\u0086\3\2\2\2\u0195\u0196\5e\63\2\u0196"+
		"\u0197\5[.\2\u0197\u0198\5I%\2\u0198\u0199\5_\60\2\u0199\u019a\5A!\2\u019a"+
		"\u0088\3\2\2\2\u019b\u019c\5c\62\2\u019c\u019d\59\35\2\u019d\u019e\5["+
		".\2\u019e\u008a\3\2\2\2\u019f\u01a0\59\35\2\u01a0\u01a1\5[.\2\u01a1\u01a2"+
		"\5[.\2\u01a2\u01a3\59\35\2\u01a3\u01a4\5i\65\2\u01a4\u008c\3\2\2\2\u01a5"+
		"\u01a6\5C\"\2\u01a6\u01a7\5a\61\2\u01a7\u01a8\5S*\2\u01a8\u01a9\5=\37"+
		"\2\u01a9\u01aa\5_\60\2\u01aa\u01ab\5I%\2\u01ab\u01ac\5U+\2\u01ac\u01ad"+
		"\5S*\2\u01ad\u008e\3\2\2\2\u01ae\u01af\5W,\2\u01af\u01b0\5[.\2\u01b0\u01b1"+
		"\5U+\2\u01b1\u01b2\5=\37\2\u01b2\u01b3\5A!\2\u01b3\u01b4\5? \2\u01b4\u01b5"+
		"\5a\61\2\u01b5\u01b6\5[.\2\u01b6\u01b7\5A!\2\u01b7\u0090\3\2\2\2\u01b8"+
		"\u01b9\5W,\2\u01b9\u01ba\5[.\2\u01ba\u01bb\5U+\2\u01bb\u01bc\5E#\2\u01bc"+
		"\u01bd\5[.\2\u01bd\u01be\59\35\2\u01be\u01bf\5Q)\2\u01bf\u0092\3\2\2\2"+
		"\u01c0\u01c1\5_\60\2\u01c1\u01c2\5[.\2\u01c2\u01c3\5a\61\2\u01c3\u01c4"+
		"\5A!\2\u01c4\u0094\3\2\2\2\u01c5\u01c6\5C\"\2\u01c6\u01c7\59\35\2\u01c7"+
		"\u01c8\5O(\2\u01c8\u01c9\5]/\2\u01c9\u01ca\5A!\2\u01ca\u0096\3\2\2\2\u01cb"+
		"\u01cc\5=\37\2\u01cc\u01cd\5G$\2\u01cd\u01ce\59\35\2\u01ce\u01cf\5[.\2"+
		"\u01cf\u0098\3\2\2\2\u01d0\u01d1\5I%\2\u01d1\u01d2\5S*\2\u01d2\u01d3\5"+
		"_\60\2\u01d3\u01d4\5A!\2\u01d4\u01d5\5E#\2\u01d5\u01d6\5A!\2\u01d6\u01d7"+
		"\5[.\2\u01d7\u009a\3\2\2\2\u01d8\u01d9\5;\36\2\u01d9\u01da\5U+\2\u01da"+
		"\u01db\5U+\2\u01db\u01dc\5O(\2\u01dc\u01dd\5A!\2\u01dd\u01de\59\35\2\u01de"+
		"\u01df\5S*\2\u01df\u009c\3\2\2\2\r\2\u00c9\u00cf\u00d4\u00da\u00e6\u00eb"+
		"\u00ee\u00fd\u0104\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}