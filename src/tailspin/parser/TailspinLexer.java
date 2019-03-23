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
		EndDefinition=28, TemplateMatch=29, StartDereference=30, Range=31, AdditiveOperator=32, 
		MultiplicativeOperator=33, Zero=34, NonZeroInteger=35, START_STRING=36, 
		IDENTIFIER=37, WS=38, StartStringEvaluate=39, StartStringInterpolate=40, 
		STRING_TEXT=41, END_STRING=42, EndInterpolate=43, InterpolateArray=44, 
		InterpolateIdentifier=45, InterpolateField=46, Else=47, MatchComma=48, 
		StartSubMatcher=49, EndMatcher=50, InvertMatch=51, BeginSuchThat=52, MatchInteger=53, 
		RangeMatch=54, START_REGEXP=55, StartStructureMatch=56, EndStructureMatch=57, 
		StartArrayMatch=58, EndArrayMatch=59, StructureKey=60, MatchMessage=61, 
		MatchDereference=62, MatchArrayDereference=63, MatchFieldDereference=64, 
		MatcherIgnoreWS=65, Comment=66, ComposerEndDefinition=67, StartComposerMatch=68, 
		EndComposerMatch=69, InvertComposerMatch=70, SequenceKey=71, Multiplier=72, 
		START_REGEX=73, StartSkipRule=74, EndSkipRule=75, StartBuildArray=76, 
		EndBuildArray=77, ComposerId=78, ComposerIgnoreWS=79, REGEX_TEXT=80, END_REGEX=81;
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
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"EndInterpolate", "InterpolateArray", "InterpolateIdentifier", "InterpolateField", 
			"Else", "MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", 
			"BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StartArrayMatch", "EndArrayMatch", "StructureKey", 
			"MatchMessage", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
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
			"'!'", "'@'", null, "':'", null, null, "'...'", null, null, null, null, 
			null, "'{'", "'}'", null, null, "'templates'", "'composer'", null, "'#'", 
			null, "'..'", null, null, "'0'", null, null, null, null, "'$('", null, 
			null, null, null, null, null, null, "'|'", null, null, null, null, "'?('"
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
			"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", 
			"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0200\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6\u00d2\n\6\3\6\5\6\u00d5\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\""+
		"\3\"\3\"\3\"\5\"\u013a\n\"\3#\3#\3$\5$\u013f\n$\3$\3$\5$\u0143\n$\3%\6"+
		"%\u0146\n%\r%\16%\u0147\3&\3&\3&\3&\3\'\3\'\7\'\u0150\n\'\f\'\16\'\u0153"+
		"\13\'\3(\3(\3)\3)\5)\u0159\n)\3*\6*\u015c\n*\r*\16*\u015d\3*\3*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3-\6-\u016c\n-\r-\16-\u016d\3.\3.\3.\3.\3.\5.\u0175"+
		"\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\39\39\39\39\39\3:\3:\5:\u019c\n:\3;\3;\3<\3<\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\5C\u01b6\nC\3C\5C\u01b9\nC\3D\3"+
		"D\3D\3D\3E\3E\3F\3F\3F\3F\3G\7G\u01c6\nG\fG\16G\u01c9\13G\3G\5G\u01cc"+
		"\nG\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3N"+
		"\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T\3U\6U\u01f4\nU\rU\16U\u01f5"+
		"\3V\3V\3V\5V\u01fb\nV\3W\3W\3W\3W\2\2X\t\3\13\4\r\5\17\6\21\7\23\b\25"+
		"\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63"+
		"\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O\2Q&S\'U\2W\2Y([)]*_"+
		"+a\2c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085"+
		"=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093D\u0095E\u0097F\u0099"+
		"G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7N\u00a9O\u00abP\u00ad"+
		"Q\u00afR\u00b1\2\u00b3S\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17\"\"\4\2--//"+
		"\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f"+
		"\f\4\2,-AA\3\2))\2\u0206\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\3]"+
		"\3\2\2\2\3_\3\2\2\2\3c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2"+
		"\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2"+
		"\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083"+
		"\3\2\2\2\5\u0085\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2"+
		"\2\5\u008d\3\2\2\2\5\u008f\3\2\2\2\5\u0091\3\2\2\2\6\u0093\3\2\2\2\7\u0095"+
		"\3\2\2\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2"+
		"\2\7\u009f\3\2\2\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7"+
		"\3\2\2\2\7\u00a9\3\2\2\2\7\u00ab\3\2\2\2\7\u00ad\3\2\2\2\b\u00af\3\2\2"+
		"\2\b\u00b3\3\2\2\2\t\u00b5\3\2\2\2\13\u00bb\3\2\2\2\r\u00c2\3\2\2\2\17"+
		"\u00c8\3\2\2\2\21\u00ce\3\2\2\2\23\u00d6\3\2\2\2\25\u00db\3\2\2\2\27\u00de"+
		"\3\2\2\2\31\u00e4\3\2\2\2\33\u00e7\3\2\2\2\35\u00e9\3\2\2\2\37\u00eb\3"+
		"\2\2\2!\u00f0\3\2\2\2#\u00f2\3\2\2\2%\u00f4\3\2\2\2\'\u00f6\3\2\2\2)\u00fa"+
		"\3\2\2\2+\u00fc\3\2\2\2-\u0100\3\2\2\2/\u0104\3\2\2\2\61\u0106\3\2\2\2"+
		"\63\u0108\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2\29\u010f\3\2\2\2;\u0113"+
		"\3\2\2\2=\u011d\3\2\2\2?\u0128\3\2\2\2A\u012c\3\2\2\2C\u012e\3\2\2\2E"+
		"\u0130\3\2\2\2G\u0133\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u013e\3\2"+
		"\2\2O\u0145\3\2\2\2Q\u0149\3\2\2\2S\u014d\3\2\2\2U\u0154\3\2\2\2W\u0158"+
		"\3\2\2\2Y\u015b\3\2\2\2[\u0161\3\2\2\2]\u0166\3\2\2\2_\u016b\3\2\2\2a"+
		"\u0174\3\2\2\2c\u0176\3\2\2\2e\u017a\3\2\2\2g\u017e\3\2\2\2i\u0182\3\2"+
		"\2\2k\u0184\3\2\2\2m\u0186\3\2\2\2o\u0188\3\2\2\2q\u018a\3\2\2\2s\u018e"+
		"\3\2\2\2u\u0192\3\2\2\2w\u0194\3\2\2\2y\u019b\3\2\2\2{\u019d\3\2\2\2}"+
		"\u019f\3\2\2\2\177\u01a3\3\2\2\2\u0081\u01a5\3\2\2\2\u0083\u01a7\3\2\2"+
		"\2\u0085\u01a9\3\2\2\2\u0087\u01ab\3\2\2\2\u0089\u01ad\3\2\2\2\u008b\u01b2"+
		"\3\2\2\2\u008d\u01ba\3\2\2\2\u008f\u01be\3\2\2\2\u0091\u01c0\3\2\2\2\u0093"+
		"\u01c7\3\2\2\2\u0095\u01d0\3\2\2\2\u0097\u01d6\3\2\2\2\u0099\u01d8\3\2"+
		"\2\2\u009b\u01da\3\2\2\2\u009d\u01dc\3\2\2\2\u009f\u01de\3\2\2\2\u00a1"+
		"\u01e0\3\2\2\2\u00a3\u01e4\3\2\2\2\u00a5\u01e6\3\2\2\2\u00a7\u01e8\3\2"+
		"\2\2\u00a9\u01ea\3\2\2\2\u00ab\u01ec\3\2\2\2\u00ad\u01ee\3\2\2\2\u00af"+
		"\u01f3\3\2\2\2\u00b1\u01fa\3\2\2\2\u00b3\u01fc\3\2\2\2\u00b5\u00b6\7\61"+
		"\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\2\2\2\u00b9"+
		"\u00ba\b\2\3\2\u00ba\n\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7f\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7v\2\2"+
		"\u00c1\f\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7f"+
		"\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\16\3\2\2\2\u00c8\u00c9"+
		"\7f\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\t\2\2\2\u00cd\20\3\2\2\2\u00ce\u00d4\5C\37\2\u00cf\u00d1\5\35\f"+
		"\2\u00d0\u00d2\5S\'\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d5\5S\'\2\u00d4\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\22\3\2\2\2\u00d6\u00d7\5\21\6\2\u00d7\u00d8\5+\23\2\u00d8\u00d9\3\2\2"+
		"\2\u00d9\u00da\b\7\4\2\u00da\24\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd"+
		"\5S\'\2\u00dd\26\3\2\2\2\u00de\u00df\7\60\2\2\u00df\u00e0\5S\'\2\u00e0"+
		"\u00e1\5+\23\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\t\4\2\u00e3\30\3\2\2"+
		"\2\u00e4\u00e5\7/\2\2\u00e5\u00e6\7@\2\2\u00e6\32\3\2\2\2\u00e7\u00e8"+
		"\7#\2\2\u00e8\34\3\2\2\2\u00e9\u00ea\7B\2\2\u00ea\36\3\2\2\2\u00eb\u00ec"+
		"\7<\2\2\u00ec\u00ed\7<\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5S\'\2\u00ef"+
		" \3\2\2\2\u00f0\u00f1\7<\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3"+
		"$\3\2\2\2\u00f4\u00f5\7.\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7"+
		"\u00f8\7\60\2\2\u00f8\u00f9\7\60\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7\u0080"+
		"\2\2\u00fb*\3\2\2\2\u00fc\u00fd\7*\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff"+
		"\b\23\4\2\u00ff,\3\2\2\2\u0100\u0101\7+\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b\24\5\2\u0103.\3\2\2\2\u0104\u0105\7]\2\2\u0105\60\3\2\2\2\u0106"+
		"\u0107\7_\2\2\u0107\62\3\2\2\2\u0108\u0109\7}\2\2\u0109\64\3\2\2\2\u010a"+
		"\u010b\7\177\2\2\u010b\66\3\2\2\2\u010c\u010d\5S\'\2\u010d\u010e\5!\16"+
		"\2\u010e8\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b"+
		"\32\6\2\u0112:\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7o\2\2\u0116\u0117\7r\2\2\u0117\u0118\7n\2\2\u0118\u0119\7c\2\2\u0119"+
		"\u011a\7v\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2\2\u011c<\3\2\2\2\u011d"+
		"\u011e\7e\2\2\u011e\u011f\7q\2\2\u011f\u0120\7o\2\2\u0120\u0121\7r\2\2"+
		"\u0121\u0122\7q\2\2\u0122\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124\u0125"+
		"\7t\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b\34\7\2\u0127>\3\2\2\2\u0128"+
		"\u0129\7g\2\2\u0129\u012a\7p\2\2\u012a\u012b\7f\2\2\u012b@\3\2\2\2\u012c"+
		"\u012d\7%\2\2\u012dB\3\2\2\2\u012e\u012f\7&\2\2\u012fD\3\2\2\2\u0130\u0131"+
		"\7\60\2\2\u0131\u0132\7\60\2\2\u0132F\3\2\2\2\u0133\u0134\t\3\2\2\u0134"+
		"H\3\2\2\2\u0135\u013a\t\4\2\2\u0136\u0137\7o\2\2\u0137\u0138\7q\2\2\u0138"+
		"\u013a\7f\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u013aJ\3\2\2\2\u013b"+
		"\u013c\7\62\2\2\u013cL\3\2\2\2\u013d\u013f\7/\2\2\u013e\u013d\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\t\5\2\2\u0141\u0143"+
		"\5O%\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143N\3\2\2\2\u0144\u0146"+
		"\t\6\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148P\3\2\2\2\u0149\u014a\7)\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\b&\b\2\u014cR\3\2\2\2\u014d\u0151\5U(\2\u014e\u0150\5W)\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152T\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\t\7\2\2\u0155V\3\2"+
		"\2\2\u0156\u0159\5U(\2\u0157\u0159\t\b\2\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159X\3\2\2\2\u015a\u015c\t\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b*\2\2\u0160Z\3\2\2\2\u0161\u0162\7&\2\2\u0162\u0163"+
		"\7*\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b+\4\2\u0165\\\3\2\2\2\u0166\u0167"+
		"\7&\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b,\t\2\u0169^\3\2\2\2\u016a\u016c"+
		"\5a.\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e`\3\2\2\2\u016f\u0170\7)\2\2\u0170\u0175\7)\2\2\u0171"+
		"\u0172\7&\2\2\u0172\u0175\7&\2\2\u0173\u0175\n\t\2\2\u0174\u016f\3\2\2"+
		"\2\u0174\u0171\3\2\2\2\u0174\u0173\3\2\2\2\u0175b\3\2\2\2\u0176\u0177"+
		"\7)\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b/\5\2\u0179d\3\2\2\2\u017a\u017b"+
		"\7=\2\2\u017b\u017c\3\2\2\2\u017c\u017d\b\60\5\2\u017df\3\2\2\2\u017e"+
		"\u017f\7*\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\61\4\2\u0181h\3\2\2\2"+
		"\u0182\u0183\5S\'\2\u0183j\3\2\2\2\u0184\u0185\5\25\b\2\u0185l\3\2\2\2"+
		"\u0186\u0187\7~\2\2\u0187n\3\2\2\2\u0188\u0189\7.\2\2\u0189p\3\2\2\2\u018a"+
		"\u018b\7>\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b\66\6\2\u018dr\3\2\2\2"+
		"\u018e\u018f\7@\2\2\u018f\u0190\3\2\2\2\u0190\u0191\b\67\5\2\u0191t\3"+
		"\2\2\2\u0192\u0193\7\u0080\2\2\u0193v\3\2\2\2\u0194\u0195\7A\2\2\u0195"+
		"\u0196\7*\2\2\u0196\u0197\3\2\2\2\u0197\u0198\b9\4\2\u0198x\3\2\2\2\u0199"+
		"\u019c\5K#\2\u019a\u019c\5M$\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2"+
		"\u019cz\3\2\2\2\u019d\u019e\5E \2\u019e|\3\2\2\2\u019f\u01a0\7)\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\b<\b\2\u01a2~\3\2\2\2\u01a3\u01a4\5\63\27\2"+
		"\u01a4\u0080\3\2\2\2\u01a5\u01a6\5\65\30\2\u01a6\u0082\3\2\2\2\u01a7\u01a8"+
		"\5/\25\2\u01a8\u0084\3\2\2\2\u01a9\u01aa\5\61\26\2\u01aa\u0086\3\2\2\2"+
		"\u01ab\u01ac\5\67\31\2\u01ac\u0088\3\2\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af"+
		"\7<\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5S\'\2\u01b1\u008a\3\2\2\2\u01b2"+
		"\u01b8\5C\37\2\u01b3\u01b5\5\35\f\2\u01b4\u01b6\5S\'\2\u01b5\u01b4\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b9\5S\'\2\u01b8"+
		"\u01b3\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u008c\3\2\2\2\u01ba\u01bb\7*"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\bD\4\2\u01bd\u008e\3\2\2\2\u01be"+
		"\u01bf\5\25\b\2\u01bf\u0090\3\2\2\2\u01c0\u01c1\5Y*\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c3\bF\2\2\u01c3\u0092\3\2\2\2\u01c4\u01c6\n\n\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\t\13\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\bG\2\2\u01ce\u01cf\bG\5"+
		"\2\u01cf\u0094\3\2\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7p\2\2\u01d2\u01d3"+
		"\7f\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bH\5\2\u01d5\u0096\3\2\2\2\u01d6"+
		"\u01d7\7>\2\2\u01d7\u0098\3\2\2\2\u01d8\u01d9\7@\2\2\u01d9\u009a\3\2\2"+
		"\2\u01da\u01db\7\u0080\2\2\u01db\u009c\3\2\2\2\u01dc\u01dd\5\67\31\2\u01dd"+
		"\u009e\3\2\2\2\u01de\u01df\t\f\2\2\u01df\u00a0\3\2\2\2\u01e0\u01e1\7)"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\bN\n\2\u01e3\u00a2\3\2\2\2\u01e4"+
		"\u01e5\7*\2\2\u01e5\u00a4\3\2\2\2\u01e6\u01e7\7+\2\2\u01e7\u00a6\3\2\2"+
		"\2\u01e8\u01e9\7]\2\2\u01e9\u00a8\3\2\2\2\u01ea\u01eb\7_\2\2\u01eb\u00aa"+
		"\3\2\2\2\u01ec\u01ed\5S\'\2\u01ed\u00ac\3\2\2\2\u01ee\u01ef\5Y*\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\bT\2\2\u01f1\u00ae\3\2\2\2\u01f2\u01f4\5\u00b1"+
		"V\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u00b0\3\2\2\2\u01f7\u01f8\7)\2\2\u01f8\u01fb\7)\2"+
		"\2\u01f9\u01fb\n\r\2\2\u01fa\u01f7\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u00b2"+
		"\3\2\2\2\u01fc\u01fd\7)\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\bW\5\2\u01ff"+
		"\u00b4\3\2\2\2\33\2\3\4\5\6\7\b\u00d1\u00d4\u0139\u013e\u0142\u0147\u0151"+
		"\u0158\u015d\u016d\u0174\u019b\u01b5\u01b8\u01c7\u01cb\u01f5\u01fa\13"+
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