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
		Stdout=1, Def=2, Dereference=3, To=4, Colon=5, Comma=6, EndIdentifier=7, 
		LeftParen=8, RightParen=9, LeftBracket=10, RightBracket=11, StartMatcher=12, 
		StartTemplatesDefinition=13, EndDefinition=14, TemplateMatch=15, StartDereference=16, 
		Range=17, AdditiveOperator=18, MultiplicativeOperator=19, Zero=20, NonZeroInteger=21, 
		START_STRING=22, IDENTIFIER=23, WS=24, StringEvaluate=25, StringDereference=26, 
		STRING_TEXT=27, END_STRING=28, EndMatcher=29, MatchInteger=30, RangeMatch=31;
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
			"Stdout", "Def", "Dereference", "To", "Colon", "Comma", "EndIdentifier", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "StartMatcher", 
			"StartTemplatesDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "StringEvaluate", "StringDereference", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING", "EndMatcher", "MatchInteger", "RangeMatch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "','", "';'", "'('", "')'", 
			"'['", "']'", "'<'", "'templates'", "'end'", "'#'", "'$'", "'..'", null, 
			null, "'0'", null, null, null, null, null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "Comma", "EndIdentifier", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "StartMatcher", 
			"StartTemplatesDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"START_STRING", "IDENTIFIER", "WS", "StringEvaluate", "StringDereference", 
			"STRING_TEXT", "END_STRING", "EndMatcher", "MatchInteger", "RangeMatch"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00da\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0092"+
		"\n\24\3\25\3\25\3\26\5\26\u0097\n\26\3\26\3\26\5\26\u009b\n\26\3\27\6"+
		"\27\u009e\n\27\r\27\16\27\u009f\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00a8"+
		"\n\31\f\31\16\31\u00ab\13\31\3\32\3\32\3\33\3\33\5\33\u00b1\n\33\3\34"+
		"\6\34\u00b4\n\34\r\34\16\34\u00b5\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\6\37\u00c2\n\37\r\37\16\37\u00c3\3 \3 \3 \3 \3 \5 \u00cb"+
		"\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\5#\u00d7\n#\3$\3$\2\2%\5\3\7\4\t"+
		"\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%"+
		"\23\'\24)\25+\26-\27/\2\61\30\63\31\65\2\67\29\32;\33=\34?\35A\2C\36E"+
		"\37G I!\5\2\3\4\n\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62"+
		";\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00df\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\3=\3\2\2"+
		"\2\3?\3\2\2\2\3C\3\2\2\2\4E\3\2\2\2\4G\3\2\2\2\4I\3\2\2\2\5K\3\2\2\2\7"+
		"R\3\2\2\2\tX\3\2\2\2\13]\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23"+
		"f\3\2\2\2\25j\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35v\3\2\2\2"+
		"\37\u0080\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0096\3\2\2\2/\u009d\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a5\3\2\2\2\65\u00ac\3\2\2\2\67\u00b0\3\2\2\29\u00b3"+
		"\3\2\2\2;\u00b9\3\2\2\2=\u00be\3\2\2\2?\u00c1\3\2\2\2A\u00ca\3\2\2\2C"+
		"\u00cc\3\2\2\2E\u00d0\3\2\2\2G\u00d6\3\2\2\2I\u00d8\3\2\2\2KL\7u\2\2L"+
		"M\7v\2\2MN\7f\2\2NO\7q\2\2OP\7w\2\2PQ\7v\2\2Q\6\3\2\2\2RS\7f\2\2ST\7g"+
		"\2\2TU\7h\2\2UV\3\2\2\2VW\t\2\2\2W\b\3\2\2\2XY\5#\21\2Y[\5\63\31\2Z\\"+
		"\5\21\b\2[Z\3\2\2\2[\\\3\2\2\2\\\n\3\2\2\2]^\7/\2\2^_\7@\2\2_\f\3\2\2"+
		"\2`a\7<\2\2a\16\3\2\2\2bc\7.\2\2c\20\3\2\2\2de\7=\2\2e\22\3\2\2\2fg\7"+
		"*\2\2gh\3\2\2\2hi\b\t\2\2i\24\3\2\2\2jk\7+\2\2kl\3\2\2\2lm\b\n\3\2m\26"+
		"\3\2\2\2no\7]\2\2o\30\3\2\2\2pq\7_\2\2q\32\3\2\2\2rs\7>\2\2st\3\2\2\2"+
		"tu\b\r\4\2u\34\3\2\2\2vw\7v\2\2wx\7g\2\2xy\7o\2\2yz\7r\2\2z{\7n\2\2{|"+
		"\7c\2\2|}\7v\2\2}~\7g\2\2~\177\7u\2\2\177\36\3\2\2\2\u0080\u0081\7g\2"+
		"\2\u0081\u0082\7p\2\2\u0082\u0083\7f\2\2\u0083 \3\2\2\2\u0084\u0085\7"+
		"%\2\2\u0085\"\3\2\2\2\u0086\u0087\7&\2\2\u0087$\3\2\2\2\u0088\u0089\7"+
		"\60\2\2\u0089\u008a\7\60\2\2\u008a&\3\2\2\2\u008b\u008c\t\3\2\2\u008c"+
		"(\3\2\2\2\u008d\u0092\t\4\2\2\u008e\u008f\7o\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0092\7f\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0092*\3\2\2\2\u0093"+
		"\u0094\7\62\2\2\u0094,\3\2\2\2\u0095\u0097\7/\2\2\u0096\u0095\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u009b"+
		"\5/\27\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b.\3\2\2\2\u009c"+
		"\u009e\t\6\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\30\5\2\u00a4\62\3\2\2\2\u00a5\u00a9\5\65\32\2\u00a6"+
		"\u00a8\5\67\33\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\64\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\t\7\2\2\u00ad\66\3\2\2\2\u00ae\u00b1\5\65\32\2\u00af\u00b1\t\b"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b18\3\2\2\2\u00b2\u00b4"+
		"\t\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\34\6\2\u00b8:\3\2\2\2"+
		"\u00b9\u00ba\5#\21\2\u00ba\u00bb\5\23\t\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\b\35\2\2\u00bd<\3\2\2\2\u00be\u00bf\5\t\4\2\u00bf>\3\2\2\2\u00c0\u00c2"+
		"\5A \2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\u00cb\7)\2\2\u00c7"+
		"\u00c8\7&\2\2\u00c8\u00cb\7&\2\2\u00c9\u00cb\n\t\2\2\u00ca\u00c5\3\2\2"+
		"\2\u00ca\u00c7\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cbB\3\2\2\2\u00cc\u00cd"+
		"\7)\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b!\3\2\u00cfD\3\2\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\"\3\2\u00d3F\3\2\2\2\u00d4\u00d7"+
		"\5+\25\2\u00d5\u00d7\5-\26\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"H\3\2\2\2\u00d8\u00d9\5%\22\2\u00d9J\3\2\2\2\20\2\3\4[\u0091\u0096\u009a"+
		"\u009f\u00a9\u00b0\u00b5\u00c3\u00ca\u00d6\7\7\2\2\6\2\2\7\4\2\7\3\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}