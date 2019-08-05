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
		StartProcessorDefinition=31, EndDefinition=32, TemplateMatch=33, Range=34, 
		Plus=35, Minus=36, Star=37, Slash=38, Mod=39, Question=40, Equal=41, Zero=42, 
		PositiveInteger=43, START_STRING=44, IDENTIFIER=45, WS=46, Else=47, EndMatcher=48, 
		BeginSuchThat=49, Comment=50, REGEX_TEXT=51, END_REGEX=52, StartCharacterCode=53, 
		StartStringInterpolate=54, STRING_TEXT=55, END_STRING=56;
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
			"EndDefinition", "TemplateMatch", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "Digits", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "Else", "EndMatcher", 
			"BeginSuchThat", "Comment", "REGEX_TEXT", "REGEX_CHAR", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'!VOID'", null, "'->'", "'!'", 
			null, null, null, "'@'", "':'", null, null, null, "';'", "','", "'...'", 
			"'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", 
			"'source'", "'sink'", "'composer'", "'processor'", "'end'", "'#'", "'..'", 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", null, null, 
			null, null, "'|'", "'>'", "'?('"
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
			"EndDefinition", "TemplateMatch", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
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
		case 56:
			StartCharacterCode_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u018c\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\5\t\u00ad"+
		"\n\t\3\n\3\n\5\n\u00b1\n\n\3\n\5\n\u00b4\n\n\3\13\3\13\3\13\5\13\u00b9"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\5,\u012f\n,\3-\6-\u0132\n-\r-\16-\u0133\3.\3.\3.\3.\3"+
		"/\3/\7/\u013c\n/\f/\16/\u013f\13/\3\60\3\60\3\61\3\61\5\61\u0145\n\61"+
		"\3\62\6\62\u0148\n\62\r\62\16\62\u0149\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\7\66\u0158\n\66\f\66\16\66\u015b\13\66\3"+
		"\66\5\66\u015e\n\66\3\66\3\66\3\66\3\67\6\67\u0164\n\67\r\67\16\67\u0165"+
		"\38\38\38\58\u016b\n8\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;"+
		"\3<\6<\u017e\n<\r<\16<\u017f\3=\3=\3=\3=\3=\5=\u0187\n=\3>\3>\3>\3>\2"+
		"\2?\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20"+
		"\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37"+
		"@ B!D\"F#H$J%L&N\'P(R)T*V+X,Z-\\\2^.`/b\2d\2f\60h\61j\62l\63n\64p\65r"+
		"\2t\66v\67x8z9|\2~:\6\2\3\4\5\13\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4"+
		"\2C\\c|\4\2\61;aa\3\2\f\f\3\3\f\f\3\2))\4\2&&))\2\u0193\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2"+
		"\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2"+
		"\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2"+
		"\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2"+
		"\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2"+
		"\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N"+
		"\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2"+
		"\2\2\2^\3\2\2\2\2`\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2"+
		"\3n\3\2\2\2\4p\3\2\2\2\4t\3\2\2\2\5v\3\2\2\2\5x\3\2\2\2\5z\3\2\2\2\5~"+
		"\3\2\2\2\6\u0080\3\2\2\2\b\u0086\3\2\2\2\n\u008e\3\2\2\2\f\u0095\3\2\2"+
		"\2\16\u009b\3\2\2\2\20\u00a1\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2"+
		"\26\u00ae\3\2\2\2\30\u00b5\3\2\2\2\32\u00ba\3\2\2\2\34\u00bc\3\2\2\2\36"+
		"\u00be\3\2\2\2 \u00c3\3\2\2\2\"\u00c6\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3"+
		"\2\2\2(\u00d0\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00da\3\2\2\2\60"+
		"\u00de\3\2\2\2\62\u00e0\3\2\2\2\64\u00e2\3\2\2\2\66\u00e4\3\2\2\28\u00e6"+
		"\3\2\2\2:\u00e8\3\2\2\2<\u00f2\3\2\2\2>\u00f9\3\2\2\2@\u00fe\3\2\2\2B"+
		"\u0107\3\2\2\2D\u0111\3\2\2\2F\u0115\3\2\2\2H\u0117\3\2\2\2J\u011a\3\2"+
		"\2\2L\u011c\3\2\2\2N\u011e\3\2\2\2P\u0120\3\2\2\2R\u0122\3\2\2\2T\u0126"+
		"\3\2\2\2V\u0128\3\2\2\2X\u012a\3\2\2\2Z\u012c\3\2\2\2\\\u0131\3\2\2\2"+
		"^\u0135\3\2\2\2`\u0139\3\2\2\2b\u0140\3\2\2\2d\u0144\3\2\2\2f\u0147\3"+
		"\2\2\2h\u014d\3\2\2\2j\u014f\3\2\2\2l\u0151\3\2\2\2n\u0159\3\2\2\2p\u0163"+
		"\3\2\2\2r\u016a\3\2\2\2t\u016c\3\2\2\2v\u0170\3\2\2\2x\u0177\3\2\2\2z"+
		"\u017d\3\2\2\2|\u0186\3\2\2\2~\u0188\3\2\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\7\61\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\2\2\2\u0084\u0085\b"+
		"\2\3\2\u0085\7\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7e\2\2\u0089\u008a\7m\2\2\u008a\u008b\7c\2\2\u008b\u008c\7i\2\2\u008c"+
		"\u008d\7g\2\2\u008d\t\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7r\2\2\u0091\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093\u0094\7v\2\2"+
		"\u0094\13\3\2\2\2\u0095\u0096\7#\2\2\u0096\u0097\7X\2\2\u0097\u0098\7"+
		"Q\2\2\u0098\u0099\7K\2\2\u0099\u009a\7F\2\2\u009a\r\3\2\2\2\u009b\u009c"+
		"\7f\2\2\u009c\u009d\7g\2\2\u009d\u009e\7h\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\t\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7@\2\2"+
		"\u00a3\21\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\23\3\2\2\2\u00a6\u00ac\5\22"+
		"\b\2\u00a7\u00a9\5\32\f\2\u00a8\u00aa\5`/\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\5`/\2\u00ac\u00a7\3\2\2"+
		"\2\u00ac\u00ab\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00b0\7&\2\2\u00af\u00b1"+
		"\5\32\f\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2"+
		"\u00b2\u00b4\5`/\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3"+
		"\2\2\2\u00b5\u00b6\7`\2\2\u00b6\u00b8\5\32\f\2\u00b7\u00b9\5`/\2\u00b8"+
		"\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\31\3\2\2\2\u00ba\u00bb\7B\2\2"+
		"\u00bb\33\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7<\2"+
		"\2\u00bf\u00c0\7<\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5`/\2\u00c2\37\3"+
		"\2\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c5\5`/\2\u00c5!\3\2\2\2\u00c6\u00c7"+
		"\7=\2\2\u00c7\u00c8\6\20\2\2\u00c8\u00c9\b\20\4\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\b\20\5\2\u00cb#\3\2\2\2\u00cc\u00cd\7=\2\2\u00cd%\3\2\2\2"+
		"\u00ce\u00cf\7.\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1\u00d2\7"+
		"\60\2\2\u00d2\u00d3\7\60\2\2\u00d3)\3\2\2\2\u00d4\u00d5\7\u0080\2\2\u00d5"+
		"+\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\25\6\2"+
		"\u00d9-\3\2\2\2\u00da\u00db\7+\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\26"+
		"\5\2\u00dd/\3\2\2\2\u00de\u00df\7]\2\2\u00df\61\3\2\2\2\u00e0\u00e1\7"+
		"_\2\2\u00e1\63\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3\65\3\2\2\2\u00e4\u00e5"+
		"\7\177\2\2\u00e5\67\3\2\2\2\u00e6\u00e7\7>\2\2\u00e79\3\2\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7r\2\2\u00ec"+
		"\u00ed\7n\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7u\2\2\u00f1;\3\2\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7q\2"+
		"\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8=\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc"+
		"\7p\2\2\u00fc\u00fd\7m\2\2\u00fd?\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100"+
		"\7q\2\2\u0100\u0101\7o\2\2\u0101\u0102\7r\2\2\u0102\u0103\7q\2\2\u0103"+
		"\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\u0106\7t\2\2\u0106A\3\2\2\2\u0107"+
		"\u0108\7r\2\2\u0108\u0109\7t\2\2\u0109\u010a\7q\2\2\u010a\u010b\7e\2\2"+
		"\u010b\u010c\7g\2\2\u010c\u010d\7u\2\2\u010d\u010e\7u\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7t\2\2\u0110C\3\2\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7p\2\2\u0113\u0114\7f\2\2\u0114E\3\2\2\2\u0115\u0116\7%\2\2\u0116G\3"+
		"\2\2\2\u0117\u0118\7\60\2\2\u0118\u0119\7\60\2\2\u0119I\3\2\2\2\u011a"+
		"\u011b\7-\2\2\u011bK\3\2\2\2\u011c\u011d\7/\2\2\u011dM\3\2\2\2\u011e\u011f"+
		"\7,\2\2\u011fO\3\2\2\2\u0120\u0121\7\61\2\2\u0121Q\3\2\2\2\u0122\u0123"+
		"\7o\2\2\u0123\u0124\7q\2\2\u0124\u0125\7f\2\2\u0125S\3\2\2\2\u0126\u0127"+
		"\7A\2\2\u0127U\3\2\2\2\u0128\u0129\7?\2\2\u0129W\3\2\2\2\u012a\u012b\7"+
		"\62\2\2\u012bY\3\2\2\2\u012c\u012e\t\3\2\2\u012d\u012f\5\\-\2\u012e\u012d"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f[\3\2\2\2\u0130\u0132\t\4\2\2\u0131"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134]\3\2\2\2\u0135\u0136\7)\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\b.\7\2\u0138_\3\2\2\2\u0139\u013d\5b\60\2\u013a\u013c\5d\61\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"a\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\t\5\2\2\u0141c\3\2\2\2\u0142"+
		"\u0145\5b\60\2\u0143\u0145\t\6\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2"+
		"\2\2\u0145e\3\2\2\2\u0146\u0148\t\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\b\62\2\2\u014cg\3\2\2\2\u014d\u014e\7~\2\2\u014ei\3\2\2\2\u014f"+
		"\u0150\7@\2\2\u0150k\3\2\2\2\u0151\u0152\7A\2\2\u0152\u0153\7*\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\b\65\6\2\u0155m\3\2\2\2\u0156\u0158\n\7\2\2"+
		"\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\t\b\2\2\u015d"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b\66\2\2\u0160\u0161\b"+
		"\66\5\2\u0161o\3\2\2\2\u0162\u0164\5r8\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166q\3\2\2\2\u0167"+
		"\u0168\7)\2\2\u0168\u016b\7)\2\2\u0169\u016b\n\t\2\2\u016a\u0167\3\2\2"+
		"\2\u016a\u0169\3\2\2\2\u016bs\3\2\2\2\u016c\u016d\7)\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016f\b9\5\2\u016fu\3\2\2\2\u0170\u0171\7&\2\2\u0171\u0172"+
		"\7%\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b:\b\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\b:\6\2\u0176w\3\2\2\2\u0177\u0178\7&\2\2\u0178\u0179\b;\t\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\b;\6\2\u017by\3\2\2\2\u017c\u017e\5|=\2\u017d"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180{\3\2\2\2\u0181\u0182\7)\2\2\u0182\u0187\7)\2\2\u0183\u0184"+
		"\7&\2\2\u0184\u0187\7&\2\2\u0185\u0187\n\n\2\2\u0186\u0181\3\2\2\2\u0186"+
		"\u0183\3\2\2\2\u0186\u0185\3\2\2\2\u0187}\3\2\2\2\u0188\u0189\7)\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\b>\5\2\u018b\177\3\2\2\2\26\2\3\4\5\u00a9\u00ac"+
		"\u00b0\u00b3\u00b8\u012e\u0133\u013d\u0144\u0149\u0159\u015d\u0165\u016a"+
		"\u017f\u0186\n\b\2\2\7\3\2\3\20\2\6\2\2\7\2\2\7\5\2\3:\3\3;\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}