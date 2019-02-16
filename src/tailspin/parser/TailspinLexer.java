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
		RangeMatch=32, START_REGEXP=33;
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
			"STRING_CHAR", "END_STRING", "EndMatcher", "MatchInteger", "RangeMatch", 
			"START_REGEXP"
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
			"RangeMatch", "START_REGEXP"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00e6\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\5\25\u009a\n\25\3\26\3\26\3\27\5\27\u009f"+
		"\n\27\3\27\3\27\5\27\u00a3\n\27\3\30\6\30\u00a6\n\30\r\30\16\30\u00a7"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u00b0\n\32\f\32\16\32\u00b3\13\32"+
		"\3\33\3\33\3\34\3\34\5\34\u00b9\n\34\3\35\6\35\u00bc\n\35\r\35\16\35\u00bd"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \6 \u00ca\n \r \16 \u00cb"+
		"\3!\3!\3!\3!\3!\5!\u00d3\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\5$\u00df"+
		"\n$\3%\3%\3&\3&\3&\3&\2\2\'\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\2\63"+
		"\31\65\32\67\29\2;\33=\34?\35A\36C\2E\37G I!K\"M#\5\2\3\4\n\5\2\13\f\17"+
		"\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&)"+
		")\2\u00eb\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2\3A\3\2\2\2\3"+
		"E\3\2\2\2\4G\3\2\2\2\4I\3\2\2\2\4K\3\2\2\2\4M\3\2\2\2\5O\3\2\2\2\7V\3"+
		"\2\2\2\t\\\3\2\2\2\13a\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23l"+
		"\3\2\2\2\25n\3\2\2\2\27r\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37"+
		"~\3\2\2\2!\u0088\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2"+
		")\u0093\3\2\2\2+\u0099\3\2\2\2-\u009b\3\2\2\2/\u009e\3\2\2\2\61\u00a5"+
		"\3\2\2\2\63\u00a9\3\2\2\2\65\u00ad\3\2\2\2\67\u00b4\3\2\2\29\u00b8\3\2"+
		"\2\2;\u00bb\3\2\2\2=\u00c1\3\2\2\2?\u00c6\3\2\2\2A\u00c9\3\2\2\2C\u00d2"+
		"\3\2\2\2E\u00d4\3\2\2\2G\u00d8\3\2\2\2I\u00de\3\2\2\2K\u00e0\3\2\2\2M"+
		"\u00e2\3\2\2\2OP\7u\2\2PQ\7v\2\2QR\7f\2\2RS\7q\2\2ST\7w\2\2TU\7v\2\2U"+
		"\6\3\2\2\2VW\7f\2\2WX\7g\2\2XY\7h\2\2YZ\3\2\2\2Z[\t\2\2\2[\b\3\2\2\2\\"+
		"]\5%\22\2]_\5\65\32\2^`\5\23\t\2_^\3\2\2\2_`\3\2\2\2`\n\3\2\2\2ab\7/\2"+
		"\2bc\7@\2\2c\f\3\2\2\2de\7<\2\2e\16\3\2\2\2fg\7.\2\2g\20\3\2\2\2hi\7\60"+
		"\2\2ij\7\60\2\2jk\7\60\2\2k\22\3\2\2\2lm\7=\2\2m\24\3\2\2\2no\7*\2\2o"+
		"p\3\2\2\2pq\b\n\2\2q\26\3\2\2\2rs\7+\2\2st\3\2\2\2tu\b\13\3\2u\30\3\2"+
		"\2\2vw\7]\2\2w\32\3\2\2\2xy\7_\2\2y\34\3\2\2\2z{\7>\2\2{|\3\2\2\2|}\b"+
		"\16\4\2}\36\3\2\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\u0081\7o\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u0083\7n\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2"+
		"\u0085\u0086\7g\2\2\u0086\u0087\7u\2\2\u0087 \3\2\2\2\u0088\u0089\7g\2"+
		"\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b\"\3\2\2\2\u008c\u008d\7"+
		"%\2\2\u008d$\3\2\2\2\u008e\u008f\7&\2\2\u008f&\3\2\2\2\u0090\u0091\7\60"+
		"\2\2\u0091\u0092\7\60\2\2\u0092(\3\2\2\2\u0093\u0094\t\3\2\2\u0094*\3"+
		"\2\2\2\u0095\u009a\t\4\2\2\u0096\u0097\7o\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u009a\7f\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u009a,\3\2\2\2\u009b"+
		"\u009c\7\62\2\2\u009c.\3\2\2\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2\2"+
		"\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a3"+
		"\5\61\30\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\60\3\2\2\2\u00a4"+
		"\u00a6\t\6\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\31\5\2\u00ac\64\3\2\2\2\u00ad\u00b1\5\67\33\2\u00ae"+
		"\u00b0\59\34\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\66\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5"+
		"\t\7\2\2\u00b58\3\2\2\2\u00b6\u00b9\5\67\33\2\u00b7\u00b9\t\b\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9:\3\2\2\2\u00ba\u00bc\t\2\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\35\6\2\u00c0<\3\2\2\2\u00c1"+
		"\u00c2\5%\22\2\u00c2\u00c3\5\25\n\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b"+
		"\36\2\2\u00c5>\3\2\2\2\u00c6\u00c7\5\t\4\2\u00c7@\3\2\2\2\u00c8\u00ca"+
		"\5C!\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7)\2\2\u00ce\u00d3\7)\2\2\u00cf"+
		"\u00d0\7&\2\2\u00d0\u00d3\7&\2\2\u00d1\u00d3\n\t\2\2\u00d2\u00cd\3\2\2"+
		"\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3D\3\2\2\2\u00d4\u00d5"+
		"\7)\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\"\3\2\u00d7F\3\2\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b#\3\2\u00dbH\3\2\2\2\u00dc\u00df"+
		"\5-\26\2\u00dd\u00df\5/\27\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"J\3\2\2\2\u00e0\u00e1\5\'\23\2\u00e1L\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b&\5\2\u00e5N\3\2\2\2\20\2\3\4_\u0099\u009e"+
		"\u00a2\u00a7\u00b1\u00b8\u00bd\u00cb\u00d2\u00de\7\7\2\2\6\2\2\7\4\2\7"+
		"\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}