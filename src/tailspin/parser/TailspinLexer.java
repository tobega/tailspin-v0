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
		EndStructureMatch=50, StartArrayMatch=51, EndArrayMatch=52, StructureKey=53, 
		MatchDereference=54, MatchArrayDereference=55, MatchFieldDereference=56, 
		MatcherIgnoreWS=57, Comment=58, ComposerEndDefinition=59, StartComposerMatch=60, 
		EndComposerMatch=61, Optional=62, START_REGEX=63, StartSkipRule=64, EndSkipRule=65, 
		StartBuildArray=66, EndBuildArray=67, ComposerId=68, ComposerIgnoreWS=69, 
		REGEX_TEXT=70, END_REGEX=71;
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
		"StartArrayMatch", "EndArrayMatch", "StructureKey", "MatchDereference", 
		"MatchArrayDereference", "MatchFieldDereference", "MatcherIgnoreWS", "Comment", 
		"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "Optional", 
		"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
		"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		null, "':'", "','", "'...'", null, null, null, null, "'{'", "'}'", null, 
		null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, null, 
		"'0'", null, null, null, null, "'$('", null, null, null, "';'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'?'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01cf\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\5\6\u00be\n\6\3\6\5\6\u00c1\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u011b\n\36"+
		"\3\37\3\37\3 \5 \u0120\n \3 \3 \5 \u0124\n \3!\6!\u0127\n!\r!\16!\u0128"+
		"\3\"\3\"\3\"\3\"\3#\3#\7#\u0131\n#\f#\16#\u0134\13#\3$\3$\3%\3%\5%\u013a"+
		"\n%\3&\6&\u013d\n&\r&\16&\u013e\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3)\6)\u014d\n)\r)\16)\u014e\3*\3*\3*\3*\3*\5*\u0156\n*\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\5\63\u0174\n\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\5;\u0189\n;\3;\5;\u018c"+
		"\n;\3<\3<\3<\3<\3=\3=\3>\3>\3>\3>\3?\7?\u0199\n?\f?\16?\u019c\13?\3?\5"+
		"?\u019f\n?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3"+
		"E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3J\3K\6K\u01c3\nK\rK\16K\u01c4\3"+
		"L\3L\3L\5L\u01ca\nL\3M\3M\3M\3M\2\2N\t\3\13\4\r\5\17\6\21\7\23\b\25\t"+
		"\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63"+
		"\30\65\31\67\329\33;\34=\35?\36A\37C E!G\2I\"K#M\2O\2Q$S%U&W\'Y\2[(])"+
		"_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085"+
		"=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093D\u0095E\u0097F\u0099"+
		"G\u009bH\u009d\2\u009fI\t\2\3\4\5\6\7\b\r\5\2\13\f\17\17\"\"\4\2--//\4"+
		"\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f"+
		"\3\2))\2\u01d5\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2"+
		"\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4"+
		"a\3\2\2\2\4c\3\2\2\2\5e\3\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3"+
		"\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2"+
		"\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\6\u0083\3\2\2\2"+
		"\7\u0085\3\2\2\2\7\u0087\3\2\2\2\7\u0089\3\2\2\2\7\u008b\3\2\2\2\7\u008d"+
		"\3\2\2\2\7\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2"+
		"\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\b\u009b\3\2\2\2\b\u009f\3\2\2\2\t\u00a1"+
		"\3\2\2\2\13\u00a7\3\2\2\2\r\u00ae\3\2\2\2\17\u00b4\3\2\2\2\21\u00ba\3"+
		"\2\2\2\23\u00c2\3\2\2\2\25\u00c7\3\2\2\2\27\u00ca\3\2\2\2\31\u00d0\3\2"+
		"\2\2\33\u00d3\3\2\2\2\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2"+
		"#\u00dd\3\2\2\2%\u00e1\3\2\2\2\'\u00e5\3\2\2\2)\u00e7\3\2\2\2+\u00e9\3"+
		"\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00f0\3\2\2\2\63\u00f4\3\2\2\2"+
		"\65\u00fe\3\2\2\2\67\u0109\3\2\2\29\u010d\3\2\2\2;\u010f\3\2\2\2=\u0111"+
		"\3\2\2\2?\u0114\3\2\2\2A\u011a\3\2\2\2C\u011c\3\2\2\2E\u011f\3\2\2\2G"+
		"\u0126\3\2\2\2I\u012a\3\2\2\2K\u012e\3\2\2\2M\u0135\3\2\2\2O\u0139\3\2"+
		"\2\2Q\u013c\3\2\2\2S\u0142\3\2\2\2U\u0147\3\2\2\2W\u014c\3\2\2\2Y\u0155"+
		"\3\2\2\2[\u0157\3\2\2\2]\u015b\3\2\2\2_\u015f\3\2\2\2a\u0163\3\2\2\2c"+
		"\u0165\3\2\2\2e\u0167\3\2\2\2g\u016b\3\2\2\2i\u016f\3\2\2\2k\u0173\3\2"+
		"\2\2m\u0175\3\2\2\2o\u0177\3\2\2\2q\u017b\3\2\2\2s\u017d\3\2\2\2u\u017f"+
		"\3\2\2\2w\u0181\3\2\2\2y\u0183\3\2\2\2{\u0185\3\2\2\2}\u018d\3\2\2\2\177"+
		"\u0191\3\2\2\2\u0081\u0193\3\2\2\2\u0083\u019a\3\2\2\2\u0085\u01a3\3\2"+
		"\2\2\u0087\u01a9\3\2\2\2\u0089\u01ab\3\2\2\2\u008b\u01ad\3\2\2\2\u008d"+
		"\u01af\3\2\2\2\u008f\u01b3\3\2\2\2\u0091\u01b5\3\2\2\2\u0093\u01b7\3\2"+
		"\2\2\u0095\u01b9\3\2\2\2\u0097\u01bb\3\2\2\2\u0099\u01bd\3\2\2\2\u009b"+
		"\u01c2\3\2\2\2\u009d\u01c9\3\2\2\2\u009f\u01cb\3\2\2\2\u00a1\u00a2\7\61"+
		"\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\2\2\2\u00a5"+
		"\u00a6\b\2\3\2\u00a6\n\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7f\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\f\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7f"+
		"\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\16\3\2\2\2\u00b4\u00b5"+
		"\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\t\2\2\2\u00b9\20\3\2\2\2\u00ba\u00c0\5;\33\2\u00bb\u00bd\5\35\f"+
		"\2\u00bc\u00be\5K#\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00c1\5K#\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\22\3\2\2\2\u00c2\u00c3\5\21\6\2\u00c3\u00c4\5#\17\2\u00c4\u00c5\3\2\2"+
		"\2\u00c5\u00c6\b\7\4\2\u00c6\24\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9"+
		"\5K#\2\u00c9\26\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc\5K#\2\u00cc\u00cd"+
		"\5#\17\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\t\4\2\u00cf\30\3\2\2\2\u00d0"+
		"\u00d1\7/\2\2\u00d1\u00d2\7@\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4"+
		"\34\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7.\2\2\u00d8"+
		" \3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7\60\2\2\u00db\u00dc\7\60\2"+
		"\2\u00dc\"\3\2\2\2\u00dd\u00de\7*\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\b\17\4\2\u00e0$\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\b\20\5\2\u00e4&\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6(\3\2\2\2\u00e7"+
		"\u00e8\7_\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea,\3\2\2\2\u00eb\u00ec"+
		"\7\177\2\2\u00ec.\3\2\2\2\u00ed\u00ee\5K#\2\u00ee\u00ef\5\35\f\2\u00ef"+
		"\60\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\26\6"+
		"\2\u00f3\62\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7o\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7c\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7u\2\2\u00fd\64\3\2\2\2\u00fe"+
		"\u00ff\7e\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2"+
		"\u0102\u0103\7q\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\30\7\2\u0108\66\3\2\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7f\2\2\u010c8\3\2\2\2\u010d"+
		"\u010e\7%\2\2\u010e:\3\2\2\2\u010f\u0110\7&\2\2\u0110<\3\2\2\2\u0111\u0112"+
		"\7\60\2\2\u0112\u0113\7\60\2\2\u0113>\3\2\2\2\u0114\u0115\t\3\2\2\u0115"+
		"@\3\2\2\2\u0116\u011b\t\4\2\2\u0117\u0118\7o\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011b\7f\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011bB\3\2\2\2\u011c"+
		"\u011d\7\62\2\2\u011dD\3\2\2\2\u011e\u0120\7/\2\2\u011f\u011e\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\t\5\2\2\u0122\u0124"+
		"\5G!\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124F\3\2\2\2\u0125\u0127"+
		"\t\6\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129H\3\2\2\2\u012a\u012b\7)\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\b\"\b\2\u012dJ\3\2\2\2\u012e\u0132\5M$\2\u012f\u0131\5O%\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133L\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\t\7\2\2\u0136N\3\2"+
		"\2\2\u0137\u013a\5M$\2\u0138\u013a\t\b\2\2\u0139\u0137\3\2\2\2\u0139\u0138"+
		"\3\2\2\2\u013aP\3\2\2\2\u013b\u013d\t\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b&\2\2\u0141R\3\2\2\2\u0142\u0143\7&\2\2\u0143\u0144"+
		"\7*\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\'\4\2\u0146T\3\2\2\2\u0147\u0148"+
		"\7&\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b(\t\2\u014aV\3\2\2\2\u014b\u014d"+
		"\5Y*\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014fX\3\2\2\2\u0150\u0151\7)\2\2\u0151\u0156\7)\2\2\u0152"+
		"\u0153\7&\2\2\u0153\u0156\7&\2\2\u0154\u0156\n\t\2\2\u0155\u0150\3\2\2"+
		"\2\u0155\u0152\3\2\2\2\u0155\u0154\3\2\2\2\u0156Z\3\2\2\2\u0157\u0158"+
		"\7)\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b+\5\2\u015a\\\3\2\2\2\u015b\u015c"+
		"\7=\2\2\u015c\u015d\3\2\2\2\u015d\u015e\b,\5\2\u015e^\3\2\2\2\u015f\u0160"+
		"\7*\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b-\4\2\u0162`\3\2\2\2\u0163\u0164"+
		"\5K#\2\u0164b\3\2\2\2\u0165\u0166\5\25\b\2\u0166d\3\2\2\2\u0167\u0168"+
		"\7>\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\60\6\2\u016af\3\2\2\2\u016b"+
		"\u016c\7@\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b\61\5\2\u016eh\3\2\2\2"+
		"\u016f\u0170\7#\2\2\u0170j\3\2\2\2\u0171\u0174\5C\37\2\u0172\u0174\5E"+
		" \2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174l\3\2\2\2\u0175\u0176"+
		"\5=\34\2\u0176n\3\2\2\2\u0177\u0178\7)\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\b\65\b\2\u017ap\3\2\2\2\u017b\u017c\5+\23\2\u017cr\3\2\2\2\u017d\u017e"+
		"\5-\24\2\u017et\3\2\2\2\u017f\u0180\5\'\21\2\u0180v\3\2\2\2\u0181\u0182"+
		"\5)\22\2\u0182x\3\2\2\2\u0183\u0184\5/\25\2\u0184z\3\2\2\2\u0185\u018b"+
		"\5;\33\2\u0186\u0188\5\35\f\2\u0187\u0189\5K#\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018c\5K#\2\u018b\u0186\3\2\2"+
		"\2\u018b\u018a\3\2\2\2\u018c|\3\2\2\2\u018d\u018e\7*\2\2\u018e\u018f\3"+
		"\2\2\2\u018f\u0190\b<\4\2\u0190~\3\2\2\2\u0191\u0192\5\25\b\2\u0192\u0080"+
		"\3\2\2\2\u0193\u0194\5Q&\2\u0194\u0195\3\2\2\2\u0195\u0196\b>\2\2\u0196"+
		"\u0082\3\2\2\2\u0197\u0199\n\n\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019f\t\13\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3"+
		"\2\2\2\u01a0\u01a1\b?\2\2\u01a1\u01a2\b?\5\2\u01a2\u0084\3\2\2\2\u01a3"+
		"\u01a4\7g\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7f\2\2\u01a6\u01a7\3\2\2"+
		"\2\u01a7\u01a8\b@\5\2\u01a8\u0086\3\2\2\2\u01a9\u01aa\7>\2\2\u01aa\u0088"+
		"\3\2\2\2\u01ab\u01ac\7@\2\2\u01ac\u008a\3\2\2\2\u01ad\u01ae\7A\2\2\u01ae"+
		"\u008c\3\2\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\bD\n"+
		"\2\u01b2\u008e\3\2\2\2\u01b3\u01b4\7*\2\2\u01b4\u0090\3\2\2\2\u01b5\u01b6"+
		"\7+\2\2\u01b6\u0092\3\2\2\2\u01b7\u01b8\7]\2\2\u01b8\u0094\3\2\2\2\u01b9"+
		"\u01ba\7_\2\2\u01ba\u0096\3\2\2\2\u01bb\u01bc\5K#\2\u01bc\u0098\3\2\2"+
		"\2\u01bd\u01be\5Q&\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bJ\2\2\u01c0\u009a"+
		"\3\2\2\2\u01c1\u01c3\5\u009dL\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u009c\3\2\2\2\u01c6\u01c7"+
		"\7)\2\2\u01c7\u01ca\7)\2\2\u01c8\u01ca\n\f\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u009e\3\2\2\2\u01cb\u01cc\7)\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\bM\5\2\u01ce\u00a0\3\2\2\2\33\2\3\4\5\6\7\b\u00bd\u00c0"+
		"\u011a\u011f\u0123\u0128\u0132\u0139\u013e\u014e\u0155\u0173\u0188\u018b"+
		"\u019a\u019e\u01c4\u01c9\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2"+
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