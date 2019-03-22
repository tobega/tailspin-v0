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
		SemiColon=12, Comma=13, Deconstructor=14, Invert=15, LeftParen=16, RightParen=17, 
		LeftBracket=18, RightBracket=19, LeftBrace=20, RightBrace=21, Key=22, 
		StartMatcher=23, StartTemplatesDefinition=24, StartComposerDefinition=25, 
		EndDefinition=26, TemplateMatch=27, StartDereference=28, Range=29, AdditiveOperator=30, 
		MultiplicativeOperator=31, Zero=32, NonZeroInteger=33, START_STRING=34, 
		IDENTIFIER=35, WS=36, StartStringEvaluate=37, StartStringInterpolate=38, 
		STRING_TEXT=39, END_STRING=40, EndInterpolate=41, InterpolateArray=42, 
		InterpolateIdentifier=43, InterpolateField=44, Else=45, MatchComma=46, 
		StartSubMatcher=47, EndMatcher=48, InvertMatch=49, BeginSuchThat=50, MatchInteger=51, 
		RangeMatch=52, START_REGEXP=53, StartStructureMatch=54, EndStructureMatch=55, 
		StartArrayMatch=56, EndArrayMatch=57, StructureKey=58, MatchDereference=59, 
		MatchArrayDereference=60, MatchFieldDereference=61, MatcherIgnoreWS=62, 
		Comment=63, ComposerEndDefinition=64, StartComposerMatch=65, EndComposerMatch=66, 
		InvertComposerMatch=67, SequenceKey=68, Multiplier=69, START_REGEX=70, 
		StartSkipRule=71, EndSkipRule=72, StartBuildArray=73, EndBuildArray=74, 
		ComposerId=75, ComposerIgnoreWS=76, REGEX_TEXT=77, END_REGEX=78;
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
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", 
			"InterpolateIdentifier", "InterpolateField", "Else", "MatchComma", "StartSubMatcher", 
			"EndMatcher", "InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", 
			"START_REGEXP", "StartStructureMatch", "EndStructureMatch", "StartArrayMatch", 
			"EndArrayMatch", "StructureKey", "MatchDereference", "MatchArrayDereference", 
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
			"'!'", "':'", null, null, "'...'", null, null, null, null, null, "'{'", 
			"'}'", null, null, "'templates'", "'composer'", null, "'#'", null, "'..'", 
			null, null, "'0'", null, null, null, null, "'$('", null, null, null, 
			null, null, null, null, "'|'", null, null, null, null, "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
			"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "Else", 
			"MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
			"MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StartArrayMatch", "EndArrayMatch", "StructureKey", 
			"MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u01ee\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00cc"+
		"\n\6\3\6\5\6\u00cf\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u012d\n \3!\3!\3\"\5\"\u0132\n\"\3"+
		"\"\3\"\5\"\u0136\n\"\3#\6#\u0139\n#\r#\16#\u013a\3$\3$\3$\3$\3%\3%\7%"+
		"\u0143\n%\f%\16%\u0146\13%\3&\3&\3\'\3\'\5\'\u014c\n\'\3(\6(\u014f\n("+
		"\r(\16(\u0150\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\6+\u015f\n+\r+\16+\u0160"+
		"\3,\3,\3,\3,\3,\5,\u0168\n,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\58\u018f\n8\39\39\3:\3:\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u01a4\n@\3@\5@\u01a7\n"+
		"@\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3D\7D\u01b4\nD\fD\16D\u01b7\13D\3D\5D"+
		"\u01ba\nD\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K"+
		"\3K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\6R\u01e2\nR\rR"+
		"\16R\u01e3\3S\3S\3S\5S\u01e9\nS\3T\3T\3T\3T\2\2U\t\3\13\4\r\5\17\6\21"+
		"\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/"+
		"\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K\2M$O%Q\2S\2"+
		"U&W\'Y([)]\2_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081"+
		";\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093D\u0095"+
		"E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7N\u00a9"+
		"O\u00ab\2\u00adP\t\2\3\4\5\6\7\b\16\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61"+
		"\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\4\2,-A"+
		"A\3\2))\2\u01f4\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3_\3\2\2\2\4"+
		"a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3"+
		"\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2"+
		"\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2"+
		"\5\u0085\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008b\3\2\2\2\6\u008d"+
		"\3\2\2\2\7\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2"+
		"\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f"+
		"\3\2\2\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\7\u00a7\3\2\2"+
		"\2\b\u00a9\3\2\2\2\b\u00ad\3\2\2\2\t\u00af\3\2\2\2\13\u00b5\3\2\2\2\r"+
		"\u00bc\3\2\2\2\17\u00c2\3\2\2\2\21\u00c8\3\2\2\2\23\u00d0\3\2\2\2\25\u00d5"+
		"\3\2\2\2\27\u00d8\3\2\2\2\31\u00de\3\2\2\2\33\u00e1\3\2\2\2\35\u00e3\3"+
		"\2\2\2\37\u00e5\3\2\2\2!\u00e7\3\2\2\2#\u00e9\3\2\2\2%\u00ed\3\2\2\2\'"+
		"\u00ef\3\2\2\2)\u00f3\3\2\2\2+\u00f7\3\2\2\2-\u00f9\3\2\2\2/\u00fb\3\2"+
		"\2\2\61\u00fd\3\2\2\2\63\u00ff\3\2\2\2\65\u0102\3\2\2\2\67\u0106\3\2\2"+
		"\29\u0110\3\2\2\2;\u011b\3\2\2\2=\u011f\3\2\2\2?\u0121\3\2\2\2A\u0123"+
		"\3\2\2\2C\u0126\3\2\2\2E\u012c\3\2\2\2G\u012e\3\2\2\2I\u0131\3\2\2\2K"+
		"\u0138\3\2\2\2M\u013c\3\2\2\2O\u0140\3\2\2\2Q\u0147\3\2\2\2S\u014b\3\2"+
		"\2\2U\u014e\3\2\2\2W\u0154\3\2\2\2Y\u0159\3\2\2\2[\u015e\3\2\2\2]\u0167"+
		"\3\2\2\2_\u0169\3\2\2\2a\u016d\3\2\2\2c\u0171\3\2\2\2e\u0175\3\2\2\2g"+
		"\u0177\3\2\2\2i\u0179\3\2\2\2k\u017b\3\2\2\2m\u017d\3\2\2\2o\u0181\3\2"+
		"\2\2q\u0185\3\2\2\2s\u0187\3\2\2\2u\u018e\3\2\2\2w\u0190\3\2\2\2y\u0192"+
		"\3\2\2\2{\u0196\3\2\2\2}\u0198\3\2\2\2\177\u019a\3\2\2\2\u0081\u019c\3"+
		"\2\2\2\u0083\u019e\3\2\2\2\u0085\u01a0\3\2\2\2\u0087\u01a8\3\2\2\2\u0089"+
		"\u01ac\3\2\2\2\u008b\u01ae\3\2\2\2\u008d\u01b5\3\2\2\2\u008f\u01be\3\2"+
		"\2\2\u0091\u01c4\3\2\2\2\u0093\u01c6\3\2\2\2\u0095\u01c8\3\2\2\2\u0097"+
		"\u01ca\3\2\2\2\u0099\u01cc\3\2\2\2\u009b\u01ce\3\2\2\2\u009d\u01d2\3\2"+
		"\2\2\u009f\u01d4\3\2\2\2\u00a1\u01d6\3\2\2\2\u00a3\u01d8\3\2\2\2\u00a5"+
		"\u01da\3\2\2\2\u00a7\u01dc\3\2\2\2\u00a9\u01e1\3\2\2\2\u00ab\u01e8\3\2"+
		"\2\2\u00ad\u01ea\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7\61\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\2\2\2\u00b3\u00b4\b\2\3\2\u00b4\n\3\2\2\2"+
		"\u00b5\u00b6\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7v\2\2\u00bb\f\3\2\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7\20\3\2\2\2"+
		"\u00c8\u00ce\5?\35\2\u00c9\u00cb\5\35\f\2\u00ca\u00cc\5O%\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5O%\2\u00ce"+
		"\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\5\21\6"+
		"\2\u00d1\u00d2\5\'\21\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\7\4\2\u00d4"+
		"\24\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\5O%\2\u00d7\26\3\2\2\2\u00d8"+
		"\u00d9\7\60\2\2\u00d9\u00da\5O%\2\u00da\u00db\5\'\21\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\t\4\2\u00dd\30\3\2\2\2\u00de\u00df\7/\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\34\3\2\2\2\u00e3\u00e4"+
		"\7<\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7=\2\2\u00e6 \3\2\2\2\u00e7\u00e8"+
		"\7.\2\2\u00e8\"\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7\60\2\2\u00eb"+
		"\u00ec\7\60\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7\u0080\2\2\u00ee&\3\2\2\2"+
		"\u00ef\u00f0\7*\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\21\4\2\u00f2(\3"+
		"\2\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\22\5\2\u00f6"+
		"*\3\2\2\2\u00f7\u00f8\7]\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7_\2\2\u00fa."+
		"\3\2\2\2\u00fb\u00fc\7}\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7\177\2\2\u00fe"+
		"\62\3\2\2\2\u00ff\u0100\5O%\2\u0100\u0101\5\35\f\2\u0101\64\3\2\2\2\u0102"+
		"\u0103\7>\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\30\6\2\u0105\66\3\2\2"+
		"\2\u0106\u0107\7v\2\2\u0107\u0108\7g\2\2\u0108\u0109\7o\2\2\u0109\u010a"+
		"\7r\2\2\u010a\u010b\7n\2\2\u010b\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7u\2\2\u010f8\3\2\2\2\u0110\u0111\7e\2\2\u0111"+
		"\u0112\7q\2\2\u0112\u0113\7o\2\2\u0113\u0114\7r\2\2\u0114\u0115\7q\2\2"+
		"\u0115\u0116\7u\2\2\u0116\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\b\32\7\2\u011a:\3\2\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7p\2\2\u011d\u011e\7f\2\2\u011e<\3\2\2\2\u011f\u0120\7%\2\2\u0120"+
		">\3\2\2\2\u0121\u0122\7&\2\2\u0122@\3\2\2\2\u0123\u0124\7\60\2\2\u0124"+
		"\u0125\7\60\2\2\u0125B\3\2\2\2\u0126\u0127\t\3\2\2\u0127D\3\2\2\2\u0128"+
		"\u012d\t\4\2\2\u0129\u012a\7o\2\2\u012a\u012b\7q\2\2\u012b\u012d\7f\2"+
		"\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012dF\3\2\2\2\u012e\u012f"+
		"\7\62\2\2\u012fH\3\2\2\2\u0130\u0132\7/\2\2\u0131\u0130\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\t\5\2\2\u0134\u0136\5K"+
		"#\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136J\3\2\2\2\u0137\u0139"+
		"\t\6\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013bL\3\2\2\2\u013c\u013d\7)\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\b$\b\2\u013fN\3\2\2\2\u0140\u0144\5Q&\2\u0141\u0143\5S\'\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145P\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\t\7\2\2\u0148R\3\2"+
		"\2\2\u0149\u014c\5Q&\2\u014a\u014c\t\b\2\2\u014b\u0149\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014cT\3\2\2\2\u014d\u014f\t\2\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\b(\2\2\u0153V\3\2\2\2\u0154\u0155\7&\2\2\u0155\u0156"+
		"\7*\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b)\4\2\u0158X\3\2\2\2\u0159\u015a"+
		"\7&\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b*\t\2\u015cZ\3\2\2\2\u015d\u015f"+
		"\5],\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\\\3\2\2\2\u0162\u0163\7)\2\2\u0163\u0168\7)\2\2\u0164"+
		"\u0165\7&\2\2\u0165\u0168\7&\2\2\u0166\u0168\n\t\2\2\u0167\u0162\3\2\2"+
		"\2\u0167\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168^\3\2\2\2\u0169\u016a"+
		"\7)\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b-\5\2\u016c`\3\2\2\2\u016d\u016e"+
		"\7=\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b.\5\2\u0170b\3\2\2\2\u0171\u0172"+
		"\7*\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b/\4\2\u0174d\3\2\2\2\u0175\u0176"+
		"\5O%\2\u0176f\3\2\2\2\u0177\u0178\5\25\b\2\u0178h\3\2\2\2\u0179\u017a"+
		"\7~\2\2\u017aj\3\2\2\2\u017b\u017c\7.\2\2\u017cl\3\2\2\2\u017d\u017e\7"+
		">\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b\64\6\2\u0180n\3\2\2\2\u0181\u0182"+
		"\7@\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\65\5\2\u0184p\3\2\2\2\u0185"+
		"\u0186\7\u0080\2\2\u0186r\3\2\2\2\u0187\u0188\7A\2\2\u0188\u0189\7*\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018b\b\67\4\2\u018bt\3\2\2\2\u018c\u018f"+
		"\5G!\2\u018d\u018f\5I\"\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"v\3\2\2\2\u0190\u0191\5A\36\2\u0191x\3\2\2\2\u0192\u0193\7)\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\b:\b\2\u0195z\3\2\2\2\u0196\u0197\5/\25\2\u0197"+
		"|\3\2\2\2\u0198\u0199\5\61\26\2\u0199~\3\2\2\2\u019a\u019b\5+\23\2\u019b"+
		"\u0080\3\2\2\2\u019c\u019d\5-\24\2\u019d\u0082\3\2\2\2\u019e\u019f\5\63"+
		"\27\2\u019f\u0084\3\2\2\2\u01a0\u01a6\5?\35\2\u01a1\u01a3\5\35\f\2\u01a2"+
		"\u01a4\5O%\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\3\2\2"+
		"\2\u01a5\u01a7\5O%\2\u01a6\u01a1\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u0086"+
		"\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\bA\4\2\u01ab"+
		"\u0088\3\2\2\2\u01ac\u01ad\5\25\b\2\u01ad\u008a\3\2\2\2\u01ae\u01af\5"+
		"U(\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\bC\2\2\u01b1\u008c\3\2\2\2\u01b2"+
		"\u01b4\n\n\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01ba\t\13\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\b"+
		"D\2\2\u01bc\u01bd\bD\5\2\u01bd\u008e\3\2\2\2\u01be\u01bf\7g\2\2\u01bf"+
		"\u01c0\7p\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\bE\5"+
		"\2\u01c3\u0090\3\2\2\2\u01c4\u01c5\7>\2\2\u01c5\u0092\3\2\2\2\u01c6\u01c7"+
		"\7@\2\2\u01c7\u0094\3\2\2\2\u01c8\u01c9\7\u0080\2\2\u01c9\u0096\3\2\2"+
		"\2\u01ca\u01cb\5\63\27\2\u01cb\u0098\3\2\2\2\u01cc\u01cd\t\f\2\2\u01cd"+
		"\u009a\3\2\2\2\u01ce\u01cf\7)\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\bK\n"+
		"\2\u01d1\u009c\3\2\2\2\u01d2\u01d3\7*\2\2\u01d3\u009e\3\2\2\2\u01d4\u01d5"+
		"\7+\2\2\u01d5\u00a0\3\2\2\2\u01d6\u01d7\7]\2\2\u01d7\u00a2\3\2\2\2\u01d8"+
		"\u01d9\7_\2\2\u01d9\u00a4\3\2\2\2\u01da\u01db\5O%\2\u01db\u00a6\3\2\2"+
		"\2\u01dc\u01dd\5U(\2\u01dd\u01de\3\2\2\2\u01de\u01df\bQ\2\2\u01df\u00a8"+
		"\3\2\2\2\u01e0\u01e2\5\u00abS\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2"+
		"\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u00aa\3\2\2\2\u01e5\u01e6"+
		"\7)\2\2\u01e6\u01e9\7)\2\2\u01e7\u01e9\n\r\2\2\u01e8\u01e5\3\2\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u00ac\3\2\2\2\u01ea\u01eb\7)\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\bT\5\2\u01ed\u00ae\3\2\2\2\33\2\3\4\5\6\7\b\u00cb\u00ce"+
		"\u012c\u0131\u0135\u013a\u0144\u014b\u0150\u0160\u0167\u018e\u01a3\u01a6"+
		"\u01b5\u01b9\u01e3\u01e8\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2"+
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