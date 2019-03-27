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
		StartComment=1, Stdout=2, Stdin=3, Void=4, Def=5, Dereference=6, StartArrayDereference=7, 
		FieldDereference=8, FieldArrayDereference=9, To=10, ResultMarker=11, At=12, 
		Message=13, Colon=14, SemiColon=15, Comma=16, Deconstructor=17, Invert=18, 
		LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, LeftBrace=23, 
		RightBrace=24, Key=25, StartMatcher=26, StartTemplatesDefinition=27, StartComposerDefinition=28, 
		StartProcessorDefinition=29, EndDefinition=30, TemplateMatch=31, StartDereference=32, 
		Range=33, AdditiveOperator=34, MultiplicativeOperator=35, Zero=36, PositiveInteger=37, 
		START_STRING=38, IDENTIFIER=39, WS=40, StartStringEvaluate=41, StartStringInterpolate=42, 
		STRING_TEXT=43, END_STRING=44, EndInterpolate=45, InterpolateArray=46, 
		InterpolateIdentifier=47, InterpolateField=48, Else=49, MatchComma=50, 
		StartSubMatcher=51, EndMatcher=52, InvertMatch=53, BeginSuchThat=54, MatchInteger=55, 
		MatchAdditiveOperator=56, RangeMatch=57, START_REGEXP=58, StartStructureMatch=59, 
		EndStructureMatch=60, StartArrayMatch=61, EndArrayMatch=62, StructureKey=63, 
		MatchMessage=64, MatchDereference=65, MatchArrayDereference=66, MatchFieldDereference=67, 
		MatcherIgnoreWS=68, Comment=69, ComposerEndDefinition=70, StartComposerMatch=71, 
		EndComposerMatch=72, InvertComposerMatch=73, SequenceKey=74, Multiplier=75, 
		START_REGEX=76, StartSkipRule=77, EndSkipRule=78, StartBuildArray=79, 
		EndBuildArray=80, ComposerId=81, ComposerIgnoreWS=82, REGEX_TEXT=83, END_REGEX=84;
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
			"StartComment", "Stdout", "Stdin", "Void", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "At", 
			"Message", "Colon", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
			"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "PositiveInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
			"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
			"InvertMatch", "BeginSuchThat", "MatchInteger", "MatchAdditiveOperator", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchMessage", "MatchDereference", 
			"MatchArrayDereference", "MatchFieldDereference", "MatcherIgnoreWS", 
			"Comment", "ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", 
			"InvertComposerMatch", "SequenceKey", "Multiplier", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "ComposerId", "ComposerIgnoreWS", 
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, null, null, null, 
			null, "'->'", "'!'", "'@'", null, "':'", null, null, "'...'", null, null, 
			null, null, null, "'{'", "'}'", null, null, "'templates'", "'composer'", 
			"'processor'", null, "'#'", null, "'..'", null, null, "'0'", null, null, 
			null, null, "'$('", null, null, null, null, null, null, null, "'|'", 
			null, null, null, null, "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "Dereference", 
			"StartArrayDereference", "FieldDereference", "FieldArrayDereference", 
			"To", "ResultMarker", "At", "Message", "Colon", "SemiColon", "Comma", 
			"Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "Else", 
			"MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
			"MatchInteger", "MatchAdditiveOperator", "RangeMatch", "START_REGEXP", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0214\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00dd\n\7\3\7\5"+
		"\7\u00e0\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u014f\n$\3%\3%\3&\3&\5&\u0155\n&\3\'\6"+
		"\'\u0158\n\'\r\'\16\'\u0159\3(\3(\3(\3(\3)\3)\7)\u0162\n)\f)\16)\u0165"+
		"\13)\3*\3*\3+\3+\5+\u016b\n+\3,\6,\u016e\n,\r,\16,\u016f\3,\3,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\6/\u017e\n/\r/\16/\u017f\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u0187\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39\3"+
		"9\39\3:\3:\3;\3;\3;\3;\3;\3<\3<\5<\u01ae\n<\3=\3=\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\5F\u01ca\nF\3F\5"+
		"F\u01cd\nF\3G\3G\3G\3G\3H\3H\3I\3I\3I\3I\3J\7J\u01da\nJ\fJ\16J\u01dd\13"+
		"J\3J\5J\u01e0\nJ\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3"+
		"P\3P\3Q\3Q\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3W\3W\3X\6X\u0208"+
		"\nX\rX\16X\u0209\3Y\3Y\3Y\5Y\u020f\nY\3Z\3Z\3Z\3Z\2\2[\t\3\13\4\r\5\17"+
		"\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24"+
		"-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'"+
		"S\2U(W)Y\2[\2]*_+a,c-e\2g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:"+
		"\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093"+
		"D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7"+
		"N\u00a9O\u00abP\u00adQ\u00afR\u00b1S\u00b3T\u00b5U\u00b7\2\u00b9V\t\2"+
		"\3\4\5\6\7\b\16\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62"+
		";\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\4\2,-AA\3\2))\2\u0219\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\3a\3\2\2"+
		"\2\3c\3\2\2\2\3g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\5"+
		"q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3"+
		"\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\5\u0085\3\2\2\2\5"+
		"\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2\2\5\u008d\3\2\2\2\5\u008f"+
		"\3\2\2\2\5\u0091\3\2\2\2\5\u0093\3\2\2\2\5\u0095\3\2\2\2\5\u0097\3\2\2"+
		"\2\6\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f\3\2\2\2\7\u00a1"+
		"\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7\3\2\2\2\7\u00a9\3\2\2"+
		"\2\7\u00ab\3\2\2\2\7\u00ad\3\2\2\2\7\u00af\3\2\2\2\7\u00b1\3\2\2\2\7\u00b3"+
		"\3\2\2\2\b\u00b5\3\2\2\2\b\u00b9\3\2\2\2\t\u00bb\3\2\2\2\13\u00c1\3\2"+
		"\2\2\r\u00c8\3\2\2\2\17\u00ce\3\2\2\2\21\u00d3\3\2\2\2\23\u00d9\3\2\2"+
		"\2\25\u00e1\3\2\2\2\27\u00e6\3\2\2\2\31\u00e9\3\2\2\2\33\u00ef\3\2\2\2"+
		"\35\u00f2\3\2\2\2\37\u00f4\3\2\2\2!\u00f6\3\2\2\2#\u00fb\3\2\2\2%\u00fd"+
		"\3\2\2\2\'\u00ff\3\2\2\2)\u0101\3\2\2\2+\u0105\3\2\2\2-\u0107\3\2\2\2"+
		"/\u010b\3\2\2\2\61\u010f\3\2\2\2\63\u0111\3\2\2\2\65\u0113\3\2\2\2\67"+
		"\u0115\3\2\2\29\u0117\3\2\2\2;\u011a\3\2\2\2=\u011e\3\2\2\2?\u0128\3\2"+
		"\2\2A\u0133\3\2\2\2C\u013d\3\2\2\2E\u0141\3\2\2\2G\u0143\3\2\2\2I\u0145"+
		"\3\2\2\2K\u0148\3\2\2\2M\u014e\3\2\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S"+
		"\u0157\3\2\2\2U\u015b\3\2\2\2W\u015f\3\2\2\2Y\u0166\3\2\2\2[\u016a\3\2"+
		"\2\2]\u016d\3\2\2\2_\u0173\3\2\2\2a\u0178\3\2\2\2c\u017d\3\2\2\2e\u0186"+
		"\3\2\2\2g\u0188\3\2\2\2i\u018c\3\2\2\2k\u0190\3\2\2\2m\u0194\3\2\2\2o"+
		"\u0196\3\2\2\2q\u0198\3\2\2\2s\u019a\3\2\2\2u\u019c\3\2\2\2w\u01a0\3\2"+
		"\2\2y\u01a4\3\2\2\2{\u01a6\3\2\2\2}\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081"+
		"\u01b1\3\2\2\2\u0083\u01b3\3\2\2\2\u0085\u01b7\3\2\2\2\u0087\u01b9\3\2"+
		"\2\2\u0089\u01bb\3\2\2\2\u008b\u01bd\3\2\2\2\u008d\u01bf\3\2\2\2\u008f"+
		"\u01c1\3\2\2\2\u0091\u01c6\3\2\2\2\u0093\u01ce\3\2\2\2\u0095\u01d2\3\2"+
		"\2\2\u0097\u01d4\3\2\2\2\u0099\u01db\3\2\2\2\u009b\u01e4\3\2\2\2\u009d"+
		"\u01ea\3\2\2\2\u009f\u01ec\3\2\2\2\u00a1\u01ee\3\2\2\2\u00a3\u01f0\3\2"+
		"\2\2\u00a5\u01f2\3\2\2\2\u00a7\u01f4\3\2\2\2\u00a9\u01f8\3\2\2\2\u00ab"+
		"\u01fa\3\2\2\2\u00ad\u01fc\3\2\2\2\u00af\u01fe\3\2\2\2\u00b1\u0200\3\2"+
		"\2\2\u00b3\u0202\3\2\2\2\u00b5\u0207\3\2\2\2\u00b7\u020e\3\2\2\2\u00b9"+
		"\u0210\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\b\2\2\2\u00bf\u00c0\b\2\3\2\u00c0\n\3\2\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7v\2\2\u00c7\f\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\16\3\2\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"k\2\2\u00d1\u00d2\7f\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8"+
		"\22\3\2\2\2\u00d9\u00df\5G!\2\u00da\u00dc\5\37\r\2\u00db\u00dd\5W)\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5W"+
		")\2\u00df\u00da\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\24\3\2\2\2\u00e1\u00e2"+
		"\5\23\7\2\u00e2\u00e3\5-\24\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\b\4\2"+
		"\u00e5\26\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8\5W)\2\u00e8\30\3\2"+
		"\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\5W)\2\u00eb\u00ec\5-\24\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\b\n\4\2\u00ee\32\3\2\2\2\u00ef\u00f0\7/\2\2"+
		"\u00f0\u00f1\7@\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\36\3\2\2"+
		"\2\u00f4\u00f5\7B\2\2\u00f5 \3\2\2\2\u00f6\u00f7\7<\2\2\u00f7\u00f8\7"+
		"<\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5W)\2\u00fa\"\3\2\2\2\u00fb\u00fc"+
		"\7<\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7=\2\2\u00fe&\3\2\2\2\u00ff\u0100\7"+
		".\2\2\u0100(\3\2\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\60\2\2\u0103\u0104"+
		"\7\60\2\2\u0104*\3\2\2\2\u0105\u0106\7\u0080\2\2\u0106,\3\2\2\2\u0107"+
		"\u0108\7*\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\24\4\2\u010a.\3\2\2\2"+
		"\u010b\u010c\7+\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\25\5\2\u010e\60"+
		"\3\2\2\2\u010f\u0110\7]\2\2\u0110\62\3\2\2\2\u0111\u0112\7_\2\2\u0112"+
		"\64\3\2\2\2\u0113\u0114\7}\2\2\u0114\66\3\2\2\2\u0115\u0116\7\177\2\2"+
		"\u01168\3\2\2\2\u0117\u0118\5W)\2\u0118\u0119\5#\17\2\u0119:\3\2\2\2\u011a"+
		"\u011b\7>\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\33\6\2\u011d<\3\2\2\2"+
		"\u011e\u011f\7v\2\2\u011f\u0120\7g\2\2\u0120\u0121\7o\2\2\u0121\u0122"+
		"\7r\2\2\u0122\u0123\7n\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127>\3\2\2\2\u0128\u0129\7e\2\2\u0129"+
		"\u012a\7q\2\2\u012a\u012b\7o\2\2\u012b\u012c\7r\2\2\u012c\u012d\7q\2\2"+
		"\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\b\35\7\2\u0132@\3\2\2\2\u0133\u0134\7r\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7q\2\2\u0136\u0137\7e\2\2\u0137\u0138\7g\2\2"+
		"\u0138\u0139\7u\2\2\u0139\u013a\7u\2\2\u013a\u013b\7q\2\2\u013b\u013c"+
		"\7t\2\2\u013cB\3\2\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2\u013f\u0140"+
		"\7f\2\2\u0140D\3\2\2\2\u0141\u0142\7%\2\2\u0142F\3\2\2\2\u0143\u0144\7"+
		"&\2\2\u0144H\3\2\2\2\u0145\u0146\7\60\2\2\u0146\u0147\7\60\2\2\u0147J"+
		"\3\2\2\2\u0148\u0149\t\3\2\2\u0149L\3\2\2\2\u014a\u014f\t\4\2\2\u014b"+
		"\u014c\7o\2\2\u014c\u014d\7q\2\2\u014d\u014f\7f\2\2\u014e\u014a\3\2\2"+
		"\2\u014e\u014b\3\2\2\2\u014fN\3\2\2\2\u0150\u0151\7\62\2\2\u0151P\3\2"+
		"\2\2\u0152\u0154\t\5\2\2\u0153\u0155\5S\'\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155R\3\2\2\2\u0156\u0158\t\6\2\2\u0157\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015aT\3"+
		"\2\2\2\u015b\u015c\7)\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b(\b\2\u015e"+
		"V\3\2\2\2\u015f\u0163\5Y*\2\u0160\u0162\5[+\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164X\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0167\t\7\2\2\u0167Z\3\2\2\2\u0168\u016b\5"+
		"Y*\2\u0169\u016b\t\b\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\\\3\2\2\2\u016c\u016e\t\2\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\b,\2\2\u0172^\3\2\2\2\u0173\u0174\7&\2\2\u0174\u0175\7*\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0177\b-\4\2\u0177`\3\2\2\2\u0178\u0179\7&\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\b.\t\2\u017bb\3\2\2\2\u017c\u017e\5e\60\2\u017d\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"d\3\2\2\2\u0181\u0182\7)\2\2\u0182\u0187\7)\2\2\u0183\u0184\7&\2\2\u0184"+
		"\u0187\7&\2\2\u0185\u0187\n\t\2\2\u0186\u0181\3\2\2\2\u0186\u0183\3\2"+
		"\2\2\u0186\u0185\3\2\2\2\u0187f\3\2\2\2\u0188\u0189\7)\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\b\61\5\2\u018bh\3\2\2\2\u018c\u018d\7=\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\b\62\5\2\u018fj\3\2\2\2\u0190\u0191\7*\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\b\63\4\2\u0193l\3\2\2\2\u0194\u0195\5"+
		"W)\2\u0195n\3\2\2\2\u0196\u0197\5\27\t\2\u0197p\3\2\2\2\u0198\u0199\7"+
		"~\2\2\u0199r\3\2\2\2\u019a\u019b\7.\2\2\u019bt\3\2\2\2\u019c\u019d\7>"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b8\6\2\u019fv\3\2\2\2\u01a0\u01a1"+
		"\7@\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b9\5\2\u01a3x\3\2\2\2\u01a4\u01a5"+
		"\7\u0080\2\2\u01a5z\3\2\2\2\u01a6\u01a7\7A\2\2\u01a7\u01a8\7*\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\b;\4\2\u01aa|\3\2\2\2\u01ab\u01ae\5O%\2\u01ac"+
		"\u01ae\5Q&\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae~\3\2\2\2\u01af"+
		"\u01b0\t\3\2\2\u01b0\u0080\3\2\2\2\u01b1\u01b2\5I\"\2\u01b2\u0082\3\2"+
		"\2\2\u01b3\u01b4\7)\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b?\b\2\u01b6\u0084"+
		"\3\2\2\2\u01b7\u01b8\5\65\30\2\u01b8\u0086\3\2\2\2\u01b9\u01ba\5\67\31"+
		"\2\u01ba\u0088\3\2\2\2\u01bb\u01bc\5\61\26\2\u01bc\u008a\3\2\2\2\u01bd"+
		"\u01be\5\63\27\2\u01be\u008c\3\2\2\2\u01bf\u01c0\59\32\2\u01c0\u008e\3"+
		"\2\2\2\u01c1\u01c2\7<\2\2\u01c2\u01c3\7<\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\5W)\2\u01c5\u0090\3\2\2\2\u01c6\u01cc\5G!\2\u01c7\u01c9\5\37\r"+
		"\2\u01c8\u01ca\5W)\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd"+
		"\3\2\2\2\u01cb\u01cd\5W)\2\u01cc\u01c7\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u0092\3\2\2\2\u01ce\u01cf\7*\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\bG\4"+
		"\2\u01d1\u0094\3\2\2\2\u01d2\u01d3\5\27\t\2\u01d3\u0096\3\2\2\2\u01d4"+
		"\u01d5\5],\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\bI\2\2\u01d7\u0098\3\2\2"+
		"\2\u01d8\u01da\n\n\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e0\t\13\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\b"+
		"J\2\2\u01e2\u01e3\bJ\5\2\u01e3\u009a\3\2\2\2\u01e4\u01e5\7g\2\2\u01e5"+
		"\u01e6\7p\2\2\u01e6\u01e7\7f\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\bK\5"+
		"\2\u01e9\u009c\3\2\2\2\u01ea\u01eb\7>\2\2\u01eb\u009e\3\2\2\2\u01ec\u01ed"+
		"\7@\2\2\u01ed\u00a0\3\2\2\2\u01ee\u01ef\7\u0080\2\2\u01ef\u00a2\3\2\2"+
		"\2\u01f0\u01f1\59\32\2\u01f1\u00a4\3\2\2\2\u01f2\u01f3\t\f\2\2\u01f3\u00a6"+
		"\3\2\2\2\u01f4\u01f5\7)\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\bQ\n\2\u01f7"+
		"\u00a8\3\2\2\2\u01f8\u01f9\7*\2\2\u01f9\u00aa\3\2\2\2\u01fa\u01fb\7+\2"+
		"\2\u01fb\u00ac\3\2\2\2\u01fc\u01fd\7]\2\2\u01fd\u00ae\3\2\2\2\u01fe\u01ff"+
		"\7_\2\2\u01ff\u00b0\3\2\2\2\u0200\u0201\5W)\2\u0201\u00b2\3\2\2\2\u0202"+
		"\u0203\5],\2\u0203\u0204\3\2\2\2\u0204\u0205\bW\2\2\u0205\u00b4\3\2\2"+
		"\2\u0206\u0208\5\u00b7Y\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u00b6\3\2\2\2\u020b\u020c\7)"+
		"\2\2\u020c\u020f\7)\2\2\u020d\u020f\n\r\2\2\u020e\u020b\3\2\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u00b8\3\2\2\2\u0210\u0211\7)\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\bZ\5\2\u0213\u00ba\3\2\2\2\32\2\3\4\5\6\7\b\u00dc\u00df"+
		"\u014e\u0154\u0159\u0163\u016a\u016f\u017f\u0186\u01ad\u01c9\u01cc\u01db"+
		"\u01df\u0209\u020e\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2"+
		"\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}