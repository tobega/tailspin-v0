// Generated from TailspinLexer.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, EndIdentifier=7, 
		LeftParen=8, RightParen=9, StartMatcher=10, EndMatcher=11, StartDereference=12, 
		Range=13, AdditiveOperator=14, Zero=15, NonZeroInteger=16, START_STRING=17, 
		IDENTIFIER=18, WS=19, StringEvaluate=20, StringDereference=21, STRING_TEXT=22, 
		END_STRING=23;
	public static final int
		IN_STRING=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING"
	};

	public static final String[] ruleNames = {
		"Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"LeftParen", "RightParen", "StartMatcher", "EndMatcher", "StartDereference", 
		"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
		"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringEvaluate", 
		"StringDereference", "STRING_TEXT", "STRING_CHAR", "END_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, null, "'\n'", "':'", "';'", "'('", "')'", 
		"'<'", "'>'", "'$'", "'..'", null, "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"LeftParen", "RightParen", "StartMatcher", "EndMatcher", "StartDereference", 
		"Range", "AdditiveOperator", "Zero", "NonZeroInteger", "START_STRING", 
		"IDENTIFIER", "WS", "StringEvaluate", "StringDereference", "STRING_TEXT", 
		"END_STRING"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ab\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4K\n\4\3\5\5\5N\n\5\3\5\3\5\3\5\3\5"+
		"\5\5T\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21r\n"+
		"\21\3\21\3\21\5\21v\n\21\3\22\6\22y\n\22\r\22\16\22z\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\7\24\u0083\n\24\f\24\16\24\u0086\13\24\3\25\3\25\3\26\3"+
		"\26\5\26\u008c\n\26\3\27\6\27\u008f\n\27\r\27\16\27\u0090\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u009d\n\32\r\32\16\32\u009e"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u00a6\n\33\3\34\3\34\3\34\3\34\2\2\35\4"+
		"\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21"+
		"\"\22$\2&\23(\24*\2,\2.\25\60\26\62\27\64\30\66\28\31\4\2\3\t\5\2\13\f"+
		"\17\17\"\"\4\2--//\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u00b1"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2"+
		"\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2&\3\2"+
		"\2\2\2(\3\2\2\2\2.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\38\3"+
		"\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fU\3\2\2\2\16W\3\2"+
		"\2\2\20Y\3\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30e\3\2\2\2\32g\3"+
		"\2\2\2\34i\3\2\2\2\36l\3\2\2\2 n\3\2\2\2\"q\3\2\2\2$x\3\2\2\2&|\3\2\2"+
		"\2(\u0080\3\2\2\2*\u0087\3\2\2\2,\u008b\3\2\2\2.\u008e\3\2\2\2\60\u0094"+
		"\3\2\2\2\62\u0099\3\2\2\2\64\u009c\3\2\2\2\66\u00a5\3\2\2\28\u00a7\3\2"+
		"\2\2:;\7u\2\2;<\7v\2\2<=\7f\2\2=>\7q\2\2>?\7w\2\2?@\7v\2\2@\5\3\2\2\2"+
		"AB\7f\2\2BC\7g\2\2CD\7h\2\2DE\3\2\2\2EF\t\2\2\2F\7\3\2\2\2GH\5\32\r\2"+
		"HJ\5(\24\2IK\5\20\b\2JI\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LN\5\f\6\2ML\3\2\2"+
		"\2MN\3\2\2\2NO\3\2\2\2OP\7/\2\2PQ\7@\2\2QS\3\2\2\2RT\5\f\6\2SR\3\2\2\2"+
		"ST\3\2\2\2T\13\3\2\2\2UV\7\f\2\2V\r\3\2\2\2WX\7<\2\2X\17\3\2\2\2YZ\7="+
		"\2\2Z\21\3\2\2\2[\\\7*\2\2\\]\3\2\2\2]^\b\t\2\2^\23\3\2\2\2_`\7+\2\2`"+
		"a\3\2\2\2ab\b\n\3\2b\25\3\2\2\2cd\7>\2\2d\27\3\2\2\2ef\7@\2\2f\31\3\2"+
		"\2\2gh\7&\2\2h\33\3\2\2\2ij\7\60\2\2jk\7\60\2\2k\35\3\2\2\2lm\t\3\2\2"+
		"m\37\3\2\2\2no\7\62\2\2o!\3\2\2\2pr\7/\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2"+
		"\2su\t\4\2\2tv\5$\22\2ut\3\2\2\2uv\3\2\2\2v#\3\2\2\2wy\t\5\2\2xw\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{%\3\2\2\2|}\7)\2\2}~\3\2\2\2~\177\b\23"+
		"\4\2\177\'\3\2\2\2\u0080\u0084\5*\25\2\u0081\u0083\5,\26\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		")\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\t\6\2\2\u0088+\3\2\2\2\u0089"+
		"\u008c\5*\25\2\u008a\u008c\t\7\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c-\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\b\27\5\2\u0093/\3\2\2\2\u0094\u0095\5\32\r\2\u0095\u0096\5\22\t"+
		"\2\u0096\u0097\3\2\2\2\u0097\u0098\b\30\2\2\u0098\61\3\2\2\2\u0099\u009a"+
		"\5\b\4\2\u009a\63\3\2\2\2\u009b\u009d\5\66\33\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\65\3\2\2"+
		"\2\u00a0\u00a1\7)\2\2\u00a1\u00a6\7)\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a6"+
		"\7&\2\2\u00a4\u00a6\n\b\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\67\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00aa\b\34\3\2\u00aa9\3\2\2\2\17\2\3JMSquz\u0084\u008b\u0090\u009e"+
		"\u00a5\6\7\2\2\6\2\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}