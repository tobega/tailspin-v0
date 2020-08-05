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
		Provided=55, Modified=56, Zero=57, PositiveInteger=58, START_STRING=59, 
		STATE_IDENTIFIER=60, IDENTIFIER=61, WS=62, Comment=63, REGEX_TEXT=64, 
		END_REGEX=65, StartCharacterCode=66, StartStringInterpolate=67, STRING_TEXT=68, 
		END_STRING=69;
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
			"Zero", "PositiveInteger", "Digits", "START_STRING", "STATE_IDENTIFIER", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Comment", 
			"REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
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
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'0'"
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
			"Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
			"WS", "Comment", "REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
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
		case 69:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01ea\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3;\3;\5;\u018f\n;\3<\6<\u0192"+
		"\n<\r<\16<\u0193\3=\3=\3=\3=\3>\3>\7>\u019c\n>\f>\16>\u019f\13>\3?\3?"+
		"\7?\u01a3\n?\f?\16?\u01a6\13?\3@\3@\3A\3A\5A\u01ac\nA\3B\6B\u01af\nB\r"+
		"B\16B\u01b0\3B\3B\3C\7C\u01b6\nC\fC\16C\u01b9\13C\3C\5C\u01bc\nC\3C\3"+
		"C\3C\3D\6D\u01c2\nD\rD\16D\u01c3\3E\3E\3E\5E\u01c9\nE\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\6I\u01dc\nI\rI\16I\u01dd\3J\3J\3J\3"+
		"J\3J\5J\u01e5\nJ\3K\3K\3K\3K\2\2L\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n"+
		"\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62"+
		"\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60"+
		"b\61d\62f\63h\64j\65l\66n\67p8r9t:v;x<z\2|=~>\u0080?\u0082\2\u0084\2\u0086"+
		"@\u0088A\u008aB\u008c\2\u008eC\u0090D\u0092E\u0094F\u0096\2\u0098G\6\2"+
		"\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f"+
		"\f\3\3\f\f\3\2))\4\2&&))\2\u01ed\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2"+
		"\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3"+
		"\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2"+
		"\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2"+
		".\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2"+
		"\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2"+
		"F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3"+
		"\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2"+
		"\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2"+
		"\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x"+
		"\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0086\3\2\2\2\3\u0088"+
		"\3\2\2\2\4\u008a\3\2\2\2\4\u008e\3\2\2\2\5\u0090\3\2\2\2\5\u0092\3\2\2"+
		"\2\5\u0094\3\2\2\2\5\u0098\3\2\2\2\6\u009a\3\2\2\2\b\u00a0\3\2\2\2\n\u00a8"+
		"\3\2\2\2\f\u00ad\3\2\2\2\16\u00b1\3\2\2\2\20\u00b6\3\2\2\2\22\u00b9\3"+
		"\2\2\2\24\u00c3\3\2\2\2\26\u00c6\3\2\2\2\30\u00c8\3\2\2\2\32\u00ca\3\2"+
		"\2\2\34\u00cc\3\2\2\2\36\u00ce\3\2\2\2 \u00d0\3\2\2\2\"\u00d2\3\2\2\2"+
		"$\u00d7\3\2\2\2&\u00da\3\2\2\2(\u00e0\3\2\2\2*\u00e2\3\2\2\2,\u00e4\3"+
		"\2\2\2.\u00e8\3\2\2\2\60\u00ea\3\2\2\2\62\u00ee\3\2\2\2\64\u00f2\3\2\2"+
		"\2\66\u00f4\3\2\2\28\u00f6\3\2\2\2:\u00f8\3\2\2\2<\u00fa\3\2\2\2>\u00fc"+
		"\3\2\2\2@\u00fe\3\2\2\2B\u0108\3\2\2\2D\u010f\3\2\2\2F\u0114\3\2\2\2H"+
		"\u011d\3\2\2\2J\u0127\3\2\2\2L\u012b\3\2\2\2N\u0130\3\2\2\2P\u0136\3\2"+
		"\2\2R\u013b\3\2\2\2T\u013d\3\2\2\2V\u0140\3\2\2\2X\u0142\3\2\2\2Z\u0144"+
		"\3\2\2\2\\\u0146\3\2\2\2^\u0149\3\2\2\2`\u014d\3\2\2\2b\u014f\3\2\2\2"+
		"d\u0151\3\2\2\2f\u0153\3\2\2\2h\u0155\3\2\2\2j\u015a\3\2\2\2l\u015f\3"+
		"\2\2\2n\u0166\3\2\2\2p\u0173\3\2\2\2r\u0178\3\2\2\2t\u0181\3\2\2\2v\u018a"+
		"\3\2\2\2x\u018c\3\2\2\2z\u0191\3\2\2\2|\u0195\3\2\2\2~\u0199\3\2\2\2\u0080"+
		"\u01a0\3\2\2\2\u0082\u01a7\3\2\2\2\u0084\u01ab\3\2\2\2\u0086\u01ae\3\2"+
		"\2\2\u0088\u01b7\3\2\2\2\u008a\u01c1\3\2\2\2\u008c\u01c8\3\2\2\2\u008e"+
		"\u01ca\3\2\2\2\u0090\u01ce\3\2\2\2\u0092\u01d5\3\2\2\2\u0094\u01db\3\2"+
		"\2\2\u0096\u01e4\3\2\2\2\u0098\u01e6\3\2\2\2\u009a\u009b\7\61\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\2\2\2\u009e\u009f\b"+
		"\2\3\2\u009f\7\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3"+
		"\7e\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\t\3\2\2\2\u00a8\u00a9\7X\2\2\u00a9\u00aa\7Q\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7F\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7h\2\2\u00b0\r\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\17\3\2\2\2\u00b6"+
		"\u00b7\7f\2\2\u00b7\u00b8\7q\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7t\2\2"+
		"\u00be\u00bf\7y\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7@\2\2\u00c5\25"+
		"\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00cb\7`\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\37\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1"+
		"!\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\5\u0080?\2\u00d6#\3\2\2\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9\5\u0080"+
		"?\2\u00d9%\3\2\2\2\u00da\u00db\7=\2\2\u00db\u00dc\6\22\2\2\u00dc\u00dd"+
		"\b\22\4\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\22\5\2\u00df\'\3\2\2\2\u00e0"+
		"\u00e1\7=\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3+\3\2\2\2\u00e4\u00e5"+
		"\7\60\2\2\u00e5\u00e6\7\60\2\2\u00e6\u00e7\7\60\2\2\u00e7-\3\2\2\2\u00e8"+
		"\u00e9\7\u0080\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ec\3\2\2"+
		"\2\u00ec\u00ed\b\27\6\2\u00ed\61\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\b\30\5\2\u00f1\63\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3"+
		"\65\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5\67\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7"+
		"9\3\2\2\2\u00f8\u00f9\7\177\2\2\u00f9;\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb"+
		"=\3\2\2\2\u00fc\u00fd\7^\2\2\u00fd?\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7g\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2\u0102\u0103\7n\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7u\2\2"+
		"\u0107A\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7q\2\2\u010a\u010b\7w\2"+
		"\2\u010b\u010c\7t\2\2\u010c\u010d\7e\2\2\u010d\u010e\7g\2\2\u010eC\3\2"+
		"\2\2\u010f\u0110\7u\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113"+
		"\7m\2\2\u0113E\3\2\2\2\u0114\u0115\7e\2\2\u0115\u0116\7q\2\2\u0116\u0117"+
		"\7o\2\2\u0117\u0118\7r\2\2\u0118\u0119\7q\2\2\u0119\u011a\7u\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7t\2\2\u011cG\3\2\2\2\u011d\u011e\7r\2\2\u011e"+
		"\u011f\7t\2\2\u011f\u0120\7q\2\2\u0120\u0121\7e\2\2\u0121\u0122\7g\2\2"+
		"\u0122\u0123\7u\2\2\u0123\u0124\7u\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7t\2\2\u0126I\3\2\2\2\u0127\u0128\7g\2\2\u0128\u0129\7p\2\2\u0129\u012a"+
		"\7f\2\2\u012aK\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7w\2\2\u012d\u012e"+
		"\7n\2\2\u012e\u012f\7g\2\2\u012fM\3\2\2\2\u0130\u0131\7h\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7t\2\2\u0133\u0134\7u\2\2\u0134\u0135\7v\2\2\u0135"+
		"O\3\2\2\2\u0136\u0137\7n\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139"+
		"\u013a\7v\2\2\u013aQ\3\2\2\2\u013b\u013c\7%\2\2\u013cS\3\2\2\2\u013d\u013e"+
		"\7\60\2\2\u013e\u013f\7\60\2\2\u013fU\3\2\2\2\u0140\u0141\7-\2\2\u0141"+
		"W\3\2\2\2\u0142\u0143\7/\2\2\u0143Y\3\2\2\2\u0144\u0145\7,\2\2\u0145["+
		"\3\2\2\2\u0146\u0147\7\u0080\2\2\u0147\u0148\7\61\2\2\u0148]\3\2\2\2\u0149"+
		"\u014a\7o\2\2\u014a\u014b\7q\2\2\u014b\u014c\7f\2\2\u014c_\3\2\2\2\u014d"+
		"\u014e\7A\2\2\u014ea\3\2\2\2\u014f\u0150\7?\2\2\u0150c\3\2\2\2\u0151\u0152"+
		"\7~\2\2\u0152e\3\2\2\2\u0153\u0154\7@\2\2\u0154g\3\2\2\2\u0155\u0156\7"+
		"A\2\2\u0156\u0157\7*\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\63\6\2\u0159"+
		"i\3\2\2\2\u015a\u015b\7v\2\2\u015b\u015c\7g\2\2\u015c\u015d\7u\2\2\u015d"+
		"\u015e\7v\2\2\u015ek\3\2\2\2\u015f\u0160\7c\2\2\u0160\u0161\7u\2\2\u0161"+
		"\u0162\7u\2\2\u0162\u0163\7g\2\2\u0163\u0164\7t\2\2\u0164\u0165\7v\2\2"+
		"\u0165m\3\2\2\2\u0166\u0167\7e\2\2\u0167\u0168\7q\2\2\u0168\u0169\7t\2"+
		"\2\u0169\u016a\7g\2\2\u016a\u016b\7/\2\2\u016b\u016c\7u\2\2\u016c\u016d"+
		"\7{\2\2\u016d\u016e\7u\2\2\u016e\u016f\7v\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7o\2\2\u0171\u0172\7\61\2\2\u0172o\3\2\2\2\u0173\u0174\7y\2\2\u0174"+
		"\u0175\7k\2\2\u0175\u0176\7v\2\2\u0176\u0177\7j\2\2\u0177q\3\2\2\2\u0178"+
		"\u0179\7r\2\2\u0179\u017a\7t\2\2\u017a\u017b\7q\2\2\u017b\u017c\7x\2\2"+
		"\u017c\u017d\7k\2\2\u017d\u017e\7f\2\2\u017e\u017f\7g\2\2\u017f\u0180"+
		"\7f\2\2\u0180s\3\2\2\2\u0181\u0182\7o\2\2\u0182\u0183\7q\2\2\u0183\u0184"+
		"\7f\2\2\u0184\u0185\7k\2\2\u0185\u0186\7h\2\2\u0186\u0187\7k\2\2\u0187"+
		"\u0188\7g\2\2\u0188\u0189\7f\2\2\u0189u\3\2\2\2\u018a\u018b\7\62\2\2\u018b"+
		"w\3\2\2\2\u018c\u018e\t\2\2\2\u018d\u018f\5z<\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018fy\3\2\2\2\u0190\u0192\t\3\2\2\u0191\u0190\3\2\2\2"+
		"\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194{\3"+
		"\2\2\2\u0195\u0196\7)\2\2\u0196\u0197\3\2\2\2\u0197\u0198\b=\7\2\u0198"+
		"}\3\2\2\2\u0199\u019d\7B\2\2\u019a\u019c\5\u0084A\2\u019b\u019a\3\2\2"+
		"\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\177"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a4\5\u0082@\2\u01a1\u01a3\5\u0084"+
		"A\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u0081\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\t\4"+
		"\2\2\u01a8\u0083\3\2\2\2\u01a9\u01ac\5\u0082@\2\u01aa\u01ac\t\5\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u0085\3\2\2\2\u01ad\u01af\t\6"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\bB\2\2\u01b3\u0087\3\2"+
		"\2\2\u01b4\u01b6\n\7\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bc\t\b\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\bC\2\2\u01be\u01bf\bC\5\2\u01bf\u0089\3\2\2\2\u01c0\u01c2\5\u008c"+
		"E\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u008b\3\2\2\2\u01c5\u01c6\7)\2\2\u01c6\u01c9\7)\2"+
		"\2\u01c7\u01c9\n\t\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u008d"+
		"\3\2\2\2\u01ca\u01cb\7)\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\bF\5\2\u01cd"+
		"\u008f\3\2\2\2\u01ce\u01cf\7&\2\2\u01cf\u01d0\7%\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d2\bG\b\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\bG\6\2\u01d4\u0091"+
		"\3\2\2\2\u01d5\u01d6\7&\2\2\u01d6\u01d7\bH\t\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\bH\6\2\u01d9\u0093\3\2\2\2\u01da\u01dc\5\u0096J\2\u01db\u01da\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u0095\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e5\7)\2\2\u01e1\u01e2\7&\2"+
		"\2\u01e2\u01e5\7&\2\2\u01e3\u01e5\n\n\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e1"+
		"\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u0097\3\2\2\2\u01e6\u01e7\7)\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\bK\5\2\u01e9\u0099\3\2\2\2\22\2\3\4\5\u018e"+
		"\u0193\u019d\u01a4\u01ab\u01b0\u01b7\u01bb\u01c3\u01c8\u01dd\u01e4\n\b"+
		"\2\2\7\3\2\3\22\2\6\2\2\7\2\2\7\5\2\3G\3\3H\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}