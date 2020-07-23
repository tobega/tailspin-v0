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
		ResultMarker=9, SourceMarker=10, DeleteMarker=11, At=12, Slash=13, Colon=14, 
		Message=15, FieldReference=16, EndStringInterpolate=17, SemiColon=18, 
		Comma=19, Deconstructor=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, Lambda=29, 
		StartTemplatesDefinition=30, StartSourceDefinition=31, StartSinkDefinition=32, 
		StartComposerDefinition=33, StartProcessorDefinition=34, EndDefinition=35, 
		Rule=36, First=37, Last=38, TemplateMatch=39, Range=40, Plus=41, Minus=42, 
		Star=43, TruncateDivide=44, Mod=45, Question=46, Equal=47, Else=48, EndMatcher=49, 
		BeginCondition=50, StartTestDefinition=51, Assert=52, CoreSystem=53, With=54, 
		Provided=55, Modified=56, Zero=57, PositiveInteger=58, START_STRING=59, 
		IDENTIFIER=60, WS=61, Comment=62, REGEX_TEXT=63, END_REGEX=64, StartCharacterCode=65, 
		StartStringInterpolate=66, STRING_TEXT=67, END_STRING=68;
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
			"StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "At", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "CoreSystem", "With", "Provided", "Modified", 
			"Zero", "PositiveInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'->'", "'!'", "'$'", "'^'", "'@'", "'/'", "':'", null, null, null, "';'", 
			"','", "'...'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'\\'", "'templates'", "'source'", "'sink'", "'composer'", "'processor'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", "'test'", 
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "At", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "CoreSystem", "With", "Provided", "Modified", 
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "Comment", 
			"REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
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
		case 16:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 68:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01e1\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\3"+
		"8\39\39\39\39\39\39\39\39\39\3:\3:\3;\3;\5;\u018d\n;\3<\6<\u0190\n<\r"+
		"<\16<\u0191\3=\3=\3=\3=\3>\3>\7>\u019a\n>\f>\16>\u019d\13>\3?\3?\3@\3"+
		"@\5@\u01a3\n@\3A\6A\u01a6\nA\rA\16A\u01a7\3A\3A\3B\7B\u01ad\nB\fB\16B"+
		"\u01b0\13B\3B\5B\u01b3\nB\3B\3B\3B\3C\6C\u01b9\nC\rC\16C\u01ba\3D\3D\3"+
		"D\5D\u01c0\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\6H\u01d3"+
		"\nH\rH\16H\u01d4\3I\3I\3I\3I\3I\5I\u01dc\nI\3J\3J\3J\3J\2\2K\6\3\b\4\n"+
		"\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23"+
		"(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%"+
		"L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64j\65l\66n\67p8r9t:v;x<z\2|="+
		"~>\u0080\2\u0082\2\u0084?\u0086@\u0088A\u008a\2\u008cB\u008eC\u0090D\u0092"+
		"E\u0094\2\u0096F\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13"+
		"\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u01e3\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66"+
		"\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2"+
		"\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2"+
		"\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\"+
		"\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2"+
		"\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2"+
		"\2v\3\2\2\2\2x\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0084\3\2\2\2\3\u0086\3"+
		"\2\2\2\4\u0088\3\2\2\2\4\u008c\3\2\2\2\5\u008e\3\2\2\2\5\u0090\3\2\2\2"+
		"\5\u0092\3\2\2\2\5\u0096\3\2\2\2\6\u0098\3\2\2\2\b\u009e\3\2\2\2\n\u00a6"+
		"\3\2\2\2\f\u00ab\3\2\2\2\16\u00af\3\2\2\2\20\u00b4\3\2\2\2\22\u00b7\3"+
		"\2\2\2\24\u00c1\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2"+
		"\2\2\34\u00ca\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2\2\2\"\u00d0\3\2\2\2"+
		"$\u00d5\3\2\2\2&\u00d8\3\2\2\2(\u00de\3\2\2\2*\u00e0\3\2\2\2,\u00e2\3"+
		"\2\2\2.\u00e6\3\2\2\2\60\u00e8\3\2\2\2\62\u00ec\3\2\2\2\64\u00f0\3\2\2"+
		"\2\66\u00f2\3\2\2\28\u00f4\3\2\2\2:\u00f6\3\2\2\2<\u00f8\3\2\2\2>\u00fa"+
		"\3\2\2\2@\u00fc\3\2\2\2B\u0106\3\2\2\2D\u010d\3\2\2\2F\u0112\3\2\2\2H"+
		"\u011b\3\2\2\2J\u0125\3\2\2\2L\u0129\3\2\2\2N\u012e\3\2\2\2P\u0134\3\2"+
		"\2\2R\u0139\3\2\2\2T\u013b\3\2\2\2V\u013e\3\2\2\2X\u0140\3\2\2\2Z\u0142"+
		"\3\2\2\2\\\u0144\3\2\2\2^\u0147\3\2\2\2`\u014b\3\2\2\2b\u014d\3\2\2\2"+
		"d\u014f\3\2\2\2f\u0151\3\2\2\2h\u0153\3\2\2\2j\u0158\3\2\2\2l\u015d\3"+
		"\2\2\2n\u0164\3\2\2\2p\u0171\3\2\2\2r\u0176\3\2\2\2t\u017f\3\2\2\2v\u0188"+
		"\3\2\2\2x\u018a\3\2\2\2z\u018f\3\2\2\2|\u0193\3\2\2\2~\u0197\3\2\2\2\u0080"+
		"\u019e\3\2\2\2\u0082\u01a2\3\2\2\2\u0084\u01a5\3\2\2\2\u0086\u01ae\3\2"+
		"\2\2\u0088\u01b8\3\2\2\2\u008a\u01bf\3\2\2\2\u008c\u01c1\3\2\2\2\u008e"+
		"\u01c5\3\2\2\2\u0090\u01cc\3\2\2\2\u0092\u01d2\3\2\2\2\u0094\u01db\3\2"+
		"\2\2\u0096\u01dd\3\2\2\2\u0098\u0099\7\61\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\2\2\2\u009c\u009d\b\2\3\2\u009d\7\3\2\2\2"+
		"\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2"+
		"\7n\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\t\3\2\2\2\u00a6\u00a7\7X\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7K\2\2\u00a9"+
		"\u00aa\7F\2\2\u00aa\13\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7h\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7f\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\21\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7y\2\2"+
		"\u00bd\u00be\7k\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\23\3\2"+
		"\2\2\u00c1\u00c2\7/\2\2\u00c2\u00c3\7@\2\2\u00c3\25\3\2\2\2\u00c4\u00c5"+
		"\7#\2\2\u00c5\27\3\2\2\2\u00c6\u00c7\7&\2\2\u00c7\31\3\2\2\2\u00c8\u00c9"+
		"\7`\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\7B\2\2\u00cb\35\3\2\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf!\3\2\2\2\u00d0\u00d1"+
		"\7<\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5~>\2\u00d4"+
		"#\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\5~>\2\u00d7%\3\2\2\2\u00d8"+
		"\u00d9\7=\2\2\u00d9\u00da\6\22\2\2\u00da\u00db\b\22\4\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00dd\b\22\5\2\u00dd\'\3\2\2\2\u00de\u00df\7=\2\2\u00df)"+
		"\3\2\2\2\u00e0\u00e1\7.\2\2\u00e1+\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3"+
		"\u00e4\7\60\2\2\u00e4\u00e5\7\60\2\2\u00e5-\3\2\2\2\u00e6\u00e7\7\u0080"+
		"\2\2\u00e7/\3\2\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\b\27\6\2\u00eb\61\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\b\30\5\2\u00ef\63\3\2\2\2\u00f0\u00f1\7]\2\2\u00f1\65\3\2\2\2\u00f2"+
		"\u00f3\7_\2\2\u00f3\67\3\2\2\2\u00f4\u00f5\7}\2\2\u00f59\3\2\2\2\u00f6"+
		"\u00f7\7\177\2\2\u00f7;\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9=\3\2\2\2\u00fa"+
		"\u00fb\7^\2\2\u00fb?\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\u00ff\7o\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7n\2\2\u0101\u0102\7c\2\2"+
		"\u0102\u0103\7v\2\2\u0103\u0104\7g\2\2\u0104\u0105\7u\2\2\u0105A\3\2\2"+
		"\2\u0106\u0107\7u\2\2\u0107\u0108\7q\2\2\u0108\u0109\7w\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7e\2\2\u010b\u010c\7g\2\2\u010cC\3\2\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7m\2\2\u0111"+
		"E\3\2\2\2\u0112\u0113\7e\2\2\u0113\u0114\7q\2\2\u0114\u0115\7o\2\2\u0115"+
		"\u0116\7r\2\2\u0116\u0117\7q\2\2\u0117\u0118\7u\2\2\u0118\u0119\7g\2\2"+
		"\u0119\u011a\7t\2\2\u011aG\3\2\2\2\u011b\u011c\7r\2\2\u011c\u011d\7t\2"+
		"\2\u011d\u011e\7q\2\2\u011e\u011f\7e\2\2\u011f\u0120\7g\2\2\u0120\u0121"+
		"\7u\2\2\u0121\u0122\7u\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124"+
		"I\3\2\2\2\u0125\u0126\7g\2\2\u0126\u0127\7p\2\2\u0127\u0128\7f\2\2\u0128"+
		"K\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b\7w\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7g\2\2\u012dM\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7t\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133O\3\2\2\2\u0134"+
		"\u0135\7n\2\2\u0135\u0136\7c\2\2\u0136\u0137\7u\2\2\u0137\u0138\7v\2\2"+
		"\u0138Q\3\2\2\2\u0139\u013a\7%\2\2\u013aS\3\2\2\2\u013b\u013c\7\60\2\2"+
		"\u013c\u013d\7\60\2\2\u013dU\3\2\2\2\u013e\u013f\7-\2\2\u013fW\3\2\2\2"+
		"\u0140\u0141\7/\2\2\u0141Y\3\2\2\2\u0142\u0143\7,\2\2\u0143[\3\2\2\2\u0144"+
		"\u0145\7\u0080\2\2\u0145\u0146\7\61\2\2\u0146]\3\2\2\2\u0147\u0148\7o"+
		"\2\2\u0148\u0149\7q\2\2\u0149\u014a\7f\2\2\u014a_\3\2\2\2\u014b\u014c"+
		"\7A\2\2\u014ca\3\2\2\2\u014d\u014e\7?\2\2\u014ec\3\2\2\2\u014f\u0150\7"+
		"~\2\2\u0150e\3\2\2\2\u0151\u0152\7@\2\2\u0152g\3\2\2\2\u0153\u0154\7A"+
		"\2\2\u0154\u0155\7*\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b\63\6\2\u0157"+
		"i\3\2\2\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7u\2\2\u015b"+
		"\u015c\7v\2\2\u015ck\3\2\2\2\u015d\u015e\7c\2\2\u015e\u015f\7u\2\2\u015f"+
		"\u0160\7u\2\2\u0160\u0161\7g\2\2\u0161\u0162\7t\2\2\u0162\u0163\7v\2\2"+
		"\u0163m\3\2\2\2\u0164\u0165\7e\2\2\u0165\u0166\7q\2\2\u0166\u0167\7t\2"+
		"\2\u0167\u0168\7g\2\2\u0168\u0169\7/\2\2\u0169\u016a\7u\2\2\u016a\u016b"+
		"\7{\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u016f\7o\2\2\u016f\u0170\7\61\2\2\u0170o\3\2\2\2\u0171\u0172\7y\2\2\u0172"+
		"\u0173\7k\2\2\u0173\u0174\7v\2\2\u0174\u0175\7j\2\2\u0175q\3\2\2\2\u0176"+
		"\u0177\7r\2\2\u0177\u0178\7t\2\2\u0178\u0179\7q\2\2\u0179\u017a\7x\2\2"+
		"\u017a\u017b\7k\2\2\u017b\u017c\7f\2\2\u017c\u017d\7g\2\2\u017d\u017e"+
		"\7f\2\2\u017es\3\2\2\2\u017f\u0180\7o\2\2\u0180\u0181\7q\2\2\u0181\u0182"+
		"\7f\2\2\u0182\u0183\7k\2\2\u0183\u0184\7h\2\2\u0184\u0185\7k\2\2\u0185"+
		"\u0186\7g\2\2\u0186\u0187\7f\2\2\u0187u\3\2\2\2\u0188\u0189\7\62\2\2\u0189"+
		"w\3\2\2\2\u018a\u018c\t\2\2\2\u018b\u018d\5z<\2\u018c\u018b\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018dy\3\2\2\2\u018e\u0190\t\3\2\2\u018f\u018e\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192{\3"+
		"\2\2\2\u0193\u0194\7)\2\2\u0194\u0195\3\2\2\2\u0195\u0196\b=\7\2\u0196"+
		"}\3\2\2\2\u0197\u019b\5\u0080?\2\u0198\u019a\5\u0082@\2\u0199\u0198\3"+
		"\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\177\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\t\4\2\2\u019f\u0081\3\2\2"+
		"\2\u01a0\u01a3\5\u0080?\2\u01a1\u01a3\t\5\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u0083\3\2\2\2\u01a4\u01a6\t\6\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01aa\bA\2\2\u01aa\u0085\3\2\2\2\u01ab\u01ad\n\7"+
		"\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\t\b"+
		"\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\bB\2\2\u01b5"+
		"\u01b6\bB\5\2\u01b6\u0087\3\2\2\2\u01b7\u01b9\5\u008aD\2\u01b8\u01b7\3"+
		"\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u0089\3\2\2\2\u01bc\u01bd\7)\2\2\u01bd\u01c0\7)\2\2\u01be\u01c0\n\t\2"+
		"\2\u01bf\u01bc\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u008b\3\2\2\2\u01c1\u01c2"+
		"\7)\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\bE\5\2\u01c4\u008d\3\2\2\2\u01c5"+
		"\u01c6\7&\2\2\u01c6\u01c7\7%\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\bF\b"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\bF\6\2\u01cb\u008f\3\2\2\2\u01cc\u01cd"+
		"\7&\2\2\u01cd\u01ce\bG\t\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bG\6\2\u01d0"+
		"\u0091\3\2\2\2\u01d1\u01d3\5\u0094I\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u0093\3\2\2\2\u01d6"+
		"\u01d7\7)\2\2\u01d7\u01dc\7)\2\2\u01d8\u01d9\7&\2\2\u01d9\u01dc\7&\2\2"+
		"\u01da\u01dc\n\n\2\2\u01db\u01d6\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01da"+
		"\3\2\2\2\u01dc\u0095\3\2\2\2\u01dd\u01de\7)\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\bJ\5\2\u01e0\u0097\3\2\2\2\21\2\3\4\5\u018c\u0191\u019b\u01a2\u01a7"+
		"\u01ae\u01b2\u01ba\u01bf\u01d4\u01db\n\b\2\2\7\3\2\3\22\2\6\2\2\7\2\2"+
		"\7\5\2\3F\3\3G\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}