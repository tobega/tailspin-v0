// Generated from TailspinLexer.g4 by ANTLR 4.7.2
package tailspin.parser;
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Package=2, Import=3, Void=4, Def=5, To=6, ResultMarker=7, 
		SinkReference=8, SourceReference=9, DeleteState=10, At=11, Colon=12, Message=13, 
		FieldReference=14, EndStringInterpolate=15, SemiColon=16, Comma=17, Deconstructor=18, 
		Invert=19, LeftParen=20, RightParen=21, LeftBracket=22, RightBracket=23, 
		LeftBrace=24, RightBrace=25, StartMatcher=26, StartTemplatesDefinition=27, 
		StartSourceDefinition=28, StartSinkDefinition=29, StartComposerDefinition=30, 
		StartProcessorDefinition=31, EndDefinition=32, Rule=33, TemplateMatch=34, 
		Range=35, Plus=36, Minus=37, Star=38, Slash=39, Mod=40, Question=41, Equal=42, 
		Zero=43, PositiveInteger=44, START_STRING=45, IDENTIFIER=46, WS=47, Else=48, 
		EndMatcher=49, BeginSuchThat=50, Comment=51, REGEX_TEXT=52, END_REGEX=53, 
		StartCharacterCode=54, StartStringInterpolate=55, STRING_TEXT=56, END_STRING=57;
	public static final int
		COMMENT_MODE=1, IN_REGEX=2, IN_STRING=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MODE", "IN_REGEX", "IN_STRING"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
			"SinkReference", "SourceReference", "DeleteState", "At", "Colon", "Message", 
			"FieldReference", "EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", 
			"Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartMatcher", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "Rule", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"Slash", "Mod", "Question", "Equal", "Zero", "PositiveInteger", "Digits", 
			"START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", 
			"WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", "REGEX_TEXT", 
			"REGEX_CHAR", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'!VOID'", null, "'->'", "'!'", 
			null, null, null, "'@'", "':'", null, null, null, "';'", "','", "'...'", 
			"'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", 
			"'source'", "'sink'", "'composer'", "'processor'", "'end'", "'rule'", 
			"'#'", "'..'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", 
			null, null, null, null, "'|'", "'>'", "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
			"SinkReference", "SourceReference", "DeleteState", "At", "Colon", "Message", 
			"FieldReference", "EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", 
			"Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "StartMatcher", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "Rule", "TemplateMatch", "Range", "Plus", "Minus", "Star", 
			"Slash", "Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"REGEX_TEXT", "END_REGEX", "StartCharacterCode", "StartStringInterpolate", 
			"STRING_TEXT", "END_STRING"
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


	  int stringInterpolate = 0;


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
		case 14:
			EndStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 58:
			StartStringInterpolate_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EndStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			stringInterpolate--;
			break;
		}
	}
	private void StartCharacterCode_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 stringInterpolate++; 
			break;
		}
	}
	private void StartStringInterpolate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 stringInterpolate++; 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return EndStringInterpolate_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EndStringInterpolate_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return stringInterpolate > 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0193\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\5\t"+
		"\u00af\n\t\3\n\3\n\5\n\u00b3\n\n\3\n\5\n\u00b6\n\n\3\13\3\13\3\13\5\13"+
		"\u00bb\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u0136\n-\3.\6.\u0139\n"+
		".\r.\16.\u013a\3/\3/\3/\3/\3\60\3\60\7\60\u0143\n\60\f\60\16\60\u0146"+
		"\13\60\3\61\3\61\3\62\3\62\5\62\u014c\n\62\3\63\6\63\u014f\n\63\r\63\16"+
		"\63\u0150\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\7\67\u015f\n\67\f\67\16\67\u0162\13\67\3\67\5\67\u0165\n\67\3\67\3\67"+
		"\3\67\38\68\u016b\n8\r8\168\u016c\39\39\39\59\u0172\n9\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\6=\u0185\n=\r=\16=\u0186\3>\3>\3"+
		">\3>\3>\5>\u018e\n>\3?\3?\3?\3?\2\2@\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24"+
		"\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30"+
		"\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\.^\2"+
		"`/b\60d\2f\2h\61j\62l\63n\64p\65r\66t\2v\67x8z9|:~\2\u0080;\6\2\3\4\5"+
		"\13\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\61;aa\3\2\f\f\3\3"+
		"\f\f\3\2))\4\2&&))\2\u019a\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2"+
		"\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2"+
		"\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3"+
		"\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2"+
		"\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3"+
		"\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2"+
		"\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2"+
		"T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2`\3\2\2\2\2b\3"+
		"\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\3p\3\2\2\2\4r\3\2\2"+
		"\2\4v\3\2\2\2\5x\3\2\2\2\5z\3\2\2\2\5|\3\2\2\2\5\u0080\3\2\2\2\6\u0082"+
		"\3\2\2\2\b\u0088\3\2\2\2\n\u0090\3\2\2\2\f\u0097\3\2\2\2\16\u009d\3\2"+
		"\2\2\20\u00a3\3\2\2\2\22\u00a6\3\2\2\2\24\u00a8\3\2\2\2\26\u00b0\3\2\2"+
		"\2\30\u00b7\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2\2\2"+
		" \u00c5\3\2\2\2\"\u00c8\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3"+
		"\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00dc\3\2\2\2\60\u00e0\3\2\2\2\62"+
		"\u00e2\3\2\2\2\64\u00e4\3\2\2\2\66\u00e6\3\2\2\28\u00e8\3\2\2\2:\u00ea"+
		"\3\2\2\2<\u00f4\3\2\2\2>\u00fb\3\2\2\2@\u0100\3\2\2\2B\u0109\3\2\2\2D"+
		"\u0113\3\2\2\2F\u0117\3\2\2\2H\u011c\3\2\2\2J\u011e\3\2\2\2L\u0121\3\2"+
		"\2\2N\u0123\3\2\2\2P\u0125\3\2\2\2R\u0127\3\2\2\2T\u0129\3\2\2\2V\u012d"+
		"\3\2\2\2X\u012f\3\2\2\2Z\u0131\3\2\2\2\\\u0133\3\2\2\2^\u0138\3\2\2\2"+
		"`\u013c\3\2\2\2b\u0140\3\2\2\2d\u0147\3\2\2\2f\u014b\3\2\2\2h\u014e\3"+
		"\2\2\2j\u0154\3\2\2\2l\u0156\3\2\2\2n\u0158\3\2\2\2p\u0160\3\2\2\2r\u016a"+
		"\3\2\2\2t\u0171\3\2\2\2v\u0173\3\2\2\2x\u0177\3\2\2\2z\u017e\3\2\2\2|"+
		"\u0184\3\2\2\2~\u018d\3\2\2\2\u0080\u018f\3\2\2\2\u0082\u0083\7\61\2\2"+
		"\u0083\u0084\7\61\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086\u0087"+
		"\b\2\3\2\u0087\7\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7e\2\2\u008b\u008c\7m\2\2\u008c\u008d\7c\2\2\u008d\u008e\7i\2\2\u008e"+
		"\u008f\7g\2\2\u008f\t\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092"+
		"\u0093\7r\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2"+
		"\u0096\13\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7X\2\2\u0099\u009a\7"+
		"Q\2\2\u009a\u009b\7K\2\2\u009b\u009c\7F\2\2\u009c\r\3\2\2\2\u009d\u009e"+
		"\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\t\2\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7@\2\2"+
		"\u00a5\21\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\23\3\2\2\2\u00a8\u00ae\5\22"+
		"\b\2\u00a9\u00ab\5\32\f\2\u00aa\u00ac\5b\60\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00af\5b\60\2\u00ae\u00a9\3\2"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b2\7&\2\2\u00b1\u00b3"+
		"\5\32\f\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2"+
		"\u00b4\u00b6\5b\60\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\27"+
		"\3\2\2\2\u00b7\u00b8\7`\2\2\u00b8\u00ba\5\32\f\2\u00b9\u00bb\5b\60\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00bd\7B\2\2"+
		"\u00bd\33\3\2\2\2\u00be\u00bf\7<\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7<\2"+
		"\2\u00c1\u00c2\7<\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5b\60\2\u00c4\37"+
		"\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\5b\60\2\u00c7!\3\2\2\2\u00c8"+
		"\u00c9\7=\2\2\u00c9\u00ca\6\20\2\2\u00ca\u00cb\b\20\4\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00cd\b\20\5\2\u00cd#\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf%\3"+
		"\2\2\2\u00d0\u00d1\7.\2\2\u00d1\'\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4"+
		"\7\60\2\2\u00d4\u00d5\7\60\2\2\u00d5)\3\2\2\2\u00d6\u00d7\7\u0080\2\2"+
		"\u00d7+\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\25"+
		"\6\2\u00db-\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b\26\5\2\u00df/\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\61\3\2\2\2\u00e2\u00e3"+
		"\7_\2\2\u00e3\63\3\2\2\2\u00e4\u00e5\7}\2\2\u00e5\65\3\2\2\2\u00e6\u00e7"+
		"\7\177\2\2\u00e7\67\3\2\2\2\u00e8\u00e9\7>\2\2\u00e99\3\2\2\2\u00ea\u00eb"+
		"\7v\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2"+
		"\u00f2\u00f3\7u\2\2\u00f3;\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7q\2"+
		"\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa=\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe"+
		"\7p\2\2\u00fe\u00ff\7m\2\2\u00ff?\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102"+
		"\7q\2\2\u0102\u0103\7o\2\2\u0103\u0104\7r\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7u\2\2\u0106\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108A\3\2\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010d\7e\2\2"+
		"\u010d\u010e\7g\2\2\u010e\u010f\7u\2\2\u010f\u0110\7u\2\2\u0110\u0111"+
		"\7q\2\2\u0111\u0112\7t\2\2\u0112C\3\2\2\2\u0113\u0114\7g\2\2\u0114\u0115"+
		"\7p\2\2\u0115\u0116\7f\2\2\u0116E\3\2\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7w\2\2\u0119\u011a\7n\2\2\u011a\u011b\7g\2\2\u011bG\3\2\2\2\u011c\u011d"+
		"\7%\2\2\u011dI\3\2\2\2\u011e\u011f\7\60\2\2\u011f\u0120\7\60\2\2\u0120"+
		"K\3\2\2\2\u0121\u0122\7-\2\2\u0122M\3\2\2\2\u0123\u0124\7/\2\2\u0124O"+
		"\3\2\2\2\u0125\u0126\7,\2\2\u0126Q\3\2\2\2\u0127\u0128\7\61\2\2\u0128"+
		"S\3\2\2\2\u0129\u012a\7o\2\2\u012a\u012b\7q\2\2\u012b\u012c\7f\2\2\u012c"+
		"U\3\2\2\2\u012d\u012e\7A\2\2\u012eW\3\2\2\2\u012f\u0130\7?\2\2\u0130Y"+
		"\3\2\2\2\u0131\u0132\7\62\2\2\u0132[\3\2\2\2\u0133\u0135\t\3\2\2\u0134"+
		"\u0136\5^.\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136]\3\2\2\2\u0137"+
		"\u0139\t\4\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b_\3\2\2\2\u013c\u013d\7)\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\b/\7\2\u013fa\3\2\2\2\u0140\u0144\5d\61\2\u0141\u0143"+
		"\5f\62\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145c\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\t\5\2\2"+
		"\u0148e\3\2\2\2\u0149\u014c\5d\61\2\u014a\u014c\t\6\2\2\u014b\u0149\3"+
		"\2\2\2\u014b\u014a\3\2\2\2\u014cg\3\2\2\2\u014d\u014f\t\2\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\b\63\2\2\u0153i\3\2\2\2\u0154\u0155\7~\2\2"+
		"\u0155k\3\2\2\2\u0156\u0157\7@\2\2\u0157m\3\2\2\2\u0158\u0159\7A\2\2\u0159"+
		"\u015a\7*\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\66\6\2\u015co\3\2\2\2"+
		"\u015d\u015f\n\7\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\t\b\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b\67"+
		"\2\2\u0167\u0168\b\67\5\2\u0168q\3\2\2\2\u0169\u016b\5t9\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"s\3\2\2\2\u016e\u016f\7)\2\2\u016f\u0172\7)\2\2\u0170\u0172\n\t\2\2\u0171"+
		"\u016e\3\2\2\2\u0171\u0170\3\2\2\2\u0172u\3\2\2\2\u0173\u0174\7)\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\b:\5\2\u0176w\3\2\2\2\u0177\u0178\7&\2\2\u0178"+
		"\u0179\7%\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b;\b\2\u017b\u017c\3\2\2"+
		"\2\u017c\u017d\b;\6\2\u017dy\3\2\2\2\u017e\u017f\7&\2\2\u017f\u0180\b"+
		"<\t\2\u0180\u0181\3\2\2\2\u0181\u0182\b<\6\2\u0182{\3\2\2\2\u0183\u0185"+
		"\5~>\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187}\3\2\2\2\u0188\u0189\7)\2\2\u0189\u018e\7)\2\2\u018a"+
		"\u018b\7&\2\2\u018b\u018e\7&\2\2\u018c\u018e\n\n\2\2\u018d\u0188\3\2\2"+
		"\2\u018d\u018a\3\2\2\2\u018d\u018c\3\2\2\2\u018e\177\3\2\2\2\u018f\u0190"+
		"\7)\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b?\5\2\u0192\u0081\3\2\2\2\26"+
		"\2\3\4\5\u00ab\u00ae\u00b2\u00b5\u00ba\u0135\u013a\u0144\u014b\u0150\u0160"+
		"\u0164\u016c\u0171\u0186\u018d\n\b\2\2\7\3\2\3\20\2\6\2\2\7\2\2\7\5\2"+
		"\3;\3\3<\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}