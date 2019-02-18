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
		END_STRING=32, StartSubMatcher=33, EndMatcher=34, MatchInteger=35, RangeMatch=36, 
		START_REGEXP=37, StartStructureMatch=38, EndStructureMatch=39, StructureKey=40, 
		MatcherIgnoreWS=41;
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
			"StringDereference", "STRING_TEXT", "STRING_CHAR", "END_STRING", "StartSubMatcher", 
			"EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StructureKey", "MatcherIgnoreWS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "','", "'...'", "';'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", "'end'", 
			"'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, null, 
			null, null, null, null, "'>'"
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
			"StartSubMatcher", "EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StructureKey", "MatcherIgnoreWS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u010b\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00b1\n\30\3\31\3\31"+
		"\3\32\5\32\u00b6\n\32\3\32\3\32\5\32\u00ba\n\32\3\33\6\33\u00bd\n\33\r"+
		"\33\16\33\u00be\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00c7\n\35\f\35\16"+
		"\35\u00ca\13\35\3\36\3\36\3\37\3\37\5\37\u00d0\n\37\3 \6 \u00d3\n \r "+
		"\16 \u00d4\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\6#\u00e1\n#\r#\16#\u00e2\3"+
		"$\3$\3$\3$\3$\5$\u00ea\n$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\5(\u00fa\n(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\2\2/\5\3"+
		"\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21"+
		"#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\29\34;\35=\2?\2A\36"+
		"C\37E G!I\2K\"M#O$Q%S&U\'W(Y)[*]+\5\2\3\4\n\5\2\13\f\17\17\"\"\4\2--/"+
		"/\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u0110\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\3E\3"+
		"\2\2\2\3G\3\2\2\2\3K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2"+
		"\2\4U\3\2\2\2\4W\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\5_\3\2\2\2\7"+
		"f\3\2\2\2\tl\3\2\2\2\13q\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23"+
		"|\3\2\2\2\25~\3\2\2\2\27\u0082\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2"+
		"\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#\u0091\3\2\2\2%\u0095"+
		"\3\2\2\2\'\u009f\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2"+
		"/\u00aa\3\2\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b5\3\2\2\2\67"+
		"\u00bc\3\2\2\29\u00c0\3\2\2\2;\u00c4\3\2\2\2=\u00cb\3\2\2\2?\u00cf\3\2"+
		"\2\2A\u00d2\3\2\2\2C\u00d8\3\2\2\2E\u00dd\3\2\2\2G\u00e0\3\2\2\2I\u00e9"+
		"\3\2\2\2K\u00eb\3\2\2\2M\u00ef\3\2\2\2O\u00f3\3\2\2\2Q\u00f9\3\2\2\2S"+
		"\u00fb\3\2\2\2U\u00fd\3\2\2\2W\u0101\3\2\2\2Y\u0103\3\2\2\2[\u0105\3\2"+
		"\2\2]\u0107\3\2\2\2_`\7u\2\2`a\7v\2\2ab\7f\2\2bc\7q\2\2cd\7w\2\2de\7v"+
		"\2\2e\6\3\2\2\2fg\7f\2\2gh\7g\2\2hi\7h\2\2ij\3\2\2\2jk\t\2\2\2k\b\3\2"+
		"\2\2lm\5+\25\2mo\5;\35\2np\5\23\t\2on\3\2\2\2op\3\2\2\2p\n\3\2\2\2qr\7"+
		"/\2\2rs\7@\2\2s\f\3\2\2\2tu\7<\2\2u\16\3\2\2\2vw\7.\2\2w\20\3\2\2\2xy"+
		"\7\60\2\2yz\7\60\2\2z{\7\60\2\2{\22\3\2\2\2|}\7=\2\2}\24\3\2\2\2~\177"+
		"\7*\2\2\177\u0080\3\2\2\2\u0080\u0081\b\n\2\2\u0081\26\3\2\2\2\u0082\u0083"+
		"\7+\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\13\3\2\u0085\30\3\2\2\2\u0086"+
		"\u0087\7]\2\2\u0087\32\3\2\2\2\u0088\u0089\7_\2\2\u0089\34\3\2\2\2\u008a"+
		"\u008b\7}\2\2\u008b\36\3\2\2\2\u008c\u008d\7\177\2\2\u008d \3\2\2\2\u008e"+
		"\u008f\5;\35\2\u008f\u0090\5\r\6\2\u0090\"\3\2\2\2\u0091\u0092\7>\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\b\21\4\2\u0094$\3\2\2\2\u0095\u0096\7"+
		"v\2\2\u0096\u0097\7g\2\2\u0097\u0098\7o\2\2\u0098\u0099\7r\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7u\2\2\u009e&\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7%\2\2\u00a4*\3\2\2\2\u00a5\u00a6"+
		"\7&\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\7\60\2\2\u00a9"+
		".\3\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\60\3\2\2\2\u00ac\u00b1\t\4\2\2\u00ad"+
		"\u00ae\7o\2\2\u00ae\u00af\7q\2\2\u00af\u00b1\7f\2\2\u00b0\u00ac\3\2\2"+
		"\2\u00b0\u00ad\3\2\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7\62\2\2\u00b3\64"+
		"\3\2\2\2\u00b4\u00b6\7/\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00ba\5\67\33\2\u00b9\u00b8\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\66\3\2\2\2\u00bb\u00bd\t\6\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3"+
		"\b\34\5\2\u00c3:\3\2\2\2\u00c4\u00c8\5=\36\2\u00c5\u00c7\5?\37\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9<\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\7\2\2\u00cc>\3\2"+
		"\2\2\u00cd\u00d0\5=\36\2\u00ce\u00d0\t\b\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0@\3\2\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\b \6\2\u00d7B\3\2\2\2\u00d8\u00d9\5+\25\2\u00d9\u00da"+
		"\5\25\n\2\u00da\u00db\3\2\2\2\u00db\u00dc\b!\2\2\u00dcD\3\2\2\2\u00dd"+
		"\u00de\5\t\4\2\u00deF\3\2\2\2\u00df\u00e1\5I$\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3H\3\2\2\2"+
		"\u00e4\u00e5\7)\2\2\u00e5\u00ea\7)\2\2\u00e6\u00e7\7&\2\2\u00e7\u00ea"+
		"\7&\2\2\u00e8\u00ea\n\t\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00eaJ\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b%\3\2\u00eeL\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b&\4\2\u00f2N\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b\'\3\2\u00f6P\3\2\2\2\u00f7\u00fa\5\63\31\2\u00f8\u00fa\5\65\32"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faR\3\2\2\2\u00fb\u00fc"+
		"\5-\26\2\u00fcT\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\b*\5\2\u0100V\3\2\2\2\u0101\u0102\5\35\16\2\u0102X\3\2\2\2\u0103\u0104"+
		"\5\37\17\2\u0104Z\3\2\2\2\u0105\u0106\5!\20\2\u0106\\\3\2\2\2\u0107\u0108"+
		"\5A \2\u0108\u0109\3\2\2\2\u0109\u010a\b.\6\2\u010a^\3\2\2\2\20\2\3\4"+
		"o\u00b0\u00b5\u00b9\u00be\u00c8\u00cf\u00d4\u00e2\u00e9\u00f9\7\7\2\2"+
		"\6\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}