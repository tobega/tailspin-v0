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
		At=8, NamedAt=9, Colon=10, Key=11, Message=12, FieldReference=13, EndStringInterpolate=14, 
		SemiColon=15, Comma=16, Deconstructor=17, DeleteState=18, Invert=19, LeftParen=20, 
		RightParen=21, LeftBracket=22, RightBracket=23, LeftBrace=24, RightBrace=25, 
		StartMatcher=26, StartTemplatesDefinition=27, StartComposerDefinition=28, 
		StartProcessorDefinition=29, EndDefinition=30, TemplateMatch=31, Dereference=32, 
		Range=33, Plus=34, Minus=35, Star=36, Slash=37, Mod=38, Question=39, Equal=40, 
		Zero=41, PositiveInteger=42, START_STRING=43, IDENTIFIER=44, WS=45, Else=46, 
		EndMatcher=47, BeginSuchThat=48, Comment=49, REGEX_TEXT=50, END_REGEX=51, 
		StartStringEvaluate=52, STRING_TEXT=53, END_STRING=54;
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
			"StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "NamedAt", "Colon", "Key", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "DeleteState", "Invert", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
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
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, "':'", null, null, null, null, "';'", "','", "'...'", null, "'~'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", "'composer'", 
			"'processor'", "'end'", "'#'", null, "'..'", "'+'", "'-'", "'*'", "'/'", 
			"'mod'", "'?'", "'='", "'0'", null, null, null, null, "'|'", "'>'", "'?('", 
			null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "NamedAt", "Colon", "Key", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "DeleteState", "Invert", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"StartMatcher", "StartTemplatesDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "EndDefinition", "TemplateMatch", "Dereference", 
			"Range", "Plus", "Minus", "Star", "Slash", "Mod", "Question", "Equal", 
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "Else", 
			"EndMatcher", "BeginSuchThat", "Comment", "REGEX_TEXT", "END_REGEX", 
			"StartStringEvaluate", "STRING_TEXT", "END_STRING"
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
		case 56:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0178\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\5!\u0100\n!\3!\5!\u0103"+
		"\n!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\5+\u011c\n+\3,\6,\u011f\n,\r,\16,\u0120\3-\3-\3-\3-\3.\3.\7"+
		".\u0129\n.\f.\16.\u012c\13.\3/\3/\3\60\3\60\5\60\u0132\n\60\3\61\6\61"+
		"\u0135\n\61\r\61\16\61\u0136\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\7\65\u0145\n\65\f\65\16\65\u0148\13\65\3\65\5\65\u014b"+
		"\n\65\3\65\3\65\3\65\3\66\6\66\u0151\n\66\r\66\16\66\u0152\3\67\3\67\3"+
		"\67\5\67\u0158\n\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\6"+
		";\u016a\n;\r;\16;\u016b\3<\3<\3<\3<\3<\5<\u0173\n<\3=\3=\3=\3=\2\2>\6"+
		"\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21"+
		"$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D"+
		"\"F#H$J%L&N\'P(R)T*V+X,Z\2\\-^.`\2b\2d/f\60h\61j\62l\63n\64p\2r\65t\66"+
		"v\2x\67z\2|8\6\2\3\4\5\13\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|"+
		"\4\2\62;aa\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u017d\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2"+
		"\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3"+
		"\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2"+
		"\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2"+
		"P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\3l\3\2\2\2\4n\3\2\2"+
		"\2\4r\3\2\2\2\5t\3\2\2\2\5v\3\2\2\2\5x\3\2\2\2\5|\3\2\2\2\6~\3\2\2\2\b"+
		"\u0084\3\2\2\2\n\u008b\3\2\2\2\f\u0091\3\2\2\2\16\u0096\3\2\2\2\20\u009c"+
		"\3\2\2\2\22\u009f\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a6\3"+
		"\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2\2\36\u00b0\3\2\2\2 \u00b3\3\2\2"+
		"\2\"\u00b9\3\2\2\2$\u00bb\3\2\2\2&\u00bd\3\2\2\2(\u00c1\3\2\2\2*\u00c6"+
		"\3\2\2\2,\u00c8\3\2\2\2.\u00cc\3\2\2\2\60\u00d0\3\2\2\2\62\u00d2\3\2\2"+
		"\2\64\u00d4\3\2\2\2\66\u00d6\3\2\2\28\u00d8\3\2\2\2:\u00da\3\2\2\2<\u00e4"+
		"\3\2\2\2>\u00ed\3\2\2\2@\u00f7\3\2\2\2B\u00fb\3\2\2\2D\u00fd\3\2\2\2F"+
		"\u0104\3\2\2\2H\u0107\3\2\2\2J\u0109\3\2\2\2L\u010b\3\2\2\2N\u010d\3\2"+
		"\2\2P\u010f\3\2\2\2R\u0113\3\2\2\2T\u0115\3\2\2\2V\u0117\3\2\2\2X\u0119"+
		"\3\2\2\2Z\u011e\3\2\2\2\\\u0122\3\2\2\2^\u0126\3\2\2\2`\u012d\3\2\2\2"+
		"b\u0131\3\2\2\2d\u0134\3\2\2\2f\u013a\3\2\2\2h\u013c\3\2\2\2j\u013e\3"+
		"\2\2\2l\u0146\3\2\2\2n\u0150\3\2\2\2p\u0157\3\2\2\2r\u0159\3\2\2\2t\u015d"+
		"\3\2\2\2v\u0162\3\2\2\2x\u0169\3\2\2\2z\u0172\3\2\2\2|\u0174\3\2\2\2~"+
		"\177\7\61\2\2\177\u0080\7\61\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\2\2"+
		"\2\u0082\u0083\b\2\3\2\u0083\7\3\2\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7f\2\2\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7v\2\2\u008a\t\3\2\2\2\u008b\u008c\7u\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7f\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\13\3\2\2\2\u0091"+
		"\u0092\7x\2\2\u0092\u0093\7q\2\2\u0093\u0094\7k\2\2\u0094\u0095\7f\2\2"+
		"\u0095\r\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7g\2\2\u0098\u0099\7h"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\t\2\2\2\u009b\17\3\2\2\2\u009c\u009d"+
		"\7/\2\2\u009d\u009e\7@\2\2\u009e\21\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\23"+
		"\3\2\2\2\u00a1\u00a2\7B\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4"+
		"\u00a5\5^.\2\u00a5\27\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7\31\3\2\2\2\u00a8"+
		"\u00a9\5^.\2\u00a9\u00aa\7<\2\2\u00aa\33\3\2\2\2\u00ab\u00ac\7<\2\2\u00ac"+
		"\u00ad\7<\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5^.\2\u00af\35\3\2\2\2\u00b0"+
		"\u00b1\7\60\2\2\u00b1\u00b2\5^.\2\u00b2\37\3\2\2\2\u00b3\u00b4\7=\2\2"+
		"\u00b4\u00b5\6\17\2\2\u00b5\u00b6\b\17\4\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\b\17\5\2\u00b8!\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba#\3\2\2\2\u00bb\u00bc"+
		"\7.\2\2\u00bc%\3\2\2\2\u00bd\u00be\7\60\2\2\u00be\u00bf\7\60\2\2\u00bf"+
		"\u00c0\7\60\2\2\u00c0\'\3\2\2\2\u00c1\u00c2\7`\2\2\u00c2\u00c4\5\24\t"+
		"\2\u00c3\u00c5\5^.\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5)\3"+
		"\2\2\2\u00c6\u00c7\7\u0080\2\2\u00c7+\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\25\6\2\u00cb-\3\2\2\2\u00cc\u00cd\7+\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\26\5\2\u00cf/\3\2\2\2\u00d0\u00d1\7"+
		"]\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7_\2\2\u00d3\63\3\2\2\2\u00d4\u00d5"+
		"\7}\2\2\u00d5\65\3\2\2\2\u00d6\u00d7\7\177\2\2\u00d7\67\3\2\2\2\u00d8"+
		"\u00d9\7>\2\2\u00d99\3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7o\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7c\2\2"+
		"\u00e0\u00e1\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7u\2\2\u00e3;\3\2\2"+
		"\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8"+
		"\7r\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec=\3\2\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7t\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7u\2\2"+
		"\u00f3\u00f4\7u\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7t\2\2\u00f6?\3\2\2"+
		"\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00faA\3\2"+
		"\2\2\u00fb\u00fc\7%\2\2\u00fcC\3\2\2\2\u00fd\u00ff\7&\2\2\u00fe\u0100"+
		"\5\24\t\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2"+
		"\u0101\u0103\5^.\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103E\3\2"+
		"\2\2\u0104\u0105\7\60\2\2\u0105\u0106\7\60\2\2\u0106G\3\2\2\2\u0107\u0108"+
		"\7-\2\2\u0108I\3\2\2\2\u0109\u010a\7/\2\2\u010aK\3\2\2\2\u010b\u010c\7"+
		",\2\2\u010cM\3\2\2\2\u010d\u010e\7\61\2\2\u010eO\3\2\2\2\u010f\u0110\7"+
		"o\2\2\u0110\u0111\7q\2\2\u0111\u0112\7f\2\2\u0112Q\3\2\2\2\u0113\u0114"+
		"\7A\2\2\u0114S\3\2\2\2\u0115\u0116\7?\2\2\u0116U\3\2\2\2\u0117\u0118\7"+
		"\62\2\2\u0118W\3\2\2\2\u0119\u011b\t\3\2\2\u011a\u011c\5Z,\2\u011b\u011a"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011cY\3\2\2\2\u011d\u011f\t\4\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121[\3\2\2\2\u0122\u0123\7)\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\b-\7\2\u0125]\3\2\2\2\u0126\u012a\5`/\2\u0127\u0129\5b\60\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"_\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\t\5\2\2\u012ea\3\2\2\2\u012f"+
		"\u0132\5`/\2\u0130\u0132\t\6\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2"+
		"\2\u0132c\3\2\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\b\61\2\2\u0139e\3\2\2\2\u013a\u013b\7~\2\2\u013bg\3\2\2\2\u013c"+
		"\u013d\7@\2\2\u013di\3\2\2\2\u013e\u013f\7A\2\2\u013f\u0140\7*\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\b\64\6\2\u0142k\3\2\2\2\u0143\u0145\n\7\2\2"+
		"\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\t\b\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\65\2\2\u014d\u014e\b"+
		"\65\5\2\u014em\3\2\2\2\u014f\u0151\5p\67\2\u0150\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153o\3\2\2\2\u0154"+
		"\u0155\7)\2\2\u0155\u0158\7)\2\2\u0156\u0158\n\t\2\2\u0157\u0154\3\2\2"+
		"\2\u0157\u0156\3\2\2\2\u0158q\3\2\2\2\u0159\u015a\7)\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u015c\b8\5\2\u015cs\3\2\2\2\u015d\u015e\7&\2\2\u015e\u015f"+
		"\7*\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b9\6\2\u0161u\3\2\2\2\u0162\u0163"+
		"\5D!\2\u0163\u0164\b:\b\2\u0164\u0165\3\2\2\2\u0165\u0166\b:\6\2\u0166"+
		"\u0167\b:\t\2\u0167w\3\2\2\2\u0168\u016a\5z<\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cy\3\2\2\2"+
		"\u016d\u016e\7)\2\2\u016e\u0173\7)\2\2\u016f\u0170\7&\2\2\u0170\u0173"+
		"\7&\2\2\u0171\u0173\n\n\2\2\u0172\u016d\3\2\2\2\u0172\u016f\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173{\3\2\2\2\u0174\u0175\7)\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\b=\5\2\u0177}\3\2\2\2\24\2\3\4\5\u00c4\u00ff\u0102\u011b\u0120"+
		"\u012a\u0131\u0136\u0146\u014a\u0152\u0157\u016b\u0172\n\b\2\2\7\3\2\3"+
		"\17\2\6\2\2\7\2\2\7\5\2\3:\3\t\"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}