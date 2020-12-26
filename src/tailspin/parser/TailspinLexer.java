// Generated from TailspinLexer.g4 by ANTLR 4.8
package tailspin.parser;

  import java.util.Deque;
  import java.util.ArrayDeque;

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
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, StereotypeDefinition=8, 
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, And=13, Slash=14, 
		Colon=15, Message=16, FieldReference=17, EndStringInterpolate=18, SemiColon=19, 
		Comma=20, Deconstructor=21, Invert=22, LeftParen=23, RightParen=24, LeftBracket=25, 
		RightBracket=26, LeftBrace=27, RightBrace=28, StartBytes=29, StartMatcher=30, 
		Lambda=31, StartTemplatesDefinition=32, StartSourceDefinition=33, StartSinkDefinition=34, 
		StartComposerDefinition=35, StartProcessorDefinition=36, StartOperatorDefinition=37, 
		EndDefinition=38, Rule=39, First=40, Last=41, TemplateMatch=42, Range=43, 
		Plus=44, Minus=45, Star=46, TruncateDivide=47, Mod=48, Question=49, Equal=50, 
		Else=51, EndMatcher=52, BeginCondition=53, StartTestDefinition=54, Assert=55, 
		CoreSystem=56, With=57, Provided=58, Modified=59, Shadowed=60, Inherited=61, 
		From=62, StandAlone=63, Use=64, Program=65, Modify=66, Zero=67, PositiveInteger=68, 
		START_STRING=69, STATE_IDENTIFIER=70, IDENTIFIER=71, WS=72, Comment=73, 
		REGEX_TEXT=74, END_REGEX=75, StartCharacterCode=76, StartStringInterpolate=77, 
		STRING_TEXT=78, END_STRING=79, Bytes=80, Bytes_WS=81, EndBytes=82;
	public static final int
		COMMENT_MODE=1, IN_REGEX=2, IN_STRING=3, IN_BYTES=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "IN_REGEX", "IN_STRING", "IN_BYTES"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"StereotypeDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "EndDefinition", "Rule", "First", "Last", 
			"TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "Zero", "PositiveInteger", 
			"Digits", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING", "Bytes", "Bytes_WS", "StartBytesExpression", "EndBytes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'stereotype'", "'->'", "'!'", "'$'", "'^'", "'&'", "'/'", "':'", null, 
			null, null, "';'", "','", "'...'", "'~'", null, null, "'['", "']'", "'{'", 
			"'}'", "'[x'", "'<'", "'\\'", "'templates'", "'source'", "'sink'", "'composer'", 
			"'processor'", "'operator'", "'end'", "'rule'", "'first'", "'last'", 
			"'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", 
			"'>'", null, "'test'", "'assert'", "'core-system/'", "'with'", "'provided'", 
			"'modified'", "'shadowed'", "'inherited'", "'from'", "'stand-alone'", 
			"'use'", "'program'", "'modify'", "'0'", null, null, null, null, null, 
			null, null, "'''", null, null, null, null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"StereotypeDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "EndDefinition", "Rule", "First", "Last", 
			"TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "Zero", "PositiveInteger", 
			"START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", 
			"END_REGEX", "StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "Bytes", "Bytes_WS", "EndBytes"
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


	  Deque<Character> ctx = new ArrayDeque<>();


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
		case 22:
			LeftParen_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 86:
			StartBytesExpression_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EndStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			ctx.pop();
			break;
		}
	}
	private void LeftParen_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			ctx.push('(');
			break;
		}
	}
	private void BeginCondition_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			ctx.push('(');
			break;
		}
	}
	private void START_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			ctx.push('\'');
			break;
		}
	}
	private void StartCharacterCode_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 ctx.push('$'); 
			break;
		}
	}
	private void StartStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 ctx.push('$'); 
			break;
		}
	}
	private void StartBytesExpression_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			ctx.push('(');
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return EndStringInterpolate_sempred((RuleContext)_localctx, predIndex);
		case 23:
			return RightParen_sempred((RuleContext)_localctx, predIndex);
		case 83:
			return END_STRING_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EndStringInterpolate_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !ctx.isEmpty() && ctx.peek() == '$';
		}
		return true;
	}
	private boolean RightParen_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return ctx.pop() == '(';
		}
		return true;
	}
	private boolean END_STRING_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return ctx.pop() == '\'';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0272\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\3"+
		"8\38\39\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3E\3E\5E\u0200\nE\3F\6F\u0203\nF\rF\16F\u0204\3G\3G\3G\3G\3G\3"+
		"H\3H\7H\u020e\nH\fH\16H\u0211\13H\3I\3I\7I\u0215\nI\fI\16I\u0218\13I\3"+
		"J\3J\3K\3K\5K\u021e\nK\3L\6L\u0221\nL\rL\16L\u0222\3L\3L\3M\7M\u0228\n"+
		"M\fM\16M\u022b\13M\3M\5M\u022e\nM\3M\3M\3M\3N\6N\u0234\nN\rN\16N\u0235"+
		"\3O\3O\3O\5O\u023b\nO\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R"+
		"\3S\6S\u024e\nS\rS\16S\u024f\3T\3T\3T\3T\3T\5T\u0257\nT\3U\3U\3U\3U\3"+
		"U\3V\3V\6V\u0260\nV\rV\16V\u0261\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\3Y\2\2Z\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66"+
		"o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008d"+
		"F\u008f\2\u0091G\u0093H\u0095I\u0097\2\u0099\2\u009bJ\u009dK\u009fL\u00a1"+
		"\2\u00a3M\u00a5N\u00a7O\u00a9P\u00ab\2\u00adQ\u00afR\u00b1S\u00b3\2\u00b5"+
		"T\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u0275\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u009b\3\2\2\2\3\u009d\3\2\2\2\4\u009f\3\2\2\2\4\u00a3\3\2\2\2\5\u00a5"+
		"\3\2\2\2\5\u00a7\3\2\2\2\5\u00a9\3\2\2\2\5\u00ad\3\2\2\2\6\u00af\3\2\2"+
		"\2\6\u00b1\3\2\2\2\6\u00b3\3\2\2\2\6\u00b5\3\2\2\2\7\u00b7\3\2\2\2\t\u00bd"+
		"\3\2\2\2\13\u00c5\3\2\2\2\r\u00ca\3\2\2\2\17\u00ce\3\2\2\2\21\u00d3\3"+
		"\2\2\2\23\u00d6\3\2\2\2\25\u00e0\3\2\2\2\27\u00eb\3\2\2\2\31\u00ee\3\2"+
		"\2\2\33\u00f0\3\2\2\2\35\u00f2\3\2\2\2\37\u00f4\3\2\2\2!\u00f6\3\2\2\2"+
		"#\u00f8\3\2\2\2%\u00fa\3\2\2\2\'\u00ff\3\2\2\2)\u0102\3\2\2\2+\u0108\3"+
		"\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u0110\3\2\2\2\63\u0112\3\2\2\2"+
		"\65\u0117\3\2\2\2\67\u011c\3\2\2\29\u011e\3\2\2\2;\u0120\3\2\2\2=\u0122"+
		"\3\2\2\2?\u0124\3\2\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G"+
		"\u0137\3\2\2\2I\u013e\3\2\2\2K\u0143\3\2\2\2M\u014c\3\2\2\2O\u0156\3\2"+
		"\2\2Q\u015f\3\2\2\2S\u0163\3\2\2\2U\u0168\3\2\2\2W\u016e\3\2\2\2Y\u0173"+
		"\3\2\2\2[\u0175\3\2\2\2]\u0178\3\2\2\2_\u017a\3\2\2\2a\u017c\3\2\2\2c"+
		"\u017e\3\2\2\2e\u0181\3\2\2\2g\u0185\3\2\2\2i\u0187\3\2\2\2k\u0189\3\2"+
		"\2\2m\u018b\3\2\2\2o\u018d\3\2\2\2q\u0194\3\2\2\2s\u0199\3\2\2\2u\u01a0"+
		"\3\2\2\2w\u01ad\3\2\2\2y\u01b2\3\2\2\2{\u01bb\3\2\2\2}\u01c4\3\2\2\2\177"+
		"\u01cd\3\2\2\2\u0081\u01d7\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01e8\3\2"+
		"\2\2\u0087\u01ec\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01fb\3\2\2\2\u008d"+
		"\u01fd\3\2\2\2\u008f\u0202\3\2\2\2\u0091\u0206\3\2\2\2\u0093\u020b\3\2"+
		"\2\2\u0095\u0212\3\2\2\2\u0097\u0219\3\2\2\2\u0099\u021d\3\2\2\2\u009b"+
		"\u0220\3\2\2\2\u009d\u0229\3\2\2\2\u009f\u0233\3\2\2\2\u00a1\u023a\3\2"+
		"\2\2\u00a3\u023c\3\2\2\2\u00a5\u0240\3\2\2\2\u00a7\u0247\3\2\2\2\u00a9"+
		"\u024d\3\2\2\2\u00ab\u0256\3\2\2\2\u00ad\u0258\3\2\2\2\u00af\u025f\3\2"+
		"\2\2\u00b1\u0263\3\2\2\2\u00b3\u0267\3\2\2\2\u00b5\u026d\3\2\2\2\u00b7"+
		"\u00b8\7\61\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b"+
		"\2\2\2\u00bb\u00bc\b\2\3\2\u00bc\b\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7w\2\2\u00c2"+
		"\u00c3\7f\2\2\u00c3\u00c4\7g\2\2\u00c4\n\3\2\2\2\u00c5\u00c6\7X\2\2\u00c6"+
		"\u00c7\7Q\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7F\2\2\u00c9\f\3\2\2\2\u00ca"+
		"\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7h\2\2\u00cd\16\3\2\2\2\u00ce"+
		"\u00cf\7y\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\20\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7q\2\2\u00d5\22\3\2\2"+
		"\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7k\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\u00e6\7q\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7{\2\2\u00e8\u00e9"+
		"\7r\2\2\u00e9\u00ea\7g\2\2\u00ea\26\3\2\2\2\u00eb\u00ec\7/\2\2\u00ec\u00ed"+
		"\7@\2\2\u00ed\30\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\32\3\2\2\2\u00f0\u00f1"+
		"\7&\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\7`\2\2\u00f3\36\3\2\2\2\u00f4\u00f5"+
		"\7(\2\2\u00f5 \3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\"\3\2\2\2\u00f8\u00f9"+
		"\7<\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7<\2\2\u00fb\u00fc\7<\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\5\u0095I\2\u00fe&\3\2\2\2\u00ff\u0100\7\60\2\2\u0100"+
		"\u0101\5\u0095I\2\u0101(\3\2\2\2\u0102\u0103\7=\2\2\u0103\u0104\6\23\2"+
		"\2\u0104\u0105\b\23\4\2\u0105\u0106\3\2\2\2\u0106\u0107\b\23\5\2\u0107"+
		"*\3\2\2\2\u0108\u0109\7=\2\2\u0109,\3\2\2\2\u010a\u010b\7.\2\2\u010b."+
		"\3\2\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7\60\2\2\u010e\u010f\7\60\2"+
		"\2\u010f\60\3\2\2\2\u0110\u0111\7\u0080\2\2\u0111\62\3\2\2\2\u0112\u0113"+
		"\7*\2\2\u0113\u0114\b\30\6\2\u0114\u0115\3\2\2\2\u0115\u0116\b\30\7\2"+
		"\u0116\64\3\2\2\2\u0117\u0118\7+\2\2\u0118\u0119\6\31\3\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\b\31\5\2\u011b\66\3\2\2\2\u011c\u011d\7]\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\7_\2\2\u011f:\3\2\2\2\u0120\u0121\7}\2\2\u0121<"+
		"\3\2\2\2\u0122\u0123\7\177\2\2\u0123>\3\2\2\2\u0124\u0125\7]\2\2\u0125"+
		"\u0126\7z\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b\36\b\2\u0128@\3\2\2\2"+
		"\u0129\u012a\7>\2\2\u012aB\3\2\2\2\u012b\u012c\7^\2\2\u012cD\3\2\2\2\u012d"+
		"\u012e\7v\2\2\u012e\u012f\7g\2\2\u012f\u0130\7o\2\2\u0130\u0131\7r\2\2"+
		"\u0131\u0132\7n\2\2\u0132\u0133\7c\2\2\u0133\u0134\7v\2\2\u0134\u0135"+
		"\7g\2\2\u0135\u0136\7u\2\2\u0136F\3\2\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7q\2\2\u0139\u013a\7w\2\2\u013a\u013b\7t\2\2\u013b\u013c\7e\2\2\u013c"+
		"\u013d\7g\2\2\u013dH\3\2\2\2\u013e\u013f\7u\2\2\u013f\u0140\7k\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0142\7m\2\2\u0142J\3\2\2\2\u0143\u0144\7e\2\2\u0144"+
		"\u0145\7q\2\2\u0145\u0146\7o\2\2\u0146\u0147\7r\2\2\u0147\u0148\7q\2\2"+
		"\u0148\u0149\7u\2\2\u0149\u014a\7g\2\2\u014a\u014b\7t\2\2\u014bL\3\2\2"+
		"\2\u014c\u014d\7r\2\2\u014d\u014e\7t\2\2\u014e\u014f\7q\2\2\u014f\u0150"+
		"\7e\2\2\u0150\u0151\7g\2\2\u0151\u0152\7u\2\2\u0152\u0153\7u\2\2\u0153"+
		"\u0154\7q\2\2\u0154\u0155\7t\2\2\u0155N\3\2\2\2\u0156\u0157\7q\2\2\u0157"+
		"\u0158\7r\2\2\u0158\u0159\7g\2\2\u0159\u015a\7t\2\2\u015a\u015b\7c\2\2"+
		"\u015b\u015c\7v\2\2\u015c\u015d\7q\2\2\u015d\u015e\7t\2\2\u015eP\3\2\2"+
		"\2\u015f\u0160\7g\2\2\u0160\u0161\7p\2\2\u0161\u0162\7f\2\2\u0162R\3\2"+
		"\2\2\u0163\u0164\7t\2\2\u0164\u0165\7w\2\2\u0165\u0166\7n\2\2\u0166\u0167"+
		"\7g\2\2\u0167T\3\2\2\2\u0168\u0169\7h\2\2\u0169\u016a\7k\2\2\u016a\u016b"+
		"\7t\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2\u016dV\3\2\2\2\u016e\u016f"+
		"\7n\2\2\u016f\u0170\7c\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172"+
		"X\3\2\2\2\u0173\u0174\7%\2\2\u0174Z\3\2\2\2\u0175\u0176\7\60\2\2\u0176"+
		"\u0177\7\60\2\2\u0177\\\3\2\2\2\u0178\u0179\7-\2\2\u0179^\3\2\2\2\u017a"+
		"\u017b\7/\2\2\u017b`\3\2\2\2\u017c\u017d\7,\2\2\u017db\3\2\2\2\u017e\u017f"+
		"\7\u0080\2\2\u017f\u0180\7\61\2\2\u0180d\3\2\2\2\u0181\u0182\7o\2\2\u0182"+
		"\u0183\7q\2\2\u0183\u0184\7f\2\2\u0184f\3\2\2\2\u0185\u0186\7A\2\2\u0186"+
		"h\3\2\2\2\u0187\u0188\7?\2\2\u0188j\3\2\2\2\u0189\u018a\7~\2\2\u018al"+
		"\3\2\2\2\u018b\u018c\7@\2\2\u018cn\3\2\2\2\u018d\u018e\7A\2\2\u018e\u018f"+
		"\7*\2\2\u018f\u0190\3\2\2\2\u0190\u0191\b\66\t\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\b\66\7\2\u0193p\3\2\2\2\u0194\u0195\7v\2\2\u0195\u0196\7g\2\2\u0196"+
		"\u0197\7u\2\2\u0197\u0198\7v\2\2\u0198r\3\2\2\2\u0199\u019a\7c\2\2\u019a"+
		"\u019b\7u\2\2\u019b\u019c\7u\2\2\u019c\u019d\7g\2\2\u019d\u019e\7t\2\2"+
		"\u019e\u019f\7v\2\2\u019ft\3\2\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7q\2"+
		"\2\u01a2\u01a3\7t\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7/\2\2\u01a5\u01a6"+
		"\7u\2\2\u01a6\u01a7\7{\2\2\u01a7\u01a8\7u\2\2\u01a8\u01a9\7v\2\2\u01a9"+
		"\u01aa\7g\2\2\u01aa\u01ab\7o\2\2\u01ab\u01ac\7\61\2\2\u01acv\3\2\2\2\u01ad"+
		"\u01ae\7y\2\2\u01ae\u01af\7k\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7j\2\2"+
		"\u01b1x\3\2\2\2\u01b2\u01b3\7r\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5\7q\2"+
		"\2\u01b5\u01b6\7x\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8\7f\2\2\u01b8\u01b9"+
		"\7g\2\2\u01b9\u01ba\7f\2\2\u01baz\3\2\2\2\u01bb\u01bc\7o\2\2\u01bc\u01bd"+
		"\7q\2\2\u01bd\u01be\7f\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7h\2\2\u01c0"+
		"\u01c1\7k\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7f\2\2\u01c3|\3\2\2\2\u01c4"+
		"\u01c5\7u\2\2\u01c5\u01c6\7j\2\2\u01c6\u01c7\7c\2\2\u01c7\u01c8\7f\2\2"+
		"\u01c8\u01c9\7q\2\2\u01c9\u01ca\7y\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc"+
		"\7f\2\2\u01cc~\3\2\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0"+
		"\7j\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7k\2\2\u01d3"+
		"\u01d4\7v\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6\7f\2\2\u01d6\u0080\3\2\2"+
		"\2\u01d7\u01d8\7h\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7q\2\2\u01da\u01db"+
		"\7o\2\2\u01db\u0082\3\2\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7v\2\2\u01de"+
		"\u01df\7c\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7f\2\2\u01e1\u01e2\7/\2\2"+
		"\u01e2\u01e3\7c\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6"+
		"\7p\2\2\u01e6\u01e7\7g\2\2\u01e7\u0084\3\2\2\2\u01e8\u01e9\7w\2\2\u01e9"+
		"\u01ea\7u\2\2\u01ea\u01eb\7g\2\2\u01eb\u0086\3\2\2\2\u01ec\u01ed\7r\2"+
		"\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7i\2\2\u01f0\u01f1"+
		"\7t\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3\7o\2\2\u01f3\u0088\3\2\2\2\u01f4"+
		"\u01f5\7o\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7f\2\2\u01f7\u01f8\7k\2\2"+
		"\u01f8\u01f9\7h\2\2\u01f9\u01fa\7{\2\2\u01fa\u008a\3\2\2\2\u01fb\u01fc"+
		"\7\62\2\2\u01fc\u008c\3\2\2\2\u01fd\u01ff\t\2\2\2\u01fe\u0200\5\u008f"+
		"F\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u008e\3\2\2\2\u0201"+
		"\u0203\t\3\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0090\3\2\2\2\u0206\u0207\7)\2\2\u0207"+
		"\u0208\bG\n\2\u0208\u0209\3\2\2\2\u0209\u020a\bG\13\2\u020a\u0092\3\2"+
		"\2\2\u020b\u020f\7B\2\2\u020c\u020e\5\u0099K\2\u020d\u020c\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0094\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0216\5\u0097J\2\u0213\u0215\5\u0099K\2"+
		"\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0096\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\t\4\2\2\u021a"+
		"\u0098\3\2\2\2\u021b\u021e\5\u0097J\2\u021c\u021e\t\5\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021c\3\2\2\2\u021e\u009a\3\2\2\2\u021f\u0221\t\6\2\2\u0220"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\bL\2\2\u0225\u009c\3\2\2\2\u0226"+
		"\u0228\n\7\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022e\t\b\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\bM"+
		"\2\2\u0230\u0231\bM\5\2\u0231\u009e\3\2\2\2\u0232\u0234\5\u00a1O\2\u0233"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u00a0\3\2\2\2\u0237\u0238\7)\2\2\u0238\u023b\7)\2\2\u0239\u023b"+
		"\n\t\2\2\u023a\u0237\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u00a2\3\2\2\2\u023c"+
		"\u023d\7)\2\2\u023d\u023e\3\2\2\2\u023e\u023f\bP\5\2\u023f\u00a4\3\2\2"+
		"\2\u0240\u0241\7&\2\2\u0241\u0242\7%\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\bQ\f\2\u0244\u0245\3\2\2\2\u0245\u0246\bQ\7\2\u0246\u00a6\3\2\2\2\u0247"+
		"\u0248\7&\2\2\u0248\u0249\bR\r\2\u0249\u024a\3\2\2\2\u024a\u024b\bR\7"+
		"\2\u024b\u00a8\3\2\2\2\u024c\u024e\5\u00abT\2\u024d\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u00aa\3\2"+
		"\2\2\u0251\u0252\7)\2\2\u0252\u0257\7)\2\2\u0253\u0254\7&\2\2\u0254\u0257"+
		"\7&\2\2\u0255\u0257\n\n\2\2\u0256\u0251\3\2\2\2\u0256\u0253\3\2\2\2\u0256"+
		"\u0255\3\2\2\2\u0257\u00ac\3\2\2\2\u0258\u0259\7)\2\2\u0259\u025a\6U\4"+
		"\2\u025a\u025b\3\2\2\2\u025b\u025c\bU\5\2\u025c\u00ae\3\2\2\2\u025d\u025e"+
		"\t\13\2\2\u025e\u0260\t\13\2\2\u025f\u025d\3\2\2\2\u0260\u0261\3\2\2\2"+
		"\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u00b0\3\2\2\2\u0263\u0264"+
		"\5\u009bL\2\u0264\u0265\3\2\2\2\u0265\u0266\bW\2\2\u0266\u00b2\3\2\2\2"+
		"\u0267\u0268\5\63\30\2\u0268\u0269\bX\16\2\u0269\u026a\3\2\2\2\u026a\u026b"+
		"\bX\17\2\u026b\u026c\bX\7\2\u026c\u00b4\3\2\2\2\u026d\u026e\7z\2\2\u026e"+
		"\u026f\7_\2\2\u026f\u0270\3\2\2\2\u0270\u0271\bY\5\2\u0271\u00b6\3\2\2"+
		"\2\24\2\3\4\5\6\u01ff\u0204\u020f\u0216\u021d\u0222\u0229\u022d\u0235"+
		"\u023a\u024f\u0256\u0261\20\b\2\2\7\3\2\3\23\2\6\2\2\3\30\3\7\2\2\7\6"+
		"\2\3\66\4\3G\5\7\5\2\3Q\6\3R\7\3X\b\t\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}