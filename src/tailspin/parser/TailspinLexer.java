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
		StartComment=1, Package=2, Import=3, Void=4, Def=5, To=6, ResultMarker=7, 
		SourceMarker=8, DeleteMarker=9, At=10, Slash=11, Colon=12, Message=13, 
		FieldReference=14, EndStringInterpolate=15, SemiColon=16, Comma=17, Deconstructor=18, 
		Invert=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, StartMatcher=26, Lambda=27, StartTemplatesDefinition=28, 
		StartSourceDefinition=29, StartSinkDefinition=30, StartComposerDefinition=31, 
		StartProcessorDefinition=32, EndDefinition=33, Rule=34, First=35, Last=36, 
		TemplateMatch=37, Range=38, Plus=39, Minus=40, Star=41, TruncateDivide=42, 
		Mod=43, Question=44, Equal=45, Else=46, EndMatcher=47, BeginCondition=48, 
		StartTestDefinition=49, Assert=50, Zero=51, PositiveInteger=52, START_STRING=53, 
		IDENTIFIER=54, WS=55, Comment=56, REGEX_TEXT=57, END_REGEX=58, StartCharacterCode=59, 
		StartStringInterpolate=60, STRING_TEXT=61, END_STRING=62;
	public static final int
		COMMENT_MODE=1, IN_REGEX=2, IN_STRING=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "IN_REGEX", "IN_STRING"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
			"SourceMarker", "DeleteMarker", "At", "Slash", "Colon", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "Zero", 
			"PositiveInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'!VOID'", "'def'", "'->'", "'!'", 
			"'$'", "'^'", "'@'", "'/'", "':'", null, null, null, "';'", "','", "'...'", 
			"'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'\\'", "'templates'", 
			"'source'", "'sink'", "'composer'", "'processor'", "'end'", "'rule'", 
			"'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", 
			"'?'", "'='", "'|'", "'>'", "'?('", "'test'", "'assert'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
			"SourceMarker", "DeleteMarker", "At", "Slash", "Colon", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "Zero", 
			"PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", 
			"END_REGEX", "StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING"
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
		case 14:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01a7\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u0153\n\65\3\66\6\66"+
		"\u0156\n\66\r\66\16\66\u0157\3\67\3\67\3\67\3\67\38\38\78\u0160\n8\f8"+
		"\168\u0163\138\39\39\3:\3:\5:\u0169\n:\3;\6;\u016c\n;\r;\16;\u016d\3;"+
		"\3;\3<\7<\u0173\n<\f<\16<\u0176\13<\3<\5<\u0179\n<\3<\3<\3<\3=\6=\u017f"+
		"\n=\r=\16=\u0180\3>\3>\3>\5>\u0186\n>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3B\6B\u0199\nB\rB\16B\u019a\3C\3C\3C\3C\3C\5C\u01a2\n"+
		"C\3D\3D\3D\3D\2\2E\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r"+
		"\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\33"+
		"8\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64"+
		"j\65l\66n\2p\67r8t\2v\2x9z:|;~\2\u0080<\u0082=\u0084>\u0086?\u0088\2\u008a"+
		"@\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u01a9\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2"+
		"\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2x\3\2\2\2\3z\3\2\2\2\4|\3\2\2\2\4"+
		"\u0080\3\2\2\2\5\u0082\3\2\2\2\5\u0084\3\2\2\2\5\u0086\3\2\2\2\5\u008a"+
		"\3\2\2\2\6\u008c\3\2\2\2\b\u0092\3\2\2\2\n\u009a\3\2\2\2\f\u00a1\3\2\2"+
		"\2\16\u00a7\3\2\2\2\20\u00ab\3\2\2\2\22\u00ae\3\2\2\2\24\u00b0\3\2\2\2"+
		"\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36"+
		"\u00ba\3\2\2\2 \u00bf\3\2\2\2\"\u00c2\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3"+
		"\2\2\2(\u00cc\3\2\2\2*\u00d0\3\2\2\2,\u00d2\3\2\2\2.\u00d6\3\2\2\2\60"+
		"\u00da\3\2\2\2\62\u00dc\3\2\2\2\64\u00de\3\2\2\2\66\u00e0\3\2\2\28\u00e2"+
		"\3\2\2\2:\u00e4\3\2\2\2<\u00e6\3\2\2\2>\u00f0\3\2\2\2@\u00f7\3\2\2\2B"+
		"\u00fc\3\2\2\2D\u0105\3\2\2\2F\u010f\3\2\2\2H\u0113\3\2\2\2J\u0118\3\2"+
		"\2\2L\u011e\3\2\2\2N\u0123\3\2\2\2P\u0125\3\2\2\2R\u0128\3\2\2\2T\u012a"+
		"\3\2\2\2V\u012c\3\2\2\2X\u012e\3\2\2\2Z\u0131\3\2\2\2\\\u0135\3\2\2\2"+
		"^\u0137\3\2\2\2`\u0139\3\2\2\2b\u013b\3\2\2\2d\u013d\3\2\2\2f\u0142\3"+
		"\2\2\2h\u0147\3\2\2\2j\u014e\3\2\2\2l\u0150\3\2\2\2n\u0155\3\2\2\2p\u0159"+
		"\3\2\2\2r\u015d\3\2\2\2t\u0164\3\2\2\2v\u0168\3\2\2\2x\u016b\3\2\2\2z"+
		"\u0174\3\2\2\2|\u017e\3\2\2\2~\u0185\3\2\2\2\u0080\u0187\3\2\2\2\u0082"+
		"\u018b\3\2\2\2\u0084\u0192\3\2\2\2\u0086\u0198\3\2\2\2\u0088\u01a1\3\2"+
		"\2\2\u008a\u01a3\3\2\2\2\u008c\u008d\7\61\2\2\u008d\u008e\7\61\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\b\2\2\2\u0090\u0091\b\2\3\2\u0091\7\3\2\2\2"+
		"\u0092\u0093\7r\2\2\u0093\u0094\7c\2\2\u0094\u0095\7e\2\2\u0095\u0096"+
		"\7m\2\2\u0096\u0097\7c\2\2\u0097\u0098\7i\2\2\u0098\u0099\7g\2\2\u0099"+
		"\t\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7v\2\2\u00a0\13\3\2\2\2\u00a1"+
		"\u00a2\7#\2\2\u00a2\u00a3\7X\2\2\u00a3\u00a4\7Q\2\2\u00a4\u00a5\7K\2\2"+
		"\u00a5\u00a6\7F\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7g"+
		"\2\2\u00a9\u00aa\7h\2\2\u00aa\17\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad"+
		"\7@\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7#\2\2\u00af\23\3\2\2\2\u00b0\u00b1"+
		"\7&\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7`\2\2\u00b3\27\3\2\2\2\u00b4\u00b5"+
		"\7B\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\33\3\2\2\2\u00b8\u00b9"+
		"\7<\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\7<\2\2\u00bb\u00bc\7<\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\5r8\2\u00be\37\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0"+
		"\u00c1\5r8\2\u00c1!\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3\u00c4\6\20\2\2\u00c4"+
		"\u00c5\b\20\4\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\20\5\2\u00c7#\3\2\2"+
		"\2\u00c8\u00c9\7=\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb\'\3\2\2"+
		"\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7\60\2\2\u00cf"+
		")\3\2\2\2\u00d0\u00d1\7\u0080\2\2\u00d1+\3\2\2\2\u00d2\u00d3\7*\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\b\25\6\2\u00d5-\3\2\2\2\u00d6\u00d7\7+\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\26\5\2\u00d9/\3\2\2\2\u00da\u00db\7"+
		"]\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7_\2\2\u00dd\63\3\2\2\2\u00de\u00df"+
		"\7}\2\2\u00df\65\3\2\2\2\u00e0\u00e1\7\177\2\2\u00e1\67\3\2\2\2\u00e2"+
		"\u00e3\7>\2\2\u00e39\3\2\2\2\u00e4\u00e5\7^\2\2\u00e5;\3\2\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7r\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7u\2\2\u00ef=\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7q\2"+
		"\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6?\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7m\2\2\u00fbA\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104C\3\2\2\2\u0105"+
		"\u0106\7r\2\2\u0106\u0107\7t\2\2\u0107\u0108\7q\2\2\u0108\u0109\7e\2\2"+
		"\u0109\u010a\7g\2\2\u010a\u010b\7u\2\2\u010b\u010c\7u\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7t\2\2\u010eE\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7f\2\2\u0112G\3\2\2\2\u0113\u0114\7t\2\2\u0114\u0115"+
		"\7w\2\2\u0115\u0116\7n\2\2\u0116\u0117\7g\2\2\u0117I\3\2\2\2\u0118\u0119"+
		"\7h\2\2\u0119\u011a\7k\2\2\u011a\u011b\7t\2\2\u011b\u011c\7u\2\2\u011c"+
		"\u011d\7v\2\2\u011dK\3\2\2\2\u011e\u011f\7n\2\2\u011f\u0120\7c\2\2\u0120"+
		"\u0121\7u\2\2\u0121\u0122\7v\2\2\u0122M\3\2\2\2\u0123\u0124\7%\2\2\u0124"+
		"O\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7\60\2\2\u0127Q\3\2\2\2\u0128"+
		"\u0129\7-\2\2\u0129S\3\2\2\2\u012a\u012b\7/\2\2\u012bU\3\2\2\2\u012c\u012d"+
		"\7,\2\2\u012dW\3\2\2\2\u012e\u012f\7\u0080\2\2\u012f\u0130\7\61\2\2\u0130"+
		"Y\3\2\2\2\u0131\u0132\7o\2\2\u0132\u0133\7q\2\2\u0133\u0134\7f\2\2\u0134"+
		"[\3\2\2\2\u0135\u0136\7A\2\2\u0136]\3\2\2\2\u0137\u0138\7?\2\2\u0138_"+
		"\3\2\2\2\u0139\u013a\7~\2\2\u013aa\3\2\2\2\u013b\u013c\7@\2\2\u013cc\3"+
		"\2\2\2\u013d\u013e\7A\2\2\u013e\u013f\7*\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b\61\6\2\u0141e\3\2\2\2\u0142\u0143\7v\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7u\2\2\u0145\u0146\7v\2\2\u0146g\3\2\2\2\u0147\u0148\7c\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014a\7u\2\2\u014a\u014b\7g\2\2\u014b\u014c\7t\2\2"+
		"\u014c\u014d\7v\2\2\u014di\3\2\2\2\u014e\u014f\7\62\2\2\u014fk\3\2\2\2"+
		"\u0150\u0152\t\2\2\2\u0151\u0153\5n\66\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153m\3\2\2\2\u0154\u0156\t\3\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158o\3\2\2\2"+
		"\u0159\u015a\7)\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\67\7\2\u015cq\3"+
		"\2\2\2\u015d\u0161\5t9\2\u015e\u0160\5v:\2\u015f\u015e\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162s\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\t\4\2\2\u0165u\3\2\2\2\u0166\u0169\5t9\2\u0167"+
		"\u0169\t\5\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169w\3\2\2\2"+
		"\u016a\u016c\t\6\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b;\2\2\u0170"+
		"y\3\2\2\2\u0171\u0173\n\7\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0179\t\b\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\b<\2\2\u017b\u017c\b<\5\2\u017c{\3\2\2\2\u017d\u017f\5~>\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181}\3\2\2\2\u0182\u0183\7)\2\2\u0183\u0186\7)\2\2\u0184\u0186"+
		"\n\t\2\2\u0185\u0182\3\2\2\2\u0185\u0184\3\2\2\2\u0186\177\3\2\2\2\u0187"+
		"\u0188\7)\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b?\5\2\u018a\u0081\3\2\2"+
		"\2\u018b\u018c\7&\2\2\u018c\u018d\7%\2\2\u018d\u018e\3\2\2\2\u018e\u018f"+
		"\b@\b\2\u018f\u0190\3\2\2\2\u0190\u0191\b@\6\2\u0191\u0083\3\2\2\2\u0192"+
		"\u0193\7&\2\2\u0193\u0194\bA\t\2\u0194\u0195\3\2\2\2\u0195\u0196\bA\6"+
		"\2\u0196\u0085\3\2\2\2\u0197\u0199\5\u0088C\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0087\3\2"+
		"\2\2\u019c\u019d\7)\2\2\u019d\u01a2\7)\2\2\u019e\u019f\7&\2\2\u019f\u01a2"+
		"\7&\2\2\u01a0\u01a2\n\n\2\2\u01a1\u019c\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u0089\3\2\2\2\u01a3\u01a4\7)\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\bD\5\2\u01a6\u008b\3\2\2\2\21\2\3\4\5\u0152\u0157\u0161"+
		"\u0168\u016d\u0174\u0178\u0180\u0185\u019a\u01a1\n\b\2\2\7\3\2\3\20\2"+
		"\6\2\2\7\2\2\7\5\2\3@\3\3A\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}