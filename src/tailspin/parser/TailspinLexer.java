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
		SemiColon=15, Comma=16, Deconstructor=17, Invert=18, LeftParen=19, RightParen=20, 
		LeftBracket=21, RightBracket=22, LeftBrace=23, RightBrace=24, StartMatcher=25, 
		StartTemplatesDefinition=26, StartComposerDefinition=27, StartProcessorDefinition=28, 
		EndDefinition=29, TemplateMatch=30, Dereference=31, Range=32, Plus=33, 
		Minus=34, Star=35, Slash=36, Mod=37, Question=38, Equal=39, Zero=40, PositiveInteger=41, 
		START_STRING=42, IDENTIFIER=43, WS=44, Else=45, EndMatcher=46, BeginSuchThat=47, 
		Comment=48, REGEX_TEXT=49, END_REGEX=50, StartStringEvaluate=51, STRING_TEXT=52, 
		END_STRING=53;
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
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "TemplateMatch", "Dereference", "Range", "Plus", "Minus", 
			"Star", "Slash", "Mod", "Question", "Equal", "Zero", "PositiveInteger", 
			"Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", "REGEX_TEXT", 
			"REGEX_CHAR", "END_REGEX", "StartStringEvaluate", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, "':'", null, null, null, null, "';'", "','", "'...'", "'~'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", "'composer'", 
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
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "TemplateMatch", "Dereference", "Range", "Plus", "Minus", 
			"Star", "Slash", "Mod", "Question", "Equal", "Zero", "PositiveInteger", 
			"START_STRING", "IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", 
			"Comment", "REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "STRING_TEXT", 
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
		case 13:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0171\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \5 \u00f9\n \3 \5 \u00fc\n \3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u0115\n*\3+\6+\u0118"+
		"\n+\r+\16+\u0119\3,\3,\3,\3,\3-\3-\7-\u0122\n-\f-\16-\u0125\13-\3.\3."+
		"\3/\3/\5/\u012b\n/\3\60\6\60\u012e\n\60\r\60\16\60\u012f\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\7\64\u013e\n\64\f\64\16"+
		"\64\u0141\13\64\3\64\5\64\u0144\n\64\3\64\3\64\3\64\3\65\6\65\u014a\n"+
		"\65\r\65\16\65\u014b\3\66\3\66\3\66\5\66\u0151\n\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\39\39\39\39\39\39\3:\6:\u0163\n:\r:\16:\u0164\3;\3;\3"+
		";\3;\3;\5;\u016c\n;\3<\3<\3<\3<\2\2=\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24"+
		"\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30"+
		"\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X\2Z,\\-^"+
		"\2`\2b.d/f\60h\61j\62l\63n\2p\64r\65t\2v\66x\2z\67\6\2\3\4\5\13\5\2\13"+
		"\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\3\2\f\f\3\3\f\f\3\2))"+
		"\4\2&&))\2\u0175\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16"+
		"\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2"+
		"\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$"+
		"\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3"+
		"\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2"+
		"<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3"+
		"\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2"+
		"\2\2V\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2"+
		"\2h\3\2\2\2\3j\3\2\2\2\4l\3\2\2\2\4p\3\2\2\2\5r\3\2\2\2\5t\3\2\2\2\5v"+
		"\3\2\2\2\5z\3\2\2\2\6|\3\2\2\2\b\u0082\3\2\2\2\n\u0089\3\2\2\2\f\u008f"+
		"\3\2\2\2\16\u0094\3\2\2\2\20\u009a\3\2\2\2\22\u009d\3\2\2\2\24\u009f\3"+
		"\2\2\2\26\u00a1\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00a9\3\2"+
		"\2\2\36\u00ae\3\2\2\2 \u00b1\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bb"+
		"\3\2\2\2(\u00bf\3\2\2\2*\u00c1\3\2\2\2,\u00c5\3\2\2\2.\u00c9\3\2\2\2\60"+
		"\u00cb\3\2\2\2\62\u00cd\3\2\2\2\64\u00cf\3\2\2\2\66\u00d1\3\2\2\28\u00d3"+
		"\3\2\2\2:\u00dd\3\2\2\2<\u00e6\3\2\2\2>\u00f0\3\2\2\2@\u00f4\3\2\2\2B"+
		"\u00f6\3\2\2\2D\u00fd\3\2\2\2F\u0100\3\2\2\2H\u0102\3\2\2\2J\u0104\3\2"+
		"\2\2L\u0106\3\2\2\2N\u0108\3\2\2\2P\u010c\3\2\2\2R\u010e\3\2\2\2T\u0110"+
		"\3\2\2\2V\u0112\3\2\2\2X\u0117\3\2\2\2Z\u011b\3\2\2\2\\\u011f\3\2\2\2"+
		"^\u0126\3\2\2\2`\u012a\3\2\2\2b\u012d\3\2\2\2d\u0133\3\2\2\2f\u0135\3"+
		"\2\2\2h\u0137\3\2\2\2j\u013f\3\2\2\2l\u0149\3\2\2\2n\u0150\3\2\2\2p\u0152"+
		"\3\2\2\2r\u0156\3\2\2\2t\u015b\3\2\2\2v\u0162\3\2\2\2x\u016b\3\2\2\2z"+
		"\u016d\3\2\2\2|}\7\61\2\2}~\7\61\2\2~\177\3\2\2\2\177\u0080\b\2\2\2\u0080"+
		"\u0081\b\2\3\2\u0081\7\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086\u0087\7w\2\2\u0087\u0088\7v\2\2"+
		"\u0088\t\3\2\2\2\u0089\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c\7f"+
		"\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\13\3\2\2\2\u008f\u0090"+
		"\7x\2\2\u0090\u0091\7q\2\2\u0091\u0092\7k\2\2\u0092\u0093\7f\2\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7g\2\2\u0096\u0097\7h\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\t\2\2\2\u0099\17\3\2\2\2\u009a\u009b\7/\2\2"+
		"\u009b\u009c\7@\2\2\u009c\21\3\2\2\2\u009d\u009e\7#\2\2\u009e\23\3\2\2"+
		"\2\u009f\u00a0\7B\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7B\2\2\u00a2\u00a3"+
		"\5\\-\2\u00a3\27\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\31\3\2\2\2\u00a6\u00a7"+
		"\5\\-\2\u00a7\u00a8\7<\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ab"+
		"\7<\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\\-\2\u00ad\35\3\2\2\2\u00ae"+
		"\u00af\7\60\2\2\u00af\u00b0\5\\-\2\u00b0\37\3\2\2\2\u00b1\u00b2\7=\2\2"+
		"\u00b2\u00b3\6\17\2\2\u00b3\u00b4\b\17\4\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\b\17\5\2\u00b6!\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8#\3\2\2\2\u00b9\u00ba"+
		"\7.\2\2\u00ba%\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc\u00bd\7\60\2\2\u00bd"+
		"\u00be\7\60\2\2\u00be\'\3\2\2\2\u00bf\u00c0\7\u0080\2\2\u00c0)\3\2\2\2"+
		"\u00c1\u00c2\7*\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\24\6\2\u00c4+\3"+
		"\2\2\2\u00c5\u00c6\7+\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\25\5\2\u00c8"+
		"-\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca/\3\2\2\2\u00cb\u00cc\7_\2\2\u00cc\61"+
		"\3\2\2\2\u00cd\u00ce\7}\2\2\u00ce\63\3\2\2\2\u00cf\u00d0\7\177\2\2\u00d0"+
		"\65\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\67\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7r\2\2\u00d7\u00d8\7n\2\2"+
		"\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc9\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7q\2\2\u00df\u00e0"+
		"\7o\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7u\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7t\2\2\u00e5;\3\2\2\2\u00e6\u00e7\7r\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7u\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef=\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3"+
		"\7f\2\2\u00f3?\3\2\2\2\u00f4\u00f5\7%\2\2\u00f5A\3\2\2\2\u00f6\u00f8\7"+
		"&\2\2\u00f7\u00f9\5\24\t\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00fc\5\\-\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fcC\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\u00ff\7\60\2\2\u00ffE\3"+
		"\2\2\2\u0100\u0101\7-\2\2\u0101G\3\2\2\2\u0102\u0103\7/\2\2\u0103I\3\2"+
		"\2\2\u0104\u0105\7,\2\2\u0105K\3\2\2\2\u0106\u0107\7\61\2\2\u0107M\3\2"+
		"\2\2\u0108\u0109\7o\2\2\u0109\u010a\7q\2\2\u010a\u010b\7f\2\2\u010bO\3"+
		"\2\2\2\u010c\u010d\7A\2\2\u010dQ\3\2\2\2\u010e\u010f\7?\2\2\u010fS\3\2"+
		"\2\2\u0110\u0111\7\62\2\2\u0111U\3\2\2\2\u0112\u0114\t\3\2\2\u0113\u0115"+
		"\5X+\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115W\3\2\2\2\u0116\u0118"+
		"\t\4\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aY\3\2\2\2\u011b\u011c\7)\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\b,\7\2\u011e[\3\2\2\2\u011f\u0123\5^.\2\u0120\u0122\5`/\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124]\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\t\5\2\2\u0127_\3\2"+
		"\2\2\u0128\u012b\5^.\2\u0129\u012b\t\6\2\2\u012a\u0128\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012ba\3\2\2\2\u012c\u012e\t\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\b\60\2\2\u0132c\3\2\2\2\u0133\u0134\7~\2\2\u0134e\3\2"+
		"\2\2\u0135\u0136\7@\2\2\u0136g\3\2\2\2\u0137\u0138\7A\2\2\u0138\u0139"+
		"\7*\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b\63\6\2\u013bi\3\2\2\2\u013c"+
		"\u013e\n\7\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\t\b\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\64"+
		"\2\2\u0146\u0147\b\64\5\2\u0147k\3\2\2\2\u0148\u014a\5n\66\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"m\3\2\2\2\u014d\u014e\7)\2\2\u014e\u0151\7)\2\2\u014f\u0151\n\t\2\2\u0150"+
		"\u014d\3\2\2\2\u0150\u014f\3\2\2\2\u0151o\3\2\2\2\u0152\u0153\7)\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\b\67\5\2\u0155q\3\2\2\2\u0156\u0157\7&\2\2"+
		"\u0157\u0158\7*\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b8\6\2\u015as\3\2"+
		"\2\2\u015b\u015c\5B \2\u015c\u015d\b9\b\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\b9\6\2\u015f\u0160\b9\t\2\u0160u\3\2\2\2\u0161\u0163\5x;\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"w\3\2\2\2\u0166\u0167\7)\2\2\u0167\u016c\7)\2\2\u0168\u0169\7&\2\2\u0169"+
		"\u016c\7&\2\2\u016a\u016c\n\n\2\2\u016b\u0166\3\2\2\2\u016b\u0168\3\2"+
		"\2\2\u016b\u016a\3\2\2\2\u016cy\3\2\2\2\u016d\u016e\7)\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0170\b<\5\2\u0170{\3\2\2\2\23\2\3\4\5\u00f8\u00fb\u0114"+
		"\u0119\u0123\u012a\u012f\u013f\u0143\u014b\u0150\u0164\u016b\n\b\2\2\7"+
		"\3\2\3\17\2\6\2\2\7\2\2\7\5\2\39\3\t!\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}