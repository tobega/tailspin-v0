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
		SemiColon=12, Comma=13, Deconstructor=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Key=21, 
		StartMatcher=22, StartTemplatesDefinition=23, StartComposerDefinition=24, 
		EndDefinition=25, TemplateMatch=26, StartDereference=27, Range=28, AdditiveOperator=29, 
		MultiplicativeOperator=30, Zero=31, NonZeroInteger=32, START_STRING=33, 
		IDENTIFIER=34, WS=35, StartStringEvaluate=36, StartStringInterpolate=37, 
		STRING_TEXT=38, END_STRING=39, EndInterpolate=40, InterpolateArray=41, 
		InterpolateIdentifier=42, InterpolateField=43, StartSubMatcher=44, EndMatcher=45, 
		InvertMatch=46, BeginSuchThat=47, MatchInteger=48, RangeMatch=49, START_REGEXP=50, 
		StartStructureMatch=51, EndStructureMatch=52, StartArrayMatch=53, EndArrayMatch=54, 
		StructureKey=55, MatchDereference=56, MatchArrayDereference=57, MatchFieldDereference=58, 
		MatcherIgnoreWS=59, Comment=60, ComposerEndDefinition=61, StartComposerMatch=62, 
		EndComposerMatch=63, Optional=64, START_REGEX=65, StartSkipRule=66, EndSkipRule=67, 
		StartBuildArray=68, EndBuildArray=69, ComposerId=70, ComposerIgnoreWS=71, 
		REGEX_TEXT=72, END_REGEX=73;
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
		"SemiColon", "Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
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
		"'!'", "':'", null, "','", "'...'", null, null, null, null, "'{'", "'}'", 
		null, null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, 
		null, "'0'", null, null, null, null, "'$('", null, null, null, null, null, 
		null, null, null, null, "'~'", "'?('", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StartComment", "Stdout", "Stdin", "Def", "Dereference", "StartArrayDereference", 
		"FieldDereference", "FieldArrayDereference", "To", "ResultMarker", "Colon", 
		"SemiColon", "Comma", "Deconstructor", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01da\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00c2\n\6\3\6\5\6\u00c5\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0121\n\37\3 \3 \3!\5!\u0126\n!\3!\3!\5!\u012a\n!\3\"\6\"\u012d"+
		"\n\"\r\"\16\"\u012e\3#\3#\3#\3#\3$\3$\7$\u0137\n$\f$\16$\u013a\13$\3%"+
		"\3%\3&\3&\5&\u0140\n&\3\'\6\'\u0143\n\'\r\'\16\'\u0144\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\6*\u0153\n*\r*\16*\u0154\3+\3+\3+\3+\3+\5+\u015c"+
		"\n+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\5\65\u017f\n\65\3\66\3\66\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3=\5=\u0194\n=\3=\5=\u0197\n=\3>\3>\3>\3>\3?\3?\3@\3@\3"+
		"@\3@\3A\7A\u01a4\nA\fA\16A\u01a7\13A\3A\5A\u01aa\nA\3A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K"+
		"\3L\3L\3L\3L\3M\6M\u01ce\nM\rM\16M\u01cf\3N\3N\3N\5N\u01d5\nN\3O\3O\3"+
		"O\3O\2\2P\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16"+
		"!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35"+
		"?\36A\37C E!G\"I\2K#M$O\2Q\2S%U&W\'Y([\2])_*a+c,e-g.i/k\60m\61o\62q\63"+
		"s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008d"+
		"A\u008fB\u0091C\u0093D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1"+
		"\2\u00a3K\t\2\3\4\5\6\7\b\r\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2"+
		"\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\3\2))\2\u01e0"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3"+
		"\2\2\2\4e\3\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2"+
		"\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5"+
		"}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\5\u0085\3\2\2"+
		"\2\6\u0087\3\2\2\2\7\u0089\3\2\2\2\7\u008b\3\2\2\2\7\u008d\3\2\2\2\7\u008f"+
		"\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2\2\7\u0097\3\2\2"+
		"\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\b\u009f\3\2\2\2\b\u00a3"+
		"\3\2\2\2\t\u00a5\3\2\2\2\13\u00ab\3\2\2\2\r\u00b2\3\2\2\2\17\u00b8\3\2"+
		"\2\2\21\u00be\3\2\2\2\23\u00c6\3\2\2\2\25\u00cb\3\2\2\2\27\u00ce\3\2\2"+
		"\2\31\u00d4\3\2\2\2\33\u00d7\3\2\2\2\35\u00d9\3\2\2\2\37\u00db\3\2\2\2"+
		"!\u00dd\3\2\2\2#\u00df\3\2\2\2%\u00e3\3\2\2\2\'\u00e7\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00ed\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63"+
		"\u00f6\3\2\2\2\65\u00fa\3\2\2\2\67\u0104\3\2\2\29\u010f\3\2\2\2;\u0113"+
		"\3\2\2\2=\u0115\3\2\2\2?\u0117\3\2\2\2A\u011a\3\2\2\2C\u0120\3\2\2\2E"+
		"\u0122\3\2\2\2G\u0125\3\2\2\2I\u012c\3\2\2\2K\u0130\3\2\2\2M\u0134\3\2"+
		"\2\2O\u013b\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0148\3\2\2\2W\u014d"+
		"\3\2\2\2Y\u0152\3\2\2\2[\u015b\3\2\2\2]\u015d\3\2\2\2_\u0161\3\2\2\2a"+
		"\u0165\3\2\2\2c\u0169\3\2\2\2e\u016b\3\2\2\2g\u016d\3\2\2\2i\u0171\3\2"+
		"\2\2k\u0175\3\2\2\2m\u0177\3\2\2\2o\u017e\3\2\2\2q\u0180\3\2\2\2s\u0182"+
		"\3\2\2\2u\u0186\3\2\2\2w\u0188\3\2\2\2y\u018a\3\2\2\2{\u018c\3\2\2\2}"+
		"\u018e\3\2\2\2\177\u0190\3\2\2\2\u0081\u0198\3\2\2\2\u0083\u019c\3\2\2"+
		"\2\u0085\u019e\3\2\2\2\u0087\u01a5\3\2\2\2\u0089\u01ae\3\2\2\2\u008b\u01b4"+
		"\3\2\2\2\u008d\u01b6\3\2\2\2\u008f\u01b8\3\2\2\2\u0091\u01ba\3\2\2\2\u0093"+
		"\u01be\3\2\2\2\u0095\u01c0\3\2\2\2\u0097\u01c2\3\2\2\2\u0099\u01c4\3\2"+
		"\2\2\u009b\u01c6\3\2\2\2\u009d\u01c8\3\2\2\2\u009f\u01cd\3\2\2\2\u00a1"+
		"\u01d4\3\2\2\2\u00a3\u01d6\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7"+
		"\61\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\2\2\2\u00a9\u00aa\b\2\3\2\u00aa"+
		"\n\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7v\2\2\u00b1\f\3\2\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7k\2\2"+
		"\u00b6\u00b7\7p\2\2\u00b7\16\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7"+
		"g\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd"+
		"\20\3\2\2\2\u00be\u00c4\5=\34\2\u00bf\u00c1\5\35\f\2\u00c0\u00c2\5M$\2"+
		"\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5"+
		"\5M$\2\u00c4\u00bf\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\22\3\2\2\2\u00c6"+
		"\u00c7\5\21\6\2\u00c7\u00c8\5%\20\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b"+
		"\7\4\2\u00ca\24\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00cd\5M$\2\u00cd\26"+
		"\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf\u00d0\5M$\2\u00d0\u00d1\5%\20\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\b\t\4\2\u00d3\30\3\2\2\2\u00d4\u00d5\7/\2\2"+
		"\u00d5\u00d6\7@\2\2\u00d6\32\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\34\3\2\2"+
		"\2\u00d9\u00da\7<\2\2\u00da\36\3\2\2\2\u00db\u00dc\7=\2\2\u00dc \3\2\2"+
		"\2\u00dd\u00de\7.\2\2\u00de\"\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1"+
		"\7\60\2\2\u00e1\u00e2\7\60\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\b\20\4\2\u00e6&\3\2\2\2\u00e7\u00e8\7+\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\21\5\2\u00ea(\3\2\2\2\u00eb\u00ec\7"+
		"]\2\2\u00ec*\3\2\2\2\u00ed\u00ee\7_\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7}"+
		"\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7\177\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\5M$\2\u00f4\u00f5\5\35\f\2\u00f5\62\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b\27\6\2\u00f9\64\3\2\2\2\u00fa\u00fb\7v\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7u\2\2\u0103\66\3\2\2\2\u0104\u0105\7e\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7o\2\2\u0107\u0108\7r\2\2\u0108\u0109\7q\2\2\u0109\u010a\7u\2\2"+
		"\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\b\31\7\2\u010e8\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7f\2\2\u0112:\3\2\2\2\u0113\u0114\7%\2\2\u0114<\3\2\2\2\u0115\u0116\7"+
		"&\2\2\u0116>\3\2\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7\60\2\2\u0119@"+
		"\3\2\2\2\u011a\u011b\t\3\2\2\u011bB\3\2\2\2\u011c\u0121\t\4\2\2\u011d"+
		"\u011e\7o\2\2\u011e\u011f\7q\2\2\u011f\u0121\7f\2\2\u0120\u011c\3\2\2"+
		"\2\u0120\u011d\3\2\2\2\u0121D\3\2\2\2\u0122\u0123\7\62\2\2\u0123F\3\2"+
		"\2\2\u0124\u0126\7/\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\t\5\2\2\u0128\u012a\5I\"\2\u0129\u0128\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012aH\3\2\2\2\u012b\u012d\t\6\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"J\3\2\2\2\u0130\u0131\7)\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b#\b\2\u0133"+
		"L\3\2\2\2\u0134\u0138\5O%\2\u0135\u0137\5Q&\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139N\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013c\t\7\2\2\u013cP\3\2\2\2\u013d\u0140\5"+
		"O%\2\u013e\u0140\t\b\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140"+
		"R\3\2\2\2\u0141\u0143\t\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147"+
		"\b\'\2\2\u0147T\3\2\2\2\u0148\u0149\7&\2\2\u0149\u014a\7*\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\b(\4\2\u014cV\3\2\2\2\u014d\u014e\7&\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\b)\t\2\u0150X\3\2\2\2\u0151\u0153\5[+\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"Z\3\2\2\2\u0156\u0157\7)\2\2\u0157\u015c\7)\2\2\u0158\u0159\7&\2\2\u0159"+
		"\u015c\7&\2\2\u015a\u015c\n\t\2\2\u015b\u0156\3\2\2\2\u015b\u0158\3\2"+
		"\2\2\u015b\u015a\3\2\2\2\u015c\\\3\2\2\2\u015d\u015e\7)\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\b,\5\2\u0160^\3\2\2\2\u0161\u0162\7=\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\b-\5\2\u0164`\3\2\2\2\u0165\u0166\7*\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\b.\4\2\u0168b\3\2\2\2\u0169\u016a\5M$\2\u016ad\3"+
		"\2\2\2\u016b\u016c\5\25\b\2\u016cf\3\2\2\2\u016d\u016e\7>\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\b\61\6\2\u0170h\3\2\2\2\u0171\u0172\7@\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\b\62\5\2\u0174j\3\2\2\2\u0175\u0176\7\u0080"+
		"\2\2\u0176l\3\2\2\2\u0177\u0178\7A\2\2\u0178\u0179\7*\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017b\b\64\4\2\u017bn\3\2\2\2\u017c\u017f\5E \2\u017d\u017f"+
		"\5G!\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017fp\3\2\2\2\u0180\u0181"+
		"\5?\35\2\u0181r\3\2\2\2\u0182\u0183\7)\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\b\67\b\2\u0185t\3\2\2\2\u0186\u0187\5-\24\2\u0187v\3\2\2\2\u0188\u0189"+
		"\5/\25\2\u0189x\3\2\2\2\u018a\u018b\5)\22\2\u018bz\3\2\2\2\u018c\u018d"+
		"\5+\23\2\u018d|\3\2\2\2\u018e\u018f\5\61\26\2\u018f~\3\2\2\2\u0190\u0196"+
		"\5=\34\2\u0191\u0193\5\35\f\2\u0192\u0194\5M$\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0197\5M$\2\u0196\u0191\3\2\2"+
		"\2\u0196\u0195\3\2\2\2\u0197\u0080\3\2\2\2\u0198\u0199\7*\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019b\b>\4\2\u019b\u0082\3\2\2\2\u019c\u019d\5\25\b\2\u019d"+
		"\u0084\3\2\2\2\u019e\u019f\5S\'\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b@\2"+
		"\2\u01a1\u0086\3\2\2\2\u01a2\u01a4\n\n\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01aa\t\13\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01ac\bA\2\2\u01ac\u01ad\bA\5\2\u01ad\u0088\3\2\2\2\u01ae"+
		"\u01af\7g\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7f\2\2\u01b1\u01b2\3\2\2"+
		"\2\u01b2\u01b3\bB\5\2\u01b3\u008a\3\2\2\2\u01b4\u01b5\7>\2\2\u01b5\u008c"+
		"\3\2\2\2\u01b6\u01b7\7@\2\2\u01b7\u008e\3\2\2\2\u01b8\u01b9\7A\2\2\u01b9"+
		"\u0090\3\2\2\2\u01ba\u01bb\7)\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\bF\n"+
		"\2\u01bd\u0092\3\2\2\2\u01be\u01bf\7*\2\2\u01bf\u0094\3\2\2\2\u01c0\u01c1"+
		"\7+\2\2\u01c1\u0096\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3\u0098\3\2\2\2\u01c4"+
		"\u01c5\7_\2\2\u01c5\u009a\3\2\2\2\u01c6\u01c7\5M$\2\u01c7\u009c\3\2\2"+
		"\2\u01c8\u01c9\5S\'\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\bL\2\2\u01cb\u009e"+
		"\3\2\2\2\u01cc\u01ce\5\u00a1N\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u00a0\3\2\2\2\u01d1\u01d2"+
		"\7)\2\2\u01d2\u01d5\7)\2\2\u01d3\u01d5\n\f\2\2\u01d4\u01d1\3\2\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u00a2\3\2\2\2\u01d6\u01d7\7)\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\bO\5\2\u01d9\u00a4\3\2\2\2\33\2\3\4\5\6\7\b\u00c1\u00c4"+
		"\u0120\u0125\u0129\u012e\u0138\u013f\u0144\u0154\u015b\u017e\u0193\u0196"+
		"\u01a5\u01a9\u01cf\u01d4\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2"+
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