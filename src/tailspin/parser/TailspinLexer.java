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
		Program=66, Modify=67, Zero=68, PositiveInteger=69, START_STRING=70, STATE_IDENTIFIER=71, 
		IDENTIFIER=72, WS=73, Comment=74, REGEX_TEXT=75, END_REGEX=76, StartCharacterCode=77, 
		StartStringInterpolate=78, STRING_TEXT=79, END_STRING=80, Bytes=81, Bytes_WS=82, 
		EndBytes=83;
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
			"'stereotype'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", "'/'", 
			"':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, "'['", 
			"']'", "'{'", "'}'", "'[x'", "'<'", "'\\'", "'templates'", "'source'", 
			"'sink'", "'composer'", "'processor'", "'operator'", "'end'", "'rule'", 
			"'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", 
			"'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", "'core-system/'", 
			"'with'", "'provided'", "'modified'", "'shadowed'", "'inherited'", "'from'", 
			"'stand-alone'", "'use'", "'program'", "'modify'", "'0'", null, null, 
			null, null, null, null, null, "'''", null, null, null, null, null, null, 
			"'x]'"
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
		case 18:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			LeftParen_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			BeginCondition_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
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
		case 84:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u0276\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\3"+
		"8\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\5F\u0204\nF\3G\6G\u0207\nG\rG\16G\u0208"+
		"\3H\3H\3H\3H\3H\3I\3I\7I\u0212\nI\fI\16I\u0215\13I\3J\3J\7J\u0219\nJ\f"+
		"J\16J\u021c\13J\3K\3K\3L\3L\5L\u0222\nL\3M\6M\u0225\nM\rM\16M\u0226\3"+
		"M\3M\3N\7N\u022c\nN\fN\16N\u022f\13N\3N\5N\u0232\nN\3N\3N\3N\3O\6O\u0238"+
		"\nO\rO\16O\u0239\3P\3P\3P\5P\u023f\nP\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3"+
		"R\3S\3S\3S\3S\3S\3T\6T\u0252\nT\rT\16T\u0253\3U\3U\3U\3U\3U\5U\u025b\n"+
		"U\3V\3V\3V\3V\3V\3W\3W\6W\u0264\nW\rW\16W\u0265\3X\3X\3X\3X\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\2\2[\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13"+
		"\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65"+
		"\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62"+
		"g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089"+
		"D\u008bE\u008dF\u008fG\u0091\2\u0093H\u0095I\u0097J\u0099\2\u009b\2\u009d"+
		"K\u009fL\u00a1M\u00a3\2\u00a5N\u00a7O\u00a9P\u00abQ\u00ad\2\u00afR\u00b1"+
		"S\u00b3T\u00b5\2\u00b7U\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62"+
		";aa\5\2\13\f\17\17\"\"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u0279"+
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
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2"+
		"\2\4\u00a1\3\2\2\2\4\u00a5\3\2\2\2\5\u00a7\3\2\2\2\5\u00a9\3\2\2\2\5\u00ab"+
		"\3\2\2\2\5\u00af\3\2\2\2\6\u00b1\3\2\2\2\6\u00b3\3\2\2\2\6\u00b5\3\2\2"+
		"\2\6\u00b7\3\2\2\2\7\u00b9\3\2\2\2\t\u00bf\3\2\2\2\13\u00c7\3\2\2\2\r"+
		"\u00cc\3\2\2\2\17\u00d0\3\2\2\2\21\u00d5\3\2\2\2\23\u00d8\3\2\2\2\25\u00e2"+
		"\3\2\2\2\27\u00ed\3\2\2\2\31\u00f0\3\2\2\2\33\u00f2\3\2\2\2\35\u00f4\3"+
		"\2\2\2\37\u00f6\3\2\2\2!\u00f8\3\2\2\2#\u00fa\3\2\2\2%\u00fc\3\2\2\2\'"+
		"\u00fe\3\2\2\2)\u0103\3\2\2\2+\u0106\3\2\2\2-\u010c\3\2\2\2/\u010e\3\2"+
		"\2\2\61\u0110\3\2\2\2\63\u0114\3\2\2\2\65\u0116\3\2\2\2\67\u011b\3\2\2"+
		"\29\u0120\3\2\2\2;\u0122\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2\2\2A\u0128"+
		"\3\2\2\2C\u012d\3\2\2\2E\u012f\3\2\2\2G\u0131\3\2\2\2I\u013b\3\2\2\2K"+
		"\u0142\3\2\2\2M\u0147\3\2\2\2O\u0150\3\2\2\2Q\u015a\3\2\2\2S\u0163\3\2"+
		"\2\2U\u0167\3\2\2\2W\u016c\3\2\2\2Y\u0172\3\2\2\2[\u0177\3\2\2\2]\u0179"+
		"\3\2\2\2_\u017c\3\2\2\2a\u017e\3\2\2\2c\u0180\3\2\2\2e\u0182\3\2\2\2g"+
		"\u0185\3\2\2\2i\u0189\3\2\2\2k\u018b\3\2\2\2m\u018d\3\2\2\2o\u018f\3\2"+
		"\2\2q\u0191\3\2\2\2s\u0198\3\2\2\2u\u019d\3\2\2\2w\u01a4\3\2\2\2y\u01b1"+
		"\3\2\2\2{\u01b6\3\2\2\2}\u01bf\3\2\2\2\177\u01c8\3\2\2\2\u0081\u01d1\3"+
		"\2\2\2\u0083\u01db\3\2\2\2\u0085\u01e0\3\2\2\2\u0087\u01ec\3\2\2\2\u0089"+
		"\u01f0\3\2\2\2\u008b\u01f8\3\2\2\2\u008d\u01ff\3\2\2\2\u008f\u0201\3\2"+
		"\2\2\u0091\u0206\3\2\2\2\u0093\u020a\3\2\2\2\u0095\u020f\3\2\2\2\u0097"+
		"\u0216\3\2\2\2\u0099\u021d\3\2\2\2\u009b\u0221\3\2\2\2\u009d\u0224\3\2"+
		"\2\2\u009f\u022d\3\2\2\2\u00a1\u0237\3\2\2\2\u00a3\u023e\3\2\2\2\u00a5"+
		"\u0240\3\2\2\2\u00a7\u0244\3\2\2\2\u00a9\u024b\3\2\2\2\u00ab\u0251\3\2"+
		"\2\2\u00ad\u025a\3\2\2\2\u00af\u025c\3\2\2\2\u00b1\u0263\3\2\2\2\u00b3"+
		"\u0267\3\2\2\2\u00b5\u026b\3\2\2\2\u00b7\u0271\3\2\2\2\u00b9\u00ba\7\61"+
		"\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\2\2\2\u00bd"+
		"\u00be\b\2\3\2\u00be\b\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7e\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7f\2\2"+
		"\u00c5\u00c6\7g\2\2\u00c6\n\3\2\2\2\u00c7\u00c8\7X\2\2\u00c8\u00c9\7Q"+
		"\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7F\2\2\u00cb\f\3\2\2\2\u00cc\u00cd"+
		"\7f\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7h\2\2\u00cf\16\3\2\2\2\u00d0\u00d1"+
		"\7y\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\20\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2\2\u00d7\22\3\2\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7j\2\2\u00db\u00dc\7g\2\2"+
		"\u00dc\u00dd\7t\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7k\2\2\u00df\u00e0"+
		"\7u\2\2\u00e0\u00e1\7g\2\2\u00e1\24\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7q\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7{\2\2\u00ea\u00eb\7r\2\2"+
		"\u00eb\u00ec\7g\2\2\u00ec\26\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\u00ef\7"+
		"@\2\2\u00ef\30\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\32\3\2\2\2\u00f2\u00f3"+
		"\7&\2\2\u00f3\34\3\2\2\2\u00f4\u00f5\7`\2\2\u00f5\36\3\2\2\2\u00f6\u00f7"+
		"\7\u00a9\2\2\u00f7 \3\2\2\2\u00f8\u00f9\7(\2\2\u00f9\"\3\2\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb$\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd&\3\2\2\2\u00fe\u00ff"+
		"\7<\2\2\u00ff\u0100\7<\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5\u0097J\2"+
		"\u0102(\3\2\2\2\u0103\u0104\7\60\2\2\u0104\u0105\5\u0097J\2\u0105*\3\2"+
		"\2\2\u0106\u0107\7=\2\2\u0107\u0108\6\24\2\2\u0108\u0109\b\24\4\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\b\24\5\2\u010b,\3\2\2\2\u010c\u010d\7=\2\2"+
		"\u010d.\3\2\2\2\u010e\u010f\7.\2\2\u010f\60\3\2\2\2\u0110\u0111\7\60\2"+
		"\2\u0111\u0112\7\60\2\2\u0112\u0113\7\60\2\2\u0113\62\3\2\2\2\u0114\u0115"+
		"\7\u0080\2\2\u0115\64\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0118\b\31\6\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011a\b\31\7\2\u011a\66\3\2\2\2\u011b\u011c"+
		"\7+\2\2\u011c\u011d\6\32\3\2\u011d\u011e\3\2\2\2\u011e\u011f\b\32\5\2"+
		"\u011f8\3\2\2\2\u0120\u0121\7]\2\2\u0121:\3\2\2\2\u0122\u0123\7_\2\2\u0123"+
		"<\3\2\2\2\u0124\u0125\7}\2\2\u0125>\3\2\2\2\u0126\u0127\7\177\2\2\u0127"+
		"@\3\2\2\2\u0128\u0129\7]\2\2\u0129\u012a\7z\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\b\37\b\2\u012cB\3\2\2\2\u012d\u012e\7>\2\2\u012eD\3\2\2\2\u012f"+
		"\u0130\7^\2\2\u0130F\3\2\2\2\u0131\u0132\7v\2\2\u0132\u0133\7g\2\2\u0133"+
		"\u0134\7o\2\2\u0134\u0135\7r\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2"+
		"\u0137\u0138\7v\2\2\u0138\u0139\7g\2\2\u0139\u013a\7u\2\2\u013aH\3\2\2"+
		"\2\u013b\u013c\7u\2\2\u013c\u013d\7q\2\2\u013d\u013e\7w\2\2\u013e\u013f"+
		"\7t\2\2\u013f\u0140\7e\2\2\u0140\u0141\7g\2\2\u0141J\3\2\2\2\u0142\u0143"+
		"\7u\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2\u0145\u0146\7m\2\2\u0146"+
		"L\3\2\2\2\u0147\u0148\7e\2\2\u0148\u0149\7q\2\2\u0149\u014a\7o\2\2\u014a"+
		"\u014b\7r\2\2\u014b\u014c\7q\2\2\u014c\u014d\7u\2\2\u014d\u014e\7g\2\2"+
		"\u014e\u014f\7t\2\2\u014fN\3\2\2\2\u0150\u0151\7r\2\2\u0151\u0152\7t\2"+
		"\2\u0152\u0153\7q\2\2\u0153\u0154\7e\2\2\u0154\u0155\7g\2\2\u0155\u0156"+
		"\7u\2\2\u0156\u0157\7u\2\2\u0157\u0158\7q\2\2\u0158\u0159\7t\2\2\u0159"+
		"P\3\2\2\2\u015a\u015b\7q\2\2\u015b\u015c\7r\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\7t\2\2\u015e\u015f\7c\2\2\u015f\u0160\7v\2\2\u0160\u0161\7q\2\2"+
		"\u0161\u0162\7t\2\2\u0162R\3\2\2\2\u0163\u0164\7g\2\2\u0164\u0165\7p\2"+
		"\2\u0165\u0166\7f\2\2\u0166T\3\2\2\2\u0167\u0168\7t\2\2\u0168\u0169\7"+
		"w\2\2\u0169\u016a\7n\2\2\u016a\u016b\7g\2\2\u016bV\3\2\2\2\u016c\u016d"+
		"\7h\2\2\u016d\u016e\7k\2\2\u016e\u016f\7t\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7v\2\2\u0171X\3\2\2\2\u0172\u0173\7n\2\2\u0173\u0174\7c\2\2\u0174"+
		"\u0175\7u\2\2\u0175\u0176\7v\2\2\u0176Z\3\2\2\2\u0177\u0178\7%\2\2\u0178"+
		"\\\3\2\2\2\u0179\u017a\7\60\2\2\u017a\u017b\7\60\2\2\u017b^\3\2\2\2\u017c"+
		"\u017d\7-\2\2\u017d`\3\2\2\2\u017e\u017f\7/\2\2\u017fb\3\2\2\2\u0180\u0181"+
		"\7,\2\2\u0181d\3\2\2\2\u0182\u0183\7\u0080\2\2\u0183\u0184\7\61\2\2\u0184"+
		"f\3\2\2\2\u0185\u0186\7o\2\2\u0186\u0187\7q\2\2\u0187\u0188\7f\2\2\u0188"+
		"h\3\2\2\2\u0189\u018a\7A\2\2\u018aj\3\2\2\2\u018b\u018c\7?\2\2\u018cl"+
		"\3\2\2\2\u018d\u018e\7~\2\2\u018en\3\2\2\2\u018f\u0190\7@\2\2\u0190p\3"+
		"\2\2\2\u0191\u0192\7A\2\2\u0192\u0193\7*\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0195\b\67\t\2\u0195\u0196\3\2\2\2\u0196\u0197\b\67\7\2\u0197r\3\2\2"+
		"\2\u0198\u0199\7v\2\2\u0199\u019a\7g\2\2\u019a\u019b\7u\2\2\u019b\u019c"+
		"\7v\2\2\u019ct\3\2\2\2\u019d\u019e\7c\2\2\u019e\u019f\7u\2\2\u019f\u01a0"+
		"\7u\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7v\2\2\u01a3"+
		"v\3\2\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7t\2\2\u01a7"+
		"\u01a8\7g\2\2\u01a8\u01a9\7/\2\2\u01a9\u01aa\7u\2\2\u01aa\u01ab\7{\2\2"+
		"\u01ab\u01ac\7u\2\2\u01ac\u01ad\7v\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af"+
		"\7o\2\2\u01af\u01b0\7\61\2\2\u01b0x\3\2\2\2\u01b1\u01b2\7y\2\2\u01b2\u01b3"+
		"\7k\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7j\2\2\u01b5z\3\2\2\2\u01b6\u01b7"+
		"\7r\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7q\2\2\u01b9\u01ba\7x\2\2\u01ba"+
		"\u01bb\7k\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7f\2\2"+
		"\u01be|\3\2\2\2\u01bf\u01c0\7o\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7f\2"+
		"\2\u01c2\u01c3\7k\2\2\u01c3\u01c4\7h\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6"+
		"\7g\2\2\u01c6\u01c7\7f\2\2\u01c7~\3\2\2\2\u01c8\u01c9\7u\2\2\u01c9\u01ca"+
		"\7j\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7f\2\2\u01cc\u01cd\7q\2\2\u01cd"+
		"\u01ce\7y\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7f\2\2\u01d0\u0080\3\2\2"+
		"\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7j\2\2\u01d4\u01d5"+
		"\7g\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7v\2\2\u01d8"+
		"\u01d9\7g\2\2\u01d9\u01da\7f\2\2\u01da\u0082\3\2\2\2\u01db\u01dc\7h\2"+
		"\2\u01dc\u01dd\7t\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7o\2\2\u01df\u0084"+
		"\3\2\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7c\2\2\u01e3"+
		"\u01e4\7p\2\2\u01e4\u01e5\7f\2\2\u01e5\u01e6\7/\2\2\u01e6\u01e7\7c\2\2"+
		"\u01e7\u01e8\7n\2\2\u01e8\u01e9\7q\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb"+
		"\7g\2\2\u01eb\u0086\3\2\2\2\u01ec\u01ed\7w\2\2\u01ed\u01ee\7u\2\2\u01ee"+
		"\u01ef\7g\2\2\u01ef\u0088\3\2\2\2\u01f0\u01f1\7r\2\2\u01f1\u01f2\7t\2"+
		"\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7i\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6"+
		"\7c\2\2\u01f6\u01f7\7o\2\2\u01f7\u008a\3\2\2\2\u01f8\u01f9\7o\2\2\u01f9"+
		"\u01fa\7q\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7k\2\2\u01fc\u01fd\7h\2\2"+
		"\u01fd\u01fe\7{\2\2\u01fe\u008c\3\2\2\2\u01ff\u0200\7\62\2\2\u0200\u008e"+
		"\3\2\2\2\u0201\u0203\t\2\2\2\u0202\u0204\5\u0091G\2\u0203\u0202\3\2\2"+
		"\2\u0203\u0204\3\2\2\2\u0204\u0090\3\2\2\2\u0205\u0207\t\3\2\2\u0206\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u0092\3\2\2\2\u020a\u020b\7)\2\2\u020b\u020c\bH\n\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020e\bH\13\2\u020e\u0094\3\2\2\2\u020f\u0213\7B\2\2\u0210\u0212"+
		"\5\u009bL\2\u0211\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214\u0096\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u021a"+
		"\5\u0099K\2\u0217\u0219\5\u009bL\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0098\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021e\t\4\2\2\u021e\u009a\3\2\2\2\u021f\u0222\5\u0099"+
		"K\2\u0220\u0222\t\5\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\u009c\3\2\2\2\u0223\u0225\t\6\2\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\bM\2\2\u0229\u009e\3\2\2\2\u022a\u022c\n\7\2\2\u022b\u022a\3\2"+
		"\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0232\t\b\2\2\u0231\u0230\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0234\bN\2\2\u0234\u0235\bN\5\2\u0235\u00a0"+
		"\3\2\2\2\u0236\u0238\5\u00a3P\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u00a2\3\2\2\2\u023b\u023c"+
		"\7)\2\2\u023c\u023f\7)\2\2\u023d\u023f\n\t\2\2\u023e\u023b\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\u00a4\3\2\2\2\u0240\u0241\7)\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0243\bQ\5\2\u0243\u00a6\3\2\2\2\u0244\u0245\7&\2\2\u0245\u0246"+
		"\7%\2\2\u0246\u0247\3\2\2\2\u0247\u0248\bR\f\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024a\bR\7\2\u024a\u00a8\3\2\2\2\u024b\u024c\7&\2\2\u024c\u024d\bS\r"+
		"\2\u024d\u024e\3\2\2\2\u024e\u024f\bS\7\2\u024f\u00aa\3\2\2\2\u0250\u0252"+
		"\5\u00adU\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2\2"+
		"\2\u0253\u0254\3\2\2\2\u0254\u00ac\3\2\2\2\u0255\u0256\7)\2\2\u0256\u025b"+
		"\7)\2\2\u0257\u0258\7&\2\2\u0258\u025b\7&\2\2\u0259\u025b\n\n\2\2\u025a"+
		"\u0255\3\2\2\2\u025a\u0257\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u00ae\3\2"+
		"\2\2\u025c\u025d\7)\2\2\u025d\u025e\6V\4\2\u025e\u025f\3\2\2\2\u025f\u0260"+
		"\bV\5\2\u0260\u00b0\3\2\2\2\u0261\u0262\t\13\2\2\u0262\u0264\t\13\2\2"+
		"\u0263\u0261\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u00b2\3\2\2\2\u0267\u0268\5\u009dM\2\u0268\u0269\3\2\2"+
		"\2\u0269\u026a\bX\2\2\u026a\u00b4\3\2\2\2\u026b\u026c\5\65\31\2\u026c"+
		"\u026d\bY\16\2\u026d\u026e\3\2\2\2\u026e\u026f\bY\17\2\u026f\u0270\bY"+
		"\7\2\u0270\u00b6\3\2\2\2\u0271\u0272\7z\2\2\u0272\u0273\7_\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\bZ\5\2\u0275\u00b8\3\2\2\2\24\2\3\4\5\6\u0203\u0208"+
		"\u0213\u021a\u0221\u0226\u022d\u0231\u0239\u023e\u0253\u025a\u0265\20"+
		"\b\2\2\7\3\2\3\24\2\6\2\2\3\31\3\7\2\2\7\6\2\3\67\4\3H\5\7\5\2\3R\6\3"+
		"S\7\3Y\b\t\32\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}