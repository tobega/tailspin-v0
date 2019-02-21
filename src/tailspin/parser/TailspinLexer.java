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
		Stdout=1, Def=2, Dereference=3, FieldDereference=4, To=5, ResultMarker=6, 
		Colon=7, Comma=8, Deconstructor=9, LeftParen=10, RightParen=11, LeftBracket=12, 
		RightBracket=13, LeftBrace=14, RightBrace=15, Key=16, StartMatcher=17, 
		StartTemplatesDefinition=18, EndDefinition=19, TemplateMatch=20, StartDereference=21, 
		Range=22, AdditiveOperator=23, MultiplicativeOperator=24, Zero=25, NonZeroInteger=26, 
		START_STRING=27, IDENTIFIER=28, WS=29, StartStringEvaluate=30, StartStringInterpolate=31, 
		STRING_TEXT=32, END_STRING=33, EndInterpolate=34, InterpolateArray=35, 
		InterpolateIdentifier=36, InterpolateField=37, StartSubMatcher=38, EndMatcher=39, 
		MatchInteger=40, RangeMatch=41, START_REGEXP=42, StartStructureMatch=43, 
		EndStructureMatch=44, StructureKey=45, MatcherIgnoreWS=46;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Stdout", "Def", "Dereference", "FieldDereference", "To", "ResultMarker", 
			"Colon", "Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"EndInterpolate", "InterpolateArray", "InterpolateIdentifier", "InterpolateField", 
			"StartSubMatcher", "EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StructureKey", "MatcherIgnoreWS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, null, "'->'", "'!'", "':'", "','", "'...'", 
			null, "')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", "'end'", 
			"'#'", null, "'..'", null, null, "'0'", null, null, null, null, "'$('", 
			null, null, null, "';'", null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "FieldDereference", "To", "ResultMarker", 
			"Colon", "Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "StartSubMatcher", "EndMatcher", "MatchInteger", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StructureKey", "MatcherIgnoreWS"
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


	  boolean inStringDereference = false;


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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u012a\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\5\4{\n\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3\32"+
		"\3\32\3\33\5\33\u00c7\n\33\3\33\3\33\5\33\u00cb\n\33\3\34\6\34\u00ce\n"+
		"\34\r\34\16\34\u00cf\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00d8\n\36\f\36"+
		"\16\36\u00db\13\36\3\37\3\37\3 \3 \5 \u00e1\n \3!\6!\u00e4\n!\r!\16!\u00e5"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\6$\u00f4\n$\r$\16$\u00f5\3%"+
		"\3%\3%\3%\3%\5%\u00fd\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\5-\u0119\n-\3.\3.\3/\3/\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\2\2\64\6\3\b\4\n\5\f"+
		"\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24"+
		"*\25,\26.\27\60\30\62\31\64\32\66\338\34:\2<\35>\36@\2B\2D\37F H!J\"L"+
		"\2N#P$R%T&V\'X(Z)\\*^+`,b-d.f/h\60\6\2\3\4\5\n\5\2\13\f\17\17\"\"\4\2"+
		"--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u012f\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2"+
		"\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2"+
		"\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2"+
		"\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2"+
		"\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2D\3\2\2\2"+
		"\3F\3\2\2\2\3H\3\2\2\2\3J\3\2\2\2\3N\3\2\2\2\4P\3\2\2\2\4R\3\2\2\2\4T"+
		"\3\2\2\2\4V\3\2\2\2\5X\3\2\2\2\5Z\3\2\2\2\5\\\3\2\2\2\5^\3\2\2\2\5`\3"+
		"\2\2\2\5b\3\2\2\2\5d\3\2\2\2\5f\3\2\2\2\5h\3\2\2\2\6j\3\2\2\2\bq\3\2\2"+
		"\2\nw\3\2\2\2\f\177\3\2\2\2\16\u0082\3\2\2\2\20\u0085\3\2\2\2\22\u0087"+
		"\3\2\2\2\24\u0089\3\2\2\2\26\u008b\3\2\2\2\30\u008f\3\2\2\2\32\u0093\3"+
		"\2\2\2\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2\2"+
		"\2$\u009f\3\2\2\2&\u00a2\3\2\2\2(\u00a6\3\2\2\2*\u00b0\3\2\2\2,\u00b4"+
		"\3\2\2\2.\u00b6\3\2\2\2\60\u00b8\3\2\2\2\62\u00bb\3\2\2\2\64\u00c1\3\2"+
		"\2\2\66\u00c3\3\2\2\28\u00c6\3\2\2\2:\u00cd\3\2\2\2<\u00d1\3\2\2\2>\u00d5"+
		"\3\2\2\2@\u00dc\3\2\2\2B\u00e0\3\2\2\2D\u00e3\3\2\2\2F\u00e9\3\2\2\2H"+
		"\u00ee\3\2\2\2J\u00f3\3\2\2\2L\u00fc\3\2\2\2N\u00fe\3\2\2\2P\u0102\3\2"+
		"\2\2R\u0106\3\2\2\2T\u010a\3\2\2\2V\u010c\3\2\2\2X\u010e\3\2\2\2Z\u0112"+
		"\3\2\2\2\\\u0118\3\2\2\2^\u011a\3\2\2\2`\u011c\3\2\2\2b\u0120\3\2\2\2"+
		"d\u0122\3\2\2\2f\u0124\3\2\2\2h\u0126\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7f\2"+
		"\2mn\7q\2\2no\7w\2\2op\7v\2\2p\7\3\2\2\2qr\7f\2\2rs\7g\2\2st\7h\2\2tu"+
		"\3\2\2\2uv\t\2\2\2v\t\3\2\2\2w}\5.\26\2xz\5\22\b\2y{\5>\36\2zy\3\2\2\2"+
		"z{\3\2\2\2{~\3\2\2\2|~\5>\36\2}x\3\2\2\2}|\3\2\2\2~\13\3\2\2\2\177\u0080"+
		"\7\60\2\2\u0080\u0081\5>\36\2\u0081\r\3\2\2\2\u0082\u0083\7/\2\2\u0083"+
		"\u0084\7@\2\2\u0084\17\3\2\2\2\u0085\u0086\7#\2\2\u0086\21\3\2\2\2\u0087"+
		"\u0088\7<\2\2\u0088\23\3\2\2\2\u0089\u008a\7.\2\2\u008a\25\3\2\2\2\u008b"+
		"\u008c\7\60\2\2\u008c\u008d\7\60\2\2\u008d\u008e\7\60\2\2\u008e\27\3\2"+
		"\2\2\u008f\u0090\7*\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\13\2\2\u0092"+
		"\31\3\2\2\2\u0093\u0094\7+\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\f\3\2"+
		"\u0096\33\3\2\2\2\u0097\u0098\7]\2\2\u0098\35\3\2\2\2\u0099\u009a\7_\2"+
		"\2\u009a\37\3\2\2\2\u009b\u009c\7}\2\2\u009c!\3\2\2\2\u009d\u009e\7\177"+
		"\2\2\u009e#\3\2\2\2\u009f\u00a0\5>\36\2\u00a0\u00a1\5\22\b\2\u00a1%\3"+
		"\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\22\4\2\u00a5"+
		"\'\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7u\2\2\u00af)\3\2\2\2\u00b0\u00b1\7g\2"+
		"\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2\2\u00b3+\3\2\2\2\u00b4\u00b5\7"+
		"%\2\2\u00b5-\3\2\2\2\u00b6\u00b7\7&\2\2\u00b7/\3\2\2\2\u00b8\u00b9\7\60"+
		"\2\2\u00b9\u00ba\7\60\2\2\u00ba\61\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\63"+
		"\3\2\2\2\u00bd\u00c2\t\4\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c2\7f\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\65\3\2\2\2"+
		"\u00c3\u00c4\7\62\2\2\u00c4\67\3\2\2\2\u00c5\u00c7\7/\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\t\5\2\2\u00c9"+
		"\u00cb\5:\34\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb9\3\2\2\2"+
		"\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0;\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\b\35\5\2\u00d4=\3\2\2\2\u00d5\u00d9\5@\37\2\u00d6"+
		"\u00d8\5B \2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da?\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd"+
		"\t\7\2\2\u00ddA\3\2\2\2\u00de\u00e1\5@\37\2\u00df\u00e1\t\b\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1C\3\2\2\2\u00e2\u00e4\t\2\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b!\6\2\u00e8E\3\2\2\2\u00e9\u00ea"+
		"\7&\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\"\2\2\u00ed"+
		"G\3\2\2\2\u00ee\u00ef\7&\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b#\7\2\u00f1"+
		"I\3\2\2\2\u00f2\u00f4\5L%\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6K\3\2\2\2\u00f7\u00f8\7)\2\2\u00f8"+
		"\u00fd\7)\2\2\u00f9\u00fa\7&\2\2\u00fa\u00fd\7&\2\2\u00fb\u00fd\n\t\2"+
		"\2\u00fc\u00f7\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fdM"+
		"\3\2\2\2\u00fe\u00ff\7)\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b&\3\2\u0101"+
		"O\3\2\2\2\u0102\u0103\7=\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\'\3\2\u0105"+
		"Q\3\2\2\2\u0106\u0107\7*\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b(\2\2\u0109"+
		"S\3\2\2\2\u010a\u010b\5>\36\2\u010bU\3\2\2\2\u010c\u010d\5\f\5\2\u010d"+
		"W\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b+\4\2\u0111"+
		"Y\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b,\3\2\u0115"+
		"[\3\2\2\2\u0116\u0119\5\66\32\2\u0117\u0119\58\33\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0117\3\2\2\2\u0119]\3\2\2\2\u011a\u011b\5\60\27\2\u011b_\3\2"+
		"\2\2\u011c\u011d\7)\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b/\5\2\u011fa"+
		"\3\2\2\2\u0120\u0121\5 \17\2\u0121c\3\2\2\2\u0122\u0123\5\"\20\2\u0123"+
		"e\3\2\2\2\u0124\u0125\5$\21\2\u0125g\3\2\2\2\u0126\u0127\5D!\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\b\63\6\2\u0129i\3\2\2\2\22\2\3\4\5z}\u00c1\u00c6"+
		"\u00ca\u00cf\u00d9\u00e0\u00e5\u00f5\u00fc\u0118\b\7\2\2\6\2\2\7\5\2\7"+
		"\3\2\b\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}