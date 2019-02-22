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
		StartComment=1, Stdout=2, Def=3, Dereference=4, FieldDereference=5, To=6, 
		ResultMarker=7, Colon=8, Comma=9, Deconstructor=10, LeftParen=11, RightParen=12, 
		LeftBracket=13, RightBracket=14, LeftBrace=15, RightBrace=16, Key=17, 
		StartMatcher=18, StartTemplatesDefinition=19, EndDefinition=20, TemplateMatch=21, 
		StartDereference=22, Range=23, AdditiveOperator=24, MultiplicativeOperator=25, 
		Zero=26, NonZeroInteger=27, START_STRING=28, IDENTIFIER=29, WS=30, StartStringEvaluate=31, 
		StartStringInterpolate=32, STRING_TEXT=33, END_STRING=34, EndInterpolate=35, 
		InterpolateArray=36, InterpolateIdentifier=37, InterpolateField=38, StartSubMatcher=39, 
		EndMatcher=40, MatchInteger=41, RangeMatch=42, START_REGEXP=43, StartStructureMatch=44, 
		EndStructureMatch=45, StructureKey=46, MatcherIgnoreWS=47, Comment=48;
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
			"StartComment", "Stdout", "Def", "Dereference", "FieldDereference", "To", 
			"ResultMarker", "Colon", "Comma", "Deconstructor", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", 
			"StartTemplatesDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "StartSubMatcher", "EndMatcher", "MatchInteger", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StructureKey", "MatcherIgnoreWS", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", null, null, null, "'->'", "'!'", "':'", "','", 
			"'...'", null, "')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", 
			"'end'", "'#'", null, "'..'", null, null, "'0'", null, null, null, null, 
			"'$('", null, null, null, "';'", null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Def", "Dereference", "FieldDereference", 
			"To", "ResultMarker", "Colon", "Comma", "Deconstructor", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Key", "StartMatcher", "StartTemplatesDefinition", "EndDefinition", "TemplateMatch", 
			"StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "StartSubMatcher", 
			"EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StructureKey", "MatcherIgnoreWS", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0141\b\1\b\1"+
		"\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u0086\n\5\3\5\5\5"+
		"\u0089\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u00cd\n\32\3\33\3\33\3\34"+
		"\5\34\u00d2\n\34\3\34\3\34\5\34\u00d6\n\34\3\35\6\35\u00d9\n\35\r\35\16"+
		"\35\u00da\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00e3\n\37\f\37\16\37\u00e6"+
		"\13\37\3 \3 \3!\3!\5!\u00ec\n!\3\"\6\"\u00ef\n\"\r\"\16\"\u00f0\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\6%\u00ff\n%\r%\16%\u0100\3&\3&\3&\3&"+
		"\3&\5&\u0108\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3.\3.\5.\u0124\n.\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\7\65\u0137\n\65\f\65"+
		"\16\65\u013a\13\65\3\65\5\65\u013d\n\65\3\65\3\65\3\65\2\2\66\7\3\t\4"+
		"\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22"+
		"\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\2?\36A\37C\2E\2"+
		"G I!K\"M#O\2Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62\7\2\3\4\5\6\f\5\2\13"+
		"\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4"+
		"\2&&))\3\2\f\f\3\3\f\f\2\u0146\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3"+
		"M\3\2\2\2\3Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\4W\3\2\2\2\4Y\3\2\2\2\5[\3"+
		"\2\2\2\5]\3\2\2\2\5_\3\2\2\2\5a\3\2\2\2\5c\3\2\2\2\5e\3\2\2\2\5g\3\2\2"+
		"\2\5i\3\2\2\2\5k\3\2\2\2\6m\3\2\2\2\7o\3\2\2\2\tu\3\2\2\2\13|\3\2\2\2"+
		"\r\u0082\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23\u0090\3\2\2\2\25"+
		"\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u009a\3\2\2\2\35\u009e"+
		"\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2"+
		"\'\u00aa\3\2\2\2)\u00ad\3\2\2\2+\u00b1\3\2\2\2-\u00bb\3\2\2\2/\u00bf\3"+
		"\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c6\3\2\2\2\67\u00cc\3\2"+
		"\2\29\u00ce\3\2\2\2;\u00d1\3\2\2\2=\u00d8\3\2\2\2?\u00dc\3\2\2\2A\u00e0"+
		"\3\2\2\2C\u00e7\3\2\2\2E\u00eb\3\2\2\2G\u00ee\3\2\2\2I\u00f4\3\2\2\2K"+
		"\u00f9\3\2\2\2M\u00fe\3\2\2\2O\u0107\3\2\2\2Q\u0109\3\2\2\2S\u010d\3\2"+
		"\2\2U\u0111\3\2\2\2W\u0115\3\2\2\2Y\u0117\3\2\2\2[\u0119\3\2\2\2]\u011d"+
		"\3\2\2\2_\u0123\3\2\2\2a\u0125\3\2\2\2c\u0127\3\2\2\2e\u012b\3\2\2\2g"+
		"\u012d\3\2\2\2i\u012f\3\2\2\2k\u0131\3\2\2\2m\u0138\3\2\2\2op\7\61\2\2"+
		"pq\7\61\2\2qr\3\2\2\2rs\b\2\2\2st\b\2\3\2t\b\3\2\2\2uv\7u\2\2vw\7v\2\2"+
		"wx\7f\2\2xy\7q\2\2yz\7w\2\2z{\7v\2\2{\n\3\2\2\2|}\7f\2\2}~\7g\2\2~\177"+
		"\7h\2\2\177\u0080\3\2\2\2\u0080\u0081\t\2\2\2\u0081\f\3\2\2\2\u0082\u0088"+
		"\5\61\27\2\u0083\u0085\5\25\t\2\u0084\u0086\5A\37\2\u0085\u0084\3\2\2"+
		"\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0089\5A\37\2\u0088\u0083"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\16\3\2\2\2\u008a\u008b\7\60\2\2\u008b"+
		"\u008c\5A\37\2\u008c\20\3\2\2\2\u008d\u008e\7/\2\2\u008e\u008f\7@\2\2"+
		"\u008f\22\3\2\2\2\u0090\u0091\7#\2\2\u0091\24\3\2\2\2\u0092\u0093\7<\2"+
		"\2\u0093\26\3\2\2\2\u0094\u0095\7.\2\2\u0095\30\3\2\2\2\u0096\u0097\7"+
		"\60\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7\60\2\2\u0099\32\3\2\2\2\u009a"+
		"\u009b\7*\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\f\4\2\u009d\34\3\2\2\2"+
		"\u009e\u009f\7+\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\r\5\2\u00a1\36\3"+
		"\2\2\2\u00a2\u00a3\7]\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7_\2\2\u00a5\"\3"+
		"\2\2\2\u00a6\u00a7\7}\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7\177\2\2\u00a9&"+
		"\3\2\2\2\u00aa\u00ab\5A\37\2\u00ab\u00ac\5\25\t\2\u00ac(\3\2\2\2\u00ad"+
		"\u00ae\7>\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\23\6\2\u00b0*\3\2\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7o\2\2\u00b4\u00b5"+
		"\7r\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7u\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00be\7f\2\2\u00be.\3\2\2\2\u00bf\u00c0\7%\2\2\u00c0"+
		"\60\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7\60\2\2\u00c4"+
		"\u00c5\7\60\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\t\3\2\2\u00c7\66\3\2\2\2"+
		"\u00c8\u00cd\t\4\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cd"+
		"\7f\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd8\3\2\2\2\u00ce\u00cf"+
		"\7\62\2\2\u00cf:\3\2\2\2\u00d0\u00d2\7/\2\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\t\5\2\2\u00d4\u00d6\5="+
		"\35\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6<\3\2\2\2\u00d7\u00d9"+
		"\t\6\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db>\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\b\36\7\2\u00df@\3\2\2\2\u00e0\u00e4\5C \2\u00e1\u00e3\5E!\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5B\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\t\7\2\2\u00e8D\3\2"+
		"\2\2\u00e9\u00ec\5C \2\u00ea\u00ec\t\b\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ecF\3\2\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\"\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\u00f6"+
		"\7*\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b#\4\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7&\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b$\b\2\u00fcL\3\2\2\2\u00fd\u00ff"+
		"\5O&\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101N\3\2\2\2\u0102\u0103\7)\2\2\u0103\u0108\7)\2\2\u0104"+
		"\u0105\7&\2\2\u0105\u0108\7&\2\2\u0106\u0108\n\t\2\2\u0107\u0102\3\2\2"+
		"\2\u0107\u0104\3\2\2\2\u0107\u0106\3\2\2\2\u0108P\3\2\2\2\u0109\u010a"+
		"\7)\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\'\5\2\u010cR\3\2\2\2\u010d\u010e"+
		"\7=\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b(\5\2\u0110T\3\2\2\2\u0111\u0112"+
		"\7*\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b)\4\2\u0114V\3\2\2\2\u0115\u0116"+
		"\5A\37\2\u0116X\3\2\2\2\u0117\u0118\5\17\6\2\u0118Z\3\2\2\2\u0119\u011a"+
		"\7>\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b,\6\2\u011c\\\3\2\2\2\u011d\u011e"+
		"\7@\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b-\5\2\u0120^\3\2\2\2\u0121\u0124"+
		"\59\33\2\u0122\u0124\5;\34\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"`\3\2\2\2\u0125\u0126\5\63\30\2\u0126b\3\2\2\2\u0127\u0128\7)\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b\60\7\2\u012ad\3\2\2\2\u012b\u012c\5#\20\2"+
		"\u012cf\3\2\2\2\u012d\u012e\5%\21\2\u012eh\3\2\2\2\u012f\u0130\5\'\22"+
		"\2\u0130j\3\2\2\2\u0131\u0132\5G\"\2\u0132\u0133\3\2\2\2\u0133\u0134\b"+
		"\64\2\2\u0134l\3\2\2\2\u0135\u0137\n\n\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013d\t\13\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\b\65\2\2\u013f\u0140\b\65\5\2\u0140n\3\2\2\2\25\2\3"+
		"\4\5\6\u0085\u0088\u00cc\u00d1\u00d5\u00da\u00e4\u00eb\u00f0\u0100\u0107"+
		"\u0123\u0138\u013c\t\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\3\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}