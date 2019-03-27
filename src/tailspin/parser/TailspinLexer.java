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
		Range=33, AdditiveOperator=34, MultiplicativeOperator=35, Zero=36, NonZeroInteger=37, 
		START_STRING=38, IDENTIFIER=39, WS=40, StartStringEvaluate=41, StartStringInterpolate=42, 
		STRING_TEXT=43, END_STRING=44, EndInterpolate=45, InterpolateArray=46, 
		InterpolateIdentifier=47, InterpolateField=48, Else=49, MatchComma=50, 
		StartSubMatcher=51, EndMatcher=52, InvertMatch=53, BeginSuchThat=54, MatchInteger=55, 
		RangeMatch=56, START_REGEXP=57, StartStructureMatch=58, EndStructureMatch=59, 
		StartArrayMatch=60, EndArrayMatch=61, StructureKey=62, MatchMessage=63, 
		MatchDereference=64, MatchArrayDereference=65, MatchFieldDereference=66, 
		MatcherIgnoreWS=67, Comment=68, ComposerEndDefinition=69, StartComposerMatch=70, 
		EndComposerMatch=71, InvertComposerMatch=72, SequenceKey=73, Multiplier=74, 
		START_REGEX=75, StartSkipRule=76, EndSkipRule=77, StartBuildArray=78, 
		EndBuildArray=79, ComposerId=80, ComposerIgnoreWS=81, REGEX_TEXT=82, END_REGEX=83;
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
			"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "Else", 
			"MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
			"MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StartArrayMatch", "EndArrayMatch", "StructureKey", 
			"MatchMessage", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u0213\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00db\n\7\3\7\5\7\u00de"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3$\5$\u014d\n$\3%\3%\3&\5&\u0152\n&\3&\3&\5&\u0156\n&"+
		"\3\'\6\'\u0159\n\'\r\'\16\'\u015a\3(\3(\3(\3(\3)\3)\7)\u0163\n)\f)\16"+
		")\u0166\13)\3*\3*\3+\3+\5+\u016c\n+\3,\6,\u016f\n,\r,\16,\u0170\3,\3,"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\6/\u017f\n/\r/\16/\u0180\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u0188\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\3"+
		"9\39\39\39\3:\3:\3;\3;\3;\3;\3;\3<\3<\5<\u01af\n<\3=\3=\3>\3>\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\5E\u01c9\nE\3E\5"+
		"E\u01cc\nE\3F\3F\3F\3F\3G\3G\3H\3H\3H\3H\3I\7I\u01d9\nI\fI\16I\u01dc\13"+
		"I\3I\5I\u01df\nI\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3"+
		"O\3O\3P\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\3V\3W\6W\u0207"+
		"\nW\rW\16W\u0208\3X\3X\3X\5X\u020e\nX\3Y\3Y\3Y\3Y\2\2Z\t\3\13\4\r\5\17"+
		"\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24"+
		"-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'"+
		"S\2U(W)Y\2[\2]*_+a,c-e\2g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:"+
		"\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093"+
		"D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7"+
		"N\u00a9O\u00abP\u00adQ\u00afR\u00b1S\u00b3T\u00b5\2\u00b7U\t\2\3\4\5\6"+
		"\7\b\16\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\"+
		"c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\4\2,-AA\3\2))\2\u0219\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\3a\3\2\2\2\3c\3"+
		"\2\2\2\3g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\5q\3\2\2"+
		"\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5"+
		"\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\5\u0085\3\2\2\2\5\u0087\3"+
		"\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2\2\5\u008d\3\2\2\2\5\u008f\3\2\2\2"+
		"\5\u0091\3\2\2\2\5\u0093\3\2\2\2\5\u0095\3\2\2\2\6\u0097\3\2\2\2\7\u0099"+
		"\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f\3\2\2\2\7\u00a1\3\2\2"+
		"\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7\3\2\2\2\7\u00a9\3\2\2\2\7\u00ab"+
		"\3\2\2\2\7\u00ad\3\2\2\2\7\u00af\3\2\2\2\7\u00b1\3\2\2\2\b\u00b3\3\2\2"+
		"\2\b\u00b7\3\2\2\2\t\u00b9\3\2\2\2\13\u00bf\3\2\2\2\r\u00c6\3\2\2\2\17"+
		"\u00cc\3\2\2\2\21\u00d1\3\2\2\2\23\u00d7\3\2\2\2\25\u00df\3\2\2\2\27\u00e4"+
		"\3\2\2\2\31\u00e7\3\2\2\2\33\u00ed\3\2\2\2\35\u00f0\3\2\2\2\37\u00f2\3"+
		"\2\2\2!\u00f4\3\2\2\2#\u00f9\3\2\2\2%\u00fb\3\2\2\2\'\u00fd\3\2\2\2)\u00ff"+
		"\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u0109\3\2\2\2\61\u010d\3\2\2\2"+
		"\63\u010f\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u0118"+
		"\3\2\2\2=\u011c\3\2\2\2?\u0126\3\2\2\2A\u0131\3\2\2\2C\u013b\3\2\2\2E"+
		"\u013f\3\2\2\2G\u0141\3\2\2\2I\u0143\3\2\2\2K\u0146\3\2\2\2M\u014c\3\2"+
		"\2\2O\u014e\3\2\2\2Q\u0151\3\2\2\2S\u0158\3\2\2\2U\u015c\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0167\3\2\2\2[\u016b\3\2\2\2]\u016e\3\2\2\2_\u0174\3\2\2\2a"+
		"\u0179\3\2\2\2c\u017e\3\2\2\2e\u0187\3\2\2\2g\u0189\3\2\2\2i\u018d\3\2"+
		"\2\2k\u0191\3\2\2\2m\u0195\3\2\2\2o\u0197\3\2\2\2q\u0199\3\2\2\2s\u019b"+
		"\3\2\2\2u\u019d\3\2\2\2w\u01a1\3\2\2\2y\u01a5\3\2\2\2{\u01a7\3\2\2\2}"+
		"\u01ae\3\2\2\2\177\u01b0\3\2\2\2\u0081\u01b2\3\2\2\2\u0083\u01b6\3\2\2"+
		"\2\u0085\u01b8\3\2\2\2\u0087\u01ba\3\2\2\2\u0089\u01bc\3\2\2\2\u008b\u01be"+
		"\3\2\2\2\u008d\u01c0\3\2\2\2\u008f\u01c5\3\2\2\2\u0091\u01cd\3\2\2\2\u0093"+
		"\u01d1\3\2\2\2\u0095\u01d3\3\2\2\2\u0097\u01da\3\2\2\2\u0099\u01e3\3\2"+
		"\2\2\u009b\u01e9\3\2\2\2\u009d\u01eb\3\2\2\2\u009f\u01ed\3\2\2\2\u00a1"+
		"\u01ef\3\2\2\2\u00a3\u01f1\3\2\2\2\u00a5\u01f3\3\2\2\2\u00a7\u01f7\3\2"+
		"\2\2\u00a9\u01f9\3\2\2\2\u00ab\u01fb\3\2\2\2\u00ad\u01fd\3\2\2\2\u00af"+
		"\u01ff\3\2\2\2\u00b1\u0201\3\2\2\2\u00b3\u0206\3\2\2\2\u00b5\u020d\3\2"+
		"\2\2\u00b7\u020f\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\61\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\2\2\2\u00bd\u00be\b\2\3\2\u00be\n\3\2\2\2"+
		"\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3"+
		"\7q\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7v\2\2\u00c5\f\3\2\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7k\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb\16\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7f\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\t\2\2"+
		"\2\u00d6\22\3\2\2\2\u00d7\u00dd\5G!\2\u00d8\u00da\5\37\r\2\u00d9\u00db"+
		"\5W)\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00de\5W)\2\u00dd\u00d8\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\24\3\2\2\2"+
		"\u00df\u00e0\5\23\7\2\u00e0\u00e1\5-\24\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\b\b\4\2\u00e3\26\3\2\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\5W)\2\u00e6"+
		"\30\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00e9\5W)\2\u00e9\u00ea\5-\24\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b\n\4\2\u00ec\32\3\2\2\2\u00ed\u00ee"+
		"\7/\2\2\u00ee\u00ef\7@\2\2\u00ef\34\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\36"+
		"\3\2\2\2\u00f2\u00f3\7B\2\2\u00f3 \3\2\2\2\u00f4\u00f5\7<\2\2\u00f5\u00f6"+
		"\7<\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5W)\2\u00f8\"\3\2\2\2\u00f9\u00fa"+
		"\7<\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7=\2\2\u00fc&\3\2\2\2\u00fd\u00fe\7"+
		".\2\2\u00fe(\3\2\2\2\u00ff\u0100\7\60\2\2\u0100\u0101\7\60\2\2\u0101\u0102"+
		"\7\60\2\2\u0102*\3\2\2\2\u0103\u0104\7\u0080\2\2\u0104,\3\2\2\2\u0105"+
		"\u0106\7*\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\24\4\2\u0108.\3\2\2\2"+
		"\u0109\u010a\7+\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\25\5\2\u010c\60"+
		"\3\2\2\2\u010d\u010e\7]\2\2\u010e\62\3\2\2\2\u010f\u0110\7_\2\2\u0110"+
		"\64\3\2\2\2\u0111\u0112\7}\2\2\u0112\66\3\2\2\2\u0113\u0114\7\177\2\2"+
		"\u01148\3\2\2\2\u0115\u0116\5W)\2\u0116\u0117\5#\17\2\u0117:\3\2\2\2\u0118"+
		"\u0119\7>\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\33\6\2\u011b<\3\2\2\2"+
		"\u011c\u011d\7v\2\2\u011d\u011e\7g\2\2\u011e\u011f\7o\2\2\u011f\u0120"+
		"\7r\2\2\u0120\u0121\7n\2\2\u0121\u0122\7c\2\2\u0122\u0123\7v\2\2\u0123"+
		"\u0124\7g\2\2\u0124\u0125\7u\2\2\u0125>\3\2\2\2\u0126\u0127\7e\2\2\u0127"+
		"\u0128\7q\2\2\u0128\u0129\7o\2\2\u0129\u012a\7r\2\2\u012a\u012b\7q\2\2"+
		"\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\b\35\7\2\u0130@\3\2\2\2\u0131\u0132\7r\2\2\u0132"+
		"\u0133\7t\2\2\u0133\u0134\7q\2\2\u0134\u0135\7e\2\2\u0135\u0136\7g\2\2"+
		"\u0136\u0137\7u\2\2\u0137\u0138\7u\2\2\u0138\u0139\7q\2\2\u0139\u013a"+
		"\7t\2\2\u013aB\3\2\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013d\u013e"+
		"\7f\2\2\u013eD\3\2\2\2\u013f\u0140\7%\2\2\u0140F\3\2\2\2\u0141\u0142\7"+
		"&\2\2\u0142H\3\2\2\2\u0143\u0144\7\60\2\2\u0144\u0145\7\60\2\2\u0145J"+
		"\3\2\2\2\u0146\u0147\t\3\2\2\u0147L\3\2\2\2\u0148\u014d\t\4\2\2\u0149"+
		"\u014a\7o\2\2\u014a\u014b\7q\2\2\u014b\u014d\7f\2\2\u014c\u0148\3\2\2"+
		"\2\u014c\u0149\3\2\2\2\u014dN\3\2\2\2\u014e\u014f\7\62\2\2\u014fP\3\2"+
		"\2\2\u0150\u0152\7/\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0155\t\5\2\2\u0154\u0156\5S\'\2\u0155\u0154\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156R\3\2\2\2\u0157\u0159\t\6\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"T\3\2\2\2\u015c\u015d\7)\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b(\b\2\u015f"+
		"V\3\2\2\2\u0160\u0164\5Y*\2\u0161\u0163\5[+\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165X\3\2\2\2"+
		"\u0166\u0164\3\2\2\2\u0167\u0168\t\7\2\2\u0168Z\3\2\2\2\u0169\u016c\5"+
		"Y*\2\u016a\u016c\t\b\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\\\3\2\2\2\u016d\u016f\t\2\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\b,\2\2\u0173^\3\2\2\2\u0174\u0175\7&\2\2\u0175\u0176\7*\2\2\u0176\u0177"+
		"\3\2\2\2\u0177\u0178\b-\4\2\u0178`\3\2\2\2\u0179\u017a\7&\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\b.\t\2\u017cb\3\2\2\2\u017d\u017f\5e\60\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"d\3\2\2\2\u0182\u0183\7)\2\2\u0183\u0188\7)\2\2\u0184\u0185\7&\2\2\u0185"+
		"\u0188\7&\2\2\u0186\u0188\n\t\2\2\u0187\u0182\3\2\2\2\u0187\u0184\3\2"+
		"\2\2\u0187\u0186\3\2\2\2\u0188f\3\2\2\2\u0189\u018a\7)\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\b\61\5\2\u018ch\3\2\2\2\u018d\u018e\7=\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\b\62\5\2\u0190j\3\2\2\2\u0191\u0192\7*\2\2"+
		"\u0192\u0193\3\2\2\2\u0193\u0194\b\63\4\2\u0194l\3\2\2\2\u0195\u0196\5"+
		"W)\2\u0196n\3\2\2\2\u0197\u0198\5\27\t\2\u0198p\3\2\2\2\u0199\u019a\7"+
		"~\2\2\u019ar\3\2\2\2\u019b\u019c\7.\2\2\u019ct\3\2\2\2\u019d\u019e\7>"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b8\6\2\u01a0v\3\2\2\2\u01a1\u01a2"+
		"\7@\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\b9\5\2\u01a4x\3\2\2\2\u01a5\u01a6"+
		"\7\u0080\2\2\u01a6z\3\2\2\2\u01a7\u01a8\7A\2\2\u01a8\u01a9\7*\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\b;\4\2\u01ab|\3\2\2\2\u01ac\u01af\5O%\2\u01ad"+
		"\u01af\5Q&\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af~\3\2\2\2\u01b0"+
		"\u01b1\5I\"\2\u01b1\u0080\3\2\2\2\u01b2\u01b3\7)\2\2\u01b3\u01b4\3\2\2"+
		"\2\u01b4\u01b5\b>\b\2\u01b5\u0082\3\2\2\2\u01b6\u01b7\5\65\30\2\u01b7"+
		"\u0084\3\2\2\2\u01b8\u01b9\5\67\31\2\u01b9\u0086\3\2\2\2\u01ba\u01bb\5"+
		"\61\26\2\u01bb\u0088\3\2\2\2\u01bc\u01bd\5\63\27\2\u01bd\u008a\3\2\2\2"+
		"\u01be\u01bf\59\32\2\u01bf\u008c\3\2\2\2\u01c0\u01c1\7<\2\2\u01c1\u01c2"+
		"\7<\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\5W)\2\u01c4\u008e\3\2\2\2\u01c5"+
		"\u01cb\5G!\2\u01c6\u01c8\5\37\r\2\u01c7\u01c9\5W)\2\u01c8\u01c7\3\2\2"+
		"\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cc\5W)\2\u01cb\u01c6"+
		"\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u0090\3\2\2\2\u01cd\u01ce\7*\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\bF\4\2\u01d0\u0092\3\2\2\2\u01d1\u01d2\5\27"+
		"\t\2\u01d2\u0094\3\2\2\2\u01d3\u01d4\5],\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6"+
		"\bH\2\2\u01d6\u0096\3\2\2\2\u01d7\u01d9\n\n\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df\t\13\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\bI\2\2\u01e1\u01e2\bI\5\2\u01e2\u0098\3\2\2"+
		"\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7f\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\bJ\5\2\u01e8\u009a\3\2\2\2\u01e9\u01ea\7>\2\2\u01ea"+
		"\u009c\3\2\2\2\u01eb\u01ec\7@\2\2\u01ec\u009e\3\2\2\2\u01ed\u01ee\7\u0080"+
		"\2\2\u01ee\u00a0\3\2\2\2\u01ef\u01f0\59\32\2\u01f0\u00a2\3\2\2\2\u01f1"+
		"\u01f2\t\f\2\2\u01f2\u00a4\3\2\2\2\u01f3\u01f4\7)\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\bP\n\2\u01f6\u00a6\3\2\2\2\u01f7\u01f8\7*\2\2\u01f8\u00a8"+
		"\3\2\2\2\u01f9\u01fa\7+\2\2\u01fa\u00aa\3\2\2\2\u01fb\u01fc\7]\2\2\u01fc"+
		"\u00ac\3\2\2\2\u01fd\u01fe\7_\2\2\u01fe\u00ae\3\2\2\2\u01ff\u0200\5W)"+
		"\2\u0200\u00b0\3\2\2\2\u0201\u0202\5],\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\bV\2\2\u0204\u00b2\3\2\2\2\u0205\u0207\5\u00b5X\2\u0206\u0205\3\2\2\2"+
		"\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u00b4"+
		"\3\2\2\2\u020a\u020b\7)\2\2\u020b\u020e\7)\2\2\u020c\u020e\n\r\2\2\u020d"+
		"\u020a\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u00b6\3\2\2\2\u020f\u0210\7)"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\bY\5\2\u0212\u00b8\3\2\2\2\33\2\3"+
		"\4\5\6\7\b\u00da\u00dd\u014c\u0151\u0155\u015a\u0164\u016b\u0170\u0180"+
		"\u0187\u01ae\u01c8\u01cb\u01da\u01de\u0208\u020d\13\b\2\2\7\6\2\7\2\2"+
		"\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}