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
		StartComment=1, Package=2, Import=3, Void=4, Def=5, When=6, Do=7, Otherwise=8, 
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, At=13, Slash=14, 
		Colon=15, Message=16, FieldReference=17, EndStringInterpolate=18, SemiColon=19, 
		Comma=20, Deconstructor=21, Invert=22, LeftParen=23, RightParen=24, LeftBracket=25, 
		RightBracket=26, LeftBrace=27, RightBrace=28, StartMatcher=29, Lambda=30, 
		StartTemplatesDefinition=31, StartSourceDefinition=32, StartSinkDefinition=33, 
		StartComposerDefinition=34, StartProcessorDefinition=35, EndDefinition=36, 
		Rule=37, First=38, Last=39, TemplateMatch=40, Range=41, Plus=42, Minus=43, 
		Star=44, TruncateDivide=45, Mod=46, Question=47, Equal=48, Else=49, EndMatcher=50, 
		BeginCondition=51, StartTestDefinition=52, Assert=53, Zero=54, PositiveInteger=55, 
		START_STRING=56, IDENTIFIER=57, WS=58, Comment=59, REGEX_TEXT=60, END_REGEX=61, 
		StartCharacterCode=62, StartStringInterpolate=63, STRING_TEXT=64, END_STRING=65;
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
			"StartComment", "Package", "Import", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "At", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
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
			"'otherwise'", "'->'", "'!'", "'$'", "'^'", "'@'", "'/'", "':'", null, 
			null, null, "';'", "','", "'...'", "'~'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'\\'", "'templates'", "'source'", "'sink'", "'composer'", 
			"'processor'", "'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", 
			"'+'", "'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", 
			"'test'", "'assert'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Void", "Def", "When", "Do", 
			"Otherwise", "To", "ResultMarker", "SourceMarker", "DeleteMarker", "At", 
			"Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"Lambda", "StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
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
		case 17:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 65:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01be\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\38\38\58\u016a\n8\39\69\u016d\n9\r9\16"+
		"9\u016e\3:\3:\3:\3:\3;\3;\7;\u0177\n;\f;\16;\u017a\13;\3<\3<\3=\3=\5="+
		"\u0180\n=\3>\6>\u0183\n>\r>\16>\u0184\3>\3>\3?\7?\u018a\n?\f?\16?\u018d"+
		"\13?\3?\5?\u0190\n?\3?\3?\3?\3@\6@\u0196\n@\r@\16@\u0197\3A\3A\3A\5A\u019d"+
		"\nA\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\6E\u01b0\nE\rE"+
		"\16E\u01b1\3F\3F\3F\3F\3F\5F\u01b9\nF\3G\3G\3G\3G\2\2H\6\3\b\4\n\5\f\6"+
		"\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24"+
		"*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'"+
		"P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64j\65l\66n\67p8r9t\2v:x;z\2|\2~<\u0080"+
		"=\u0082>\u0084\2\u0086?\u0088@\u008aA\u008cB\u008e\2\u0090C\6\2\3\4\5"+
		"\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3"+
		"\f\f\3\2))\4\2&&))\2\u01c0\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2"+
		"\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2"+
		"\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3"+
		"\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2"+
		"\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3"+
		"\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2"+
		"\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2"+
		"T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3"+
		"\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2"+
		"\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2~\3\2\2\2\3"+
		"\u0080\3\2\2\2\4\u0082\3\2\2\2\4\u0086\3\2\2\2\5\u0088\3\2\2\2\5\u008a"+
		"\3\2\2\2\5\u008c\3\2\2\2\5\u0090\3\2\2\2\6\u0092\3\2\2\2\b\u0098\3\2\2"+
		"\2\n\u00a0\3\2\2\2\f\u00a7\3\2\2\2\16\u00ac\3\2\2\2\20\u00b0\3\2\2\2\22"+
		"\u00b5\3\2\2\2\24\u00b8\3\2\2\2\26\u00c2\3\2\2\2\30\u00c5\3\2\2\2\32\u00c7"+
		"\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2\2 \u00cd\3\2\2\2\"\u00cf\3\2"+
		"\2\2$\u00d1\3\2\2\2&\u00d6\3\2\2\2(\u00d9\3\2\2\2*\u00df\3\2\2\2,\u00e1"+
		"\3\2\2\2.\u00e3\3\2\2\2\60\u00e7\3\2\2\2\62\u00e9\3\2\2\2\64\u00ed\3\2"+
		"\2\2\66\u00f1\3\2\2\28\u00f3\3\2\2\2:\u00f5\3\2\2\2<\u00f7\3\2\2\2>\u00f9"+
		"\3\2\2\2@\u00fb\3\2\2\2B\u00fd\3\2\2\2D\u0107\3\2\2\2F\u010e\3\2\2\2H"+
		"\u0113\3\2\2\2J\u011c\3\2\2\2L\u0126\3\2\2\2N\u012a\3\2\2\2P\u012f\3\2"+
		"\2\2R\u0135\3\2\2\2T\u013a\3\2\2\2V\u013c\3\2\2\2X\u013f\3\2\2\2Z\u0141"+
		"\3\2\2\2\\\u0143\3\2\2\2^\u0145\3\2\2\2`\u0148\3\2\2\2b\u014c\3\2\2\2"+
		"d\u014e\3\2\2\2f\u0150\3\2\2\2h\u0152\3\2\2\2j\u0154\3\2\2\2l\u0159\3"+
		"\2\2\2n\u015e\3\2\2\2p\u0165\3\2\2\2r\u0167\3\2\2\2t\u016c\3\2\2\2v\u0170"+
		"\3\2\2\2x\u0174\3\2\2\2z\u017b\3\2\2\2|\u017f\3\2\2\2~\u0182\3\2\2\2\u0080"+
		"\u018b\3\2\2\2\u0082\u0195\3\2\2\2\u0084\u019c\3\2\2\2\u0086\u019e\3\2"+
		"\2\2\u0088\u01a2\3\2\2\2\u008a\u01a9\3\2\2\2\u008c\u01af\3\2\2\2\u008e"+
		"\u01b8\3\2\2\2\u0090\u01ba\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u0094\7"+
		"\61\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\2\2\2\u0096\u0097\b\2\3\2\u0097"+
		"\7\3\2\2\2\u0098\u0099\7r\2\2\u0099\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b"+
		"\u009c\7m\2\2\u009c\u009d\7c\2\2\u009d\u009e\7i\2\2\u009e\u009f\7g\2\2"+
		"\u009f\t\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7r"+
		"\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7v\2\2\u00a6\13"+
		"\3\2\2\2\u00a7\u00a8\7X\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7K\2\2\u00aa"+
		"\u00ab\7F\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\17\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7y\2\2"+
		"\u00be\u00bf\7k\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\25\3\2"+
		"\2\2\u00c2\u00c3\7/\2\2\u00c3\u00c4\7@\2\2\u00c4\27\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7&\2\2\u00c8\33\3\2\2\2\u00c9\u00ca"+
		"\7`\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7B\2\2\u00cc\37\3\2\2\2\u00cd\u00ce"+
		"\7\61\2\2\u00ce!\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0#\3\2\2\2\u00d1\u00d2"+
		"\7<\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5x;\2\u00d5"+
		"%\3\2\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d8\5x;\2\u00d8\'\3\2\2\2\u00d9"+
		"\u00da\7=\2\2\u00da\u00db\6\23\2\2\u00db\u00dc\b\23\4\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\b\23\5\2\u00de)\3\2\2\2\u00df\u00e0\7=\2\2\u00e0+\3"+
		"\2\2\2\u00e1\u00e2\7.\2\2\u00e2-\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4\u00e5"+
		"\7\60\2\2\u00e5\u00e6\7\60\2\2\u00e6/\3\2\2\2\u00e7\u00e8\7\u0080\2\2"+
		"\u00e8\61\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b"+
		"\30\6\2\u00ec\63\3\2\2\2\u00ed\u00ee\7+\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\b\31\5\2\u00f0\65\3\2\2\2\u00f1\u00f2\7]\2\2\u00f2\67\3\2\2\2\u00f3"+
		"\u00f4\7_\2\2\u00f49\3\2\2\2\u00f5\u00f6\7}\2\2\u00f6;\3\2\2\2\u00f7\u00f8"+
		"\7\177\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa?\3\2\2\2\u00fb\u00fc"+
		"\7^\2\2\u00fcA\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100"+
		"\7o\2\2\u0100\u0101\7r\2\2\u0101\u0102\7n\2\2\u0102\u0103\7c\2\2\u0103"+
		"\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106\7u\2\2\u0106C\3\2\2\2\u0107"+
		"\u0108\7u\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b\7t\2\2"+
		"\u010b\u010c\7e\2\2\u010c\u010d\7g\2\2\u010dE\3\2\2\2\u010e\u010f\7u\2"+
		"\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111\u0112\7m\2\2\u0112G\3\2"+
		"\2\2\u0113\u0114\7e\2\2\u0114\u0115\7q\2\2\u0115\u0116\7o\2\2\u0116\u0117"+
		"\7r\2\2\u0117\u0118\7q\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a"+
		"\u011b\7t\2\2\u011bI\3\2\2\2\u011c\u011d\7r\2\2\u011d\u011e\7t\2\2\u011e"+
		"\u011f\7q\2\2\u011f\u0120\7e\2\2\u0120\u0121\7g\2\2\u0121\u0122\7u\2\2"+
		"\u0122\u0123\7u\2\2\u0123\u0124\7q\2\2\u0124\u0125\7t\2\2\u0125K\3\2\2"+
		"\2\u0126\u0127\7g\2\2\u0127\u0128\7p\2\2\u0128\u0129\7f\2\2\u0129M\3\2"+
		"\2\2\u012a\u012b\7t\2\2\u012b\u012c\7w\2\2\u012c\u012d\7n\2\2\u012d\u012e"+
		"\7g\2\2\u012eO\3\2\2\2\u012f\u0130\7h\2\2\u0130\u0131\7k\2\2\u0131\u0132"+
		"\7t\2\2\u0132\u0133\7u\2\2\u0133\u0134\7v\2\2\u0134Q\3\2\2\2\u0135\u0136"+
		"\7n\2\2\u0136\u0137\7c\2\2\u0137\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139"+
		"S\3\2\2\2\u013a\u013b\7%\2\2\u013bU\3\2\2\2\u013c\u013d\7\60\2\2\u013d"+
		"\u013e\7\60\2\2\u013eW\3\2\2\2\u013f\u0140\7-\2\2\u0140Y\3\2\2\2\u0141"+
		"\u0142\7/\2\2\u0142[\3\2\2\2\u0143\u0144\7,\2\2\u0144]\3\2\2\2\u0145\u0146"+
		"\7\u0080\2\2\u0146\u0147\7\61\2\2\u0147_\3\2\2\2\u0148\u0149\7o\2\2\u0149"+
		"\u014a\7q\2\2\u014a\u014b\7f\2\2\u014ba\3\2\2\2\u014c\u014d\7A\2\2\u014d"+
		"c\3\2\2\2\u014e\u014f\7?\2\2\u014fe\3\2\2\2\u0150\u0151\7~\2\2\u0151g"+
		"\3\2\2\2\u0152\u0153\7@\2\2\u0153i\3\2\2\2\u0154\u0155\7A\2\2\u0155\u0156"+
		"\7*\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b\64\6\2\u0158k\3\2\2\2\u0159"+
		"\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c\7u\2\2\u015c\u015d\7v\2\2"+
		"\u015dm\3\2\2\2\u015e\u015f\7c\2\2\u015f\u0160\7u\2\2\u0160\u0161\7u\2"+
		"\2\u0161\u0162\7g\2\2\u0162\u0163\7t\2\2\u0163\u0164\7v\2\2\u0164o\3\2"+
		"\2\2\u0165\u0166\7\62\2\2\u0166q\3\2\2\2\u0167\u0169\t\2\2\2\u0168\u016a"+
		"\5t9\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016as\3\2\2\2\u016b\u016d"+
		"\t\3\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016fu\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\b:\7\2\u0173w\3\2\2\2\u0174\u0178\5z<\2\u0175\u0177\5|=\2\u0176"+
		"\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179y\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\t\4\2\2\u017c{\3\2"+
		"\2\2\u017d\u0180\5z<\2\u017e\u0180\t\5\2\2\u017f\u017d\3\2\2\2\u017f\u017e"+
		"\3\2\2\2\u0180}\3\2\2\2\u0181\u0183\t\6\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0187\b>\2\2\u0187\177\3\2\2\2\u0188\u018a\n\7\2\2\u0189\u0188"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\t\b\2\2\u018f\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b?\2\2\u0192\u0193\b?\5\2\u0193\u0081"+
		"\3\2\2\2\u0194\u0196\5\u0084A\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0083\3\2\2\2\u0199\u019a"+
		"\7)\2\2\u019a\u019d\7)\2\2\u019b\u019d\n\t\2\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d\u0085\3\2\2\2\u019e\u019f\7)\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\bB\5\2\u01a1\u0087\3\2\2\2\u01a2\u01a3\7&\2\2\u01a3\u01a4"+
		"\7%\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\bC\b\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\bC\6\2\u01a8\u0089\3\2\2\2\u01a9\u01aa\7&\2\2\u01aa\u01ab\bD\t"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\bD\6\2\u01ad\u008b\3\2\2\2\u01ae\u01b0"+
		"\5\u008eF\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u008d\3\2\2\2\u01b3\u01b4\7)\2\2\u01b4\u01b9"+
		"\7)\2\2\u01b5\u01b6\7&\2\2\u01b6\u01b9\7&\2\2\u01b7\u01b9\n\n\2\2\u01b8"+
		"\u01b3\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u008f\3\2"+
		"\2\2\u01ba\u01bb\7)\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\bG\5\2\u01bd\u0091"+
		"\3\2\2\2\21\2\3\4\5\u0169\u016e\u0178\u017f\u0184\u018b\u018f\u0197\u019c"+
		"\u01b1\u01b8\n\b\2\2\7\3\2\3\23\2\6\2\2\7\2\2\7\5\2\3C\3\3D\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}