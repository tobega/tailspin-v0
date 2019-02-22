// Generated from TailspinLexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Stdout=2, Def=3, Dereference=4, FieldDereference=5, To=6, 
		ResultMarker=7, Colon=8, Comma=9, Deconstructor=10, LeftParen=11, RightParen=12, 
		LeftBracket=13, RightBracket=14, LeftBrace=15, RightBrace=16, Key=17, 
		StartMatcher=18, StartTemplatesDefinition=19, EndDefinition=20, TemplateMatch=21, 
		StartDereference=22, Range=23, AdditiveOperator=24, MultiplicativeOperator=25, 
		Zero=26, NonZeroInteger=27, START_STRING=28, IDENTIFIER=29, WS=30, StartStringEvaluate=31, 
		StartStringInterpolate=32, STRING_TEXT=33, END_STRING=34, EndInterpolate=35, 
		InterpolateArray=36, InterpolateIdentifier=37, InterpolateField=38, StartSubMatcher=39, 
		EndMatcher=40, MatchInteger=41, RangeMatch=42, START_REGEXP=43, StartStructureMatch=44, 
		EndStructureMatch=45, StructureKey=46, MatchDereference=47, MatchArrayDereference=48, 
		MatchFieldDereference=49, MatcherIgnoreWS=50, Comment=51;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3, COMMENT_MODE=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER", "COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"StartComment", "Stdout", "Def", "Dereference", "FieldDereference", "To", 
		"ResultMarker", "Colon", "Comma", "Deconstructor", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", 
		"StartTemplatesDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
		"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
		"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
		"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
		"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
		"InterpolateField", "StartSubMatcher", "EndMatcher", "MatchInteger", "RangeMatch", 
		"START_REGEXP", "StartStructureMatch", "EndStructureMatch", "StructureKey", 
		"MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
		"MatcherIgnoreWS", "Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", null, null, null, "'->'", "'!'", "':'", "','", 
		"'...'", null, "')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", 
		"'end'", "'#'", null, "'..'", null, null, "'0'", null, null, null, null, 
		"'$('", null, null, null, "';'", null, null, null, null, "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartComment", "Stdout", "Def", "Dereference", "FieldDereference", 
		"To", "ResultMarker", "Colon", "Comma", "Deconstructor", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Key", "StartMatcher", "StartTemplatesDefinition", "EndDefinition", "TemplateMatch", 
		"StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
		"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
		"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
		"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "StartSubMatcher", 
		"EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
		"EndStructureMatch", "StructureKey", "MatchDereference", "MatchArrayDereference", 
		"MatchFieldDereference", "MatcherIgnoreWS", "Comment"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0155\b\1\b\1"+
		"\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\5\5\u008c\n\5\3\5\5\5\u008f\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32"+
		"\u00d3\n\32\3\33\3\33\3\34\5\34\u00d8\n\34\3\34\3\34\5\34\u00dc\n\34\3"+
		"\35\6\35\u00df\n\35\r\35\16\35\u00e0\3\36\3\36\3\36\3\36\3\37\3\37\7\37"+
		"\u00e9\n\37\f\37\16\37\u00ec\13\37\3 \3 \3!\3!\5!\u00f2\n!\3\"\6\"\u00f5"+
		"\n\"\r\"\16\"\u00f6\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\6%\u0105\n%"+
		"\r%\16%\u0106\3&\3&\3&\3&\3&\5&\u010e\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\5.\u012a\n.\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\5\64"+
		"\u013b\n\64\3\64\5\64\u013e\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\38\78\u014b\n8\f8\168\u014e\138\38\58\u0151\n8\38\38\38"+
		"\2\29\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\2?"+
		"\36A\37C\2E\2G I!K\"M#O\2Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64"+
		"s\65\7\2\3\4\5\6\f\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2"+
		"\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\2\u015c\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\4W"+
		"\3\2\2\2\4Y\3\2\2\2\5[\3\2\2\2\5]\3\2\2\2\5_\3\2\2\2\5a\3\2\2\2\5c\3\2"+
		"\2\2\5e\3\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2\2"+
		"\5q\3\2\2\2\6s\3\2\2\2\7u\3\2\2\2\t{\3\2\2\2\13\u0082\3\2\2\2\r\u0088"+
		"\3\2\2\2\17\u0090\3\2\2\2\21\u0093\3\2\2\2\23\u0096\3\2\2\2\25\u0098\3"+
		"\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2\33\u00a0\3\2\2\2\35\u00a4\3\2"+
		"\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00b3\3\2\2\2+\u00b7\3\2\2\2-\u00c1\3\2\2\2/\u00c5\3\2\2\2\61"+
		"\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cc\3\2\2\2\67\u00d2\3\2\2\29\u00d4"+
		"\3\2\2\2;\u00d7\3\2\2\2=\u00de\3\2\2\2?\u00e2\3\2\2\2A\u00e6\3\2\2\2C"+
		"\u00ed\3\2\2\2E\u00f1\3\2\2\2G\u00f4\3\2\2\2I\u00fa\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0104\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S\u0113\3\2\2\2U\u0117"+
		"\3\2\2\2W\u011b\3\2\2\2Y\u011d\3\2\2\2[\u011f\3\2\2\2]\u0123\3\2\2\2_"+
		"\u0129\3\2\2\2a\u012b\3\2\2\2c\u012d\3\2\2\2e\u0131\3\2\2\2g\u0133\3\2"+
		"\2\2i\u0135\3\2\2\2k\u0137\3\2\2\2m\u013f\3\2\2\2o\u0143\3\2\2\2q\u0145"+
		"\3\2\2\2s\u014c\3\2\2\2uv\7\61\2\2vw\7\61\2\2wx\3\2\2\2xy\b\2\2\2yz\b"+
		"\2\3\2z\b\3\2\2\2{|\7u\2\2|}\7v\2\2}~\7f\2\2~\177\7q\2\2\177\u0080\7w"+
		"\2\2\u0080\u0081\7v\2\2\u0081\n\3\2\2\2\u0082\u0083\7f\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7h\2\2\u0085\u0086\3\2\2\2\u0086\u0087\t\2\2\2\u0087"+
		"\f\3\2\2\2\u0088\u008e\5\61\27\2\u0089\u008b\5\25\t\2\u008a\u008c\5A\37"+
		"\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008f"+
		"\5A\37\2\u008e\u0089\3\2\2\2\u008e\u008d\3\2\2\2\u008f\16\3\2\2\2\u0090"+
		"\u0091\7\60\2\2\u0091\u0092\5A\37\2\u0092\20\3\2\2\2\u0093\u0094\7/\2"+
		"\2\u0094\u0095\7@\2\2\u0095\22\3\2\2\2\u0096\u0097\7#\2\2\u0097\24\3\2"+
		"\2\2\u0098\u0099\7<\2\2\u0099\26\3\2\2\2\u009a\u009b\7.\2\2\u009b\30\3"+
		"\2\2\2\u009c\u009d\7\60\2\2\u009d\u009e\7\60\2\2\u009e\u009f\7\60\2\2"+
		"\u009f\32\3\2\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b"+
		"\f\4\2\u00a3\34\3\2\2\2\u00a4\u00a5\7+\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\r\5\2\u00a7\36\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9 \3\2\2\2\u00aa\u00ab"+
		"\7_\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad$\3\2\2\2\u00ae\u00af"+
		"\7\177\2\2\u00af&\3\2\2\2\u00b0\u00b1\5A\37\2\u00b1\u00b2\5\25\t\2\u00b2"+
		"(\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\23\6\2"+
		"\u00b6*\3\2\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2"+
		"\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7u\2\2\u00c0,\3\2\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4.\3\2\2\2\u00c5\u00c6"+
		"\7%\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7&\2\2\u00c8\62\3\2\2\2\u00c9\u00ca"+
		"\7\60\2\2\u00ca\u00cb\7\60\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd"+
		"\66\3\2\2\2\u00ce\u00d3\t\4\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d3\7f\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d38\3\2"+
		"\2\2\u00d4\u00d5\7\62\2\2\u00d5:\3\2\2\2\u00d6\u00d8\7/\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\t\5\2\2\u00da"+
		"\u00dc\5=\35\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc<\3\2\2\2"+
		"\u00dd\u00df\t\6\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1>\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\b\36\7\2\u00e5@\3\2\2\2\u00e6\u00ea\5C \2\u00e7\u00e9"+
		"\5E!\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00ebB\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\7\2\2"+
		"\u00eeD\3\2\2\2\u00ef\u00f2\5C \2\u00f0\u00f2\t\b\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2F\3\2\2\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b\"\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7&\2\2\u00fb"+
		"\u00fc\7*\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b#\4\2\u00feJ\3\2\2\2\u00ff"+
		"\u0100\7&\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b$\b\2\u0102L\3\2\2\2\u0103"+
		"\u0105\5O&\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107N\3\2\2\2\u0108\u0109\7)\2\2\u0109\u010e\7"+
		")\2\2\u010a\u010b\7&\2\2\u010b\u010e\7&\2\2\u010c\u010e\n\t\2\2\u010d"+
		"\u0108\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010c\3\2\2\2\u010eP\3\2\2\2"+
		"\u010f\u0110\7)\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\'\5\2\u0112R\3\2"+
		"\2\2\u0113\u0114\7=\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b(\5\2\u0116T"+
		"\3\2\2\2\u0117\u0118\7*\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b)\4\2\u011a"+
		"V\3\2\2\2\u011b\u011c\5A\37\2\u011cX\3\2\2\2\u011d\u011e\5\17\6\2\u011e"+
		"Z\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b,\6\2\u0122"+
		"\\\3\2\2\2\u0123\u0124\7@\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b-\5\2\u0126"+
		"^\3\2\2\2\u0127\u012a\59\33\2\u0128\u012a\5;\34\2\u0129\u0127\3\2\2\2"+
		"\u0129\u0128\3\2\2\2\u012a`\3\2\2\2\u012b\u012c\5\63\30\2\u012cb\3\2\2"+
		"\2\u012d\u012e\7)\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b\60\7\2\u0130d"+
		"\3\2\2\2\u0131\u0132\5#\20\2\u0132f\3\2\2\2\u0133\u0134\5%\21\2\u0134"+
		"h\3\2\2\2\u0135\u0136\5\'\22\2\u0136j\3\2\2\2\u0137\u013d\5\61\27\2\u0138"+
		"\u013a\5\25\t\2\u0139\u013b\5A\37\2\u013a\u0139\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013e\5A\37\2\u013d\u0138\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013el\3\2\2\2\u013f\u0140\7*\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\b\65\4\2\u0142n\3\2\2\2\u0143\u0144\5\17\6\2\u0144p\3\2\2\2\u0145"+
		"\u0146\5G\"\2\u0146\u0147\3\2\2\2\u0147\u0148\b\67\2\2\u0148r\3\2\2\2"+
		"\u0149\u014b\n\n\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\t\13\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b"+
		"8\2\2\u0153\u0154\b8\5\2\u0154t\3\2\2\2\27\2\3\4\5\6\u008b\u008e\u00d2"+
		"\u00d7\u00db\u00e0\u00ea\u00f1\u00f6\u0106\u010d\u0129\u013a\u013d\u014c"+
		"\u0150\t\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\3\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}