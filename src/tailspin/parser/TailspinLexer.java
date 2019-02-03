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
		START_STRING=8, IDENTIFIER=9, WS=10, StringInterpolate=11, STRING_TEXT=12, 
		END_STRING=13;
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
		"START_STRING", "IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", 
		"StringInterpolate", "STRING_TEXT", "STRING_CHAR", "END_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"START_STRING", "IDENTIFIER", "WS", "StringInterpolate", "STRING_TEXT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17i\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nF\n\n\f"+
		"\n\16\nI\13\n\3\13\3\13\3\f\3\f\5\fO\n\f\3\r\6\rR\n\r\r\r\16\rS\3\r\3"+
		"\r\3\16\3\16\3\17\6\17[\n\17\r\17\16\17\\\3\20\3\20\3\20\3\20\3\20\5\20"+
		"d\n\20\3\21\3\21\3\21\3\21\2\2\22\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\2\30\2\32\f\34\r\36\16 \2\"\17\4\2\3\6\5\2\13\f\17\17\"\"\4\2C"+
		"\\c|\4\2\62;aa\4\2&&))\2k\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2"+
		"\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2"+
		"\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3\"\3\2\2\2\4$\3\2\2\2\6+\3\2\2"+
		"\2\b\61\3\2\2\2\n\66\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20=\3\2\2\2\22?\3"+
		"\2\2\2\24C\3\2\2\2\26J\3\2\2\2\30N\3\2\2\2\32Q\3\2\2\2\34W\3\2\2\2\36"+
		"Z\3\2\2\2 c\3\2\2\2\"e\3\2\2\2$%\7u\2\2%&\7v\2\2&\'\7f\2\2\'(\7q\2\2("+
		")\7w\2\2)*\7v\2\2*\5\3\2\2\2+,\7f\2\2,-\7g\2\2-.\7h\2\2./\3\2\2\2/\60"+
		"\t\2\2\2\60\7\3\2\2\2\61\62\7&\2\2\62\64\5\24\n\2\63\65\7=\2\2\64\63\3"+
		"\2\2\2\64\65\3\2\2\2\65\t\3\2\2\2\66\67\7/\2\2\678\7@\2\28\13\3\2\2\2"+
		"9:\7\f\2\2:\r\3\2\2\2;<\7<\2\2<\17\3\2\2\2=>\7=\2\2>\21\3\2\2\2?@\7)\2"+
		"\2@A\3\2\2\2AB\b\t\2\2B\23\3\2\2\2CG\5\26\13\2DF\5\30\f\2ED\3\2\2\2FI"+
		"\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\25\3\2\2\2IG\3\2\2\2JK\t\3\2\2K\27\3\2\2"+
		"\2LO\5\26\13\2MO\t\4\2\2NL\3\2\2\2NM\3\2\2\2O\31\3\2\2\2PR\t\2\2\2QP\3"+
		"\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\b\r\3\2V\33\3\2\2\2W"+
		"X\5\b\4\2X\35\3\2\2\2Y[\5 \20\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2"+
		"\2\2]\37\3\2\2\2^_\7)\2\2_d\7)\2\2`a\7&\2\2ad\7&\2\2bd\n\5\2\2c^\3\2\2"+
		"\2c`\3\2\2\2cb\3\2\2\2d!\3\2\2\2ef\7)\2\2fg\3\2\2\2gh\b\21\4\2h#\3\2\2"+
		"\2\n\2\3\64GNS\\c\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}