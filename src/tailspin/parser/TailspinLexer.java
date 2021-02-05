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
		StartMatcher=31, Lambda=32, StartTemplatesDefinition=33, StartSourceDefinition=34, 
		StartSinkDefinition=35, StartComposerDefinition=36, StartProcessorDefinition=37, 
		StartOperatorDefinition=38, EndDefinition=39, Rule=40, First=41, Last=42, 
		TemplateMatch=43, Range=44, Plus=45, Minus=46, Star=47, TruncateDivide=48, 
		Mod=49, Question=50, Equal=51, Else=52, EndMatcher=53, BeginCondition=54, 
		StartTestDefinition=55, Assert=56, CoreSystem=57, With=58, Provided=59, 
		Modified=60, Shadowed=61, Inherited=62, From=63, StandAlone=64, Use=65, 
		Program=66, Modify=67, By=68, Collect=69, Zero=70, PositiveInteger=71, 
		START_STRING=72, STATE_IDENTIFIER=73, IDENTIFIER=74, WS=75, Comment=76, 
		REGEX_TEXT=77, END_REGEX=78, StartCharacterCode=79, StartStringInterpolate=80, 
		STRING_TEXT=81, END_STRING=82, Bytes=83, Bytes_WS=84, EndBytes=85;
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
			"StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
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
			"']'", "'{'", "'}'", "'[x'", "'<'", "'\\'", "'templates'", "'source'", 
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
			"StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
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
		case 53:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 89:
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
		case 86:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u0285\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3H\3H\5H\u0213\nH\3I\6I\u0216\nI\rI\16I\u0217\3J\3J\3J\3J\3J\3K\3K\7"+
		"K\u0221\nK\fK\16K\u0224\13K\3L\3L\7L\u0228\nL\fL\16L\u022b\13L\3M\3M\3"+
		"N\3N\5N\u0231\nN\3O\6O\u0234\nO\rO\16O\u0235\3O\3O\3P\7P\u023b\nP\fP\16"+
		"P\u023e\13P\3P\5P\u0241\nP\3P\3P\3P\3Q\6Q\u0247\nQ\rQ\16Q\u0248\3R\3R"+
		"\3R\5R\u024e\nR\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\6V"+
		"\u0261\nV\rV\16V\u0262\3W\3W\3W\3W\3W\5W\u026a\nW\3X\3X\3X\3X\3X\3Y\3"+
		"Y\6Y\u0273\nY\rY\16Y\u0274\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3"+
		"\\\3\\\2\2]\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66"+
		"o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008d"+
		"F\u008fG\u0091H\u0093I\u0095\2\u0097J\u0099K\u009bL\u009d\2\u009f\2\u00a1"+
		"M\u00a3N\u00a5O\u00a7\2\u00a9P\u00abQ\u00adR\u00afS\u00b1\2\u00b3T\u00b5"+
		"U\u00b7V\u00b9\2\u00bbW\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62"+
		";aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u0288"+
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
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\4\u00a5\3\2\2\2\4\u00a9\3\2\2\2\5\u00ab"+
		"\3\2\2\2\5\u00ad\3\2\2\2\5\u00af\3\2\2\2\5\u00b3\3\2\2\2\6\u00b5\3\2\2"+
		"\2\6\u00b7\3\2\2\2\6\u00b9\3\2\2\2\6\u00bb\3\2\2\2\7\u00bd\3\2\2\2\t\u00c3"+
		"\3\2\2\2\13\u00cb\3\2\2\2\r\u00d0\3\2\2\2\17\u00d4\3\2\2\2\21\u00d9\3"+
		"\2\2\2\23\u00dc\3\2\2\2\25\u00e6\3\2\2\2\27\u00f1\3\2\2\2\31\u00f4\3\2"+
		"\2\2\33\u00f6\3\2\2\2\35\u00f8\3\2\2\2\37\u00fa\3\2\2\2!\u00fc\3\2\2\2"+
		"#\u00fe\3\2\2\2%\u0100\3\2\2\2\'\u0102\3\2\2\2)\u0107\3\2\2\2+\u010a\3"+
		"\2\2\2-\u0110\3\2\2\2/\u0112\3\2\2\2\61\u0114\3\2\2\2\63\u0118\3\2\2\2"+
		"\65\u011a\3\2\2\2\67\u011f\3\2\2\29\u0124\3\2\2\2;\u0126\3\2\2\2=\u0128"+
		"\3\2\2\2?\u012a\3\2\2\2A\u012c\3\2\2\2C\u0131\3\2\2\2E\u0133\3\2\2\2G"+
		"\u0135\3\2\2\2I\u013f\3\2\2\2K\u0146\3\2\2\2M\u014b\3\2\2\2O\u0154\3\2"+
		"\2\2Q\u015e\3\2\2\2S\u0167\3\2\2\2U\u016b\3\2\2\2W\u0170\3\2\2\2Y\u0176"+
		"\3\2\2\2[\u017b\3\2\2\2]\u017d\3\2\2\2_\u0180\3\2\2\2a\u0182\3\2\2\2c"+
		"\u0184\3\2\2\2e\u0186\3\2\2\2g\u0189\3\2\2\2i\u018d\3\2\2\2k\u018f\3\2"+
		"\2\2m\u0191\3\2\2\2o\u0193\3\2\2\2q\u0195\3\2\2\2s\u019c\3\2\2\2u\u01a1"+
		"\3\2\2\2w\u01a8\3\2\2\2y\u01b5\3\2\2\2{\u01ba\3\2\2\2}\u01c3\3\2\2\2\177"+
		"\u01cc\3\2\2\2\u0081\u01d5\3\2\2\2\u0083\u01df\3\2\2\2\u0085\u01e4\3\2"+
		"\2\2\u0087\u01f0\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01fc\3\2\2\2\u008d"+
		"\u0203\3\2\2\2\u008f\u0206\3\2\2\2\u0091\u020e\3\2\2\2\u0093\u0210\3\2"+
		"\2\2\u0095\u0215\3\2\2\2\u0097\u0219\3\2\2\2\u0099\u021e\3\2\2\2\u009b"+
		"\u0225\3\2\2\2\u009d\u022c\3\2\2\2\u009f\u0230\3\2\2\2\u00a1\u0233\3\2"+
		"\2\2\u00a3\u023c\3\2\2\2\u00a5\u0246\3\2\2\2\u00a7\u024d\3\2\2\2\u00a9"+
		"\u024f\3\2\2\2\u00ab\u0253\3\2\2\2\u00ad\u025a\3\2\2\2\u00af\u0260\3\2"+
		"\2\2\u00b1\u0269\3\2\2\2\u00b3\u026b\3\2\2\2\u00b5\u0272\3\2\2\2\u00b7"+
		"\u0276\3\2\2\2\u00b9\u027a\3\2\2\2\u00bb\u0280\3\2\2\2\u00bd\u00be\7\61"+
		"\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\2\2\2\u00c1"+
		"\u00c2\b\2\3\2\u00c2\b\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7f\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\n\3\2\2\2\u00cb\u00cc\7X\2\2\u00cc\u00cd\7Q"+
		"\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7F\2\2\u00cf\f\3\2\2\2\u00d0\u00d1"+
		"\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\16\3\2\2\2\u00d4\u00d5"+
		"\7y\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"\20\3\2\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7q\2\2\u00db\22\3\2\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7t\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7u\2\2\u00e4\u00e5\7g\2\2\u00e5\24\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef\7r\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7"+
		"@\2\2\u00f3\30\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\32\3\2\2\2\u00f6\u00f7"+
		"\7&\2\2\u00f7\34\3\2\2\2\u00f8\u00f9\7`\2\2\u00f9\36\3\2\2\2\u00fa\u00fb"+
		"\7\u00a9\2\2\u00fb \3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\"\3\2\2\2\u00fe\u00ff"+
		"\7\61\2\2\u00ff$\3\2\2\2\u0100\u0101\7<\2\2\u0101&\3\2\2\2\u0102\u0103"+
		"\7<\2\2\u0103\u0104\7<\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5\u009bL\2"+
		"\u0106(\3\2\2\2\u0107\u0108\7\60\2\2\u0108\u0109\5\u009bL\2\u0109*\3\2"+
		"\2\2\u010a\u010b\7=\2\2\u010b\u010c\6\24\2\2\u010c\u010d\b\24\4\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b\24\5\2\u010f,\3\2\2\2\u0110\u0111\7=\2\2"+
		"\u0111.\3\2\2\2\u0112\u0113\7.\2\2\u0113\60\3\2\2\2\u0114\u0115\7\60\2"+
		"\2\u0115\u0116\7\60\2\2\u0116\u0117\7\60\2\2\u0117\62\3\2\2\2\u0118\u0119"+
		"\7\u0080\2\2\u0119\64\3\2\2\2\u011a\u011b\7*\2\2\u011b\u011c\b\31\6\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\b\31\7\2\u011e\66\3\2\2\2\u011f\u0120"+
		"\7+\2\2\u0120\u0121\6\32\3\2\u0121\u0122\3\2\2\2\u0122\u0123\b\32\5\2"+
		"\u01238\3\2\2\2\u0124\u0125\7]\2\2\u0125:\3\2\2\2\u0126\u0127\7_\2\2\u0127"+
		"<\3\2\2\2\u0128\u0129\7}\2\2\u0129>\3\2\2\2\u012a\u012b\7\177\2\2\u012b"+
		"@\3\2\2\2\u012c\u012d\7]\2\2\u012d\u012e\7z\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\b\37\b\2\u0130B\3\2\2\2\u0131\u0132\7>\2\2\u0132D\3\2\2\2\u0133"+
		"\u0134\7^\2\2\u0134F\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2\u0137"+
		"\u0138\7o\2\2\u0138\u0139\7r\2\2\u0139\u013a\7n\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7v\2\2\u013c\u013d\7g\2\2\u013d\u013e\7u\2\2\u013eH\3\2\2"+
		"\2\u013f\u0140\7u\2\2\u0140\u0141\7q\2\2\u0141\u0142\7w\2\2\u0142\u0143"+
		"\7t\2\2\u0143\u0144\7e\2\2\u0144\u0145\7g\2\2\u0145J\3\2\2\2\u0146\u0147"+
		"\7u\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7m\2\2\u014a"+
		"L\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7o\2\2\u014e"+
		"\u014f\7r\2\2\u014f\u0150\7q\2\2\u0150\u0151\7u\2\2\u0151\u0152\7g\2\2"+
		"\u0152\u0153\7t\2\2\u0153N\3\2\2\2\u0154\u0155\7r\2\2\u0155\u0156\7t\2"+
		"\2\u0156\u0157\7q\2\2\u0157\u0158\7e\2\2\u0158\u0159\7g\2\2\u0159\u015a"+
		"\7u\2\2\u015a\u015b\7u\2\2\u015b\u015c\7q\2\2\u015c\u015d\7t\2\2\u015d"+
		"P\3\2\2\2\u015e\u015f\7q\2\2\u015f\u0160\7r\2\2\u0160\u0161\7g\2\2\u0161"+
		"\u0162\7t\2\2\u0162\u0163\7c\2\2\u0163\u0164\7v\2\2\u0164\u0165\7q\2\2"+
		"\u0165\u0166\7t\2\2\u0166R\3\2\2\2\u0167\u0168\7g\2\2\u0168\u0169\7p\2"+
		"\2\u0169\u016a\7f\2\2\u016aT\3\2\2\2\u016b\u016c\7t\2\2\u016c\u016d\7"+
		"w\2\2\u016d\u016e\7n\2\2\u016e\u016f\7g\2\2\u016fV\3\2\2\2\u0170\u0171"+
		"\7h\2\2\u0171\u0172\7k\2\2\u0172\u0173\7t\2\2\u0173\u0174\7u\2\2\u0174"+
		"\u0175\7v\2\2\u0175X\3\2\2\2\u0176\u0177\7n\2\2\u0177\u0178\7c\2\2\u0178"+
		"\u0179\7u\2\2\u0179\u017a\7v\2\2\u017aZ\3\2\2\2\u017b\u017c\7%\2\2\u017c"+
		"\\\3\2\2\2\u017d\u017e\7\60\2\2\u017e\u017f\7\60\2\2\u017f^\3\2\2\2\u0180"+
		"\u0181\7-\2\2\u0181`\3\2\2\2\u0182\u0183\7/\2\2\u0183b\3\2\2\2\u0184\u0185"+
		"\7,\2\2\u0185d\3\2\2\2\u0186\u0187\7\u0080\2\2\u0187\u0188\7\61\2\2\u0188"+
		"f\3\2\2\2\u0189\u018a\7o\2\2\u018a\u018b\7q\2\2\u018b\u018c\7f\2\2\u018c"+
		"h\3\2\2\2\u018d\u018e\7A\2\2\u018ej\3\2\2\2\u018f\u0190\7?\2\2\u0190l"+
		"\3\2\2\2\u0191\u0192\7~\2\2\u0192n\3\2\2\2\u0193\u0194\7@\2\2\u0194p\3"+
		"\2\2\2\u0195\u0196\7A\2\2\u0196\u0197\7*\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0199\b\67\t\2\u0199\u019a\3\2\2\2\u019a\u019b\b\67\7\2\u019br\3\2\2"+
		"\2\u019c\u019d\7v\2\2\u019d\u019e\7g\2\2\u019e\u019f\7u\2\2\u019f\u01a0"+
		"\7v\2\2\u01a0t\3\2\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4"+
		"\7u\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7v\2\2\u01a7"+
		"v\3\2\2\2\u01a8\u01a9\7e\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7t\2\2\u01ab"+
		"\u01ac\7g\2\2\u01ac\u01ad\7/\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7{\2\2"+
		"\u01af\u01b0\7u\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b3"+
		"\7o\2\2\u01b3\u01b4\7\61\2\2\u01b4x\3\2\2\2\u01b5\u01b6\7y\2\2\u01b6\u01b7"+
		"\7k\2\2\u01b7\u01b8\7v\2\2\u01b8\u01b9\7j\2\2\u01b9z\3\2\2\2\u01ba\u01bb"+
		"\7r\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7x\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7f\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7f\2\2"+
		"\u01c2|\3\2\2\2\u01c3\u01c4\7o\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7f\2"+
		"\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca"+
		"\7g\2\2\u01ca\u01cb\7f\2\2\u01cb~\3\2\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce"+
		"\7j\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7q\2\2\u01d1"+
		"\u01d2\7y\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7f\2\2\u01d4\u0080\3\2\2"+
		"\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9"+
		"\7g\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7v\2\2\u01dc"+
		"\u01dd\7g\2\2\u01dd\u01de\7f\2\2\u01de\u0082\3\2\2\2\u01df\u01e0\7h\2"+
		"\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7q\2\2\u01e2\u01e3\7o\2\2\u01e3\u0084"+
		"\3\2\2\2\u01e4\u01e5\7u\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7c\2\2\u01e7"+
		"\u01e8\7p\2\2\u01e8\u01e9\7f\2\2\u01e9\u01ea\7/\2\2\u01ea\u01eb\7c\2\2"+
		"\u01eb\u01ec\7n\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7p\2\2\u01ee\u01ef"+
		"\7g\2\2\u01ef\u0086\3\2\2\2\u01f0\u01f1\7w\2\2\u01f1\u01f2\7u\2\2\u01f2"+
		"\u01f3\7g\2\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\7r\2\2\u01f5\u01f6\7t\2"+
		"\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7i\2\2\u01f8\u01f9\7t\2\2\u01f9\u01fa"+
		"\7c\2\2\u01fa\u01fb\7o\2\2\u01fb\u008a\3\2\2\2\u01fc\u01fd\7o\2\2\u01fd"+
		"\u01fe\7q\2\2\u01fe\u01ff\7f\2\2\u01ff\u0200\7k\2\2\u0200\u0201\7h\2\2"+
		"\u0201\u0202\7{\2\2\u0202\u008c\3\2\2\2\u0203\u0204\7d\2\2\u0204\u0205"+
		"\7{\2\2\u0205\u008e\3\2\2\2\u0206\u0207\7e\2\2\u0207\u0208\7q\2\2\u0208"+
		"\u0209\7n\2\2\u0209\u020a\7n\2\2\u020a\u020b\7g\2\2\u020b\u020c\7e\2\2"+
		"\u020c\u020d\7v\2\2\u020d\u0090\3\2\2\2\u020e\u020f\7\62\2\2\u020f\u0092"+
		"\3\2\2\2\u0210\u0212\t\2\2\2\u0211\u0213\5\u0095I\2\u0212\u0211\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u0094\3\2\2\2\u0214\u0216\t\3\2\2\u0215\u0214"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0096\3\2\2\2\u0219\u021a\7)\2\2\u021a\u021b\bJ\n\2\u021b\u021c\3\2\2"+
		"\2\u021c\u021d\bJ\13\2\u021d\u0098\3\2\2\2\u021e\u0222\7B\2\2\u021f\u0221"+
		"\5\u009fN\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2"+
		"\2\u0222\u0223\3\2\2\2\u0223\u009a\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229"+
		"\5\u009dM\2\u0226\u0228\5\u009fN\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u009c\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022c\u022d\t\4\2\2\u022d\u009e\3\2\2\2\u022e\u0231\5\u009d"+
		"M\2\u022f\u0231\t\5\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u00a0\3\2\2\2\u0232\u0234\t\6\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\bO\2\2\u0238\u00a2\3\2\2\2\u0239\u023b\n\7\2\2\u023a\u0239\3\2"+
		"\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0241\t\b\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\bP\2\2\u0243\u0244\bP\5\2\u0244\u00a4"+
		"\3\2\2\2\u0245\u0247\5\u00a7R\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2"+
		"\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u00a6\3\2\2\2\u024a\u024b"+
		"\7)\2\2\u024b\u024e\7)\2\2\u024c\u024e\n\t\2\2\u024d\u024a\3\2\2\2\u024d"+
		"\u024c\3\2\2\2\u024e\u00a8\3\2\2\2\u024f\u0250\7)\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\bS\5\2\u0252\u00aa\3\2\2\2\u0253\u0254\7&\2\2\u0254\u0255"+
		"\7%\2\2\u0255\u0256\3\2\2\2\u0256\u0257\bT\f\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\bT\7\2\u0259\u00ac\3\2\2\2\u025a\u025b\7&\2\2\u025b\u025c\bU\r"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025e\bU\7\2\u025e\u00ae\3\2\2\2\u025f\u0261"+
		"\5\u00b1W\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u00b0\3\2\2\2\u0264\u0265\7)\2\2\u0265\u026a"+
		"\7)\2\2\u0266\u0267\7&\2\2\u0267\u026a\7&\2\2\u0268\u026a\n\n\2\2\u0269"+
		"\u0264\3\2\2\2\u0269\u0266\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u00b2\3\2"+
		"\2\2\u026b\u026c\7)\2\2\u026c\u026d\6X\4\2\u026d\u026e\3\2\2\2\u026e\u026f"+
		"\bX\5\2\u026f\u00b4\3\2\2\2\u0270\u0271\t\13\2\2\u0271\u0273\t\13\2\2"+
		"\u0272\u0270\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u00b6\3\2\2\2\u0276\u0277\5\u00a1O\2\u0277\u0278\3\2\2"+
		"\2\u0278\u0279\bZ\2\2\u0279\u00b8\3\2\2\2\u027a\u027b\5\65\31\2\u027b"+
		"\u027c\b[\16\2\u027c\u027d\3\2\2\2\u027d\u027e\b[\17\2\u027e\u027f\b["+
		"\7\2\u027f\u00ba\3\2\2\2\u0280\u0281\7z\2\2\u0281\u0282\7_\2\2\u0282\u0283"+
		"\3\2\2\2\u0283\u0284\b\\\5\2\u0284\u00bc\3\2\2\2\24\2\3\4\5\6\u0212\u0217"+
		"\u0222\u0229\u0230\u0235\u023c\u0240\u0248\u024d\u0262\u0269\u0274\20"+
		"\b\2\2\7\3\2\3\24\2\6\2\2\3\31\3\7\2\2\7\6\2\3\67\4\3J\5\7\5\2\3T\6\3"+
		"U\7\3[\b\t\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}