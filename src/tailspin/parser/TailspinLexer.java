// Generated from TailspinLexer.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, To=8, 
		ResultMarker=9, SourceMarker=10, DeleteMarker=11, And=12, Slash=13, Colon=14, 
		Message=15, FieldReference=16, EndStringInterpolate=17, SemiColon=18, 
		Comma=19, Deconstructor=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartBytes=28, StartMatcher=29, 
		Lambda=30, StartTemplatesDefinition=31, StartSourceDefinition=32, StartSinkDefinition=33, 
		StartComposerDefinition=34, StartProcessorDefinition=35, StartOperatorDefinition=36, 
		EndDefinition=37, Rule=38, First=39, Last=40, TemplateMatch=41, Range=42, 
		Plus=43, Minus=44, Star=45, TruncateDivide=46, Mod=47, Question=48, Equal=49, 
		Else=50, EndMatcher=51, BeginCondition=52, StartTestDefinition=53, Assert=54, 
		CoreSystem=55, With=56, Provided=57, Modified=58, Shadowed=59, Inherited=60, 
		From=61, StandAlone=62, Use=63, Zero=64, PositiveInteger=65, START_STRING=66, 
		STATE_IDENTIFIER=67, IDENTIFIER=68, WS=69, Comment=70, REGEX_TEXT=71, 
		END_REGEX=72, StartCharacterCode=73, StartStringInterpolate=74, STRING_TEXT=75, 
		END_STRING=76, Bytes=77, Bytes_WS=78, EndBytes=79;
	public static final int
		COMMENT_MODE=1, IN_REGEX=2, IN_STRING=3, IN_BYTES=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "IN_REGEX", "IN_STRING", "IN_BYTES"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "And", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartBytes", "StartMatcher", 
			"Lambda", "StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Zero", "PositiveInteger", "Digits", "START_STRING", "STATE_IDENTIFIER", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Comment", 
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING", "Bytes", "Bytes_WS", "EndBytes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'->'", "'!'", "'$'", "'^'", "'&'", "'/'", "':'", null, null, null, "';'", 
			"','", "'...'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'[x'", 
			"'<'", "'\\'", "'templates'", "'source'", "'sink'", "'composer'", "'processor'", 
			"'operator'", "'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", 
			"'+'", "'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", 
			"'test'", "'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", 
			"'shadowed'", "'inherited'", "'from'", "'stand-alone'", "'use'", "'0'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "And", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartBytes", "StartMatcher", 
			"Lambda", "StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", 
			"IDENTIFIER", "WS", "Comment", "REGEX_TEXT", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "Bytes", "Bytes_WS", 
			"EndBytes"
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
		case 16:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
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
	private void StartCharacterCode_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 stringInterpolate++; 
			break;
		}
	}
	private void StartStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 stringInterpolate++; 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u0247\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\3A\3A\3B\3B\5B\u01da\nB\3C\6C\u01dd\nC\rC\16C\u01de\3"+
		"D\3D\3D\3D\3E\3E\7E\u01e7\nE\fE\16E\u01ea\13E\3F\3F\7F\u01ee\nF\fF\16"+
		"F\u01f1\13F\3G\3G\3H\3H\5H\u01f7\nH\3I\6I\u01fa\nI\rI\16I\u01fb\3I\3I"+
		"\3J\7J\u0201\nJ\fJ\16J\u0204\13J\3J\5J\u0207\nJ\3J\3J\3J\3K\6K\u020d\n"+
		"K\rK\16K\u020e\3L\3L\3L\5L\u0214\nL\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3"+
		"O\3O\3O\3O\3O\3P\6P\u0227\nP\rP\16P\u0228\3Q\3Q\3Q\3Q\3Q\5Q\u0230\nQ\3"+
		"R\3R\3R\3R\3S\3S\6S\u0238\nS\rS\16S\u0239\3T\6T\u023d\nT\rT\16T\u023e"+
		"\3T\3T\3U\3U\3U\3U\3U\2\2V\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13"+
		"\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62"+
		"g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089"+
		"\2\u008bD\u008dE\u008fF\u0091\2\u0093\2\u0095G\u0097H\u0099I\u009b\2\u009d"+
		"J\u009fK\u00a1L\u00a3M\u00a5\2\u00a7N\u00a9O\u00abP\u00adQ\7\2\3\4\5\6"+
		"\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f"+
		"\f\3\2))\4\2&&))\4\2\62;ch\2\u024b\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\4\u0099\3\2\2\2\4\u009d"+
		"\3\2\2\2\5\u009f\3\2\2\2\5\u00a1\3\2\2\2\5\u00a3\3\2\2\2\5\u00a7\3\2\2"+
		"\2\6\u00a9\3\2\2\2\6\u00ab\3\2\2\2\6\u00ad\3\2\2\2\7\u00af\3\2\2\2\t\u00b5"+
		"\3\2\2\2\13\u00bd\3\2\2\2\r\u00c2\3\2\2\2\17\u00c6\3\2\2\2\21\u00cb\3"+
		"\2\2\2\23\u00ce\3\2\2\2\25\u00d8\3\2\2\2\27\u00db\3\2\2\2\31\u00dd\3\2"+
		"\2\2\33\u00df\3\2\2\2\35\u00e1\3\2\2\2\37\u00e3\3\2\2\2!\u00e5\3\2\2\2"+
		"#\u00e7\3\2\2\2%\u00ec\3\2\2\2\'\u00ef\3\2\2\2)\u00f5\3\2\2\2+\u00f7\3"+
		"\2\2\2-\u00f9\3\2\2\2/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63\u0103\3\2\2\2"+
		"\65\u0107\3\2\2\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d\3\2\2\2=\u010f"+
		"\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E\u0122\3\2\2\2G"+
		"\u0129\3\2\2\2I\u012e\3\2\2\2K\u0137\3\2\2\2M\u0141\3\2\2\2O\u014a\3\2"+
		"\2\2Q\u014e\3\2\2\2S\u0153\3\2\2\2U\u0159\3\2\2\2W\u015e\3\2\2\2Y\u0160"+
		"\3\2\2\2[\u0163\3\2\2\2]\u0165\3\2\2\2_\u0167\3\2\2\2a\u0169\3\2\2\2c"+
		"\u016c\3\2\2\2e\u0170\3\2\2\2g\u0172\3\2\2\2i\u0174\3\2\2\2k\u0176\3\2"+
		"\2\2m\u0178\3\2\2\2o\u017d\3\2\2\2q\u0182\3\2\2\2s\u0189\3\2\2\2u\u0196"+
		"\3\2\2\2w\u019b\3\2\2\2y\u01a4\3\2\2\2{\u01ad\3\2\2\2}\u01b6\3\2\2\2\177"+
		"\u01c0\3\2\2\2\u0081\u01c5\3\2\2\2\u0083\u01d1\3\2\2\2\u0085\u01d5\3\2"+
		"\2\2\u0087\u01d7\3\2\2\2\u0089\u01dc\3\2\2\2\u008b\u01e0\3\2\2\2\u008d"+
		"\u01e4\3\2\2\2\u008f\u01eb\3\2\2\2\u0091\u01f2\3\2\2\2\u0093\u01f6\3\2"+
		"\2\2\u0095\u01f9\3\2\2\2\u0097\u0202\3\2\2\2\u0099\u020c\3\2\2\2\u009b"+
		"\u0213\3\2\2\2\u009d\u0215\3\2\2\2\u009f\u0219\3\2\2\2\u00a1\u0220\3\2"+
		"\2\2\u00a3\u0226\3\2\2\2\u00a5\u022f\3\2\2\2\u00a7\u0231\3\2\2\2\u00a9"+
		"\u0237\3\2\2\2\u00ab\u023c\3\2\2\2\u00ad\u0242\3\2\2\2\u00af\u00b0\7\61"+
		"\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\2\2\2\u00b3"+
		"\u00b4\b\2\3\2\u00b4\b\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7"+
		"\u00b8\7e\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7f\2\2"+
		"\u00bb\u00bc\7g\2\2\u00bc\n\3\2\2\2\u00bd\u00be\7X\2\2\u00be\u00bf\7Q"+
		"\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7F\2\2\u00c1\f\3\2\2\2\u00c2\u00c3"+
		"\7f\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\16\3\2\2\2\u00c6\u00c7"+
		"\7y\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\20\3\2\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7q\2\2\u00cd\22\3\2\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7g\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\24\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da"+
		"\7@\2\2\u00da\26\3\2\2\2\u00db\u00dc\7#\2\2\u00dc\30\3\2\2\2\u00dd\u00de"+
		"\7&\2\2\u00de\32\3\2\2\2\u00df\u00e0\7`\2\2\u00e0\34\3\2\2\2\u00e1\u00e2"+
		"\7(\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4 \3\2\2\2\u00e5\u00e6"+
		"\7<\2\2\u00e6\"\3\2\2\2\u00e7\u00e8\7<\2\2\u00e8\u00e9\7<\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\5\u008fF\2\u00eb$\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed"+
		"\u00ee\5\u008fF\2\u00ee&\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0\u00f1\6\22\2"+
		"\2\u00f1\u00f2\b\22\4\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\22\5\2\u00f4"+
		"(\3\2\2\2\u00f5\u00f6\7=\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7.\2\2\u00f8,"+
		"\3\2\2\2\u00f9\u00fa\7\60\2\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7\60\2"+
		"\2\u00fc.\3\2\2\2\u00fd\u00fe\7\u0080\2\2\u00fe\60\3\2\2\2\u00ff\u0100"+
		"\7*\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\27\6\2\u0102\62\3\2\2\2\u0103"+
		"\u0104\7+\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\30\5\2\u0106\64\3\2\2"+
		"\2\u0107\u0108\7]\2\2\u0108\66\3\2\2\2\u0109\u010a\7_\2\2\u010a8\3\2\2"+
		"\2\u010b\u010c\7}\2\2\u010c:\3\2\2\2\u010d\u010e\7\177\2\2\u010e<\3\2"+
		"\2\2\u010f\u0110\7]\2\2\u0110\u0111\7z\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\b\35\7\2\u0113>\3\2\2\2\u0114\u0115\7>\2\2\u0115@\3\2\2\2\u0116\u0117"+
		"\7^\2\2\u0117B\3\2\2\2\u0118\u0119\7v\2\2\u0119\u011a\7g\2\2\u011a\u011b"+
		"\7o\2\2\u011b\u011c\7r\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7g\2\2\u0120\u0121\7u\2\2\u0121D\3\2\2\2\u0122"+
		"\u0123\7u\2\2\u0123\u0124\7q\2\2\u0124\u0125\7w\2\2\u0125\u0126\7t\2\2"+
		"\u0126\u0127\7e\2\2\u0127\u0128\7g\2\2\u0128F\3\2\2\2\u0129\u012a\7u\2"+
		"\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7m\2\2\u012dH\3\2"+
		"\2\2\u012e\u012f\7e\2\2\u012f\u0130\7q\2\2\u0130\u0131\7o\2\2\u0131\u0132"+
		"\7r\2\2\u0132\u0133\7q\2\2\u0133\u0134\7u\2\2\u0134\u0135\7g\2\2\u0135"+
		"\u0136\7t\2\2\u0136J\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7t\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7e\2\2\u013b\u013c\7g\2\2\u013c\u013d\7u\2\2"+
		"\u013d\u013e\7u\2\2\u013e\u013f\7q\2\2\u013f\u0140\7t\2\2\u0140L\3\2\2"+
		"\2\u0141\u0142\7q\2\2\u0142\u0143\7r\2\2\u0143\u0144\7g\2\2\u0144\u0145"+
		"\7t\2\2\u0145\u0146\7c\2\2\u0146\u0147\7v\2\2\u0147\u0148\7q\2\2\u0148"+
		"\u0149\7t\2\2\u0149N\3\2\2\2\u014a\u014b\7g\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7f\2\2\u014dP\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150\7w\2\2\u0150"+
		"\u0151\7n\2\2\u0151\u0152\7g\2\2\u0152R\3\2\2\2\u0153\u0154\7h\2\2\u0154"+
		"\u0155\7k\2\2\u0155\u0156\7t\2\2\u0156\u0157\7u\2\2\u0157\u0158\7v\2\2"+
		"\u0158T\3\2\2\2\u0159\u015a\7n\2\2\u015a\u015b\7c\2\2\u015b\u015c\7u\2"+
		"\2\u015c\u015d\7v\2\2\u015dV\3\2\2\2\u015e\u015f\7%\2\2\u015fX\3\2\2\2"+
		"\u0160\u0161\7\60\2\2\u0161\u0162\7\60\2\2\u0162Z\3\2\2\2\u0163\u0164"+
		"\7-\2\2\u0164\\\3\2\2\2\u0165\u0166\7/\2\2\u0166^\3\2\2\2\u0167\u0168"+
		"\7,\2\2\u0168`\3\2\2\2\u0169\u016a\7\u0080\2\2\u016a\u016b\7\61\2\2\u016b"+
		"b\3\2\2\2\u016c\u016d\7o\2\2\u016d\u016e\7q\2\2\u016e\u016f\7f\2\2\u016f"+
		"d\3\2\2\2\u0170\u0171\7A\2\2\u0171f\3\2\2\2\u0172\u0173\7?\2\2\u0173h"+
		"\3\2\2\2\u0174\u0175\7~\2\2\u0175j\3\2\2\2\u0176\u0177\7@\2\2\u0177l\3"+
		"\2\2\2\u0178\u0179\7A\2\2\u0179\u017a\7*\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\b\65\6\2\u017cn\3\2\2\2\u017d\u017e\7v\2\2\u017e\u017f\7g\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7v\2\2\u0181p\3\2\2\2\u0182\u0183\7c\2\2\u0183"+
		"\u0184\7u\2\2\u0184\u0185\7u\2\2\u0185\u0186\7g\2\2\u0186\u0187\7t\2\2"+
		"\u0187\u0188\7v\2\2\u0188r\3\2\2\2\u0189\u018a\7e\2\2\u018a\u018b\7q\2"+
		"\2\u018b\u018c\7t\2\2\u018c\u018d\7g\2\2\u018d\u018e\7/\2\2\u018e\u018f"+
		"\7u\2\2\u018f\u0190\7{\2\2\u0190\u0191\7u\2\2\u0191\u0192\7v\2\2\u0192"+
		"\u0193\7g\2\2\u0193\u0194\7o\2\2\u0194\u0195\7\61\2\2\u0195t\3\2\2\2\u0196"+
		"\u0197\7y\2\2\u0197\u0198\7k\2\2\u0198\u0199\7v\2\2\u0199\u019a\7j\2\2"+
		"\u019av\3\2\2\2\u019b\u019c\7r\2\2\u019c\u019d\7t\2\2\u019d\u019e\7q\2"+
		"\2\u019e\u019f\7x\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7f\2\2\u01a1\u01a2"+
		"\7g\2\2\u01a2\u01a3\7f\2\2\u01a3x\3\2\2\2\u01a4\u01a5\7o\2\2\u01a5\u01a6"+
		"\7q\2\2\u01a6\u01a7\7f\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7h\2\2\u01a9"+
		"\u01aa\7k\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7f\2\2\u01acz\3\2\2\2\u01ad"+
		"\u01ae\7u\2\2\u01ae\u01af\7j\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7f\2\2"+
		"\u01b1\u01b2\7q\2\2\u01b2\u01b3\7y\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7f\2\2\u01b5|\3\2\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9"+
		"\7j\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7k\2\2\u01bc"+
		"\u01bd\7v\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7f\2\2\u01bf~\3\2\2\2\u01c0"+
		"\u01c1\7h\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7o\2\2"+
		"\u01c4\u0080\3\2\2\2\u01c5\u01c6\7u\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8"+
		"\7c\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7f\2\2\u01ca\u01cb\7/\2\2\u01cb"+
		"\u01cc\7c\2\2\u01cc\u01cd\7n\2\2\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2"+
		"\u01cf\u01d0\7g\2\2\u01d0\u0082\3\2\2\2\u01d1\u01d2\7w\2\2\u01d2\u01d3"+
		"\7u\2\2\u01d3\u01d4\7g\2\2\u01d4\u0084\3\2\2\2\u01d5\u01d6\7\62\2\2\u01d6"+
		"\u0086\3\2\2\2\u01d7\u01d9\t\2\2\2\u01d8\u01da\5\u0089C\2\u01d9\u01d8"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u0088\3\2\2\2\u01db\u01dd\t\3\2\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u008a\3\2\2\2\u01e0\u01e1\7)\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\bD\b\2\u01e3\u008c\3\2\2\2\u01e4\u01e8\7B\2\2\u01e5\u01e7\5\u0093"+
		"H\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u008e\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ef\5\u0091"+
		"G\2\u01ec\u01ee\5\u0093H\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u0090\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f3\t\4\2\2\u01f3\u0092\3\2\2\2\u01f4\u01f7\5\u0091G\2\u01f5"+
		"\u01f7\t\5\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u0094\3\2"+
		"\2\2\u01f8\u01fa\t\6\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\bI"+
		"\2\2\u01fe\u0096\3\2\2\2\u01ff\u0201\n\7\2\2\u0200\u01ff\3\2\2\2\u0201"+
		"\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0206\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0205\u0207\t\b\2\2\u0206\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0209\bJ\2\2\u0209\u020a\bJ\5\2\u020a\u0098\3\2\2"+
		"\2\u020b\u020d\5\u009bL\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u009a\3\2\2\2\u0210\u0211\7)"+
		"\2\2\u0211\u0214\7)\2\2\u0212\u0214\n\t\2\2\u0213\u0210\3\2\2\2\u0213"+
		"\u0212\3\2\2\2\u0214\u009c\3\2\2\2\u0215\u0216\7)\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\bM\5\2\u0218\u009e\3\2\2\2\u0219\u021a\7&\2\2\u021a\u021b"+
		"\7%\2\2\u021b\u021c\3\2\2\2\u021c\u021d\bN\t\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\bN\6\2\u021f\u00a0\3\2\2\2\u0220\u0221\7&\2\2\u0221\u0222\bO\n"+
		"\2\u0222\u0223\3\2\2\2\u0223\u0224\bO\6\2\u0224\u00a2\3\2\2\2\u0225\u0227"+
		"\5\u00a5Q\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0226\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229\u00a4\3\2\2\2\u022a\u022b\7)\2\2\u022b\u0230"+
		"\7)\2\2\u022c\u022d\7&\2\2\u022d\u0230\7&\2\2\u022e\u0230\n\n\2\2\u022f"+
		"\u022a\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u00a6\3\2"+
		"\2\2\u0231\u0232\7)\2\2\u0232\u0233\3\2\2\2\u0233\u0234\bR\5\2\u0234\u00a8"+
		"\3\2\2\2\u0235\u0236\t\13\2\2\u0236\u0238\t\13\2\2\u0237\u0235\3\2\2\2"+
		"\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u00aa"+
		"\3\2\2\2\u023b\u023d\t\6\2\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\bT"+
		"\2\2\u0241\u00ac\3\2\2\2\u0242\u0243\7z\2\2\u0243\u0244\7_\2\2\u0244\u0245"+
		"\3\2\2\2\u0245\u0246\bU\5\2\u0246\u00ae\3\2\2\2\25\2\3\4\5\6\u01d9\u01de"+
		"\u01e8\u01ef\u01f6\u01fb\u0202\u0206\u020e\u0213\u0228\u022f\u0239\u023e"+
		"\13\b\2\2\7\3\2\3\22\2\6\2\2\7\2\2\7\6\2\7\5\2\3N\3\3O\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}