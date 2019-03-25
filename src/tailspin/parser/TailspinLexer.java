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
		Message=12, Colon=13, SemiColon=14, Comma=15, Deconstructor=16, Invert=17, 
		LeftParen=18, RightParen=19, LeftBracket=20, RightBracket=21, LeftBrace=22, 
		RightBrace=23, Key=24, StartMatcher=25, StartTemplatesDefinition=26, StartComposerDefinition=27, 
		StartProcessorDefinition=28, EndDefinition=29, TemplateMatch=30, StartDereference=31, 
		Range=32, AdditiveOperator=33, MultiplicativeOperator=34, Zero=35, NonZeroInteger=36, 
		START_STRING=37, IDENTIFIER=38, WS=39, StartStringEvaluate=40, StartStringInterpolate=41, 
		STRING_TEXT=42, END_STRING=43, EndInterpolate=44, InterpolateArray=45, 
		InterpolateIdentifier=46, InterpolateField=47, Else=48, MatchComma=49, 
		StartSubMatcher=50, EndMatcher=51, InvertMatch=52, BeginSuchThat=53, MatchInteger=54, 
		RangeMatch=55, START_REGEXP=56, StartStructureMatch=57, EndStructureMatch=58, 
		StartArrayMatch=59, EndArrayMatch=60, StructureKey=61, MatchMessage=62, 
		MatchDereference=63, MatchArrayDereference=64, MatchFieldDereference=65, 
		MatcherIgnoreWS=66, Comment=67, ComposerEndDefinition=68, StartComposerMatch=69, 
		EndComposerMatch=70, InvertComposerMatch=71, SequenceKey=72, Multiplier=73, 
		START_REGEX=74, StartSkipRule=75, EndSkipRule=76, StartBuildArray=77, 
		EndBuildArray=78, ComposerId=79, ComposerIgnoreWS=80, REGEX_TEXT=81, END_REGEX=82;
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
			"Message", "Colon", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
			"InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
			"StructureKey", "MatchMessage", "MatchDereference", "MatchArrayDereference", 
			"MatchFieldDereference", "MatcherIgnoreWS", "Comment", "ComposerEndDefinition", 
			"StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", "SequenceKey", 
			"Multiplier", "START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", 
			"EndBuildArray", "ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", 
			"END_REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
			"'!'", "'@'", null, "':'", null, null, "'...'", null, null, null, null, 
			null, "'{'", "'}'", null, null, "'templates'", "'composer'", "'processor'", 
			null, "'#'", null, "'..'", null, null, "'0'", null, null, null, null, 
			"'$('", null, null, null, null, null, null, null, "'|'", null, null, 
			null, null, "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "At", 
			"Message", "Colon", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
			"START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
			"InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
			"StructureKey", "MatchMessage", "MatchDereference", "MatchArrayDereference", 
			"MatchFieldDereference", "MatcherIgnoreWS", "Comment", "ComposerEndDefinition", 
			"StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", "SequenceKey", 
			"Multiplier", "START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", 
			"EndBuildArray", "ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u020c\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6\u00d4\n\6\3\6\5\6\u00d7\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u0146"+
		"\n#\3$\3$\3%\5%\u014b\n%\3%\3%\5%\u014f\n%\3&\6&\u0152\n&\r&\16&\u0153"+
		"\3\'\3\'\3\'\3\'\3(\3(\7(\u015c\n(\f(\16(\u015f\13(\3)\3)\3*\3*\5*\u0165"+
		"\n*\3+\6+\u0168\n+\r+\16+\u0169\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\6"+
		".\u0178\n.\r.\16.\u0179\3/\3/\3/\3/\3/\5/\u0181\n/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\3:\3:\3:\3;\3;"+
		"\5;\u01a8\n;\3<\3<\3=\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C"+
		"\3C\3C\3D\3D\3D\5D\u01c2\nD\3D\5D\u01c5\nD\3E\3E\3E\3E\3F\3F\3G\3G\3G"+
		"\3G\3H\7H\u01d2\nH\fH\16H\u01d5\13H\3H\5H\u01d8\nH\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3R\3R\3"+
		"S\3S\3T\3T\3U\3U\3U\3U\3V\6V\u0200\nV\rV\16V\u0201\3W\3W\3W\5W\u0207\n"+
		"W\3X\3X\3X\3X\2\2Y\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35"+
		"\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33"+
		";\34=\35?\36A\37C E!G\"I#K$M%O&Q\2S\'U(W\2Y\2[)]*_+a,c\2e-g.i/k\60m\61"+
		"o\62q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b"+
		"@\u008dA\u008fB\u0091C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009f"+
		"J\u00a1K\u00a3L\u00a5M\u00a7N\u00a9O\u00abP\u00adQ\u00afR\u00b1S\u00b3"+
		"\2\u00b5T\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3"+
		"\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\4\2,-AA\3\2"+
		"))\2\u0212\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\3_\3"+
		"\2\2\2\3a\3\2\2\2\3e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2"+
		"\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5"+
		"{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\5\u0085"+
		"\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2\2\5\u008d\3\2\2"+
		"\2\5\u008f\3\2\2\2\5\u0091\3\2\2\2\5\u0093\3\2\2\2\6\u0095\3\2\2\2\7\u0097"+
		"\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f\3\2\2"+
		"\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7\3\2\2\2\7\u00a9"+
		"\3\2\2\2\7\u00ab\3\2\2\2\7\u00ad\3\2\2\2\7\u00af\3\2\2\2\b\u00b1\3\2\2"+
		"\2\b\u00b5\3\2\2\2\t\u00b7\3\2\2\2\13\u00bd\3\2\2\2\r\u00c4\3\2\2\2\17"+
		"\u00ca\3\2\2\2\21\u00d0\3\2\2\2\23\u00d8\3\2\2\2\25\u00dd\3\2\2\2\27\u00e0"+
		"\3\2\2\2\31\u00e6\3\2\2\2\33\u00e9\3\2\2\2\35\u00eb\3\2\2\2\37\u00ed\3"+
		"\2\2\2!\u00f2\3\2\2\2#\u00f4\3\2\2\2%\u00f6\3\2\2\2\'\u00f8\3\2\2\2)\u00fc"+
		"\3\2\2\2+\u00fe\3\2\2\2-\u0102\3\2\2\2/\u0106\3\2\2\2\61\u0108\3\2\2\2"+
		"\63\u010a\3\2\2\2\65\u010c\3\2\2\2\67\u010e\3\2\2\29\u0111\3\2\2\2;\u0115"+
		"\3\2\2\2=\u011f\3\2\2\2?\u012a\3\2\2\2A\u0134\3\2\2\2C\u0138\3\2\2\2E"+
		"\u013a\3\2\2\2G\u013c\3\2\2\2I\u013f\3\2\2\2K\u0145\3\2\2\2M\u0147\3\2"+
		"\2\2O\u014a\3\2\2\2Q\u0151\3\2\2\2S\u0155\3\2\2\2U\u0159\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0164\3\2\2\2[\u0167\3\2\2\2]\u016d\3\2\2\2_\u0172\3\2\2\2a"+
		"\u0177\3\2\2\2c\u0180\3\2\2\2e\u0182\3\2\2\2g\u0186\3\2\2\2i\u018a\3\2"+
		"\2\2k\u018e\3\2\2\2m\u0190\3\2\2\2o\u0192\3\2\2\2q\u0194\3\2\2\2s\u0196"+
		"\3\2\2\2u\u019a\3\2\2\2w\u019e\3\2\2\2y\u01a0\3\2\2\2{\u01a7\3\2\2\2}"+
		"\u01a9\3\2\2\2\177\u01ab\3\2\2\2\u0081\u01af\3\2\2\2\u0083\u01b1\3\2\2"+
		"\2\u0085\u01b3\3\2\2\2\u0087\u01b5\3\2\2\2\u0089\u01b7\3\2\2\2\u008b\u01b9"+
		"\3\2\2\2\u008d\u01be\3\2\2\2\u008f\u01c6\3\2\2\2\u0091\u01ca\3\2\2\2\u0093"+
		"\u01cc\3\2\2\2\u0095\u01d3\3\2\2\2\u0097\u01dc\3\2\2\2\u0099\u01e2\3\2"+
		"\2\2\u009b\u01e4\3\2\2\2\u009d\u01e6\3\2\2\2\u009f\u01e8\3\2\2\2\u00a1"+
		"\u01ea\3\2\2\2\u00a3\u01ec\3\2\2\2\u00a5\u01f0\3\2\2\2\u00a7\u01f2\3\2"+
		"\2\2\u00a9\u01f4\3\2\2\2\u00ab\u01f6\3\2\2\2\u00ad\u01f8\3\2\2\2\u00af"+
		"\u01fa\3\2\2\2\u00b1\u01ff\3\2\2\2\u00b3\u0206\3\2\2\2\u00b5\u0208\3\2"+
		"\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\b\2\2\2\u00bb\u00bc\b\2\3\2\u00bc\n\3\2\2\2\u00bd\u00be\7u\2\2"+
		"\u00be\u00bf\7v\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2"+
		"\7w\2\2\u00c2\u00c3\7v\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7v\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\16\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf\20\3\2\2\2\u00d0\u00d6\5E \2"+
		"\u00d1\u00d3\5\35\f\2\u00d2\u00d4\5U(\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\5U(\2\u00d6\u00d1\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\5\21\6\2\u00d9\u00da\5+\23"+
		"\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\7\4\2\u00dc\24\3\2\2\2\u00dd\u00de"+
		"\7\60\2\2\u00de\u00df\5U(\2\u00df\26\3\2\2\2\u00e0\u00e1\7\60\2\2\u00e1"+
		"\u00e2\5U(\2\u00e2\u00e3\5+\23\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\t\4"+
		"\2\u00e5\30\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7@\2\2\u00e8\32\3\2"+
		"\2\2\u00e9\u00ea\7#\2\2\u00ea\34\3\2\2\2\u00eb\u00ec\7B\2\2\u00ec\36\3"+
		"\2\2\2\u00ed\u00ee\7<\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\5U(\2\u00f1 \3\2\2\2\u00f2\u00f3\7<\2\2\u00f3\"\3\2\2\2\u00f4\u00f5"+
		"\7=\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7.\2\2\u00f7&\3\2\2\2\u00f8\u00f9\7"+
		"\60\2\2\u00f9\u00fa\7\60\2\2\u00fa\u00fb\7\60\2\2\u00fb(\3\2\2\2\u00fc"+
		"\u00fd\7\u0080\2\2\u00fd*\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\u0100\3\2\2"+
		"\2\u0100\u0101\b\23\4\2\u0101,\3\2\2\2\u0102\u0103\7+\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\24\5\2\u0105.\3\2\2\2\u0106\u0107\7]\2\2\u0107"+
		"\60\3\2\2\2\u0108\u0109\7_\2\2\u0109\62\3\2\2\2\u010a\u010b\7}\2\2\u010b"+
		"\64\3\2\2\2\u010c\u010d\7\177\2\2\u010d\66\3\2\2\2\u010e\u010f\5U(\2\u010f"+
		"\u0110\5!\16\2\u01108\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\b\32\6\2\u0114:\3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7o\2\2\u0118\u0119\7r\2\2\u0119\u011a\7n\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7v\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2\u011e<\3\2\2"+
		"\2\u011f\u0120\7e\2\2\u0120\u0121\7q\2\2\u0121\u0122\7o\2\2\u0122\u0123"+
		"\7r\2\2\u0123\u0124\7q\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\34\7\2\u0129>\3\2\2\2"+
		"\u012a\u012b\7r\2\2\u012b\u012c\7t\2\2\u012c\u012d\7q\2\2\u012d\u012e"+
		"\7e\2\2\u012e\u012f\7g\2\2\u012f\u0130\7u\2\2\u0130\u0131\7u\2\2\u0131"+
		"\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133@\3\2\2\2\u0134\u0135\7g\2\2\u0135"+
		"\u0136\7p\2\2\u0136\u0137\7f\2\2\u0137B\3\2\2\2\u0138\u0139\7%\2\2\u0139"+
		"D\3\2\2\2\u013a\u013b\7&\2\2\u013bF\3\2\2\2\u013c\u013d\7\60\2\2\u013d"+
		"\u013e\7\60\2\2\u013eH\3\2\2\2\u013f\u0140\t\3\2\2\u0140J\3\2\2\2\u0141"+
		"\u0146\t\4\2\2\u0142\u0143\7o\2\2\u0143\u0144\7q\2\2\u0144\u0146\7f\2"+
		"\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0146L\3\2\2\2\u0147\u0148"+
		"\7\62\2\2\u0148N\3\2\2\2\u0149\u014b\7/\2\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\t\5\2\2\u014d\u014f\5Q"+
		"&\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014fP\3\2\2\2\u0150\u0152"+
		"\t\6\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154R\3\2\2\2\u0155\u0156\7)\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\b\'\b\2\u0158T\3\2\2\2\u0159\u015d\5W)\2\u015a\u015c\5Y*\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015eV\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\t\7\2\2\u0161X\3\2"+
		"\2\2\u0162\u0165\5W)\2\u0163\u0165\t\b\2\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165Z\3\2\2\2\u0166\u0168\t\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\b+\2\2\u016c\\\3\2\2\2\u016d\u016e\7&\2\2\u016e\u016f"+
		"\7*\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b,\4\2\u0171^\3\2\2\2\u0172\u0173"+
		"\7&\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b-\t\2\u0175`\3\2\2\2\u0176\u0178"+
		"\5c/\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017ab\3\2\2\2\u017b\u017c\7)\2\2\u017c\u0181\7)\2\2\u017d"+
		"\u017e\7&\2\2\u017e\u0181\7&\2\2\u017f\u0181\n\t\2\2\u0180\u017b\3\2\2"+
		"\2\u0180\u017d\3\2\2\2\u0180\u017f\3\2\2\2\u0181d\3\2\2\2\u0182\u0183"+
		"\7)\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b\60\5\2\u0185f\3\2\2\2\u0186"+
		"\u0187\7=\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\61\5\2\u0189h\3\2\2\2"+
		"\u018a\u018b\7*\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b\62\4\2\u018dj\3"+
		"\2\2\2\u018e\u018f\5U(\2\u018fl\3\2\2\2\u0190\u0191\5\25\b\2\u0191n\3"+
		"\2\2\2\u0192\u0193\7~\2\2\u0193p\3\2\2\2\u0194\u0195\7.\2\2\u0195r\3\2"+
		"\2\2\u0196\u0197\7>\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b\67\6\2\u0199"+
		"t\3\2\2\2\u019a\u019b\7@\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b8\5\2\u019d"+
		"v\3\2\2\2\u019e\u019f\7\u0080\2\2\u019fx\3\2\2\2\u01a0\u01a1\7A\2\2\u01a1"+
		"\u01a2\7*\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b:\4\2\u01a4z\3\2\2\2\u01a5"+
		"\u01a8\5M$\2\u01a6\u01a8\5O%\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2"+
		"\u01a8|\3\2\2\2\u01a9\u01aa\5G!\2\u01aa~\3\2\2\2\u01ab\u01ac\7)\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\b=\b\2\u01ae\u0080\3\2\2\2\u01af\u01b0\5\63"+
		"\27\2\u01b0\u0082\3\2\2\2\u01b1\u01b2\5\65\30\2\u01b2\u0084\3\2\2\2\u01b3"+
		"\u01b4\5/\25\2\u01b4\u0086\3\2\2\2\u01b5\u01b6\5\61\26\2\u01b6\u0088\3"+
		"\2\2\2\u01b7\u01b8\5\67\31\2\u01b8\u008a\3\2\2\2\u01b9\u01ba\7<\2\2\u01ba"+
		"\u01bb\7<\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5U(\2\u01bd\u008c\3\2\2"+
		"\2\u01be\u01c4\5E \2\u01bf\u01c1\5\35\f\2\u01c0\u01c2\5U(\2\u01c1\u01c0"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c5\5U(\2\u01c4"+
		"\u01bf\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u008e\3\2\2\2\u01c6\u01c7\7*"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bE\4\2\u01c9\u0090\3\2\2\2\u01ca"+
		"\u01cb\5\25\b\2\u01cb\u0092\3\2\2\2\u01cc\u01cd\5[+\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01cf\bG\2\2\u01cf\u0094\3\2\2\2\u01d0\u01d2\n\n\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\t\13\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\bH\2\2\u01da\u01db\bH\5"+
		"\2\u01db\u0096\3\2\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7p\2\2\u01de\u01df"+
		"\7f\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\bI\5\2\u01e1\u0098\3\2\2\2\u01e2"+
		"\u01e3\7>\2\2\u01e3\u009a\3\2\2\2\u01e4\u01e5\7@\2\2\u01e5\u009c\3\2\2"+
		"\2\u01e6\u01e7\7\u0080\2\2\u01e7\u009e\3\2\2\2\u01e8\u01e9\5\67\31\2\u01e9"+
		"\u00a0\3\2\2\2\u01ea\u01eb\t\f\2\2\u01eb\u00a2\3\2\2\2\u01ec\u01ed\7)"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\bO\n\2\u01ef\u00a4\3\2\2\2\u01f0"+
		"\u01f1\7*\2\2\u01f1\u00a6\3\2\2\2\u01f2\u01f3\7+\2\2\u01f3\u00a8\3\2\2"+
		"\2\u01f4\u01f5\7]\2\2\u01f5\u00aa\3\2\2\2\u01f6\u01f7\7_\2\2\u01f7\u00ac"+
		"\3\2\2\2\u01f8\u01f9\5U(\2\u01f9\u00ae\3\2\2\2\u01fa\u01fb\5[+\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\bU\2\2\u01fd\u00b0\3\2\2\2\u01fe\u0200\5\u00b3"+
		"W\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u00b2\3\2\2\2\u0203\u0204\7)\2\2\u0204\u0207\7)\2"+
		"\2\u0205\u0207\n\r\2\2\u0206\u0203\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u00b4"+
		"\3\2\2\2\u0208\u0209\7)\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bX\5\2\u020b"+
		"\u00b6\3\2\2\2\33\2\3\4\5\6\7\b\u00d3\u00d6\u0145\u014a\u014e\u0153\u015d"+
		"\u0164\u0169\u0179\u0180\u01a7\u01c1\u01c4\u01d3\u01d7\u0201\u0206\13"+
		"\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}