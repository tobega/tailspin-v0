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
		FieldDereference=7, FieldArrayDereference=8, To=9, ResultMarker=10, At=11, 
		Colon=12, SemiColon=13, Comma=14, Deconstructor=15, Invert=16, LeftParen=17, 
		RightParen=18, LeftBracket=19, RightBracket=20, LeftBrace=21, RightBrace=22, 
		Key=23, StartMatcher=24, StartTemplatesDefinition=25, StartComposerDefinition=26, 
		EndDefinition=27, TemplateMatch=28, StartDereference=29, Range=30, AdditiveOperator=31, 
		MultiplicativeOperator=32, Zero=33, NonZeroInteger=34, START_STRING=35, 
		IDENTIFIER=36, WS=37, StartStringEvaluate=38, StartStringInterpolate=39, 
		STRING_TEXT=40, END_STRING=41, EndInterpolate=42, InterpolateArray=43, 
		InterpolateIdentifier=44, InterpolateField=45, Else=46, MatchComma=47, 
		StartSubMatcher=48, EndMatcher=49, InvertMatch=50, BeginSuchThat=51, MatchInteger=52, 
		RangeMatch=53, START_REGEXP=54, StartStructureMatch=55, EndStructureMatch=56, 
		StartArrayMatch=57, EndArrayMatch=58, StructureKey=59, MatchDereference=60, 
		MatchArrayDereference=61, MatchFieldDereference=62, MatcherIgnoreWS=63, 
		Comment=64, ComposerEndDefinition=65, StartComposerMatch=66, EndComposerMatch=67, 
		InvertComposerMatch=68, SequenceKey=69, Multiplier=70, START_REGEX=71, 
		StartSkipRule=72, EndSkipRule=73, StartBuildArray=74, EndBuildArray=75, 
		ComposerId=76, ComposerIgnoreWS=77, REGEX_TEXT=78, END_REGEX=79;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3, COMMENT_MODE=4, COMPOSER=5, IN_REGEX=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER", "COMMENT_MODE", 
		"COMPOSER", "IN_REGEX"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "At", 
			"Colon", "SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Key", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"EndInterpolate", "InterpolateArray", "InterpolateIdentifier", "InterpolateField", 
			"Else", "MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", 
			"BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StartArrayMatch", "EndArrayMatch", "StructureKey", 
			"MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "Multiplier", 
			"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
			"'!'", "'@'", "':'", null, null, "'...'", null, null, null, null, null, 
			"'{'", "'}'", null, null, "'templates'", "'composer'", null, "'#'", null, 
			"'..'", null, null, "'0'", null, null, null, null, "'$('", null, null, 
			null, null, null, null, null, "'|'", null, null, null, null, "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "At", 
			"Colon", "SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Key", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
			"InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
			"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "Multiplier", 
			"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u01f2\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\5\6\u00ce\n\6\3\6\5\6\u00d1\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u0131\n!\3\"\3\"\3"+
		"#\5#\u0136\n#\3#\3#\5#\u013a\n#\3$\6$\u013d\n$\r$\16$\u013e\3%\3%\3%\3"+
		"%\3&\3&\7&\u0147\n&\f&\16&\u014a\13&\3\'\3\'\3(\3(\5(\u0150\n(\3)\6)\u0153"+
		"\n)\r)\16)\u0154\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\6,\u0163\n,\r,\16"+
		",\u0164\3-\3-\3-\3-\3-\5-\u016c\n-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\38\38\38\38\38\39\39\59\u0193\n9\3:\3:\3"+
		";\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\5A\u01a8\nA\3A\5A\u01ab"+
		"\nA\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\3E\7E\u01b8\nE\fE\16E\u01bb\13E\3E\5"+
		"E\u01be\nE\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3R\3S\6S\u01e6\nS\r"+
		"S\16S\u01e7\3T\3T\3T\5T\u01ed\nT\3U\3U\3U\3U\2\2V\t\3\13\4\r\5\17\6\21"+
		"\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M\2O%Q&S\2U"+
		"\2W\'Y([)]*_\2a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081"+
		";\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093D\u0095"+
		"E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7N\u00a9"+
		"O\u00abP\u00ad\2\u00afQ\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17\"\"\4\2--//"+
		"\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f"+
		"\f\4\2,-AA\3\2))\2\u01f8\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]"+
		"\3\2\2\2\3a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\5k\3\2"+
		"\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2"+
		"\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083"+
		"\3\2\2\2\5\u0085\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2"+
		"\2\5\u008d\3\2\2\2\6\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095"+
		"\3\2\2\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2"+
		"\2\7\u009f\3\2\2\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7"+
		"\3\2\2\2\7\u00a9\3\2\2\2\b\u00ab\3\2\2\2\b\u00af\3\2\2\2\t\u00b1\3\2\2"+
		"\2\13\u00b7\3\2\2\2\r\u00be\3\2\2\2\17\u00c4\3\2\2\2\21\u00ca\3\2\2\2"+
		"\23\u00d2\3\2\2\2\25\u00d7\3\2\2\2\27\u00da\3\2\2\2\31\u00e0\3\2\2\2\33"+
		"\u00e3\3\2\2\2\35\u00e5\3\2\2\2\37\u00e7\3\2\2\2!\u00e9\3\2\2\2#\u00eb"+
		"\3\2\2\2%\u00ed\3\2\2\2\'\u00f1\3\2\2\2)\u00f3\3\2\2\2+\u00f7\3\2\2\2"+
		"-\u00fb\3\2\2\2/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u0103"+
		"\3\2\2\2\67\u0106\3\2\2\29\u010a\3\2\2\2;\u0114\3\2\2\2=\u011f\3\2\2\2"+
		"?\u0123\3\2\2\2A\u0125\3\2\2\2C\u0127\3\2\2\2E\u012a\3\2\2\2G\u0130\3"+
		"\2\2\2I\u0132\3\2\2\2K\u0135\3\2\2\2M\u013c\3\2\2\2O\u0140\3\2\2\2Q\u0144"+
		"\3\2\2\2S\u014b\3\2\2\2U\u014f\3\2\2\2W\u0152\3\2\2\2Y\u0158\3\2\2\2["+
		"\u015d\3\2\2\2]\u0162\3\2\2\2_\u016b\3\2\2\2a\u016d\3\2\2\2c\u0171\3\2"+
		"\2\2e\u0175\3\2\2\2g\u0179\3\2\2\2i\u017b\3\2\2\2k\u017d\3\2\2\2m\u017f"+
		"\3\2\2\2o\u0181\3\2\2\2q\u0185\3\2\2\2s\u0189\3\2\2\2u\u018b\3\2\2\2w"+
		"\u0192\3\2\2\2y\u0194\3\2\2\2{\u0196\3\2\2\2}\u019a\3\2\2\2\177\u019c"+
		"\3\2\2\2\u0081\u019e\3\2\2\2\u0083\u01a0\3\2\2\2\u0085\u01a2\3\2\2\2\u0087"+
		"\u01a4\3\2\2\2\u0089\u01ac\3\2\2\2\u008b\u01b0\3\2\2\2\u008d\u01b2\3\2"+
		"\2\2\u008f\u01b9\3\2\2\2\u0091\u01c2\3\2\2\2\u0093\u01c8\3\2\2\2\u0095"+
		"\u01ca\3\2\2\2\u0097\u01cc\3\2\2\2\u0099\u01ce\3\2\2\2\u009b\u01d0\3\2"+
		"\2\2\u009d\u01d2\3\2\2\2\u009f\u01d6\3\2\2\2\u00a1\u01d8\3\2\2\2\u00a3"+
		"\u01da\3\2\2\2\u00a5\u01dc\3\2\2\2\u00a7\u01de\3\2\2\2\u00a9\u01e0\3\2"+
		"\2\2\u00ab\u01e5\3\2\2\2\u00ad\u01ec\3\2\2\2\u00af\u01ee\3\2\2\2\u00b1"+
		"\u00b2\7\61\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b"+
		"\2\2\2\u00b5\u00b6\b\2\3\2\u00b6\n\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bd\f\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7f\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\16\3\2\2\2\u00c4"+
		"\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\3\2\2"+
		"\2\u00c8\u00c9\t\2\2\2\u00c9\20\3\2\2\2\u00ca\u00d0\5A\36\2\u00cb\u00cd"+
		"\5\35\f\2\u00cc\u00ce\5Q&\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d1\5Q&\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3\2\2"+
		"\2\u00d1\22\3\2\2\2\u00d2\u00d3\5\21\6\2\u00d3\u00d4\5)\22\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\b\7\4\2\u00d6\24\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8"+
		"\u00d9\5Q&\2\u00d9\26\3\2\2\2\u00da\u00db\7\60\2\2\u00db\u00dc\5Q&\2\u00dc"+
		"\u00dd\5)\22\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\t\4\2\u00df\30\3\2\2"+
		"\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\7@\2\2\u00e2\32\3\2\2\2\u00e3\u00e4"+
		"\7#\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7B\2\2\u00e6\36\3\2\2\2\u00e7\u00e8"+
		"\7<\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7=\2\2\u00ea\"\3\2\2\2\u00eb\u00ec"+
		"\7.\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\7\60\2\2\u00ef"+
		"\u00f0\7\60\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7\u0080\2\2\u00f2(\3\2\2\2"+
		"\u00f3\u00f4\7*\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\22\4\2\u00f6*\3"+
		"\2\2\2\u00f7\u00f8\7+\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b\23\5\2\u00fa"+
		",\3\2\2\2\u00fb\u00fc\7]\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe\60"+
		"\3\2\2\2\u00ff\u0100\7}\2\2\u0100\62\3\2\2\2\u0101\u0102\7\177\2\2\u0102"+
		"\64\3\2\2\2\u0103\u0104\5Q&\2\u0104\u0105\5\37\r\2\u0105\66\3\2\2\2\u0106"+
		"\u0107\7>\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\31\6\2\u01098\3\2\2\2"+
		"\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7r\2\2\u010e\u010f\7n\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7u\2\2\u0113:\3\2\2\2\u0114\u0115\7e\2\2\u0115"+
		"\u0116\7q\2\2\u0116\u0117\7o\2\2\u0117\u0118\7r\2\2\u0118\u0119\7q\2\2"+
		"\u0119\u011a\7u\2\2\u011a\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\b\33\7\2\u011e<\3\2\2\2\u011f\u0120\7g\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7f\2\2\u0122>\3\2\2\2\u0123\u0124\7%\2\2\u0124"+
		"@\3\2\2\2\u0125\u0126\7&\2\2\u0126B\3\2\2\2\u0127\u0128\7\60\2\2\u0128"+
		"\u0129\7\60\2\2\u0129D\3\2\2\2\u012a\u012b\t\3\2\2\u012bF\3\2\2\2\u012c"+
		"\u0131\t\4\2\2\u012d\u012e\7o\2\2\u012e\u012f\7q\2\2\u012f\u0131\7f\2"+
		"\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0131H\3\2\2\2\u0132\u0133"+
		"\7\62\2\2\u0133J\3\2\2\2\u0134\u0136\7/\2\2\u0135\u0134\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\t\5\2\2\u0138\u013a\5M"+
		"$\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013aL\3\2\2\2\u013b\u013d"+
		"\t\6\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fN\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\b%\b\2\u0143P\3\2\2\2\u0144\u0148\5S\'\2\u0145\u0147\5U(\2\u0146"+
		"\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149R\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\t\7\2\2\u014cT\3\2"+
		"\2\2\u014d\u0150\5S\'\2\u014e\u0150\t\b\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150V\3\2\2\2\u0151\u0153\t\2\2\2\u0152\u0151\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\b)\2\2\u0157X\3\2\2\2\u0158\u0159\7&\2\2\u0159\u015a"+
		"\7*\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b*\4\2\u015cZ\3\2\2\2\u015d\u015e"+
		"\7&\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b+\t\2\u0160\\\3\2\2\2\u0161\u0163"+
		"\5_-\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165^\3\2\2\2\u0166\u0167\7)\2\2\u0167\u016c\7)\2\2\u0168"+
		"\u0169\7&\2\2\u0169\u016c\7&\2\2\u016a\u016c\n\t\2\2\u016b\u0166\3\2\2"+
		"\2\u016b\u0168\3\2\2\2\u016b\u016a\3\2\2\2\u016c`\3\2\2\2\u016d\u016e"+
		"\7)\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b.\5\2\u0170b\3\2\2\2\u0171\u0172"+
		"\7=\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b/\5\2\u0174d\3\2\2\2\u0175\u0176"+
		"\7*\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\60\4\2\u0178f\3\2\2\2\u0179"+
		"\u017a\5Q&\2\u017ah\3\2\2\2\u017b\u017c\5\25\b\2\u017cj\3\2\2\2\u017d"+
		"\u017e\7~\2\2\u017el\3\2\2\2\u017f\u0180\7.\2\2\u0180n\3\2\2\2\u0181\u0182"+
		"\7>\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\65\6\2\u0184p\3\2\2\2\u0185"+
		"\u0186\7@\2\2\u0186\u0187\3\2\2\2\u0187\u0188\b\66\5\2\u0188r\3\2\2\2"+
		"\u0189\u018a\7\u0080\2\2\u018at\3\2\2\2\u018b\u018c\7A\2\2\u018c\u018d"+
		"\7*\2\2\u018d\u018e\3\2\2\2\u018e\u018f\b8\4\2\u018fv\3\2\2\2\u0190\u0193"+
		"\5I\"\2\u0191\u0193\5K#\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"x\3\2\2\2\u0194\u0195\5C\37\2\u0195z\3\2\2\2\u0196\u0197\7)\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\b;\b\2\u0199|\3\2\2\2\u019a\u019b\5\61\26\2"+
		"\u019b~\3\2\2\2\u019c\u019d\5\63\27\2\u019d\u0080\3\2\2\2\u019e\u019f"+
		"\5-\24\2\u019f\u0082\3\2\2\2\u01a0\u01a1\5/\25\2\u01a1\u0084\3\2\2\2\u01a2"+
		"\u01a3\5\65\30\2\u01a3\u0086\3\2\2\2\u01a4\u01aa\5A\36\2\u01a5\u01a7\5"+
		"\35\f\2\u01a6\u01a8\5Q&\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01ab\5Q&\2\u01aa\u01a5\3\2\2\2\u01aa\u01a9\3\2\2"+
		"\2\u01ab\u0088\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\bB\4\2\u01af\u008a\3\2\2\2\u01b0\u01b1\5\25\b\2\u01b1\u008c\3\2\2\2\u01b2"+
		"\u01b3\5W)\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\bD\2\2\u01b5\u008e\3\2\2"+
		"\2\u01b6\u01b8\n\n\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01be\t\13\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\b"+
		"E\2\2\u01c0\u01c1\bE\5\2\u01c1\u0090\3\2\2\2\u01c2\u01c3\7g\2\2\u01c3"+
		"\u01c4\7p\2\2\u01c4\u01c5\7f\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\bF\5"+
		"\2\u01c7\u0092\3\2\2\2\u01c8\u01c9\7>\2\2\u01c9\u0094\3\2\2\2\u01ca\u01cb"+
		"\7@\2\2\u01cb\u0096\3\2\2\2\u01cc\u01cd\7\u0080\2\2\u01cd\u0098\3\2\2"+
		"\2\u01ce\u01cf\5\65\30\2\u01cf\u009a\3\2\2\2\u01d0\u01d1\t\f\2\2\u01d1"+
		"\u009c\3\2\2\2\u01d2\u01d3\7)\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bL\n"+
		"\2\u01d5\u009e\3\2\2\2\u01d6\u01d7\7*\2\2\u01d7\u00a0\3\2\2\2\u01d8\u01d9"+
		"\7+\2\2\u01d9\u00a2\3\2\2\2\u01da\u01db\7]\2\2\u01db\u00a4\3\2\2\2\u01dc"+
		"\u01dd\7_\2\2\u01dd\u00a6\3\2\2\2\u01de\u01df\5Q&\2\u01df\u00a8\3\2\2"+
		"\2\u01e0\u01e1\5W)\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\bR\2\2\u01e3\u00aa"+
		"\3\2\2\2\u01e4\u01e6\5\u00adT\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2"+
		"\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u00ac\3\2\2\2\u01e9\u01ea"+
		"\7)\2\2\u01ea\u01ed\7)\2\2\u01eb\u01ed\n\r\2\2\u01ec\u01e9\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\u00ae\3\2\2\2\u01ee\u01ef\7)\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f1\bU\5\2\u01f1\u00b0\3\2\2\2\33\2\3\4\5\6\7\b\u00cd\u00d0"+
		"\u0130\u0135\u0139\u013e\u0148\u014f\u0154\u0164\u016b\u0192\u01a7\u01aa"+
		"\u01b9\u01bd\u01e7\u01ec\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2"+
		"\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}