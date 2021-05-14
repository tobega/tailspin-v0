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
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, Reflexive=13, 
		And=14, Slash=15, Colon=16, Message=17, FieldReference=18, EndStringInterpolate=19, 
		SemiColon=20, Comma=21, Deconstructor=22, Invert=23, LeftParen=24, RightParen=25, 
		LeftBracket=26, RightBracket=27, LeftBrace=28, RightBrace=29, StartBytes=30, 
		StartMatcher=31, Quote=32, Lambda=33, StartTemplatesDefinition=34, StartSourceDefinition=35, 
		StartSinkDefinition=36, StartComposerDefinition=37, StartProcessorDefinition=38, 
		StartOperatorDefinition=39, EndDefinition=40, Rule=41, First=42, Last=43, 
		TemplateMatch=44, Range=45, Plus=46, Minus=47, Star=48, TruncateDivide=49, 
		Mod=50, Question=51, Equal=52, Else=53, EndMatcher=54, BeginCondition=55, 
		StartTestDefinition=56, Assert=57, CoreSystem=58, With=59, Provided=60, 
		Modified=61, Shadowed=62, Inherited=63, From=64, StandAlone=65, Use=66, 
		Program=67, Modify=68, By=69, Collect=70, Zero=71, PositiveInteger=72, 
		START_STRING=73, STATE_IDENTIFIER=74, IDENTIFIER=75, WS=76, Comment=77, 
		REGEX_TEXT=78, END_REGEX=79, StartCharacterCode=80, StartStringInterpolate=81, 
		STRING_TEXT=82, END_STRING=83, Bytes=84, Bytes_WS=85, EndBytes=86;
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
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "EndDefinition", "Rule", "First", "Last", 
			"TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
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
			"'stereotype'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", "'/'", 
			"':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, "'['", 
			"']'", "'{'", "'}'", "'[x'", "'<'", "'\"'", "'\\'", "'templates'", "'source'", 
			"'sink'", "'composer'", "'processor'", "'operator'", "'end'", "'rule'", 
			"'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", 
			"'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", "'core-system/'", 
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
			"StereotypeDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Quote", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "EndDefinition", "Rule", "First", "Last", 
			"TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
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
		case 54:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
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
		case 87:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2X\u0289\b\1\b\1\b"+
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
		"\t]\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		"-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\39"+
		"\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A"+
		"\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H"+
		"\3I\3I\5I\u0217\nI\3J\6J\u021a\nJ\rJ\16J\u021b\3K\3K\3K\3K\3K\3L\3L\7"+
		"L\u0225\nL\fL\16L\u0228\13L\3M\3M\7M\u022c\nM\fM\16M\u022f\13M\3N\3N\3"+
		"O\3O\5O\u0235\nO\3P\6P\u0238\nP\rP\16P\u0239\3P\3P\3Q\7Q\u023f\nQ\fQ\16"+
		"Q\u0242\13Q\3Q\5Q\u0245\nQ\3Q\3Q\3Q\3R\6R\u024b\nR\rR\16R\u024c\3S\3S"+
		"\3S\5S\u0252\nS\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\6W"+
		"\u0265\nW\rW\16W\u0266\3X\3X\3X\3X\3X\5X\u026e\nX\3Y\3Y\3Y\3Y\3Y\3Z\3"+
		"Z\6Z\u0277\nZ\rZ\16Z\u0278\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3"+
		"]\3]\3]\2\2^\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66"+
		"o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008d"+
		"F\u008fG\u0091H\u0093I\u0095J\u0097\2\u0099K\u009bL\u009dM\u009f\2\u00a1"+
		"\2\u00a3N\u00a5O\u00a7P\u00a9\2\u00abQ\u00adR\u00afS\u00b1T\u00b3\2\u00b5"+
		"U\u00b7V\u00b9W\u00bb\2\u00bdX\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|"+
		"\4\2\62;aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch"+
		"\2\u028c\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\4\u00a7\3\2\2"+
		"\2\4\u00ab\3\2\2\2\5\u00ad\3\2\2\2\5\u00af\3\2\2\2\5\u00b1\3\2\2\2\5\u00b5"+
		"\3\2\2\2\6\u00b7\3\2\2\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\6\u00bd\3\2\2"+
		"\2\7\u00bf\3\2\2\2\t\u00c5\3\2\2\2\13\u00cd\3\2\2\2\r\u00d2\3\2\2\2\17"+
		"\u00d6\3\2\2\2\21\u00db\3\2\2\2\23\u00de\3\2\2\2\25\u00e8\3\2\2\2\27\u00f3"+
		"\3\2\2\2\31\u00f6\3\2\2\2\33\u00f8\3\2\2\2\35\u00fa\3\2\2\2\37\u00fc\3"+
		"\2\2\2!\u00fe\3\2\2\2#\u0100\3\2\2\2%\u0102\3\2\2\2\'\u0104\3\2\2\2)\u0109"+
		"\3\2\2\2+\u010c\3\2\2\2-\u0112\3\2\2\2/\u0114\3\2\2\2\61\u0116\3\2\2\2"+
		"\63\u011a\3\2\2\2\65\u011c\3\2\2\2\67\u0121\3\2\2\29\u0126\3\2\2\2;\u0128"+
		"\3\2\2\2=\u012a\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0133\3\2\2\2E"+
		"\u0135\3\2\2\2G\u0137\3\2\2\2I\u0139\3\2\2\2K\u0143\3\2\2\2M\u014a\3\2"+
		"\2\2O\u014f\3\2\2\2Q\u0158\3\2\2\2S\u0162\3\2\2\2U\u016b\3\2\2\2W\u016f"+
		"\3\2\2\2Y\u0174\3\2\2\2[\u017a\3\2\2\2]\u017f\3\2\2\2_\u0181\3\2\2\2a"+
		"\u0184\3\2\2\2c\u0186\3\2\2\2e\u0188\3\2\2\2g\u018a\3\2\2\2i\u018d\3\2"+
		"\2\2k\u0191\3\2\2\2m\u0193\3\2\2\2o\u0195\3\2\2\2q\u0197\3\2\2\2s\u0199"+
		"\3\2\2\2u\u01a0\3\2\2\2w\u01a5\3\2\2\2y\u01ac\3\2\2\2{\u01b9\3\2\2\2}"+
		"\u01be\3\2\2\2\177\u01c7\3\2\2\2\u0081\u01d0\3\2\2\2\u0083\u01d9\3\2\2"+
		"\2\u0085\u01e3\3\2\2\2\u0087\u01e8\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01f8"+
		"\3\2\2\2\u008d\u0200\3\2\2\2\u008f\u0207\3\2\2\2\u0091\u020a\3\2\2\2\u0093"+
		"\u0212\3\2\2\2\u0095\u0214\3\2\2\2\u0097\u0219\3\2\2\2\u0099\u021d\3\2"+
		"\2\2\u009b\u0222\3\2\2\2\u009d\u0229\3\2\2\2\u009f\u0230\3\2\2\2\u00a1"+
		"\u0234\3\2\2\2\u00a3\u0237\3\2\2\2\u00a5\u0240\3\2\2\2\u00a7\u024a\3\2"+
		"\2\2\u00a9\u0251\3\2\2\2\u00ab\u0253\3\2\2\2\u00ad\u0257\3\2\2\2\u00af"+
		"\u025e\3\2\2\2\u00b1\u0264\3\2\2\2\u00b3\u026d\3\2\2\2\u00b5\u026f\3\2"+
		"\2\2\u00b7\u0276\3\2\2\2\u00b9\u027a\3\2\2\2\u00bb\u027e\3\2\2\2\u00bd"+
		"\u0284\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\b\2\2\2\u00c3\u00c4\b\2\3\2\u00c4\b\3\2\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\n\3\2\2\2\u00cd"+
		"\u00ce\7X\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7F\2\2"+
		"\u00d1\f\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7h"+
		"\2\2\u00d5\16\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7p\2\2\u00da\20\3\2\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd"+
		"\7q\2\2\u00dd\22\3\2\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7j\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7y\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7\24\3\2\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\7{\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7g\2\2\u00f2\26\3\2\2\2\u00f3\u00f4"+
		"\7/\2\2\u00f4\u00f5\7@\2\2\u00f5\30\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\32"+
		"\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9\34\3\2\2\2\u00fa\u00fb\7`\2\2\u00fb"+
		"\36\3\2\2\2\u00fc\u00fd\7\u00a9\2\2\u00fd \3\2\2\2\u00fe\u00ff\7(\2\2"+
		"\u00ff\"\3\2\2\2\u0100\u0101\7\61\2\2\u0101$\3\2\2\2\u0102\u0103\7<\2"+
		"\2\u0103&\3\2\2\2\u0104\u0105\7<\2\2\u0105\u0106\7<\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0108\5\u009dM\2\u0108(\3\2\2\2\u0109\u010a\7\60\2\2\u010a"+
		"\u010b\5\u009dM\2\u010b*\3\2\2\2\u010c\u010d\7=\2\2\u010d\u010e\6\24\2"+
		"\2\u010e\u010f\b\24\4\2\u010f\u0110\3\2\2\2\u0110\u0111\b\24\5\2\u0111"+
		",\3\2\2\2\u0112\u0113\7=\2\2\u0113.\3\2\2\2\u0114\u0115\7.\2\2\u0115\60"+
		"\3\2\2\2\u0116\u0117\7\60\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7\60\2"+
		"\2\u0119\62\3\2\2\2\u011a\u011b\7\u0080\2\2\u011b\64\3\2\2\2\u011c\u011d"+
		"\7*\2\2\u011d\u011e\b\31\6\2\u011e\u011f\3\2\2\2\u011f\u0120\b\31\7\2"+
		"\u0120\66\3\2\2\2\u0121\u0122\7+\2\2\u0122\u0123\6\32\3\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\b\32\5\2\u01258\3\2\2\2\u0126\u0127\7]\2\2\u0127"+
		":\3\2\2\2\u0128\u0129\7_\2\2\u0129<\3\2\2\2\u012a\u012b\7}\2\2\u012b>"+
		"\3\2\2\2\u012c\u012d\7\177\2\2\u012d@\3\2\2\2\u012e\u012f\7]\2\2\u012f"+
		"\u0130\7z\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\37\b\2\u0132B\3\2\2\2"+
		"\u0133\u0134\7>\2\2\u0134D\3\2\2\2\u0135\u0136\7$\2\2\u0136F\3\2\2\2\u0137"+
		"\u0138\7^\2\2\u0138H\3\2\2\2\u0139\u013a\7v\2\2\u013a\u013b\7g\2\2\u013b"+
		"\u013c\7o\2\2\u013c\u013d\7r\2\2\u013d\u013e\7n\2\2\u013e\u013f\7c\2\2"+
		"\u013f\u0140\7v\2\2\u0140\u0141\7g\2\2\u0141\u0142\7u\2\2\u0142J\3\2\2"+
		"\2\u0143\u0144\7u\2\2\u0144\u0145\7q\2\2\u0145\u0146\7w\2\2\u0146\u0147"+
		"\7t\2\2\u0147\u0148\7e\2\2\u0148\u0149\7g\2\2\u0149L\3\2\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d\u014e\7m\2\2\u014e"+
		"N\3\2\2\2\u014f\u0150\7e\2\2\u0150\u0151\7q\2\2\u0151\u0152\7o\2\2\u0152"+
		"\u0153\7r\2\2\u0153\u0154\7q\2\2\u0154\u0155\7u\2\2\u0155\u0156\7g\2\2"+
		"\u0156\u0157\7t\2\2\u0157P\3\2\2\2\u0158\u0159\7r\2\2\u0159\u015a\7t\2"+
		"\2\u015a\u015b\7q\2\2\u015b\u015c\7e\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7u\2\2\u015e\u015f\7u\2\2\u015f\u0160\7q\2\2\u0160\u0161\7t\2\2\u0161"+
		"R\3\2\2\2\u0162\u0163\7q\2\2\u0163\u0164\7r\2\2\u0164\u0165\7g\2\2\u0165"+
		"\u0166\7t\2\2\u0166\u0167\7c\2\2\u0167\u0168\7v\2\2\u0168\u0169\7q\2\2"+
		"\u0169\u016a\7t\2\2\u016aT\3\2\2\2\u016b\u016c\7g\2\2\u016c\u016d\7p\2"+
		"\2\u016d\u016e\7f\2\2\u016eV\3\2\2\2\u016f\u0170\7t\2\2\u0170\u0171\7"+
		"w\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u0173X\3\2\2\2\u0174\u0175"+
		"\7h\2\2\u0175\u0176\7k\2\2\u0176\u0177\7t\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7v\2\2\u0179Z\3\2\2\2\u017a\u017b\7n\2\2\u017b\u017c\7c\2\2\u017c"+
		"\u017d\7u\2\2\u017d\u017e\7v\2\2\u017e\\\3\2\2\2\u017f\u0180\7%\2\2\u0180"+
		"^\3\2\2\2\u0181\u0182\7\60\2\2\u0182\u0183\7\60\2\2\u0183`\3\2\2\2\u0184"+
		"\u0185\7-\2\2\u0185b\3\2\2\2\u0186\u0187\7/\2\2\u0187d\3\2\2\2\u0188\u0189"+
		"\7,\2\2\u0189f\3\2\2\2\u018a\u018b\7\u0080\2\2\u018b\u018c\7\61\2\2\u018c"+
		"h\3\2\2\2\u018d\u018e\7o\2\2\u018e\u018f\7q\2\2\u018f\u0190\7f\2\2\u0190"+
		"j\3\2\2\2\u0191\u0192\7A\2\2\u0192l\3\2\2\2\u0193\u0194\7?\2\2\u0194n"+
		"\3\2\2\2\u0195\u0196\7~\2\2\u0196p\3\2\2\2\u0197\u0198\7@\2\2\u0198r\3"+
		"\2\2\2\u0199\u019a\7A\2\2\u019a\u019b\7*\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\b8\t\2\u019d\u019e\3\2\2\2\u019e\u019f\b8\7\2\u019ft\3\2\2\2\u01a0"+
		"\u01a1\7v\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2"+
		"\u01a4v\3\2\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7u\2\2\u01a7\u01a8\7u\2"+
		"\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7v\2\2\u01abx\3\2"+
		"\2\2\u01ac\u01ad\7e\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7t\2\2\u01af\u01b0"+
		"\7g\2\2\u01b0\u01b1\7/\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7{\2\2\u01b3"+
		"\u01b4\7u\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\7o\2\2"+
		"\u01b7\u01b8\7\61\2\2\u01b8z\3\2\2\2\u01b9\u01ba\7y\2\2\u01ba\u01bb\7"+
		"k\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7j\2\2\u01bd|\3\2\2\2\u01be\u01bf"+
		"\7r\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7x\2\2\u01c2"+
		"\u01c3\7k\2\2\u01c3\u01c4\7f\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7f\2\2"+
		"\u01c6~\3\2\2\2\u01c7\u01c8\7o\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7f\2"+
		"\2\u01ca\u01cb\7k\2\2\u01cb\u01cc\7h\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce"+
		"\7g\2\2\u01ce\u01cf\7f\2\2\u01cf\u0080\3\2\2\2\u01d0\u01d1\7u\2\2\u01d1"+
		"\u01d2\7j\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7f\2\2\u01d4\u01d5\7q\2\2"+
		"\u01d5\u01d6\7y\2\2\u01d6\u01d7\7g\2\2\u01d7\u01d8\7f\2\2\u01d8\u0082"+
		"\3\2\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7j\2\2\u01dc"+
		"\u01dd\7g\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7v\2\2"+
		"\u01e0\u01e1\7g\2\2\u01e1\u01e2\7f\2\2\u01e2\u0084\3\2\2\2\u01e3\u01e4"+
		"\7h\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7\7o\2\2\u01e7"+
		"\u0086\3\2\2\2\u01e8\u01e9\7u\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7c\2"+
		"\2\u01eb\u01ec\7p\2\2\u01ec\u01ed\7f\2\2\u01ed\u01ee\7/\2\2\u01ee\u01ef"+
		"\7c\2\2\u01ef\u01f0\7n\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7p\2\2\u01f2"+
		"\u01f3\7g\2\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\7w\2\2\u01f5\u01f6\7u\2"+
		"\2\u01f6\u01f7\7g\2\2\u01f7\u008a\3\2\2\2\u01f8\u01f9\7r\2\2\u01f9\u01fa"+
		"\7t\2\2\u01fa\u01fb\7q\2\2\u01fb\u01fc\7i\2\2\u01fc\u01fd\7t\2\2\u01fd"+
		"\u01fe\7c\2\2\u01fe\u01ff\7o\2\2\u01ff\u008c\3\2\2\2\u0200\u0201\7o\2"+
		"\2\u0201\u0202\7q\2\2\u0202\u0203\7f\2\2\u0203\u0204\7k\2\2\u0204\u0205"+
		"\7h\2\2\u0205\u0206\7{\2\2\u0206\u008e\3\2\2\2\u0207\u0208\7d\2\2\u0208"+
		"\u0209\7{\2\2\u0209\u0090\3\2\2\2\u020a\u020b\7e\2\2\u020b\u020c\7q\2"+
		"\2\u020c\u020d\7n\2\2\u020d\u020e\7n\2\2\u020e\u020f\7g\2\2\u020f\u0210"+
		"\7e\2\2\u0210\u0211\7v\2\2\u0211\u0092\3\2\2\2\u0212\u0213\7\62\2\2\u0213"+
		"\u0094\3\2\2\2\u0214\u0216\t\2\2\2\u0215\u0217\5\u0097J\2\u0216\u0215"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0096\3\2\2\2\u0218\u021a\t\3\2\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u0098\3\2\2\2\u021d\u021e\7)\2\2\u021e\u021f\bK\n\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0221\bK\13\2\u0221\u009a\3\2\2\2\u0222\u0226\7B\2\2\u0223"+
		"\u0225\5\u00a1O\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u009c\3\2\2\2\u0228\u0226\3\2\2\2\u0229"+
		"\u022d\5\u009fN\2\u022a\u022c\5\u00a1O\2\u022b\u022a\3\2\2\2\u022c\u022f"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u009e\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\t\4\2\2\u0231\u00a0\3\2\2\2\u0232\u0235\5\u009f"+
		"N\2\u0233\u0235\t\5\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"\u00a2\3\2\2\2\u0236\u0238\t\6\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023c\bP\2\2\u023c\u00a4\3\2\2\2\u023d\u023f\n\7\2\2\u023e\u023d\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\t\b\2\2\u0244\u0243\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u0247\bQ\2\2\u0247\u0248\bQ\5\2\u0248\u00a6"+
		"\3\2\2\2\u0249\u024b\5\u00a9S\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2\2"+
		"\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u00a8\3\2\2\2\u024e\u024f"+
		"\7)\2\2\u024f\u0252\7)\2\2\u0250\u0252\n\t\2\2\u0251\u024e\3\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u00aa\3\2\2\2\u0253\u0254\7)\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0256\bT\5\2\u0256\u00ac\3\2\2\2\u0257\u0258\7&\2\2\u0258\u0259"+
		"\7%\2\2\u0259\u025a\3\2\2\2\u025a\u025b\bU\f\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\bU\7\2\u025d\u00ae\3\2\2\2\u025e\u025f\7&\2\2\u025f\u0260\bV\r"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0262\bV\7\2\u0262\u00b0\3\2\2\2\u0263\u0265"+
		"\5\u00b3X\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u00b2\3\2\2\2\u0268\u0269\7)\2\2\u0269\u026e"+
		"\7)\2\2\u026a\u026b\7&\2\2\u026b\u026e\7&\2\2\u026c\u026e\n\n\2\2\u026d"+
		"\u0268\3\2\2\2\u026d\u026a\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u00b4\3\2"+
		"\2\2\u026f\u0270\7)\2\2\u0270\u0271\6Y\4\2\u0271\u0272\3\2\2\2\u0272\u0273"+
		"\bY\5\2\u0273\u00b6\3\2\2\2\u0274\u0275\t\13\2\2\u0275\u0277\t\13\2\2"+
		"\u0276\u0274\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u00b8\3\2\2\2\u027a\u027b\5\u00a3P\2\u027b\u027c\3\2\2"+
		"\2\u027c\u027d\b[\2\2\u027d\u00ba\3\2\2\2\u027e\u027f\5\65\31\2\u027f"+
		"\u0280\b\\\16\2\u0280\u0281\3\2\2\2\u0281\u0282\b\\\17\2\u0282\u0283\b"+
		"\\\7\2\u0283\u00bc\3\2\2\2\u0284\u0285\7z\2\2\u0285\u0286\7_\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0288\b]\5\2\u0288\u00be\3\2\2\2\24\2\3\4\5\6\u0216"+
		"\u021b\u0226\u022d\u0234\u0239\u0240\u0244\u024c\u0251\u0266\u026d\u0278"+
		"\20\b\2\2\7\3\2\3\24\2\6\2\2\3\31\3\7\2\2\7\6\2\38\4\3K\5\7\5\2\3U\6\3"+
		"V\7\3\\\b\t\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}