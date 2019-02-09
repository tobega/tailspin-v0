// Generated from TailspinLexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, EndIdentifier=7, 
		LeftParen=8, RightParen=9, StartMatcher=10, EndMatcher=11, StartDereference=12, 
		Range=13, AdditiveOperator=14, Zero=15, NonZeroInteger=16, START_STRING=17, 
		IDENTIFIER=18, WS=19, StringEvaluate=20, StringDereference=21, STRING_TEXT=22, 
		END_STRING=23;
	public static final int
		IN_STRING=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING"
	};

	public static final String[] ruleNames = {
		"Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"LeftParen", "RightParen", "StartMatcher", "EndMatcher", "StartDereference", 
		"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
		"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringEvaluate", 
		"StringDereference", "STRING_TEXT", "STRING_CHAR", "END_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'('", "')'", 
		"'<'", "'>'", "'$'", "'..'", null, "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"LeftParen", "RightParen", "StartMatcher", "EndMatcher", "StartDereference", 
		"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "START_STRING", 
		"IDENTIFIER", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
		"END_STRING"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a5\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21l\n\21\3\21\3\21\5\21p\n\21\3"+
		"\22\6\22s\n\22\r\22\16\22t\3\23\3\23\3\23\3\23\3\24\3\24\7\24}\n\24\f"+
		"\24\16\24\u0080\13\24\3\25\3\25\3\26\3\26\5\26\u0086\n\26\3\27\6\27\u0089"+
		"\n\27\r\27\16\27\u008a\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\6\32\u0097\n\32\r\32\16\32\u0098\3\33\3\33\3\33\3\33\3\33\5\33\u00a0"+
		"\n\33\3\34\3\34\3\34\3\34\2\2\35\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\2&\23(\24*\2,\2.\25\60\26\62"+
		"\27\64\30\66\28\31\4\2\3\t\5\2\13\f\17\17\"\"\4\2--//\3\2\63;\3\2\62;"+
		"\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00a9\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2.\3\2\2\2\3\60\3\2"+
		"\2\2\3\62\3\2\2\2\3\64\3\2\2\2\38\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bG\3\2"+
		"\2\2\nL\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24Y\3\2"+
		"\2\2\26]\3\2\2\2\30_\3\2\2\2\32a\3\2\2\2\34c\3\2\2\2\36f\3\2\2\2 h\3\2"+
		"\2\2\"k\3\2\2\2$r\3\2\2\2&v\3\2\2\2(z\3\2\2\2*\u0081\3\2\2\2,\u0085\3"+
		"\2\2\2.\u0088\3\2\2\2\60\u008e\3\2\2\2\62\u0093\3\2\2\2\64\u0096\3\2\2"+
		"\2\66\u009f\3\2\2\28\u00a1\3\2\2\2:;\7u\2\2;<\7v\2\2<=\7f\2\2=>\7q\2\2"+
		">?\7w\2\2?@\7v\2\2@\5\3\2\2\2AB\7f\2\2BC\7g\2\2CD\7h\2\2DE\3\2\2\2EF\t"+
		"\2\2\2F\7\3\2\2\2GH\5\32\r\2HJ\5(\24\2IK\5\20\b\2JI\3\2\2\2JK\3\2\2\2"+
		"K\t\3\2\2\2LM\7/\2\2MN\7@\2\2N\13\3\2\2\2OP\7\f\2\2P\r\3\2\2\2QR\7<\2"+
		"\2R\17\3\2\2\2ST\7=\2\2T\21\3\2\2\2UV\7*\2\2VW\3\2\2\2WX\b\t\2\2X\23\3"+
		"\2\2\2YZ\7+\2\2Z[\3\2\2\2[\\\b\n\3\2\\\25\3\2\2\2]^\7>\2\2^\27\3\2\2\2"+
		"_`\7@\2\2`\31\3\2\2\2ab\7&\2\2b\33\3\2\2\2cd\7\60\2\2de\7\60\2\2e\35\3"+
		"\2\2\2fg\t\3\2\2g\37\3\2\2\2hi\7\62\2\2i!\3\2\2\2jl\7/\2\2kj\3\2\2\2k"+
		"l\3\2\2\2lm\3\2\2\2mo\t\4\2\2np\5$\22\2on\3\2\2\2op\3\2\2\2p#\3\2\2\2"+
		"qs\t\5\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u%\3\2\2\2vw\7)\2\2"+
		"wx\3\2\2\2xy\b\23\4\2y\'\3\2\2\2z~\5*\25\2{}\5,\26\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177)\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\t\6\2\2\u0082+\3\2\2\2\u0083\u0086\5*\25\2\u0084\u0086\t\7\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086-\3\2\2\2\u0087\u0089\t\2\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\27\5\2\u008d/\3\2\2\2\u008e"+
		"\u008f\5\32\r\2\u008f\u0090\5\22\t\2\u0090\u0091\3\2\2\2\u0091\u0092\b"+
		"\30\2\2\u0092\61\3\2\2\2\u0093\u0094\5\b\4\2\u0094\63\3\2\2\2\u0095\u0097"+
		"\5\66\33\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\65\3\2\2\2\u009a\u009b\7)\2\2\u009b\u00a0\7"+
		")\2\2\u009c\u009d\7&\2\2\u009d\u00a0\7&\2\2\u009e\u00a0\n\b\2\2\u009f"+
		"\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\67\3\2\2"+
		"\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\34\3\2\u00a49"+
		"\3\2\2\2\r\2\3Jkot~\u0085\u008a\u0098\u009f\6\7\2\2\6\2\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}