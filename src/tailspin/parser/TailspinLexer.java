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
		InterpolateIdentifier=47, InterpolateField=48, InterpolateMessage=49, 
		Else=50, MatchComma=51, StartSubMatcher=52, EndMatcher=53, InvertMatch=54, 
		BeginSuchThat=55, MatchInteger=56, MatchAdditiveOperator=57, RangeMatch=58, 
		START_REGEXP=59, StartStructureMatch=60, EndStructureMatch=61, StartArrayMatch=62, 
		EndArrayMatch=63, StructureKey=64, MatchMessage=65, MatchDereference=66, 
		MatchLeftParen=67, MatchFieldDereference=68, MatcherIgnoreWS=69, Comment=70, 
		ComposerEndDefinition=71, StartComposerMatch=72, EndComposerMatch=73, 
		InvertComposerMatch=74, SequenceKey=75, ValueSeparator=76, Multiplier=77, 
		START_REGEX=78, StartSkipRule=79, EndSkipRule=80, StartBuildArray=81, 
		EndBuildArray=82, StartBuildStructure=83, EndBuildStructure=84, KeySeparator=85, 
		ComposerId=86, ComposerIgnoreWS=87, REGEX_TEXT=88, END_REGEX=89;
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
			"InterpolateField", "InterpolateMessage", "Else", "MatchComma", "StartSubMatcher", 
			"EndMatcher", "InvertMatch", "BeginSuchThat", "MatchInteger", "MatchAdditiveOperator", 
			"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
			"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchMessage", "MatchDereference", 
			"MatchLeftParen", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
			"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", 
			"SequenceKey", "ValueSeparator", "Multiplier", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "StartBuildStructure", 
			"EndBuildStructure", "KeySeparator", "ComposerId", "ComposerIgnoreWS", 
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, null, null, null, 
			null, "'->'", "'!'", "'@'", null, null, null, null, "'...'", null, null, 
			null, null, null, null, null, null, null, "'templates'", "'composer'", 
			"'processor'", null, "'#'", null, "'..'", null, null, "'0'", null, null, 
			null, null, "'$('", null, null, null, null, null, null, null, null, "'|'", 
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
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "InterpolateMessage", 
			"Else", "MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", 
			"BeginSuchThat", "MatchInteger", "MatchAdditiveOperator", "RangeMatch", 
			"START_REGEXP", "StartStructureMatch", "EndStructureMatch", "StartArrayMatch", 
			"EndArrayMatch", "StructureKey", "MatchMessage", "MatchDereference", 
			"MatchLeftParen", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
			"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", 
			"SequenceKey", "ValueSeparator", "Multiplier", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "StartBuildStructure", 
			"EndBuildStructure", "KeySeparator", "ComposerId", "ComposerIgnoreWS", 
			"REGEX_TEXT", "END_REGEX"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u022b\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"+
		"\\\4]\t]\4^\t^\4_\t_\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\5\7\u00e7\n\7\3\7\5\7\u00ea\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u0159\n$"+
		"\3%\3%\3&\3&\5&\u015f\n&\3\'\6\'\u0162\n\'\r\'\16\'\u0163\3(\3(\3(\3("+
		"\3)\3)\7)\u016c\n)\f)\16)\u016f\13)\3*\3*\3+\3+\5+\u0175\n+\3,\6,\u0178"+
		"\n,\r,\16,\u0179\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\6/\u0188\n/\r/\16"+
		"/\u0189\3\60\3\60\3\60\3\60\3\60\5\60\u0191\n\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3<\3"+
		"<\3<\3=\3=\5=\u01bd\n=\3>\3>\3?\3?\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3"+
		"D\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\5G\u01d9\nG\3G\5G\u01dc\nG\3H\3H\3H\3"+
		"H\3I\3I\3J\3J\3J\3J\3K\7K\u01e9\nK\fK\16K\u01ec\13K\3K\5K\u01ef\nK\3K"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S"+
		"\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3"+
		"]\6]\u021f\n]\r]\16]\u0220\3^\3^\3^\5^\u0226\n^\3_\3_\3_\3_\2\2`\t\3\13"+
		"\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22"+
		")\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#"+
		"K$M%O&Q\'S\2U(W)Y\2[\2]*_+a,c-e\2g.i/k\60m\61o\62q\63s\64u\65w\66y\67"+
		"{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091"+
		"C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5"+
		"M\u00a7N\u00a9O\u00abP\u00adQ\u00afR\u00b1S\u00b3T\u00b5U\u00b7V\u00b9"+
		"W\u00bbX\u00bdY\u00bfZ\u00c1\2\u00c3[\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17"+
		"\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3"+
		"\2\f\f\3\3\f\f\4\2,-AA\3\2))\2\u0230\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\3g\3\2\2\2\4i\3"+
		"\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\4q\3\2\2\2\5s\3\2\2\2\5u\3\2\2"+
		"\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3"+
		"\2\2\2\5\u0083\3\2\2\2\5\u0085\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2"+
		"\5\u008b\3\2\2\2\5\u008d\3\2\2\2\5\u008f\3\2\2\2\5\u0091\3\2\2\2\5\u0093"+
		"\3\2\2\2\5\u0095\3\2\2\2\5\u0097\3\2\2\2\5\u0099\3\2\2\2\6\u009b\3\2\2"+
		"\2\7\u009d\3\2\2\2\7\u009f\3\2\2\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5"+
		"\3\2\2\2\7\u00a7\3\2\2\2\7\u00a9\3\2\2\2\7\u00ab\3\2\2\2\7\u00ad\3\2\2"+
		"\2\7\u00af\3\2\2\2\7\u00b1\3\2\2\2\7\u00b3\3\2\2\2\7\u00b5\3\2\2\2\7\u00b7"+
		"\3\2\2\2\7\u00b9\3\2\2\2\7\u00bb\3\2\2\2\7\u00bd\3\2\2\2\b\u00bf\3\2\2"+
		"\2\b\u00c3\3\2\2\2\t\u00c5\3\2\2\2\13\u00cb\3\2\2\2\r\u00d2\3\2\2\2\17"+
		"\u00d8\3\2\2\2\21\u00dd\3\2\2\2\23\u00e3\3\2\2\2\25\u00eb\3\2\2\2\27\u00f0"+
		"\3\2\2\2\31\u00f3\3\2\2\2\33\u00f9\3\2\2\2\35\u00fc\3\2\2\2\37\u00fe\3"+
		"\2\2\2!\u0100\3\2\2\2#\u0105\3\2\2\2%\u0107\3\2\2\2\'\u0109\3\2\2\2)\u010b"+
		"\3\2\2\2+\u010f\3\2\2\2-\u0111\3\2\2\2/\u0115\3\2\2\2\61\u0119\3\2\2\2"+
		"\63\u011b\3\2\2\2\65\u011d\3\2\2\2\67\u011f\3\2\2\29\u0121\3\2\2\2;\u0124"+
		"\3\2\2\2=\u0128\3\2\2\2?\u0132\3\2\2\2A\u013d\3\2\2\2C\u0147\3\2\2\2E"+
		"\u014b\3\2\2\2G\u014d\3\2\2\2I\u014f\3\2\2\2K\u0152\3\2\2\2M\u0158\3\2"+
		"\2\2O\u015a\3\2\2\2Q\u015c\3\2\2\2S\u0161\3\2\2\2U\u0165\3\2\2\2W\u0169"+
		"\3\2\2\2Y\u0170\3\2\2\2[\u0174\3\2\2\2]\u0177\3\2\2\2_\u017d\3\2\2\2a"+
		"\u0182\3\2\2\2c\u0187\3\2\2\2e\u0190\3\2\2\2g\u0192\3\2\2\2i\u0196\3\2"+
		"\2\2k\u019a\3\2\2\2m\u019e\3\2\2\2o\u01a0\3\2\2\2q\u01a2\3\2\2\2s\u01a7"+
		"\3\2\2\2u\u01a9\3\2\2\2w\u01ab\3\2\2\2y\u01af\3\2\2\2{\u01b3\3\2\2\2}"+
		"\u01b5\3\2\2\2\177\u01bc\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c0\3\2\2"+
		"\2\u0085\u01c2\3\2\2\2\u0087\u01c6\3\2\2\2\u0089\u01c8\3\2\2\2\u008b\u01ca"+
		"\3\2\2\2\u008d\u01cc\3\2\2\2\u008f\u01ce\3\2\2\2\u0091\u01d0\3\2\2\2\u0093"+
		"\u01d5\3\2\2\2\u0095\u01dd\3\2\2\2\u0097\u01e1\3\2\2\2\u0099\u01e3\3\2"+
		"\2\2\u009b\u01ea\3\2\2\2\u009d\u01f3\3\2\2\2\u009f\u01f9\3\2\2\2\u00a1"+
		"\u01fb\3\2\2\2\u00a3\u01fd\3\2\2\2\u00a5\u01ff\3\2\2\2\u00a7\u0201\3\2"+
		"\2\2\u00a9\u0203\3\2\2\2\u00ab\u0205\3\2\2\2\u00ad\u0209\3\2\2\2\u00af"+
		"\u020b\3\2\2\2\u00b1\u020d\3\2\2\2\u00b3\u020f\3\2\2\2\u00b5\u0211\3\2"+
		"\2\2\u00b7\u0213\3\2\2\2\u00b9\u0215\3\2\2\2\u00bb\u0217\3\2\2\2\u00bd"+
		"\u0219\3\2\2\2\u00bf\u021e\3\2\2\2\u00c1\u0225\3\2\2\2\u00c3\u0227\3\2"+
		"\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\b\2\2\2\u00c9\u00ca\b\2\3\2\u00ca\n\3\2\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc\u00cd\7v\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0"+
		"\7w\2\2\u00d0\u00d1\7v\2\2\u00d1\f\3\2\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\16\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7h\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2\22\3\2\2\2"+
		"\u00e3\u00e9\5G!\2\u00e4\u00e6\5\37\r\2\u00e5\u00e7\5W)\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\5W)\2\u00e9"+
		"\u00e4\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\24\3\2\2\2\u00eb\u00ec\5\23\7"+
		"\2\u00ec\u00ed\5-\24\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\b\4\2\u00ef\26"+
		"\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\5W)\2\u00f2\30\3\2\2\2\u00f3"+
		"\u00f4\7\60\2\2\u00f4\u00f5\5W)\2\u00f5\u00f6\5-\24\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\b\n\4\2\u00f8\32\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\7@\2\2\u00fb\34\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\36\3\2\2\2\u00fe\u00ff"+
		"\7B\2\2\u00ff \3\2\2\2\u0100\u0101\7<\2\2\u0101\u0102\7<\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\5W)\2\u0104\"\3\2\2\2\u0105\u0106\7<\2\2\u0106$\3"+
		"\2\2\2\u0107\u0108\7=\2\2\u0108&\3\2\2\2\u0109\u010a\7.\2\2\u010a(\3\2"+
		"\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7\60\2\2\u010e"+
		"*\3\2\2\2\u010f\u0110\7\u0080\2\2\u0110,\3\2\2\2\u0111\u0112\7*\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b\24\4\2\u0114.\3\2\2\2\u0115\u0116\7+\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0118\b\25\5\2\u0118\60\3\2\2\2\u0119\u011a"+
		"\7]\2\2\u011a\62\3\2\2\2\u011b\u011c\7_\2\2\u011c\64\3\2\2\2\u011d\u011e"+
		"\7}\2\2\u011e\66\3\2\2\2\u011f\u0120\7\177\2\2\u01208\3\2\2\2\u0121\u0122"+
		"\5W)\2\u0122\u0123\5#\17\2\u0123:\3\2\2\2\u0124\u0125\7>\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\b\33\6\2\u0127<\3\2\2\2\u0128\u0129\7v\2\2\u0129"+
		"\u012a\7g\2\2\u012a\u012b\7o\2\2\u012b\u012c\7r\2\2\u012c\u012d\7n\2\2"+
		"\u012d\u012e\7c\2\2\u012e\u012f\7v\2\2\u012f\u0130\7g\2\2\u0130\u0131"+
		"\7u\2\2\u0131>\3\2\2\2\u0132\u0133\7e\2\2\u0133\u0134\7q\2\2\u0134\u0135"+
		"\7o\2\2\u0135\u0136\7r\2\2\u0136\u0137\7q\2\2\u0137\u0138\7u\2\2\u0138"+
		"\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a\u013b\3\2\2\2\u013b\u013c\b\35"+
		"\7\2\u013c@\3\2\2\2\u013d\u013e\7r\2\2\u013e\u013f\7t\2\2\u013f\u0140"+
		"\7q\2\2\u0140\u0141\7e\2\2\u0141\u0142\7g\2\2\u0142\u0143\7u\2\2\u0143"+
		"\u0144\7u\2\2\u0144\u0145\7q\2\2\u0145\u0146\7t\2\2\u0146B\3\2\2\2\u0147"+
		"\u0148\7g\2\2\u0148\u0149\7p\2\2\u0149\u014a\7f\2\2\u014aD\3\2\2\2\u014b"+
		"\u014c\7%\2\2\u014cF\3\2\2\2\u014d\u014e\7&\2\2\u014eH\3\2\2\2\u014f\u0150"+
		"\7\60\2\2\u0150\u0151\7\60\2\2\u0151J\3\2\2\2\u0152\u0153\t\3\2\2\u0153"+
		"L\3\2\2\2\u0154\u0159\t\4\2\2\u0155\u0156\7o\2\2\u0156\u0157\7q\2\2\u0157"+
		"\u0159\7f\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159N\3\2\2\2\u015a"+
		"\u015b\7\62\2\2\u015bP\3\2\2\2\u015c\u015e\t\5\2\2\u015d\u015f\5S\'\2"+
		"\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015fR\3\2\2\2\u0160\u0162\t"+
		"\6\2\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164T\3\2\2\2\u0165\u0166\7)\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b(\b\2\u0168V\3\2\2\2\u0169\u016d\5Y*\2\u016a\u016c\5[+\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016eX\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\t\7\2\2\u0171Z\3\2"+
		"\2\2\u0172\u0175\5Y*\2\u0173\u0175\t\b\2\2\u0174\u0172\3\2\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\\\3\2\2\2\u0176\u0178\t\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017c\b,\2\2\u017c^\3\2\2\2\u017d\u017e\7&\2\2\u017e\u017f"+
		"\7*\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b-\4\2\u0181`\3\2\2\2\u0182\u0183"+
		"\7&\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b.\t\2\u0185b\3\2\2\2\u0186\u0188"+
		"\5e\60\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018ad\3\2\2\2\u018b\u018c\7)\2\2\u018c\u0191\7)\2\2\u018d"+
		"\u018e\7&\2\2\u018e\u0191\7&\2\2\u018f\u0191\n\t\2\2\u0190\u018b\3\2\2"+
		"\2\u0190\u018d\3\2\2\2\u0190\u018f\3\2\2\2\u0191f\3\2\2\2\u0192\u0193"+
		"\7)\2\2\u0193\u0194\3\2\2\2\u0194\u0195\b\61\5\2\u0195h\3\2\2\2\u0196"+
		"\u0197\7=\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b\62\5\2\u0199j\3\2\2\2"+
		"\u019a\u019b\7*\2\2\u019b\u019c\3\2\2\2\u019c\u019d\b\63\4\2\u019dl\3"+
		"\2\2\2\u019e\u019f\5W)\2\u019fn\3\2\2\2\u01a0\u01a1\5\27\t\2\u01a1p\3"+
		"\2\2\2\u01a2\u01a3\7<\2\2\u01a3\u01a4\7<\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\5W)\2\u01a6r\3\2\2\2\u01a7\u01a8\7~\2\2\u01a8t\3\2\2\2\u01a9\u01aa"+
		"\7.\2\2\u01aav\3\2\2\2\u01ab\u01ac\7>\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae"+
		"\b9\6\2\u01aex\3\2\2\2\u01af\u01b0\7@\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\b:\5\2\u01b2z\3\2\2\2\u01b3\u01b4\7\u0080\2\2\u01b4|\3\2\2\2\u01b5\u01b6"+
		"\7A\2\2\u01b6\u01b7\7*\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b<\4\2\u01b9"+
		"~\3\2\2\2\u01ba\u01bd\5O%\2\u01bb\u01bd\5Q&\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u0080\3\2\2\2\u01be\u01bf\t\3\2\2\u01bf\u0082\3\2"+
		"\2\2\u01c0\u01c1\5I\"\2\u01c1\u0084\3\2\2\2\u01c2\u01c3\7)\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\b@\b\2\u01c5\u0086\3\2\2\2\u01c6\u01c7\5\65\30\2"+
		"\u01c7\u0088\3\2\2\2\u01c8\u01c9\5\67\31\2\u01c9\u008a\3\2\2\2\u01ca\u01cb"+
		"\5\61\26\2\u01cb\u008c\3\2\2\2\u01cc\u01cd\5\63\27\2\u01cd\u008e\3\2\2"+
		"\2\u01ce\u01cf\59\32\2\u01cf\u0090\3\2\2\2\u01d0\u01d1\7<\2\2\u01d1\u01d2"+
		"\7<\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5W)\2\u01d4\u0092\3\2\2\2\u01d5"+
		"\u01db\5G!\2\u01d6\u01d8\5\37\r\2\u01d7\u01d9\5W)\2\u01d8\u01d7\3\2\2"+
		"\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01dc\5W)\2\u01db\u01d6"+
		"\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\u0094\3\2\2\2\u01dd\u01de\7*\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\bH\4\2\u01e0\u0096\3\2\2\2\u01e1\u01e2\5\27"+
		"\t\2\u01e2\u0098\3\2\2\2\u01e3\u01e4\5],\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\bJ\2\2\u01e6\u009a\3\2\2\2\u01e7\u01e9\n\n\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\t\13\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\bK\2\2\u01f1\u01f2\bK\5\2\u01f2\u009c\3\2\2"+
		"\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7p\2\2\u01f5\u01f6\7f\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f8\bL\5\2\u01f8\u009e\3\2\2\2\u01f9\u01fa\7>\2\2\u01fa"+
		"\u00a0\3\2\2\2\u01fb\u01fc\7@\2\2\u01fc\u00a2\3\2\2\2\u01fd\u01fe\7\u0080"+
		"\2\2\u01fe\u00a4\3\2\2\2\u01ff\u0200\59\32\2\u0200\u00a6\3\2\2\2\u0201"+
		"\u0202\5\'\21\2\u0202\u00a8\3\2\2\2\u0203\u0204\t\f\2\2\u0204\u00aa\3"+
		"\2\2\2\u0205\u0206\7)\2\2\u0206\u0207\3\2\2\2\u0207\u0208\bS\n\2\u0208"+
		"\u00ac\3\2\2\2\u0209\u020a\7*\2\2\u020a\u00ae\3\2\2\2\u020b\u020c\7+\2"+
		"\2\u020c\u00b0\3\2\2\2\u020d\u020e\7]\2\2\u020e\u00b2\3\2\2\2\u020f\u0210"+
		"\7_\2\2\u0210\u00b4\3\2\2\2\u0211\u0212\7}\2\2\u0212\u00b6\3\2\2\2\u0213"+
		"\u0214\7\177\2\2\u0214\u00b8\3\2\2\2\u0215\u0216\7<\2\2\u0216\u00ba\3"+
		"\2\2\2\u0217\u0218\5W)\2\u0218\u00bc\3\2\2\2\u0219\u021a\5],\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021c\b\\\2\2\u021c\u00be\3\2\2\2\u021d\u021f\5\u00c1^"+
		"\2\u021e\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u00c0\3\2\2\2\u0222\u0223\7)\2\2\u0223\u0226\7)\2\2\u0224"+
		"\u0226\n\r\2\2\u0225\u0222\3\2\2\2\u0225\u0224\3\2\2\2\u0226\u00c2\3\2"+
		"\2\2\u0227\u0228\7)\2\2\u0228\u0229\3\2\2\2\u0229\u022a\b_\5\2\u022a\u00c4"+
		"\3\2\2\2\32\2\3\4\5\6\7\b\u00e6\u00e9\u0158\u015e\u0163\u016d\u0174\u0179"+
		"\u0189\u0190\u01bc\u01d8\u01db\u01ea\u01ee\u0220\u0225\13\b\2\2\7\6\2"+
		"\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}