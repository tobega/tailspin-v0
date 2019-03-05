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
		InvertMatch=45, MatchInteger=46, RangeMatch=47, START_REGEXP=48, StartStructureMatch=49, 
		EndStructureMatch=50, StructureKey=51, MatchDereference=52, MatchArrayDereference=53, 
		MatchFieldDereference=54, MatcherIgnoreWS=55, Comment=56, ComposerEndDefinition=57, 
		StartComposerMatch=58, EndComposerMatch=59, Optional=60, START_REGEX=61, 
		StartSkipRule=62, EndSkipRule=63, StartBuildArray=64, EndBuildArray=65, 
		ComposerId=66, ComposerIgnoreWS=67, REGEX_TEXT=68, END_REGEX=69;
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
		"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
		"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
		"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
		"EndComposerMatch", "Optional", "START_REGEX", "StartSkipRule", "EndSkipRule", 
		"StartBuildArray", "EndBuildArray", "ComposerId", "ComposerIgnoreWS", 
		"REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		null, "':'", "','", "'...'", null, null, null, null, "'{'", "'}'", null, 
		null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, null, 
		"'0'", null, null, null, null, "'$('", null, null, null, "';'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'?'"
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
		"InterpolateField", "StartSubMatcher", "EndMatcher", "InvertMatch", "MatchInteger", 
		"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
		"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
		"EndComposerMatch", "Optional", "START_REGEX", "StartSkipRule", "EndSkipRule", 
		"StartBuildArray", "EndBuildArray", "ComposerId", "ComposerIgnoreWS", 
		"REGEX_TEXT", "END_REGEX"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01c7\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\5\6\u00ba\n\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0117\n\36\3\37\3\37\3 "+
		"\5 \u011c\n \3 \3 \5 \u0120\n \3!\6!\u0123\n!\r!\16!\u0124\3\"\3\"\3\""+
		"\3\"\3#\3#\7#\u012d\n#\f#\16#\u0130\13#\3$\3$\3%\3%\5%\u0136\n%\3&\6&"+
		"\u0139\n&\r&\16&\u013a\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\6)\u0149"+
		"\n)\r)\16)\u014a\3*\3*\3*\3*\3*\5*\u0152\n*\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\5\63\u0170\n\63\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\39\59\u0181\n9\39\59\u0184\n9\3:\3:\3:\3:\3;\3"+
		";\3<\3<\3<\3<\3=\7=\u0191\n=\f=\16=\u0194\13=\3=\5=\u0197\n=\3=\3=\3="+
		"\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3H\3H\3I\6I\u01bb\nI\rI\16I\u01bc\3J\3J\3J\5J\u01c2\n"+
		"J\3K\3K\3K\3K\2\2L\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35"+
		"\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33"+
		";\34=\35?\36A\37C E!G\2I\"K#M\2O\2Q$S%U&W\'Y\2[(])_*a+c,e-g.i/k\60m\61"+
		"o\62q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b"+
		"@\u008dA\u008fB\u0091C\u0093D\u0095E\u0097F\u0099\2\u009bG\t\2\3\4\5\6"+
		"\7\b\r\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c"+
		"|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\3\2))\2\u01cd\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3"+
		"[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\5e\3\2\2\2\5g\3"+
		"\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2"+
		"\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\6\177\3\2\2"+
		"\2\7\u0081\3\2\2\2\7\u0083\3\2\2\2\7\u0085\3\2\2\2\7\u0087\3\2\2\2\7\u0089"+
		"\3\2\2\2\7\u008b\3\2\2\2\7\u008d\3\2\2\2\7\u008f\3\2\2\2\7\u0091\3\2\2"+
		"\2\7\u0093\3\2\2\2\7\u0095\3\2\2\2\b\u0097\3\2\2\2\b\u009b\3\2\2\2\t\u009d"+
		"\3\2\2\2\13\u00a3\3\2\2\2\r\u00aa\3\2\2\2\17\u00b0\3\2\2\2\21\u00b6\3"+
		"\2\2\2\23\u00be\3\2\2\2\25\u00c3\3\2\2\2\27\u00c6\3\2\2\2\31\u00cc\3\2"+
		"\2\2\33\u00cf\3\2\2\2\35\u00d1\3\2\2\2\37\u00d3\3\2\2\2!\u00d5\3\2\2\2"+
		"#\u00d9\3\2\2\2%\u00dd\3\2\2\2\'\u00e1\3\2\2\2)\u00e3\3\2\2\2+\u00e5\3"+
		"\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00ec\3\2\2\2\63\u00f0\3\2\2\2"+
		"\65\u00fa\3\2\2\2\67\u0105\3\2\2\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010d"+
		"\3\2\2\2?\u0110\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E\u011b\3\2\2\2G"+
		"\u0122\3\2\2\2I\u0126\3\2\2\2K\u012a\3\2\2\2M\u0131\3\2\2\2O\u0135\3\2"+
		"\2\2Q\u0138\3\2\2\2S\u013e\3\2\2\2U\u0143\3\2\2\2W\u0148\3\2\2\2Y\u0151"+
		"\3\2\2\2[\u0153\3\2\2\2]\u0157\3\2\2\2_\u015b\3\2\2\2a\u015f\3\2\2\2c"+
		"\u0161\3\2\2\2e\u0163\3\2\2\2g\u0167\3\2\2\2i\u016b\3\2\2\2k\u016f\3\2"+
		"\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0177\3\2\2\2s\u0179\3\2\2\2u\u017b"+
		"\3\2\2\2w\u017d\3\2\2\2y\u0185\3\2\2\2{\u0189\3\2\2\2}\u018b\3\2\2\2\177"+
		"\u0192\3\2\2\2\u0081\u019b\3\2\2\2\u0083\u01a1\3\2\2\2\u0085\u01a3\3\2"+
		"\2\2\u0087\u01a5\3\2\2\2\u0089\u01a7\3\2\2\2\u008b\u01ab\3\2\2\2\u008d"+
		"\u01ad\3\2\2\2\u008f\u01af\3\2\2\2\u0091\u01b1\3\2\2\2\u0093\u01b3\3\2"+
		"\2\2\u0095\u01b5\3\2\2\2\u0097\u01ba\3\2\2\2\u0099\u01c1\3\2\2\2\u009b"+
		"\u01c3\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\b\2\2\2\u00a1\u00a2\b\2\3\2\u00a2\n\3\2\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00a9\7v\2\2\u00a9\f\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\16\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7"+
		"h\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\20\3\2\2\2\u00b6\u00bc"+
		"\5;\33\2\u00b7\u00b9\5\35\f\2\u00b8\u00ba\5K#\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5K#\2\u00bc\u00b7\3\2\2"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\22\3\2\2\2\u00be\u00bf\5\21\6\2\u00bf\u00c0"+
		"\5#\17\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\7\4\2\u00c2\24\3\2\2\2\u00c3"+
		"\u00c4\7\60\2\2\u00c4\u00c5\5K#\2\u00c5\26\3\2\2\2\u00c6\u00c7\7\60\2"+
		"\2\u00c7\u00c8\5K#\2\u00c8\u00c9\5#\17\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb"+
		"\b\t\4\2\u00cb\30\3\2\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7@\2\2\u00ce"+
		"\32\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\34\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"\36\3\2\2\2\u00d3\u00d4\7.\2\2\u00d4 \3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6"+
		"\u00d7\7\60\2\2\u00d7\u00d8\7\60\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7*\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\17\4\2\u00dc$\3\2\2\2\u00dd\u00de"+
		"\7+\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\20\5\2\u00e0&\3\2\2\2\u00e1"+
		"\u00e2\7]\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4*\3\2\2\2\u00e5\u00e6"+
		"\7}\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8.\3\2\2\2\u00e9\u00ea"+
		"\5K#\2\u00ea\u00eb\5\35\f\2\u00eb\60\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b\26\6\2\u00ef\62\3\2\2\2\u00f0\u00f1\7v\2"+
		"\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5"+
		"\7n\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7o\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7u\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7t\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\b\30\7\2\u0104\66\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\7f\2\2\u01088\3\2\2\2\u0109\u010a\7%\2\2\u010a:\3\2\2\2\u010b\u010c"+
		"\7&\2\2\u010c<\3\2\2\2\u010d\u010e\7\60\2\2\u010e\u010f\7\60\2\2\u010f"+
		">\3\2\2\2\u0110\u0111\t\3\2\2\u0111@\3\2\2\2\u0112\u0117\t\4\2\2\u0113"+
		"\u0114\7o\2\2\u0114\u0115\7q\2\2\u0115\u0117\7f\2\2\u0116\u0112\3\2\2"+
		"\2\u0116\u0113\3\2\2\2\u0117B\3\2\2\2\u0118\u0119\7\62\2\2\u0119D\3\2"+
		"\2\2\u011a\u011c\7/\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\t\5\2\2\u011e\u0120\5G!\2\u011f\u011e\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120F\3\2\2\2\u0121\u0123\t\6\2\2\u0122\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"H\3\2\2\2\u0126\u0127\7)\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\"\b\2\u0129"+
		"J\3\2\2\2\u012a\u012e\5M$\2\u012b\u012d\5O%\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fL\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0132\t\7\2\2\u0132N\3\2\2\2\u0133\u0136\5"+
		"M$\2\u0134\u0136\t\b\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"P\3\2\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\b&\2\2\u013dR\3\2\2\2\u013e\u013f\7&\2\2\u013f\u0140\7*\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\b\'\4\2\u0142T\3\2\2\2\u0143\u0144\7&\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\b(\t\2\u0146V\3\2\2\2\u0147\u0149\5Y*\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"X\3\2\2\2\u014c\u014d\7)\2\2\u014d\u0152\7)\2\2\u014e\u014f\7&\2\2\u014f"+
		"\u0152\7&\2\2\u0150\u0152\n\t\2\2\u0151\u014c\3\2\2\2\u0151\u014e\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152Z\3\2\2\2\u0153\u0154\7)\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\b+\5\2\u0156\\\3\2\2\2\u0157\u0158\7=\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\b,\5\2\u015a^\3\2\2\2\u015b\u015c\7*\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\b-\4\2\u015e`\3\2\2\2\u015f\u0160\5K#\2\u0160b\3"+
		"\2\2\2\u0161\u0162\5\25\b\2\u0162d\3\2\2\2\u0163\u0164\7>\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\b\60\6\2\u0166f\3\2\2\2\u0167\u0168\7@\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\b\61\5\2\u016ah\3\2\2\2\u016b\u016c\7#\2\2"+
		"\u016cj\3\2\2\2\u016d\u0170\5C\37\2\u016e\u0170\5E \2\u016f\u016d\3\2"+
		"\2\2\u016f\u016e\3\2\2\2\u0170l\3\2\2\2\u0171\u0172\5=\34\2\u0172n\3\2"+
		"\2\2\u0173\u0174\7)\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b\65\b\2\u0176"+
		"p\3\2\2\2\u0177\u0178\5+\23\2\u0178r\3\2\2\2\u0179\u017a\5-\24\2\u017a"+
		"t\3\2\2\2\u017b\u017c\5/\25\2\u017cv\3\2\2\2\u017d\u0183\5;\33\2\u017e"+
		"\u0180\5\35\f\2\u017f\u0181\5K#\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0184\3\2\2\2\u0182\u0184\5K#\2\u0183\u017e\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184x\3\2\2\2\u0185\u0186\7*\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\b:\4\2\u0188z\3\2\2\2\u0189\u018a\5\25\b\2\u018a|\3\2\2\2\u018b\u018c"+
		"\5Q&\2\u018c\u018d\3\2\2\2\u018d\u018e\b<\2\2\u018e~\3\2\2\2\u018f\u0191"+
		"\n\n\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\t\13"+
		"\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b=\2\2\u0199"+
		"\u019a\b=\5\2\u019a\u0080\3\2\2\2\u019b\u019c\7g\2\2\u019c\u019d\7p\2"+
		"\2\u019d\u019e\7f\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\b>\5\2\u01a0\u0082"+
		"\3\2\2\2\u01a1\u01a2\7>\2\2\u01a2\u0084\3\2\2\2\u01a3\u01a4\7@\2\2\u01a4"+
		"\u0086\3\2\2\2\u01a5\u01a6\7A\2\2\u01a6\u0088\3\2\2\2\u01a7\u01a8\7)\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\bB\n\2\u01aa\u008a\3\2\2\2\u01ab\u01ac"+
		"\7*\2\2\u01ac\u008c\3\2\2\2\u01ad\u01ae\7+\2\2\u01ae\u008e\3\2\2\2\u01af"+
		"\u01b0\7]\2\2\u01b0\u0090\3\2\2\2\u01b1\u01b2\7_\2\2\u01b2\u0092\3\2\2"+
		"\2\u01b3\u01b4\5K#\2\u01b4\u0094\3\2\2\2\u01b5\u01b6\5Q&\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01b8\bH\2\2\u01b8\u0096\3\2\2\2\u01b9\u01bb\5\u0099J\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u0098\3\2\2\2\u01be\u01bf\7)\2\2\u01bf\u01c2\7)\2\2\u01c0"+
		"\u01c2\n\f\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u009a\3\2"+
		"\2\2\u01c3\u01c4\7)\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\bK\5\2\u01c6\u009c"+
		"\3\2\2\2\33\2\3\4\5\6\7\b\u00b9\u00bc\u0116\u011b\u011f\u0124\u012e\u0135"+
		"\u013a\u014a\u0151\u016f\u0180\u0183\u0192\u0196\u01bc\u01c1\13\b\2\2"+
		"\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}