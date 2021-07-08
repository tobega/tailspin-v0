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
		case 86:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 93:
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
		case 90:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u029b\b\1\b\1\b"+
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
		"\t]\4^\t^\4_\t_\4`\t`\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\5L\u0227\nL\3M\6M\u022a"+
		"\nM\rM\16M\u022b\3N\3N\3N\3N\3N\3O\3O\7O\u0235\nO\fO\16O\u0238\13O\3P"+
		"\3P\7P\u023c\nP\fP\16P\u023f\13P\3Q\3Q\3R\3R\3R\3R\5R\u0247\nR\3S\6S\u024a"+
		"\nS\rS\16S\u024b\3S\3S\3T\7T\u0251\nT\fT\16T\u0254\13T\3T\5T\u0257\nT"+
		"\3T\3T\3T\3U\6U\u025d\nU\rU\16U\u025e\3V\3V\3V\5V\u0264\nV\3W\3W\3W\3"+
		"W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\6Z\u0277\nZ\rZ\16Z\u0278\3[\3"+
		"[\3[\3[\3[\5[\u0280\n[\3\\\3\\\3\\\3\\\3\\\3]\3]\6]\u0289\n]\r]\16]\u028a"+
		"\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\2\2a\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25"+
		"-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S"+
		")U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081"+
		"@\u0083A\u0085B\u0087C\u0089D\u008bE\u008dF\u008fG\u0091H\u0093I\u0095"+
		"J\u0097K\u0099L\u009bM\u009d\2\u009fN\u00a1O\u00a3P\u00a5\2\u00a7\2\u00a9"+
		"Q\u00abR\u00adS\u00af\2\u00b1T\u00b3U\u00b5V\u00b7W\u00b9\2\u00bbX\u00bd"+
		"Y\u00bfZ\u00c1\2\u00c3[\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62"+
		";aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u029f"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a9"+
		"\3\2\2\2\3\u00ab\3\2\2\2\4\u00ad\3\2\2\2\4\u00b1\3\2\2\2\5\u00b3\3\2\2"+
		"\2\5\u00b5\3\2\2\2\5\u00b7\3\2\2\2\5\u00bb\3\2\2\2\6\u00bd\3\2\2\2\6\u00bf"+
		"\3\2\2\2\6\u00c1\3\2\2\2\6\u00c3\3\2\2\2\7\u00c5\3\2\2\2\t\u00cb\3\2\2"+
		"\2\13\u00d3\3\2\2\2\r\u00d8\3\2\2\2\17\u00dc\3\2\2\2\21\u00e1\3\2\2\2"+
		"\23\u00e4\3\2\2\2\25\u00ee\3\2\2\2\27\u00f3\3\2\2\2\31\u00f9\3\2\2\2\33"+
		"\u00fc\3\2\2\2\35\u00fe\3\2\2\2\37\u0100\3\2\2\2!\u0102\3\2\2\2#\u0104"+
		"\3\2\2\2%\u0106\3\2\2\2\'\u0108\3\2\2\2)\u010a\3\2\2\2+\u010f\3\2\2\2"+
		"-\u0112\3\2\2\2/\u0118\3\2\2\2\61\u011a\3\2\2\2\63\u011c\3\2\2\2\65\u0120"+
		"\3\2\2\2\67\u0122\3\2\2\29\u0127\3\2\2\2;\u012c\3\2\2\2=\u012e\3\2\2\2"+
		"?\u0130\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0139\3\2\2\2G\u013b\3"+
		"\2\2\2I\u013d\3\2\2\2K\u013f\3\2\2\2M\u0149\3\2\2\2O\u0150\3\2\2\2Q\u0155"+
		"\3\2\2\2S\u015e\3\2\2\2U\u0168\3\2\2\2W\u0171\3\2\2\2Y\u0177\3\2\2\2["+
		"\u017b\3\2\2\2]\u0180\3\2\2\2_\u0186\3\2\2\2a\u018b\3\2\2\2c\u018d\3\2"+
		"\2\2e\u0190\3\2\2\2g\u0192\3\2\2\2i\u0194\3\2\2\2k\u0196\3\2\2\2m\u0199"+
		"\3\2\2\2o\u019d\3\2\2\2q\u019f\3\2\2\2s\u01a1\3\2\2\2u\u01a3\3\2\2\2w"+
		"\u01a5\3\2\2\2y\u01ac\3\2\2\2{\u01b1\3\2\2\2}\u01b8\3\2\2\2\177\u01c5"+
		"\3\2\2\2\u0081\u01ca\3\2\2\2\u0083\u01d3\3\2\2\2\u0085\u01dc\3\2\2\2\u0087"+
		"\u01e5\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01f4\3\2\2\2\u008d\u0200\3\2"+
		"\2\2\u008f\u0204\3\2\2\2\u0091\u020c\3\2\2\2\u0093\u0213\3\2\2\2\u0095"+
		"\u0216\3\2\2\2\u0097\u021e\3\2\2\2\u0099\u0222\3\2\2\2\u009b\u0224\3\2"+
		"\2\2\u009d\u0229\3\2\2\2\u009f\u022d\3\2\2\2\u00a1\u0232\3\2\2\2\u00a3"+
		"\u0239\3\2\2\2\u00a5\u0240\3\2\2\2\u00a7\u0246\3\2\2\2\u00a9\u0249\3\2"+
		"\2\2\u00ab\u0252\3\2\2\2\u00ad\u025c\3\2\2\2\u00af\u0263\3\2\2\2\u00b1"+
		"\u0265\3\2\2\2\u00b3\u0269\3\2\2\2\u00b5\u0270\3\2\2\2\u00b7\u0276\3\2"+
		"\2\2\u00b9\u027f\3\2\2\2\u00bb\u0281\3\2\2\2\u00bd\u0288\3\2\2\2\u00bf"+
		"\u028c\3\2\2\2\u00c1\u0290\3\2\2\2\u00c3\u0296\3\2\2\2\u00c5\u00c6\7\61"+
		"\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\2\2\2\u00c9"+
		"\u00ca\b\2\3\2\u00ca\b\3\2\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7f\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2\n\3\2\2\2\u00d3\u00d4\7X\2\2\u00d4\u00d5\7Q"+
		"\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7F\2\2\u00d7\f\3\2\2\2\u00d8\u00d9"+
		"\7f\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7h\2\2\u00db\16\3\2\2\2\u00dc\u00dd"+
		"\7y\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\20\3\2\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e3\7q\2\2\u00e3\22\3\2\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec"+
		"\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\24\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0"+
		"\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7c\2\2\u00f2\26\3\2\2\2\u00f3\u00f4"+
		"\7n\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\30\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7@\2\2\u00fb"+
		"\32\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\34\3\2\2\2\u00fe\u00ff\7&\2\2\u00ff"+
		"\36\3\2\2\2\u0100\u0101\7`\2\2\u0101 \3\2\2\2\u0102\u0103\7\u00a9\2\2"+
		"\u0103\"\3\2\2\2\u0104\u0105\7(\2\2\u0105$\3\2\2\2\u0106\u0107\7\61\2"+
		"\2\u0107&\3\2\2\2\u0108\u0109\7<\2\2\u0109(\3\2\2\2\u010a\u010b\7<\2\2"+
		"\u010b\u010c\7<\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\u00a3P\2\u010e*"+
		"\3\2\2\2\u010f\u0110\7\60\2\2\u0110\u0111\5\u00a3P\2\u0111,\3\2\2\2\u0112"+
		"\u0113\7=\2\2\u0113\u0114\6\25\2\2\u0114\u0115\b\25\4\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0117\b\25\5\2\u0117.\3\2\2\2\u0118\u0119\7=\2\2\u0119\60"+
		"\3\2\2\2\u011a\u011b\7.\2\2\u011b\62\3\2\2\2\u011c\u011d\7\60\2\2\u011d"+
		"\u011e\7\60\2\2\u011e\u011f\7\60\2\2\u011f\64\3\2\2\2\u0120\u0121\7\u0080"+
		"\2\2\u0121\66\3\2\2\2\u0122\u0123\7*\2\2\u0123\u0124\b\32\6\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\b\32\7\2\u01268\3\2\2\2\u0127\u0128\7+\2\2\u0128"+
		"\u0129\6\33\3\2\u0129\u012a\3\2\2\2\u012a\u012b\b\33\5\2\u012b:\3\2\2"+
		"\2\u012c\u012d\7]\2\2\u012d<\3\2\2\2\u012e\u012f\7_\2\2\u012f>\3\2\2\2"+
		"\u0130\u0131\7}\2\2\u0131@\3\2\2\2\u0132\u0133\7\177\2\2\u0133B\3\2\2"+
		"\2\u0134\u0135\7]\2\2\u0135\u0136\7z\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\b \b\2\u0138D\3\2\2\2\u0139\u013a\7>\2\2\u013aF\3\2\2\2\u013b\u013c\7"+
		"$\2\2\u013cH\3\2\2\2\u013d\u013e\7^\2\2\u013eJ\3\2\2\2\u013f\u0140\7v"+
		"\2\2\u0140\u0141\7g\2\2\u0141\u0142\7o\2\2\u0142\u0143\7r\2\2\u0143\u0144"+
		"\7n\2\2\u0144\u0145\7c\2\2\u0145\u0146\7v\2\2\u0146\u0147\7g\2\2\u0147"+
		"\u0148\7u\2\2\u0148L\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b\7q\2\2\u014b"+
		"\u014c\7w\2\2\u014c\u014d\7t\2\2\u014d\u014e\7e\2\2\u014e\u014f\7g\2\2"+
		"\u014fN\3\2\2\2\u0150\u0151\7u\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2"+
		"\2\u0153\u0154\7m\2\2\u0154P\3\2\2\2\u0155\u0156\7e\2\2\u0156\u0157\7"+
		"q\2\2\u0157\u0158\7o\2\2\u0158\u0159\7r\2\2\u0159\u015a\7q\2\2\u015a\u015b"+
		"\7u\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015dR\3\2\2\2\u015e\u015f"+
		"\7r\2\2\u015f\u0160\7t\2\2\u0160\u0161\7q\2\2\u0161\u0162\7e\2\2\u0162"+
		"\u0163\7g\2\2\u0163\u0164\7u\2\2\u0164\u0165\7u\2\2\u0165\u0166\7q\2\2"+
		"\u0166\u0167\7t\2\2\u0167T\3\2\2\2\u0168\u0169\7q\2\2\u0169\u016a\7r\2"+
		"\2\u016a\u016b\7g\2\2\u016b\u016c\7t\2\2\u016c\u016d\7c\2\2\u016d\u016e"+
		"\7v\2\2\u016e\u016f\7q\2\2\u016f\u0170\7t\2\2\u0170V\3\2\2\2\u0171\u0172"+
		"\7u\2\2\u0172\u0173\7v\2\2\u0173\u0174\7c\2\2\u0174\u0175\7v\2\2\u0175"+
		"\u0176\7g\2\2\u0176X\3\2\2\2\u0177\u0178\7g\2\2\u0178\u0179\7p\2\2\u0179"+
		"\u017a\7f\2\2\u017aZ\3\2\2\2\u017b\u017c\7t\2\2\u017c\u017d\7w\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7g\2\2\u017f\\\3\2\2\2\u0180\u0181\7h\2\2\u0181"+
		"\u0182\7k\2\2\u0182\u0183\7t\2\2\u0183\u0184\7u\2\2\u0184\u0185\7v\2\2"+
		"\u0185^\3\2\2\2\u0186\u0187\7n\2\2\u0187\u0188\7c\2\2\u0188\u0189\7u\2"+
		"\2\u0189\u018a\7v\2\2\u018a`\3\2\2\2\u018b\u018c\7%\2\2\u018cb\3\2\2\2"+
		"\u018d\u018e\7\60\2\2\u018e\u018f\7\60\2\2\u018fd\3\2\2\2\u0190\u0191"+
		"\7-\2\2\u0191f\3\2\2\2\u0192\u0193\7/\2\2\u0193h\3\2\2\2\u0194\u0195\7"+
		",\2\2\u0195j\3\2\2\2\u0196\u0197\7\u0080\2\2\u0197\u0198\7\61\2\2\u0198"+
		"l\3\2\2\2\u0199\u019a\7o\2\2\u019a\u019b\7q\2\2\u019b\u019c\7f\2\2\u019c"+
		"n\3\2\2\2\u019d\u019e\7A\2\2\u019ep\3\2\2\2\u019f\u01a0\7?\2\2\u01a0r"+
		"\3\2\2\2\u01a1\u01a2\7~\2\2\u01a2t\3\2\2\2\u01a3\u01a4\7@\2\2\u01a4v\3"+
		"\2\2\2\u01a5\u01a6\7A\2\2\u01a6\u01a7\7*\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\b:\t\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b:\7\2\u01abx\3\2\2\2\u01ac"+
		"\u01ad\7v\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7u\2\2\u01af\u01b0\7v\2\2"+
		"\u01b0z\3\2\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7u\2"+
		"\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7v\2\2\u01b7|\3\2"+
		"\2\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc"+
		"\7g\2\2\u01bc\u01bd\7/\2\2\u01bd\u01be\7u\2\2\u01be\u01bf\7{\2\2\u01bf"+
		"\u01c0\7u\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7o\2\2"+
		"\u01c3\u01c4\7\61\2\2\u01c4~\3\2\2\2\u01c5\u01c6\7y\2\2\u01c6\u01c7\7"+
		"k\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7j\2\2\u01c9\u0080\3\2\2\2\u01ca"+
		"\u01cb\7r\2\2\u01cb\u01cc\7t\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7x\2\2"+
		"\u01ce\u01cf\7k\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2"+
		"\7f\2\2\u01d2\u0082\3\2\2\2\u01d3\u01d4\7o\2\2\u01d4\u01d5\7q\2\2\u01d5"+
		"\u01d6\7f\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7h\2\2\u01d8\u01d9\7k\2\2"+
		"\u01d9\u01da\7g\2\2\u01da\u01db\7f\2\2\u01db\u0084\3\2\2\2\u01dc\u01dd"+
		"\7u\2\2\u01dd\u01de\7j\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7f\2\2\u01e0"+
		"\u01e1\7q\2\2\u01e1\u01e2\7y\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7f\2\2"+
		"\u01e4\u0086\3\2\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7p\2\2\u01e7\u01e8"+
		"\7j\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7k\2\2\u01eb"+
		"\u01ec\7v\2\2\u01ec\u01ed\7g\2\2\u01ed\u01ee\7f\2\2\u01ee\u0088\3\2\2"+
		"\2\u01ef\u01f0\7h\2\2\u01f0\u01f1\7t\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3"+
		"\7o\2\2\u01f3\u008a\3\2\2\2\u01f4\u01f5\7u\2\2\u01f5\u01f6\7v\2\2\u01f6"+
		"\u01f7\7c\2\2\u01f7\u01f8\7p\2\2\u01f8\u01f9\7f\2\2\u01f9\u01fa\7/\2\2"+
		"\u01fa\u01fb\7c\2\2\u01fb\u01fc\7n\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe"+
		"\7p\2\2\u01fe\u01ff\7g\2\2\u01ff\u008c\3\2\2\2\u0200\u0201\7w\2\2\u0201"+
		"\u0202\7u\2\2\u0202\u0203\7g\2\2\u0203\u008e\3\2\2\2\u0204\u0205\7r\2"+
		"\2\u0205\u0206\7t\2\2\u0206\u0207\7q\2\2\u0207\u0208\7i\2\2\u0208\u0209"+
		"\7t\2\2\u0209\u020a\7c\2\2\u020a\u020b\7o\2\2\u020b\u0090\3\2\2\2\u020c"+
		"\u020d\7o\2\2\u020d\u020e\7q\2\2\u020e\u020f\7f\2\2\u020f\u0210\7k\2\2"+
		"\u0210\u0211\7h\2\2\u0211\u0212\7{\2\2\u0212\u0092\3\2\2\2\u0213\u0214"+
		"\7d\2\2\u0214\u0215\7{\2\2\u0215\u0094\3\2\2\2\u0216\u0217\7e\2\2\u0217"+
		"\u0218\7q\2\2\u0218\u0219\7n\2\2\u0219\u021a\7n\2\2\u021a\u021b\7g\2\2"+
		"\u021b\u021c\7e\2\2\u021c\u021d\7v\2\2\u021d\u0096\3\2\2\2\u021e\u021f"+
		"\7$\2\2\u021f\u0220\7\63\2\2\u0220\u0221\7$\2\2\u0221\u0098\3\2\2\2\u0222"+
		"\u0223\7\62\2\2\u0223\u009a\3\2\2\2\u0224\u0226\t\2\2\2\u0225\u0227\5"+
		"\u009dM\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u009c\3\2\2\2"+
		"\u0228\u022a\t\3\2\2\u0229\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u009e\3\2\2\2\u022d\u022e\7)\2\2\u022e"+
		"\u022f\bN\n\2\u022f\u0230\3\2\2\2\u0230\u0231\bN\13\2\u0231\u00a0\3\2"+
		"\2\2\u0232\u0236\7B\2\2\u0233\u0235\5\u00a7R\2\u0234\u0233\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u00a2\3\2"+
		"\2\2\u0238\u0236\3\2\2\2\u0239\u023d\5\u00a5Q\2\u023a\u023c\5\u00a7R\2"+
		"\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u00a4\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\t\4\2\2\u0241"+
		"\u00a6\3\2\2\2\u0242\u0247\5\u00a5Q\2\u0243\u0247\t\5\2\2\u0244\u0245"+
		"\7/\2\2\u0245\u0247\t\4\2\2\u0246\u0242\3\2\2\2\u0246\u0243\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u00a8\3\2\2\2\u0248\u024a\t\6\2\2\u0249\u0248\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\bS\2\2\u024e\u00aa\3\2\2\2\u024f\u0251\n\7"+
		"\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\t\b"+
		"\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\bT\2\2\u0259"+
		"\u025a\bT\5\2\u025a\u00ac\3\2\2\2\u025b\u025d\5\u00afV\2\u025c\u025b\3"+
		"\2\2\2\u025d\u025e\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u00ae\3\2\2\2\u0260\u0261\7)\2\2\u0261\u0264\7)\2\2\u0262\u0264\n\t\2"+
		"\2\u0263\u0260\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u00b0\3\2\2\2\u0265\u0266"+
		"\7)\2\2\u0266\u0267\3\2\2\2\u0267\u0268\bW\5\2\u0268\u00b2\3\2\2\2\u0269"+
		"\u026a\7&\2\2\u026a\u026b\7%\2\2\u026b\u026c\3\2\2\2\u026c\u026d\bX\f"+
		"\2\u026d\u026e\3\2\2\2\u026e\u026f\bX\7\2\u026f\u00b4\3\2\2\2\u0270\u0271"+
		"\7&\2\2\u0271\u0272\bY\r\2\u0272\u0273\3\2\2\2\u0273\u0274\bY\7\2\u0274"+
		"\u00b6\3\2\2\2\u0275\u0277\5\u00b9[\2\u0276\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u00b8\3\2\2\2\u027a"+
		"\u027b\7)\2\2\u027b\u0280\7)\2\2\u027c\u027d\7&\2\2\u027d\u0280\7&\2\2"+
		"\u027e\u0280\n\n\2\2\u027f\u027a\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u027e"+
		"\3\2\2\2\u0280\u00ba\3\2\2\2\u0281\u0282\7)\2\2\u0282\u0283\6\\\4\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\b\\\5\2\u0285\u00bc\3\2\2\2\u0286\u0287\t\13"+
		"\2\2\u0287\u0289\t\13\2\2\u0288\u0286\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u00be\3\2\2\2\u028c\u028d\5\u00a9"+
		"S\2\u028d\u028e\3\2\2\2\u028e\u028f\b^\2\2\u028f\u00c0\3\2\2\2\u0290\u0291"+
		"\5\67\32\2\u0291\u0292\b_\16\2\u0292\u0293\3\2\2\2\u0293\u0294\b_\17\2"+
		"\u0294\u0295\b_\7\2\u0295\u00c2\3\2\2\2\u0296\u0297\7z\2\2\u0297\u0298"+
		"\7_\2\2\u0298\u0299\3\2\2\2\u0299\u029a\b`\5\2\u029a\u00c4\3\2\2\2\24"+
		"\2\3\4\5\6\u0226\u022b\u0236\u023d\u0246\u024b\u0252\u0256\u025e\u0263"+
		"\u0278\u027f\u028a\20\b\2\2\7\3\2\3\25\2\6\2\2\3\32\3\7\2\2\7\6\2\3:\4"+
		"\3N\5\7\5\2\3X\6\3Y\7\3_\b\t\33\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}