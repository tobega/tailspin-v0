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
		StartComment=1, Stdout=2, Stdin=3, Void=4, Def=5, To=6, ResultMarker=7, 
		At=8, NamedAt=9, Colon=10, Key=11, Message=12, FieldDereference=13, EndStringInterpolate=14, 
		SemiColon=15, Comma=16, Deconstructor=17, Invert=18, LeftParen=19, RightParen=20, 
		LeftBracket=21, RightBracket=22, LeftBrace=23, RightBrace=24, StartMatcher=25, 
		StartTemplatesDefinition=26, StartComposerDefinition=27, StartProcessorDefinition=28, 
		EndDefinition=29, TemplateMatch=30, Dereference=31, Range=32, AdditiveOperator=33, 
		MultiplicativeOperator=34, Zero=35, PositiveInteger=36, START_STRING=37, 
		IDENTIFIER=38, WS=39, Else=40, EndMatcher=41, BeginSuchThat=42, Comment=43, 
		ComposerEndDefinition=44, StartComposerMatch=45, EndComposerMatch=46, 
		InvertComposerMatch=47, SequenceKey=48, ValueSeparator=49, Multiplier=50, 
		CountMultiplier=51, ComposeInteger=52, START_REGEX=53, StartSkipRule=54, 
		EndSkipRule=55, StartBuildArray=56, EndBuildArray=57, StartBuildStructure=58, 
		EndBuildStructure=59, KeySeparator=60, ComposerDef=61, ComposeDereference=62, 
		ComposerId=63, ComposerIgnoreWS=64, REGEX_TEXT=65, END_REGEX=66, StartStringEvaluate=67, 
		STRING_TEXT=68, END_STRING=69;
	public static final int
		COMMENT_MODE=1, COMPOSER=2, IN_REGEX=3, IN_STRING=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "COMPOSER", "IN_REGEX", "IN_STRING"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "NamedAt", "Colon", "Key", "Message", "FieldDereference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "TemplateMatch", "Dereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "PositiveInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Else", "EndMatcher", 
			"BeginSuchThat", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "ValueSeparator", 
			"Multiplier", "CountMultiplier", "ComposeInteger", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "StartBuildStructure", 
			"EndBuildStructure", "KeySeparator", "ComposerDef", "ComposeDereference", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartStringEvaluate", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, null, null, null, null, null, "';'", "','", "'...'", null, null, 
			null, null, null, null, null, null, "'templates'", "'composer'", "'processor'", 
			null, "'#'", null, "'..'", null, null, "'0'", null, null, null, null, 
			"'|'", null, "'?('", null, null, null, null, null, null, null, null, 
			"'='", null, null, null, null, null, null, null, null, null, "'def'", 
			null, null, null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "NamedAt", "Colon", "Key", "Message", "FieldDereference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "TemplateMatch", "Dereference", "Range", "AdditiveOperator", 
			"MultiplicativeOperator", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", 
			"SequenceKey", "ValueSeparator", "Multiplier", "CountMultiplier", "ComposeInteger", 
			"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
			"StartBuildStructure", "EndBuildStructure", "KeySeparator", "ComposerDef", 
			"ComposeDereference", "ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", 
			"END_REGEX", "StartStringEvaluate", "STRING_TEXT", "END_STRING"
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


	  int stringInterpolate = 0;


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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EndStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			stringInterpolate--;
			break;
		}
	}
	private void StartStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 stringInterpolate++; 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return EndStringInterpolate_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EndStringInterpolate_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return stringInterpolate > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01c6\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \5 \u011c\n \3"+
		" \5 \u011f\n \3!\3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u012a\n#\3$\3$\3%\3%\5%"+
		"\u0130\n%\3&\6&\u0133\n&\r&\16&\u0134\3\'\3\'\3\'\3\'\3(\3(\7(\u013d\n"+
		"(\f(\16(\u0140\13(\3)\3)\3*\3*\5*\u0146\n*\3+\6+\u0149\n+\r+\16+\u014a"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3/\7/\u0159\n/\f/\16/\u015c\13/\3/\5"+
		"/\u015f\n/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\3B\3B\3B\5B\u0193"+
		"\nB\3B\5B\u0196\nB\3C\3C\3D\3D\3D\3D\3E\6E\u019f\nE\rE\16E\u01a0\3F\3"+
		"F\3F\5F\u01a6\nF\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\6J\u01b8"+
		"\nJ\rJ\16J\u01b9\3K\3K\3K\3K\3K\5K\u01c1\nK\3L\3L\3L\3L\2\2M\7\3\t\4\13"+
		"\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\2Q\'S(U\2W\2Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:}"+
		";\177<\u0081=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008f\2\u0091"+
		"D\u0093E\u0095\2\u0097F\u0099\2\u009bG\7\2\3\4\5\6\16\5\2\13\f\17\17\""+
		"\"\4\2--//\4\2,,\61\61\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\3\2\f\f\3\3"+
		"\f\f\4\2,-AA\3\2))\4\2&&))\2\u01cc\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\4c\3\2\2\2\4e\3\2"+
		"\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o\3\2\2\2\4q\3\2\2\2"+
		"\4s\3\2\2\2\4u\3\2\2\2\4w\3\2\2\2\4y\3\2\2\2\4{\3\2\2\2\4}\3\2\2\2\4\177"+
		"\3\2\2\2\4\u0081\3\2\2\2\4\u0083\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2"+
		"\2\4\u0089\3\2\2\2\4\u008b\3\2\2\2\5\u008d\3\2\2\2\5\u0091\3\2\2\2\6\u0093"+
		"\3\2\2\2\6\u0095\3\2\2\2\6\u0097\3\2\2\2\6\u009b\3\2\2\2\7\u009d\3\2\2"+
		"\2\t\u00a3\3\2\2\2\13\u00aa\3\2\2\2\r\u00b0\3\2\2\2\17\u00b5\3\2\2\2\21"+
		"\u00bb\3\2\2\2\23\u00be\3\2\2\2\25\u00c0\3\2\2\2\27\u00c2\3\2\2\2\31\u00c5"+
		"\3\2\2\2\33\u00c7\3\2\2\2\35\u00ca\3\2\2\2\37\u00cf\3\2\2\2!\u00d2\3\2"+
		"\2\2#\u00d8\3\2\2\2%\u00da\3\2\2\2\'\u00dc\3\2\2\2)\u00e0\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e6\3\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2\63\u00ee\3\2\2"+
		"\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00fe\3\2\2\2=\u0109"+
		"\3\2\2\2?\u0113\3\2\2\2A\u0117\3\2\2\2C\u0119\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0129\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2\2\2O\u0132\3\2"+
		"\2\2Q\u0136\3\2\2\2S\u013a\3\2\2\2U\u0141\3\2\2\2W\u0145\3\2\2\2Y\u0148"+
		"\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_\u0152\3\2\2\2a\u015a\3\2\2\2c"+
		"\u0163\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2\2\2i\u016d\3\2\2\2k\u016f\3\2"+
		"\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0175\3\2\2\2s\u0177\3\2\2\2u\u0179"+
		"\3\2\2\2w\u017d\3\2\2\2y\u017f\3\2\2\2{\u0181\3\2\2\2}\u0183\3\2\2\2\177"+
		"\u0185\3\2\2\2\u0081\u0187\3\2\2\2\u0083\u0189\3\2\2\2\u0085\u018b\3\2"+
		"\2\2\u0087\u018f\3\2\2\2\u0089\u0197\3\2\2\2\u008b\u0199\3\2\2\2\u008d"+
		"\u019e\3\2\2\2\u008f\u01a5\3\2\2\2\u0091\u01a7\3\2\2\2\u0093\u01ab\3\2"+
		"\2\2\u0095\u01b0\3\2\2\2\u0097\u01b7\3\2\2\2\u0099\u01c0\3\2\2\2\u009b"+
		"\u01c2\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\b\2\2\2\u00a1\u00a2\b\2\3\2\u00a2\b\3\2\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7q\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00a9\7v\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\f\3\2\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7k"+
		"\2\2\u00b3\u00b4\7f\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7"+
		"\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba"+
		"\20\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\u00bd\7@\2\2\u00bd\22\3\2\2\2\u00be"+
		"\u00bf\7#\2\2\u00bf\24\3\2\2\2\u00c0\u00c1\7B\2\2\u00c1\26\3\2\2\2\u00c2"+
		"\u00c3\7B\2\2\u00c3\u00c4\5S(\2\u00c4\30\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6"+
		"\32\3\2\2\2\u00c7\u00c8\5S(\2\u00c8\u00c9\7<\2\2\u00c9\34\3\2\2\2\u00ca"+
		"\u00cb\7<\2\2\u00cb\u00cc\7<\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5S(\2"+
		"\u00ce\36\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\5S(\2\u00d1 \3\2\2"+
		"\2\u00d2\u00d3\7=\2\2\u00d3\u00d4\6\17\2\2\u00d4\u00d5\b\17\4\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\b\17\5\2\u00d7\"\3\2\2\2\u00d8\u00d9\7=\2\2"+
		"\u00d9$\3\2\2\2\u00da\u00db\7.\2\2\u00db&\3\2\2\2\u00dc\u00dd\7\60\2\2"+
		"\u00dd\u00de\7\60\2\2\u00de\u00df\7\60\2\2\u00df(\3\2\2\2\u00e0\u00e1"+
		"\7\u0080\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\24\6\2\u00e5,\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\b\25\5\2\u00e9.\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb\60\3\2\2"+
		"\2\u00ec\u00ed\7_\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef\64\3\2"+
		"\2\2\u00f0\u00f1\7\177\2\2\u00f1\66\3\2\2\2\u00f2\u00f3\7>\2\2\u00f38"+
		"\3\2\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7o\2\2\u00f7"+
		"\u00f8\7r\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\u00fc\7g\2\2\u00fc\u00fd\7u\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7e\2"+
		"\2\u00ff\u0100\7q\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\u0106\7t\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\b\34\7\2\u0108<\3\2\2\2\u0109\u010a\7r\2\2"+
		"\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010d\7e\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u010f\7u\2\2\u010f\u0110\7u\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7t\2\2\u0112>\3\2\2\2\u0113\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7f\2\2\u0116@\3\2\2\2\u0117\u0118\7%\2\2\u0118B\3\2\2\2\u0119\u011b"+
		"\7&\2\2\u011a\u011c\5\25\t\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011f\5S(\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2"+
		"\2\u011fD\3\2\2\2\u0120\u0121\7\60\2\2\u0121\u0122\7\60\2\2\u0122F\3\2"+
		"\2\2\u0123\u0124\t\3\2\2\u0124H\3\2\2\2\u0125\u012a\t\4\2\2\u0126\u0127"+
		"\7o\2\2\u0127\u0128\7q\2\2\u0128\u012a\7f\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u0126\3\2\2\2\u012aJ\3\2\2\2\u012b\u012c\7\62\2\2\u012cL\3\2\2\2\u012d"+
		"\u012f\t\5\2\2\u012e\u0130\5O&\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130N\3\2\2\2\u0131\u0133\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135P\3\2\2\2\u0136"+
		"\u0137\7)\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\'\b\2\u0139R\3\2\2\2\u013a"+
		"\u013e\5U)\2\u013b\u013d\5W*\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fT\3\2\2\2\u0140\u013e\3"+
		"\2\2\2\u0141\u0142\t\7\2\2\u0142V\3\2\2\2\u0143\u0146\5U)\2\u0144\u0146"+
		"\t\b\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146X\3\2\2\2\u0147"+
		"\u0149\t\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b+\2\2\u014d"+
		"Z\3\2\2\2\u014e\u014f\7~\2\2\u014f\\\3\2\2\2\u0150\u0151\7@\2\2\u0151"+
		"^\3\2\2\2\u0152\u0153\7A\2\2\u0153\u0154\7*\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b.\6\2\u0156`\3\2\2\2\u0157\u0159\n\t\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u015f\t\n\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\b/\2\2\u0161\u0162\b/\5\2\u0162b\3\2\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7p\2\2\u0165\u0166\7f\2\2\u0166\u0167\3\2\2"+
		"\2\u0167\u0168\b\60\5\2\u0168d\3\2\2\2\u0169\u016a\7>\2\2\u016af\3\2\2"+
		"\2\u016b\u016c\7@\2\2\u016ch\3\2\2\2\u016d\u016e\7\u0080\2\2\u016ej\3"+
		"\2\2\2\u016f\u0170\5\33\f\2\u0170l\3\2\2\2\u0171\u0172\5%\21\2\u0172n"+
		"\3\2\2\2\u0173\u0174\t\13\2\2\u0174p\3\2\2\2\u0175\u0176\7?\2\2\u0176"+
		"r\3\2\2\2\u0177\u0178\5M%\2\u0178t\3\2\2\2\u0179\u017a\7)\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\b9\t\2\u017cv\3\2\2\2\u017d\u017e\7*\2\2\u017ex\3"+
		"\2\2\2\u017f\u0180\7+\2\2\u0180z\3\2\2\2\u0181\u0182\7]\2\2\u0182|\3\2"+
		"\2\2\u0183\u0184\7_\2\2\u0184~\3\2\2\2\u0185\u0186\7}\2\2\u0186\u0080"+
		"\3\2\2\2\u0187\u0188\7\177\2\2\u0188\u0082\3\2\2\2\u0189\u018a\7<\2\2"+
		"\u018a\u0084\3\2\2\2\u018b\u018c\7f\2\2\u018c\u018d\7g\2\2\u018d\u018e"+
		"\7h\2\2\u018e\u0086\3\2\2\2\u018f\u0195\7&\2\2\u0190\u0192\5\25\t\2\u0191"+
		"\u0193\5S(\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2"+
		"\2\u0194\u0196\5S(\2\u0195\u0190\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0088"+
		"\3\2\2\2\u0197\u0198\5S(\2\u0198\u008a\3\2\2\2\u0199\u019a\5Y+\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\bD\2\2\u019c\u008c\3\2\2\2\u019d\u019f\5\u008f"+
		"F\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u008e\3\2\2\2\u01a2\u01a3\7)\2\2\u01a3\u01a6\7)\2"+
		"\2\u01a4\u01a6\n\f\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u0090"+
		"\3\2\2\2\u01a7\u01a8\7)\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\bG\5\2\u01aa"+
		"\u0092\3\2\2\2\u01ab\u01ac\7&\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae\3\2\2"+
		"\2\u01ae\u01af\bH\6\2\u01af\u0094\3\2\2\2\u01b0\u01b1\5C \2\u01b1\u01b2"+
		"\bI\n\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\bI\6\2\u01b4\u01b5\bI\13\2\u01b5"+
		"\u0096\3\2\2\2\u01b6\u01b8\5\u0099K\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u0098\3\2\2\2\u01bb"+
		"\u01bc\7)\2\2\u01bc\u01c1\7)\2\2\u01bd\u01be\7&\2\2\u01be\u01c1\7&\2\2"+
		"\u01bf\u01c1\n\r\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01bf"+
		"\3\2\2\2\u01c1\u009a\3\2\2\2\u01c2\u01c3\7)\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\bL\5\2\u01c5\u009c\3\2\2\2\27\2\3\4\5\6\u011b\u011e\u0129\u012f"+
		"\u0134\u013e\u0145\u014a\u015a\u015e\u0192\u0195\u01a0\u01a5\u01b9\u01c0"+
		"\f\b\2\2\7\3\2\3\17\2\6\2\2\7\2\2\7\4\2\7\6\2\7\5\2\3I\3\t!\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}