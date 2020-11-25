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
		From=62, StandAlone=63, Use=64, Zero=65, PositiveInteger=66, START_STRING=67, 
		STATE_IDENTIFIER=68, IDENTIFIER=69, WS=70, Comment=71, REGEX_TEXT=72, 
		END_REGEX=73, StartCharacterCode=74, StartStringInterpolate=75, STRING_TEXT=76, 
		END_STRING=77, Bytes=78, Bytes_WS=79, EndBytes=80;
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
			"From", "StandAlone", "Use", "Zero", "PositiveInteger", "Digits", "START_STRING", 
			"STATE_IDENTIFIER", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", "StartCharacterCode", 
			"StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING", 
			"Bytes", "Bytes_WS", "StartBytesExpression", "EndBytes"
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
			"'use'", "'0'", null, null, null, null, null, null, null, "'''", null, 
			null, null, null, null, null, "'x]'"
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
			"From", "StandAlone", "Use", "Zero", "PositiveInteger", "START_STRING", 
			"STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "END_STRING", 
			"Bytes", "Bytes_WS", "EndBytes"
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
		case 67:
			START_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
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
		case 81:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u025f\b\1\b\1\b"+
		"\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
		"\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4"+
		"\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)"+
		"\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3B\3B\3C\3C\5C\u01ed\nC\3D\6D\u01f0\nD\rD\16D\u01f1\3E\3"+
		"E\3E\3E\3E\3F\3F\7F\u01fb\nF\fF\16F\u01fe\13F\3G\3G\7G\u0202\nG\fG\16"+
		"G\u0205\13G\3H\3H\3I\3I\5I\u020b\nI\3J\6J\u020e\nJ\rJ\16J\u020f\3J\3J"+
		"\3K\7K\u0215\nK\fK\16K\u0218\13K\3K\5K\u021b\nK\3K\3K\3K\3L\6L\u0221\n"+
		"L\rL\16L\u0222\3M\3M\3M\5M\u0228\nM\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3"+
		"P\3P\3P\3P\3P\3Q\6Q\u023b\nQ\rQ\16Q\u023c\3R\3R\3R\3R\3R\5R\u0244\nR\3"+
		"S\3S\3S\3S\3S\3T\3T\6T\u024d\nT\rT\16T\u024e\3U\3U\3U\3U\3V\3V\3V\3V\3"+
		"V\3V\3W\3W\3W\3W\3W\2\2X\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32"+
		"\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g"+
		"\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089"+
		"D\u008b\2\u008dE\u008fF\u0091G\u0093\2\u0095\2\u0097H\u0099I\u009bJ\u009d"+
		"\2\u009fK\u00a1L\u00a3M\u00a5N\u00a7\2\u00a9O\u00abP\u00adQ\u00af\2\u00b1"+
		"R\7\2\3\4\5\6\f\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\5\2\13\f\17\17\"\""+
		"\3\2\f\f\3\3\f\f\3\2))\4\2&&))\4\2\62;ch\2\u0262\2\7\3\2\2\2\2\t\3\2\2"+
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
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2"+
		"\2\4\u009b\3\2\2\2\4\u009f\3\2\2\2\5\u00a1\3\2\2\2\5\u00a3\3\2\2\2\5\u00a5"+
		"\3\2\2\2\5\u00a9\3\2\2\2\6\u00ab\3\2\2\2\6\u00ad\3\2\2\2\6\u00af\3\2\2"+
		"\2\6\u00b1\3\2\2\2\7\u00b3\3\2\2\2\t\u00b9\3\2\2\2\13\u00c1\3\2\2\2\r"+
		"\u00c6\3\2\2\2\17\u00ca\3\2\2\2\21\u00cf\3\2\2\2\23\u00d2\3\2\2\2\25\u00dc"+
		"\3\2\2\2\27\u00e7\3\2\2\2\31\u00ea\3\2\2\2\33\u00ec\3\2\2\2\35\u00ee\3"+
		"\2\2\2\37\u00f0\3\2\2\2!\u00f2\3\2\2\2#\u00f4\3\2\2\2%\u00f6\3\2\2\2\'"+
		"\u00fb\3\2\2\2)\u00fe\3\2\2\2+\u0104\3\2\2\2-\u0106\3\2\2\2/\u0108\3\2"+
		"\2\2\61\u010c\3\2\2\2\63\u010e\3\2\2\2\65\u0113\3\2\2\2\67\u0118\3\2\2"+
		"\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u011e\3\2\2\2?\u0120\3\2\2\2A\u0125"+
		"\3\2\2\2C\u0127\3\2\2\2E\u0129\3\2\2\2G\u0133\3\2\2\2I\u013a\3\2\2\2K"+
		"\u013f\3\2\2\2M\u0148\3\2\2\2O\u0152\3\2\2\2Q\u015b\3\2\2\2S\u015f\3\2"+
		"\2\2U\u0164\3\2\2\2W\u016a\3\2\2\2Y\u016f\3\2\2\2[\u0171\3\2\2\2]\u0174"+
		"\3\2\2\2_\u0176\3\2\2\2a\u0178\3\2\2\2c\u017a\3\2\2\2e\u017d\3\2\2\2g"+
		"\u0181\3\2\2\2i\u0183\3\2\2\2k\u0185\3\2\2\2m\u0187\3\2\2\2o\u0189\3\2"+
		"\2\2q\u0190\3\2\2\2s\u0195\3\2\2\2u\u019c\3\2\2\2w\u01a9\3\2\2\2y\u01ae"+
		"\3\2\2\2{\u01b7\3\2\2\2}\u01c0\3\2\2\2\177\u01c9\3\2\2\2\u0081\u01d3\3"+
		"\2\2\2\u0083\u01d8\3\2\2\2\u0085\u01e4\3\2\2\2\u0087\u01e8\3\2\2\2\u0089"+
		"\u01ea\3\2\2\2\u008b\u01ef\3\2\2\2\u008d\u01f3\3\2\2\2\u008f\u01f8\3\2"+
		"\2\2\u0091\u01ff\3\2\2\2\u0093\u0206\3\2\2\2\u0095\u020a\3\2\2\2\u0097"+
		"\u020d\3\2\2\2\u0099\u0216\3\2\2\2\u009b\u0220\3\2\2\2\u009d\u0227\3\2"+
		"\2\2\u009f\u0229\3\2\2\2\u00a1\u022d\3\2\2\2\u00a3\u0234\3\2\2\2\u00a5"+
		"\u023a\3\2\2\2\u00a7\u0243\3\2\2\2\u00a9\u0245\3\2\2\2\u00ab\u024c\3\2"+
		"\2\2\u00ad\u0250\3\2\2\2\u00af\u0254\3\2\2\2\u00b1\u025a\3\2\2\2\u00b3"+
		"\u00b4\7\61\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b"+
		"\2\2\2\u00b7\u00b8\b\2\3\2\u00b8\b\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7X\2\2\u00c2"+
		"\u00c3\7Q\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7F\2\2\u00c5\f\3\2\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7h\2\2\u00c9\16\3\2\2\2\u00ca"+
		"\u00cb\7y\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7p\2\2"+
		"\u00ce\20\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7q\2\2\u00d1\22\3\2\2"+
		"\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7u\2\2\u00da\u00db\7g\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7q\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7{\2\2\u00e4\u00e5"+
		"\7r\2\2\u00e5\u00e6\7g\2\2\u00e6\26\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9"+
		"\7@\2\2\u00e9\30\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\32\3\2\2\2\u00ec\u00ed"+
		"\7&\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7`\2\2\u00ef\36\3\2\2\2\u00f0\u00f1"+
		"\7(\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\"\3\2\2\2\u00f4\u00f5"+
		"\7<\2\2\u00f5$\3\2\2\2\u00f6\u00f7\7<\2\2\u00f7\u00f8\7<\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fa\5\u0091G\2\u00fa&\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc"+
		"\u00fd\5\u0091G\2\u00fd(\3\2\2\2\u00fe\u00ff\7=\2\2\u00ff\u0100\6\23\2"+
		"\2\u0100\u0101\b\23\4\2\u0101\u0102\3\2\2\2\u0102\u0103\b\23\5\2\u0103"+
		"*\3\2\2\2\u0104\u0105\7=\2\2\u0105,\3\2\2\2\u0106\u0107\7.\2\2\u0107."+
		"\3\2\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\60\2\2\u010a\u010b\7\60\2"+
		"\2\u010b\60\3\2\2\2\u010c\u010d\7\u0080\2\2\u010d\62\3\2\2\2\u010e\u010f"+
		"\7*\2\2\u010f\u0110\b\30\6\2\u0110\u0111\3\2\2\2\u0111\u0112\b\30\7\2"+
		"\u0112\64\3\2\2\2\u0113\u0114\7+\2\2\u0114\u0115\6\31\3\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\b\31\5\2\u0117\66\3\2\2\2\u0118\u0119\7]\2\2\u0119"+
		"8\3\2\2\2\u011a\u011b\7_\2\2\u011b:\3\2\2\2\u011c\u011d\7}\2\2\u011d<"+
		"\3\2\2\2\u011e\u011f\7\177\2\2\u011f>\3\2\2\2\u0120\u0121\7]\2\2\u0121"+
		"\u0122\7z\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\36\b\2\u0124@\3\2\2\2"+
		"\u0125\u0126\7>\2\2\u0126B\3\2\2\2\u0127\u0128\7^\2\2\u0128D\3\2\2\2\u0129"+
		"\u012a\7v\2\2\u012a\u012b\7g\2\2\u012b\u012c\7o\2\2\u012c\u012d\7r\2\2"+
		"\u012d\u012e\7n\2\2\u012e\u012f\7c\2\2\u012f\u0130\7v\2\2\u0130\u0131"+
		"\7g\2\2\u0131\u0132\7u\2\2\u0132F\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135"+
		"\7q\2\2\u0135\u0136\7w\2\2\u0136\u0137\7t\2\2\u0137\u0138\7e\2\2\u0138"+
		"\u0139\7g\2\2\u0139H\3\2\2\2\u013a\u013b\7u\2\2\u013b\u013c\7k\2\2\u013c"+
		"\u013d\7p\2\2\u013d\u013e\7m\2\2\u013eJ\3\2\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7q\2\2\u0141\u0142\7o\2\2\u0142\u0143\7r\2\2\u0143\u0144\7q\2\2"+
		"\u0144\u0145\7u\2\2\u0145\u0146\7g\2\2\u0146\u0147\7t\2\2\u0147L\3\2\2"+
		"\2\u0148\u0149\7r\2\2\u0149\u014a\7t\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7e\2\2\u014c\u014d\7g\2\2\u014d\u014e\7u\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7q\2\2\u0150\u0151\7t\2\2\u0151N\3\2\2\2\u0152\u0153\7q\2\2\u0153"+
		"\u0154\7r\2\2\u0154\u0155\7g\2\2\u0155\u0156\7t\2\2\u0156\u0157\7c\2\2"+
		"\u0157\u0158\7v\2\2\u0158\u0159\7q\2\2\u0159\u015a\7t\2\2\u015aP\3\2\2"+
		"\2\u015b\u015c\7g\2\2\u015c\u015d\7p\2\2\u015d\u015e\7f\2\2\u015eR\3\2"+
		"\2\2\u015f\u0160\7t\2\2\u0160\u0161\7w\2\2\u0161\u0162\7n\2\2\u0162\u0163"+
		"\7g\2\2\u0163T\3\2\2\2\u0164\u0165\7h\2\2\u0165\u0166\7k\2\2\u0166\u0167"+
		"\7t\2\2\u0167\u0168\7u\2\2\u0168\u0169\7v\2\2\u0169V\3\2\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7c\2\2\u016c\u016d\7u\2\2\u016d\u016e\7v\2\2\u016e"+
		"X\3\2\2\2\u016f\u0170\7%\2\2\u0170Z\3\2\2\2\u0171\u0172\7\60\2\2\u0172"+
		"\u0173\7\60\2\2\u0173\\\3\2\2\2\u0174\u0175\7-\2\2\u0175^\3\2\2\2\u0176"+
		"\u0177\7/\2\2\u0177`\3\2\2\2\u0178\u0179\7,\2\2\u0179b\3\2\2\2\u017a\u017b"+
		"\7\u0080\2\2\u017b\u017c\7\61\2\2\u017cd\3\2\2\2\u017d\u017e\7o\2\2\u017e"+
		"\u017f\7q\2\2\u017f\u0180\7f\2\2\u0180f\3\2\2\2\u0181\u0182\7A\2\2\u0182"+
		"h\3\2\2\2\u0183\u0184\7?\2\2\u0184j\3\2\2\2\u0185\u0186\7~\2\2\u0186l"+
		"\3\2\2\2\u0187\u0188\7@\2\2\u0188n\3\2\2\2\u0189\u018a\7A\2\2\u018a\u018b"+
		"\7*\2\2\u018b\u018c\3\2\2\2\u018c\u018d\b\66\t\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\b\66\7\2\u018fp\3\2\2\2\u0190\u0191\7v\2\2\u0191\u0192\7g\2\2\u0192"+
		"\u0193\7u\2\2\u0193\u0194\7v\2\2\u0194r\3\2\2\2\u0195\u0196\7c\2\2\u0196"+
		"\u0197\7u\2\2\u0197\u0198\7u\2\2\u0198\u0199\7g\2\2\u0199\u019a\7t\2\2"+
		"\u019a\u019b\7v\2\2\u019bt\3\2\2\2\u019c\u019d\7e\2\2\u019d\u019e\7q\2"+
		"\2\u019e\u019f\7t\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7/\2\2\u01a1\u01a2"+
		"\7u\2\2\u01a2\u01a3\7{\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7v\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7o\2\2\u01a7\u01a8\7\61\2\2\u01a8v\3\2\2\2\u01a9"+
		"\u01aa\7y\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7j\2\2"+
		"\u01adx\3\2\2\2\u01ae\u01af\7r\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1\7q\2"+
		"\2\u01b1\u01b2\7x\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7f\2\2\u01b4\u01b5"+
		"\7g\2\2\u01b5\u01b6\7f\2\2\u01b6z\3\2\2\2\u01b7\u01b8\7o\2\2\u01b8\u01b9"+
		"\7q\2\2\u01b9\u01ba\7f\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7h\2\2\u01bc"+
		"\u01bd\7k\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7f\2\2\u01bf|\3\2\2\2\u01c0"+
		"\u01c1\7u\2\2\u01c1\u01c2\7j\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7f\2\2"+
		"\u01c4\u01c5\7q\2\2\u01c5\u01c6\7y\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c8"+
		"\7f\2\2\u01c8~\3\2\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc"+
		"\7j\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7k\2\2\u01cf"+
		"\u01d0\7v\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7f\2\2\u01d2\u0080\3\2\2"+
		"\2\u01d3\u01d4\7h\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7"+
		"\7o\2\2\u01d7\u0082\3\2\2\2\u01d8\u01d9\7u\2\2\u01d9\u01da\7v\2\2\u01da"+
		"\u01db\7c\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7f\2\2\u01dd\u01de\7/\2\2"+
		"\u01de\u01df\7c\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2"+
		"\7p\2\2\u01e2\u01e3\7g\2\2\u01e3\u0084\3\2\2\2\u01e4\u01e5\7w\2\2\u01e5"+
		"\u01e6\7u\2\2\u01e6\u01e7\7g\2\2\u01e7\u0086\3\2\2\2\u01e8\u01e9\7\62"+
		"\2\2\u01e9\u0088\3\2\2\2\u01ea\u01ec\t\2\2\2\u01eb\u01ed\5\u008bD\2\u01ec"+
		"\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u008a\3\2\2\2\u01ee\u01f0\t\3"+
		"\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u008c\3\2\2\2\u01f3\u01f4\7)\2\2\u01f4\u01f5\bE\n"+
		"\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\bE\13\2\u01f7\u008e\3\2\2\2\u01f8\u01fc"+
		"\7B\2\2\u01f9\u01fb\5\u0095I\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0090\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01ff\u0203\5\u0093H\2\u0200\u0202\5\u0095I\2\u0201\u0200\3\2"+
		"\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0092\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\t\4\2\2\u0207\u0094\3\2"+
		"\2\2\u0208\u020b\5\u0093H\2\u0209\u020b\t\5\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u0096\3\2\2\2\u020c\u020e\t\6\2\2\u020d\u020c\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\bJ\2\2\u0212\u0098\3\2\2\2\u0213\u0215\n\7"+
		"\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\t\b"+
		"\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\bK\2\2\u021d"+
		"\u021e\bK\5\2\u021e\u009a\3\2\2\2\u021f\u0221\5\u009dM\2\u0220\u021f\3"+
		"\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u009c\3\2\2\2\u0224\u0225\7)\2\2\u0225\u0228\7)\2\2\u0226\u0228\n\t\2"+
		"\2\u0227\u0224\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u009e\3\2\2\2\u0229\u022a"+
		"\7)\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bN\5\2\u022c\u00a0\3\2\2\2\u022d"+
		"\u022e\7&\2\2\u022e\u022f\7%\2\2\u022f\u0230\3\2\2\2\u0230\u0231\bO\f"+
		"\2\u0231\u0232\3\2\2\2\u0232\u0233\bO\7\2\u0233\u00a2\3\2\2\2\u0234\u0235"+
		"\7&\2\2\u0235\u0236\bP\r\2\u0236\u0237\3\2\2\2\u0237\u0238\bP\7\2\u0238"+
		"\u00a4\3\2\2\2\u0239\u023b\5\u00a7R\2\u023a\u0239\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u00a6\3\2\2\2\u023e"+
		"\u023f\7)\2\2\u023f\u0244\7)\2\2\u0240\u0241\7&\2\2\u0241\u0244\7&\2\2"+
		"\u0242\u0244\n\n\2\2\u0243\u023e\3\2\2\2\u0243\u0240\3\2\2\2\u0243\u0242"+
		"\3\2\2\2\u0244\u00a8\3\2\2\2\u0245\u0246\7)\2\2\u0246\u0247\6S\4\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\bS\5\2\u0249\u00aa\3\2\2\2\u024a\u024b\t\13"+
		"\2\2\u024b\u024d\t\13\2\2\u024c\u024a\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u00ac\3\2\2\2\u0250\u0251\5\u0097"+
		"J\2\u0251\u0252\3\2\2\2\u0252\u0253\bU\2\2\u0253\u00ae\3\2\2\2\u0254\u0255"+
		"\5\63\30\2\u0255\u0256\bV\16\2\u0256\u0257\3\2\2\2\u0257\u0258\bV\17\2"+
		"\u0258\u0259\bV\7\2\u0259\u00b0\3\2\2\2\u025a\u025b\7z\2\2\u025b\u025c"+
		"\7_\2\2\u025c\u025d\3\2\2\2\u025d\u025e\bW\5\2\u025e\u00b2\3\2\2\2\24"+
		"\2\3\4\5\6\u01ec\u01f1\u01fc\u0203\u020a\u020f\u0216\u021a\u0222\u0227"+
		"\u023c\u0243\u024e\20\b\2\2\7\3\2\3\23\2\6\2\2\3\30\3\7\2\2\7\6\2\3\66"+
		"\4\3E\5\7\5\2\3O\6\3P\7\3V\b\t\31\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}