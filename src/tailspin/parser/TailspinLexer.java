// Generated from TailspinLexer.g4 by ANTLR 4.7.2
package tailspin.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, EndIdentifier=7, 
		Range=8, Zero=9, NonZeroInteger=10, START_STRING=11, IDENTIFIER=12, WS=13, 
		StringInterpolate=14, STRING_TEXT=15, END_STRING=16;
	public static final int
		IN_STRING=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "Zero", "NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", 
			"IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringInterpolate", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'..'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", 
			"StringInterpolate", "STRING_TEXT", "END_STRING"
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


	public TailspinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TailspinLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0082\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\5\13N\n\13\3\13\3\13\5\13R\n\13\3\f"+
		"\6\fU\n\f\r\f\16\fV\3\r\3\r\3\r\3\r\3\16\3\16\7\16_\n\16\f\16\16\16b\13"+
		"\16\3\17\3\17\3\20\3\20\5\20h\n\20\3\21\6\21k\n\21\r\21\16\21l\3\21\3"+
		"\21\3\22\3\22\3\23\6\23t\n\23\r\23\16\23u\3\24\3\24\3\24\3\24\3\24\5\24"+
		"}\n\24\3\25\3\25\3\25\3\25\2\2\26\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\2\32\r\34\16\36\2 \2\"\17$\20&\21(\2*\22\4\2\3\b\5\2\13\f"+
		"\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u0086\2\4\3\2"+
		"\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20"+
		"\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3*\3\2\2\2\4,\3\2\2\2\6\63\3\2"+
		"\2\2\b9\3\2\2\2\n>\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22G\3\2"+
		"\2\2\24J\3\2\2\2\26M\3\2\2\2\30T\3\2\2\2\32X\3\2\2\2\34\\\3\2\2\2\36c"+
		"\3\2\2\2 g\3\2\2\2\"j\3\2\2\2$p\3\2\2\2&s\3\2\2\2(|\3\2\2\2*~\3\2\2\2"+
		",-\7u\2\2-.\7v\2\2./\7f\2\2/\60\7q\2\2\60\61\7w\2\2\61\62\7v\2\2\62\5"+
		"\3\2\2\2\63\64\7f\2\2\64\65\7g\2\2\65\66\7h\2\2\66\67\3\2\2\2\678\t\2"+
		"\2\28\7\3\2\2\29:\7&\2\2:<\5\34\16\2;=\7=\2\2<;\3\2\2\2<=\3\2\2\2=\t\3"+
		"\2\2\2>?\7/\2\2?@\7@\2\2@\13\3\2\2\2AB\7\f\2\2B\r\3\2\2\2CD\7<\2\2D\17"+
		"\3\2\2\2EF\7=\2\2F\21\3\2\2\2GH\7\60\2\2HI\7\60\2\2I\23\3\2\2\2JK\7\62"+
		"\2\2K\25\3\2\2\2LN\7/\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OQ\t\3\2\2PR\5"+
		"\30\f\2QP\3\2\2\2QR\3\2\2\2R\27\3\2\2\2SU\t\4\2\2TS\3\2\2\2UV\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2W\31\3\2\2\2XY\7)\2\2YZ\3\2\2\2Z[\b\r\2\2[\33\3\2"+
		"\2\2\\`\5\36\17\2]_\5 \20\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\35"+
		"\3\2\2\2b`\3\2\2\2cd\t\5\2\2d\37\3\2\2\2eh\5\36\17\2fh\t\6\2\2ge\3\2\2"+
		"\2gf\3\2\2\2h!\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mn\3\2\2\2no\b\21\3\2o#\3\2\2\2pq\5\b\4\2q%\3\2\2\2rt\5(\24\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\'\3\2\2\2wx\7)\2\2x}\7)\2\2yz\7&\2"+
		"\2z}\7&\2\2{}\n\7\2\2|w\3\2\2\2|y\3\2\2\2|{\3\2\2\2})\3\2\2\2~\177\7)"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0081\b\25\4\2\u0081+\3\2\2\2\r\2\3<MQV`"+
		"glu|\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}