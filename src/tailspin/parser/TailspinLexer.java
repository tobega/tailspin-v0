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
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, Lambda=29, 
		StartTemplatesDefinition=30, StartSourceDefinition=31, StartSinkDefinition=32, 
		StartComposerDefinition=33, StartProcessorDefinition=34, EndDefinition=35, 
		Rule=36, First=37, Last=38, TemplateMatch=39, Range=40, Plus=41, Minus=42, 
		Star=43, TruncateDivide=44, Mod=45, Question=46, Equal=47, Else=48, EndMatcher=49, 
		BeginCondition=50, StartTestDefinition=51, Assert=52, CoreSystem=53, With=54, 
		Provided=55, Modified=56, From=57, StandAlone=58, Zero=59, PositiveInteger=60, 
		START_STRING=61, STATE_IDENTIFIER=62, IDENTIFIER=63, WS=64, Comment=65, 
		REGEX_TEXT=66, END_REGEX=67, StartCharacterCode=68, StartStringInterpolate=69, 
		STRING_TEXT=70, END_STRING=71;
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
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "And", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "CoreSystem", "With", "Provided", "Modified", 
			"From", "StandAlone", "Zero", "PositiveInteger", "Digits", "START_STRING", 
			"STATE_IDENTIFIER", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'->'", "'!'", "'$'", "'^'", "'&'", "'/'", "':'", null, null, null, "';'", 
			"','", "'...'", "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'\\'", "'templates'", "'source'", "'sink'", "'composer'", "'processor'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", "'test'", 
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'from'", 
			"'stand-alone'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"To", "ResultMarker", "SourceMarker", "DeleteMarker", "And", "Slash", 
			"Colon", "Message", "FieldReference", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "Lambda", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"Rule", "First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"TruncateDivide", "Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", 
			"StartTestDefinition", "Assert", "CoreSystem", "With", "Provided", "Modified", 
			"From", "StandAlone", "Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", 
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
		case 71:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u01ff\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3=\3=\5=\u01a4\n=\3>\6>\u01a7\n>"+
		"\r>\16>\u01a8\3?\3?\3?\3?\3@\3@\7@\u01b1\n@\f@\16@\u01b4\13@\3A\3A\7A"+
		"\u01b8\nA\fA\16A\u01bb\13A\3B\3B\3C\3C\5C\u01c1\nC\3D\6D\u01c4\nD\rD\16"+
		"D\u01c5\3D\3D\3E\7E\u01cb\nE\fE\16E\u01ce\13E\3E\5E\u01d1\nE\3E\3E\3E"+
		"\3F\6F\u01d7\nF\rF\16F\u01d8\3G\3G\3G\5G\u01de\nG\3H\3H\3H\3H\3I\3I\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\6K\u01f1\nK\rK\16K\u01f2\3L\3L\3L\3L\3"+
		"L\5L\u01fa\nL\3M\3M\3M\3M\2\2N\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26"+
		"\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31"+
		"\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61"+
		"d\62f\63h\64j\65l\66n\67p8r9t:v;x<z=|>~\2\u0080?\u0082@\u0084A\u0086\2"+
		"\u0088\2\u008aB\u008cC\u008eD\u0090\2\u0092E\u0094F\u0096G\u0098H\u009a"+
		"\2\u009cI\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u0202\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3"+
		"\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2"+
		"\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2"+
		"\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2"+
		"\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2"+
		"\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P"+
		"\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3"+
		"\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2"+
		"\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2"+
		"v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2\u0080\3\2\2\2\2\u0082\3\2"+
		"\2\2\2\u0084\3\2\2\2\2\u008a\3\2\2\2\3\u008c\3\2\2\2\4\u008e\3\2\2\2\4"+
		"\u0092\3\2\2\2\5\u0094\3\2\2\2\5\u0096\3\2\2\2\5\u0098\3\2\2\2\5\u009c"+
		"\3\2\2\2\6\u009e\3\2\2\2\b\u00a4\3\2\2\2\n\u00ac\3\2\2\2\f\u00b1\3\2\2"+
		"\2\16\u00b5\3\2\2\2\20\u00ba\3\2\2\2\22\u00bd\3\2\2\2\24\u00c7\3\2\2\2"+
		"\26\u00ca\3\2\2\2\30\u00cc\3\2\2\2\32\u00ce\3\2\2\2\34\u00d0\3\2\2\2\36"+
		"\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00d6\3\2\2\2$\u00db\3\2\2\2&\u00de\3"+
		"\2\2\2(\u00e4\3\2\2\2*\u00e6\3\2\2\2,\u00e8\3\2\2\2.\u00ec\3\2\2\2\60"+
		"\u00ee\3\2\2\2\62\u00f2\3\2\2\2\64\u00f6\3\2\2\2\66\u00f8\3\2\2\28\u00fa"+
		"\3\2\2\2:\u00fc\3\2\2\2<\u00fe\3\2\2\2>\u0100\3\2\2\2@\u0102\3\2\2\2B"+
		"\u010c\3\2\2\2D\u0113\3\2\2\2F\u0118\3\2\2\2H\u0121\3\2\2\2J\u012b\3\2"+
		"\2\2L\u012f\3\2\2\2N\u0134\3\2\2\2P\u013a\3\2\2\2R\u013f\3\2\2\2T\u0141"+
		"\3\2\2\2V\u0144\3\2\2\2X\u0146\3\2\2\2Z\u0148\3\2\2\2\\\u014a\3\2\2\2"+
		"^\u014d\3\2\2\2`\u0151\3\2\2\2b\u0153\3\2\2\2d\u0155\3\2\2\2f\u0157\3"+
		"\2\2\2h\u0159\3\2\2\2j\u015e\3\2\2\2l\u0163\3\2\2\2n\u016a\3\2\2\2p\u0177"+
		"\3\2\2\2r\u017c\3\2\2\2t\u0185\3\2\2\2v\u018e\3\2\2\2x\u0193\3\2\2\2z"+
		"\u019f\3\2\2\2|\u01a1\3\2\2\2~\u01a6\3\2\2\2\u0080\u01aa\3\2\2\2\u0082"+
		"\u01ae\3\2\2\2\u0084\u01b5\3\2\2\2\u0086\u01bc\3\2\2\2\u0088\u01c0\3\2"+
		"\2\2\u008a\u01c3\3\2\2\2\u008c\u01cc\3\2\2\2\u008e\u01d6\3\2\2\2\u0090"+
		"\u01dd\3\2\2\2\u0092\u01df\3\2\2\2\u0094\u01e3\3\2\2\2\u0096\u01ea\3\2"+
		"\2\2\u0098\u01f0\3\2\2\2\u009a\u01f9\3\2\2\2\u009c\u01fb\3\2\2\2\u009e"+
		"\u009f\7\61\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b"+
		"\2\2\2\u00a2\u00a3\b\2\3\2\u00a3\7\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\t\3\2\2\2\u00ac\u00ad\7X\2\2\u00ad"+
		"\u00ae\7Q\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7F\2\2\u00b0\13\3\2\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7h\2\2\u00b4\r\3\2\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2"+
		"\u00b9\17\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\21\3\2\2"+
		"\2\u00bd\u00be\7q\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7u\2\2\u00c5\u00c6\7g\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8"+
		"\u00c9\7@\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\27\3\2\2\2\u00cc"+
		"\u00cd\7&\2\2\u00cd\31\3\2\2\2\u00ce\u00cf\7`\2\2\u00cf\33\3\2\2\2\u00d0"+
		"\u00d1\7(\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3\37\3\2\2\2\u00d4"+
		"\u00d5\7<\2\2\u00d5!\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7\u00d8\7<\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\5\u0084A\2\u00da#\3\2\2\2\u00db\u00dc\7\60"+
		"\2\2\u00dc\u00dd\5\u0084A\2\u00dd%\3\2\2\2\u00de\u00df\7=\2\2\u00df\u00e0"+
		"\6\22\2\2\u00e0\u00e1\b\22\4\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b\22\5"+
		"\2\u00e3\'\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5)\3\2\2\2\u00e6\u00e7\7.\2"+
		"\2\u00e7+\3\2\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb"+
		"\7\60\2\2\u00eb-\3\2\2\2\u00ec\u00ed\7\u0080\2\2\u00ed/\3\2\2\2\u00ee"+
		"\u00ef\7*\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\27\6\2\u00f1\61\3\2\2"+
		"\2\u00f2\u00f3\7+\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\30\5\2\u00f5\63"+
		"\3\2\2\2\u00f6\u00f7\7]\2\2\u00f7\65\3\2\2\2\u00f8\u00f9\7_\2\2\u00f9"+
		"\67\3\2\2\2\u00fa\u00fb\7}\2\2\u00fb9\3\2\2\2\u00fc\u00fd\7\177\2\2\u00fd"+
		";\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff=\3\2\2\2\u0100\u0101\7^\2\2\u0101?"+
		"\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7g\2\2\u0104\u0105\7o\2\2\u0105"+
		"\u0106\7r\2\2\u0106\u0107\7n\2\2\u0107\u0108\7c\2\2\u0108\u0109\7v\2\2"+
		"\u0109\u010a\7g\2\2\u010a\u010b\7u\2\2\u010bA\3\2\2\2\u010c\u010d\7u\2"+
		"\2\u010d\u010e\7q\2\2\u010e\u010f\7w\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7e\2\2\u0111\u0112\7g\2\2\u0112C\3\2\2\2\u0113\u0114\7u\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117\7m\2\2\u0117E\3\2\2\2\u0118\u0119"+
		"\7e\2\2\u0119\u011a\7q\2\2\u011a\u011b\7o\2\2\u011b\u011c\7r\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7u\2\2\u011e\u011f\7g\2\2\u011f\u0120\7t\2\2"+
		"\u0120G\3\2\2\2\u0121\u0122\7r\2\2\u0122\u0123\7t\2\2\u0123\u0124\7q\2"+
		"\2\u0124\u0125\7e\2\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127\u0128"+
		"\7u\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012aI\3\2\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7p\2\2\u012d\u012e\7f\2\2\u012eK\3\2\2\2\u012f\u0130"+
		"\7t\2\2\u0130\u0131\7w\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u0133"+
		"M\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7k\2\2\u0136\u0137\7t\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139O\3\2\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e\7v\2\2\u013eQ\3\2\2\2\u013f"+
		"\u0140\7%\2\2\u0140S\3\2\2\2\u0141\u0142\7\60\2\2\u0142\u0143\7\60\2\2"+
		"\u0143U\3\2\2\2\u0144\u0145\7-\2\2\u0145W\3\2\2\2\u0146\u0147\7/\2\2\u0147"+
		"Y\3\2\2\2\u0148\u0149\7,\2\2\u0149[\3\2\2\2\u014a\u014b\7\u0080\2\2\u014b"+
		"\u014c\7\61\2\2\u014c]\3\2\2\2\u014d\u014e\7o\2\2\u014e\u014f\7q\2\2\u014f"+
		"\u0150\7f\2\2\u0150_\3\2\2\2\u0151\u0152\7A\2\2\u0152a\3\2\2\2\u0153\u0154"+
		"\7?\2\2\u0154c\3\2\2\2\u0155\u0156\7~\2\2\u0156e\3\2\2\2\u0157\u0158\7"+
		"@\2\2\u0158g\3\2\2\2\u0159\u015a\7A\2\2\u015a\u015b\7*\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015d\b\63\6\2\u015di\3\2\2\2\u015e\u015f\7v\2\2\u015f"+
		"\u0160\7g\2\2\u0160\u0161\7u\2\2\u0161\u0162\7v\2\2\u0162k\3\2\2\2\u0163"+
		"\u0164\7c\2\2\u0164\u0165\7u\2\2\u0165\u0166\7u\2\2\u0166\u0167\7g\2\2"+
		"\u0167\u0168\7t\2\2\u0168\u0169\7v\2\2\u0169m\3\2\2\2\u016a\u016b\7e\2"+
		"\2\u016b\u016c\7q\2\2\u016c\u016d\7t\2\2\u016d\u016e\7g\2\2\u016e\u016f"+
		"\7/\2\2\u016f\u0170\7u\2\2\u0170\u0171\7{\2\2\u0171\u0172\7u\2\2\u0172"+
		"\u0173\7v\2\2\u0173\u0174\7g\2\2\u0174\u0175\7o\2\2\u0175\u0176\7\61\2"+
		"\2\u0176o\3\2\2\2\u0177\u0178\7y\2\2\u0178\u0179\7k\2\2\u0179\u017a\7"+
		"v\2\2\u017a\u017b\7j\2\2\u017bq\3\2\2\2\u017c\u017d\7r\2\2\u017d\u017e"+
		"\7t\2\2\u017e\u017f\7q\2\2\u017f\u0180\7x\2\2\u0180\u0181\7k\2\2\u0181"+
		"\u0182\7f\2\2\u0182\u0183\7g\2\2\u0183\u0184\7f\2\2\u0184s\3\2\2\2\u0185"+
		"\u0186\7o\2\2\u0186\u0187\7q\2\2\u0187\u0188\7f\2\2\u0188\u0189\7k\2\2"+
		"\u0189\u018a\7h\2\2\u018a\u018b\7k\2\2\u018b\u018c\7g\2\2\u018c\u018d"+
		"\7f\2\2\u018du\3\2\2\2\u018e\u018f\7h\2\2\u018f\u0190\7t\2\2\u0190\u0191"+
		"\7q\2\2\u0191\u0192\7o\2\2\u0192w\3\2\2\2\u0193\u0194\7u\2\2\u0194\u0195"+
		"\7v\2\2\u0195\u0196\7c\2\2\u0196\u0197\7p\2\2\u0197\u0198\7f\2\2\u0198"+
		"\u0199\7/\2\2\u0199\u019a\7c\2\2\u019a\u019b\7n\2\2\u019b\u019c\7q\2\2"+
		"\u019c\u019d\7p\2\2\u019d\u019e\7g\2\2\u019ey\3\2\2\2\u019f\u01a0\7\62"+
		"\2\2\u01a0{\3\2\2\2\u01a1\u01a3\t\2\2\2\u01a2\u01a4\5~>\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4}\3\2\2\2\u01a5\u01a7\t\3\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\177\3\2\2\2\u01aa\u01ab\7)\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad"+
		"\b?\7\2\u01ad\u0081\3\2\2\2\u01ae\u01b2\7B\2\2\u01af\u01b1\5\u0088C\2"+
		"\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u0083\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b9\5\u0086B"+
		"\2\u01b6\u01b8\5\u0088C\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u0085\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bd\t\4\2\2\u01bd\u0087\3\2\2\2\u01be\u01c1\5\u0086B\2\u01bf"+
		"\u01c1\t\5\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u0089\3\2"+
		"\2\2\u01c2\u01c4\t\6\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\bD"+
		"\2\2\u01c8\u008b\3\2\2\2\u01c9\u01cb\n\7\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\t\b\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\bE\2\2\u01d3\u01d4\bE\5\2\u01d4\u008d\3\2\2"+
		"\2\u01d5\u01d7\5\u0090G\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u008f\3\2\2\2\u01da\u01db\7)"+
		"\2\2\u01db\u01de\7)\2\2\u01dc\u01de\n\t\2\2\u01dd\u01da\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u0091\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\bH\5\2\u01e2\u0093\3\2\2\2\u01e3\u01e4\7&\2\2\u01e4\u01e5"+
		"\7%\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\bI\b\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\bI\6\2\u01e9\u0095\3\2\2\2\u01ea\u01eb\7&\2\2\u01eb\u01ec\bJ\t"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\bJ\6\2\u01ee\u0097\3\2\2\2\u01ef\u01f1"+
		"\5\u009aL\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2"+
		"\2\u01f2\u01f3\3\2\2\2\u01f3\u0099\3\2\2\2\u01f4\u01f5\7)\2\2\u01f5\u01fa"+
		"\7)\2\2\u01f6\u01f7\7&\2\2\u01f7\u01fa\7&\2\2\u01f8\u01fa\n\n\2\2\u01f9"+
		"\u01f4\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u009b\3\2"+
		"\2\2\u01fb\u01fc\7)\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\bM\5\2\u01fe\u009d"+
		"\3\2\2\2\22\2\3\4\5\u01a3\u01a8\u01b2\u01b9\u01c0\u01c5\u01cc\u01d0\u01d8"+
		"\u01dd\u01f2\u01f9\n\b\2\2\7\3\2\3\22\2\6\2\2\7\2\2\7\5\2\3I\3\3J\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}