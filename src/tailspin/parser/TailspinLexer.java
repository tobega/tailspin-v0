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
		StartComment=1, Stdout=2, Stdin=3, Def=4, Dereference=5, StartArrayDereference=6, 
		FieldDereference=7, FieldArrayDereference=8, To=9, ResultMarker=10, Colon=11, 
		Comma=12, Deconstructor=13, LeftParen=14, RightParen=15, LeftBracket=16, 
		RightBracket=17, LeftBrace=18, RightBrace=19, Key=20, StartMatcher=21, 
		StartTemplatesDefinition=22, EndDefinition=23, TemplateMatch=24, StartDereference=25, 
		Range=26, AdditiveOperator=27, MultiplicativeOperator=28, Zero=29, NonZeroInteger=30, 
		START_STRING=31, IDENTIFIER=32, WS=33, StartStringEvaluate=34, StartStringInterpolate=35, 
		STRING_TEXT=36, END_STRING=37, EndInterpolate=38, InterpolateArray=39, 
		InterpolateIdentifier=40, InterpolateField=41, StartSubMatcher=42, EndMatcher=43, 
		InvertMatch=44, MatchInteger=45, RangeMatch=46, START_REGEXP=47, StartStructureMatch=48, 
		EndStructureMatch=49, StructureKey=50, MatchDereference=51, MatchArrayDereference=52, 
		MatchFieldDereference=53, MatcherIgnoreWS=54, Comment=55;
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
			"StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
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
			null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
			null, "':'", "','", "'...'", null, "')'", "'['", "']'", "'{'", "'}'", 
			null, null, "'templates'", "'end'", "'#'", null, "'..'", null, null, 
			"'0'", null, null, null, null, "'$('", null, null, null, "';'", null, 
			null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0170\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u009a\n\6\3\6"+
		"\5\6\u009d\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\5\35\u00ec\n\35\3\36\3\36\3\37\5\37\u00f1"+
		"\n\37\3\37\3\37\5\37\u00f5\n\37\3 \6 \u00f8\n \r \16 \u00f9\3!\3!\3!\3"+
		"!\3\"\3\"\7\"\u0102\n\"\f\"\16\"\u0105\13\"\3#\3#\3$\3$\5$\u010b\n$\3"+
		"%\6%\u010e\n%\r%\16%\u010f\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\6("+
		"\u011e\n(\r(\16(\u011f\3)\3)\3)\3)\3)\5)\u0127\n)\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\5\62\u0145\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\38\58\u0156\n8\38\58\u0159\n8\39\39\39\39\3:\3:"+
		"\3;\3;\3;\3;\3<\7<\u0166\n<\f<\16<\u0169\13<\3<\5<\u016c\n<\3<\3<\3<\2"+
		"\2=\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!"+
		"\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?"+
		"\37A C\2E!G\"I\2K\2M#O$Q%S&U\2W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64"+
		"s\65u\66w\67y8{9\7\2\3\4\5\6\f\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61"+
		"\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\2\u0177\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3"+
		"S\3\2\2\2\3W\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\5a\3"+
		"\2\2\2\5c\3\2\2\2\5e\3\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2"+
		"\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\6"+
		"{\3\2\2\2\7}\3\2\2\2\t\u0083\3\2\2\2\13\u008a\3\2\2\2\r\u0090\3\2\2\2"+
		"\17\u0096\3\2\2\2\21\u009e\3\2\2\2\23\u00a3\3\2\2\2\25\u00a6\3\2\2\2\27"+
		"\u00ac\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2\35\u00b3\3\2\2\2\37\u00b5"+
		"\3\2\2\2!\u00b9\3\2\2\2#\u00bd\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2"+
		")\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cc\3\2\2\2\61\u00d0"+
		"\3\2\2\2\63\u00da\3\2\2\2\65\u00de\3\2\2\2\67\u00e0\3\2\2\29\u00e2\3\2"+
		"\2\2;\u00e5\3\2\2\2=\u00eb\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00f7"+
		"\3\2\2\2E\u00fb\3\2\2\2G\u00ff\3\2\2\2I\u0106\3\2\2\2K\u010a\3\2\2\2M"+
		"\u010d\3\2\2\2O\u0113\3\2\2\2Q\u0118\3\2\2\2S\u011d\3\2\2\2U\u0126\3\2"+
		"\2\2W\u0128\3\2\2\2Y\u012c\3\2\2\2[\u0130\3\2\2\2]\u0134\3\2\2\2_\u0136"+
		"\3\2\2\2a\u0138\3\2\2\2c\u013c\3\2\2\2e\u0140\3\2\2\2g\u0144\3\2\2\2i"+
		"\u0146\3\2\2\2k\u0148\3\2\2\2m\u014c\3\2\2\2o\u014e\3\2\2\2q\u0150\3\2"+
		"\2\2s\u0152\3\2\2\2u\u015a\3\2\2\2w\u015e\3\2\2\2y\u0160\3\2\2\2{\u0167"+
		"\3\2\2\2}~\7\61\2\2~\177\7\61\2\2\177\u0080\3\2\2\2\u0080\u0081\b\2\2"+
		"\2\u0081\u0082\b\2\3\2\u0082\b\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7v\2\2\u0085\u0086\7f\2\2\u0086\u0087\7q\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7v\2\2\u0089\n\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c"+
		"\u008d\7f\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\f\3\2\2\2\u0090"+
		"\u0091\7f\2\2\u0091\u0092\7g\2\2\u0092\u0093\7h\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\u0095\t\2\2\2\u0095\16\3\2\2\2\u0096\u009c\5\67\32\2\u0097\u0099"+
		"\5\33\f\2\u0098\u009a\5G\"\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009d\5G\"\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\20\3\2\2\2\u009e\u009f\5\17\6\2\u009f\u00a0\5!\17\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\b\7\4\2\u00a2\22\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4"+
		"\u00a5\5G\"\2\u00a5\24\3\2\2\2\u00a6\u00a7\7\60\2\2\u00a7\u00a8\5G\"\2"+
		"\u00a8\u00a9\5!\17\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\t\4\2\u00ab\26"+
		"\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7@\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\34\3\2\2\2\u00b3"+
		"\u00b4\7.\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\u00b7\7\60\2"+
		"\2\u00b7\u00b8\7\60\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\b\17\4\2\u00bc\"\3\2\2\2\u00bd\u00be\7+\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\b\20\5\2\u00c0$\3\2\2\2\u00c1\u00c2\7]\2\2"+
		"\u00c2&\3\2\2\2\u00c3\u00c4\7_\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6"+
		"*\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8,\3\2\2\2\u00c9\u00ca\5G\"\2\u00ca"+
		"\u00cb\5\33\f\2\u00cb.\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cf\b\26\6\2\u00cf\60\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7u\2\2"+
		"\u00d9\62\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7"+
		"f\2\2\u00dd\64\3\2\2\2\u00de\u00df\7%\2\2\u00df\66\3\2\2\2\u00e0\u00e1"+
		"\7&\2\2\u00e18\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7\60\2\2\u00e4"+
		":\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6<\3\2\2\2\u00e7\u00ec\t\4\2\2\u00e8"+
		"\u00e9\7o\2\2\u00e9\u00ea\7q\2\2\u00ea\u00ec\7f\2\2\u00eb\u00e7\3\2\2"+
		"\2\u00eb\u00e8\3\2\2\2\u00ec>\3\2\2\2\u00ed\u00ee\7\62\2\2\u00ee@\3\2"+
		"\2\2\u00ef\u00f1\7/\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f5\5C \2\u00f4\u00f3\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5B\3\2\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"D\3\2\2\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b!\7\2\u00fe"+
		"F\3\2\2\2\u00ff\u0103\5I#\2\u0100\u0102\5K$\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104H\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0106\u0107\t\7\2\2\u0107J\3\2\2\2\u0108\u010b\5"+
		"I#\2\u0109\u010b\t\b\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"L\3\2\2\2\u010c\u010e\t\2\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\b%\2\2\u0112N\3\2\2\2\u0113\u0114\7&\2\2\u0114\u0115\7*\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\b&\4\2\u0117P\3\2\2\2\u0118\u0119\7&\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\b\'\b\2\u011bR\3\2\2\2\u011c\u011e\5U)\2\u011d\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"T\3\2\2\2\u0121\u0122\7)\2\2\u0122\u0127\7)\2\2\u0123\u0124\7&\2\2\u0124"+
		"\u0127\7&\2\2\u0125\u0127\n\t\2\2\u0126\u0121\3\2\2\2\u0126\u0123\3\2"+
		"\2\2\u0126\u0125\3\2\2\2\u0127V\3\2\2\2\u0128\u0129\7)\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\b*\5\2\u012bX\3\2\2\2\u012c\u012d\7=\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\b+\5\2\u012fZ\3\2\2\2\u0130\u0131\7*\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\b,\4\2\u0133\\\3\2\2\2\u0134\u0135\5G\"\2\u0135^"+
		"\3\2\2\2\u0136\u0137\5\23\b\2\u0137`\3\2\2\2\u0138\u0139\7>\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\b/\6\2\u013bb\3\2\2\2\u013c\u013d\7@\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b\60\5\2\u013fd\3\2\2\2\u0140\u0141\7#\2\2"+
		"\u0141f\3\2\2\2\u0142\u0145\5?\36\2\u0143\u0145\5A\37\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0143\3\2\2\2\u0145h\3\2\2\2\u0146\u0147\59\33\2\u0147j\3"+
		"\2\2\2\u0148\u0149\7)\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\64\7\2\u014b"+
		"l\3\2\2\2\u014c\u014d\5)\23\2\u014dn\3\2\2\2\u014e\u014f\5+\24\2\u014f"+
		"p\3\2\2\2\u0150\u0151\5-\25\2\u0151r\3\2\2\2\u0152\u0158\5\67\32\2\u0153"+
		"\u0155\5\33\f\2\u0154\u0156\5G\"\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0159\5G\"\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159t\3\2\2\2\u015a\u015b\7*\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\b9\4\2\u015dv\3\2\2\2\u015e\u015f\5\23\b\2\u015fx\3\2\2\2\u0160"+
		"\u0161\5M%\2\u0161\u0162\3\2\2\2\u0162\u0163\b;\2\2\u0163z\3\2\2\2\u0164"+
		"\u0166\n\n\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016c\t\13\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b"+
		"<\2\2\u016e\u016f\b<\5\2\u016f|\3\2\2\2\27\2\3\4\5\6\u0099\u009c\u00eb"+
		"\u00f0\u00f4\u00f9\u0103\u010a\u010f\u011f\u0126\u0144\u0155\u0158\u0167"+
		"\u016b\t\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\3\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}