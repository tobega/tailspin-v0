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
		RightBrace=30, StartBytes=31, StartMatcher=32, Quote=33, Lambda=34, StartTemplatesDefinition=35, 
		StartSourceDefinition=36, StartSinkDefinition=37, StartComposerDefinition=38, 
		StartProcessorDefinition=39, StartOperatorDefinition=40, StartStateDefinition=41, 
		EndDefinition=42, Rule=43, First=44, Last=45, TemplateMatch=46, Range=47, 
		Plus=48, Minus=49, Star=50, TruncateDivide=51, Mod=52, Question=53, Equal=54, 
		Else=55, EndMatcher=56, BeginCondition=57, StartTestDefinition=58, Assert=59, 
		CoreSystem=60, With=61, Provided=62, Modified=63, Shadowed=64, Inherited=65, 
		From=66, StandAlone=67, Use=68, Program=69, Modify=70, By=71, Collect=72, 
		Scalar=73, Zero=74, PositiveInteger=75, START_STRING=76, STATE_IDENTIFIER=77, 
		IDENTIFIER=78, WS=79, Comment=80, REGEX_TEXT=81, END_REGEX=82, StartCharacterCode=83, 
		StartStringInterpolate=84, STRING_TEXT=85, END_STRING=86, Bytes=87, Bytes_WS=88, 
		EndBytes=89;
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
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", 
			"StartSourceDefinition", "StartSinkDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "StartOperatorDefinition", "StartStateDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Program", "Modify", "By", "Collect", "Scalar", "Zero", "PositiveInteger", 
			"Digits", "START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "SUPER_IDENTIFIER", 
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
			"'data'", "'local'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", 
			"'/'", "':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, 
			"'['", "']'", "'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'templates'", 
			"'source'", "'sink'", "'composer'", "'processor'", "'operator'", "'state'", 
			"'end'", "'rule'", "'first'", "'last'", "'#'", "'..'", "'+'", "'-'", 
			"'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", 
			"'core-system/'", "'with'", "'provided'", "'modified'", "'shadowed'", 
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
			"RightBrace", "StartBytes", "StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", 
			"StartSourceDefinition", "StartSinkDefinition", "StartComposerDefinition", 
			"StartProcessorDefinition", "StartOperatorDefinition", "StartStateDefinition", 
			"EndDefinition", "Rule", "First", "Last", "TemplateMatch", "Range", "Plus", 
			"Minus", "Star", "TruncateDivide", "Mod", "Question", "Equal", "Else", 
			"EndMatcher", "BeginCondition", "StartTestDefinition", "Assert", "CoreSystem", 
			"With", "Provided", "Modified", "Shadowed", "Inherited", "From", "StandAlone", 
			"Use", "Program", "Modify", "By", "Collect", "Scalar", "Zero", "PositiveInteger", 
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
		case 19:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			LeftParen_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 76:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 88:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 94:
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
		case 91:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u02a2\b\1\b\1\b"+
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
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\5L\u0229\nL\3M"+
		"\6M\u022c\nM\rM\16M\u022d\3N\3N\3N\3N\3N\3O\3O\7O\u0237\nO\fO\16O\u023a"+
		"\13O\3P\5P\u023d\nP\3P\3P\7P\u0241\nP\fP\16P\u0244\13P\3Q\3Q\3R\3R\3S"+
		"\3S\3S\3S\5S\u024e\nS\3T\6T\u0251\nT\rT\16T\u0252\3T\3T\3U\7U\u0258\n"+
		"U\fU\16U\u025b\13U\3U\5U\u025e\nU\3U\3U\3U\3V\6V\u0264\nV\rV\16V\u0265"+
		"\3W\3W\3W\5W\u026b\nW\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z"+
		"\3[\6[\u027e\n[\r[\16[\u027f\3\\\3\\\3\\\3\\\3\\\5\\\u0287\n\\\3]\3]\3"+
		"]\3]\3]\3^\3^\6^\u0290\n^\r^\16^\u0291\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3"+
		"a\3a\3a\3a\3a\2\2b\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33"+
		"\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64"+
		"k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008b"+
		"E\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099L\u009bM\u009d\2\u009f"+
		"N\u00a1O\u00a3P\u00a5\2\u00a7\2\u00a9\2\u00abQ\u00adR\u00afS\u00b1\2\u00b3"+
		"T\u00b5U\u00b7V\u00b9W\u00bb\2\u00bdX\u00bfY\u00c1Z\u00c3\2\u00c5[\7\2"+
		"\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f"+
		"\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u02a6\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2"+
		"\2\4\u00af\3\2\2\2\4\u00b3\3\2\2\2\5\u00b5\3\2\2\2\5\u00b7\3\2\2\2\5\u00b9"+
		"\3\2\2\2\5\u00bd\3\2\2\2\6\u00bf\3\2\2\2\6\u00c1\3\2\2\2\6\u00c3\3\2\2"+
		"\2\6\u00c5\3\2\2\2\7\u00c7\3\2\2\2\t\u00cd\3\2\2\2\13\u00d5\3\2\2\2\r"+
		"\u00da\3\2\2\2\17\u00de\3\2\2\2\21\u00e3\3\2\2\2\23\u00e6\3\2\2\2\25\u00f0"+
		"\3\2\2\2\27\u00f5\3\2\2\2\31\u00fb\3\2\2\2\33\u00fe\3\2\2\2\35\u0100\3"+
		"\2\2\2\37\u0102\3\2\2\2!\u0104\3\2\2\2#\u0106\3\2\2\2%\u0108\3\2\2\2\'"+
		"\u010a\3\2\2\2)\u010c\3\2\2\2+\u0111\3\2\2\2-\u0114\3\2\2\2/\u011a\3\2"+
		"\2\2\61\u011c\3\2\2\2\63\u011e\3\2\2\2\65\u0122\3\2\2\2\67\u0124\3\2\2"+
		"\29\u0129\3\2\2\2;\u012e\3\2\2\2=\u0130\3\2\2\2?\u0132\3\2\2\2A\u0134"+
		"\3\2\2\2C\u0136\3\2\2\2E\u013b\3\2\2\2G\u013d\3\2\2\2I\u013f\3\2\2\2K"+
		"\u0141\3\2\2\2M\u014b\3\2\2\2O\u0152\3\2\2\2Q\u0157\3\2\2\2S\u0160\3\2"+
		"\2\2U\u016a\3\2\2\2W\u0173\3\2\2\2Y\u0179\3\2\2\2[\u017d\3\2\2\2]\u0182"+
		"\3\2\2\2_\u0188\3\2\2\2a\u018d\3\2\2\2c\u018f\3\2\2\2e\u0192\3\2\2\2g"+
		"\u0194\3\2\2\2i\u0196\3\2\2\2k\u0198\3\2\2\2m\u019b\3\2\2\2o\u019f\3\2"+
		"\2\2q\u01a1\3\2\2\2s\u01a3\3\2\2\2u\u01a5\3\2\2\2w\u01a7\3\2\2\2y\u01ae"+
		"\3\2\2\2{\u01b3\3\2\2\2}\u01ba\3\2\2\2\177\u01c7\3\2\2\2\u0081\u01cc\3"+
		"\2\2\2\u0083\u01d5\3\2\2\2\u0085\u01de\3\2\2\2\u0087\u01e7\3\2\2\2\u0089"+
		"\u01f1\3\2\2\2\u008b\u01f6\3\2\2\2\u008d\u0202\3\2\2\2\u008f\u0206\3\2"+
		"\2\2\u0091\u020e\3\2\2\2\u0093\u0215\3\2\2\2\u0095\u0218\3\2\2\2\u0097"+
		"\u0220\3\2\2\2\u0099\u0224\3\2\2\2\u009b\u0226\3\2\2\2\u009d\u022b\3\2"+
		"\2\2\u009f\u022f\3\2\2\2\u00a1\u0234\3\2\2\2\u00a3\u023c\3\2\2\2\u00a5"+
		"\u0245\3\2\2\2\u00a7\u0247\3\2\2\2\u00a9\u024d\3\2\2\2\u00ab\u0250\3\2"+
		"\2\2\u00ad\u0259\3\2\2\2\u00af\u0263\3\2\2\2\u00b1\u026a\3\2\2\2\u00b3"+
		"\u026c\3\2\2\2\u00b5\u0270\3\2\2\2\u00b7\u0277\3\2\2\2\u00b9\u027d\3\2"+
		"\2\2\u00bb\u0286\3\2\2\2\u00bd\u0288\3\2\2\2\u00bf\u028f\3\2\2\2\u00c1"+
		"\u0293\3\2\2\2\u00c3\u0297\3\2\2\2\u00c5\u029d\3\2\2\2\u00c7\u00c8\7\61"+
		"\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\2\2\2\u00cb"+
		"\u00cc\b\2\3\2\u00cc\b\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7e\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7f\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4\n\3\2\2\2\u00d5\u00d6\7X\2\2\u00d6\u00d7\7Q"+
		"\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7F\2\2\u00d9\f\3\2\2\2\u00da\u00db"+
		"\7f\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\16\3\2\2\2\u00de\u00df"+
		"\7y\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"\20\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7q\2\2\u00e5\22\3\2\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7t\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee"+
		"\7u\2\2\u00ee\u00ef\7g\2\2\u00ef\24\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2"+
		"\7c\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7c\2\2\u00f4\26\3\2\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7n\2\2\u00fa\30\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\7@\2\2\u00fd"+
		"\32\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff\34\3\2\2\2\u0100\u0101\7&\2\2\u0101"+
		"\36\3\2\2\2\u0102\u0103\7`\2\2\u0103 \3\2\2\2\u0104\u0105\7\u00a9\2\2"+
		"\u0105\"\3\2\2\2\u0106\u0107\7(\2\2\u0107$\3\2\2\2\u0108\u0109\7\61\2"+
		"\2\u0109&\3\2\2\2\u010a\u010b\7<\2\2\u010b(\3\2\2\2\u010c\u010d\7<\2\2"+
		"\u010d\u010e\7<\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5\u00a3P\2\u0110*"+
		"\3\2\2\2\u0111\u0112\7\60\2\2\u0112\u0113\5\u00a3P\2\u0113,\3\2\2\2\u0114"+
		"\u0115\7=\2\2\u0115\u0116\6\25\2\2\u0116\u0117\b\25\4\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\b\25\5\2\u0119.\3\2\2\2\u011a\u011b\7=\2\2\u011b\60"+
		"\3\2\2\2\u011c\u011d\7.\2\2\u011d\62\3\2\2\2\u011e\u011f\7\60\2\2\u011f"+
		"\u0120\7\60\2\2\u0120\u0121\7\60\2\2\u0121\64\3\2\2\2\u0122\u0123\7\u0080"+
		"\2\2\u0123\66\3\2\2\2\u0124\u0125\7*\2\2\u0125\u0126\b\32\6\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\b\32\7\2\u01288\3\2\2\2\u0129\u012a\7+\2\2\u012a"+
		"\u012b\6\33\3\2\u012b\u012c\3\2\2\2\u012c\u012d\b\33\5\2\u012d:\3\2\2"+
		"\2\u012e\u012f\7]\2\2\u012f<\3\2\2\2\u0130\u0131\7_\2\2\u0131>\3\2\2\2"+
		"\u0132\u0133\7}\2\2\u0133@\3\2\2\2\u0134\u0135\7\177\2\2\u0135B\3\2\2"+
		"\2\u0136\u0137\7]\2\2\u0137\u0138\7z\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\b \b\2\u013aD\3\2\2\2\u013b\u013c\7>\2\2\u013cF\3\2\2\2\u013d\u013e\7"+
		"$\2\2\u013eH\3\2\2\2\u013f\u0140\7^\2\2\u0140J\3\2\2\2\u0141\u0142\7v"+
		"\2\2\u0142\u0143\7g\2\2\u0143\u0144\7o\2\2\u0144\u0145\7r\2\2\u0145\u0146"+
		"\7n\2\2\u0146\u0147\7c\2\2\u0147\u0148\7v\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7u\2\2\u014aL\3\2\2\2\u014b\u014c\7u\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7w\2\2\u014e\u014f\7t\2\2\u014f\u0150\7e\2\2\u0150\u0151\7g\2\2"+
		"\u0151N\3\2\2\2\u0152\u0153\7u\2\2\u0153\u0154\7k\2\2\u0154\u0155\7p\2"+
		"\2\u0155\u0156\7m\2\2\u0156P\3\2\2\2\u0157\u0158\7e\2\2\u0158\u0159\7"+
		"q\2\2\u0159\u015a\7o\2\2\u015a\u015b\7r\2\2\u015b\u015c\7q\2\2\u015c\u015d"+
		"\7u\2\2\u015d\u015e\7g\2\2\u015e\u015f\7t\2\2\u015fR\3\2\2\2\u0160\u0161"+
		"\7r\2\2\u0161\u0162\7t\2\2\u0162\u0163\7q\2\2\u0163\u0164\7e\2\2\u0164"+
		"\u0165\7g\2\2\u0165\u0166\7u\2\2\u0166\u0167\7u\2\2\u0167\u0168\7q\2\2"+
		"\u0168\u0169\7t\2\2\u0169T\3\2\2\2\u016a\u016b\7q\2\2\u016b\u016c\7r\2"+
		"\2\u016c\u016d\7g\2\2\u016d\u016e\7t\2\2\u016e\u016f\7c\2\2\u016f\u0170"+
		"\7v\2\2\u0170\u0171\7q\2\2\u0171\u0172\7t\2\2\u0172V\3\2\2\2\u0173\u0174"+
		"\7u\2\2\u0174\u0175\7v\2\2\u0175\u0176\7c\2\2\u0176\u0177\7v\2\2\u0177"+
		"\u0178\7g\2\2\u0178X\3\2\2\2\u0179\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b"+
		"\u017c\7f\2\2\u017cZ\3\2\2\2\u017d\u017e\7t\2\2\u017e\u017f\7w\2\2\u017f"+
		"\u0180\7n\2\2\u0180\u0181\7g\2\2\u0181\\\3\2\2\2\u0182\u0183\7h\2\2\u0183"+
		"\u0184\7k\2\2\u0184\u0185\7t\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2"+
		"\u0187^\3\2\2\2\u0188\u0189\7n\2\2\u0189\u018a\7c\2\2\u018a\u018b\7u\2"+
		"\2\u018b\u018c\7v\2\2\u018c`\3\2\2\2\u018d\u018e\7%\2\2\u018eb\3\2\2\2"+
		"\u018f\u0190\7\60\2\2\u0190\u0191\7\60\2\2\u0191d\3\2\2\2\u0192\u0193"+
		"\7-\2\2\u0193f\3\2\2\2\u0194\u0195\7/\2\2\u0195h\3\2\2\2\u0196\u0197\7"+
		",\2\2\u0197j\3\2\2\2\u0198\u0199\7\u0080\2\2\u0199\u019a\7\61\2\2\u019a"+
		"l\3\2\2\2\u019b\u019c\7o\2\2\u019c\u019d\7q\2\2\u019d\u019e\7f\2\2\u019e"+
		"n\3\2\2\2\u019f\u01a0\7A\2\2\u01a0p\3\2\2\2\u01a1\u01a2\7?\2\2\u01a2r"+
		"\3\2\2\2\u01a3\u01a4\7~\2\2\u01a4t\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6v\3"+
		"\2\2\2\u01a7\u01a8\7A\2\2\u01a8\u01a9\7*\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\b:\t\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\b:\7\2\u01adx\3\2\2\2\u01ae"+
		"\u01af\7v\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7v\2\2"+
		"\u01b2z\3\2\2\2\u01b3\u01b4\7c\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7u\2"+
		"\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7v\2\2\u01b9|\3\2"+
		"\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be"+
		"\7g\2\2\u01be\u01bf\7/\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7{\2\2\u01c1"+
		"\u01c2\7u\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7o\2\2"+
		"\u01c5\u01c6\7\61\2\2\u01c6~\3\2\2\2\u01c7\u01c8\7y\2\2\u01c8\u01c9\7"+
		"k\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7j\2\2\u01cb\u0080\3\2\2\2\u01cc"+
		"\u01cd\7r\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0\7x\2\2"+
		"\u01d0\u01d1\7k\2\2\u01d1\u01d2\7f\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4"+
		"\7f\2\2\u01d4\u0082\3\2\2\2\u01d5\u01d6\7o\2\2\u01d6\u01d7\7q\2\2\u01d7"+
		"\u01d8\7f\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7h\2\2\u01da\u01db\7k\2\2"+
		"\u01db\u01dc\7g\2\2\u01dc\u01dd\7f\2\2\u01dd\u0084\3\2\2\2\u01de\u01df"+
		"\7u\2\2\u01df\u01e0\7j\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e2\7f\2\2\u01e2"+
		"\u01e3\7q\2\2\u01e3\u01e4\7y\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7f\2\2"+
		"\u01e6\u0086\3\2\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea"+
		"\7j\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\7k\2\2\u01ed"+
		"\u01ee\7v\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7f\2\2\u01f0\u0088\3\2\2"+
		"\2\u01f1\u01f2\7h\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7q\2\2\u01f4\u01f5"+
		"\7o\2\2\u01f5\u008a\3\2\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7v\2\2\u01f8"+
		"\u01f9\7c\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7/\2\2"+
		"\u01fc\u01fd\7c\2\2\u01fd\u01fe\7n\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200"+
		"\7p\2\2\u0200\u0201\7g\2\2\u0201\u008c\3\2\2\2\u0202\u0203\7w\2\2\u0203"+
		"\u0204\7u\2\2\u0204\u0205\7g\2\2\u0205\u008e\3\2\2\2\u0206\u0207\7r\2"+
		"\2\u0207\u0208\7t\2\2\u0208\u0209\7q\2\2\u0209\u020a\7i\2\2\u020a\u020b"+
		"\7t\2\2\u020b\u020c\7c\2\2\u020c\u020d\7o\2\2\u020d\u0090\3\2\2\2\u020e"+
		"\u020f\7o\2\2\u020f\u0210\7q\2\2\u0210\u0211\7f\2\2\u0211\u0212\7k\2\2"+
		"\u0212\u0213\7h\2\2\u0213\u0214\7{\2\2\u0214\u0092\3\2\2\2\u0215\u0216"+
		"\7d\2\2\u0216\u0217\7{\2\2\u0217\u0094\3\2\2\2\u0218\u0219\7e\2\2\u0219"+
		"\u021a\7q\2\2\u021a\u021b\7n\2\2\u021b\u021c\7n\2\2\u021c\u021d\7g\2\2"+
		"\u021d\u021e\7e\2\2\u021e\u021f\7v\2\2\u021f\u0096\3\2\2\2\u0220\u0221"+
		"\7$\2\2\u0221\u0222\7\63\2\2\u0222\u0223\7$\2\2\u0223\u0098\3\2\2\2\u0224"+
		"\u0225\7\62\2\2\u0225\u009a\3\2\2\2\u0226\u0228\t\2\2\2\u0227\u0229\5"+
		"\u009dM\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u009c\3\2\2\2"+
		"\u022a\u022c\t\3\2\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u009e\3\2\2\2\u022f\u0230\7)\2\2\u0230"+
		"\u0231\bN\n\2\u0231\u0232\3\2\2\2\u0232\u0233\bN\13\2\u0233\u00a0\3\2"+
		"\2\2\u0234\u0238\7B\2\2\u0235\u0237\5\u00a9S\2\u0236\u0235\3\2\2\2\u0237"+
		"\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u00a2\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023b\u023d\5\u00a5Q\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0242\5\u00a7R\2\u023f\u0241"+
		"\5\u00a9S\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2"+
		"\2\u0242\u0243\3\2\2\2\u0243\u00a4\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246"+
		"\7,\2\2\u0246\u00a6\3\2\2\2\u0247\u0248\t\4\2\2\u0248\u00a8\3\2\2\2\u0249"+
		"\u024e\5\u00a7R\2\u024a\u024e\t\5\2\2\u024b\u024c\7/\2\2\u024c\u024e\t"+
		"\4\2\2\u024d\u0249\3\2\2\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u00aa\3\2\2\2\u024f\u0251\t\6\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0255\bT\2\2\u0255\u00ac\3\2\2\2\u0256\u0258\n\7\2\2\u0257\u0256\3\2"+
		"\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e\t\b\2\2\u025d\u025c\3\2"+
		"\2\2\u025e\u025f\3\2\2\2\u025f\u0260\bU\2\2\u0260\u0261\bU\5\2\u0261\u00ae"+
		"\3\2\2\2\u0262\u0264\5\u00b1W\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2"+
		"\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u00b0\3\2\2\2\u0267\u0268"+
		"\7)\2\2\u0268\u026b\7)\2\2\u0269\u026b\n\t\2\2\u026a\u0267\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026b\u00b2\3\2\2\2\u026c\u026d\7)\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026f\bX\5\2\u026f\u00b4\3\2\2\2\u0270\u0271\7&\2\2\u0271\u0272"+
		"\7%\2\2\u0272\u0273\3\2\2\2\u0273\u0274\bY\f\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0276\bY\7\2\u0276\u00b6\3\2\2\2\u0277\u0278\7&\2\2\u0278\u0279\bZ\r"+
		"\2\u0279\u027a\3\2\2\2\u027a\u027b\bZ\7\2\u027b\u00b8\3\2\2\2\u027c\u027e"+
		"\5\u00bb\\\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u00ba\3\2\2\2\u0281\u0282\7)\2\2\u0282\u0287"+
		"\7)\2\2\u0283\u0284\7&\2\2\u0284\u0287\7&\2\2\u0285\u0287\n\n\2\2\u0286"+
		"\u0281\3\2\2\2\u0286\u0283\3\2\2\2\u0286\u0285\3\2\2\2\u0287\u00bc\3\2"+
		"\2\2\u0288\u0289\7)\2\2\u0289\u028a\6]\4\2\u028a\u028b\3\2\2\2\u028b\u028c"+
		"\b]\5\2\u028c\u00be\3\2\2\2\u028d\u028e\t\13\2\2\u028e\u0290\t\13\2\2"+
		"\u028f\u028d\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u00c0\3\2\2\2\u0293\u0294\5\u00abT\2\u0294\u0295\3\2\2"+
		"\2\u0295\u0296\b_\2\2\u0296\u00c2\3\2\2\2\u0297\u0298\5\67\32\2\u0298"+
		"\u0299\b`\16\2\u0299\u029a\3\2\2\2\u029a\u029b\b`\17\2\u029b\u029c\b`"+
		"\7\2\u029c\u00c4\3\2\2\2\u029d\u029e\7z\2\2\u029e\u029f\7_\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u02a1\ba\5\2\u02a1\u00c6\3\2\2\2\25\2\3\4\5\6\u0228\u022d"+
		"\u0238\u023c\u0242\u024d\u0252\u0259\u025d\u0265\u026a\u027f\u0286\u0291"+
		"\20\b\2\2\7\3\2\3\25\2\6\2\2\3\32\3\7\2\2\7\6\2\3:\4\3N\5\7\5\2\3Y\6\3"+
		"Z\7\3`\b\t\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}