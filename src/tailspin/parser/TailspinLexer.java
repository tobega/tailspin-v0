// Generated from Tailspin.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, Stdout=4, Def=5, Dereference=6, STRING=7, IDENTIFIER=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Stdout", "Def", "Dereference", "STRING", "STRING_CHAR", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'->'", "':'", "'stdout'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Stdout", "Def", "Dereference", "STRING", "IDENTIFIER", 
			"WS"
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
	public String getGrammarFileName() { return "Tailspin.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13T\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\65\n\b\f\b\16\b"+
		"8\13\b\3\b\3\b\3\t\3\t\3\t\5\t?\n\t\3\n\3\n\7\nC\n\n\f\n\16\nF\13\n\3"+
		"\13\3\13\3\f\3\f\5\fL\n\f\3\r\6\rO\n\r\r\r\16\rP\3\r\3\r\2\2\16\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\2\27\2\31\13\3\2\6\5\2\13\f\17\17"+
		"\"\"\3\2))\4\2C\\c|\4\2\62;aa\2U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\31\3\2"+
		"\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13)\3\2\2\2\r/\3"+
		"\2\2\2\17\62\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25G\3\2\2\2\27K\3\2\2\2\31"+
		"N\3\2\2\2\33\34\7\f\2\2\34\4\3\2\2\2\35\36\7/\2\2\36\37\7@\2\2\37\6\3"+
		"\2\2\2 !\7<\2\2!\b\3\2\2\2\"#\7u\2\2#$\7v\2\2$%\7f\2\2%&\7q\2\2&\'\7w"+
		"\2\2\'(\7v\2\2(\n\3\2\2\2)*\7f\2\2*+\7g\2\2+,\7h\2\2,-\3\2\2\2-.\t\2\2"+
		"\2.\f\3\2\2\2/\60\7&\2\2\60\61\5\23\n\2\61\16\3\2\2\2\62\66\7)\2\2\63"+
		"\65\5\21\t\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"9\3\2\2\28\66\3\2\2\29:\7)\2\2:\20\3\2\2\2;<\7)\2\2<?\7)\2\2=?\n\3\2\2"+
		">;\3\2\2\2>=\3\2\2\2?\22\3\2\2\2@D\5\25\13\2AC\5\27\f\2BA\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\24\3\2\2\2FD\3\2\2\2GH\t\4\2\2H\26\3\2\2\2"+
		"IL\5\25\13\2JL\t\5\2\2KI\3\2\2\2KJ\3\2\2\2L\30\3\2\2\2MO\t\2\2\2NM\3\2"+
		"\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\r\2\2S\32\3\2\2\2\b\2"+
		"\66>DKP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}