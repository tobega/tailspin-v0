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
		Provided=55, Modified=56, Inherited=57, From=58, StandAlone=59, Use=60, 
		Zero=61, PositiveInteger=62, START_STRING=63, STATE_IDENTIFIER=64, IDENTIFIER=65, 
		WS=66, Comment=67, REGEX_TEXT=68, END_REGEX=69, StartCharacterCode=70, 
		StartStringInterpolate=71, STRING_TEXT=72, END_STRING=73;
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
			"Inherited", "From", "StandAlone", "Use", "Zero", "PositiveInteger", 
			"Digits", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
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
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'inherited'", 
			"'from'", "'stand-alone'", "'use'", "'0'"
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
			"Inherited", "From", "StandAlone", "Use", "Zero", "PositiveInteger", 
			"START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", 
			"END_REGEX", "StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", 
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
		case 16:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0211\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3>\3>\3?\3?\5?\u01b6\n?\3@\6@\u01b9\n@\r@\16@\u01ba\3"+
		"A\3A\3A\3A\3B\3B\7B\u01c3\nB\fB\16B\u01c6\13B\3C\3C\7C\u01ca\nC\fC\16"+
		"C\u01cd\13C\3D\3D\3E\3E\5E\u01d3\nE\3F\6F\u01d6\nF\rF\16F\u01d7\3F\3F"+
		"\3G\7G\u01dd\nG\fG\16G\u01e0\13G\3G\5G\u01e3\nG\3G\3G\3G\3H\6H\u01e9\n"+
		"H\rH\16H\u01ea\3I\3I\3I\5I\u01f0\nI\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\3M\6M\u0203\nM\rM\16M\u0204\3N\3N\3N\3N\3N\5N\u020c\nN\3"+
		"O\3O\3O\3O\2\2P\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34"+
		"\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34"+
		":\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64j\65"+
		"l\66n\67p8r9t:v;x<z=|>~?\u0080@\u0082\2\u0084A\u0086B\u0088C\u008a\2\u008c"+
		"\2\u008eD\u0090E\u0092F\u0094\2\u0096G\u0098H\u009aI\u009cJ\u009e\2\u00a0"+
		"K\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3"+
		"\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u0214\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2"+
		"\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2"+
		"\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2"+
		"x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0084\3\2"+
		"\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008e\3\2\2\2\3\u0090\3\2\2\2\4"+
		"\u0092\3\2\2\2\4\u0096\3\2\2\2\5\u0098\3\2\2\2\5\u009a\3\2\2\2\5\u009c"+
		"\3\2\2\2\5\u00a0\3\2\2\2\6\u00a2\3\2\2\2\b\u00a8\3\2\2\2\n\u00b0\3\2\2"+
		"\2\f\u00b5\3\2\2\2\16\u00b9\3\2\2\2\20\u00be\3\2\2\2\22\u00c1\3\2\2\2"+
		"\24\u00cb\3\2\2\2\26\u00ce\3\2\2\2\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34"+
		"\u00d4\3\2\2\2\36\u00d6\3\2\2\2 \u00d8\3\2\2\2\"\u00da\3\2\2\2$\u00df"+
		"\3\2\2\2&\u00e2\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,\u00ec\3\2\2\2."+
		"\u00f0\3\2\2\2\60\u00f2\3\2\2\2\62\u00f6\3\2\2\2\64\u00fa\3\2\2\2\66\u00fc"+
		"\3\2\2\28\u00fe\3\2\2\2:\u0100\3\2\2\2<\u0102\3\2\2\2>\u0104\3\2\2\2@"+
		"\u0106\3\2\2\2B\u0110\3\2\2\2D\u0117\3\2\2\2F\u011c\3\2\2\2H\u0125\3\2"+
		"\2\2J\u012f\3\2\2\2L\u0133\3\2\2\2N\u0138\3\2\2\2P\u013e\3\2\2\2R\u0143"+
		"\3\2\2\2T\u0145\3\2\2\2V\u0148\3\2\2\2X\u014a\3\2\2\2Z\u014c\3\2\2\2\\"+
		"\u014e\3\2\2\2^\u0151\3\2\2\2`\u0155\3\2\2\2b\u0157\3\2\2\2d\u0159\3\2"+
		"\2\2f\u015b\3\2\2\2h\u015d\3\2\2\2j\u0162\3\2\2\2l\u0167\3\2\2\2n\u016e"+
		"\3\2\2\2p\u017b\3\2\2\2r\u0180\3\2\2\2t\u0189\3\2\2\2v\u0192\3\2\2\2x"+
		"\u019c\3\2\2\2z\u01a1\3\2\2\2|\u01ad\3\2\2\2~\u01b1\3\2\2\2\u0080\u01b3"+
		"\3\2\2\2\u0082\u01b8\3\2\2\2\u0084\u01bc\3\2\2\2\u0086\u01c0\3\2\2\2\u0088"+
		"\u01c7\3\2\2\2\u008a\u01ce\3\2\2\2\u008c\u01d2\3\2\2\2\u008e\u01d5\3\2"+
		"\2\2\u0090\u01de\3\2\2\2\u0092\u01e8\3\2\2\2\u0094\u01ef\3\2\2\2\u0096"+
		"\u01f1\3\2\2\2\u0098\u01f5\3\2\2\2\u009a\u01fc\3\2\2\2\u009c\u0202\3\2"+
		"\2\2\u009e\u020b\3\2\2\2\u00a0\u020d\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3"+
		"\u00a4\7\61\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\2\2\2\u00a6\u00a7\b"+
		"\2\3\2\u00a7\7\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\t\3\2\2\2\u00b0\u00b1\7X\2\2\u00b1\u00b2\7Q\2\2\u00b2"+
		"\u00b3\7K\2\2\u00b3\u00b4\7F\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\r\3\2\2\2\u00b9\u00ba\7y\2\2\u00ba"+
		"\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd\17\3\2\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\u00c0\7q\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7y\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7@\2\2\u00cd\25"+
		"\3\2\2\2\u00ce\u00cf\7#\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7&\2\2\u00d1"+
		"\31\3\2\2\2\u00d2\u00d3\7`\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5"+
		"\35\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9"+
		"!\3\2\2\2\u00da\u00db\7<\2\2\u00db\u00dc\7<\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\5\u0088C\2\u00de#\3\2\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\5\u0088"+
		"C\2\u00e1%\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3\u00e4\6\22\2\2\u00e4\u00e5"+
		"\b\22\4\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\22\5\2\u00e7\'\3\2\2\2\u00e8"+
		"\u00e9\7=\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7.\2\2\u00eb+\3\2\2\2\u00ec\u00ed"+
		"\7\60\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\7\60\2\2\u00ef-\3\2\2\2\u00f0"+
		"\u00f1\7\u0080\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3\u00f4\3\2\2"+
		"\2\u00f4\u00f5\b\27\6\2\u00f5\61\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\b\30\5\2\u00f9\63\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb"+
		"\65\3\2\2\2\u00fc\u00fd\7_\2\2\u00fd\67\3\2\2\2\u00fe\u00ff\7}\2\2\u00ff"+
		"9\3\2\2\2\u0100\u0101\7\177\2\2\u0101;\3\2\2\2\u0102\u0103\7>\2\2\u0103"+
		"=\3\2\2\2\u0104\u0105\7^\2\2\u0105?\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7o\2\2\u0109\u010a\7r\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d\u010e\7g\2\2\u010e\u010f\7u\2\2"+
		"\u010fA\3\2\2\2\u0110\u0111\7u\2\2\u0111\u0112\7q\2\2\u0112\u0113\7w\2"+
		"\2\u0113\u0114\7t\2\2\u0114\u0115\7e\2\2\u0115\u0116\7g\2\2\u0116C\3\2"+
		"\2\2\u0117\u0118\7u\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b"+
		"\7m\2\2\u011bE\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2\u011e\u011f"+
		"\7o\2\2\u011f\u0120\7r\2\2\u0120\u0121\7q\2\2\u0121\u0122\7u\2\2\u0122"+
		"\u0123\7g\2\2\u0123\u0124\7t\2\2\u0124G\3\2\2\2\u0125\u0126\7r\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7e\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7u\2\2\u012b\u012c\7u\2\2\u012c\u012d\7q\2\2\u012d\u012e"+
		"\7t\2\2\u012eI\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131\u0132"+
		"\7f\2\2\u0132K\3\2\2\2\u0133\u0134\7t\2\2\u0134\u0135\7w\2\2\u0135\u0136"+
		"\7n\2\2\u0136\u0137\7g\2\2\u0137M\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a"+
		"\7k\2\2\u013a\u013b\7t\2\2\u013b\u013c\7u\2\2\u013c\u013d\7v\2\2\u013d"+
		"O\3\2\2\2\u013e\u013f\7n\2\2\u013f\u0140\7c\2\2\u0140\u0141\7u\2\2\u0141"+
		"\u0142\7v\2\2\u0142Q\3\2\2\2\u0143\u0144\7%\2\2\u0144S\3\2\2\2\u0145\u0146"+
		"\7\60\2\2\u0146\u0147\7\60\2\2\u0147U\3\2\2\2\u0148\u0149\7-\2\2\u0149"+
		"W\3\2\2\2\u014a\u014b\7/\2\2\u014bY\3\2\2\2\u014c\u014d\7,\2\2\u014d["+
		"\3\2\2\2\u014e\u014f\7\u0080\2\2\u014f\u0150\7\61\2\2\u0150]\3\2\2\2\u0151"+
		"\u0152\7o\2\2\u0152\u0153\7q\2\2\u0153\u0154\7f\2\2\u0154_\3\2\2\2\u0155"+
		"\u0156\7A\2\2\u0156a\3\2\2\2\u0157\u0158\7?\2\2\u0158c\3\2\2\2\u0159\u015a"+
		"\7~\2\2\u015ae\3\2\2\2\u015b\u015c\7@\2\2\u015cg\3\2\2\2\u015d\u015e\7"+
		"A\2\2\u015e\u015f\7*\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b\63\6\2\u0161"+
		"i\3\2\2\2\u0162\u0163\7v\2\2\u0163\u0164\7g\2\2\u0164\u0165\7u\2\2\u0165"+
		"\u0166\7v\2\2\u0166k\3\2\2\2\u0167\u0168\7c\2\2\u0168\u0169\7u\2\2\u0169"+
		"\u016a\7u\2\2\u016a\u016b\7g\2\2\u016b\u016c\7t\2\2\u016c\u016d\7v\2\2"+
		"\u016dm\3\2\2\2\u016e\u016f\7e\2\2\u016f\u0170\7q\2\2\u0170\u0171\7t\2"+
		"\2\u0171\u0172\7g\2\2\u0172\u0173\7/\2\2\u0173\u0174\7u\2\2\u0174\u0175"+
		"\7{\2\2\u0175\u0176\7u\2\2\u0176\u0177\7v\2\2\u0177\u0178\7g\2\2\u0178"+
		"\u0179\7o\2\2\u0179\u017a\7\61\2\2\u017ao\3\2\2\2\u017b\u017c\7y\2\2\u017c"+
		"\u017d\7k\2\2\u017d\u017e\7v\2\2\u017e\u017f\7j\2\2\u017fq\3\2\2\2\u0180"+
		"\u0181\7r\2\2\u0181\u0182\7t\2\2\u0182\u0183\7q\2\2\u0183\u0184\7x\2\2"+
		"\u0184\u0185\7k\2\2\u0185\u0186\7f\2\2\u0186\u0187\7g\2\2\u0187\u0188"+
		"\7f\2\2\u0188s\3\2\2\2\u0189\u018a\7o\2\2\u018a\u018b\7q\2\2\u018b\u018c"+
		"\7f\2\2\u018c\u018d\7k\2\2\u018d\u018e\7h\2\2\u018e\u018f\7k\2\2\u018f"+
		"\u0190\7g\2\2\u0190\u0191\7f\2\2\u0191u\3\2\2\2\u0192\u0193\7k\2\2\u0193"+
		"\u0194\7p\2\2\u0194\u0195\7j\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2"+
		"\u0197\u0198\7k\2\2\u0198\u0199\7v\2\2\u0199\u019a\7g\2\2\u019a\u019b"+
		"\7f\2\2\u019bw\3\2\2\2\u019c\u019d\7h\2\2\u019d\u019e\7t\2\2\u019e\u019f"+
		"\7q\2\2\u019f\u01a0\7o\2\2\u01a0y\3\2\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3"+
		"\7v\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7f\2\2\u01a6"+
		"\u01a7\7/\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa\7q\2\2"+
		"\u01aa\u01ab\7p\2\2\u01ab\u01ac\7g\2\2\u01ac{\3\2\2\2\u01ad\u01ae\7w\2"+
		"\2\u01ae\u01af\7u\2\2\u01af\u01b0\7g\2\2\u01b0}\3\2\2\2\u01b1\u01b2\7"+
		"\62\2\2\u01b2\177\3\2\2\2\u01b3\u01b5\t\2\2\2\u01b4\u01b6\5\u0082@\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u0081\3\2\2\2\u01b7\u01b9\t\3"+
		"\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u0083\3\2\2\2\u01bc\u01bd\7)\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\bA\7\2\u01bf\u0085\3\2\2\2\u01c0\u01c4\7B\2\2\u01c1\u01c3"+
		"\5\u008cE\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5\u0087\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cb"+
		"\5\u008aD\2\u01c8\u01ca\5\u008cE\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0089\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01cf\t\4\2\2\u01cf\u008b\3\2\2\2\u01d0\u01d3\5\u008a"+
		"D\2\u01d1\u01d3\t\5\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u008d\3\2\2\2\u01d4\u01d6\t\6\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\bF\2\2\u01da\u008f\3\2\2\2\u01db\u01dd\n\7\2\2\u01dc\u01db\3\2"+
		"\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\t\b\2\2\u01e2\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\bG\2\2\u01e5\u01e6\bG\5\2\u01e6\u0091"+
		"\3\2\2\2\u01e7\u01e9\5\u0094I\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2"+
		"\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u0093\3\2\2\2\u01ec\u01ed"+
		"\7)\2\2\u01ed\u01f0\7)\2\2\u01ee\u01f0\n\t\2\2\u01ef\u01ec\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u0095\3\2\2\2\u01f1\u01f2\7)\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f4\bJ\5\2\u01f4\u0097\3\2\2\2\u01f5\u01f6\7&\2\2\u01f6\u01f7"+
		"\7%\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\bK\b\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\bK\6\2\u01fb\u0099\3\2\2\2\u01fc\u01fd\7&\2\2\u01fd\u01fe\bL\t"+
		"\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\bL\6\2\u0200\u009b\3\2\2\2\u0201\u0203"+
		"\5\u009eN\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2"+
		"\2\u0204\u0205\3\2\2\2\u0205\u009d\3\2\2\2\u0206\u0207\7)\2\2\u0207\u020c"+
		"\7)\2\2\u0208\u0209\7&\2\2\u0209\u020c\7&\2\2\u020a\u020c\n\n\2\2\u020b"+
		"\u0206\3\2\2\2\u020b\u0208\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u009f\3\2"+
		"\2\2\u020d\u020e\7)\2\2\u020e\u020f\3\2\2\2\u020f\u0210\bO\5\2\u0210\u00a1"+
		"\3\2\2\2\22\2\3\4\5\u01b5\u01ba\u01c4\u01cb\u01d2\u01d7\u01de\u01e2\u01ea"+
		"\u01ef\u0204\u020b\n\b\2\2\7\3\2\3\22\2\6\2\2\7\2\2\7\5\2\3K\3\3L\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}