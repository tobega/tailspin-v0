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
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, DataDefinition=8, 
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, Reflexive=13, 
		And=14, Slash=15, Colon=16, Message=17, FieldReference=18, EndStringInterpolate=19, 
		SemiColon=20, Comma=21, Deconstructor=22, Invert=23, LeftParen=24, RightParen=25, 
		LeftBracket=26, RightBracket=27, LeftBrace=28, RightBrace=29, StartBytes=30, 
		StartMatcher=31, Quote=32, Lambda=33, StartTemplatesDefinition=34, StartSourceDefinition=35, 
		StartSinkDefinition=36, StartComposerDefinition=37, StartProcessorDefinition=38, 
		StartOperatorDefinition=39, StartStateDefinition=40, EndDefinition=41, 
		Rule=42, First=43, Last=44, TemplateMatch=45, Range=46, Plus=47, Minus=48, 
		Star=49, TruncateDivide=50, Mod=51, Question=52, Equal=53, Else=54, EndMatcher=55, 
		BeginCondition=56, StartTestDefinition=57, Assert=58, CoreSystem=59, With=60, 
		Provided=61, Modified=62, Shadowed=63, Inherited=64, From=65, StandAlone=66, 
		Use=67, Program=68, Modify=69, By=70, Collect=71, Zero=72, PositiveInteger=73, 
		START_STRING=74, STATE_IDENTIFIER=75, IDENTIFIER=76, WS=77, Comment=78, 
		REGEX_TEXT=79, END_REGEX=80, StartCharacterCode=81, StartStringInterpolate=82, 
		STRING_TEXT=83, END_STRING=84, Bytes=85, Bytes_WS=86, EndBytes=87;
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
			"DataDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "StartStateDefinition", "EndDefinition", "Rule", 
			"First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Zero", 
			"PositiveInteger", "Digits", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
			"IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Comment", "REGEX_TEXT", 
			"REGEX_CHAR", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING", "Bytes", "Bytes_WS", "StartBytesExpression", 
			"EndBytes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'data'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", "'/'", "':'", 
			null, null, null, "';'", "','", "'...'", "'~'", null, null, "'['", "']'", 
			"'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'templates'", "'source'", 
			"'sink'", "'composer'", "'processor'", "'operator'", "'state'", "'end'", 
			"'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", 
			"'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", "'core-system/'", 
			"'with'", "'provided'", "'modified'", "'shadowed'", "'inherited'", "'from'", 
			"'stand-alone'", "'use'", "'program'", "'modify'", "'by'", "'collect'", 
			"'0'", null, null, null, null, null, null, null, "'''", null, null, null, 
			null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"DataDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "StartStateDefinition", "EndDefinition", "Rule", 
			"First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Zero", 
			"PositiveInteger", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
			"WS", "Comment", "REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "END_STRING", "Bytes", "Bytes_WS", "EndBytes"
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
		case 18:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			LeftParen_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 85:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 91:
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
		case 18:
			return EndStringInterpolate_sempred((RuleContext)_localctx, predIndex);
		case 24:
			return RightParen_sempred((RuleContext)_localctx, predIndex);
		case 88:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u028d\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3"+
		"J\5J\u0219\nJ\3K\6K\u021c\nK\rK\16K\u021d\3L\3L\3L\3L\3L\3M\3M\7M\u0227"+
		"\nM\fM\16M\u022a\13M\3N\3N\7N\u022e\nN\fN\16N\u0231\13N\3O\3O\3P\3P\3"+
		"P\3P\5P\u0239\nP\3Q\6Q\u023c\nQ\rQ\16Q\u023d\3Q\3Q\3R\7R\u0243\nR\fR\16"+
		"R\u0246\13R\3R\5R\u0249\nR\3R\3R\3R\3S\6S\u024f\nS\rS\16S\u0250\3T\3T"+
		"\3T\5T\u0256\nT\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\6X"+
		"\u0269\nX\rX\16X\u026a\3Y\3Y\3Y\3Y\3Y\5Y\u0272\nY\3Z\3Z\3Z\3Z\3Z\3[\3"+
		"[\6[\u027b\n[\r[\16[\u027c\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3^\3^\3^"+
		"\3^\3^\2\2_\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66"+
		"o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008d"+
		"F\u008fG\u0091H\u0093I\u0095J\u0097K\u0099\2\u009bL\u009dM\u009fN\u00a1"+
		"\2\u00a3\2\u00a5O\u00a7P\u00a9Q\u00ab\2\u00adR\u00afS\u00b1T\u00b3U\u00b5"+
		"\2\u00b7V\u00b9W\u00bbX\u00bd\2\u00bfY\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4"+
		"\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2"+
		"\62;ch\2\u0291\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7"+
		"\3\2\2\2\4\u00a9\3\2\2\2\4\u00ad\3\2\2\2\5\u00af\3\2\2\2\5\u00b1\3\2\2"+
		"\2\5\u00b3\3\2\2\2\5\u00b7\3\2\2\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\6\u00bd"+
		"\3\2\2\2\6\u00bf\3\2\2\2\7\u00c1\3\2\2\2\t\u00c7\3\2\2\2\13\u00cf\3\2"+
		"\2\2\r\u00d4\3\2\2\2\17\u00d8\3\2\2\2\21\u00dd\3\2\2\2\23\u00e0\3\2\2"+
		"\2\25\u00ea\3\2\2\2\27\u00ef\3\2\2\2\31\u00f2\3\2\2\2\33\u00f4\3\2\2\2"+
		"\35\u00f6\3\2\2\2\37\u00f8\3\2\2\2!\u00fa\3\2\2\2#\u00fc\3\2\2\2%\u00fe"+
		"\3\2\2\2\'\u0100\3\2\2\2)\u0105\3\2\2\2+\u0108\3\2\2\2-\u010e\3\2\2\2"+
		"/\u0110\3\2\2\2\61\u0112\3\2\2\2\63\u0116\3\2\2\2\65\u0118\3\2\2\2\67"+
		"\u011d\3\2\2\29\u0122\3\2\2\2;\u0124\3\2\2\2=\u0126\3\2\2\2?\u0128\3\2"+
		"\2\2A\u012a\3\2\2\2C\u012f\3\2\2\2E\u0131\3\2\2\2G\u0133\3\2\2\2I\u0135"+
		"\3\2\2\2K\u013f\3\2\2\2M\u0146\3\2\2\2O\u014b\3\2\2\2Q\u0154\3\2\2\2S"+
		"\u015e\3\2\2\2U\u0167\3\2\2\2W\u016d\3\2\2\2Y\u0171\3\2\2\2[\u0176\3\2"+
		"\2\2]\u017c\3\2\2\2_\u0181\3\2\2\2a\u0183\3\2\2\2c\u0186\3\2\2\2e\u0188"+
		"\3\2\2\2g\u018a\3\2\2\2i\u018c\3\2\2\2k\u018f\3\2\2\2m\u0193\3\2\2\2o"+
		"\u0195\3\2\2\2q\u0197\3\2\2\2s\u0199\3\2\2\2u\u019b\3\2\2\2w\u01a2\3\2"+
		"\2\2y\u01a7\3\2\2\2{\u01ae\3\2\2\2}\u01bb\3\2\2\2\177\u01c0\3\2\2\2\u0081"+
		"\u01c9\3\2\2\2\u0083\u01d2\3\2\2\2\u0085\u01db\3\2\2\2\u0087\u01e5\3\2"+
		"\2\2\u0089\u01ea\3\2\2\2\u008b\u01f6\3\2\2\2\u008d\u01fa\3\2\2\2\u008f"+
		"\u0202\3\2\2\2\u0091\u0209\3\2\2\2\u0093\u020c\3\2\2\2\u0095\u0214\3\2"+
		"\2\2\u0097\u0216\3\2\2\2\u0099\u021b\3\2\2\2\u009b\u021f\3\2\2\2\u009d"+
		"\u0224\3\2\2\2\u009f\u022b\3\2\2\2\u00a1\u0232\3\2\2\2\u00a3\u0238\3\2"+
		"\2\2\u00a5\u023b\3\2\2\2\u00a7\u0244\3\2\2\2\u00a9\u024e\3\2\2\2\u00ab"+
		"\u0255\3\2\2\2\u00ad\u0257\3\2\2\2\u00af\u025b\3\2\2\2\u00b1\u0262\3\2"+
		"\2\2\u00b3\u0268\3\2\2\2\u00b5\u0271\3\2\2\2\u00b7\u0273\3\2\2\2\u00b9"+
		"\u027a\3\2\2\2\u00bb\u027e\3\2\2\2\u00bd\u0282\3\2\2\2\u00bf\u0288\3\2"+
		"\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\b\2\2\2\u00c5\u00c6\b\2\3\2\u00c6\b\3\2\2\2\u00c7\u00c8\7k\2\2"+
		"\u00c8\u00c9\7p\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7w\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7g\2\2\u00ce\n\3\2\2\2\u00cf\u00d0"+
		"\7X\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7F\2\2\u00d3"+
		"\f\3\2\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7h\2\2\u00d7"+
		"\16\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7g\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\20\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7q\2\2\u00df"+
		"\22\3\2\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7j\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\24\3\2\2\2\u00ea\u00eb\7"+
		"f\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7c\2\2\u00ee\26"+
		"\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0\u00f1\7@\2\2\u00f1\30\3\2\2\2\u00f2"+
		"\u00f3\7#\2\2\u00f3\32\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\34\3\2\2\2\u00f6"+
		"\u00f7\7`\2\2\u00f7\36\3\2\2\2\u00f8\u00f9\7\u00a9\2\2\u00f9 \3\2\2\2"+
		"\u00fa\u00fb\7(\2\2\u00fb\"\3\2\2\2\u00fc\u00fd\7\61\2\2\u00fd$\3\2\2"+
		"\2\u00fe\u00ff\7<\2\2\u00ff&\3\2\2\2\u0100\u0101\7<\2\2\u0101\u0102\7"+
		"<\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\u009fN\2\u0104(\3\2\2\2\u0105"+
		"\u0106\7\60\2\2\u0106\u0107\5\u009fN\2\u0107*\3\2\2\2\u0108\u0109\7=\2"+
		"\2\u0109\u010a\6\24\2\2\u010a\u010b\b\24\4\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b\24\5\2\u010d,\3\2\2\2\u010e\u010f\7=\2\2\u010f.\3\2\2\2\u0110"+
		"\u0111\7.\2\2\u0111\60\3\2\2\2\u0112\u0113\7\60\2\2\u0113\u0114\7\60\2"+
		"\2\u0114\u0115\7\60\2\2\u0115\62\3\2\2\2\u0116\u0117\7\u0080\2\2\u0117"+
		"\64\3\2\2\2\u0118\u0119\7*\2\2\u0119\u011a\b\31\6\2\u011a\u011b\3\2\2"+
		"\2\u011b\u011c\b\31\7\2\u011c\66\3\2\2\2\u011d\u011e\7+\2\2\u011e\u011f"+
		"\6\32\3\2\u011f\u0120\3\2\2\2\u0120\u0121\b\32\5\2\u01218\3\2\2\2\u0122"+
		"\u0123\7]\2\2\u0123:\3\2\2\2\u0124\u0125\7_\2\2\u0125<\3\2\2\2\u0126\u0127"+
		"\7}\2\2\u0127>\3\2\2\2\u0128\u0129\7\177\2\2\u0129@\3\2\2\2\u012a\u012b"+
		"\7]\2\2\u012b\u012c\7z\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\37\b\2\u012e"+
		"B\3\2\2\2\u012f\u0130\7>\2\2\u0130D\3\2\2\2\u0131\u0132\7$\2\2\u0132F"+
		"\3\2\2\2\u0133\u0134\7^\2\2\u0134H\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137"+
		"\7g\2\2\u0137\u0138\7o\2\2\u0138\u0139\7r\2\2\u0139\u013a\7n\2\2\u013a"+
		"\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c\u013d\7g\2\2\u013d\u013e\7u\2\2"+
		"\u013eJ\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141\7q\2\2\u0141\u0142\7w\2"+
		"\2\u0142\u0143\7t\2\2\u0143\u0144\7e\2\2\u0144\u0145\7g\2\2\u0145L\3\2"+
		"\2\2\u0146\u0147\7u\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a"+
		"\7m\2\2\u014aN\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e"+
		"\7o\2\2\u014e\u014f\7r\2\2\u014f\u0150\7q\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7t\2\2\u0153P\3\2\2\2\u0154\u0155\7r\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7q\2\2\u0157\u0158\7e\2\2\u0158\u0159\7g\2\2"+
		"\u0159\u015a\7u\2\2\u015a\u015b\7u\2\2\u015b\u015c\7q\2\2\u015c\u015d"+
		"\7t\2\2\u015dR\3\2\2\2\u015e\u015f\7q\2\2\u015f\u0160\7r\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7t\2\2\u0162\u0163\7c\2\2\u0163\u0164\7v\2\2\u0164"+
		"\u0165\7q\2\2\u0165\u0166\7t\2\2\u0166T\3\2\2\2\u0167\u0168\7u\2\2\u0168"+
		"\u0169\7v\2\2\u0169\u016a\7c\2\2\u016a\u016b\7v\2\2\u016b\u016c\7g\2\2"+
		"\u016cV\3\2\2\2\u016d\u016e\7g\2\2\u016e\u016f\7p\2\2\u016f\u0170\7f\2"+
		"\2\u0170X\3\2\2\2\u0171\u0172\7t\2\2\u0172\u0173\7w\2\2\u0173\u0174\7"+
		"n\2\2\u0174\u0175\7g\2\2\u0175Z\3\2\2\2\u0176\u0177\7h\2\2\u0177\u0178"+
		"\7k\2\2\u0178\u0179\7t\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2\u017b"+
		"\\\3\2\2\2\u017c\u017d\7n\2\2\u017d\u017e\7c\2\2\u017e\u017f\7u\2\2\u017f"+
		"\u0180\7v\2\2\u0180^\3\2\2\2\u0181\u0182\7%\2\2\u0182`\3\2\2\2\u0183\u0184"+
		"\7\60\2\2\u0184\u0185\7\60\2\2\u0185b\3\2\2\2\u0186\u0187\7-\2\2\u0187"+
		"d\3\2\2\2\u0188\u0189\7/\2\2\u0189f\3\2\2\2\u018a\u018b\7,\2\2\u018bh"+
		"\3\2\2\2\u018c\u018d\7\u0080\2\2\u018d\u018e\7\61\2\2\u018ej\3\2\2\2\u018f"+
		"\u0190\7o\2\2\u0190\u0191\7q\2\2\u0191\u0192\7f\2\2\u0192l\3\2\2\2\u0193"+
		"\u0194\7A\2\2\u0194n\3\2\2\2\u0195\u0196\7?\2\2\u0196p\3\2\2\2\u0197\u0198"+
		"\7~\2\2\u0198r\3\2\2\2\u0199\u019a\7@\2\2\u019at\3\2\2\2\u019b\u019c\7"+
		"A\2\2\u019c\u019d\7*\2\2\u019d\u019e\3\2\2\2\u019e\u019f\b9\t\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\b9\7\2\u01a1v\3\2\2\2\u01a2\u01a3\7v\2\2\u01a3"+
		"\u01a4\7g\2\2\u01a4\u01a5\7u\2\2\u01a5\u01a6\7v\2\2\u01a6x\3\2\2\2\u01a7"+
		"\u01a8\7c\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa\7u\2\2\u01aa\u01ab\7g\2\2"+
		"\u01ab\u01ac\7t\2\2\u01ac\u01ad\7v\2\2\u01adz\3\2\2\2\u01ae\u01af\7e\2"+
		"\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3"+
		"\7/\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7{\2\2\u01b5\u01b6\7u\2\2\u01b6"+
		"\u01b7\7v\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7o\2\2\u01b9\u01ba\7\61\2"+
		"\2\u01ba|\3\2\2\2\u01bb\u01bc\7y\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7"+
		"v\2\2\u01be\u01bf\7j\2\2\u01bf~\3\2\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2"+
		"\7t\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7x\2\2\u01c4\u01c5\7k\2\2\u01c5"+
		"\u01c6\7f\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8\7f\2\2\u01c8\u0080\3\2\2"+
		"\2\u01c9\u01ca\7o\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd"+
		"\7k\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7g\2\2\u01d0"+
		"\u01d1\7f\2\2\u01d1\u0082\3\2\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7j\2"+
		"\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8"+
		"\7y\2\2\u01d8\u01d9\7g\2\2\u01d9\u01da\7f\2\2\u01da\u0084\3\2\2\2\u01db"+
		"\u01dc\7k\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7j\2\2\u01de\u01df\7g\2\2"+
		"\u01df\u01e0\7t\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3"+
		"\7g\2\2\u01e3\u01e4\7f\2\2\u01e4\u0086\3\2\2\2\u01e5\u01e6\7h\2\2\u01e6"+
		"\u01e7\7t\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7o\2\2\u01e9\u0088\3\2\2"+
		"\2\u01ea\u01eb\7u\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee"+
		"\7p\2\2\u01ee\u01ef\7f\2\2\u01ef\u01f0\7/\2\2\u01f0\u01f1\7c\2\2\u01f1"+
		"\u01f2\7n\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7p\2\2\u01f4\u01f5\7g\2\2"+
		"\u01f5\u008a\3\2\2\2\u01f6\u01f7\7w\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9"+
		"\7g\2\2\u01f9\u008c\3\2\2\2\u01fa\u01fb\7r\2\2\u01fb\u01fc\7t\2\2\u01fc"+
		"\u01fd\7q\2\2\u01fd\u01fe\7i\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7c\2\2"+
		"\u0200\u0201\7o\2\2\u0201\u008e\3\2\2\2\u0202\u0203\7o\2\2\u0203\u0204"+
		"\7q\2\2\u0204\u0205\7f\2\2\u0205\u0206\7k\2\2\u0206\u0207\7h\2\2\u0207"+
		"\u0208\7{\2\2\u0208\u0090\3\2\2\2\u0209\u020a\7d\2\2\u020a\u020b\7{\2"+
		"\2\u020b\u0092\3\2\2\2\u020c\u020d\7e\2\2\u020d\u020e\7q\2\2\u020e\u020f"+
		"\7n\2\2\u020f\u0210\7n\2\2\u0210\u0211\7g\2\2\u0211\u0212\7e\2\2\u0212"+
		"\u0213\7v\2\2\u0213\u0094\3\2\2\2\u0214\u0215\7\62\2\2\u0215\u0096\3\2"+
		"\2\2\u0216\u0218\t\2\2\2\u0217\u0219\5\u0099K\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0098\3\2\2\2\u021a\u021c\t\3\2\2\u021b\u021a\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u009a\3\2\2\2\u021f\u0220\7)\2\2\u0220\u0221\bL\n\2\u0221\u0222\3\2\2"+
		"\2\u0222\u0223\bL\13\2\u0223\u009c\3\2\2\2\u0224\u0228\7B\2\2\u0225\u0227"+
		"\5\u00a3P\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2"+
		"\2\u0228\u0229\3\2\2\2\u0229\u009e\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022f"+
		"\5\u00a1O\2\u022c\u022e\5\u00a3P\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u00a0\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\t\4\2\2\u0233\u00a2\3\2\2\2\u0234\u0239\5\u00a1"+
		"O\2\u0235\u0239\t\5\2\2\u0236\u0237\7/\2\2\u0237\u0239\t\4\2\2\u0238\u0234"+
		"\3\2\2\2\u0238\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u00a4\3\2\2\2\u023a"+
		"\u023c\t\6\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\bQ\2\2\u0240"+
		"\u00a6\3\2\2\2\u0241\u0243\n\7\2\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u0249\t\b\2\2\u0248\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024b\bR\2\2\u024b\u024c\bR\5\2\u024c\u00a8\3\2\2\2\u024d\u024f"+
		"\5\u00abT\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2"+
		"\2\u0250\u0251\3\2\2\2\u0251\u00aa\3\2\2\2\u0252\u0253\7)\2\2\u0253\u0256"+
		"\7)\2\2\u0254\u0256\n\t\2\2\u0255\u0252\3\2\2\2\u0255\u0254\3\2\2\2\u0256"+
		"\u00ac\3\2\2\2\u0257\u0258\7)\2\2\u0258\u0259\3\2\2\2\u0259\u025a\bU\5"+
		"\2\u025a\u00ae\3\2\2\2\u025b\u025c\7&\2\2\u025c\u025d\7%\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\bV\f\2\u025f\u0260\3\2\2\2\u0260\u0261\bV\7\2\u0261"+
		"\u00b0\3\2\2\2\u0262\u0263\7&\2\2\u0263\u0264\bW\r\2\u0264\u0265\3\2\2"+
		"\2\u0265\u0266\bW\7\2\u0266\u00b2\3\2\2\2\u0267\u0269\5\u00b5Y\2\u0268"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u00b4\3\2\2\2\u026c\u026d\7)\2\2\u026d\u0272\7)\2\2\u026e\u026f"+
		"\7&\2\2\u026f\u0272\7&\2\2\u0270\u0272\n\n\2\2\u0271\u026c\3\2\2\2\u0271"+
		"\u026e\3\2\2\2\u0271\u0270\3\2\2\2\u0272\u00b6\3\2\2\2\u0273\u0274\7)"+
		"\2\2\u0274\u0275\6Z\4\2\u0275\u0276\3\2\2\2\u0276\u0277\bZ\5\2\u0277\u00b8"+
		"\3\2\2\2\u0278\u0279\t\13\2\2\u0279\u027b\t\13\2\2\u027a\u0278\3\2\2\2"+
		"\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u00ba"+
		"\3\2\2\2\u027e\u027f\5\u00a5Q\2\u027f\u0280\3\2\2\2\u0280\u0281\b\\\2"+
		"\2\u0281\u00bc\3\2\2\2\u0282\u0283\5\65\31\2\u0283\u0284\b]\16\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\b]\17\2\u0286\u0287\b]\7\2\u0287\u00be\3\2"+
		"\2\2\u0288\u0289\7z\2\2\u0289\u028a\7_\2\2\u028a\u028b\3\2\2\2\u028b\u028c"+
		"\b^\5\2\u028c\u00c0\3\2\2\2\24\2\3\4\5\6\u0218\u021d\u0228\u022f\u0238"+
		"\u023d\u0244\u0248\u0250\u0255\u026a\u0271\u027c\20\b\2\2\7\3\2\3\24\2"+
		"\6\2\2\3\31\3\7\2\2\7\6\2\39\4\3L\5\7\5\2\3V\6\3W\7\3]\b\t\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}