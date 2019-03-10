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
		InterpolateIdentifier=42, InterpolateField=43, Else=44, MatchComma=45, 
		StartSubMatcher=46, EndMatcher=47, InvertMatch=48, BeginSuchThat=49, MatchInteger=50, 
		RangeMatch=51, START_REGEXP=52, StartStructureMatch=53, EndStructureMatch=54, 
		StartArrayMatch=55, EndArrayMatch=56, StructureKey=57, MatchDereference=58, 
		MatchArrayDereference=59, MatchFieldDereference=60, MatcherIgnoreWS=61, 
		Comment=62, ComposerEndDefinition=63, StartComposerMatch=64, EndComposerMatch=65, 
		Optional=66, START_REGEX=67, StartSkipRule=68, EndSkipRule=69, StartBuildArray=70, 
		EndBuildArray=71, ComposerId=72, ComposerIgnoreWS=73, REGEX_TEXT=74, END_REGEX=75;
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
		"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
		"InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", 
		"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
		"StructureKey", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
		"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
		"EndComposerMatch", "Optional", "START_REGEX", "StartSkipRule", "EndSkipRule", 
		"StartBuildArray", "EndBuildArray", "ComposerId", "ComposerIgnoreWS", 
		"REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		"'!'", "':'", null, null, "'...'", null, null, null, null, "'{'", "'}'", 
		null, null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, 
		null, "'0'", null, null, null, null, "'$('", null, null, null, null, null, 
		null, null, "'|'", null, null, null, "'~'", "'?('", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'?'"
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
		"InterpolateField", "Else", "MatchComma", "StartSubMatcher", "EndMatcher", 
		"InvertMatch", "BeginSuchThat", "MatchInteger", "RangeMatch", "START_REGEXP", 
		"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u01e2\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00c6\n\6\3\6\5\6\u00c9"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\5\37\u0125\n\37\3 \3 \3!\5!\u012a\n!\3!\3!\5!\u012e\n!\3"+
		"\"\6\"\u0131\n\"\r\"\16\"\u0132\3#\3#\3#\3#\3$\3$\7$\u013b\n$\f$\16$\u013e"+
		"\13$\3%\3%\3&\3&\5&\u0144\n&\3\'\6\'\u0147\n\'\r\'\16\'\u0148\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\6*\u0157\n*\r*\16*\u0158\3+\3+\3+\3+\3"+
		"+\5+\u0160\n+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u0187\n\67\38\38\39\39\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\5?\u019c\n?\3?\5?\u019f\n?\3@\3@\3"+
		"@\3@\3A\3A\3B\3B\3B\3B\3C\7C\u01ac\nC\fC\16C\u01af\13C\3C\5C\u01b2\nC"+
		"\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\3L\3L\3M\3M\3N\3N\3N\3N\3O\6O\u01d6\nO\rO\16O\u01d7\3P\3P\3P\5"+
		"P\u01dd\nP\3Q\3Q\3Q\3Q\2\2R\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13"+
		"\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67"+
		"\329\33;\34=\35?\36A\37C E!G\"I\2K#M$O\2Q\2S%U&W\'Y([\2])_*a+c,e-g.i/"+
		"k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177:\u0081;\u0083<\u0085=\u0087>"+
		"\u0089?\u008b@\u008dA\u008fB\u0091C\u0093D\u0095E\u0097F\u0099G\u009b"+
		"H\u009dI\u009fJ\u00a1K\u00a3L\u00a5\2\u00a7M\t\2\3\4\5\6\7\b\r\5\2\13"+
		"\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4"+
		"\2&&))\3\2\f\f\3\3\f\f\3\2))\2\u01e8\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3"+
		"]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\5g\3\2\2\2\5i\3"+
		"\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2"+
		"\2\5w\3\2\2\2\5y\3\2\2\2\5{\3\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3"+
		"\2\2\2\5\u0083\3\2\2\2\5\u0085\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2"+
		"\6\u008b\3\2\2\2\7\u008d\3\2\2\2\7\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093"+
		"\3\2\2\2\7\u0095\3\2\2\2\7\u0097\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2"+
		"\2\7\u009d\3\2\2\2\7\u009f\3\2\2\2\7\u00a1\3\2\2\2\b\u00a3\3\2\2\2\b\u00a7"+
		"\3\2\2\2\t\u00a9\3\2\2\2\13\u00af\3\2\2\2\r\u00b6\3\2\2\2\17\u00bc\3\2"+
		"\2\2\21\u00c2\3\2\2\2\23\u00ca\3\2\2\2\25\u00cf\3\2\2\2\27\u00d2\3\2\2"+
		"\2\31\u00d8\3\2\2\2\33\u00db\3\2\2\2\35\u00dd\3\2\2\2\37\u00df\3\2\2\2"+
		"!\u00e1\3\2\2\2#\u00e3\3\2\2\2%\u00e7\3\2\2\2\'\u00eb\3\2\2\2)\u00ef\3"+
		"\2\2\2+\u00f1\3\2\2\2-\u00f3\3\2\2\2/\u00f5\3\2\2\2\61\u00f7\3\2\2\2\63"+
		"\u00fa\3\2\2\2\65\u00fe\3\2\2\2\67\u0108\3\2\2\29\u0113\3\2\2\2;\u0117"+
		"\3\2\2\2=\u0119\3\2\2\2?\u011b\3\2\2\2A\u011e\3\2\2\2C\u0124\3\2\2\2E"+
		"\u0126\3\2\2\2G\u0129\3\2\2\2I\u0130\3\2\2\2K\u0134\3\2\2\2M\u0138\3\2"+
		"\2\2O\u013f\3\2\2\2Q\u0143\3\2\2\2S\u0146\3\2\2\2U\u014c\3\2\2\2W\u0151"+
		"\3\2\2\2Y\u0156\3\2\2\2[\u015f\3\2\2\2]\u0161\3\2\2\2_\u0165\3\2\2\2a"+
		"\u0169\3\2\2\2c\u016d\3\2\2\2e\u016f\3\2\2\2g\u0171\3\2\2\2i\u0173\3\2"+
		"\2\2k\u0175\3\2\2\2m\u0179\3\2\2\2o\u017d\3\2\2\2q\u017f\3\2\2\2s\u0186"+
		"\3\2\2\2u\u0188\3\2\2\2w\u018a\3\2\2\2y\u018e\3\2\2\2{\u0190\3\2\2\2}"+
		"\u0192\3\2\2\2\177\u0194\3\2\2\2\u0081\u0196\3\2\2\2\u0083\u0198\3\2\2"+
		"\2\u0085\u01a0\3\2\2\2\u0087\u01a4\3\2\2\2\u0089\u01a6\3\2\2\2\u008b\u01ad"+
		"\3\2\2\2\u008d\u01b6\3\2\2\2\u008f\u01bc\3\2\2\2\u0091\u01be\3\2\2\2\u0093"+
		"\u01c0\3\2\2\2\u0095\u01c2\3\2\2\2\u0097\u01c6\3\2\2\2\u0099\u01c8\3\2"+
		"\2\2\u009b\u01ca\3\2\2\2\u009d\u01cc\3\2\2\2\u009f\u01ce\3\2\2\2\u00a1"+
		"\u01d0\3\2\2\2\u00a3\u01d5\3\2\2\2\u00a5\u01dc\3\2\2\2\u00a7\u01de\3\2"+
		"\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\b\2\2\2\u00ad\u00ae\b\2\3\2\u00ae\n\3\2\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7w\2\2\u00b4\u00b5\7v\2\2\u00b5\f\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\16\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7h\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1\20\3\2\2\2\u00c2\u00c8\5=\34"+
		"\2\u00c3\u00c5\5\35\f\2\u00c4\u00c6\5M$\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5M$\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\22\3\2\2\2\u00ca\u00cb\5\21\6\2\u00cb\u00cc\5%\20"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\7\4\2\u00ce\24\3\2\2\2\u00cf\u00d0"+
		"\7\60\2\2\u00d0\u00d1\5M$\2\u00d1\26\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3"+
		"\u00d4\5M$\2\u00d4\u00d5\5%\20\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\t\4"+
		"\2\u00d7\30\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7@\2\2\u00da\32\3\2"+
		"\2\2\u00db\u00dc\7#\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7<\2\2\u00de\36\3"+
		"\2\2\2\u00df\u00e0\7=\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7.\2\2\u00e2\"\3"+
		"\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7\60\2\2"+
		"\u00e6$\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\20"+
		"\4\2\u00ea&\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\b\21\5\2\u00ee(\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0*\3\2\2\2\u00f1\u00f2"+
		"\7_\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7}\2\2\u00f4.\3\2\2\2\u00f5\u00f6\7"+
		"\177\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\5M$\2\u00f8\u00f9\5\35\f\2\u00f9"+
		"\62\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\27\6"+
		"\2\u00fd\64\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7o\2\2\u0101\u0102\7r\2\2\u0102\u0103\7n\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7u\2\2\u0107\66\3\2\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7q\2\2\u010a\u010b\7o\2\2\u010b\u010c\7r\2\2"+
		"\u010c\u010d\7q\2\2\u010d\u010e\7u\2\2\u010e\u010f\7g\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\3\2\2\2\u0111\u0112\b\31\7\2\u01128\3\2\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7f\2\2\u0116:\3\2\2\2\u0117"+
		"\u0118\7%\2\2\u0118<\3\2\2\2\u0119\u011a\7&\2\2\u011a>\3\2\2\2\u011b\u011c"+
		"\7\60\2\2\u011c\u011d\7\60\2\2\u011d@\3\2\2\2\u011e\u011f\t\3\2\2\u011f"+
		"B\3\2\2\2\u0120\u0125\t\4\2\2\u0121\u0122\7o\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0125\7f\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0125D\3\2\2\2\u0126"+
		"\u0127\7\62\2\2\u0127F\3\2\2\2\u0128\u012a\7/\2\2\u0129\u0128\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\t\5\2\2\u012c\u012e"+
		"\5I\"\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012eH\3\2\2\2\u012f\u0131"+
		"\t\6\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133J\3\2\2\2\u0134\u0135\7)\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b#\b\2\u0137L\3\2\2\2\u0138\u013c\5O%\2\u0139\u013b\5Q&\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013dN\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\t\7\2\2\u0140P\3\2"+
		"\2\2\u0141\u0144\5O%\2\u0142\u0144\t\b\2\2\u0143\u0141\3\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144R\3\2\2\2\u0145\u0147\t\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\b\'\2\2\u014bT\3\2\2\2\u014c\u014d\7&\2\2\u014d\u014e"+
		"\7*\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b(\4\2\u0150V\3\2\2\2\u0151\u0152"+
		"\7&\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b)\t\2\u0154X\3\2\2\2\u0155\u0157"+
		"\5[+\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159Z\3\2\2\2\u015a\u015b\7)\2\2\u015b\u0160\7)\2\2\u015c"+
		"\u015d\7&\2\2\u015d\u0160\7&\2\2\u015e\u0160\n\t\2\2\u015f\u015a\3\2\2"+
		"\2\u015f\u015c\3\2\2\2\u015f\u015e\3\2\2\2\u0160\\\3\2\2\2\u0161\u0162"+
		"\7)\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b,\5\2\u0164^\3\2\2\2\u0165\u0166"+
		"\7=\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b-\5\2\u0168`\3\2\2\2\u0169\u016a"+
		"\7*\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b.\4\2\u016cb\3\2\2\2\u016d\u016e"+
		"\5M$\2\u016ed\3\2\2\2\u016f\u0170\5\25\b\2\u0170f\3\2\2\2\u0171\u0172"+
		"\7~\2\2\u0172h\3\2\2\2\u0173\u0174\7.\2\2\u0174j\3\2\2\2\u0175\u0176\7"+
		">\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\63\6\2\u0178l\3\2\2\2\u0179\u017a"+
		"\7@\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b\64\5\2\u017cn\3\2\2\2\u017d"+
		"\u017e\7\u0080\2\2\u017ep\3\2\2\2\u017f\u0180\7A\2\2\u0180\u0181\7*\2"+
		"\2\u0181\u0182\3\2\2\2\u0182\u0183\b\66\4\2\u0183r\3\2\2\2\u0184\u0187"+
		"\5E \2\u0185\u0187\5G!\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"t\3\2\2\2\u0188\u0189\5?\35\2\u0189v\3\2\2\2\u018a\u018b\7)\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\b9\b\2\u018dx\3\2\2\2\u018e\u018f\5-\24\2\u018f"+
		"z\3\2\2\2\u0190\u0191\5/\25\2\u0191|\3\2\2\2\u0192\u0193\5)\22\2\u0193"+
		"~\3\2\2\2\u0194\u0195\5+\23\2\u0195\u0080\3\2\2\2\u0196\u0197\5\61\26"+
		"\2\u0197\u0082\3\2\2\2\u0198\u019e\5=\34\2\u0199\u019b\5\35\f\2\u019a"+
		"\u019c\5M$\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2\2"+
		"\2\u019d\u019f\5M$\2\u019e\u0199\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u0084"+
		"\3\2\2\2\u01a0\u01a1\7*\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\b@\4\2\u01a3"+
		"\u0086\3\2\2\2\u01a4\u01a5\5\25\b\2\u01a5\u0088\3\2\2\2\u01a6\u01a7\5"+
		"S\'\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\bB\2\2\u01a9\u008a\3\2\2\2\u01aa"+
		"\u01ac\n\n\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b2\t\13\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b"+
		"C\2\2\u01b4\u01b5\bC\5\2\u01b5\u008c\3\2\2\2\u01b6\u01b7\7g\2\2\u01b7"+
		"\u01b8\7p\2\2\u01b8\u01b9\7f\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bD\5"+
		"\2\u01bb\u008e\3\2\2\2\u01bc\u01bd\7>\2\2\u01bd\u0090\3\2\2\2\u01be\u01bf"+
		"\7@\2\2\u01bf\u0092\3\2\2\2\u01c0\u01c1\7A\2\2\u01c1\u0094\3\2\2\2\u01c2"+
		"\u01c3\7)\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\bH\n\2\u01c5\u0096\3\2\2"+
		"\2\u01c6\u01c7\7*\2\2\u01c7\u0098\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9\u009a"+
		"\3\2\2\2\u01ca\u01cb\7]\2\2\u01cb\u009c\3\2\2\2\u01cc\u01cd\7_\2\2\u01cd"+
		"\u009e\3\2\2\2\u01ce\u01cf\5M$\2\u01cf\u00a0\3\2\2\2\u01d0\u01d1\5S\'"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\bN\2\2\u01d3\u00a2\3\2\2\2\u01d4\u01d6"+
		"\5\u00a5P\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8\u00a4\3\2\2\2\u01d9\u01da\7)\2\2\u01da\u01dd"+
		"\7)\2\2\u01db\u01dd\n\f\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u00a6\3\2\2\2\u01de\u01df\7)\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\bQ\5"+
		"\2\u01e1\u00a8\3\2\2\2\33\2\3\4\5\6\7\b\u00c5\u00c8\u0124\u0129\u012d"+
		"\u0132\u013c\u0143\u0148\u0158\u015f\u0186\u019b\u019e\u01ad\u01b1\u01d7"+
		"\u01dc\13\b\2\2\7\6\2\7\2\2\6\2\2\7\5\2\7\7\2\7\3\2\7\4\2\7\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}