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
		DeleteState=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, StartTemplatesDefinition=29, 
		StartComposerDefinition=30, StartProcessorDefinition=31, EndDefinition=32, 
		TemplateMatch=33, Dereference=34, Range=35, Plus=36, Minus=37, Star=38, 
		Slash=39, Mod=40, Question=41, Equal=42, Zero=43, PositiveInteger=44, 
		START_STRING=45, IDENTIFIER=46, WS=47, Else=48, EndMatcher=49, BeginSuchThat=50, 
		Comment=51, REGEX_TEXT=52, END_REGEX=53, StartStringEvaluate=54, STRING_TEXT=55, 
		END_STRING=56;
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
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "DeleteState", 
			"Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "EndDefinition", "TemplateMatch", "Dereference", 
			"Range", "Plus", "Minus", "Star", "Slash", "Mod", "Question", "Equal", 
			"Zero", "PositiveInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'stdout'", "'stdin'", "'void'", 
			null, "'->'", "'!'", "'@'", null, "':'", null, null, null, null, "';'", 
			"','", "'...'", null, "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'<'", "'templates'", "'composer'", "'processor'", "'end'", "'#'", null, 
			"'..'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", null, 
			null, null, null, "'|'", "'>'", "'?('", null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Stdout", "Stdin", "Void", 
			"Def", "To", "ResultMarker", "At", "NamedAt", "Colon", "Key", "Message", 
			"FieldReference", "EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", 
			"DeleteState", "Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "Dereference", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "STRING_TEXT", "END_STRING"
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
		case 58:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u018b\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00d8\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\5#\u0113\n#\3#\5#\u0116\n#\3$\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u012f"+
		"\n-\3.\6.\u0132\n.\r.\16.\u0133\3/\3/\3/\3/\3\60\3\60\7\60\u013c\n\60"+
		"\f\60\16\60\u013f\13\60\3\61\3\61\3\62\3\62\5\62\u0145\n\62\3\63\6\63"+
		"\u0148\n\63\r\63\16\63\u0149\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\7\67\u0158\n\67\f\67\16\67\u015b\13\67\3\67\5\67\u015e"+
		"\n\67\3\67\3\67\3\67\38\68\u0164\n8\r8\168\u0165\39\39\39\59\u016b\n9"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\6=\u017d\n=\r=\16=\u017e"+
		"\3>\3>\3>\3>\3>\5>\u0186\n>\3?\3?\3?\3?\2\2@\6\3\b\4\n\5\f\6\16\7\20\b"+
		"\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27"+
		"\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z"+
		"-\\.^\2`/b\60d\2f\2h\61j\62l\63n\64p\65r\66t\2v\67x8z\2|9~\2\u0080:\6"+
		"\2\3\4\5\13\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\61;aa\3\2"+
		"\f\f\3\3\f\f\3\2))\4\2&&))\2\u0190\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2"+
		"\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2`\3"+
		"\2\2\2\2b\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\3p\3\2\2"+
		"\2\4r\3\2\2\2\4v\3\2\2\2\5x\3\2\2\2\5z\3\2\2\2\5|\3\2\2\2\5\u0080\3\2"+
		"\2\2\6\u0082\3\2\2\2\b\u0088\3\2\2\2\n\u0090\3\2\2\2\f\u0097\3\2\2\2\16"+
		"\u009e\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2\2\2\24\u00af\3\2\2\2\26\u00b2"+
		"\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00b9\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00be\3\2\2\2\"\u00c3\3\2\2\2$\u00c6\3\2\2\2&\u00cc\3\2\2\2(\u00ce"+
		"\3\2\2\2*\u00d0\3\2\2\2,\u00d4\3\2\2\2.\u00d9\3\2\2\2\60\u00db\3\2\2\2"+
		"\62\u00df\3\2\2\2\64\u00e3\3\2\2\2\66\u00e5\3\2\2\28\u00e7\3\2\2\2:\u00e9"+
		"\3\2\2\2<\u00eb\3\2\2\2>\u00ed\3\2\2\2@\u00f7\3\2\2\2B\u0100\3\2\2\2D"+
		"\u010a\3\2\2\2F\u010e\3\2\2\2H\u0110\3\2\2\2J\u0117\3\2\2\2L\u011a\3\2"+
		"\2\2N\u011c\3\2\2\2P\u011e\3\2\2\2R\u0120\3\2\2\2T\u0122\3\2\2\2V\u0126"+
		"\3\2\2\2X\u0128\3\2\2\2Z\u012a\3\2\2\2\\\u012c\3\2\2\2^\u0131\3\2\2\2"+
		"`\u0135\3\2\2\2b\u0139\3\2\2\2d\u0140\3\2\2\2f\u0144\3\2\2\2h\u0147\3"+
		"\2\2\2j\u014d\3\2\2\2l\u014f\3\2\2\2n\u0151\3\2\2\2p\u0159\3\2\2\2r\u0163"+
		"\3\2\2\2t\u016a\3\2\2\2v\u016c\3\2\2\2x\u0170\3\2\2\2z\u0175\3\2\2\2|"+
		"\u017c\3\2\2\2~\u0185\3\2\2\2\u0080\u0187\3\2\2\2\u0082\u0083\7\61\2\2"+
		"\u0083\u0084\7\61\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086\u0087"+
		"\b\2\3\2\u0087\7\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7e\2\2\u008b\u008c\7m\2\2\u008c\u008d\7c\2\2\u008d\u008e\7i\2\2\u008e"+
		"\u008f\7g\2\2\u008f\t\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2"+
		"\u0096\13\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7"+
		"f\2\2\u009a\u009b\7q\2\2\u009b\u009c\7w\2\2\u009c\u009d\7v\2\2\u009d\r"+
		"\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7x\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7f\2\2\u00a8\21\3\2\2\2\u00a9"+
		"\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00ae\t\2\2\2\u00ae\23\3\2\2\2\u00af\u00b0\7/\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\27\3\2\2\2\u00b4\u00b5"+
		"\7B\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b8\5b\60\2\u00b8"+
		"\33\3\2\2\2\u00b9\u00ba\7<\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\5b\60\2\u00bc"+
		"\u00bd\7<\2\2\u00bd\37\3\2\2\2\u00be\u00bf\7<\2\2\u00bf\u00c0\7<\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\5b\60\2\u00c2!\3\2\2\2\u00c3\u00c4\7\60\2\2"+
		"\u00c4\u00c5\5b\60\2\u00c5#\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7\u00c8\6\21"+
		"\2\2\u00c8\u00c9\b\21\4\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\21\5\2\u00cb"+
		"%\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd\'\3\2\2\2\u00ce\u00cf\7.\2\2\u00cf"+
		")\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d3\7\60\2"+
		"\2\u00d3+\3\2\2\2\u00d4\u00d5\7`\2\2\u00d5\u00d7\5\30\13\2\u00d6\u00d8"+
		"\5b\60\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8-\3\2\2\2\u00d9"+
		"\u00da\7\u0080\2\2\u00da/\3\2\2\2\u00db\u00dc\7*\2\2\u00dc\u00dd\3\2\2"+
		"\2\u00dd\u00de\b\27\6\2\u00de\61\3\2\2\2\u00df\u00e0\7+\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\b\30\5\2\u00e2\63\3\2\2\2\u00e3\u00e4\7]\2\2\u00e4"+
		"\65\3\2\2\2\u00e5\u00e6\7_\2\2\u00e6\67\3\2\2\2\u00e7\u00e8\7}\2\2\u00e8"+
		"9\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea;\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec"+
		"=\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7o\2\2\u00f0"+
		"\u00f1\7r\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7v\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7u\2\2\u00f6?\3\2\2\2\u00f7\u00f8\7e\2"+
		"\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"A\3\2\2\2\u0100\u0101\7r\2\2\u0101\u0102\7t\2\2\u0102\u0103\7q\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7g\2\2\u0105\u0106\7u\2\2\u0106\u0107\7u\2\2"+
		"\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109C\3\2\2\2\u010a\u010b\7g\2"+
		"\2\u010b\u010c\7p\2\2\u010c\u010d\7f\2\2\u010dE\3\2\2\2\u010e\u010f\7"+
		"%\2\2\u010fG\3\2\2\2\u0110\u0112\7&\2\2\u0111\u0113\5\30\13\2\u0112\u0111"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5b\60\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116I\3\2\2\2\u0117\u0118\7\60\2\2"+
		"\u0118\u0119\7\60\2\2\u0119K\3\2\2\2\u011a\u011b\7-\2\2\u011bM\3\2\2\2"+
		"\u011c\u011d\7/\2\2\u011dO\3\2\2\2\u011e\u011f\7,\2\2\u011fQ\3\2\2\2\u0120"+
		"\u0121\7\61\2\2\u0121S\3\2\2\2\u0122\u0123\7o\2\2\u0123\u0124\7q\2\2\u0124"+
		"\u0125\7f\2\2\u0125U\3\2\2\2\u0126\u0127\7A\2\2\u0127W\3\2\2\2\u0128\u0129"+
		"\7?\2\2\u0129Y\3\2\2\2\u012a\u012b\7\62\2\2\u012b[\3\2\2\2\u012c\u012e"+
		"\t\3\2\2\u012d\u012f\5^.\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"]\3\2\2\2\u0130\u0132\t\4\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134_\3\2\2\2\u0135\u0136\7"+
		")\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b/\7\2\u0138a\3\2\2\2\u0139\u013d"+
		"\5d\61\2\u013a\u013c\5f\62\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013ec\3\2\2\2\u013f\u013d\3\2\2\2"+
		"\u0140\u0141\t\5\2\2\u0141e\3\2\2\2\u0142\u0145\5d\61\2\u0143\u0145\t"+
		"\6\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145g\3\2\2\2\u0146\u0148"+
		"\t\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b\63\2\2\u014ci\3\2\2\2"+
		"\u014d\u014e\7~\2\2\u014ek\3\2\2\2\u014f\u0150\7@\2\2\u0150m\3\2\2\2\u0151"+
		"\u0152\7A\2\2\u0152\u0153\7*\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\66"+
		"\6\2\u0155o\3\2\2\2\u0156\u0158\n\7\2\2\u0157\u0156\3\2\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\t\b\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\b\67\2\2\u0160\u0161\b\67\5\2\u0161q\3\2\2\2\u0162\u0164"+
		"\5t9\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166s\3\2\2\2\u0167\u0168\7)\2\2\u0168\u016b\7)\2\2\u0169"+
		"\u016b\n\t\2\2\u016a\u0167\3\2\2\2\u016a\u0169\3\2\2\2\u016bu\3\2\2\2"+
		"\u016c\u016d\7)\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b:\5\2\u016fw\3\2"+
		"\2\2\u0170\u0171\7&\2\2\u0171\u0172\7*\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\b;\6\2\u0174y\3\2\2\2\u0175\u0176\5H#\2\u0176\u0177\b<\b\2\u0177\u0178"+
		"\3\2\2\2\u0178\u0179\b<\6\2\u0179\u017a\b<\t\2\u017a{\3\2\2\2\u017b\u017d"+
		"\5~>\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f}\3\2\2\2\u0180\u0181\7)\2\2\u0181\u0186\7)\2\2\u0182"+
		"\u0183\7&\2\2\u0183\u0186\7&\2\2\u0184\u0186\n\n\2\2\u0185\u0180\3\2\2"+
		"\2\u0185\u0182\3\2\2\2\u0185\u0184\3\2\2\2\u0186\177\3\2\2\2\u0187\u0188"+
		"\7)\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b?\5\2\u018a\u0081\3\2\2\2\24"+
		"\2\3\4\5\u00d7\u0112\u0115\u012e\u0133\u013d\u0144\u0149\u0159\u015d\u0165"+
		"\u016a\u017e\u0185\n\b\2\2\7\3\2\3\21\2\6\2\2\7\2\2\7\5\2\3<\3\t$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}