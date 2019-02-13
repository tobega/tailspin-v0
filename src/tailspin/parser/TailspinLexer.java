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
		Stdout=1, Def=2, Dereference=3, To=4, Colon=5, EndIdentifier=6, LeftParen=7, 
		RightParen=8, StartMatcher=9, StartTemplatesDefinition=10, EndDefinition=11, 
		TemplateMatch=12, StartDereference=13, Range=14, AdditiveOperator=15, 
		Zero=16, NonZeroInteger=17, START_STRING=18, IDENTIFIER=19, WS=20, StringEvaluate=21, 
		StringDereference=22, STRING_TEXT=23, END_STRING=24, EndMatcher=25, MatchInteger=26, 
		RangeMatch=27;
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
			"Stdout", "Def", "Dereference", "To", "Colon", "EndIdentifier", "LeftParen", 
			"RightParen", "StartMatcher", "StartTemplatesDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "Zero", 
			"NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndMatcher", "MatchInteger", "RangeMatch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "';'", "'('", "')'", "'<'", 
			"'templates'", "'end'", "'#'", "'$'", "'..'", null, "'0'", null, null, 
			null, null, null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "EndIdentifier", 
			"LeftParen", "RightParen", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StringEvaluate", 
			"StringDereference", "STRING_TEXT", "END_STRING", "EndMatcher", "MatchInteger", 
			"RangeMatch"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c6\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\5\4T\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\5\22\u0083\n\22\3\22\3\22\5\22\u0087\n\22\3\23\6\23\u008a\n\23\r"+
		"\23\16\23\u008b\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0094\n\25\f\25\16"+
		"\25\u0097\13\25\3\26\3\26\3\27\3\27\5\27\u009d\n\27\3\30\6\30\u00a0\n"+
		"\30\r\30\16\30\u00a1\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\6\33\u00ae\n\33\r\33\16\33\u00af\3\34\3\34\3\34\3\34\3\34\5\34\u00b7"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u00c3\n\37"+
		"\3 \3 \2\2!\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16"+
		"\35\17\37\20!\21#\22%\23\'\2)\24+\25-\2/\2\61\26\63\27\65\30\67\319\2"+
		";\32=\33?\34A\35\5\2\3\4\t\5\2\13\f\17\17\"\"\4\2--//\3\2\63;\3\2\62;"+
		"\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00ca\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\3;\3\2\2\2\4=\3\2\2\2\4?\3\2"+
		"\2\2\4A\3\2\2\2\5C\3\2\2\2\7J\3\2\2\2\tP\3\2\2\2\13U\3\2\2\2\rX\3\2\2"+
		"\2\17Z\3\2\2\2\21\\\3\2\2\2\23`\3\2\2\2\25d\3\2\2\2\27h\3\2\2\2\31r\3"+
		"\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37z\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0082"+
		"\3\2\2\2\'\u0089\3\2\2\2)\u008d\3\2\2\2+\u0091\3\2\2\2-\u0098\3\2\2\2"+
		"/\u009c\3\2\2\2\61\u009f\3\2\2\2\63\u00a5\3\2\2\2\65\u00aa\3\2\2\2\67"+
		"\u00ad\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00bc\3\2\2\2?\u00c2\3\2"+
		"\2\2A\u00c4\3\2\2\2CD\7u\2\2DE\7v\2\2EF\7f\2\2FG\7q\2\2GH\7w\2\2HI\7v"+
		"\2\2I\6\3\2\2\2JK\7f\2\2KL\7g\2\2LM\7h\2\2MN\3\2\2\2NO\t\2\2\2O\b\3\2"+
		"\2\2PQ\5\35\16\2QS\5+\25\2RT\5\17\7\2SR\3\2\2\2ST\3\2\2\2T\n\3\2\2\2U"+
		"V\7/\2\2VW\7@\2\2W\f\3\2\2\2XY\7<\2\2Y\16\3\2\2\2Z[\7=\2\2[\20\3\2\2\2"+
		"\\]\7*\2\2]^\3\2\2\2^_\b\b\2\2_\22\3\2\2\2`a\7+\2\2ab\3\2\2\2bc\b\t\3"+
		"\2c\24\3\2\2\2de\7>\2\2ef\3\2\2\2fg\b\n\4\2g\26\3\2\2\2hi\7v\2\2ij\7g"+
		"\2\2jk\7o\2\2kl\7r\2\2lm\7n\2\2mn\7c\2\2no\7v\2\2op\7g\2\2pq\7u\2\2q\30"+
		"\3\2\2\2rs\7g\2\2st\7p\2\2tu\7f\2\2u\32\3\2\2\2vw\7%\2\2w\34\3\2\2\2x"+
		"y\7&\2\2y\36\3\2\2\2z{\7\60\2\2{|\7\60\2\2| \3\2\2\2}~\t\3\2\2~\"\3\2"+
		"\2\2\177\u0080\7\62\2\2\u0080$\3\2\2\2\u0081\u0083\7/\2\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\t\4\2\2\u0085"+
		"\u0087\5\'\23\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087&\3\2\2\2"+
		"\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c(\3\2\2\2\u008d\u008e\7)\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\b\24\5\2\u0090*\3\2\2\2\u0091\u0095\5-\26\2\u0092"+
		"\u0094\5/\27\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096,\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\t\6\2\2\u0099.\3\2\2\2\u009a\u009d\5-\26\2\u009b\u009d\t\7\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\60\3\2\2\2\u009e\u00a0\t\2\2"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\30\6\2\u00a4\62\3\2\2\2\u00a5"+
		"\u00a6\5\35\16\2\u00a6\u00a7\5\21\b\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\b\31\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\5\t\4\2\u00ab\66\3\2\2\2\u00ac"+
		"\u00ae\59\34\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b08\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b7"+
		"\7)\2\2\u00b3\u00b4\7&\2\2\u00b4\u00b7\7&\2\2\u00b5\u00b7\n\b\2\2\u00b6"+
		"\u00b1\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7:\3\2\2\2"+
		"\u00b8\u00b9\7)\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\35\3\2\u00bb<\3"+
		"\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\36\3\2\u00bf"+
		">\3\2\2\2\u00c0\u00c3\5#\21\2\u00c1\u00c3\5%\22\2\u00c2\u00c0\3\2\2\2"+
		"\u00c2\u00c1\3\2\2\2\u00c3@\3\2\2\2\u00c4\u00c5\5\37\17\2\u00c5B\3\2\2"+
		"\2\17\2\3\4S\u0082\u0086\u008b\u0095\u009c\u00a1\u00af\u00b6\u00c2\7\7"+
		"\2\2\6\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}