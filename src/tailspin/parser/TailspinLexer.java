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
		Range=8, AdditiveOperator=9, Zero=10, NonZeroInteger=11, START_STRING=12, 
		IDENTIFIER=13, WS=14, StringInterpolate=15, STRING_TEXT=16, END_STRING=17;
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
			"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'..'", null, 
			"'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "START_STRING", 
			"IDENTIFIER", "WS", "StringInterpolate", "STRING_TEXT", "END_STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0086\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\fR\n\f\3\f\3\f"+
		"\5\fV\n\f\3\r\6\rY\n\r\r\r\16\rZ\3\16\3\16\3\16\3\16\3\17\3\17\7\17c\n"+
		"\17\f\17\16\17f\13\17\3\20\3\20\3\21\3\21\5\21l\n\21\3\22\6\22o\n\22\r"+
		"\22\16\22p\3\22\3\22\3\23\3\23\3\24\6\24x\n\24\r\24\16\24y\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0081\n\25\3\26\3\26\3\26\3\26\2\2\27\4\3\6\4\b\5\n"+
		"\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\2\34\16\36\17 \2\"\2$\20&\21"+
		"(\22*\2,\23\4\2\3\t\5\2\13\f\17\17\"\"\4\2--//\3\2\63;\3\2\62;\4\2C\\"+
		"c|\4\2\62;aa\4\2&&))\2\u008a\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3"+
		"\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2"+
		"\2\26\3\2\2\2\2\30\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2$\3\2\2\2\3&\3\2"+
		"\2\2\3(\3\2\2\2\3,\3\2\2\2\4.\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\n@\3\2\2"+
		"\2\fC\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22I\3\2\2\2\24L\3\2\2\2\26N\3\2"+
		"\2\2\30Q\3\2\2\2\32X\3\2\2\2\34\\\3\2\2\2\36`\3\2\2\2 g\3\2\2\2\"k\3\2"+
		"\2\2$n\3\2\2\2&t\3\2\2\2(w\3\2\2\2*\u0080\3\2\2\2,\u0082\3\2\2\2./\7u"+
		"\2\2/\60\7v\2\2\60\61\7f\2\2\61\62\7q\2\2\62\63\7w\2\2\63\64\7v\2\2\64"+
		"\5\3\2\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7h\2\289\3\2\2\29:\t\2\2\2:\7"+
		"\3\2\2\2;<\7&\2\2<>\5\36\17\2=?\7=\2\2>=\3\2\2\2>?\3\2\2\2?\t\3\2\2\2"+
		"@A\7/\2\2AB\7@\2\2B\13\3\2\2\2CD\7\f\2\2D\r\3\2\2\2EF\7<\2\2F\17\3\2\2"+
		"\2GH\7=\2\2H\21\3\2\2\2IJ\7\60\2\2JK\7\60\2\2K\23\3\2\2\2LM\t\3\2\2M\25"+
		"\3\2\2\2NO\7\62\2\2O\27\3\2\2\2PR\7/\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2"+
		"SU\t\4\2\2TV\5\32\r\2UT\3\2\2\2UV\3\2\2\2V\31\3\2\2\2WY\t\5\2\2XW\3\2"+
		"\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\33\3\2\2\2\\]\7)\2\2]^\3\2\2\2^_\b"+
		"\16\2\2_\35\3\2\2\2`d\5 \20\2ac\5\"\21\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\37\3\2\2\2fd\3\2\2\2gh\t\6\2\2h!\3\2\2\2il\5 \20\2jl\t\7\2"+
		"\2ki\3\2\2\2kj\3\2\2\2l#\3\2\2\2mo\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qr\3\2\2\2rs\b\22\3\2s%\3\2\2\2tu\5\b\4\2u\'\3\2\2\2vx\5*"+
		"\25\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z)\3\2\2\2{|\7)\2\2|\u0081"+
		"\7)\2\2}~\7&\2\2~\u0081\7&\2\2\177\u0081\n\b\2\2\u0080{\3\2\2\2\u0080"+
		"}\3\2\2\2\u0080\177\3\2\2\2\u0081+\3\2\2\2\u0082\u0083\7)\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\b\26\4\2\u0085-\3\2\2\2\r\2\3>QUZdkpy\u0080\5\7\3"+
		"\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}