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
		Stdout=1, Def=2, Dereference=3, To=4, Colon=5, EndIdentifier=6, LeftParen=7, 
		RightParen=8, StartMatcher=9, EndMatcher=10, StartTemplatesDefinition=11, 
		EndDefinition=12, StartDereference=13, Range=14, AdditiveOperator=15, 
		Zero=16, NonZeroInteger=17, START_STRING=18, IDENTIFIER=19, WS=20, StringEvaluate=21, 
		StringDereference=22, STRING_TEXT=23, END_STRING=24;
	public static final int
		IN_STRING=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Stdout", "Def", "Dereference", "To", "Colon", "EndIdentifier", "LeftParen", 
			"RightParen", "StartMatcher", "EndMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "StartDereference", "Range", "AdditiveOperator", "Zero", 
			"NonZeroInteger", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
			"STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "':'", "';'", "'('", "')'", "'<'", 
			"'>'", "'templates'", "'end'", "'$'", "'..'", null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Colon", "EndIdentifier", 
			"LeftParen", "RightParen", "StartMatcher", "EndMatcher", "StartTemplatesDefinition", 
			"EndDefinition", "StartDereference", "Range", "AdditiveOperator", "Zero", 
			"NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StringEvaluate", 
			"StringDereference", "STRING_TEXT", "END_STRING"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00b3\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\5\22z\n\22\3\22\3\22\5\22~\n\22\3\23\6\23\u0081"+
		"\n\23\r\23\16\23\u0082\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u008b\n\25\f"+
		"\25\16\25\u008e\13\25\3\26\3\26\3\27\3\27\5\27\u0094\n\27\3\30\6\30\u0097"+
		"\n\30\r\30\16\30\u0098\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\6\33\u00a5\n\33\r\33\16\33\u00a6\3\34\3\34\3\34\3\34\3\34\5\34\u00ae"+
		"\n\34\3\35\3\35\3\35\3\35\2\2\36\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\2(\24*\25,\2.\2\60\26\62"+
		"\27\64\30\66\318\2:\32\4\2\3\t\5\2\13\f\17\17\"\"\4\2--//\3\2\63;\3\2"+
		"\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00b7\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3"+
		"\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2"+
		"\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36"+
		"\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2\60"+
		"\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\3:\3\2\2\2\4<\3\2\2\2"+
		"\6C\3\2\2\2\bI\3\2\2\2\nN\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22"+
		"Y\3\2\2\2\24]\3\2\2\2\26_\3\2\2\2\30a\3\2\2\2\32k\3\2\2\2\34o\3\2\2\2"+
		"\36q\3\2\2\2 t\3\2\2\2\"v\3\2\2\2$y\3\2\2\2&\u0080\3\2\2\2(\u0084\3\2"+
		"\2\2*\u0088\3\2\2\2,\u008f\3\2\2\2.\u0093\3\2\2\2\60\u0096\3\2\2\2\62"+
		"\u009c\3\2\2\2\64\u00a1\3\2\2\2\66\u00a4\3\2\2\28\u00ad\3\2\2\2:\u00af"+
		"\3\2\2\2<=\7u\2\2=>\7v\2\2>?\7f\2\2?@\7q\2\2@A\7w\2\2AB\7v\2\2B\5\3\2"+
		"\2\2CD\7f\2\2DE\7g\2\2EF\7h\2\2FG\3\2\2\2GH\t\2\2\2H\7\3\2\2\2IJ\5\34"+
		"\16\2JL\5*\25\2KM\5\16\7\2LK\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NO\7/\2\2OP\7"+
		"@\2\2P\13\3\2\2\2QR\7<\2\2R\r\3\2\2\2ST\7=\2\2T\17\3\2\2\2UV\7*\2\2VW"+
		"\3\2\2\2WX\b\b\2\2X\21\3\2\2\2YZ\7+\2\2Z[\3\2\2\2[\\\b\t\3\2\\\23\3\2"+
		"\2\2]^\7>\2\2^\25\3\2\2\2_`\7@\2\2`\27\3\2\2\2ab\7v\2\2bc\7g\2\2cd\7o"+
		"\2\2de\7r\2\2ef\7n\2\2fg\7c\2\2gh\7v\2\2hi\7g\2\2ij\7u\2\2j\31\3\2\2\2"+
		"kl\7g\2\2lm\7p\2\2mn\7f\2\2n\33\3\2\2\2op\7&\2\2p\35\3\2\2\2qr\7\60\2"+
		"\2rs\7\60\2\2s\37\3\2\2\2tu\t\3\2\2u!\3\2\2\2vw\7\62\2\2w#\3\2\2\2xz\7"+
		"/\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\t\4\2\2|~\5&\23\2}|\3\2\2\2}~\3"+
		"\2\2\2~%\3\2\2\2\177\u0081\t\5\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\'\3\2\2\2\u0084\u0085"+
		"\7)\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\24\4\2\u0087)\3\2\2\2\u0088"+
		"\u008c\5,\26\2\u0089\u008b\5.\27\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d+\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0090\t\6\2\2\u0090-\3\2\2\2\u0091\u0094\5,\26\2\u0092"+
		"\u0094\t\7\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094/\3\2\2\2"+
		"\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\30\5\2"+
		"\u009b\61\3\2\2\2\u009c\u009d\5\34\16\2\u009d\u009e\5\20\b\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\b\31\2\2\u00a0\63\3\2\2\2\u00a1\u00a2\5\b\4\2\u00a2"+
		"\65\3\2\2\2\u00a3\u00a5\58\34\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\67\3\2\2\2\u00a8\u00a9"+
		"\7)\2\2\u00a9\u00ae\7)\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ae\7&\2\2\u00ac"+
		"\u00ae\n\b\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae9\3\2\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\b\35\3\2\u00b2;\3\2\2\2\r\2\3Ly}\u0082\u008c\u0093\u0098\u00a6\u00ad"+
		"\6\7\2\2\6\2\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}