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
		Stdout=1, Def=2, Dereference=3, To=4, Colon=5, Comma=6, Deconstructor=7, 
		EndIdentifier=8, LeftParen=9, RightParen=10, LeftBracket=11, RightBracket=12, 
		LeftBrace=13, RightBrace=14, Key=15, StartMatcher=16, StartTemplatesDefinition=17, 
		EndDefinition=18, TemplateMatch=19, StartDereference=20, Range=21, AdditiveOperator=22, 
		MultiplicativeOperator=23, Zero=24, NonZeroInteger=25, START_STRING=26, 
		IDENTIFIER=27, WS=28, StringEvaluate=29, StringDereference=30, STRING_TEXT=31, 
		END_STRING=32, EndMatcher=33, MatchInteger=34, RangeMatch=35, START_REGEXP=36;
	public static final int
		IN_STRING=1, MATCHER=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "MATCHER"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Stdout", "Def", "Dereference", "To", "Colon", "Comma", "Deconstructor", 
			"EndIdentifier", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringEvaluate", 
			"StringDereference", "STRING_TEXT", "STRING_CHAR", "END_STRING", "EndMatcher", 
			"MatchInteger", "RangeMatch", "START_REGEXP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "','", "'...'", "';'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", null, "'<'", "'templates'", "'end'", 
			"'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, null, 
			null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "Comma", "Deconstructor", 
			"EndIdentifier", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StringEvaluate", "StringDereference", "STRING_TEXT", "END_STRING", 
			"EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f3\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4f\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\5\30\u00a7\n\30\3\31\3\31\3\32\5\32\u00ac\n\32\3\32\3\32\5"+
		"\32\u00b0\n\32\3\33\6\33\u00b3\n\33\r\33\16\33\u00b4\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\7\35\u00bd\n\35\f\35\16\35\u00c0\13\35\3\36\3\36\3\37\3"+
		"\37\5\37\u00c6\n\37\3 \6 \u00c9\n \r \16 \u00ca\3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3#\6#\u00d7\n#\r#\16#\u00d8\3$\3$\3$\3$\3$\5$\u00e0\n$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\5\'\u00ec\n\'\3(\3(\3)\3)\3)\3)\2\2*\5\3\7\4"+
		"\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22"+
		"%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\29\34;\35=\2?\2A\36C\37"+
		"E G!I\2K\"M#O$Q%S&\5\2\3\4\n\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3"+
		"\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00f8\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G\3\2"+
		"\2\2\3K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\5U\3\2\2\2"+
		"\7\\\3\2\2\2\tb\3\2\2\2\13g\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21n\3\2\2\2"+
		"\23r\3\2\2\2\25t\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33~\3\2\2\2\35\u0080"+
		"\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u008b\3\2\2\2"+
		"\'\u0095\3\2\2\2)\u0099\3\2\2\2+\u009b\3\2\2\2-\u009d\3\2\2\2/\u00a0\3"+
		"\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2\2\65\u00ab\3\2\2\2\67\u00b2\3\2"+
		"\2\29\u00b6\3\2\2\2;\u00ba\3\2\2\2=\u00c1\3\2\2\2?\u00c5\3\2\2\2A\u00c8"+
		"\3\2\2\2C\u00ce\3\2\2\2E\u00d3\3\2\2\2G\u00d6\3\2\2\2I\u00df\3\2\2\2K"+
		"\u00e1\3\2\2\2M\u00e5\3\2\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S\u00ef\3\2"+
		"\2\2UV\7u\2\2VW\7v\2\2WX\7f\2\2XY\7q\2\2YZ\7w\2\2Z[\7v\2\2[\6\3\2\2\2"+
		"\\]\7f\2\2]^\7g\2\2^_\7h\2\2_`\3\2\2\2`a\t\2\2\2a\b\3\2\2\2bc\5+\25\2"+
		"ce\5;\35\2df\5\23\t\2ed\3\2\2\2ef\3\2\2\2f\n\3\2\2\2gh\7/\2\2hi\7@\2\2"+
		"i\f\3\2\2\2jk\7<\2\2k\16\3\2\2\2lm\7.\2\2m\20\3\2\2\2no\7\60\2\2op\7\60"+
		"\2\2pq\7\60\2\2q\22\3\2\2\2rs\7=\2\2s\24\3\2\2\2tu\7*\2\2uv\3\2\2\2vw"+
		"\b\n\2\2w\26\3\2\2\2xy\7+\2\2yz\3\2\2\2z{\b\13\3\2{\30\3\2\2\2|}\7]\2"+
		"\2}\32\3\2\2\2~\177\7_\2\2\177\34\3\2\2\2\u0080\u0081\7}\2\2\u0081\36"+
		"\3\2\2\2\u0082\u0083\7\177\2\2\u0083 \3\2\2\2\u0084\u0085\5;\35\2\u0085"+
		"\u0086\5\r\6\2\u0086\"\3\2\2\2\u0087\u0088\7>\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\b\21\4\2\u008a$\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7"+
		"g\2\2\u008d\u008e\7o\2\2\u008e\u008f\7r\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7u\2\2\u0094"+
		"&\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098"+
		"(\3\2\2\2\u0099\u009a\7%\2\2\u009a*\3\2\2\2\u009b\u009c\7&\2\2\u009c,"+
		"\3\2\2\2\u009d\u009e\7\60\2\2\u009e\u009f\7\60\2\2\u009f.\3\2\2\2\u00a0"+
		"\u00a1\t\3\2\2\u00a1\60\3\2\2\2\u00a2\u00a7\t\4\2\2\u00a3\u00a4\7o\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a7\7f\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3"+
		"\3\2\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\64\3\2\2\2\u00aa"+
		"\u00ac\7/\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\t\5\2\2\u00ae\u00b0\5\67\33\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\66\3\2\2\2\u00b1\u00b3\t\6\2\2\u00b2\u00b1\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b58"+
		"\3\2\2\2\u00b6\u00b7\7)\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\34\5\2\u00b9"+
		":\3\2\2\2\u00ba\u00be\5=\36\2\u00bb\u00bd\5?\37\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf<\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t\7\2\2\u00c2>\3\2\2\2\u00c3\u00c6"+
		"\5=\36\2\u00c4\u00c6\t\b\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"@\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd"+
		"\b \6\2\u00cdB\3\2\2\2\u00ce\u00cf\5+\25\2\u00cf\u00d0\5\25\n\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\b!\2\2\u00d2D\3\2\2\2\u00d3\u00d4\5\t\4\2\u00d4"+
		"F\3\2\2\2\u00d5\u00d7\5I$\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9H\3\2\2\2\u00da\u00db\7)\2\2\u00db"+
		"\u00e0\7)\2\2\u00dc\u00dd\7&\2\2\u00dd\u00e0\7&\2\2\u00de\u00e0\n\t\2"+
		"\2\u00df\u00da\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2\2\2\u00e0J"+
		"\3\2\2\2\u00e1\u00e2\7)\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b%\3\2\u00e4"+
		"L\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b&\3\2\u00e8"+
		"N\3\2\2\2\u00e9\u00ec\5\63\31\2\u00ea\u00ec\5\65\32\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00ecP\3\2\2\2\u00ed\u00ee\5-\26\2\u00eeR\3\2"+
		"\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b)\5\2\u00f2T"+
		"\3\2\2\2\20\2\3\4e\u00a6\u00ab\u00af\u00b4\u00be\u00c5\u00ca\u00d8\u00df"+
		"\u00eb\7\7\2\2\6\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}