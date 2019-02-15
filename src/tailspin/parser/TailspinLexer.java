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
		MultiplicativeOperator=16, Zero=17, NonZeroInteger=18, START_STRING=19, 
		IDENTIFIER=20, WS=21, StringEvaluate=22, StringDereference=23, STRING_TEXT=24, 
		END_STRING=25, EndMatcher=26, MatchInteger=27, RangeMatch=28;
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
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndMatcher", "MatchInteger", "RangeMatch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "';'", "'('", "')'", "'<'", 
			"'templates'", "'end'", "'#'", "'$'", "'..'", null, null, "'0'", null, 
			null, null, null, null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "EndIdentifier", 
			"LeftParen", "RightParen", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StringEvaluate", "StringDereference", "STRING_TEXT", "END_STRING", 
			"EndMatcher", "MatchInteger", "RangeMatch"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ce\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\5\21\u0086\n\21\3\22\3\22\3\23\5\23\u008b\n\23\3\23\3"+
		"\23\5\23\u008f\n\23\3\24\6\24\u0092\n\24\r\24\16\24\u0093\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\7\26\u009c\n\26\f\26\16\26\u009f\13\26\3\27\3\27\3"+
		"\30\3\30\5\30\u00a5\n\30\3\31\6\31\u00a8\n\31\r\31\16\31\u00a9\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\6\34\u00b6\n\34\r\34\16\34"+
		"\u00b7\3\35\3\35\3\35\3\35\3\35\5\35\u00bf\n\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \5 \u00cb\n \3!\3!\2\2\"\5\3\7\4\t\5\13\6\r\7"+
		"\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\2"+
		"+\25-\26/\2\61\2\63\27\65\30\67\319\32;\2=\33?\34A\35C\36\5\2\3\4\n\5"+
		"\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62"+
		";aa\4\2&&))\2\u00d3\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2"+
		"\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3=\3\2\2\2\4?\3\2\2\2\4A\3\2\2\2"+
		"\4C\3\2\2\2\5E\3\2\2\2\7L\3\2\2\2\tR\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17"+
		"\\\3\2\2\2\21^\3\2\2\2\23b\3\2\2\2\25f\3\2\2\2\27j\3\2\2\2\31t\3\2\2\2"+
		"\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\177\3\2\2\2#\u0085\3\2\2\2%\u0087"+
		"\3\2\2\2\'\u008a\3\2\2\2)\u0091\3\2\2\2+\u0095\3\2\2\2-\u0099\3\2\2\2"+
		"/\u00a0\3\2\2\2\61\u00a4\3\2\2\2\63\u00a7\3\2\2\2\65\u00ad\3\2\2\2\67"+
		"\u00b2\3\2\2\29\u00b5\3\2\2\2;\u00be\3\2\2\2=\u00c0\3\2\2\2?\u00c4\3\2"+
		"\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2EF\7u\2\2FG\7v\2\2GH\7f\2\2HI\7q\2\2"+
		"IJ\7w\2\2JK\7v\2\2K\6\3\2\2\2LM\7f\2\2MN\7g\2\2NO\7h\2\2OP\3\2\2\2PQ\t"+
		"\2\2\2Q\b\3\2\2\2RS\5\35\16\2SU\5-\26\2TV\5\17\7\2UT\3\2\2\2UV\3\2\2\2"+
		"V\n\3\2\2\2WX\7/\2\2XY\7@\2\2Y\f\3\2\2\2Z[\7<\2\2[\16\3\2\2\2\\]\7=\2"+
		"\2]\20\3\2\2\2^_\7*\2\2_`\3\2\2\2`a\b\b\2\2a\22\3\2\2\2bc\7+\2\2cd\3\2"+
		"\2\2de\b\t\3\2e\24\3\2\2\2fg\7>\2\2gh\3\2\2\2hi\b\n\4\2i\26\3\2\2\2jk"+
		"\7v\2\2kl\7g\2\2lm\7o\2\2mn\7r\2\2no\7n\2\2op\7c\2\2pq\7v\2\2qr\7g\2\2"+
		"rs\7u\2\2s\30\3\2\2\2tu\7g\2\2uv\7p\2\2vw\7f\2\2w\32\3\2\2\2xy\7%\2\2"+
		"y\34\3\2\2\2z{\7&\2\2{\36\3\2\2\2|}\7\60\2\2}~\7\60\2\2~ \3\2\2\2\177"+
		"\u0080\t\3\2\2\u0080\"\3\2\2\2\u0081\u0086\t\4\2\2\u0082\u0083\7o\2\2"+
		"\u0083\u0084\7q\2\2\u0084\u0086\7f\2\2\u0085\u0081\3\2\2\2\u0085\u0082"+
		"\3\2\2\2\u0086$\3\2\2\2\u0087\u0088\7\62\2\2\u0088&\3\2\2\2\u0089\u008b"+
		"\7/\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\t\5\2\2\u008d\u008f\5)\24\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f(\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094*\3\2\2\2\u0095"+
		"\u0096\7)\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\25\5\2\u0098,\3\2\2\2"+
		"\u0099\u009d\5/\27\2\u009a\u009c\5\61\30\2\u009b\u009a\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e.\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\t\7\2\2\u00a1\60\3\2\2\2\u00a2\u00a5\5/\27"+
		"\2\u00a3\u00a5\t\b\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\62"+
		"\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\31"+
		"\6\2\u00ac\64\3\2\2\2\u00ad\u00ae\5\35\16\2\u00ae\u00af\5\21\b\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\b\32\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\5\t\4"+
		"\2\u00b38\3\2\2\2\u00b4\u00b6\5;\35\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8:\3\2\2\2\u00b9"+
		"\u00ba\7)\2\2\u00ba\u00bf\7)\2\2\u00bb\u00bc\7&\2\2\u00bc\u00bf\7&\2\2"+
		"\u00bd\u00bf\n\t\2\2\u00be\u00b9\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\b\36\3\2\u00c3>\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\b\37\3\2\u00c7@\3\2\2\2\u00c8\u00cb\5%\22\2\u00c9\u00cb\5\'\23"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cbB\3\2\2\2\u00cc\u00cd"+
		"\5\37\17\2\u00cdD\3\2\2\2\20\2\3\4U\u0085\u008a\u008e\u0093\u009d\u00a4"+
		"\u00a9\u00b7\u00be\u00ca\7\7\2\2\6\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}