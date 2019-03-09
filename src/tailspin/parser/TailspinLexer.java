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
		InvertMatch=45, BeginSuchThat=46, MatchInteger=47, RangeMatch=48, START_REGEXP=49, 
		StartStructureMatch=50, EndStructureMatch=51, StartArrayMatch=52, EndArrayMatch=53, 
		StructureKey=54, MatchDereference=55, MatchArrayDereference=56, MatchFieldDereference=57, 
		MatcherIgnoreWS=58, Comment=59, ComposerEndDefinition=60, StartComposerMatch=61, 
		EndComposerMatch=62, Optional=63, START_REGEX=64, StartSkipRule=65, EndSkipRule=66, 
		StartBuildArray=67, EndBuildArray=68, ComposerId=69, ComposerIgnoreWS=70, 
		REGEX_TEXT=71, END_REGEX=72;
	public static final int
		IN_STRING=1, INTERPOLATE=2, MATCHER=3, COMMENT_MODE=4, COMPOSER=5, IN_REGEX=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATE", "MATCHER", "COMMENT_MODE", 
		"COMPOSER", "IN_REGEX"
	};

	public static final String[] ruleNames = {
		"StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
		"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
		"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
		"StartComposerDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
		"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
		"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
		"WS", "StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", 
		"STRING_CHAR", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
		"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
		"MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchDereference", 
		"MatchArrayDereference", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
		"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "Optional", 
		"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
		"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		"'!'", "':'", "','", "'...'", null, null, null, null, "'{'", "'}'", null, 
		null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, null, 
		"'0'", null, null, null, null, "'$('", null, null, null, "';'", null, 
		null, null, null, null, "'~'", "'?('", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
		"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
		"Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
		"StartComposerDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
		"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
		"START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", "StartStringInterpolate", 
		"STRING_TEXT", "END_STRING", "EndInterpolate", "InterpolateArray", "InterpolateIdentifier", 
		"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
		"MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchDereference", 
		"MatchArrayDereference", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
		"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "Optional", 
		"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
		"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u01d6\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00c0\n\6\3\6\5\6\u00c3\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u011d"+
		"\n\36\3\37\3\37\3 \5 \u0122\n \3 \3 \5 \u0126\n \3!\6!\u0129\n!\r!\16"+
		"!\u012a\3\"\3\"\3\"\3\"\3#\3#\7#\u0133\n#\f#\16#\u0136\13#\3$\3$\3%\3"+
		"%\5%\u013c\n%\3&\6&\u013f\n&\r&\16&\u0140\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3)\6)\u014f\n)\r)\16)\u0150\3*\3*\3*\3*\3*\5*\u0158\n*\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u017b"+
		"\n\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3<\5<\u0190\n<\3<\5<\u0193\n<\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3@"+
		"\7@\u01a0\n@\f@\16@\u01a3\13@\3@\5@\u01a6\n@\3@\3@\3@\3A\3A\3A\3A\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3"+
		"K\3K\3L\6L\u01ca\nL\rL\16L\u01cb\3M\3M\3M\5M\u01d1\nM\3N\3N\3N\3N\2\2"+
		"O\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20"+
		"%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37"+
		"C E!G\2I\"K#M\2O\2Q$S%U&W\'Y\2[(])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65"+
		"w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008f"+
		"B\u0091C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009f\2\u00a1J\t\2"+
		"\3\4\5\6\7\b\r\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;"+
		"\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\3\2))\2\u01dc\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3"+
		"W\3\2\2\2\3[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\5e\3"+
		"\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2"+
		"\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5"+
		"\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\6\u0085\3\2\2\2\7\u0087\3"+
		"\2\2\2\7\u0089\3\2\2\2\7\u008b\3\2\2\2\7\u008d\3\2\2\2\7\u008f\3\2\2\2"+
		"\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2\2\7\u0097\3\2\2\2\7\u0099"+
		"\3\2\2\2\7\u009b\3\2\2\2\b\u009d\3\2\2\2\b\u00a1\3\2\2\2\t\u00a3\3\2\2"+
		"\2\13\u00a9\3\2\2\2\r\u00b0\3\2\2\2\17\u00b6\3\2\2\2\21\u00bc\3\2\2\2"+
		"\23\u00c4\3\2\2\2\25\u00c9\3\2\2\2\27\u00cc\3\2\2\2\31\u00d2\3\2\2\2\33"+
		"\u00d5\3\2\2\2\35\u00d7\3\2\2\2\37\u00d9\3\2\2\2!\u00db\3\2\2\2#\u00df"+
		"\3\2\2\2%\u00e3\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2"+
		"-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f2\3\2\2\2\63\u00f6\3\2\2\2\65\u0100"+
		"\3\2\2\2\67\u010b\3\2\2\29\u010f\3\2\2\2;\u0111\3\2\2\2=\u0113\3\2\2\2"+
		"?\u0116\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0121\3\2\2\2G\u0128\3"+
		"\2\2\2I\u012c\3\2\2\2K\u0130\3\2\2\2M\u0137\3\2\2\2O\u013b\3\2\2\2Q\u013e"+
		"\3\2\2\2S\u0144\3\2\2\2U\u0149\3\2\2\2W\u014e\3\2\2\2Y\u0157\3\2\2\2["+
		"\u0159\3\2\2\2]\u015d\3\2\2\2_\u0161\3\2\2\2a\u0165\3\2\2\2c\u0167\3\2"+
		"\2\2e\u0169\3\2\2\2g\u016d\3\2\2\2i\u0171\3\2\2\2k\u0173\3\2\2\2m\u017a"+
		"\3\2\2\2o\u017c\3\2\2\2q\u017e\3\2\2\2s\u0182\3\2\2\2u\u0184\3\2\2\2w"+
		"\u0186\3\2\2\2y\u0188\3\2\2\2{\u018a\3\2\2\2}\u018c\3\2\2\2\177\u0194"+
		"\3\2\2\2\u0081\u0198\3\2\2\2\u0083\u019a\3\2\2\2\u0085\u01a1\3\2\2\2\u0087"+
		"\u01aa\3\2\2\2\u0089\u01b0\3\2\2\2\u008b\u01b2\3\2\2\2\u008d\u01b4\3\2"+
		"\2\2\u008f\u01b6\3\2\2\2\u0091\u01ba\3\2\2\2\u0093\u01bc\3\2\2\2\u0095"+
		"\u01be\3\2\2\2\u0097\u01c0\3\2\2\2\u0099\u01c2\3\2\2\2\u009b\u01c4\3\2"+
		"\2\2\u009d\u01c9\3\2\2\2\u009f\u01d0\3\2\2\2\u00a1\u01d2\3\2\2\2\u00a3"+
		"\u00a4\7\61\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b"+
		"\2\2\2\u00a7\u00a8\b\2\3\2\u00a8\n\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7w\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7f\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\16\3\2\2\2\u00b6"+
		"\u00b7\7f\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\3\2\2"+
		"\2\u00ba\u00bb\t\2\2\2\u00bb\20\3\2\2\2\u00bc\u00c2\5;\33\2\u00bd\u00bf"+
		"\5\35\f\2\u00be\u00c0\5K#\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00c3\5K#\2\u00c2\u00bd\3\2\2\2\u00c2\u00c1\3\2\2"+
		"\2\u00c3\22\3\2\2\2\u00c4\u00c5\5\21\6\2\u00c5\u00c6\5#\17\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\b\7\4\2\u00c8\24\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca"+
		"\u00cb\5K#\2\u00cb\26\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\5K#\2\u00ce"+
		"\u00cf\5#\17\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\t\4\2\u00d1\30\3\2\2"+
		"\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7@\2\2\u00d4\32\3\2\2\2\u00d5\u00d6"+
		"\7#\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7<\2\2\u00d8\36\3\2\2\2\u00d9\u00da"+
		"\7.\2\2\u00da \3\2\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00dd"+
		"\u00de\7\60\2\2\u00de\"\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\b\17\4\2\u00e2$\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\b\20\5\2\u00e6&\3\2\2\2\u00e7\u00e8\7]\2\2\u00e8(\3"+
		"\2\2\2\u00e9\u00ea\7_\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7}\2\2\u00ec,\3\2"+
		"\2\2\u00ed\u00ee\7\177\2\2\u00ee.\3\2\2\2\u00ef\u00f0\5K#\2\u00f0\u00f1"+
		"\5\35\f\2\u00f1\60\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\26\6\2\u00f5\62\3\2\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7o\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7u\2\2\u00ff"+
		"\64\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7q\2\2\u0102\u0103\7o\2\2\u0103"+
		"\u0104\7r\2\2\u0104\u0105\7q\2\2\u0105\u0106\7u\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7t\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b\30\7\2\u010a\66"+
		"\3\2\2\2\u010b\u010c\7g\2\2\u010c\u010d\7p\2\2\u010d\u010e\7f\2\2\u010e"+
		"8\3\2\2\2\u010f\u0110\7%\2\2\u0110:\3\2\2\2\u0111\u0112\7&\2\2\u0112<"+
		"\3\2\2\2\u0113\u0114\7\60\2\2\u0114\u0115\7\60\2\2\u0115>\3\2\2\2\u0116"+
		"\u0117\t\3\2\2\u0117@\3\2\2\2\u0118\u011d\t\4\2\2\u0119\u011a\7o\2\2\u011a"+
		"\u011b\7q\2\2\u011b\u011d\7f\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2\2"+
		"\2\u011dB\3\2\2\2\u011e\u011f\7\62\2\2\u011fD\3\2\2\2\u0120\u0122\7/\2"+
		"\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\t\5\2\2\u0124\u0126\5G!\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"F\3\2\2\2\u0127\u0129\t\6\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bH\3\2\2\2\u012c\u012d\7"+
		")\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\"\b\2\u012fJ\3\2\2\2\u0130\u0134"+
		"\5M$\2\u0131\u0133\5O%\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135L\3\2\2\2\u0136\u0134\3\2\2\2"+
		"\u0137\u0138\t\7\2\2\u0138N\3\2\2\2\u0139\u013c\5M$\2\u013a\u013c\t\b"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013cP\3\2\2\2\u013d\u013f"+
		"\t\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b&\2\2\u0143R\3\2\2\2\u0144"+
		"\u0145\7&\2\2\u0145\u0146\7*\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\'\4"+
		"\2\u0148T\3\2\2\2\u0149\u014a\7&\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b"+
		"(\t\2\u014cV\3\2\2\2\u014d\u014f\5Y*\2\u014e\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151X\3\2\2\2\u0152"+
		"\u0153\7)\2\2\u0153\u0158\7)\2\2\u0154\u0155\7&\2\2\u0155\u0158\7&\2\2"+
		"\u0156\u0158\n\t\2\2\u0157\u0152\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0156"+
		"\3\2\2\2\u0158Z\3\2\2\2\u0159\u015a\7)\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\b+\5\2\u015c\\\3\2\2\2\u015d\u015e\7=\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\b,\5\2\u0160^\3\2\2\2\u0161\u0162\7*\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\b-\4\2\u0164`\3\2\2\2\u0165\u0166\5K#\2\u0166b\3\2\2\2\u0167\u0168\5"+
		"\25\b\2\u0168d\3\2\2\2\u0169\u016a\7>\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\b\60\6\2\u016cf\3\2\2\2\u016d\u016e\7@\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\b\61\5\2\u0170h\3\2\2\2\u0171\u0172\7\u0080\2\2\u0172j\3\2\2\2"+
		"\u0173\u0174\7A\2\2\u0174\u0175\7*\2\2\u0175\u0176\3\2\2\2\u0176\u0177"+
		"\b\63\4\2\u0177l\3\2\2\2\u0178\u017b\5C\37\2\u0179\u017b\5E \2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017bn\3\2\2\2\u017c\u017d\5=\34\2\u017d"+
		"p\3\2\2\2\u017e\u017f\7)\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\66\b\2"+
		"\u0181r\3\2\2\2\u0182\u0183\5+\23\2\u0183t\3\2\2\2\u0184\u0185\5-\24\2"+
		"\u0185v\3\2\2\2\u0186\u0187\5\'\21\2\u0187x\3\2\2\2\u0188\u0189\5)\22"+
		"\2\u0189z\3\2\2\2\u018a\u018b\5/\25\2\u018b|\3\2\2\2\u018c\u0192\5;\33"+
		"\2\u018d\u018f\5\35\f\2\u018e\u0190\5K#\2\u018f\u018e\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0193\5K#\2\u0192\u018d\3\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193~\3\2\2\2\u0194\u0195\7*\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\b=\4\2\u0197\u0080\3\2\2\2\u0198\u0199\5\25\b\2\u0199\u0082\3\2"+
		"\2\2\u019a\u019b\5Q&\2\u019b\u019c\3\2\2\2\u019c\u019d\b?\2\2\u019d\u0084"+
		"\3\2\2\2\u019e\u01a0\n\n\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01a6\t\13\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\b@\2\2\u01a8\u01a9\b@\5\2\u01a9\u0086\3\2\2\2\u01aa\u01ab\7g\2"+
		"\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7f\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\bA\5\2\u01af\u0088\3\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u008a\3\2\2\2\u01b2"+
		"\u01b3\7@\2\2\u01b3\u008c\3\2\2\2\u01b4\u01b5\7A\2\2\u01b5\u008e\3\2\2"+
		"\2\u01b6\u01b7\7)\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\bE\n\2\u01b9\u0090"+
		"\3\2\2\2\u01ba\u01bb\7*\2\2\u01bb\u0092\3\2\2\2\u01bc\u01bd\7+\2\2\u01bd"+
		"\u0094\3\2\2\2\u01be\u01bf\7]\2\2\u01bf\u0096\3\2\2\2\u01c0\u01c1\7_\2"+
		"\2\u01c1\u0098\3\2\2\2\u01c2\u01c3\5K#\2\u01c3\u009a\3\2\2\2\u01c4\u01c5"+
		"\5Q&\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\bK\2\2\u01c7\u009c\3\2\2\2\u01c8"+
		"\u01ca\5\u009fM\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u009e\3\2\2\2\u01cd\u01ce\7)\2\2\u01ce"+
		"\u01d1\7)\2\2\u01cf\u01d1\n\f\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u00a0\3\2\2\2\u01d2\u01d3\7)\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\bN\5\2\u01d5\u00a2\3\2\2\2\33\2\3\4\5\6\7\b\u00bf\u00c2\u011c\u0121"+
		"\u0125\u012a\u0134\u013b\u0140\u0150\u0157\u017a\u018f\u0192\u01a1\u01a5"+
		"\u01cb\u01d0\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}