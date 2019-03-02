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
		StartTemplatesDefinition=22, StartComposerDefinition=23, EndDefinition=24, 
		TemplateMatch=25, StartDereference=26, Range=27, AdditiveOperator=28, 
		MultiplicativeOperator=29, Zero=30, NonZeroInteger=31, START_STRING=32, 
		IDENTIFIER=33, WS=34, StartStringEvaluate=35, StartStringInterpolate=36, 
		STRING_TEXT=37, END_STRING=38, EndInterpolate=39, InterpolateArray=40, 
		InterpolateIdentifier=41, InterpolateField=42, StartSubMatcher=43, EndMatcher=44, 
		InvertMatch=45, MatchInteger=46, RangeMatch=47, START_REGEXP=48, StartStructureMatch=49, 
		EndStructureMatch=50, StructureKey=51, MatchDereference=52, MatchArrayDereference=53, 
		MatchFieldDereference=54, MatcherIgnoreWS=55, Comment=56, ComposerEndDefinition=57, 
		StartComposerMatch=58, EndComposerMatch=59, ComposerId=60, ComposerIgnoreWS=61;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3, COMMENT_MODE=4, COMPOSER=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER", "COMMENT_MODE", 
		"COMPOSER"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "ComposerId", "ComposerIgnoreWS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
			null, "':'", "','", "'...'", null, "')'", "'['", "']'", "'{'", "'}'", 
			null, null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, 
			null, "'0'", null, null, null, null, "'$('", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "ComposerId", "ComposerIgnoreWS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0198\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t"+
		"\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t"+
		":\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\5\6\u00aa\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0104\n\36"+
		"\3\37\3\37\3 \5 \u0109\n \3 \3 \5 \u010d\n \3!\6!\u0110\n!\r!\16!\u0111"+
		"\3\"\3\"\3\"\3\"\3#\3#\7#\u011a\n#\f#\16#\u011d\13#\3$\3$\3%\3%\5%\u0123"+
		"\n%\3&\6&\u0126\n&\r&\16&\u0127\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3)\6)\u0136\n)\r)\16)\u0137\3*\3*\3*\3*\3*\5*\u013f\n*\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\5\63\u015d\n\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\39\59\u016e\n9\39\59\u0171\n9\3:\3:\3"+
		":\3:\3;\3;\3<\3<\3<\3<\3=\7=\u017e\n=\f=\16=\u0181\13=\3=\5=\u0184\n="+
		"\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\2\2C\b\3\n\4"+
		"\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32\f\34\r\36\16 \17\"\20$\21&\22("+
		"\23*\24,\25.\26\60\27\62\30\64\31\66\328\33:\34<\35>\36@\37B D!F\2H\""+
		"J#L\2N\2P$R%T&V\'X\2Z(\\)^*`+b,d-f.h/j\60l\61n\62p\63r\64t\65v\66x\67"+
		"z8|9~:\u0080;\u0082<\u0084=\u0086>\u0088?\b\2\3\4\5\6\7\f\5\2\13\f\17"+
		"\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&)"+
		")\3\2\f\f\3\3\f\f\2\u019e\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2"+
		"\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2"+
		"\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2"+
		"\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2"+
		"\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2"+
		"\2P\3\2\2\2\3R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\3Z\3\2\2\2\4\\\3\2\2\2\4"+
		"^\3\2\2\2\4`\3\2\2\2\4b\3\2\2\2\5d\3\2\2\2\5f\3\2\2\2\5h\3\2\2\2\5j\3"+
		"\2\2\2\5l\3\2\2\2\5n\3\2\2\2\5p\3\2\2\2\5r\3\2\2\2\5t\3\2\2\2\5v\3\2\2"+
		"\2\5x\3\2\2\2\5z\3\2\2\2\5|\3\2\2\2\6~\3\2\2\2\7\u0080\3\2\2\2\7\u0082"+
		"\3\2\2\2\7\u0084\3\2\2\2\7\u0086\3\2\2\2\7\u0088\3\2\2\2\b\u008a\3\2\2"+
		"\2\n\u0090\3\2\2\2\f\u0097\3\2\2\2\16\u009d\3\2\2\2\20\u00a3\3\2\2\2\22"+
		"\u00ab\3\2\2\2\24\u00b0\3\2\2\2\26\u00b3\3\2\2\2\30\u00b9\3\2\2\2\32\u00bc"+
		"\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2\2\2 \u00c2\3\2\2\2\"\u00c6\3\2"+
		"\2\2$\u00ca\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d4"+
		"\3\2\2\2.\u00d6\3\2\2\2\60\u00d9\3\2\2\2\62\u00dd\3\2\2\2\64\u00e7\3\2"+
		"\2\2\66\u00f2\3\2\2\28\u00f6\3\2\2\2:\u00f8\3\2\2\2<\u00fa\3\2\2\2>\u00fd"+
		"\3\2\2\2@\u0103\3\2\2\2B\u0105\3\2\2\2D\u0108\3\2\2\2F\u010f\3\2\2\2H"+
		"\u0113\3\2\2\2J\u0117\3\2\2\2L\u011e\3\2\2\2N\u0122\3\2\2\2P\u0125\3\2"+
		"\2\2R\u012b\3\2\2\2T\u0130\3\2\2\2V\u0135\3\2\2\2X\u013e\3\2\2\2Z\u0140"+
		"\3\2\2\2\\\u0144\3\2\2\2^\u0148\3\2\2\2`\u014c\3\2\2\2b\u014e\3\2\2\2"+
		"d\u0150\3\2\2\2f\u0154\3\2\2\2h\u0158\3\2\2\2j\u015c\3\2\2\2l\u015e\3"+
		"\2\2\2n\u0160\3\2\2\2p\u0164\3\2\2\2r\u0166\3\2\2\2t\u0168\3\2\2\2v\u016a"+
		"\3\2\2\2x\u0172\3\2\2\2z\u0176\3\2\2\2|\u0178\3\2\2\2~\u017f\3\2\2\2\u0080"+
		"\u0188\3\2\2\2\u0082\u018e\3\2\2\2\u0084\u0190\3\2\2\2\u0086\u0192\3\2"+
		"\2\2\u0088\u0194\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\b\2\2\2\u008e\u008f\b\2\3\2\u008f\t\3\2\2\2"+
		"\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\u0093\7f\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7w\2\2\u0095\u0096\7v\2\2\u0096\13\3\2\2\2\u0097\u0098"+
		"\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7f\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\r\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2\17\3\2\2\2"+
		"\u00a3\u00a9\5:\33\2\u00a4\u00a6\5\34\f\2\u00a5\u00a7\5J#\2\u00a6\u00a5"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5J#\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\5\20\6"+
		"\2\u00ac\u00ad\5\"\17\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\7\4\2\u00af"+
		"\23\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\5J#\2\u00b2\25\3\2\2\2\u00b3"+
		"\u00b4\7\60\2\2\u00b4\u00b5\5J#\2\u00b5\u00b6\5\"\17\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\b\t\4\2\u00b8\27\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb"+
		"\7@\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\33\3\2\2\2\u00be\u00bf"+
		"\7<\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1\37\3\2\2\2\u00c2\u00c3"+
		"\7\60\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\7\60\2\2\u00c5!\3\2\2\2\u00c6"+
		"\u00c7\7*\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\17\4\2\u00c9#\3\2\2\2"+
		"\u00ca\u00cb\7+\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\20\5\2\u00cd%\3"+
		"\2\2\2\u00ce\u00cf\7]\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1)\3"+
		"\2\2\2\u00d2\u00d3\7}\2\2\u00d3+\3\2\2\2\u00d4\u00d5\7\177\2\2\u00d5-"+
		"\3\2\2\2\u00d6\u00d7\5J#\2\u00d7\u00d8\5\34\f\2\u00d8/\3\2\2\2\u00d9\u00da"+
		"\7>\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\26\6\2\u00dc\61\3\2\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7r\2\2"+
		"\u00e1\u00e2\7n\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7u\2\2\u00e6\63\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\3\2\2"+
		"\2\u00f0\u00f1\b\30\7\2\u00f1\65\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7f\2\2\u00f5\67\3\2\2\2\u00f6\u00f7\7%\2\2\u00f79"+
		"\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9;\3\2\2\2\u00fa\u00fb\7\60\2\2\u00fb"+
		"\u00fc\7\60\2\2\u00fc=\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe?\3\2\2\2\u00ff"+
		"\u0104\t\4\2\2\u0100\u0101\7o\2\2\u0101\u0102\7q\2\2\u0102\u0104\7f\2"+
		"\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0104A\3\2\2\2\u0105\u0106"+
		"\7\62\2\2\u0106C\3\2\2\2\u0107\u0109\7/\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\t\5\2\2\u010b\u010d\5F"+
		"!\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010dE\3\2\2\2\u010e\u0110"+
		"\t\6\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112G\3\2\2\2\u0113\u0114\7)\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\b\"\b\2\u0116I\3\2\2\2\u0117\u011b\5L$\2\u0118\u011a\5N%\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011cK\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\t\7\2\2\u011fM\3\2"+
		"\2\2\u0120\u0123\5L$\2\u0121\u0123\t\b\2\2\u0122\u0120\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123O\3\2\2\2\u0124\u0126\t\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\b&\2\2\u012aQ\3\2\2\2\u012b\u012c\7&\2\2\u012c\u012d"+
		"\7*\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\'\4\2\u012fS\3\2\2\2\u0130\u0131"+
		"\7&\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b(\t\2\u0133U\3\2\2\2\u0134\u0136"+
		"\5X*\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138W\3\2\2\2\u0139\u013a\7)\2\2\u013a\u013f\7)\2\2\u013b"+
		"\u013c\7&\2\2\u013c\u013f\7&\2\2\u013d\u013f\n\t\2\2\u013e\u0139\3\2\2"+
		"\2\u013e\u013b\3\2\2\2\u013e\u013d\3\2\2\2\u013fY\3\2\2\2\u0140\u0141"+
		"\7)\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b+\5\2\u0143[\3\2\2\2\u0144\u0145"+
		"\7=\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b,\5\2\u0147]\3\2\2\2\u0148\u0149"+
		"\7*\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b-\4\2\u014b_\3\2\2\2\u014c\u014d"+
		"\5J#\2\u014da\3\2\2\2\u014e\u014f\5\24\b\2\u014fc\3\2\2\2\u0150\u0151"+
		"\7>\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b\60\6\2\u0153e\3\2\2\2\u0154"+
		"\u0155\7@\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\61\5\2\u0157g\3\2\2\2"+
		"\u0158\u0159\7#\2\2\u0159i\3\2\2\2\u015a\u015d\5B\37\2\u015b\u015d\5D"+
		" \2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015dk\3\2\2\2\u015e\u015f"+
		"\5<\34\2\u015fm\3\2\2\2\u0160\u0161\7)\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\b\65\b\2\u0163o\3\2\2\2\u0164\u0165\5*\23\2\u0165q\3\2\2\2\u0166\u0167"+
		"\5,\24\2\u0167s\3\2\2\2\u0168\u0169\5.\25\2\u0169u\3\2\2\2\u016a\u0170"+
		"\5:\33\2\u016b\u016d\5\34\f\2\u016c\u016e\5J#\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0171\5J#\2\u0170\u016b\3\2\2"+
		"\2\u0170\u016f\3\2\2\2\u0171w\3\2\2\2\u0172\u0173\7*\2\2\u0173\u0174\3"+
		"\2\2\2\u0174\u0175\b:\4\2\u0175y\3\2\2\2\u0176\u0177\5\24\b\2\u0177{\3"+
		"\2\2\2\u0178\u0179\5P&\2\u0179\u017a\3\2\2\2\u017a\u017b\b<\2\2\u017b"+
		"}\3\2\2\2\u017c\u017e\n\n\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0182\u0184\t\13\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2"+
		"\u0185\u0186\b=\2\2\u0186\u0187\b=\5\2\u0187\177\3\2\2\2\u0188\u0189\7"+
		"g\2\2\u0189\u018a\7p\2\2\u018a\u018b\7f\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\b>\5\2\u018d\u0081\3\2\2\2\u018e\u018f\7>\2\2\u018f\u0083\3\2\2"+
		"\2\u0190\u0191\7@\2\2\u0191\u0085\3\2\2\2\u0192\u0193\5J#\2\u0193\u0087"+
		"\3\2\2\2\u0194\u0195\5P&\2\u0195\u0196\3\2\2\2\u0196\u0197\bB\2\2\u0197"+
		"\u0089\3\2\2\2\30\2\3\4\5\6\7\u00a6\u00a9\u0103\u0108\u010c\u0111\u011b"+
		"\u0122\u0127\u0137\u013e\u015c\u016d\u0170\u017f\u0183\n\b\2\2\7\6\2\7"+
		"\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}