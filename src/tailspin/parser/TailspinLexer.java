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
		InvertComposerMatch=66, SequenceKey=67, Optional=68, START_REGEX=69, StartSkipRule=70, 
		EndSkipRule=71, StartBuildArray=72, EndBuildArray=73, ComposerId=74, ComposerIgnoreWS=75, 
		REGEX_TEXT=76, END_REGEX=77;
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
		"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "Optional", 
		"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
		"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'stdout'", "'stdin'", null, null, null, null, null, "'->'", 
		"'!'", "':'", null, null, "'...'", null, null, null, null, "'{'", "'}'", 
		null, null, "'templates'", "'composer'", null, "'#'", null, "'..'", null, 
		null, "'0'", null, null, null, null, "'$('", null, null, null, null, null, 
		null, null, "'|'", null, null, null, null, "'?('", null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'?'"
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
		"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "Optional", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u01ea\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00ca\n"+
		"\6\3\6\5\6\u00cd\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0129\n\37\3 \3 \3!\5!\u012e\n!\3"+
		"!\3!\5!\u0132\n!\3\"\6\"\u0135\n\"\r\"\16\"\u0136\3#\3#\3#\3#\3$\3$\7"+
		"$\u013f\n$\f$\16$\u0142\13$\3%\3%\3&\3&\5&\u0148\n&\3\'\6\'\u014b\n\'"+
		"\r\'\16\'\u014c\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\6*\u015b\n*\r*\16"+
		"*\u015c\3+\3+\3+\3+\3+\5+\u0164\n+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\5\67\u018b\n\67"+
		"\38\38\39\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\5?\u01a0\n?"+
		"\3?\5?\u01a3\n?\3@\3@\3@\3@\3A\3A\3B\3B\3B\3B\3C\7C\u01b0\nC\fC\16C\u01b3"+
		"\13C\3C\5C\u01b6\nC\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3"+
		"H\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3P\3Q\6Q\u01de"+
		"\nQ\rQ\16Q\u01df\3R\3R\3R\5R\u01e5\nR\3S\3S\3S\3S\2\2T\t\3\13\4\r\5\17"+
		"\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24"+
		"-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I\2K#M$O\2"+
		"Q\2S%U&W\'Y([\2])_*a+c,e-g.i/k\60m\61o\62q\63s\64u\65w\66y\67{8}9\177"+
		":\u0081;\u0083<\u0085=\u0087>\u0089?\u008b@\u008dA\u008fB\u0091C\u0093"+
		"D\u0095E\u0097F\u0099G\u009bH\u009dI\u009fJ\u00a1K\u00a3L\u00a5M\u00a7"+
		"N\u00a9\2\u00abO\t\2\3\4\5\6\7\b\r\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61"+
		"\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\3\2\f\f\3\3\f\f\3\2))\2"+
		"\u01f0\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3"+
		"\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3]\3\2\2\2\4_\3\2\2\2\4a\3\2\2"+
		"\2\4c\3\2\2\2\4e\3\2\2\2\5g\3\2\2\2\5i\3\2\2\2\5k\3\2\2\2\5m\3\2\2\2\5"+
		"o\3\2\2\2\5q\3\2\2\2\5s\3\2\2\2\5u\3\2\2\2\5w\3\2\2\2\5y\3\2\2\2\5{\3"+
		"\2\2\2\5}\3\2\2\2\5\177\3\2\2\2\5\u0081\3\2\2\2\5\u0083\3\2\2\2\5\u0085"+
		"\3\2\2\2\5\u0087\3\2\2\2\5\u0089\3\2\2\2\6\u008b\3\2\2\2\7\u008d\3\2\2"+
		"\2\7\u008f\3\2\2\2\7\u0091\3\2\2\2\7\u0093\3\2\2\2\7\u0095\3\2\2\2\7\u0097"+
		"\3\2\2\2\7\u0099\3\2\2\2\7\u009b\3\2\2\2\7\u009d\3\2\2\2\7\u009f\3\2\2"+
		"\2\7\u00a1\3\2\2\2\7\u00a3\3\2\2\2\7\u00a5\3\2\2\2\b\u00a7\3\2\2\2\b\u00ab"+
		"\3\2\2\2\t\u00ad\3\2\2\2\13\u00b3\3\2\2\2\r\u00ba\3\2\2\2\17\u00c0\3\2"+
		"\2\2\21\u00c6\3\2\2\2\23\u00ce\3\2\2\2\25\u00d3\3\2\2\2\27\u00d6\3\2\2"+
		"\2\31\u00dc\3\2\2\2\33\u00df\3\2\2\2\35\u00e1\3\2\2\2\37\u00e3\3\2\2\2"+
		"!\u00e5\3\2\2\2#\u00e7\3\2\2\2%\u00eb\3\2\2\2\'\u00ef\3\2\2\2)\u00f3\3"+
		"\2\2\2+\u00f5\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61\u00fb\3\2\2\2\63"+
		"\u00fe\3\2\2\2\65\u0102\3\2\2\2\67\u010c\3\2\2\29\u0117\3\2\2\2;\u011b"+
		"\3\2\2\2=\u011d\3\2\2\2?\u011f\3\2\2\2A\u0122\3\2\2\2C\u0128\3\2\2\2E"+
		"\u012a\3\2\2\2G\u012d\3\2\2\2I\u0134\3\2\2\2K\u0138\3\2\2\2M\u013c\3\2"+
		"\2\2O\u0143\3\2\2\2Q\u0147\3\2\2\2S\u014a\3\2\2\2U\u0150\3\2\2\2W\u0155"+
		"\3\2\2\2Y\u015a\3\2\2\2[\u0163\3\2\2\2]\u0165\3\2\2\2_\u0169\3\2\2\2a"+
		"\u016d\3\2\2\2c\u0171\3\2\2\2e\u0173\3\2\2\2g\u0175\3\2\2\2i\u0177\3\2"+
		"\2\2k\u0179\3\2\2\2m\u017d\3\2\2\2o\u0181\3\2\2\2q\u0183\3\2\2\2s\u018a"+
		"\3\2\2\2u\u018c\3\2\2\2w\u018e\3\2\2\2y\u0192\3\2\2\2{\u0194\3\2\2\2}"+
		"\u0196\3\2\2\2\177\u0198\3\2\2\2\u0081\u019a\3\2\2\2\u0083\u019c\3\2\2"+
		"\2\u0085\u01a4\3\2\2\2\u0087\u01a8\3\2\2\2\u0089\u01aa\3\2\2\2\u008b\u01b1"+
		"\3\2\2\2\u008d\u01ba\3\2\2\2\u008f\u01c0\3\2\2\2\u0091\u01c2\3\2\2\2\u0093"+
		"\u01c4\3\2\2\2\u0095\u01c6\3\2\2\2\u0097\u01c8\3\2\2\2\u0099\u01ca\3\2"+
		"\2\2\u009b\u01ce\3\2\2\2\u009d\u01d0\3\2\2\2\u009f\u01d2\3\2\2\2\u00a1"+
		"\u01d4\3\2\2\2\u00a3\u01d6\3\2\2\2\u00a5\u01d8\3\2\2\2\u00a7\u01dd\3\2"+
		"\2\2\u00a9\u01e4\3\2\2\2\u00ab\u01e6\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\2\2\2\u00b1\u00b2\b"+
		"\2\3\2\u00b2\n\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6"+
		"\7f\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\f\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7f\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\t\2\2"+
		"\2\u00c5\20\3\2\2\2\u00c6\u00cc\5=\34\2\u00c7\u00c9\5\35\f\2\u00c8\u00ca"+
		"\5M$\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00cd\5M$\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\22\3\2\2\2"+
		"\u00ce\u00cf\5\21\6\2\u00cf\u00d0\5%\20\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\b\7\4\2\u00d2\24\3\2\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\5M$\2\u00d5"+
		"\26\3\2\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\5M$\2\u00d8\u00d9\5%\20\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\b\t\4\2\u00db\30\3\2\2\2\u00dc\u00dd"+
		"\7/\2\2\u00dd\u00de\7@\2\2\u00de\32\3\2\2\2\u00df\u00e0\7#\2\2\u00e0\34"+
		"\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4"+
		" \3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7\60\2\2\u00e8"+
		"\u00e9\7\60\2\2\u00e9\u00ea\7\60\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7*\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\20\4\2\u00ee&\3\2\2\2\u00ef\u00f0\7"+
		"+\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\21\5\2\u00f2(\3\2\2\2\u00f3\u00f4"+
		"\7]\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7_\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7"+
		"}\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7\177\2\2\u00fa\60\3\2\2\2\u00fb\u00fc"+
		"\5M$\2\u00fc\u00fd\5\35\f\2\u00fd\62\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\b\27\6\2\u0101\64\3\2\2\2\u0102\u0103\7v\2"+
		"\2\u0103\u0104\7g\2\2\u0104\u0105\7o\2\2\u0105\u0106\7r\2\2\u0106\u0107"+
		"\7n\2\2\u0107\u0108\7c\2\2\u0108\u0109\7v\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7u\2\2\u010b\66\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e"+
		"\u010f\7o\2\2\u010f\u0110\7r\2\2\u0110\u0111\7q\2\2\u0111\u0112\7u\2\2"+
		"\u0112\u0113\7g\2\2\u0113\u0114\7t\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\b\31\7\2\u01168\3\2\2\2\u0117\u0118\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a"+
		"\7f\2\2\u011a:\3\2\2\2\u011b\u011c\7%\2\2\u011c<\3\2\2\2\u011d\u011e\7"+
		"&\2\2\u011e>\3\2\2\2\u011f\u0120\7\60\2\2\u0120\u0121\7\60\2\2\u0121@"+
		"\3\2\2\2\u0122\u0123\t\3\2\2\u0123B\3\2\2\2\u0124\u0129\t\4\2\2\u0125"+
		"\u0126\7o\2\2\u0126\u0127\7q\2\2\u0127\u0129\7f\2\2\u0128\u0124\3\2\2"+
		"\2\u0128\u0125\3\2\2\2\u0129D\3\2\2\2\u012a\u012b\7\62\2\2\u012bF\3\2"+
		"\2\2\u012c\u012e\7/\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\t\5\2\2\u0130\u0132\5I\"\2\u0131\u0130\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132H\3\2\2\2\u0133\u0135\t\6\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"J\3\2\2\2\u0138\u0139\7)\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b#\b\2\u013b"+
		"L\3\2\2\2\u013c\u0140\5O%\2\u013d\u013f\5Q&\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141N\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0144\t\7\2\2\u0144P\3\2\2\2\u0145\u0148\5"+
		"O%\2\u0146\u0148\t\b\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"R\3\2\2\2\u0149\u014b\t\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f"+
		"\b\'\2\2\u014fT\3\2\2\2\u0150\u0151\7&\2\2\u0151\u0152\7*\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0154\b(\4\2\u0154V\3\2\2\2\u0155\u0156\7&\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\b)\t\2\u0158X\3\2\2\2\u0159\u015b\5[+\2\u015a\u0159"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"Z\3\2\2\2\u015e\u015f\7)\2\2\u015f\u0164\7)\2\2\u0160\u0161\7&\2\2\u0161"+
		"\u0164\7&\2\2\u0162\u0164\n\t\2\2\u0163\u015e\3\2\2\2\u0163\u0160\3\2"+
		"\2\2\u0163\u0162\3\2\2\2\u0164\\\3\2\2\2\u0165\u0166\7)\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\b,\5\2\u0168^\3\2\2\2\u0169\u016a\7=\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016c\b-\5\2\u016c`\3\2\2\2\u016d\u016e\7*\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\b.\4\2\u0170b\3\2\2\2\u0171\u0172\5M$\2\u0172d\3"+
		"\2\2\2\u0173\u0174\5\25\b\2\u0174f\3\2\2\2\u0175\u0176\7~\2\2\u0176h\3"+
		"\2\2\2\u0177\u0178\7.\2\2\u0178j\3\2\2\2\u0179\u017a\7>\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\b\63\6\2\u017cl\3\2\2\2\u017d\u017e\7@\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\b\64\5\2\u0180n\3\2\2\2\u0181\u0182\7\u0080"+
		"\2\2\u0182p\3\2\2\2\u0183\u0184\7A\2\2\u0184\u0185\7*\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\b\66\4\2\u0187r\3\2\2\2\u0188\u018b\5E \2\u0189\u018b"+
		"\5G!\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018bt\3\2\2\2\u018c\u018d"+
		"\5?\35\2\u018dv\3\2\2\2\u018e\u018f\7)\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\b9\b\2\u0191x\3\2\2\2\u0192\u0193\5-\24\2\u0193z\3\2\2\2\u0194\u0195"+
		"\5/\25\2\u0195|\3\2\2\2\u0196\u0197\5)\22\2\u0197~\3\2\2\2\u0198\u0199"+
		"\5+\23\2\u0199\u0080\3\2\2\2\u019a\u019b\5\61\26\2\u019b\u0082\3\2\2\2"+
		"\u019c\u01a2\5=\34\2\u019d\u019f\5\35\f\2\u019e\u01a0\5M$\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\5M$\2\u01a2"+
		"\u019d\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u0084\3\2\2\2\u01a4\u01a5\7*"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\b@\4\2\u01a7\u0086\3\2\2\2\u01a8"+
		"\u01a9\5\25\b\2\u01a9\u0088\3\2\2\2\u01aa\u01ab\5S\'\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\bB\2\2\u01ad\u008a\3\2\2\2\u01ae\u01b0\n\n\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\t\13\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\bC\2\2\u01b8\u01b9\bC\5"+
		"\2\u01b9\u008c\3\2\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd"+
		"\7f\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\bD\5\2\u01bf\u008e\3\2\2\2\u01c0"+
		"\u01c1\7>\2\2\u01c1\u0090\3\2\2\2\u01c2\u01c3\7@\2\2\u01c3\u0092\3\2\2"+
		"\2\u01c4\u01c5\7\u0080\2\2\u01c5\u0094\3\2\2\2\u01c6\u01c7\5\61\26\2\u01c7"+
		"\u0096\3\2\2\2\u01c8\u01c9\7A\2\2\u01c9\u0098\3\2\2\2\u01ca\u01cb\7)\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\bJ\n\2\u01cd\u009a\3\2\2\2\u01ce\u01cf"+
		"\7*\2\2\u01cf\u009c\3\2\2\2\u01d0\u01d1\7+\2\2\u01d1\u009e\3\2\2\2\u01d2"+
		"\u01d3\7]\2\2\u01d3\u00a0\3\2\2\2\u01d4\u01d5\7_\2\2\u01d5\u00a2\3\2\2"+
		"\2\u01d6\u01d7\5M$\2\u01d7\u00a4\3\2\2\2\u01d8\u01d9\5S\'\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\bP\2\2\u01db\u00a6\3\2\2\2\u01dc\u01de\5\u00a9R\2"+
		"\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u00a8\3\2\2\2\u01e1\u01e2\7)\2\2\u01e2\u01e5\7)\2\2\u01e3"+
		"\u01e5\n\f\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u00aa\3\2"+
		"\2\2\u01e6\u01e7\7)\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\bS\5\2\u01e9\u00ac"+
		"\3\2\2\2\33\2\3\4\5\6\7\b\u00c9\u00cc\u0128\u012d\u0131\u0136\u0140\u0147"+
		"\u014c\u015c\u0163\u018a\u019f\u01a2\u01b1\u01b5\u01df\u01e4\13\b\2\2"+
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