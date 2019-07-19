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
		StartComment=1, Package=2, Import=3, Stdout=4, Stdin=5, Void=6, Def=7, 
		To=8, ResultMarker=9, At=10, NamedAt=11, Colon=12, Key=13, Message=14, 
		FieldReference=15, EndStringInterpolate=16, SemiColon=17, Comma=18, Deconstructor=19, 
		Merge=20, DeleteState=21, Invert=22, LeftParen=23, RightParen=24, LeftBracket=25, 
		RightBracket=26, LeftBrace=27, RightBrace=28, StartMatcher=29, StartTemplatesDefinition=30, 
		StartComposerDefinition=31, StartProcessorDefinition=32, EndDefinition=33, 
		TemplateMatch=34, Dereference=35, Range=36, Plus=37, Minus=38, Star=39, 
		Slash=40, Mod=41, Question=42, Equal=43, Zero=44, PositiveInteger=45, 
		START_STRING=46, IDENTIFIER=47, WS=48, Else=49, EndMatcher=50, BeginSuchThat=51, 
		Comment=52, REGEX_TEXT=53, END_REGEX=54, StartStringEvaluate=55, StartCharacterCode=56, 
		STRING_TEXT=57, END_STRING=58;
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
			"StartComment", "Package", "Import", "Stdout", "Stdin", "Void", "Def", 
			"To", "ResultMarker", "At", "NamedAt", "Colon", "Key", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Merge", 
			"DeleteState", "Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "Dereference", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Else", "EndMatcher", 
			"BeginSuchThat", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartStringEvaluate", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'stdout'", "'stdin'", "'void'", 
			null, "'->'", "'!'", "'@'", null, "':'", null, null, null, null, "';'", 
			"','", "'...'", "'..|'", null, "'~'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'templates'", "'composer'", "'processor'", "'end'", "'#'", 
			null, "'..'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", 
			null, null, null, null, "'|'", "'>'", "'?('", null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Stdout", "Stdin", "Void", 
			"Def", "To", "ResultMarker", "At", "NamedAt", "Colon", "Key", "Message", 
			"FieldReference", "EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", 
			"Merge", "DeleteState", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "Dereference", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "StartCharacterCode", 
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
		case 15:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
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
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u019a\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\5\26\u00e0\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\5$\u011b\n$\3$\5$\u011e"+
		"\n$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\5.\u0137\n.\3/\6/\u013a\n/\r/\16/\u013b\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\7\61\u0144\n\61\f\61\16\61\u0147\13\61\3\62\3\62\3\63\3\63\5\63"+
		"\u014d\n\63\3\64\6\64\u0150\n\64\r\64\16\64\u0151\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\78\u0160\n8\f8\168\u0163\138\3"+
		"8\58\u0166\n8\38\38\38\39\69\u016c\n9\r9\169\u016d\3:\3:\3:\5:\u0173\n"+
		":\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		"?\6?\u018c\n?\r?\16?\u018d\3@\3@\3@\3@\3@\5@\u0195\n@\3A\3A\3A\3A\2\2"+
		"B\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20"+
		"\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37"+
		"@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\2b\60d\61f\2h\2j\62l\63n\64p\65r"+
		"\66t\67v\2x8z9|:~\2\u0080;\u0082\2\u0084<\6\2\3\4\5\13\5\2\13\f\17\17"+
		"\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\61;aa\3\2\f\f\3\3\f\f\3\2))\4\2&&))"+
		"\2\u019f\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2"+
		"&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62"+
		"\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2"+
		">\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3"+
		"\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2"+
		"\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2"+
		"\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\3r\3\2\2\2\4t\3\2\2\2\4x"+
		"\3\2\2\2\5z\3\2\2\2\5|\3\2\2\2\5~\3\2\2\2\5\u0080\3\2\2\2\5\u0084\3\2"+
		"\2\2\6\u0086\3\2\2\2\b\u008c\3\2\2\2\n\u0094\3\2\2\2\f\u009b\3\2\2\2\16"+
		"\u00a2\3\2\2\2\20\u00a8\3\2\2\2\22\u00ad\3\2\2\2\24\u00b3\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00c2\3\2\2\2\"\u00c7\3\2\2\2$\u00ca\3\2\2\2&\u00d0\3\2\2\2(\u00d2"+
		"\3\2\2\2*\u00d4\3\2\2\2,\u00d8\3\2\2\2.\u00dc\3\2\2\2\60\u00e1\3\2\2\2"+
		"\62\u00e3\3\2\2\2\64\u00e7\3\2\2\2\66\u00eb\3\2\2\28\u00ed\3\2\2\2:\u00ef"+
		"\3\2\2\2<\u00f1\3\2\2\2>\u00f3\3\2\2\2@\u00f5\3\2\2\2B\u00ff\3\2\2\2D"+
		"\u0108\3\2\2\2F\u0112\3\2\2\2H\u0116\3\2\2\2J\u0118\3\2\2\2L\u011f\3\2"+
		"\2\2N\u0122\3\2\2\2P\u0124\3\2\2\2R\u0126\3\2\2\2T\u0128\3\2\2\2V\u012a"+
		"\3\2\2\2X\u012e\3\2\2\2Z\u0130\3\2\2\2\\\u0132\3\2\2\2^\u0134\3\2\2\2"+
		"`\u0139\3\2\2\2b\u013d\3\2\2\2d\u0141\3\2\2\2f\u0148\3\2\2\2h\u014c\3"+
		"\2\2\2j\u014f\3\2\2\2l\u0155\3\2\2\2n\u0157\3\2\2\2p\u0159\3\2\2\2r\u0161"+
		"\3\2\2\2t\u016b\3\2\2\2v\u0172\3\2\2\2x\u0174\3\2\2\2z\u0178\3\2\2\2|"+
		"\u017d\3\2\2\2~\u0184\3\2\2\2\u0080\u018b\3\2\2\2\u0082\u0194\3\2\2\2"+
		"\u0084\u0196\3\2\2\2\u0086\u0087\7\61\2\2\u0087\u0088\7\61\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\b\2\2\2\u008a\u008b\b\2\3\2\u008b\7\3\2\2\2\u008c"+
		"\u008d\7r\2\2\u008d\u008e\7c\2\2\u008e\u008f\7e\2\2\u008f\u0090\7m\2\2"+
		"\u0090\u0091\7c\2\2\u0091\u0092\7i\2\2\u0092\u0093\7g\2\2\u0093\t\3\2"+
		"\2\2\u0094\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7r\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7v\2\2\u009a\13\3\2\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7f\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7\17\3\2\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7"+
		"k\2\2\u00ab\u00ac\7f\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2"+
		"\23\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\7@\2\2\u00b5\25\3\2\2\2\u00b6"+
		"\u00b7\7#\2\2\u00b7\27\3\2\2\2\u00b8\u00b9\7B\2\2\u00b9\31\3\2\2\2\u00ba"+
		"\u00bb\7B\2\2\u00bb\u00bc\5d\61\2\u00bc\33\3\2\2\2\u00bd\u00be\7<\2\2"+
		"\u00be\35\3\2\2\2\u00bf\u00c0\5d\61\2\u00c0\u00c1\7<\2\2\u00c1\37\3\2"+
		"\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\5d\61\2\u00c6!\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00c9\5d\61\2\u00c9"+
		"#\3\2\2\2\u00ca\u00cb\7=\2\2\u00cb\u00cc\6\21\2\2\u00cc\u00cd\b\21\4\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\21\5\2\u00cf%\3\2\2\2\u00d0\u00d1\7"+
		"=\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3)\3\2\2\2\u00d4\u00d5\7"+
		"\60\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\7\60\2\2\u00d7+\3\2\2\2\u00d8"+
		"\u00d9\7\60\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7~\2\2\u00db-\3\2\2\2"+
		"\u00dc\u00dd\7`\2\2\u00dd\u00df\5\30\13\2\u00de\u00e0\5d\61\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0/\3\2\2\2\u00e1\u00e2\7\u0080\2\2\u00e2"+
		"\61\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\30\6"+
		"\2\u00e6\63\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\b\31\5\2\u00ea\65\3\2\2\2\u00eb\u00ec\7]\2\2\u00ec\67\3\2\2\2\u00ed\u00ee"+
		"\7_\2\2\u00ee9\3\2\2\2\u00ef\u00f0\7}\2\2\u00f0;\3\2\2\2\u00f1\u00f2\7"+
		"\177\2\2\u00f2=\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4?\3\2\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7r\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u00fe\7u\2\2\u00feA\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7q\2"+
		"\2\u0101\u0102\7o\2\2\u0102\u0103\7r\2\2\u0103\u0104\7q\2\2\u0104\u0105"+
		"\7u\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107C\3\2\2\2\u0108\u0109"+
		"\7r\2\2\u0109\u010a\7t\2\2\u010a\u010b\7q\2\2\u010b\u010c\7e\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7u\2\2\u010e\u010f\7u\2\2\u010f\u0110\7q\2\2"+
		"\u0110\u0111\7t\2\2\u0111E\3\2\2\2\u0112\u0113\7g\2\2\u0113\u0114\7p\2"+
		"\2\u0114\u0115\7f\2\2\u0115G\3\2\2\2\u0116\u0117\7%\2\2\u0117I\3\2\2\2"+
		"\u0118\u011a\7&\2\2\u0119\u011b\5\30\13\2\u011a\u0119\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5d\61\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eK\3\2\2\2\u011f\u0120\7\60\2\2\u0120\u0121\7\60\2"+
		"\2\u0121M\3\2\2\2\u0122\u0123\7-\2\2\u0123O\3\2\2\2\u0124\u0125\7/\2\2"+
		"\u0125Q\3\2\2\2\u0126\u0127\7,\2\2\u0127S\3\2\2\2\u0128\u0129\7\61\2\2"+
		"\u0129U\3\2\2\2\u012a\u012b\7o\2\2\u012b\u012c\7q\2\2\u012c\u012d\7f\2"+
		"\2\u012dW\3\2\2\2\u012e\u012f\7A\2\2\u012fY\3\2\2\2\u0130\u0131\7?\2\2"+
		"\u0131[\3\2\2\2\u0132\u0133\7\62\2\2\u0133]\3\2\2\2\u0134\u0136\t\3\2"+
		"\2\u0135\u0137\5`/\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137_\3"+
		"\2\2\2\u0138\u013a\t\4\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013ca\3\2\2\2\u013d\u013e\7)\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\b\60\7\2\u0140c\3\2\2\2\u0141\u0145\5f\62\2"+
		"\u0142\u0144\5h\63\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146e\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\t\5\2\2\u0149g\3\2\2\2\u014a\u014d\5f\62\2\u014b\u014d\t\6\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014di\3\2\2\2\u014e\u0150\t"+
		"\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\64\2\2\u0154k\3\2\2\2"+
		"\u0155\u0156\7~\2\2\u0156m\3\2\2\2\u0157\u0158\7@\2\2\u0158o\3\2\2\2\u0159"+
		"\u015a\7A\2\2\u015a\u015b\7*\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b\67"+
		"\6\2\u015dq\3\2\2\2\u015e\u0160\n\7\2\2\u015f\u015e\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0166\t\b\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\b8\2\2\u0168\u0169\b8\5\2\u0169s\3\2\2\2\u016a\u016c"+
		"\5v:\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016eu\3\2\2\2\u016f\u0170\7)\2\2\u0170\u0173\7)\2\2\u0171"+
		"\u0173\n\t\2\2\u0172\u016f\3\2\2\2\u0172\u0171\3\2\2\2\u0173w\3\2\2\2"+
		"\u0174\u0175\7)\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b;\5\2\u0177y\3\2"+
		"\2\2\u0178\u0179\7&\2\2\u0179\u017a\7*\2\2\u017a\u017b\3\2\2\2\u017b\u017c"+
		"\b<\6\2\u017c{\3\2\2\2\u017d\u017e\7&\2\2\u017e\u017f\7%\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\b=\b\2\u0181\u0182\3\2\2\2\u0182\u0183\b=\6\2\u0183"+
		"}\3\2\2\2\u0184\u0185\5J$\2\u0185\u0186\b>\t\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\b>\6\2\u0188\u0189\b>\n\2\u0189\177\3\2\2\2\u018a\u018c\5\u0082"+
		"@\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0081\3\2\2\2\u018f\u0190\7)\2\2\u0190\u0195\7)\2"+
		"\2\u0191\u0192\7&\2\2\u0192\u0195\7&\2\2\u0193\u0195\n\n\2\2\u0194\u018f"+
		"\3\2\2\2\u0194\u0191\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0083\3\2\2\2\u0196"+
		"\u0197\7)\2\2\u0197\u0198\3\2\2\2\u0198\u0199\bA\5\2\u0199\u0085\3\2\2"+
		"\2\24\2\3\4\5\u00df\u011a\u011d\u0136\u013b\u0145\u014c\u0151\u0161\u0165"+
		"\u016d\u0172\u018d\u0194\13\b\2\2\7\3\2\3\21\2\6\2\2\7\2\2\7\5\2\3=\3"+
		"\3>\4\t%\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}