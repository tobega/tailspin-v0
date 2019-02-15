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
		StartMatcher=13, StartTemplatesDefinition=14, EndDefinition=15, TemplateMatch=16, 
		StartDereference=17, Range=18, AdditiveOperator=19, MultiplicativeOperator=20, 
		Zero=21, NonZeroInteger=22, START_STRING=23, IDENTIFIER=24, WS=25, StringEvaluate=26, 
		StringDereference=27, STRING_TEXT=28, END_STRING=29, EndMatcher=30, MatchInteger=31, 
		RangeMatch=32;
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
			"StartMatcher", "StartTemplatesDefinition", "EndDefinition", "TemplateMatch", 
			"StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndMatcher", "MatchInteger", "RangeMatch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "','", "'...'", "';'", "'('", 
			"')'", "'['", "']'", "'<'", "'templates'", "'end'", "'#'", "'$'", "'..'", 
			null, null, "'0'", null, null, null, null, null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "Comma", "Deconstructor", 
			"EndIdentifier", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"StartMatcher", "StartTemplatesDefinition", "EndDefinition", "TemplateMatch", 
			"StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e0\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\5\25\u0098\n\25\3\26\3\26\3\27\5\27\u009d\n\27\3"+
		"\27\3\27\5\27\u00a1\n\27\3\30\6\30\u00a4\n\30\r\30\16\30\u00a5\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\7\32\u00ae\n\32\f\32\16\32\u00b1\13\32\3\33\3"+
		"\33\3\34\3\34\5\34\u00b7\n\34\3\35\6\35\u00ba\n\35\r\35\16\35\u00bb\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \6 \u00c8\n \r \16 \u00c9"+
		"\3!\3!\3!\3!\3!\5!\u00d1\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\5$\u00dd"+
		"\n$\3%\3%\2\2&\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33"+
		"\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\2\63\31\65\32\67\2"+
		"9\2;\33=\34?\35A\36C\2E\37G I!K\"\5\2\3\4\n\5\2\13\f\17\17\"\"\4\2--/"+
		"/\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00e5\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2\3A\3\2\2\2\3E\3\2\2\2\4G\3\2"+
		"\2\2\4I\3\2\2\2\4K\3\2\2\2\5M\3\2\2\2\7T\3\2\2\2\tZ\3\2\2\2\13_\3\2\2"+
		"\2\rb\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27p\3\2"+
		"\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3\2\2\2\37|\3\2\2\2!\u0086\3\2\2\2#\u008a"+
		"\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0091\3\2\2\2+\u0097\3\2\2\2"+
		"-\u0099\3\2\2\2/\u009c\3\2\2\2\61\u00a3\3\2\2\2\63\u00a7\3\2\2\2\65\u00ab"+
		"\3\2\2\2\67\u00b2\3\2\2\29\u00b6\3\2\2\2;\u00b9\3\2\2\2=\u00bf\3\2\2\2"+
		"?\u00c4\3\2\2\2A\u00c7\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d6\3"+
		"\2\2\2I\u00dc\3\2\2\2K\u00de\3\2\2\2MN\7u\2\2NO\7v\2\2OP\7f\2\2PQ\7q\2"+
		"\2QR\7w\2\2RS\7v\2\2S\6\3\2\2\2TU\7f\2\2UV\7g\2\2VW\7h\2\2WX\3\2\2\2X"+
		"Y\t\2\2\2Y\b\3\2\2\2Z[\5%\22\2[]\5\65\32\2\\^\5\23\t\2]\\\3\2\2\2]^\3"+
		"\2\2\2^\n\3\2\2\2_`\7/\2\2`a\7@\2\2a\f\3\2\2\2bc\7<\2\2c\16\3\2\2\2de"+
		"\7.\2\2e\20\3\2\2\2fg\7\60\2\2gh\7\60\2\2hi\7\60\2\2i\22\3\2\2\2jk\7="+
		"\2\2k\24\3\2\2\2lm\7*\2\2mn\3\2\2\2no\b\n\2\2o\26\3\2\2\2pq\7+\2\2qr\3"+
		"\2\2\2rs\b\13\3\2s\30\3\2\2\2tu\7]\2\2u\32\3\2\2\2vw\7_\2\2w\34\3\2\2"+
		"\2xy\7>\2\2yz\3\2\2\2z{\b\16\4\2{\36\3\2\2\2|}\7v\2\2}~\7g\2\2~\177\7"+
		"o\2\2\177\u0080\7r\2\2\u0080\u0081\7n\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7u\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7f\2\2\u0089\"\3\2\2\2\u008a\u008b"+
		"\7%\2\2\u008b$\3\2\2\2\u008c\u008d\7&\2\2\u008d&\3\2\2\2\u008e\u008f\7"+
		"\60\2\2\u008f\u0090\7\60\2\2\u0090(\3\2\2\2\u0091\u0092\t\3\2\2\u0092"+
		"*\3\2\2\2\u0093\u0098\t\4\2\2\u0094\u0095\7o\2\2\u0095\u0096\7q\2\2\u0096"+
		"\u0098\7f\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0098,\3\2\2\2\u0099"+
		"\u009a\7\62\2\2\u009a.\3\2\2\2\u009b\u009d\7/\2\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\t\5\2\2\u009f\u00a1"+
		"\5\61\30\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\60\3\2\2\2\u00a2"+
		"\u00a4\t\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\b\31\5\2\u00aa\64\3\2\2\2\u00ab\u00af\5\67\33\2\u00ac"+
		"\u00ae\59\34\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\66\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\t\7\2\2\u00b38\3\2\2\2\u00b4\u00b7\5\67\33\2\u00b5\u00b7\t\b\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7:\3\2\2\2\u00b8\u00ba\t\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\35\6\2\u00be<\3\2\2\2\u00bf"+
		"\u00c0\5%\22\2\u00c0\u00c1\5\25\n\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b"+
		"\36\2\2\u00c3>\3\2\2\2\u00c4\u00c5\5\t\4\2\u00c5@\3\2\2\2\u00c6\u00c8"+
		"\5C!\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00caB\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc\u00d1\7)\2\2\u00cd"+
		"\u00ce\7&\2\2\u00ce\u00d1\7&\2\2\u00cf\u00d1\n\t\2\2\u00d0\u00cb\3\2\2"+
		"\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\7)\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\"\3\2\u00d5F\3\2\2\2\u00d6\u00d7"+
		"\7@\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b#\3\2\u00d9H\3\2\2\2\u00da\u00dd"+
		"\5-\26\2\u00db\u00dd\5/\27\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"J\3\2\2\2\u00de\u00df\5\'\23\2\u00dfL\3\2\2\2\20\2\3\4]\u0097\u009c\u00a0"+
		"\u00a5\u00af\u00b6\u00bb\u00c9\u00d0\u00dc\7\7\2\2\6\2\2\7\4\2\7\3\2\b"+
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