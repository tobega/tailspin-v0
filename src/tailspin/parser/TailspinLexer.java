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
		RightBrace=30, StartBytes=31, StartMatcher=32, Quote=33, Lambda=34, Tick=35, 
		StartTemplatesDefinition=36, StartSourceDefinition=37, StartSinkDefinition=38, 
		StartComposerDefinition=39, StartProcessorDefinition=40, StartOperatorDefinition=41, 
		StartStateDefinition=42, EndDefinition=43, Rule=44, First=45, Last=46, 
		TemplateMatch=47, Range=48, Plus=49, Minus=50, Star=51, TruncateDivide=52, 
		Mod=53, Question=54, Equal=55, Else=56, EndMatcher=57, BeginCondition=58, 
		StartTestDefinition=59, Assert=60, CoreSystem=61, With=62, Provided=63, 
		Modified=64, Shadowed=65, Inherited=66, From=67, StandAlone=68, Use=69, 
		Program=70, Modify=71, By=72, Collect=73, Scalar=74, Zero=75, PositiveInteger=76, 
		START_STRING=77, STATE_IDENTIFIER=78, IDENTIFIER=79, WS=80, Comment=81, 
		REGEX_TEXT=82, END_REGEX=83, StartCharacterCode=84, StartStringInterpolate=85, 
		STRING_TEXT=86, END_STRING=87, Bytes=88, Bytes_WS=89, EndBytes=90;
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
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "Tick", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"StartStateDefinition", "EndDefinition", "Rule", "First", "Last", "TemplateMatch", 
			"Range", "Plus", "Minus", "Star", "TruncateDivide", "Mod", "Question", 
			"Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
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
			"'['", "']'", "'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'\u00B4'", 
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
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "Tick", 
			"StartTemplatesDefinition", "StartSourceDefinition", "StartSinkDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "StartOperatorDefinition", 
			"StartStateDefinition", "EndDefinition", "Rule", "First", "Last", "TemplateMatch", 
			"Range", "Plus", "Minus", "Star", "TruncateDivide", "Mod", "Question", 
			"Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
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
		case 57:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 88:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
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
		case 92:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\\\u02a6\b\1\b\1\b"+
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
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3M\3M\5M\u022d"+
		"\nM\3N\6N\u0230\nN\rN\16N\u0231\3O\3O\3O\3O\3O\3P\3P\7P\u023b\nP\fP\16"+
		"P\u023e\13P\3Q\5Q\u0241\nQ\3Q\3Q\7Q\u0245\nQ\fQ\16Q\u0248\13Q\3R\3R\3"+
		"S\3S\3T\3T\3T\3T\5T\u0252\nT\3U\6U\u0255\nU\rU\16U\u0256\3U\3U\3V\7V\u025c"+
		"\nV\fV\16V\u025f\13V\3V\5V\u0262\nV\3V\3V\3V\3W\6W\u0268\nW\rW\16W\u0269"+
		"\3X\3X\3X\5X\u026f\nX\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3["+
		"\3\\\6\\\u0282\n\\\r\\\16\\\u0283\3]\3]\3]\3]\3]\5]\u028b\n]\3^\3^\3^"+
		"\3^\3^\3_\3_\6_\u0294\n_\r_\16_\u0295\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3"+
		"b\3b\3b\3b\3b\2\2c\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64"+
		"k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008b"+
		"E\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\u009bM\u009dN\u009f"+
		"\2\u00a1O\u00a3P\u00a5Q\u00a7\2\u00a9\2\u00ab\2\u00adR\u00afS\u00b1T\u00b3"+
		"\2\u00b5U\u00b7V\u00b9W\u00bbX\u00bd\2\u00bfY\u00c1Z\u00c3[\u00c5\2\u00c7"+
		"\\\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u02aa\2\7\3\2\2\2\2\t\3\2\2"+
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
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00ad\3\2\2"+
		"\2\3\u00af\3\2\2\2\4\u00b1\3\2\2\2\4\u00b5\3\2\2\2\5\u00b7\3\2\2\2\5\u00b9"+
		"\3\2\2\2\5\u00bb\3\2\2\2\5\u00bf\3\2\2\2\6\u00c1\3\2\2\2\6\u00c3\3\2\2"+
		"\2\6\u00c5\3\2\2\2\6\u00c7\3\2\2\2\7\u00c9\3\2\2\2\t\u00cf\3\2\2\2\13"+
		"\u00d7\3\2\2\2\r\u00dc\3\2\2\2\17\u00e0\3\2\2\2\21\u00e5\3\2\2\2\23\u00e8"+
		"\3\2\2\2\25\u00f2\3\2\2\2\27\u00f7\3\2\2\2\31\u00fd\3\2\2\2\33\u0100\3"+
		"\2\2\2\35\u0102\3\2\2\2\37\u0104\3\2\2\2!\u0106\3\2\2\2#\u0108\3\2\2\2"+
		"%\u010a\3\2\2\2\'\u010c\3\2\2\2)\u010e\3\2\2\2+\u0113\3\2\2\2-\u0116\3"+
		"\2\2\2/\u011c\3\2\2\2\61\u011e\3\2\2\2\63\u0120\3\2\2\2\65\u0124\3\2\2"+
		"\2\67\u0126\3\2\2\29\u012b\3\2\2\2;\u0130\3\2\2\2=\u0132\3\2\2\2?\u0134"+
		"\3\2\2\2A\u0136\3\2\2\2C\u0138\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I"+
		"\u0141\3\2\2\2K\u0143\3\2\2\2M\u0145\3\2\2\2O\u014f\3\2\2\2Q\u0156\3\2"+
		"\2\2S\u015b\3\2\2\2U\u0164\3\2\2\2W\u016e\3\2\2\2Y\u0177\3\2\2\2[\u017d"+
		"\3\2\2\2]\u0181\3\2\2\2_\u0186\3\2\2\2a\u018c\3\2\2\2c\u0191\3\2\2\2e"+
		"\u0193\3\2\2\2g\u0196\3\2\2\2i\u0198\3\2\2\2k\u019a\3\2\2\2m\u019c\3\2"+
		"\2\2o\u019f\3\2\2\2q\u01a3\3\2\2\2s\u01a5\3\2\2\2u\u01a7\3\2\2\2w\u01a9"+
		"\3\2\2\2y\u01ab\3\2\2\2{\u01b2\3\2\2\2}\u01b7\3\2\2\2\177\u01be\3\2\2"+
		"\2\u0081\u01cb\3\2\2\2\u0083\u01d0\3\2\2\2\u0085\u01d9\3\2\2\2\u0087\u01e2"+
		"\3\2\2\2\u0089\u01eb\3\2\2\2\u008b\u01f5\3\2\2\2\u008d\u01fa\3\2\2\2\u008f"+
		"\u0206\3\2\2\2\u0091\u020a\3\2\2\2\u0093\u0212\3\2\2\2\u0095\u0219\3\2"+
		"\2\2\u0097\u021c\3\2\2\2\u0099\u0224\3\2\2\2\u009b\u0228\3\2\2\2\u009d"+
		"\u022a\3\2\2\2\u009f\u022f\3\2\2\2\u00a1\u0233\3\2\2\2\u00a3\u0238\3\2"+
		"\2\2\u00a5\u0240\3\2\2\2\u00a7\u0249\3\2\2\2\u00a9\u024b\3\2\2\2\u00ab"+
		"\u0251\3\2\2\2\u00ad\u0254\3\2\2\2\u00af\u025d\3\2\2\2\u00b1\u0267\3\2"+
		"\2\2\u00b3\u026e\3\2\2\2\u00b5\u0270\3\2\2\2\u00b7\u0274\3\2\2\2\u00b9"+
		"\u027b\3\2\2\2\u00bb\u0281\3\2\2\2\u00bd\u028a\3\2\2\2\u00bf\u028c\3\2"+
		"\2\2\u00c1\u0293\3\2\2\2\u00c3\u0297\3\2\2\2\u00c5\u029b\3\2\2\2\u00c7"+
		"\u02a1\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\b\2\2\2\u00cd\u00ce\b\2\3\2\u00ce\b\3\2\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6\n\3\2\2\2\u00d7"+
		"\u00d8\7X\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7F\2\2"+
		"\u00db\f\3\2\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7h"+
		"\2\2\u00df\16\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7p\2\2\u00e4\20\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7"+
		"\7q\2\2\u00e7\22\3\2\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7j\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7y\2\2\u00ee"+
		"\u00ef\7k\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\24\3\2\2\2\u00f2"+
		"\u00f3\7f\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7c\2\2"+
		"\u00f6\26\3\2\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7"+
		"e\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7n\2\2\u00fc\30\3\2\2\2\u00fd\u00fe"+
		"\7/\2\2\u00fe\u00ff\7@\2\2\u00ff\32\3\2\2\2\u0100\u0101\7#\2\2\u0101\34"+
		"\3\2\2\2\u0102\u0103\7&\2\2\u0103\36\3\2\2\2\u0104\u0105\7`\2\2\u0105"+
		" \3\2\2\2\u0106\u0107\7\u00a9\2\2\u0107\"\3\2\2\2\u0108\u0109\7(\2\2\u0109"+
		"$\3\2\2\2\u010a\u010b\7\61\2\2\u010b&\3\2\2\2\u010c\u010d\7<\2\2\u010d"+
		"(\3\2\2\2\u010e\u010f\7<\2\2\u010f\u0110\7<\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\5\u00a5Q\2\u0112*\3\2\2\2\u0113\u0114\7\60\2\2\u0114\u0115\5\u00a5"+
		"Q\2\u0115,\3\2\2\2\u0116\u0117\7=\2\2\u0117\u0118\6\25\2\2\u0118\u0119"+
		"\b\25\4\2\u0119\u011a\3\2\2\2\u011a\u011b\b\25\5\2\u011b.\3\2\2\2\u011c"+
		"\u011d\7=\2\2\u011d\60\3\2\2\2\u011e\u011f\7.\2\2\u011f\62\3\2\2\2\u0120"+
		"\u0121\7\60\2\2\u0121\u0122\7\60\2\2\u0122\u0123\7\60\2\2\u0123\64\3\2"+
		"\2\2\u0124\u0125\7\u0080\2\2\u0125\66\3\2\2\2\u0126\u0127\7*\2\2\u0127"+
		"\u0128\b\32\6\2\u0128\u0129\3\2\2\2\u0129\u012a\b\32\7\2\u012a8\3\2\2"+
		"\2\u012b\u012c\7+\2\2\u012c\u012d\6\33\3\2\u012d\u012e\3\2\2\2\u012e\u012f"+
		"\b\33\5\2\u012f:\3\2\2\2\u0130\u0131\7]\2\2\u0131<\3\2\2\2\u0132\u0133"+
		"\7_\2\2\u0133>\3\2\2\2\u0134\u0135\7}\2\2\u0135@\3\2\2\2\u0136\u0137\7"+
		"\177\2\2\u0137B\3\2\2\2\u0138\u0139\7]\2\2\u0139\u013a\7z\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\b \b\2\u013cD\3\2\2\2\u013d\u013e\7>\2\2\u013eF\3"+
		"\2\2\2\u013f\u0140\7$\2\2\u0140H\3\2\2\2\u0141\u0142\7^\2\2\u0142J\3\2"+
		"\2\2\u0143\u0144\7\u00b6\2\2\u0144L\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147"+
		"\7g\2\2\u0147\u0148\7o\2\2\u0148\u0149\7r\2\2\u0149\u014a\7n\2\2\u014a"+
		"\u014b\7c\2\2\u014b\u014c\7v\2\2\u014c\u014d\7g\2\2\u014d\u014e\7u\2\2"+
		"\u014eN\3\2\2\2\u014f\u0150\7u\2\2\u0150\u0151\7q\2\2\u0151\u0152\7w\2"+
		"\2\u0152\u0153\7t\2\2\u0153\u0154\7e\2\2\u0154\u0155\7g\2\2\u0155P\3\2"+
		"\2\2\u0156\u0157\7u\2\2\u0157\u0158\7k\2\2\u0158\u0159\7p\2\2\u0159\u015a"+
		"\7m\2\2\u015aR\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7q\2\2\u015d\u015e"+
		"\7o\2\2\u015e\u015f\7r\2\2\u015f\u0160\7q\2\2\u0160\u0161\7u\2\2\u0161"+
		"\u0162\7g\2\2\u0162\u0163\7t\2\2\u0163T\3\2\2\2\u0164\u0165\7r\2\2\u0165"+
		"\u0166\7t\2\2\u0166\u0167\7q\2\2\u0167\u0168\7e\2\2\u0168\u0169\7g\2\2"+
		"\u0169\u016a\7u\2\2\u016a\u016b\7u\2\2\u016b\u016c\7q\2\2\u016c\u016d"+
		"\7t\2\2\u016dV\3\2\2\2\u016e\u016f\7q\2\2\u016f\u0170\7r\2\2\u0170\u0171"+
		"\7g\2\2\u0171\u0172\7t\2\2\u0172\u0173\7c\2\2\u0173\u0174\7v\2\2\u0174"+
		"\u0175\7q\2\2\u0175\u0176\7t\2\2\u0176X\3\2\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7v\2\2\u0179\u017a\7c\2\2\u017a\u017b\7v\2\2\u017b\u017c\7g\2\2"+
		"\u017cZ\3\2\2\2\u017d\u017e\7g\2\2\u017e\u017f\7p\2\2\u017f\u0180\7f\2"+
		"\2\u0180\\\3\2\2\2\u0181\u0182\7t\2\2\u0182\u0183\7w\2\2\u0183\u0184\7"+
		"n\2\2\u0184\u0185\7g\2\2\u0185^\3\2\2\2\u0186\u0187\7h\2\2\u0187\u0188"+
		"\7k\2\2\u0188\u0189\7t\2\2\u0189\u018a\7u\2\2\u018a\u018b\7v\2\2\u018b"+
		"`\3\2\2\2\u018c\u018d\7n\2\2\u018d\u018e\7c\2\2\u018e\u018f\7u\2\2\u018f"+
		"\u0190\7v\2\2\u0190b\3\2\2\2\u0191\u0192\7%\2\2\u0192d\3\2\2\2\u0193\u0194"+
		"\7\60\2\2\u0194\u0195\7\60\2\2\u0195f\3\2\2\2\u0196\u0197\7-\2\2\u0197"+
		"h\3\2\2\2\u0198\u0199\7/\2\2\u0199j\3\2\2\2\u019a\u019b\7,\2\2\u019bl"+
		"\3\2\2\2\u019c\u019d\7\u0080\2\2\u019d\u019e\7\61\2\2\u019en\3\2\2\2\u019f"+
		"\u01a0\7o\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7f\2\2\u01a2p\3\2\2\2\u01a3"+
		"\u01a4\7A\2\2\u01a4r\3\2\2\2\u01a5\u01a6\7?\2\2\u01a6t\3\2\2\2\u01a7\u01a8"+
		"\7~\2\2\u01a8v\3\2\2\2\u01a9\u01aa\7@\2\2\u01aax\3\2\2\2\u01ab\u01ac\7"+
		"A\2\2\u01ac\u01ad\7*\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\b;\t\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\b;\7\2\u01b1z\3\2\2\2\u01b2\u01b3\7v\2\2\u01b3"+
		"\u01b4\7g\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7v\2\2\u01b6|\3\2\2\2\u01b7"+
		"\u01b8\7c\2\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7g\2\2"+
		"\u01bb\u01bc\7t\2\2\u01bc\u01bd\7v\2\2\u01bd~\3\2\2\2\u01be\u01bf\7e\2"+
		"\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3"+
		"\7/\2\2\u01c3\u01c4\7u\2\2\u01c4\u01c5\7{\2\2\u01c5\u01c6\7u\2\2\u01c6"+
		"\u01c7\7v\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7\61\2"+
		"\2\u01ca\u0080\3\2\2\2\u01cb\u01cc\7y\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce"+
		"\7v\2\2\u01ce\u01cf\7j\2\2\u01cf\u0082\3\2\2\2\u01d0\u01d1\7r\2\2\u01d1"+
		"\u01d2\7t\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7x\2\2\u01d4\u01d5\7k\2\2"+
		"\u01d5\u01d6\7f\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7f\2\2\u01d8\u0084"+
		"\3\2\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7f\2\2\u01dc"+
		"\u01dd\7k\2\2\u01dd\u01de\7h\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7g\2\2"+
		"\u01e0\u01e1\7f\2\2\u01e1\u0086\3\2\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4"+
		"\7j\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7f\2\2\u01e6\u01e7\7q\2\2\u01e7"+
		"\u01e8\7y\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7f\2\2\u01ea\u0088\3\2\2"+
		"\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7j\2\2\u01ee\u01ef"+
		"\7g\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7v\2\2\u01f2"+
		"\u01f3\7g\2\2\u01f3\u01f4\7f\2\2\u01f4\u008a\3\2\2\2\u01f5\u01f6\7h\2"+
		"\2\u01f6\u01f7\7t\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9\7o\2\2\u01f9\u008c"+
		"\3\2\2\2\u01fa\u01fb\7u\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7c\2\2\u01fd"+
		"\u01fe\7p\2\2\u01fe\u01ff\7f\2\2\u01ff\u0200\7/\2\2\u0200\u0201\7c\2\2"+
		"\u0201\u0202\7n\2\2\u0202\u0203\7q\2\2\u0203\u0204\7p\2\2\u0204\u0205"+
		"\7g\2\2\u0205\u008e\3\2\2\2\u0206\u0207\7w\2\2\u0207\u0208\7u\2\2\u0208"+
		"\u0209\7g\2\2\u0209\u0090\3\2\2\2\u020a\u020b\7r\2\2\u020b\u020c\7t\2"+
		"\2\u020c\u020d\7q\2\2\u020d\u020e\7i\2\2\u020e\u020f\7t\2\2\u020f\u0210"+
		"\7c\2\2\u0210\u0211\7o\2\2\u0211\u0092\3\2\2\2\u0212\u0213\7o\2\2\u0213"+
		"\u0214\7q\2\2\u0214\u0215\7f\2\2\u0215\u0216\7k\2\2\u0216\u0217\7h\2\2"+
		"\u0217\u0218\7{\2\2\u0218\u0094\3\2\2\2\u0219\u021a\7d\2\2\u021a\u021b"+
		"\7{\2\2\u021b\u0096\3\2\2\2\u021c\u021d\7e\2\2\u021d\u021e\7q\2\2\u021e"+
		"\u021f\7n\2\2\u021f\u0220\7n\2\2\u0220\u0221\7g\2\2\u0221\u0222\7e\2\2"+
		"\u0222\u0223\7v\2\2\u0223\u0098\3\2\2\2\u0224\u0225\7$\2\2\u0225\u0226"+
		"\7\63\2\2\u0226\u0227\7$\2\2\u0227\u009a\3\2\2\2\u0228\u0229\7\62\2\2"+
		"\u0229\u009c\3\2\2\2\u022a\u022c\t\2\2\2\u022b\u022d\5\u009fN\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u009e\3\2\2\2\u022e\u0230\t\3"+
		"\2\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u00a0\3\2\2\2\u0233\u0234\7)\2\2\u0234\u0235\bO\n"+
		"\2\u0235\u0236\3\2\2\2\u0236\u0237\bO\13\2\u0237\u00a2\3\2\2\2\u0238\u023c"+
		"\7B\2\2\u0239\u023b\5\u00abT\2\u023a\u0239\3\2\2\2\u023b\u023e\3\2\2\2"+
		"\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u00a4\3\2\2\2\u023e\u023c"+
		"\3\2\2\2\u023f\u0241\5\u00a7R\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2"+
		"\2\u0241\u0242\3\2\2\2\u0242\u0246\5\u00a9S\2\u0243\u0245\5\u00abT\2\u0244"+
		"\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u00a6\3\2\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7,\2\2\u024a"+
		"\u00a8\3\2\2\2\u024b\u024c\t\4\2\2\u024c\u00aa\3\2\2\2\u024d\u0252\5\u00a9"+
		"S\2\u024e\u0252\t\5\2\2\u024f\u0250\7/\2\2\u0250\u0252\t\4\2\2\u0251\u024d"+
		"\3\2\2\2\u0251\u024e\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u00ac\3\2\2\2\u0253"+
		"\u0255\t\6\2\2\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\bU\2\2\u0259"+
		"\u00ae\3\2\2\2\u025a\u025c\n\7\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2"+
		"\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0262\t\b\2\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0264\bV\2\2\u0264\u0265\bV\5\2\u0265\u00b0\3\2\2\2\u0266\u0268"+
		"\5\u00b3X\2\u0267\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2\2"+
		"\2\u0269\u026a\3\2\2\2\u026a\u00b2\3\2\2\2\u026b\u026c\7)\2\2\u026c\u026f"+
		"\7)\2\2\u026d\u026f\n\t\2\2\u026e\u026b\3\2\2\2\u026e\u026d\3\2\2\2\u026f"+
		"\u00b4\3\2\2\2\u0270\u0271\7)\2\2\u0271\u0272\3\2\2\2\u0272\u0273\bY\5"+
		"\2\u0273\u00b6\3\2\2\2\u0274\u0275\7&\2\2\u0275\u0276\7%\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u0278\bZ\f\2\u0278\u0279\3\2\2\2\u0279\u027a\bZ\7\2\u027a"+
		"\u00b8\3\2\2\2\u027b\u027c\7&\2\2\u027c\u027d\b[\r\2\u027d\u027e\3\2\2"+
		"\2\u027e\u027f\b[\7\2\u027f\u00ba\3\2\2\2\u0280\u0282\5\u00bd]\2\u0281"+
		"\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u00bc\3\2\2\2\u0285\u0286\7)\2\2\u0286\u028b\7)\2\2\u0287\u0288"+
		"\7&\2\2\u0288\u028b\7&\2\2\u0289\u028b\n\n\2\2\u028a\u0285\3\2\2\2\u028a"+
		"\u0287\3\2\2\2\u028a\u0289\3\2\2\2\u028b\u00be\3\2\2\2\u028c\u028d\7)"+
		"\2\2\u028d\u028e\6^\4\2\u028e\u028f\3\2\2\2\u028f\u0290\b^\5\2\u0290\u00c0"+
		"\3\2\2\2\u0291\u0292\t\13\2\2\u0292\u0294\t\13\2\2\u0293\u0291\3\2\2\2"+
		"\u0294\u0295\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u00c2"+
		"\3\2\2\2\u0297\u0298\5\u00adU\2\u0298\u0299\3\2\2\2\u0299\u029a\b`\2\2"+
		"\u029a\u00c4\3\2\2\2\u029b\u029c\5\67\32\2\u029c\u029d\ba\16\2\u029d\u029e"+
		"\3\2\2\2\u029e\u029f\ba\17\2\u029f\u02a0\ba\7\2\u02a0\u00c6\3\2\2\2\u02a1"+
		"\u02a2\7z\2\2\u02a2\u02a3\7_\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\bb\5"+
		"\2\u02a5\u00c8\3\2\2\2\25\2\3\4\5\6\u022c\u0231\u023c\u0240\u0246\u0251"+
		"\u0256\u025d\u0261\u0269\u026e\u0283\u028a\u0295\20\b\2\2\7\3\2\3\25\2"+
		"\6\2\2\3\32\3\7\2\2\7\6\2\3;\4\3O\5\7\5\2\3Z\6\3[\7\3a\b\t\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}