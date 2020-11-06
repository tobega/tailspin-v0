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
			"STRING_TEXT", "STRING_CHAR", "END_STRING", "Bytes", "Bytes_WS", "StartBytesExpression", 
			"EndBytes"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u024b\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3@\3@\3@\3@\3A\3A\3B\3B\5B\u01dc\nB\3C\6C\u01df\nC\rC\16C\u01e0"+
		"\3D\3D\3D\3D\3E\3E\7E\u01e9\nE\fE\16E\u01ec\13E\3F\3F\7F\u01f0\nF\fF\16"+
		"F\u01f3\13F\3G\3G\3H\3H\5H\u01f9\nH\3I\6I\u01fc\nI\rI\16I\u01fd\3I\3I"+
		"\3J\7J\u0203\nJ\fJ\16J\u0206\13J\3J\5J\u0209\nJ\3J\3J\3J\3K\6K\u020f\n"+
		"K\rK\16K\u0210\3L\3L\3L\5L\u0216\nL\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3"+
		"O\3O\3O\3O\3O\3P\6P\u0229\nP\rP\16P\u022a\3Q\3Q\3Q\3Q\3Q\5Q\u0232\nQ\3"+
		"R\3R\3R\3R\3S\3S\6S\u023a\nS\rS\16S\u023b\3T\3T\3T\3T\3U\3U\3U\3U\3U\3"+
		"V\3V\3V\3V\3V\2\2W\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64"+
		"k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089\2\u008b"+
		"D\u008dE\u008fF\u0091\2\u0093\2\u0095G\u0097H\u0099I\u009b\2\u009dJ\u009f"+
		"K\u00a1L\u00a3M\u00a5\2\u00a7N\u00a9O\u00abP\u00ad\2\u00afQ\7\2\3\4\5"+
		"\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3"+
		"\f\f\3\2))\4\2&&))\4\2\62;ch\2\u024e\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\4\u0099\3\2\2\2\4\u009d"+
		"\3\2\2\2\5\u009f\3\2\2\2\5\u00a1\3\2\2\2\5\u00a3\3\2\2\2\5\u00a7\3\2\2"+
		"\2\6\u00a9\3\2\2\2\6\u00ab\3\2\2\2\6\u00ad\3\2\2\2\6\u00af\3\2\2\2\7\u00b1"+
		"\3\2\2\2\t\u00b7\3\2\2\2\13\u00bf\3\2\2\2\r\u00c4\3\2\2\2\17\u00c8\3\2"+
		"\2\2\21\u00cd\3\2\2\2\23\u00d0\3\2\2\2\25\u00da\3\2\2\2\27\u00dd\3\2\2"+
		"\2\31\u00df\3\2\2\2\33\u00e1\3\2\2\2\35\u00e3\3\2\2\2\37\u00e5\3\2\2\2"+
		"!\u00e7\3\2\2\2#\u00e9\3\2\2\2%\u00ee\3\2\2\2\'\u00f1\3\2\2\2)\u00f7\3"+
		"\2\2\2+\u00f9\3\2\2\2-\u00fb\3\2\2\2/\u00ff\3\2\2\2\61\u0101\3\2\2\2\63"+
		"\u0105\3\2\2\2\65\u0109\3\2\2\2\67\u010b\3\2\2\29\u010d\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0111\3\2\2\2?\u0116\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E"+
		"\u0124\3\2\2\2G\u012b\3\2\2\2I\u0130\3\2\2\2K\u0139\3\2\2\2M\u0143\3\2"+
		"\2\2O\u014c\3\2\2\2Q\u0150\3\2\2\2S\u0155\3\2\2\2U\u015b\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0162\3\2\2\2[\u0165\3\2\2\2]\u0167\3\2\2\2_\u0169\3\2\2\2a"+
		"\u016b\3\2\2\2c\u016e\3\2\2\2e\u0172\3\2\2\2g\u0174\3\2\2\2i\u0176\3\2"+
		"\2\2k\u0178\3\2\2\2m\u017a\3\2\2\2o\u017f\3\2\2\2q\u0184\3\2\2\2s\u018b"+
		"\3\2\2\2u\u0198\3\2\2\2w\u019d\3\2\2\2y\u01a6\3\2\2\2{\u01af\3\2\2\2}"+
		"\u01b8\3\2\2\2\177\u01c2\3\2\2\2\u0081\u01c7\3\2\2\2\u0083\u01d3\3\2\2"+
		"\2\u0085\u01d7\3\2\2\2\u0087\u01d9\3\2\2\2\u0089\u01de\3\2\2\2\u008b\u01e2"+
		"\3\2\2\2\u008d\u01e6\3\2\2\2\u008f\u01ed\3\2\2\2\u0091\u01f4\3\2\2\2\u0093"+
		"\u01f8\3\2\2\2\u0095\u01fb\3\2\2\2\u0097\u0204\3\2\2\2\u0099\u020e\3\2"+
		"\2\2\u009b\u0215\3\2\2\2\u009d\u0217\3\2\2\2\u009f\u021b\3\2\2\2\u00a1"+
		"\u0222\3\2\2\2\u00a3\u0228\3\2\2\2\u00a5\u0231\3\2\2\2\u00a7\u0233\3\2"+
		"\2\2\u00a9\u0239\3\2\2\2\u00ab\u023d\3\2\2\2\u00ad\u0241\3\2\2\2\u00af"+
		"\u0246\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\b\2\2\2\u00b5\u00b6\b\2\3\2\u00b6\b\3\2\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7w\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be\n\3\2\2\2\u00bf"+
		"\u00c0\7X\2\2\u00c0\u00c1\7Q\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3\7F\2\2"+
		"\u00c3\f\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7h"+
		"\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\20\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf"+
		"\7q\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3"+
		"\7j\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7y\2\2\u00d6"+
		"\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\24\3\2\2\2\u00da"+
		"\u00db\7/\2\2\u00db\u00dc\7@\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7#\2\2\u00de"+
		"\30\3\2\2\2\u00df\u00e0\7&\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7`\2\2\u00e2"+
		"\34\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4\36\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6"+
		" \3\2\2\2\u00e7\u00e8\7<\2\2\u00e8\"\3\2\2\2\u00e9\u00ea\7<\2\2\u00ea"+
		"\u00eb\7<\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\u008fF\2\u00ed$\3\2\2"+
		"\2\u00ee\u00ef\7\60\2\2\u00ef\u00f0\5\u008fF\2\u00f0&\3\2\2\2\u00f1\u00f2"+
		"\7=\2\2\u00f2\u00f3\6\22\2\2\u00f3\u00f4\b\22\4\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\b\22\5\2\u00f6(\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8*\3\2\2\2"+
		"\u00f9\u00fa\7.\2\2\u00fa,\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd\7"+
		"\60\2\2\u00fd\u00fe\7\60\2\2\u00fe.\3\2\2\2\u00ff\u0100\7\u0080\2\2\u0100"+
		"\60\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b\27\6"+
		"\2\u0104\62\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\b\30\5\2\u0108\64\3\2\2\2\u0109\u010a\7]\2\2\u010a\66\3\2\2\2\u010b\u010c"+
		"\7_\2\2\u010c8\3\2\2\2\u010d\u010e\7}\2\2\u010e:\3\2\2\2\u010f\u0110\7"+
		"\177\2\2\u0110<\3\2\2\2\u0111\u0112\7]\2\2\u0112\u0113\7z\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\b\35\7\2\u0115>\3\2\2\2\u0116\u0117\7>\2\2\u0117"+
		"@\3\2\2\2\u0118\u0119\7^\2\2\u0119B\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011d\7o\2\2\u011d\u011e\7r\2\2\u011e\u011f\7n\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121\u0122\7g\2\2\u0122\u0123\7u\2\2"+
		"\u0123D\3\2\2\2\u0124\u0125\7u\2\2\u0125\u0126\7q\2\2\u0126\u0127\7w\2"+
		"\2\u0127\u0128\7t\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2\u012aF\3\2"+
		"\2\2\u012b\u012c\7u\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f"+
		"\7m\2\2\u012fH\3\2\2\2\u0130\u0131\7e\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\7o\2\2\u0133\u0134\7r\2\2\u0134\u0135\7q\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7g\2\2\u0137\u0138\7t\2\2\u0138J\3\2\2\2\u0139\u013a\7r\2\2\u013a"+
		"\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c\u013d\7e\2\2\u013d\u013e\7g\2\2"+
		"\u013e\u013f\7u\2\2\u013f\u0140\7u\2\2\u0140\u0141\7q\2\2\u0141\u0142"+
		"\7t\2\2\u0142L\3\2\2\2\u0143\u0144\7q\2\2\u0144\u0145\7r\2\2\u0145\u0146"+
		"\7g\2\2\u0146\u0147\7t\2\2\u0147\u0148\7c\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7q\2\2\u014a\u014b\7t\2\2\u014bN\3\2\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7f\2\2\u014fP\3\2\2\2\u0150\u0151\7t\2\2\u0151"+
		"\u0152\7w\2\2\u0152\u0153\7n\2\2\u0153\u0154\7g\2\2\u0154R\3\2\2\2\u0155"+
		"\u0156\7h\2\2\u0156\u0157\7k\2\2\u0157\u0158\7t\2\2\u0158\u0159\7u\2\2"+
		"\u0159\u015a\7v\2\2\u015aT\3\2\2\2\u015b\u015c\7n\2\2\u015c\u015d\7c\2"+
		"\2\u015d\u015e\7u\2\2\u015e\u015f\7v\2\2\u015fV\3\2\2\2\u0160\u0161\7"+
		"%\2\2\u0161X\3\2\2\2\u0162\u0163\7\60\2\2\u0163\u0164\7\60\2\2\u0164Z"+
		"\3\2\2\2\u0165\u0166\7-\2\2\u0166\\\3\2\2\2\u0167\u0168\7/\2\2\u0168^"+
		"\3\2\2\2\u0169\u016a\7,\2\2\u016a`\3\2\2\2\u016b\u016c\7\u0080\2\2\u016c"+
		"\u016d\7\61\2\2\u016db\3\2\2\2\u016e\u016f\7o\2\2\u016f\u0170\7q\2\2\u0170"+
		"\u0171\7f\2\2\u0171d\3\2\2\2\u0172\u0173\7A\2\2\u0173f\3\2\2\2\u0174\u0175"+
		"\7?\2\2\u0175h\3\2\2\2\u0176\u0177\7~\2\2\u0177j\3\2\2\2\u0178\u0179\7"+
		"@\2\2\u0179l\3\2\2\2\u017a\u017b\7A\2\2\u017b\u017c\7*\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017e\b\65\6\2\u017en\3\2\2\2\u017f\u0180\7v\2\2\u0180"+
		"\u0181\7g\2\2\u0181\u0182\7u\2\2\u0182\u0183\7v\2\2\u0183p\3\2\2\2\u0184"+
		"\u0185\7c\2\2\u0185\u0186\7u\2\2\u0186\u0187\7u\2\2\u0187\u0188\7g\2\2"+
		"\u0188\u0189\7t\2\2\u0189\u018a\7v\2\2\u018ar\3\2\2\2\u018b\u018c\7e\2"+
		"\2\u018c\u018d\7q\2\2\u018d\u018e\7t\2\2\u018e\u018f\7g\2\2\u018f\u0190"+
		"\7/\2\2\u0190\u0191\7u\2\2\u0191\u0192\7{\2\2\u0192\u0193\7u\2\2\u0193"+
		"\u0194\7v\2\2\u0194\u0195\7g\2\2\u0195\u0196\7o\2\2\u0196\u0197\7\61\2"+
		"\2\u0197t\3\2\2\2\u0198\u0199\7y\2\2\u0199\u019a\7k\2\2\u019a\u019b\7"+
		"v\2\2\u019b\u019c\7j\2\2\u019cv\3\2\2\2\u019d\u019e\7r\2\2\u019e\u019f"+
		"\7t\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7x\2\2\u01a1\u01a2\7k\2\2\u01a2"+
		"\u01a3\7f\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7f\2\2\u01a5x\3\2\2\2\u01a6"+
		"\u01a7\7o\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7f\2\2\u01a9\u01aa\7k\2\2"+
		"\u01aa\u01ab\7h\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae"+
		"\7f\2\2\u01aez\3\2\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1\7j\2\2\u01b1\u01b2"+
		"\7c\2\2\u01b2\u01b3\7f\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7y\2\2\u01b5"+
		"\u01b6\7g\2\2\u01b6\u01b7\7f\2\2\u01b7|\3\2\2\2\u01b8\u01b9\7k\2\2\u01b9"+
		"\u01ba\7p\2\2\u01ba\u01bb\7j\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7t\2\2"+
		"\u01bd\u01be\7k\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7g\2\2\u01c0\u01c1"+
		"\7f\2\2\u01c1~\3\2\2\2\u01c2\u01c3\7h\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5"+
		"\7q\2\2\u01c5\u01c6\7o\2\2\u01c6\u0080\3\2\2\2\u01c7\u01c8\7u\2\2\u01c8"+
		"\u01c9\7v\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc\7f\2\2"+
		"\u01cc\u01cd\7/\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7n\2\2\u01cf\u01d0"+
		"\7q\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7g\2\2\u01d2\u0082\3\2\2\2\u01d3"+
		"\u01d4\7w\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7g\2\2\u01d6\u0084\3\2\2"+
		"\2\u01d7\u01d8\7\62\2\2\u01d8\u0086\3\2\2\2\u01d9\u01db\t\2\2\2\u01da"+
		"\u01dc\5\u0089C\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u0088"+
		"\3\2\2\2\u01dd\u01df\t\3\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u008a\3\2\2\2\u01e2\u01e3\7)"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\bD\b\2\u01e5\u008c\3\2\2\2\u01e6"+
		"\u01ea\7B\2\2\u01e7\u01e9\5\u0093H\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u008e\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f1\5\u0091G\2\u01ee\u01f0\5\u0093H\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u0090\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\t\4\2\2\u01f5\u0092\3\2"+
		"\2\2\u01f6\u01f9\5\u0091G\2\u01f7\u01f9\t\5\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u0094\3\2\2\2\u01fa\u01fc\t\6\2\2\u01fb\u01fa\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\bI\2\2\u0200\u0096\3\2\2\2\u0201\u0203\n\7"+
		"\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209\t\b"+
		"\2\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bJ\2\2\u020b"+
		"\u020c\bJ\5\2\u020c\u0098\3\2\2\2\u020d\u020f\5\u009bL\2\u020e\u020d\3"+
		"\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u009a\3\2\2\2\u0212\u0213\7)\2\2\u0213\u0216\7)\2\2\u0214\u0216\n\t\2"+
		"\2\u0215\u0212\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u009c\3\2\2\2\u0217\u0218"+
		"\7)\2\2\u0218\u0219\3\2\2\2\u0219\u021a\bM\5\2\u021a\u009e\3\2\2\2\u021b"+
		"\u021c\7&\2\2\u021c\u021d\7%\2\2\u021d\u021e\3\2\2\2\u021e\u021f\bN\t"+
		"\2\u021f\u0220\3\2\2\2\u0220\u0221\bN\6\2\u0221\u00a0\3\2\2\2\u0222\u0223"+
		"\7&\2\2\u0223\u0224\bO\n\2\u0224\u0225\3\2\2\2\u0225\u0226\bO\6\2\u0226"+
		"\u00a2\3\2\2\2\u0227\u0229\5\u00a5Q\2\u0228\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u00a4\3\2\2\2\u022c"+
		"\u022d\7)\2\2\u022d\u0232\7)\2\2\u022e\u022f\7&\2\2\u022f\u0232\7&\2\2"+
		"\u0230\u0232\n\n\2\2\u0231\u022c\3\2\2\2\u0231\u022e\3\2\2\2\u0231\u0230"+
		"\3\2\2\2\u0232\u00a6\3\2\2\2\u0233\u0234\7)\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0236\bR\5\2\u0236\u00a8\3\2\2\2\u0237\u0238\t\13\2\2\u0238\u023a\t\13"+
		"\2\2\u0239\u0237\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u00aa\3\2\2\2\u023d\u023e\5\u0095I\2\u023e\u023f"+
		"\3\2\2\2\u023f\u0240\bT\2\2\u0240\u00ac\3\2\2\2\u0241\u0242\5\61\27\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0244\bU\13\2\u0244\u0245\bU\6\2\u0245\u00ae"+
		"\3\2\2\2\u0246\u0247\7z\2\2\u0247\u0248\7_\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\bV\5\2\u024a\u00b0\3\2\2\2\24\2\3\4\5\6\u01db\u01e0\u01ea\u01f1"+
		"\u01f8\u01fd\u0204\u0208\u0210\u0215\u022a\u0231\u023b\f\b\2\2\7\3\2\3"+
		"\22\2\6\2\2\7\2\2\7\6\2\7\5\2\3N\3\3O\4\t\30\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}