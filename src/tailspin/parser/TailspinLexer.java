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
		At=8, Colon=9, DoubleColon=10, Dot=11, EndStringInterpolate=12, SemiColon=13, 
		Comma=14, Deconstructor=15, Invert=16, LeftParen=17, RightParen=18, LeftBracket=19, 
		RightBracket=20, LeftBrace=21, RightBrace=22, StartMatcher=23, StartTemplatesDefinition=24, 
		StartComposerDefinition=25, StartProcessorDefinition=26, EndDefinition=27, 
		TemplateMatch=28, StartDereference=29, Range=30, AdditiveOperator=31, 
		MultiplicativeOperator=32, Zero=33, PositiveInteger=34, START_STRING=35, 
		IDENTIFIER=36, WS=37, Else=38, EndMatcher=39, BeginSuchThat=40, Comment=41, 
		ComposerEndDefinition=42, StartComposerMatch=43, EndComposerMatch=44, 
		InvertComposerMatch=45, SequenceKey=46, ValueSeparator=47, Multiplier=48, 
		CountMultiplier=49, ComposeInteger=50, START_REGEX=51, StartSkipRule=52, 
		EndSkipRule=53, StartBuildArray=54, EndBuildArray=55, StartBuildStructure=56, 
		EndBuildStructure=57, KeySeparator=58, ComposerDef=59, ComposeDereference=60, 
		ComposerId=61, ComposerIgnoreWS=62, REGEX_TEXT=63, END_REGEX=64, StartStringEvaluate=65, 
		STRING_TEXT=66, END_STRING=67;
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
			"At", "Colon", "DoubleColon", "Dot", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "PositiveInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"ComposerEndDefinition", "StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", 
			"SequenceKey", "ValueSeparator", "Multiplier", "CountMultiplier", "ComposeInteger", 
			"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
			"StartBuildStructure", "EndBuildStructure", "KeySeparator", "ComposerDef", 
			"ComposeDereference", "ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", 
			"REGEX_CHAR", "END_REGEX", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, "'::'", "'.'", null, "';'", "','", "'...'", null, null, null, null, 
			null, null, null, null, "'templates'", "'composer'", "'processor'", null, 
			"'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, "'|'", 
			null, "'?('", null, null, null, null, null, null, null, null, "'='", 
			null, null, null, null, null, null, null, null, null, "'def'", null, 
			null, null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "Colon", "DoubleColon", "Dot", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "Else", 
			"EndMatcher", "BeginSuchThat", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "ValueSeparator", 
			"Multiplier", "CountMultiplier", "ComposeInteger", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "StartBuildStructure", 
			"EndBuildStructure", "KeySeparator", "ComposerDef", "ComposeDereference", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX", "StartStringEvaluate", 
			"STRING_TEXT", "END_STRING"
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
		case 11:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
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
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01b5\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u0118\n!\3\"\3\"\3#\3#\5#\u011e"+
		"\n#\3$\6$\u0121\n$\r$\16$\u0122\3%\3%\3%\3%\3&\3&\7&\u012b\n&\f&\16&\u012e"+
		"\13&\3\'\3\'\3(\3(\5(\u0134\n(\3)\6)\u0137\n)\r)\16)\u0138\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3,\3,\3,\3-\7-\u0147\n-\f-\16-\u014a\13-\3-\5-\u014d\n-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3@\5@\u0182\n@\3@\5"+
		"@\u0185\n@\3A\3A\3B\3B\3B\3B\3C\6C\u018e\nC\rC\16C\u018f\3D\3D\3D\5D\u0195"+
		"\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\6H\u01a7\nH\rH\16"+
		"H\u01a8\3I\3I\3I\3I\3I\5I\u01b0\nI\3J\3J\3J\3J\2\2K\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K\2M%O&Q\2"+
		"S\2U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081"+
		"=\u0083>\u0085?\u0087@\u0089A\u008b\2\u008dB\u008fC\u0091\2\u0093D\u0095"+
		"\2\u0097E\7\2\3\4\5\6\16\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63"+
		";\3\2\62;\4\2C\\c|\4\2\62;aa\3\2\f\f\3\3\f\f\4\2,-AA\3\2))\4\2&&))\2\u01b9"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\4_"+
		"\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2"+
		"\2\2\4m\3\2\2\2\4o\3\2\2\2\4q\3\2\2\2\4s\3\2\2\2\4u\3\2\2\2\4w\3\2\2\2"+
		"\4y\3\2\2\2\4{\3\2\2\2\4}\3\2\2\2\4\177\3\2\2\2\4\u0081\3\2\2\2\4\u0083"+
		"\3\2\2\2\4\u0085\3\2\2\2\4\u0087\3\2\2\2\5\u0089\3\2\2\2\5\u008d\3\2\2"+
		"\2\6\u008f\3\2\2\2\6\u0091\3\2\2\2\6\u0093\3\2\2\2\6\u0097\3\2\2\2\7\u0099"+
		"\3\2\2\2\t\u009f\3\2\2\2\13\u00a6\3\2\2\2\r\u00ac\3\2\2\2\17\u00b1\3\2"+
		"\2\2\21\u00b7\3\2\2\2\23\u00ba\3\2\2\2\25\u00bc\3\2\2\2\27\u00be\3\2\2"+
		"\2\31\u00c0\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3\2\2\2\37\u00cb\3\2\2\2"+
		"!\u00cd\3\2\2\2#\u00cf\3\2\2\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00d9\3"+
		"\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63"+
		"\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00f1\3\2\2\29\u00fc\3\2\2\2;\u0106"+
		"\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0117\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K\u0120\3\2\2\2M\u0124\3\2"+
		"\2\2O\u0128\3\2\2\2Q\u012f\3\2\2\2S\u0133\3\2\2\2U\u0136\3\2\2\2W\u013c"+
		"\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0148\3\2\2\2_\u0151\3\2\2\2a"+
		"\u0157\3\2\2\2c\u0159\3\2\2\2e\u015b\3\2\2\2g\u015d\3\2\2\2i\u0160\3\2"+
		"\2\2k\u0162\3\2\2\2m\u0164\3\2\2\2o\u0166\3\2\2\2q\u0168\3\2\2\2s\u016c"+
		"\3\2\2\2u\u016e\3\2\2\2w\u0170\3\2\2\2y\u0172\3\2\2\2{\u0174\3\2\2\2}"+
		"\u0176\3\2\2\2\177\u0178\3\2\2\2\u0081\u017a\3\2\2\2\u0083\u017e\3\2\2"+
		"\2\u0085\u0186\3\2\2\2\u0087\u0188\3\2\2\2\u0089\u018d\3\2\2\2\u008b\u0194"+
		"\3\2\2\2\u008d\u0196\3\2\2\2\u008f\u019a\3\2\2\2\u0091\u019f\3\2\2\2\u0093"+
		"\u01a6\3\2\2\2\u0095\u01af\3\2\2\2\u0097\u01b1\3\2\2\2\u0099\u009a\7\61"+
		"\2\2\u009a\u009b\7\61\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\2\2\2\u009d"+
		"\u009e\b\2\3\2\u009e\b\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7f\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\n\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7f"+
		"\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\f\3\2\2\2\u00ac\u00ad"+
		"\7x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"\16\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7/\2\2"+
		"\u00b8\u00b9\7@\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\24\3\2\2"+
		"\2\u00bc\u00bd\7B\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7<\2\2\u00bf\30\3\2"+
		"\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2\7<\2\2\u00c2\32\3\2\2\2\u00c3\u00c4"+
		"\7\60\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6\u00c7\6\r\2\2\u00c7"+
		"\u00c8\b\r\4\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\r\5\2\u00ca\36\3\2\2"+
		"\2\u00cb\u00cc\7=\2\2\u00cc \3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\"\3\2\2"+
		"\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7\60\2\2\u00d2"+
		"$\3\2\2\2\u00d3\u00d4\7\u0080\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7*\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\b\22\6\2\u00d8(\3\2\2\2\u00d9\u00da\7+\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\b\23\5\2\u00dc*\3\2\2\2\u00dd\u00de\7"+
		"]\2\2\u00de,\3\2\2\2\u00df\u00e0\7_\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7}"+
		"\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4\62\3\2\2\2\u00e5\u00e6"+
		"\7>\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7o\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7c\2\2\u00ed"+
		"\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7u\2\2\u00f0\66\3\2\2\2\u00f1"+
		"\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7r\2\2"+
		"\u00f5\u00f6\7q\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9"+
		"\7t\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\32\7\2\u00fb8\3\2\2\2\u00fc"+
		"\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7e\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7u\2\2\u0102\u0103\7u\2\2\u0103\u0104"+
		"\7q\2\2\u0104\u0105\7t\2\2\u0105:\3\2\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7p\2\2\u0108\u0109\7f\2\2\u0109<\3\2\2\2\u010a\u010b\7%\2\2\u010b>\3"+
		"\2\2\2\u010c\u010d\7&\2\2\u010d@\3\2\2\2\u010e\u010f\7\60\2\2\u010f\u0110"+
		"\7\60\2\2\u0110B\3\2\2\2\u0111\u0112\t\3\2\2\u0112D\3\2\2\2\u0113\u0118"+
		"\t\4\2\2\u0114\u0115\7o\2\2\u0115\u0116\7q\2\2\u0116\u0118\7f\2\2\u0117"+
		"\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0118F\3\2\2\2\u0119\u011a\7\62\2\2"+
		"\u011aH\3\2\2\2\u011b\u011d\t\5\2\2\u011c\u011e\5K$\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011eJ\3\2\2\2\u011f\u0121\t\6\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"L\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0126\3\2\2\2\u0126\u0127\b%\b\2\u0127"+
		"N\3\2\2\2\u0128\u012c\5Q\'\2\u0129\u012b\5S(\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dP\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012f\u0130\t\7\2\2\u0130R\3\2\2\2\u0131\u0134\5"+
		"Q\'\2\u0132\u0134\t\b\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"T\3\2\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\b)\2\2\u013bV\3\2\2\2\u013c\u013d\7~\2\2\u013dX\3\2\2\2\u013e\u013f\7"+
		"@\2\2\u013fZ\3\2\2\2\u0140\u0141\7A\2\2\u0141\u0142\7*\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\b,\6\2\u0144\\\3\2\2\2\u0145\u0147\n\t\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\t\n\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b-\2\2\u014f\u0150\b-\5"+
		"\2\u0150^\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153\7p\2\2\u0153\u0154\7"+
		"f\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b.\5\2\u0156`\3\2\2\2\u0157\u0158"+
		"\7>\2\2\u0158b\3\2\2\2\u0159\u015a\7@\2\2\u015ad\3\2\2\2\u015b\u015c\7"+
		"\u0080\2\2\u015cf\3\2\2\2\u015d\u015e\5O&\2\u015e\u015f\5\27\n\2\u015f"+
		"h\3\2\2\2\u0160\u0161\5!\17\2\u0161j\3\2\2\2\u0162\u0163\t\13\2\2\u0163"+
		"l\3\2\2\2\u0164\u0165\7?\2\2\u0165n\3\2\2\2\u0166\u0167\5I#\2\u0167p\3"+
		"\2\2\2\u0168\u0169\7)\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\67\t\2\u016b"+
		"r\3\2\2\2\u016c\u016d\7*\2\2\u016dt\3\2\2\2\u016e\u016f\7+\2\2\u016fv"+
		"\3\2\2\2\u0170\u0171\7]\2\2\u0171x\3\2\2\2\u0172\u0173\7_\2\2\u0173z\3"+
		"\2\2\2\u0174\u0175\7}\2\2\u0175|\3\2\2\2\u0176\u0177\7\177\2\2\u0177~"+
		"\3\2\2\2\u0178\u0179\7<\2\2\u0179\u0080\3\2\2\2\u017a\u017b\7f\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7h\2\2\u017d\u0082\3\2\2\2\u017e\u0184\5?\36"+
		"\2\u017f\u0181\5\25\t\2\u0180\u0182\5O&\2\u0181\u0180\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0185\5O&\2\u0184\u017f\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185\u0084\3\2\2\2\u0186\u0187\5O&\2\u0187\u0086\3\2\2"+
		"\2\u0188\u0189\5U)\2\u0189\u018a\3\2\2\2\u018a\u018b\bB\2\2\u018b\u0088"+
		"\3\2\2\2\u018c\u018e\5\u008bD\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2"+
		"\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u008a\3\2\2\2\u0191\u0192"+
		"\7)\2\2\u0192\u0195\7)\2\2\u0193\u0195\n\f\2\2\u0194\u0191\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195\u008c\3\2\2\2\u0196\u0197\7)\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\bE\5\2\u0199\u008e\3\2\2\2\u019a\u019b\7&\2\2\u019b\u019c"+
		"\7*\2\2\u019c\u019d\3\2\2\2\u019d\u019e\bF\6\2\u019e\u0090\3\2\2\2\u019f"+
		"\u01a0\7&\2\2\u01a0\u01a1\bG\n\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\bG\6"+
		"\2\u01a3\u01a4\bG\13\2\u01a4\u0092\3\2\2\2\u01a5\u01a7\5\u0095I\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u0094\3\2\2\2\u01aa\u01ab\7)\2\2\u01ab\u01b0\7)\2\2\u01ac\u01ad"+
		"\7&\2\2\u01ad\u01b0\7&\2\2\u01ae\u01b0\n\r\2\2\u01af\u01aa\3\2\2\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u0096\3\2\2\2\u01b1\u01b2\7)"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\bJ\5\2\u01b4\u0098\3\2\2\2\25\2\3"+
		"\4\5\6\u0117\u011d\u0122\u012c\u0133\u0138\u0148\u014c\u0181\u0184\u018f"+
		"\u0194\u01a8\u01af\f\b\2\2\7\3\2\3\r\2\6\2\2\7\2\2\7\4\2\7\6\2\7\5\2\3"+
		"G\3\t\37\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}