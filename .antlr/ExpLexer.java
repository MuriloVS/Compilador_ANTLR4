// Generated from c:\Users\mvs_r\OneDrive\Documents\GitHub\3 - Compiladores\Compilador_ANTLR4\Exp.g4 by ANTLR 4.8

    #pragma warning disable 3021

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SPACE=2, PLUS=3, MINUS=4, TIMES=5, OVER=6, REM=7, OP_PAR=8, 
		CL_PAR=9, ATTRIB=10, COMMA=11, OP_CUR=12, CL_CUR=13, EQ=14, NE=15, GT=16, 
		GE=17, LT=18, LE=19, PRINT=20, READ_INT=21, READ_STR=22, IF=23, ELSE=24, 
		WHILE=25, BREAK=26, CONTINUE=27, PUSH=28, LENGTH=29, OP_BRA=30, CL_BRA=31, 
		DOT=32, NUMBER=33, NAME=34, STRING=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
			"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "NUMBER", "NAME", 
			"STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", 
			"','", "'{'", "'}'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'print'", 
			"'read_int'", "'read_str'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
			"'push'", "'length'", "'['", "']'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SPACE", "PLUS", "MINUS", "TIMES", "OVER", "REM", "OP_PAR", 
			"CL_PAR", "ATTRIB", "COMMA", "OP_CUR", "CL_CUR", "EQ", "NE", "GT", "GE", 
			"LT", "LE", "PRINT", "READ_INT", "READ_STR", "IF", "ELSE", "WHILE", "BREAK", 
			"CONTINUE", "PUSH", "LENGTH", "OP_BRA", "CL_BRA", "DOT", "NUMBER", "NAME", 
			"STRING"
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


	public ExpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Exp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3\3\6"+
		"\3T\n\3\r\3\16\3U\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00c8"+
		"\n\"\r\"\16\"\u00c9\3#\6#\u00cd\n#\r#\16#\u00ce\3$\3$\7$\u00d3\n$\f$\16"+
		"$\u00d6\13$\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\3\2\f\f\5\2\13\f\17\17\"\"\3\2"+
		"$$\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\3I\3\2\2\2\5S\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r"+
		"_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2"+
		"\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37r\3\2\2\2!u\3\2\2\2#w\3\2\2\2%"+
		"z\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0085\3\2\2\2-\u008e\3\2\2\2/\u0097"+
		"\3\2\2\2\61\u009a\3\2\2\2\63\u009f\3\2\2\2\65\u00a5\3\2\2\2\67\u00ab\3"+
		"\2\2\29\u00b4\3\2\2\2;\u00b9\3\2\2\2=\u00c0\3\2\2\2?\u00c2\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00cc\3\2\2\2G\u00d0\3\2\2\2IM\7%\2\2JL\n\2\2"+
		"\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\2\2"+
		"\2Q\4\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2"+
		"\2\2WX\b\3\2\2X\6\3\2\2\2YZ\7-\2\2Z\b\3\2\2\2[\\\7/\2\2\\\n\3\2\2\2]^"+
		"\7,\2\2^\f\3\2\2\2_`\7\61\2\2`\16\3\2\2\2ab\7\'\2\2b\20\3\2\2\2cd\7*\2"+
		"\2d\22\3\2\2\2ef\7+\2\2f\24\3\2\2\2gh\7?\2\2h\26\3\2\2\2ij\7.\2\2j\30"+
		"\3\2\2\2kl\7}\2\2l\32\3\2\2\2mn\7\177\2\2n\34\3\2\2\2op\7?\2\2pq\7?\2"+
		"\2q\36\3\2\2\2rs\7#\2\2st\7?\2\2t \3\2\2\2uv\7@\2\2v\"\3\2\2\2wx\7@\2"+
		"\2xy\7?\2\2y$\3\2\2\2z{\7>\2\2{&\3\2\2\2|}\7>\2\2}~\7?\2\2~(\3\2\2\2\177"+
		"\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2"+
		"\u0083\u0084\7v\2\2\u0084*\3\2\2\2\u0085\u0086\7t\2\2\u0086\u0087\7g\2"+
		"\2\u0087\u0088\7c\2\2\u0088\u0089\7f\2\2\u0089\u008a\7a\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d,\3\2\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7f\2\2\u0092"+
		"\u0093\7a\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2"+
		"\u0096.\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7h\2\2\u0099\60\3\2\2\2"+
		"\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e"+
		"\7g\2\2\u009e\62\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\64\3\2\2\2\u00a5\u00a6"+
		"\7d\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7m\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2"+
		"\u00b1\u00b2\7w\2\2\u00b2\u00b3\7g\2\2\u00b38\3\2\2\2\u00b4\u00b5\7r\2"+
		"\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7j\2\2\u00b8:\3\2"+
		"\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd"+
		"\7i\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2\u00bf<\3\2\2\2\u00c0\u00c1"+
		"\7]\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7"+
		"\60\2\2\u00c5B\3\2\2\2\u00c6\u00c8\4\62;\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00caD\3\2\2\2\u00cb"+
		"\u00cd\4c|\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cfF\3\2\2\2\u00d0\u00d4\7$\2\2\u00d1\u00d3\n"+
		"\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$"+
		"\2\2\u00d8H\3\2\2\2\b\2MU\u00c9\u00ce\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}