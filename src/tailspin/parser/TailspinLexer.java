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
		Comment=51, REGEX_TEXT=52, END_REGEX=53, StartStringEvaluate=54, CharacterCode=55, 
		STRING_TEXT=56, END_STRING=57;
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
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartStringEvaluate", "CharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING"
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
			"REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "CharacterCode", "STRING_TEXT", 
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
		case 15:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0191\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00da\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\5#\u0115\n#\3#\5#\u0118\n#\3$\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u0131"+
		"\n-\3.\6.\u0134\n.\r.\16.\u0135\3/\3/\3/\3/\3\60\3\60\7\60\u013e\n\60"+
		"\f\60\16\60\u0141\13\60\3\61\3\61\3\62\3\62\5\62\u0147\n\62\3\63\6\63"+
		"\u014a\n\63\r\63\16\63\u014b\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\7\67\u015a\n\67\f\67\16\67\u015d\13\67\3\67\5\67\u0160"+
		"\n\67\3\67\3\67\3\67\38\68\u0166\n8\r8\168\u0167\39\39\39\59\u016d\n9"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\6>\u0183"+
		"\n>\r>\16>\u0184\3?\3?\3?\3?\3?\5?\u018c\n?\3@\3@\3@\3@\2\2A\6\3\b\4\n"+
		"\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23"+
		"(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%"+
		"L&N\'P(R)T*V+X,Z-\\.^\2`/b\60d\2f\2h\61j\62l\63n\64p\65r\66t\2v\67x8z"+
		"9|\2~:\u0080\2\u0082;\6\2\3\4\5\13\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;"+
		"\4\2C\\c|\4\2\61;aa\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u0196\2\6\3\2\2\2"+
		"\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3"+
		"\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2"+
		"\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2"+
		"\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2"+
		"\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2"+
		"\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2"+
		"N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3"+
		"\2\2\2\2\\\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2"+
		"\2\2\2n\3\2\2\2\3p\3\2\2\2\4r\3\2\2\2\4v\3\2\2\2\5x\3\2\2\2\5z\3\2\2\2"+
		"\5|\3\2\2\2\5~\3\2\2\2\5\u0082\3\2\2\2\6\u0084\3\2\2\2\b\u008a\3\2\2\2"+
		"\n\u0092\3\2\2\2\f\u0099\3\2\2\2\16\u00a0\3\2\2\2\20\u00a6\3\2\2\2\22"+
		"\u00ab\3\2\2\2\24\u00b1\3\2\2\2\26\u00b4\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8"+
		"\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3\2\2\2 \u00c0\3\2\2\2\"\u00c5\3\2"+
		"\2\2$\u00c8\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d6"+
		"\3\2\2\2.\u00db\3\2\2\2\60\u00dd\3\2\2\2\62\u00e1\3\2\2\2\64\u00e5\3\2"+
		"\2\2\66\u00e7\3\2\2\28\u00e9\3\2\2\2:\u00eb\3\2\2\2<\u00ed\3\2\2\2>\u00ef"+
		"\3\2\2\2@\u00f9\3\2\2\2B\u0102\3\2\2\2D\u010c\3\2\2\2F\u0110\3\2\2\2H"+
		"\u0112\3\2\2\2J\u0119\3\2\2\2L\u011c\3\2\2\2N\u011e\3\2\2\2P\u0120\3\2"+
		"\2\2R\u0122\3\2\2\2T\u0124\3\2\2\2V\u0128\3\2\2\2X\u012a\3\2\2\2Z\u012c"+
		"\3\2\2\2\\\u012e\3\2\2\2^\u0133\3\2\2\2`\u0137\3\2\2\2b\u013b\3\2\2\2"+
		"d\u0142\3\2\2\2f\u0146\3\2\2\2h\u0149\3\2\2\2j\u014f\3\2\2\2l\u0151\3"+
		"\2\2\2n\u0153\3\2\2\2p\u015b\3\2\2\2r\u0165\3\2\2\2t\u016c\3\2\2\2v\u016e"+
		"\3\2\2\2x\u0172\3\2\2\2z\u0177\3\2\2\2|\u017b\3\2\2\2~\u0182\3\2\2\2\u0080"+
		"\u018b\3\2\2\2\u0082\u018d\3\2\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7"+
		"\61\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\2\2\2\u0088\u0089\b\2\3\2\u0089"+
		"\7\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7c\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7m\2\2\u008e\u008f\7c\2\2\u008f\u0090\7i\2\2\u0090\u0091\7g\2\2"+
		"\u0091\t\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7o\2\2\u0094\u0095\7r"+
		"\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7v\2\2\u0098\13"+
		"\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7f\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7w\2\2\u009e\u009f\7v\2\2\u009f\r\3\2\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7x\2\2\u00a7\u00a8\7"+
		"q\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7f\2\2\u00aa\21\3\2\2\2\u00ab\u00ac"+
		"\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\t\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3\7@\2\2"+
		"\u00b3\25\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7B\2"+
		"\2\u00b7\31\3\2\2\2\u00b8\u00b9\7B\2\2\u00b9\u00ba\5b\60\2\u00ba\33\3"+
		"\2\2\2\u00bb\u00bc\7<\2\2\u00bc\35\3\2\2\2\u00bd\u00be\5b\60\2\u00be\u00bf"+
		"\7<\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2\7<\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\5b\60\2\u00c4!\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6"+
		"\u00c7\5b\60\2\u00c7#\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9\u00ca\6\21\2\2"+
		"\u00ca\u00cb\b\21\4\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\21\5\2\u00cd%"+
		"\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1)"+
		"\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\60\2"+
		"\2\u00d5+\3\2\2\2\u00d6\u00d7\7`\2\2\u00d7\u00d9\5\30\13\2\u00d8\u00da"+
		"\5b\60\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da-\3\2\2\2\u00db"+
		"\u00dc\7\u0080\2\2\u00dc/\3\2\2\2\u00dd\u00de\7*\2\2\u00de\u00df\3\2\2"+
		"\2\u00df\u00e0\b\27\6\2\u00e0\61\3\2\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\b\30\5\2\u00e4\63\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6"+
		"\65\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8\67\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea"+
		"9\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec;\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee"+
		"=\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7o\2\2\u00f2"+
		"\u00f3\7r\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7v\2\2"+
		"\u00f6\u00f7\7g\2\2\u00f7\u00f8\7u\2\2\u00f8?\3\2\2\2\u00f9\u00fa\7e\2"+
		"\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101"+
		"A\3\2\2\2\u0102\u0103\7r\2\2\u0103\u0104\7t\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7e\2\2\u0106\u0107\7g\2\2\u0107\u0108\7u\2\2\u0108\u0109\7u\2\2"+
		"\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010bC\3\2\2\2\u010c\u010d\7g\2"+
		"\2\u010d\u010e\7p\2\2\u010e\u010f\7f\2\2\u010fE\3\2\2\2\u0110\u0111\7"+
		"%\2\2\u0111G\3\2\2\2\u0112\u0114\7&\2\2\u0113\u0115\5\30\13\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\5b\60\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118I\3\2\2\2\u0119\u011a\7\60\2\2"+
		"\u011a\u011b\7\60\2\2\u011bK\3\2\2\2\u011c\u011d\7-\2\2\u011dM\3\2\2\2"+
		"\u011e\u011f\7/\2\2\u011fO\3\2\2\2\u0120\u0121\7,\2\2\u0121Q\3\2\2\2\u0122"+
		"\u0123\7\61\2\2\u0123S\3\2\2\2\u0124\u0125\7o\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7f\2\2\u0127U\3\2\2\2\u0128\u0129\7A\2\2\u0129W\3\2\2\2\u012a\u012b"+
		"\7?\2\2\u012bY\3\2\2\2\u012c\u012d\7\62\2\2\u012d[\3\2\2\2\u012e\u0130"+
		"\t\3\2\2\u012f\u0131\5^.\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"]\3\2\2\2\u0132\u0134\t\4\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136_\3\2\2\2\u0137\u0138\7"+
		")\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b/\7\2\u013aa\3\2\2\2\u013b\u013f"+
		"\5d\61\2\u013c\u013e\5f\62\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140c\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0143\t\5\2\2\u0143e\3\2\2\2\u0144\u0147\5d\61\2\u0145\u0147\t"+
		"\6\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147g\3\2\2\2\u0148\u014a"+
		"\t\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\63\2\2\u014ei\3\2\2\2"+
		"\u014f\u0150\7~\2\2\u0150k\3\2\2\2\u0151\u0152\7@\2\2\u0152m\3\2\2\2\u0153"+
		"\u0154\7A\2\2\u0154\u0155\7*\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\66"+
		"\6\2\u0157o\3\2\2\2\u0158\u015a\n\7\2\2\u0159\u0158\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0160\t\b\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\b\67\2\2\u0162\u0163\b\67\5\2\u0163q\3\2\2\2\u0164\u0166"+
		"\5t9\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168s\3\2\2\2\u0169\u016a\7)\2\2\u016a\u016d\7)\2\2\u016b"+
		"\u016d\n\t\2\2\u016c\u0169\3\2\2\2\u016c\u016b\3\2\2\2\u016du\3\2\2\2"+
		"\u016e\u016f\7)\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b:\5\2\u0171w\3\2"+
		"\2\2\u0172\u0173\7&\2\2\u0173\u0174\7*\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\b;\6\2\u0176y\3\2\2\2\u0177\u0178\7&\2\2\u0178\u0179\5^.\2\u0179\u017a"+
		"\7=\2\2\u017a{\3\2\2\2\u017b\u017c\5H#\2\u017c\u017d\b=\b\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017f\b=\6\2\u017f\u0180\b=\t\2\u0180}\3\2\2\2\u0181\u0183"+
		"\5\u0080?\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\177\3\2\2\2\u0186\u0187\7)\2\2\u0187\u018c"+
		"\7)\2\2\u0188\u0189\7&\2\2\u0189\u018c\7&\2\2\u018a\u018c\n\n\2\2\u018b"+
		"\u0186\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u0081\3\2"+
		"\2\2\u018d\u018e\7)\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b@\5\2\u0190\u0083"+
		"\3\2\2\2\24\2\3\4\5\u00d9\u0114\u0117\u0130\u0135\u013f\u0146\u014b\u015b"+
		"\u015f\u0167\u016c\u0184\u018b\n\b\2\2\7\3\2\3\21\2\6\2\2\7\2\2\7\5\2"+
		"\3=\3\t$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}