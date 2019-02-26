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
		StartComment=1, Stdout=2, Def=3, Dereference=4, StartArrayDereference=5, 
		FieldDereference=6, FieldArrayDereference=7, To=8, ResultMarker=9, Colon=10, 
		Comma=11, Deconstructor=12, LeftParen=13, RightParen=14, LeftBracket=15, 
		RightBracket=16, LeftBrace=17, RightBrace=18, Key=19, StartMatcher=20, 
		StartTemplatesDefinition=21, EndDefinition=22, TemplateMatch=23, StartDereference=24, 
		Range=25, AdditiveOperator=26, MultiplicativeOperator=27, Zero=28, NonZeroInteger=29, 
		START_STRING=30, IDENTIFIER=31, WS=32, StartStringEvaluate=33, StartStringInterpolate=34, 
		STRING_TEXT=35, END_STRING=36, EndInterpolate=37, InterpolateArray=38, 
		InterpolateIdentifier=39, InterpolateField=40, StartSubMatcher=41, EndMatcher=42, 
		InvertMatch=43, MatchInteger=44, RangeMatch=45, START_REGEXP=46, StartStructureMatch=47, 
		EndStructureMatch=48, StructureKey=49, MatchDereference=50, MatchArrayDereference=51, 
		MatchFieldDereference=52, MatcherIgnoreWS=53, Comment=54;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3, COMMENT_MODE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER", "COMMENT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Stdout", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"EndInterpolate", "InterpolateArray", "InterpolateIdentifier", "InterpolateField", 
			"StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", "RangeMatch", 
			"START_REGEXP", "StartStructureMatch", "EndStructureMatch", "StructureKey", 
			"MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", null, null, null, null, null, "'->'", null, 
			"':'", "','", "'...'", null, "')'", "'['", "']'", "'{'", "'}'", null, 
			null, "'templates'", "'end'", "'#'", null, "'..'", null, null, "'0'", 
			null, null, null, null, "'$('", null, null, null, "';'", null, null, 
			null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0168\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\5\5\u0092\n\5\3\5\5\5\u0095\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u00e4\n\34\3\35\3\35\3\36\5\36\u00e9\n\36\3\36\3\36\5\36\u00ed\n\36\3"+
		"\37\6\37\u00f0\n\37\r\37\16\37\u00f1\3 \3 \3 \3 \3!\3!\7!\u00fa\n!\f!"+
		"\16!\u00fd\13!\3\"\3\"\3#\3#\5#\u0103\n#\3$\6$\u0106\n$\r$\16$\u0107\3"+
		"$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\6\'\u0116\n\'\r\'\16\'\u0117\3(\3"+
		"(\3(\3(\3(\5(\u011f\n(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\5\61\u013d\n\61\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67"+
		"\u014e\n\67\3\67\5\67\u0151\n\67\38\38\38\38\39\39\3:\3:\3:\3:\3;\7;\u015e"+
		"\n;\f;\16;\u0161\13;\3;\5;\u0164\n;\3;\3;\3;\2\2<\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A\2C E!G\2I\2K\"M#O$Q"+
		"%S\2U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8\7\2\3\4\5"+
		"\6\f\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4"+
		"\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\2\u016f\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K"+
		"\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3U\3\2\2\2\4W\3\2\2\2\4Y\3\2"+
		"\2\2\4[\3\2\2\2\4]\3\2\2\2\5_\3\2\2\2\5a\3\2\2\2\5c\3\2\2\2\5e\3\2\2\2"+
		"\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s"+
		"\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\6y\3\2\2\2\7{\3\2\2\2\t\u0081\3\2\2\2\13"+
		"\u0088\3\2\2\2\r\u008e\3\2\2\2\17\u0096\3\2\2\2\21\u009b\3\2\2\2\23\u009e"+
		"\3\2\2\2\25\u00a4\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3"+
		"\2\2\2\35\u00ad\3\2\2\2\37\u00b1\3\2\2\2!\u00b5\3\2\2\2#\u00b9\3\2\2\2"+
		"%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c1\3\2\2\2-\u00c4\3"+
		"\2\2\2/\u00c8\3\2\2\2\61\u00d2\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2"+
		"\2\67\u00da\3\2\2\29\u00dd\3\2\2\2;\u00e3\3\2\2\2=\u00e5\3\2\2\2?\u00e8"+
		"\3\2\2\2A\u00ef\3\2\2\2C\u00f3\3\2\2\2E\u00f7\3\2\2\2G\u00fe\3\2\2\2I"+
		"\u0102\3\2\2\2K\u0105\3\2\2\2M\u010b\3\2\2\2O\u0110\3\2\2\2Q\u0115\3\2"+
		"\2\2S\u011e\3\2\2\2U\u0120\3\2\2\2W\u0124\3\2\2\2Y\u0128\3\2\2\2[\u012c"+
		"\3\2\2\2]\u012e\3\2\2\2_\u0130\3\2\2\2a\u0134\3\2\2\2c\u0138\3\2\2\2e"+
		"\u013c\3\2\2\2g\u013e\3\2\2\2i\u0140\3\2\2\2k\u0144\3\2\2\2m\u0146\3\2"+
		"\2\2o\u0148\3\2\2\2q\u014a\3\2\2\2s\u0152\3\2\2\2u\u0156\3\2\2\2w\u0158"+
		"\3\2\2\2y\u015f\3\2\2\2{|\7\61\2\2|}\7\61\2\2}~\3\2\2\2~\177\b\2\2\2\177"+
		"\u0080\b\2\3\2\u0080\b\3\2\2\2\u0081\u0082\7u\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7q\2\2\u0085\u0086\7w\2\2\u0086\u0087\7v\2\2"+
		"\u0087\n\3\2\2\2\u0088\u0089\7f\2\2\u0089\u008a\7g\2\2\u008a\u008b\7h"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\t\2\2\2\u008d\f\3\2\2\2\u008e\u0094"+
		"\5\65\31\2\u008f\u0091\5\31\13\2\u0090\u0092\5E!\2\u0091\u0090\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0095\5E!\2\u0094\u008f"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\16\3\2\2\2\u0096\u0097\5\r\5\2\u0097"+
		"\u0098\5\37\16\2\u0098\u0099\3\2\2\2\u0099\u009a\b\6\4\2\u009a\20\3\2"+
		"\2\2\u009b\u009c\7\60\2\2\u009c\u009d\5E!\2\u009d\22\3\2\2\2\u009e\u009f"+
		"\7\60\2\2\u009f\u00a0\5E!\2\u00a0\u00a1\5\37\16\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a3\b\b\4\2\u00a3\24\3\2\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7"+
		"@\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\30\3\2\2\2\u00a9\u00aa"+
		"\7<\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7.\2\2\u00ac\34\3\2\2\2\u00ad\u00ae"+
		"\7\60\2\2\u00ae\u00af\7\60\2\2\u00af\u00b0\7\60\2\2\u00b0\36\3\2\2\2\u00b1"+
		"\u00b2\7*\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\16\4\2\u00b4 \3\2\2\2"+
		"\u00b5\u00b6\7+\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\17\5\2\u00b8\"\3"+
		"\2\2\2\u00b9\u00ba\7]\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc&\3\2"+
		"\2\2\u00bd\u00be\7}\2\2\u00be(\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0*\3"+
		"\2\2\2\u00c1\u00c2\5E!\2\u00c2\u00c3\5\31\13\2\u00c3,\3\2\2\2\u00c4\u00c5"+
		"\7>\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\25\6\2\u00c7.\3\2\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7r\2\2"+
		"\u00cc\u00cd\7n\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7u\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4\u00d5\7f\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7\64"+
		"\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9\66\3\2\2\2\u00da\u00db\7\60\2\2\u00db"+
		"\u00dc\7\60\2\2\u00dc8\3\2\2\2\u00dd\u00de\t\3\2\2\u00de:\3\2\2\2\u00df"+
		"\u00e4\t\4\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e4\7f\2"+
		"\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4<\3\2\2\2\u00e5\u00e6"+
		"\7\62\2\2\u00e6>\3\2\2\2\u00e7\u00e9\7/\2\2\u00e8\u00e7\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\t\5\2\2\u00eb\u00ed\5A"+
		"\37\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed@\3\2\2\2\u00ee\u00f0"+
		"\t\6\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b \7\2\u00f6D\3\2\2\2\u00f7\u00fb\5G\"\2\u00f8\u00fa\5I#\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fcF\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\t\7\2\2\u00ffH\3\2"+
		"\2\2\u0100\u0103\5G\"\2\u0101\u0103\t\b\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103J\3\2\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\b$\2\2\u010aL\3\2\2\2\u010b\u010c\7&\2\2\u010c\u010d"+
		"\7*\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b%\4\2\u010fN\3\2\2\2\u0110\u0111"+
		"\7&\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b&\b\2\u0113P\3\2\2\2\u0114\u0116"+
		"\5S(\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118R\3\2\2\2\u0119\u011a\7)\2\2\u011a\u011f\7)\2\2\u011b"+
		"\u011c\7&\2\2\u011c\u011f\7&\2\2\u011d\u011f\n\t\2\2\u011e\u0119\3\2\2"+
		"\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011fT\3\2\2\2\u0120\u0121"+
		"\7)\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b)\5\2\u0123V\3\2\2\2\u0124\u0125"+
		"\7=\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b*\5\2\u0127X\3\2\2\2\u0128\u0129"+
		"\7*\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b+\4\2\u012bZ\3\2\2\2\u012c\u012d"+
		"\5E!\2\u012d\\\3\2\2\2\u012e\u012f\5\21\7\2\u012f^\3\2\2\2\u0130\u0131"+
		"\7>\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b.\6\2\u0133`\3\2\2\2\u0134\u0135"+
		"\7@\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b/\5\2\u0137b\3\2\2\2\u0138\u0139"+
		"\7#\2\2\u0139d\3\2\2\2\u013a\u013d\5=\35\2\u013b\u013d\5?\36\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013b\3\2\2\2\u013df\3\2\2\2\u013e\u013f\5\67\32\2\u013f"+
		"h\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b\63\7\2"+
		"\u0143j\3\2\2\2\u0144\u0145\5\'\22\2\u0145l\3\2\2\2\u0146\u0147\5)\23"+
		"\2\u0147n\3\2\2\2\u0148\u0149\5+\24\2\u0149p\3\2\2\2\u014a\u0150\5\65"+
		"\31\2\u014b\u014d\5\31\13\2\u014c\u014e\5E!\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0151\5E!\2\u0150\u014b\3\2\2"+
		"\2\u0150\u014f\3\2\2\2\u0151r\3\2\2\2\u0152\u0153\7*\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0155\b8\4\2\u0155t\3\2\2\2\u0156\u0157\5\21\7\2\u0157v\3"+
		"\2\2\2\u0158\u0159\5K$\2\u0159\u015a\3\2\2\2\u015a\u015b\b:\2\2\u015b"+
		"x\3\2\2\2\u015c\u015e\n\n\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2"+
		"\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0164\t\13\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2"+
		"\u0165\u0166\b;\2\2\u0166\u0167\b;\5\2\u0167z\3\2\2\2\27\2\3\4\5\6\u0091"+
		"\u0094\u00e3\u00e8\u00ec\u00f1\u00fb\u0102\u0107\u0117\u011e\u013c\u014d"+
		"\u0150\u015f\u0163\t\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\3\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}