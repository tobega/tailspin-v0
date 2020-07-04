// Generated from /Users/tobe/tobega/tailspin-v0/TailspinLexer.g4 by ANTLR 4.8
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
		StartComment=1, Package=2, Import=3, Void=4, Def=5, When=6, Do=7, To=8, 
		ResultMarker=9, SourceMarker=10, DeleteMarker=11, At=12, Slash=13, Colon=14, 
		Message=15, FieldReference=16, EndStringInterpolate=17, SemiColon=18, 
		Comma=19, Deconstructor=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, Lambda=29, 
		StartTemplatesDefinition=30, StartSourceDefinition=31, StartSinkDefinition=32, 
		StartComposerDefinition=33, StartProcessorDefinition=34, EndDefinition=35, 
		Rule=36, First=37, Last=38, TemplateMatch=39, Range=40, Plus=41, Minus=42, 
		Star=43, TruncateDivide=44, Mod=45, Question=46, Equal=47, Else=48, EndMatcher=49, 
		BeginCondition=50, StartTestDefinition=51, Assert=52, Zero=53, PositiveInteger=54, 
		START_STRING=55, IDENTIFIER=56, WS=57, Comment=58, REGEX_TEXT=59, END_REGEX=60, 
		StartCharacterCode=61, StartStringInterpolate=62, STRING_TEXT=63, END_STRING=64;
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
			"StartComment", "Package", "Import", "Void", "Def", "When", "Do", "To", 
			"ResultMarker", "SourceMarker", "DeleteMarker", "At", "Slash", "Colon", 
			"Message", "FieldReference", "EndStringInterpolate", "SemiColon", "Comma", 
			"Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "Zero", "PositiveInteger", "Digits", 
			"START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'VOID'", "'def'", "'when'", "'do'", 
			"'->'", "'!'", "'$'", "'^'", "'@'", "'/'", "':'", null, null, null, "';'", 
			"','", "'...'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'\\'", "'templates'", "'source'", "'sink'", "'composer'", "'processor'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", "'test'", 
			"'assert'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Void", "Def", "When", "Do", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "At", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Comment", "REGEX_TEXT", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING"
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
		case 64:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01b2\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\5\67\u015e\n\67\38\68\u0161\n8\r8\168\u0162\39\39\39\39\3:"+
		"\3:\7:\u016b\n:\f:\16:\u016e\13:\3;\3;\3<\3<\5<\u0174\n<\3=\6=\u0177\n"+
		"=\r=\16=\u0178\3=\3=\3>\7>\u017e\n>\f>\16>\u0181\13>\3>\5>\u0184\n>\3"+
		">\3>\3>\3?\6?\u018a\n?\r?\16?\u018b\3@\3@\3@\5@\u0191\n@\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\6D\u01a4\nD\rD\16D\u01a5\3E\3E\3"+
		"E\3E\3E\5E\u01ad\nE\3F\3F\3F\3F\2\2G\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24"+
		"\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30"+
		"\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/"+
		"`\60b\61d\62f\63h\64j\65l\66n\67p8r\2t9v:x\2z\2|;~<\u0080=\u0082\2\u0084"+
		">\u0086?\u0088@\u008aA\u008c\2\u008eB\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2"+
		"C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u01b4"+
		"\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2"+
		"\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2"+
		"\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2"+
		"\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2"+
		"\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2"+
		"\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2"+
		"L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3"+
		"\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2"+
		"\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2"+
		"\2t\3\2\2\2\2v\3\2\2\2\2|\3\2\2\2\3~\3\2\2\2\4\u0080\3\2\2\2\4\u0084\3"+
		"\2\2\2\5\u0086\3\2\2\2\5\u0088\3\2\2\2\5\u008a\3\2\2\2\5\u008e\3\2\2\2"+
		"\6\u0090\3\2\2\2\b\u0096\3\2\2\2\n\u009e\3\2\2\2\f\u00a5\3\2\2\2\16\u00aa"+
		"\3\2\2\2\20\u00ae\3\2\2\2\22\u00b3\3\2\2\2\24\u00b6\3\2\2\2\26\u00b9\3"+
		"\2\2\2\30\u00bb\3\2\2\2\32\u00bd\3\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2"+
		"\2\2 \u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u00ca\3\2\2\2&\u00cd\3\2\2\2(\u00d3"+
		"\3\2\2\2*\u00d5\3\2\2\2,\u00d7\3\2\2\2.\u00db\3\2\2\2\60\u00dd\3\2\2\2"+
		"\62\u00e1\3\2\2\2\64\u00e5\3\2\2\2\66\u00e7\3\2\2\28\u00e9\3\2\2\2:\u00eb"+
		"\3\2\2\2<\u00ed\3\2\2\2>\u00ef\3\2\2\2@\u00f1\3\2\2\2B\u00fb\3\2\2\2D"+
		"\u0102\3\2\2\2F\u0107\3\2\2\2H\u0110\3\2\2\2J\u011a\3\2\2\2L\u011e\3\2"+
		"\2\2N\u0123\3\2\2\2P\u0129\3\2\2\2R\u012e\3\2\2\2T\u0130\3\2\2\2V\u0133"+
		"\3\2\2\2X\u0135\3\2\2\2Z\u0137\3\2\2\2\\\u0139\3\2\2\2^\u013c\3\2\2\2"+
		"`\u0140\3\2\2\2b\u0142\3\2\2\2d\u0144\3\2\2\2f\u0146\3\2\2\2h\u0148\3"+
		"\2\2\2j\u014d\3\2\2\2l\u0152\3\2\2\2n\u0159\3\2\2\2p\u015b\3\2\2\2r\u0160"+
		"\3\2\2\2t\u0164\3\2\2\2v\u0168\3\2\2\2x\u016f\3\2\2\2z\u0173\3\2\2\2|"+
		"\u0176\3\2\2\2~\u017f\3\2\2\2\u0080\u0189\3\2\2\2\u0082\u0190\3\2\2\2"+
		"\u0084\u0192\3\2\2\2\u0086\u0196\3\2\2\2\u0088\u019d\3\2\2\2\u008a\u01a3"+
		"\3\2\2\2\u008c\u01ac\3\2\2\2\u008e\u01ae\3\2\2\2\u0090\u0091\7\61\2\2"+
		"\u0091\u0092\7\61\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\2\2\2\u0094\u0095"+
		"\b\2\3\2\u0095\7\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098\7c\2\2\u0098\u0099"+
		"\7e\2\2\u0099\u009a\7m\2\2\u009a\u009b\7c\2\2\u009b\u009c\7i\2\2\u009c"+
		"\u009d\7g\2\2\u009d\t\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7o\2\2\u00a0"+
		"\u00a1\7r\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\13\3\2\2\2\u00a5\u00a6\7X\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7"+
		"K\2\2\u00a8\u00a9\7F\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7h\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0"+
		"\7j\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\21\3\2\2\2\u00b3\u00b4"+
		"\7f\2\2\u00b4\u00b5\7q\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8"+
		"\7@\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\27\3\2\2\2\u00bb\u00bc"+
		"\7&\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7`\2\2\u00be\33\3\2\2\2\u00bf\u00c0"+
		"\7B\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\37\3\2\2\2\u00c3\u00c4"+
		"\7<\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7\7<\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\5v:\2\u00c9#\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc"+
		"\5v:\2\u00cc%\3\2\2\2\u00cd\u00ce\7=\2\2\u00ce\u00cf\6\22\2\2\u00cf\u00d0"+
		"\b\22\4\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\22\5\2\u00d2\'\3\2\2\2\u00d3"+
		"\u00d4\7=\2\2\u00d4)\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6+\3\2\2\2\u00d7\u00d8"+
		"\7\60\2\2\u00d8\u00d9\7\60\2\2\u00d9\u00da\7\60\2\2\u00da-\3\2\2\2\u00db"+
		"\u00dc\7\u0080\2\2\u00dc/\3\2\2\2\u00dd\u00de\7*\2\2\u00de\u00df\3\2\2"+
		"\2\u00df\u00e0\b\27\6\2\u00e0\61\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\b\30\5\2\u00e4\63\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6"+
		"\65\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8\67\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea"+
		"9\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec;\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee"+
		"=\3\2\2\2\u00ef\u00f0\7^\2\2\u00f0?\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3"+
		"\7g\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7u\2\2"+
		"\u00faA\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7w\2"+
		"\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7g\2\2\u0101C\3\2"+
		"\2\2\u0102\u0103\7u\2\2\u0103\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106"+
		"\7m\2\2\u0106E\3\2\2\2\u0107\u0108\7e\2\2\u0108\u0109\7q\2\2\u0109\u010a"+
		"\7o\2\2\u010a\u010b\7r\2\2\u010b\u010c\7q\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7t\2\2\u010fG\3\2\2\2\u0110\u0111\7r\2\2\u0111"+
		"\u0112\7t\2\2\u0112\u0113\7q\2\2\u0113\u0114\7e\2\2\u0114\u0115\7g\2\2"+
		"\u0115\u0116\7u\2\2\u0116\u0117\7u\2\2\u0117\u0118\7q\2\2\u0118\u0119"+
		"\7t\2\2\u0119I\3\2\2\2\u011a\u011b\7g\2\2\u011b\u011c\7p\2\2\u011c\u011d"+
		"\7f\2\2\u011dK\3\2\2\2\u011e\u011f\7t\2\2\u011f\u0120\7w\2\2\u0120\u0121"+
		"\7n\2\2\u0121\u0122\7g\2\2\u0122M\3\2\2\2\u0123\u0124\7h\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7t\2\2\u0126\u0127\7u\2\2\u0127\u0128\7v\2\2\u0128"+
		"O\3\2\2\2\u0129\u012a\7n\2\2\u012a\u012b\7c\2\2\u012b\u012c\7u\2\2\u012c"+
		"\u012d\7v\2\2\u012dQ\3\2\2\2\u012e\u012f\7%\2\2\u012fS\3\2\2\2\u0130\u0131"+
		"\7\60\2\2\u0131\u0132\7\60\2\2\u0132U\3\2\2\2\u0133\u0134\7-\2\2\u0134"+
		"W\3\2\2\2\u0135\u0136\7/\2\2\u0136Y\3\2\2\2\u0137\u0138\7,\2\2\u0138["+
		"\3\2\2\2\u0139\u013a\7\u0080\2\2\u013a\u013b\7\61\2\2\u013b]\3\2\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7q\2\2\u013e\u013f\7f\2\2\u013f_\3\2\2\2\u0140"+
		"\u0141\7A\2\2\u0141a\3\2\2\2\u0142\u0143\7?\2\2\u0143c\3\2\2\2\u0144\u0145"+
		"\7~\2\2\u0145e\3\2\2\2\u0146\u0147\7@\2\2\u0147g\3\2\2\2\u0148\u0149\7"+
		"A\2\2\u0149\u014a\7*\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b\63\6\2\u014c"+
		"i\3\2\2\2\u014d\u014e\7v\2\2\u014e\u014f\7g\2\2\u014f\u0150\7u\2\2\u0150"+
		"\u0151\7v\2\2\u0151k\3\2\2\2\u0152\u0153\7c\2\2\u0153\u0154\7u\2\2\u0154"+
		"\u0155\7u\2\2\u0155\u0156\7g\2\2\u0156\u0157\7t\2\2\u0157\u0158\7v\2\2"+
		"\u0158m\3\2\2\2\u0159\u015a\7\62\2\2\u015ao\3\2\2\2\u015b\u015d\t\2\2"+
		"\2\u015c\u015e\5r8\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015eq\3"+
		"\2\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163s\3\2\2\2\u0164\u0165\7)\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\b9\7\2\u0167u\3\2\2\2\u0168\u016c\5x;\2\u0169"+
		"\u016b\5z<\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2"+
		"\2\u016c\u016d\3\2\2\2\u016dw\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170"+
		"\t\4\2\2\u0170y\3\2\2\2\u0171\u0174\5x;\2\u0172\u0174\t\5\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174{\3\2\2\2\u0175\u0177\t\6\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b=\2\2\u017b}\3\2\2\2\u017c\u017e"+
		"\n\7\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\t\b"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b>\2\2\u0186"+
		"\u0187\b>\5\2\u0187\177\3\2\2\2\u0188\u018a\5\u0082@\2\u0189\u0188\3\2"+
		"\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u0081\3\2\2\2\u018d\u018e\7)\2\2\u018e\u0191\7)\2\2\u018f\u0191\n\t\2"+
		"\2\u0190\u018d\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0083\3\2\2\2\u0192\u0193"+
		"\7)\2\2\u0193\u0194\3\2\2\2\u0194\u0195\bA\5\2\u0195\u0085\3\2\2\2\u0196"+
		"\u0197\7&\2\2\u0197\u0198\7%\2\2\u0198\u0199\3\2\2\2\u0199\u019a\bB\b"+
		"\2\u019a\u019b\3\2\2\2\u019b\u019c\bB\6\2\u019c\u0087\3\2\2\2\u019d\u019e"+
		"\7&\2\2\u019e\u019f\bC\t\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\bC\6\2\u01a1"+
		"\u0089\3\2\2\2\u01a2\u01a4\5\u008cE\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u008b\3\2\2\2\u01a7"+
		"\u01a8\7)\2\2\u01a8\u01ad\7)\2\2\u01a9\u01aa\7&\2\2\u01aa\u01ad\7&\2\2"+
		"\u01ab\u01ad\n\n\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ad\u008d\3\2\2\2\u01ae\u01af\7)\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\bF\5\2\u01b1\u008f\3\2\2\2\21\2\3\4\5\u015d\u0162\u016c\u0173\u0178"+
		"\u017f\u0183\u018b\u0190\u01a5\u01ac\n\b\2\2\7\3\2\3\22\2\6\2\2\7\2\2"+
		"\7\5\2\3B\3\3C\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}