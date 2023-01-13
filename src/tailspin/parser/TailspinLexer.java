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
		LocalDefinition=9, To=10, ResultMarker=11, SourceMarker=12, DeleteMarker=13, 
		Reflexive=14, And=15, Slash=16, Colon=17, Message=18, FieldReference=19, 
		EndStringInterpolate=20, SemiColon=21, Comma=22, Deconstructor=23, Invert=24, 
		LeftParen=25, RightParen=26, LeftBracket=27, RightBracket=28, LeftBrace=29, 
		RightBrace=30, StartArrayTemplates=31, StartBytes=32, StartMatcher=33, 
		Quote=34, Lambda=35, Tick=36, StartTemplatesDefinition=37, StartSourceDefinition=38, 
		StartSinkDefinition=39, StartComposerDefinition=40, StartProcessorDefinition=41, 
		StartOperatorDefinition=42, StartStateDefinition=43, EndDefinition=44, 
		Rule=45, First=46, Last=47, TemplateMatch=48, Range=49, Plus=50, Minus=51, 
		Star=52, TruncateDivide=53, Mod=54, Question=55, Equal=56, Else=57, EndMatcher=58, 
		BeginCondition=59, StartTestDefinition=60, Assert=61, CoreSystem=62, With=63, 
		Provided=64, Modified=65, Shadowed=66, Inherited=67, From=68, StandAlone=69, 
		Use=70, Program=71, Modify=72, By=73, Collect=74, Scalar=75, Zero=76, 
		PositiveInteger=77, START_STRING=78, STATE_IDENTIFIER=79, IDENTIFIER=80, 
		WS=81, Comment=82, REGEX_TEXT=83, END_REGEX=84, StartCharacterCode=85, 
		StartStringInterpolate=86, STRING_TEXT=87, END_STRING=88, Bytes=89, Bytes_WS=90, 
		EndBytes=91;
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
			"DataDefinition", "LocalDefinition", "To", "ResultMarker", "SourceMarker", 
			"DeleteMarker", "Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartArrayTemplates", "StartBytes", "StartMatcher", "Quote", 
			"Lambda", "Tick", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "StartStateDefinition", "EndDefinition", "Rule", 
			"First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Scalar", 
			"Zero", "PositiveInteger", "Digits", "START_STRING", "STATE_IDENTIFIER", 
			"IDENTIFIER", "SUPER_IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"Bytes", "Bytes_WS", "StartBytesExpression", "EndBytes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'data'", "'local'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", 
			"'/'", "':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, 
			"'['", "']'", "'{'", "'}'", null, "'[x'", "'<'", "'\"'", "'\\'", "'\u00B4'", 
			"'templates'", "'source'", "'sink'", "'composer'", "'processor'", "'operator'", 
			"'state'", "'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", 
			"'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", 
			"'assert'", "'core-system/'", "'with'", "'provided'", "'modified'", "'shadowed'", 
			"'inherited'", "'from'", "'stand-alone'", "'use'", "'program'", "'modify'", 
			"'by'", "'collect'", "'\"1\"'", "'0'", null, null, null, null, null, 
			null, null, "'''", null, null, null, null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"DataDefinition", "LocalDefinition", "To", "ResultMarker", "SourceMarker", 
			"DeleteMarker", "Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Invert", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartArrayTemplates", "StartBytes", "StartMatcher", "Quote", 
			"Lambda", "Tick", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "StartStateDefinition", "EndDefinition", "Rule", 
			"First", "Last", "TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Program", "Modify", "By", "Collect", "Scalar", 
			"Zero", "PositiveInteger", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", 
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
		case 19:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			LeftParen_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
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
		case 19:
			return EndStringInterpolate_sempred((RuleContext)_localctx, predIndex);
		case 25:
			return RightParen_sempred((RuleContext)_localctx, predIndex);
		case 93:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u02b4\b\1\b\1\b"+
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
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \7 \u013e\n"+
		" \f \16 \u0141\13 \5 \u0143\n \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3"+
		"I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\5N\u023b"+
		"\nN\3O\6O\u023e\nO\rO\16O\u023f\3P\3P\3P\3P\3P\3Q\3Q\7Q\u0249\nQ\fQ\16"+
		"Q\u024c\13Q\3R\5R\u024f\nR\3R\3R\7R\u0253\nR\fR\16R\u0256\13R\3S\3S\3"+
		"T\3T\3U\3U\3U\3U\5U\u0260\nU\3V\6V\u0263\nV\rV\16V\u0264\3V\3V\3W\7W\u026a"+
		"\nW\fW\16W\u026d\13W\3W\5W\u0270\nW\3W\3W\3W\3X\6X\u0276\nX\rX\16X\u0277"+
		"\3Y\3Y\3Y\5Y\u027d\nY\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3]\6]\u0290\n]\r]\16]\u0291\3^\3^\3^\3^\3^\5^\u0299\n^\3_\3_\3_\3"+
		"_\3_\3`\3`\6`\u02a2\n`\r`\16`\u02a3\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3"+
		"c\3c\3c\3c\2\2d\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65"+
		"m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE"+
		"\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\u009bM\u009dN\u009f"+
		"O\u00a1\2\u00a3P\u00a5Q\u00a7R\u00a9\2\u00ab\2\u00ad\2\u00afS\u00b1T\u00b3"+
		"U\u00b5\2\u00b7V\u00b9W\u00bbX\u00bdY\u00bf\2\u00c1Z\u00c3[\u00c5\\\u00c7"+
		"\2\u00c9]\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17"+
		"\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u02ba\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00af\3\2\2\2\3\u00b1\3\2\2\2\4\u00b3\3\2\2\2\4\u00b7\3\2\2"+
		"\2\5\u00b9\3\2\2\2\5\u00bb\3\2\2\2\5\u00bd\3\2\2\2\5\u00c1\3\2\2\2\6\u00c3"+
		"\3\2\2\2\6\u00c5\3\2\2\2\6\u00c7\3\2\2\2\6\u00c9\3\2\2\2\7\u00cb\3\2\2"+
		"\2\t\u00d1\3\2\2\2\13\u00d9\3\2\2\2\r\u00de\3\2\2\2\17\u00e2\3\2\2\2\21"+
		"\u00e7\3\2\2\2\23\u00ea\3\2\2\2\25\u00f4\3\2\2\2\27\u00f9\3\2\2\2\31\u00ff"+
		"\3\2\2\2\33\u0102\3\2\2\2\35\u0104\3\2\2\2\37\u0106\3\2\2\2!\u0108\3\2"+
		"\2\2#\u010a\3\2\2\2%\u010c\3\2\2\2\'\u010e\3\2\2\2)\u0110\3\2\2\2+\u0115"+
		"\3\2\2\2-\u0118\3\2\2\2/\u011e\3\2\2\2\61\u0120\3\2\2\2\63\u0122\3\2\2"+
		"\2\65\u0126\3\2\2\2\67\u0128\3\2\2\29\u012d\3\2\2\2;\u0132\3\2\2\2=\u0134"+
		"\3\2\2\2?\u0136\3\2\2\2A\u0138\3\2\2\2C\u013a\3\2\2\2E\u0146\3\2\2\2G"+
		"\u014b\3\2\2\2I\u014d\3\2\2\2K\u014f\3\2\2\2M\u0151\3\2\2\2O\u0153\3\2"+
		"\2\2Q\u015d\3\2\2\2S\u0164\3\2\2\2U\u0169\3\2\2\2W\u0172\3\2\2\2Y\u017c"+
		"\3\2\2\2[\u0185\3\2\2\2]\u018b\3\2\2\2_\u018f\3\2\2\2a\u0194\3\2\2\2c"+
		"\u019a\3\2\2\2e\u019f\3\2\2\2g\u01a1\3\2\2\2i\u01a4\3\2\2\2k\u01a6\3\2"+
		"\2\2m\u01a8\3\2\2\2o\u01aa\3\2\2\2q\u01ad\3\2\2\2s\u01b1\3\2\2\2u\u01b3"+
		"\3\2\2\2w\u01b5\3\2\2\2y\u01b7\3\2\2\2{\u01b9\3\2\2\2}\u01c0\3\2\2\2\177"+
		"\u01c5\3\2\2\2\u0081\u01cc\3\2\2\2\u0083\u01d9\3\2\2\2\u0085\u01de\3\2"+
		"\2\2\u0087\u01e7\3\2\2\2\u0089\u01f0\3\2\2\2\u008b\u01f9\3\2\2\2\u008d"+
		"\u0203\3\2\2\2\u008f\u0208\3\2\2\2\u0091\u0214\3\2\2\2\u0093\u0218\3\2"+
		"\2\2\u0095\u0220\3\2\2\2\u0097\u0227\3\2\2\2\u0099\u022a\3\2\2\2\u009b"+
		"\u0232\3\2\2\2\u009d\u0236\3\2\2\2\u009f\u0238\3\2\2\2\u00a1\u023d\3\2"+
		"\2\2\u00a3\u0241\3\2\2\2\u00a5\u0246\3\2\2\2\u00a7\u024e\3\2\2\2\u00a9"+
		"\u0257\3\2\2\2\u00ab\u0259\3\2\2\2\u00ad\u025f\3\2\2\2\u00af\u0262\3\2"+
		"\2\2\u00b1\u026b\3\2\2\2\u00b3\u0275\3\2\2\2\u00b5\u027c\3\2\2\2\u00b7"+
		"\u027e\3\2\2\2\u00b9\u0282\3\2\2\2\u00bb\u0289\3\2\2\2\u00bd\u028f\3\2"+
		"\2\2\u00bf\u0298\3\2\2\2\u00c1\u029a\3\2\2\2\u00c3\u02a1\3\2\2\2\u00c5"+
		"\u02a5\3\2\2\2\u00c7\u02a9\3\2\2\2\u00c9\u02af\3\2\2\2\u00cb\u00cc\7\61"+
		"\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\2\2\2\u00cf"+
		"\u00d0\b\2\3\2\u00d0\b\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7f\2\2"+
		"\u00d7\u00d8\7g\2\2\u00d8\n\3\2\2\2\u00d9\u00da\7X\2\2\u00da\u00db\7Q"+
		"\2\2\u00db\u00dc\7K\2\2\u00dc\u00dd\7F\2\2\u00dd\f\3\2\2\2\u00de\u00df"+
		"\7f\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7h\2\2\u00e1\16\3\2\2\2\u00e2\u00e3"+
		"\7y\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2\u00e6"+
		"\20\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7q\2\2\u00e9\22\3\2\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7t\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2"+
		"\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\24\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6"+
		"\7c\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7c\2\2\u00f8\26\3\2\2\2\u00f9\u00fa"+
		"\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd"+
		"\u00fe\7n\2\2\u00fe\30\3\2\2\2\u00ff\u0100\7/\2\2\u0100\u0101\7@\2\2\u0101"+
		"\32\3\2\2\2\u0102\u0103\7#\2\2\u0103\34\3\2\2\2\u0104\u0105\7&\2\2\u0105"+
		"\36\3\2\2\2\u0106\u0107\7`\2\2\u0107 \3\2\2\2\u0108\u0109\7\u00a9\2\2"+
		"\u0109\"\3\2\2\2\u010a\u010b\7(\2\2\u010b$\3\2\2\2\u010c\u010d\7\61\2"+
		"\2\u010d&\3\2\2\2\u010e\u010f\7<\2\2\u010f(\3\2\2\2\u0110\u0111\7<\2\2"+
		"\u0111\u0112\7<\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\u00a7R\2\u0114*"+
		"\3\2\2\2\u0115\u0116\7\60\2\2\u0116\u0117\5\u00a7R\2\u0117,\3\2\2\2\u0118"+
		"\u0119\7=\2\2\u0119\u011a\6\25\2\2\u011a\u011b\b\25\4\2\u011b\u011c\3"+
		"\2\2\2\u011c\u011d\b\25\5\2\u011d.\3\2\2\2\u011e\u011f\7=\2\2\u011f\60"+
		"\3\2\2\2\u0120\u0121\7.\2\2\u0121\62\3\2\2\2\u0122\u0123\7\60\2\2\u0123"+
		"\u0124\7\60\2\2\u0124\u0125\7\60\2\2\u0125\64\3\2\2\2\u0126\u0127\7\u0080"+
		"\2\2\u0127\66\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a\b\32\6\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\b\32\7\2\u012c8\3\2\2\2\u012d\u012e\7+\2\2\u012e"+
		"\u012f\6\33\3\2\u012f\u0130\3\2\2\2\u0130\u0131\b\33\5\2\u0131:\3\2\2"+
		"\2\u0132\u0133\7]\2\2\u0133<\3\2\2\2\u0134\u0135\7_\2\2\u0135>\3\2\2\2"+
		"\u0136\u0137\7}\2\2\u0137@\3\2\2\2\u0138\u0139\7\177\2\2\u0139B\3\2\2"+
		"\2\u013a\u0142\7^\2\2\u013b\u013f\5\u00abT\2\u013c\u013e\5\u00adU\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u013b\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7]\2\2\u0145D\3\2\2\2\u0146"+
		"\u0147\7]\2\2\u0147\u0148\7z\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b!\b"+
		"\2\u014aF\3\2\2\2\u014b\u014c\7>\2\2\u014cH\3\2\2\2\u014d\u014e\7$\2\2"+
		"\u014eJ\3\2\2\2\u014f\u0150\7^\2\2\u0150L\3\2\2\2\u0151\u0152\7\u00b6"+
		"\2\2\u0152N\3\2\2\2\u0153\u0154\7v\2\2\u0154\u0155\7g\2\2\u0155\u0156"+
		"\7o\2\2\u0156\u0157\7r\2\2\u0157\u0158\7n\2\2\u0158\u0159\7c\2\2\u0159"+
		"\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c\7u\2\2\u015cP\3\2\2\2\u015d"+
		"\u015e\7u\2\2\u015e\u015f\7q\2\2\u015f\u0160\7w\2\2\u0160\u0161\7t\2\2"+
		"\u0161\u0162\7e\2\2\u0162\u0163\7g\2\2\u0163R\3\2\2\2\u0164\u0165\7u\2"+
		"\2\u0165\u0166\7k\2\2\u0166\u0167\7p\2\2\u0167\u0168\7m\2\2\u0168T\3\2"+
		"\2\2\u0169\u016a\7e\2\2\u016a\u016b\7q\2\2\u016b\u016c\7o\2\2\u016c\u016d"+
		"\7r\2\2\u016d\u016e\7q\2\2\u016e\u016f\7u\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7t\2\2\u0171V\3\2\2\2\u0172\u0173\7r\2\2\u0173\u0174\7t\2\2\u0174"+
		"\u0175\7q\2\2\u0175\u0176\7e\2\2\u0176\u0177\7g\2\2\u0177\u0178\7u\2\2"+
		"\u0178\u0179\7u\2\2\u0179\u017a\7q\2\2\u017a\u017b\7t\2\2\u017bX\3\2\2"+
		"\2\u017c\u017d\7q\2\2\u017d\u017e\7r\2\2\u017e\u017f\7g\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7c\2\2\u0181\u0182\7v\2\2\u0182\u0183\7q\2\2\u0183"+
		"\u0184\7t\2\2\u0184Z\3\2\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2\u0187"+
		"\u0188\7c\2\2\u0188\u0189\7v\2\2\u0189\u018a\7g\2\2\u018a\\\3\2\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7p\2\2\u018d\u018e\7f\2\2\u018e^\3\2\2\2\u018f"+
		"\u0190\7t\2\2\u0190\u0191\7w\2\2\u0191\u0192\7n\2\2\u0192\u0193\7g\2\2"+
		"\u0193`\3\2\2\2\u0194\u0195\7h\2\2\u0195\u0196\7k\2\2\u0196\u0197\7t\2"+
		"\2\u0197\u0198\7u\2\2\u0198\u0199\7v\2\2\u0199b\3\2\2\2\u019a\u019b\7"+
		"n\2\2\u019b\u019c\7c\2\2\u019c\u019d\7u\2\2\u019d\u019e\7v\2\2\u019ed"+
		"\3\2\2\2\u019f\u01a0\7%\2\2\u01a0f\3\2\2\2\u01a1\u01a2\7\60\2\2\u01a2"+
		"\u01a3\7\60\2\2\u01a3h\3\2\2\2\u01a4\u01a5\7-\2\2\u01a5j\3\2\2\2\u01a6"+
		"\u01a7\7/\2\2\u01a7l\3\2\2\2\u01a8\u01a9\7,\2\2\u01a9n\3\2\2\2\u01aa\u01ab"+
		"\7\u0080\2\2\u01ab\u01ac\7\61\2\2\u01acp\3\2\2\2\u01ad\u01ae\7o\2\2\u01ae"+
		"\u01af\7q\2\2\u01af\u01b0\7f\2\2\u01b0r\3\2\2\2\u01b1\u01b2\7A\2\2\u01b2"+
		"t\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4v\3\2\2\2\u01b5\u01b6\7~\2\2\u01b6x"+
		"\3\2\2\2\u01b7\u01b8\7@\2\2\u01b8z\3\2\2\2\u01b9\u01ba\7A\2\2\u01ba\u01bb"+
		"\7*\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b<\t\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\b<\7\2\u01bf|\3\2\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7g\2\2\u01c2"+
		"\u01c3\7u\2\2\u01c3\u01c4\7v\2\2\u01c4~\3\2\2\2\u01c5\u01c6\7c\2\2\u01c6"+
		"\u01c7\7u\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7t\2\2"+
		"\u01ca\u01cb\7v\2\2\u01cb\u0080\3\2\2\2\u01cc\u01cd\7e\2\2\u01cd\u01ce"+
		"\7q\2\2\u01ce\u01cf\7t\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7/\2\2\u01d1"+
		"\u01d2\7u\2\2\u01d2\u01d3\7{\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7v\2\2"+
		"\u01d5\u01d6\7g\2\2\u01d6\u01d7\7o\2\2\u01d7\u01d8\7\61\2\2\u01d8\u0082"+
		"\3\2\2\2\u01d9\u01da\7y\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7v\2\2\u01dc"+
		"\u01dd\7j\2\2\u01dd\u0084\3\2\2\2\u01de\u01df\7r\2\2\u01df\u01e0\7t\2"+
		"\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7x\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4"+
		"\7f\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7f\2\2\u01e6\u0086\3\2\2\2\u01e7"+
		"\u01e8\7o\2\2\u01e8\u01e9\7q\2\2\u01e9\u01ea\7f\2\2\u01ea\u01eb\7k\2\2"+
		"\u01eb\u01ec\7h\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef"+
		"\7f\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7j\2\2\u01f2"+
		"\u01f3\7c\2\2\u01f3\u01f4\7f\2\2\u01f4\u01f5\7q\2\2\u01f5\u01f6\7y\2\2"+
		"\u01f6\u01f7\7g\2\2\u01f7\u01f8\7f\2\2\u01f8\u008a\3\2\2\2\u01f9\u01fa"+
		"\7k\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7j\2\2\u01fc\u01fd\7g\2\2\u01fd"+
		"\u01fe\7t\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7v\2\2\u0200\u0201\7g\2\2"+
		"\u0201\u0202\7f\2\2\u0202\u008c\3\2\2\2\u0203\u0204\7h\2\2\u0204\u0205"+
		"\7t\2\2\u0205\u0206\7q\2\2\u0206\u0207\7o\2\2\u0207\u008e\3\2\2\2\u0208"+
		"\u0209\7u\2\2\u0209\u020a\7v\2\2\u020a\u020b\7c\2\2\u020b\u020c\7p\2\2"+
		"\u020c\u020d\7f\2\2\u020d\u020e\7/\2\2\u020e\u020f\7c\2\2\u020f\u0210"+
		"\7n\2\2\u0210\u0211\7q\2\2\u0211\u0212\7p\2\2\u0212\u0213\7g\2\2\u0213"+
		"\u0090\3\2\2\2\u0214\u0215\7w\2\2\u0215\u0216\7u\2\2\u0216\u0217\7g\2"+
		"\2\u0217\u0092\3\2\2\2\u0218\u0219\7r\2\2\u0219\u021a\7t\2\2\u021a\u021b"+
		"\7q\2\2\u021b\u021c\7i\2\2\u021c\u021d\7t\2\2\u021d\u021e\7c\2\2\u021e"+
		"\u021f\7o\2\2\u021f\u0094\3\2\2\2\u0220\u0221\7o\2\2\u0221\u0222\7q\2"+
		"\2\u0222\u0223\7f\2\2\u0223\u0224\7k\2\2\u0224\u0225\7h\2\2\u0225\u0226"+
		"\7{\2\2\u0226\u0096\3\2\2\2\u0227\u0228\7d\2\2\u0228\u0229\7{\2\2\u0229"+
		"\u0098\3\2\2\2\u022a\u022b\7e\2\2\u022b\u022c\7q\2\2\u022c\u022d\7n\2"+
		"\2\u022d\u022e\7n\2\2\u022e\u022f\7g\2\2\u022f\u0230\7e\2\2\u0230\u0231"+
		"\7v\2\2\u0231\u009a\3\2\2\2\u0232\u0233\7$\2\2\u0233\u0234\7\63\2\2\u0234"+
		"\u0235\7$\2\2\u0235\u009c\3\2\2\2\u0236\u0237\7\62\2\2\u0237\u009e\3\2"+
		"\2\2\u0238\u023a\t\2\2\2\u0239\u023b\5\u00a1O\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u00a0\3\2\2\2\u023c\u023e\t\3\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u00a2\3\2\2\2\u0241\u0242\7)\2\2\u0242\u0243\bP\n\2\u0243\u0244\3\2\2"+
		"\2\u0244\u0245\bP\13\2\u0245\u00a4\3\2\2\2\u0246\u024a\7B\2\2\u0247\u0249"+
		"\5\u00adU\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u00a6\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f"+
		"\5\u00a9S\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\3\2\2"+
		"\2\u0250\u0254\5\u00abT\2\u0251\u0253\5\u00adU\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u00a8\3\2"+
		"\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7,\2\2\u0258\u00aa\3\2\2\2\u0259"+
		"\u025a\t\4\2\2\u025a\u00ac\3\2\2\2\u025b\u0260\5\u00abT\2\u025c\u0260"+
		"\t\5\2\2\u025d\u025e\7/\2\2\u025e\u0260\t\4\2\2\u025f\u025b\3\2\2\2\u025f"+
		"\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u00ae\3\2\2\2\u0261\u0263\t\6"+
		"\2\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\bV\2\2\u0267\u00b0\3\2"+
		"\2\2\u0268\u026a\n\7\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u0270\t\b\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\bW\2\2\u0272\u0273\bW\5\2\u0273\u00b2\3\2\2\2\u0274\u0276\5\u00b5"+
		"Y\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u00b4\3\2\2\2\u0279\u027a\7)\2\2\u027a\u027d\7)\2"+
		"\2\u027b\u027d\n\t\2\2\u027c\u0279\3\2\2\2\u027c\u027b\3\2\2\2\u027d\u00b6"+
		"\3\2\2\2\u027e\u027f\7)\2\2\u027f\u0280\3\2\2\2\u0280\u0281\bZ\5\2\u0281"+
		"\u00b8\3\2\2\2\u0282\u0283\7&\2\2\u0283\u0284\7%\2\2\u0284\u0285\3\2\2"+
		"\2\u0285\u0286\b[\f\2\u0286\u0287\3\2\2\2\u0287\u0288\b[\7\2\u0288\u00ba"+
		"\3\2\2\2\u0289\u028a\7&\2\2\u028a\u028b\b\\\r\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\b\\\7\2\u028d\u00bc\3\2\2\2\u028e\u0290\5\u00bf^\2\u028f\u028e"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u00be\3\2\2\2\u0293\u0294\7)\2\2\u0294\u0299\7)\2\2\u0295\u0296\7&\2"+
		"\2\u0296\u0299\7&\2\2\u0297\u0299\n\n\2\2\u0298\u0293\3\2\2\2\u0298\u0295"+
		"\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u00c0\3\2\2\2\u029a\u029b\7)\2\2\u029b"+
		"\u029c\6_\4\2\u029c\u029d\3\2\2\2\u029d\u029e\b_\5\2\u029e\u00c2\3\2\2"+
		"\2\u029f\u02a0\t\13\2\2\u02a0\u02a2\t\13\2\2\u02a1\u029f\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u00c4\3\2"+
		"\2\2\u02a5\u02a6\5\u00afV\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\ba\2\2\u02a8"+
		"\u00c6\3\2\2\2\u02a9\u02aa\5\67\32\2\u02aa\u02ab\bb\16\2\u02ab\u02ac\3"+
		"\2\2\2\u02ac\u02ad\bb\17\2\u02ad\u02ae\bb\7\2\u02ae\u00c8\3\2\2\2\u02af"+
		"\u02b0\7z\2\2\u02b0\u02b1\7_\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\bc\5"+
		"\2\u02b3\u00ca\3\2\2\2\27\2\3\4\5\6\u013f\u0142\u023a\u023f\u024a\u024e"+
		"\u0254\u025f\u0264\u026b\u026f\u0277\u027c\u0291\u0298\u02a3\20\b\2\2"+
		"\7\3\2\3\25\2\6\2\2\3\32\3\7\2\2\7\6\2\3<\4\3P\5\7\5\2\3[\6\3\\\7\3b\b"+
		"\t\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}