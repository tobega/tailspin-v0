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
		StartComposerDefinition=33, StartProcessorDefinition=34, StartOperatorDefinition=35, 
		EndDefinition=36, Rule=37, First=38, Last=39, TemplateMatch=40, Range=41, 
		Plus=42, Minus=43, Star=44, TruncateDivide=45, Mod=46, Question=47, Equal=48, 
		Else=49, EndMatcher=50, BeginCondition=51, StartTestDefinition=52, Assert=53, 
		CoreSystem=54, With=55, Provided=56, Modified=57, Shadowed=58, Inherited=59, 
		From=60, StandAlone=61, Use=62, Zero=63, PositiveInteger=64, START_STRING=65, 
		STATE_IDENTIFIER=66, IDENTIFIER=67, WS=68, Comment=69, REGEX_TEXT=70, 
		END_REGEX=71, StartCharacterCode=72, StartStringInterpolate=73, STRING_TEXT=74, 
		END_STRING=75;
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
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Zero", "PositiveInteger", "Digits", "START_STRING", "STATE_IDENTIFIER", 
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
			"'operator'", "'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", 
			"'+'", "'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", "'?('", 
			"'test'", "'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", 
			"'shadowed'", "'inherited'", "'from'", "'stand-alone'", "'use'", "'0'"
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
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", 
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
		case 75:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0227\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3?\3@\3@\3A\3A\5A\u01cc\nA\3B\6B\u01cf\nB\rB\16B\u01d0\3C\3C\3C\3"+
		"C\3D\3D\7D\u01d9\nD\fD\16D\u01dc\13D\3E\3E\7E\u01e0\nE\fE\16E\u01e3\13"+
		"E\3F\3F\3G\3G\5G\u01e9\nG\3H\6H\u01ec\nH\rH\16H\u01ed\3H\3H\3I\7I\u01f3"+
		"\nI\fI\16I\u01f6\13I\3I\5I\u01f9\nI\3I\3I\3I\3J\6J\u01ff\nJ\rJ\16J\u0200"+
		"\3K\3K\3K\5K\u0206\nK\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N"+
		"\3O\6O\u0219\nO\rO\16O\u021a\3P\3P\3P\3P\3P\5P\u0222\nP\3Q\3Q\3Q\3Q\2"+
		"\2R\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20"+
		"\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37"+
		"@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^/`\60b\61d\62f\63h\64j\65l\66n\67p8"+
		"r9t:v;x<z=|>~?\u0080@\u0082A\u0084B\u0086\2\u0088C\u008aD\u008cE\u008e"+
		"\2\u0090\2\u0092F\u0094G\u0096H\u0098\2\u009aI\u009cJ\u009eK\u00a0L\u00a2"+
		"\2\u00a4M\6\2\3\4\5\13\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u022a\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3"+
		"\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2"+
		"\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2"+
		"\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2"+
		"\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2"+
		"\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P"+
		"\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3"+
		"\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2"+
		"\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2"+
		"v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2"+
		"\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2\2\2\u008c"+
		"\3\2\2\2\2\u0092\3\2\2\2\3\u0094\3\2\2\2\4\u0096\3\2\2\2\4\u009a\3\2\2"+
		"\2\5\u009c\3\2\2\2\5\u009e\3\2\2\2\5\u00a0\3\2\2\2\5\u00a4\3\2\2\2\6\u00a6"+
		"\3\2\2\2\b\u00ac\3\2\2\2\n\u00b4\3\2\2\2\f\u00b9\3\2\2\2\16\u00bd\3\2"+
		"\2\2\20\u00c2\3\2\2\2\22\u00c5\3\2\2\2\24\u00cf\3\2\2\2\26\u00d2\3\2\2"+
		"\2\30\u00d4\3\2\2\2\32\u00d6\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2"+
		" \u00dc\3\2\2\2\"\u00de\3\2\2\2$\u00e3\3\2\2\2&\u00e6\3\2\2\2(\u00ec\3"+
		"\2\2\2*\u00ee\3\2\2\2,\u00f0\3\2\2\2.\u00f4\3\2\2\2\60\u00f6\3\2\2\2\62"+
		"\u00fa\3\2\2\2\64\u00fe\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u0104"+
		"\3\2\2\2<\u0106\3\2\2\2>\u0108\3\2\2\2@\u010a\3\2\2\2B\u0114\3\2\2\2D"+
		"\u011b\3\2\2\2F\u0120\3\2\2\2H\u0129\3\2\2\2J\u0133\3\2\2\2L\u013c\3\2"+
		"\2\2N\u0140\3\2\2\2P\u0145\3\2\2\2R\u014b\3\2\2\2T\u0150\3\2\2\2V\u0152"+
		"\3\2\2\2X\u0155\3\2\2\2Z\u0157\3\2\2\2\\\u0159\3\2\2\2^\u015b\3\2\2\2"+
		"`\u015e\3\2\2\2b\u0162\3\2\2\2d\u0164\3\2\2\2f\u0166\3\2\2\2h\u0168\3"+
		"\2\2\2j\u016a\3\2\2\2l\u016f\3\2\2\2n\u0174\3\2\2\2p\u017b\3\2\2\2r\u0188"+
		"\3\2\2\2t\u018d\3\2\2\2v\u0196\3\2\2\2x\u019f\3\2\2\2z\u01a8\3\2\2\2|"+
		"\u01b2\3\2\2\2~\u01b7\3\2\2\2\u0080\u01c3\3\2\2\2\u0082\u01c7\3\2\2\2"+
		"\u0084\u01c9\3\2\2\2\u0086\u01ce\3\2\2\2\u0088\u01d2\3\2\2\2\u008a\u01d6"+
		"\3\2\2\2\u008c\u01dd\3\2\2\2\u008e\u01e4\3\2\2\2\u0090\u01e8\3\2\2\2\u0092"+
		"\u01eb\3\2\2\2\u0094\u01f4\3\2\2\2\u0096\u01fe\3\2\2\2\u0098\u0205\3\2"+
		"\2\2\u009a\u0207\3\2\2\2\u009c\u020b\3\2\2\2\u009e\u0212\3\2\2\2\u00a0"+
		"\u0218\3\2\2\2\u00a2\u0221\3\2\2\2\u00a4\u0223\3\2\2\2\u00a6\u00a7\7\61"+
		"\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\2\2\2\u00aa"+
		"\u00ab\b\2\3\2\u00ab\7\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7e\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7f\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\t\3\2\2\2\u00b4\u00b5\7X\2\2\u00b5\u00b6\7Q"+
		"\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7F\2\2\u00b8\13\3\2\2\2\u00b9\u00ba"+
		"\7f\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7h\2\2\u00bc\r\3\2\2\2\u00bd\u00be"+
		"\7y\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\17\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7q\2\2\u00c4\21\3\2\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7g\2\2"+
		"\u00c9\u00ca\7t\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd"+
		"\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\23\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1\25\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\27\3\2\2\2\u00d4\u00d5"+
		"\7&\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\7`\2\2\u00d7\33\3\2\2\2\u00d8\u00d9"+
		"\7(\2\2\u00d9\35\3\2\2\2\u00da\u00db\7\61\2\2\u00db\37\3\2\2\2\u00dc\u00dd"+
		"\7<\2\2\u00dd!\3\2\2\2\u00de\u00df\7<\2\2\u00df\u00e0\7<\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\5\u008cE\2\u00e2#\3\2\2\2\u00e3\u00e4\7\60\2\2\u00e4"+
		"\u00e5\5\u008cE\2\u00e5%\3\2\2\2\u00e6\u00e7\7=\2\2\u00e7\u00e8\6\22\2"+
		"\2\u00e8\u00e9\b\22\4\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\22\5\2\u00eb"+
		"\'\3\2\2\2\u00ec\u00ed\7=\2\2\u00ed)\3\2\2\2\u00ee\u00ef\7.\2\2\u00ef"+
		"+\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7\60\2"+
		"\2\u00f3-\3\2\2\2\u00f4\u00f5\7\u0080\2\2\u00f5/\3\2\2\2\u00f6\u00f7\7"+
		"*\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b\27\6\2\u00f9\61\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b\30\5\2\u00fd\63\3\2\2"+
		"\2\u00fe\u00ff\7]\2\2\u00ff\65\3\2\2\2\u0100\u0101\7_\2\2\u0101\67\3\2"+
		"\2\2\u0102\u0103\7}\2\2\u01039\3\2\2\2\u0104\u0105\7\177\2\2\u0105;\3"+
		"\2\2\2\u0106\u0107\7>\2\2\u0107=\3\2\2\2\u0108\u0109\7^\2\2\u0109?\3\2"+
		"\2\2\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d\7o\2\2\u010d\u010e"+
		"\7r\2\2\u010e\u010f\7n\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7u\2\2\u0113A\3\2\2\2\u0114\u0115\7u\2\2\u0115"+
		"\u0116\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7t\2\2\u0118\u0119\7e\2\2"+
		"\u0119\u011a\7g\2\2\u011aC\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7k\2"+
		"\2\u011d\u011e\7p\2\2\u011e\u011f\7m\2\2\u011fE\3\2\2\2\u0120\u0121\7"+
		"e\2\2\u0121\u0122\7q\2\2\u0122\u0123\7o\2\2\u0123\u0124\7r\2\2\u0124\u0125"+
		"\7q\2\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127\u0128\7t\2\2\u0128"+
		"G\3\2\2\2\u0129\u012a\7r\2\2\u012a\u012b\7t\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7e\2\2\u012d\u012e\7g\2\2\u012e\u012f\7u\2\2\u012f\u0130\7u\2\2"+
		"\u0130\u0131\7q\2\2\u0131\u0132\7t\2\2\u0132I\3\2\2\2\u0133\u0134\7q\2"+
		"\2\u0134\u0135\7r\2\2\u0135\u0136\7g\2\2\u0136\u0137\7t\2\2\u0137\u0138"+
		"\7c\2\2\u0138\u0139\7v\2\2\u0139\u013a\7q\2\2\u013a\u013b\7t\2\2\u013b"+
		"K\3\2\2\2\u013c\u013d\7g\2\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2\u013f"+
		"M\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7w\2\2\u0142\u0143\7n\2\2\u0143"+
		"\u0144\7g\2\2\u0144O\3\2\2\2\u0145\u0146\7h\2\2\u0146\u0147\7k\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2\u014aQ\3\2\2\2\u014b"+
		"\u014c\7n\2\2\u014c\u014d\7c\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2"+
		"\u014fS\3\2\2\2\u0150\u0151\7%\2\2\u0151U\3\2\2\2\u0152\u0153\7\60\2\2"+
		"\u0153\u0154\7\60\2\2\u0154W\3\2\2\2\u0155\u0156\7-\2\2\u0156Y\3\2\2\2"+
		"\u0157\u0158\7/\2\2\u0158[\3\2\2\2\u0159\u015a\7,\2\2\u015a]\3\2\2\2\u015b"+
		"\u015c\7\u0080\2\2\u015c\u015d\7\61\2\2\u015d_\3\2\2\2\u015e\u015f\7o"+
		"\2\2\u015f\u0160\7q\2\2\u0160\u0161\7f\2\2\u0161a\3\2\2\2\u0162\u0163"+
		"\7A\2\2\u0163c\3\2\2\2\u0164\u0165\7?\2\2\u0165e\3\2\2\2\u0166\u0167\7"+
		"~\2\2\u0167g\3\2\2\2\u0168\u0169\7@\2\2\u0169i\3\2\2\2\u016a\u016b\7A"+
		"\2\2\u016b\u016c\7*\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b\64\6\2\u016e"+
		"k\3\2\2\2\u016f\u0170\7v\2\2\u0170\u0171\7g\2\2\u0171\u0172\7u\2\2\u0172"+
		"\u0173\7v\2\2\u0173m\3\2\2\2\u0174\u0175\7c\2\2\u0175\u0176\7u\2\2\u0176"+
		"\u0177\7u\2\2\u0177\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179\u017a\7v\2\2"+
		"\u017ao\3\2\2\2\u017b\u017c\7e\2\2\u017c\u017d\7q\2\2\u017d\u017e\7t\2"+
		"\2\u017e\u017f\7g\2\2\u017f\u0180\7/\2\2\u0180\u0181\7u\2\2\u0181\u0182"+
		"\7{\2\2\u0182\u0183\7u\2\2\u0183\u0184\7v\2\2\u0184\u0185\7g\2\2\u0185"+
		"\u0186\7o\2\2\u0186\u0187\7\61\2\2\u0187q\3\2\2\2\u0188\u0189\7y\2\2\u0189"+
		"\u018a\7k\2\2\u018a\u018b\7v\2\2\u018b\u018c\7j\2\2\u018cs\3\2\2\2\u018d"+
		"\u018e\7r\2\2\u018e\u018f\7t\2\2\u018f\u0190\7q\2\2\u0190\u0191\7x\2\2"+
		"\u0191\u0192\7k\2\2\u0192\u0193\7f\2\2\u0193\u0194\7g\2\2\u0194\u0195"+
		"\7f\2\2\u0195u\3\2\2\2\u0196\u0197\7o\2\2\u0197\u0198\7q\2\2\u0198\u0199"+
		"\7f\2\2\u0199\u019a\7k\2\2\u019a\u019b\7h\2\2\u019b\u019c\7k\2\2\u019c"+
		"\u019d\7g\2\2\u019d\u019e\7f\2\2\u019ew\3\2\2\2\u019f\u01a0\7u\2\2\u01a0"+
		"\u01a1\7j\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7f\2\2\u01a3\u01a4\7q\2\2"+
		"\u01a4\u01a5\7y\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7f\2\2\u01a7y\3\2\2"+
		"\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7j\2\2\u01ab\u01ac"+
		"\7g\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7k\2\2\u01ae\u01af\7v\2\2\u01af"+
		"\u01b0\7g\2\2\u01b0\u01b1\7f\2\2\u01b1{\3\2\2\2\u01b2\u01b3\7h\2\2\u01b3"+
		"\u01b4\7t\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7o\2\2\u01b6}\3\2\2\2\u01b7"+
		"\u01b8\7u\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7p\2\2"+
		"\u01bb\u01bc\7f\2\2\u01bc\u01bd\7/\2\2\u01bd\u01be\7c\2\2\u01be\u01bf"+
		"\7n\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7p\2\2\u01c1\u01c2\7g\2\2\u01c2"+
		"\177\3\2\2\2\u01c3\u01c4\7w\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7g\2\2"+
		"\u01c6\u0081\3\2\2\2\u01c7\u01c8\7\62\2\2\u01c8\u0083\3\2\2\2\u01c9\u01cb"+
		"\t\2\2\2\u01ca\u01cc\5\u0086B\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2"+
		"\2\u01cc\u0085\3\2\2\2\u01cd\u01cf\t\3\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u0087\3\2\2\2\u01d2"+
		"\u01d3\7)\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bC\7\2\u01d5\u0089\3\2\2"+
		"\2\u01d6\u01da\7B\2\2\u01d7\u01d9\5\u0090G\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u008b\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e1\5\u008eF\2\u01de\u01e0\5\u0090G\2"+
		"\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u008d\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\t\4\2\2\u01e5"+
		"\u008f\3\2\2\2\u01e6\u01e9\5\u008eF\2\u01e7\u01e9\t\5\2\2\u01e8\u01e6"+
		"\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u0091\3\2\2\2\u01ea\u01ec\t\6\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\bH\2\2\u01f0\u0093\3\2\2\2\u01f1"+
		"\u01f3\n\7\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7"+
		"\u01f9\t\b\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bI"+
		"\2\2\u01fb\u01fc\bI\5\2\u01fc\u0095\3\2\2\2\u01fd\u01ff\5\u0098K\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0097\3\2\2\2\u0202\u0203\7)\2\2\u0203\u0206\7)\2\2\u0204\u0206"+
		"\n\t\2\2\u0205\u0202\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0099\3\2\2\2\u0207"+
		"\u0208\7)\2\2\u0208\u0209\3\2\2\2\u0209\u020a\bL\5\2\u020a\u009b\3\2\2"+
		"\2\u020b\u020c\7&\2\2\u020c\u020d\7%\2\2\u020d\u020e\3\2\2\2\u020e\u020f"+
		"\bM\b\2\u020f\u0210\3\2\2\2\u0210\u0211\bM\6\2\u0211\u009d\3\2\2\2\u0212"+
		"\u0213\7&\2\2\u0213\u0214\bN\t\2\u0214\u0215\3\2\2\2\u0215\u0216\bN\6"+
		"\2\u0216\u009f\3\2\2\2\u0217\u0219\5\u00a2P\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u00a1\3\2"+
		"\2\2\u021c\u021d\7)\2\2\u021d\u0222\7)\2\2\u021e\u021f\7&\2\2\u021f\u0222"+
		"\7&\2\2\u0220\u0222\n\n\2\2\u0221\u021c\3\2\2\2\u0221\u021e\3\2\2\2\u0221"+
		"\u0220\3\2\2\2\u0222\u00a3\3\2\2\2\u0223\u0224\7)\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0226\bQ\5\2\u0226\u00a5\3\2\2\2\22\2\3\4\5\u01cb\u01d0\u01da"+
		"\u01e1\u01e8\u01ed\u01f4\u01f8\u0200\u0205\u021a\u0221\n\b\2\2\7\3\2\3"+
		"\22\2\6\2\2\7\2\2\7\5\2\3M\3\3N\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}