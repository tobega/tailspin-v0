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
		DecimalLiteral=8, START_STRING=9, IDENTIFIER=10, WS=11, StringInterpolate=12, 
		STRING_TEXT=13, END_STRING=14;
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
		"DecimalLiteral", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
		"IDENTIFIER_PART", "WS", "StringInterpolate", "STRING_TEXT", "STRING_CHAR", 
		"END_STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
		"DecimalLiteral", "START_STRING", "IDENTIFIER", "WS", "StringInterpolate", 
		"STRING_TEXT", "END_STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20|\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\5\49\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\tF\n\t\3\t"+
		"\3\t\5\tJ\n\t\5\tL\n\t\3\n\6\nO\n\n\r\n\16\nP\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\7\fY\n\f\f\f\16\f\\\13\f\3\r\3\r\3\16\3\16\5\16b\n\16\3\17\6\17e"+
		"\n\17\r\17\16\17f\3\17\3\17\3\20\3\20\3\21\6\21n\n\21\r\21\16\21o\3\22"+
		"\3\22\3\22\3\22\3\22\5\22w\n\22\3\23\3\23\3\23\3\23\2\2\24\4\3\6\4\b\5"+
		"\n\6\f\7\16\b\20\t\22\n\24\2\26\13\30\f\32\2\34\2\36\r \16\"\17$\2&\20"+
		"\4\2\3\b\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&)"+
		")\2\u0081\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2"+
		"\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\36"+
		"\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2\6/\3\2\2\2\b\65"+
		"\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22K\3\2\2\2\24"+
		"N\3\2\2\2\26R\3\2\2\2\30V\3\2\2\2\32]\3\2\2\2\34a\3\2\2\2\36d\3\2\2\2"+
		" j\3\2\2\2\"m\3\2\2\2$v\3\2\2\2&x\3\2\2\2()\7u\2\2)*\7v\2\2*+\7f\2\2+"+
		",\7q\2\2,-\7w\2\2-.\7v\2\2.\5\3\2\2\2/\60\7f\2\2\60\61\7g\2\2\61\62\7"+
		"h\2\2\62\63\3\2\2\2\63\64\t\2\2\2\64\7\3\2\2\2\65\66\7&\2\2\668\5\30\f"+
		"\2\679\7=\2\28\67\3\2\2\289\3\2\2\29\t\3\2\2\2:;\7/\2\2;<\7@\2\2<\13\3"+
		"\2\2\2=>\7\f\2\2>\r\3\2\2\2?@\7<\2\2@\17\3\2\2\2AB\7=\2\2B\21\3\2\2\2"+
		"CL\7\62\2\2DF\7/\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\t\3\2\2HJ\5\24\n"+
		"\2IH\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KC\3\2\2\2KE\3\2\2\2L\23\3\2\2\2MO\t\4"+
		"\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\25\3\2\2\2RS\7)\2\2ST\3"+
		"\2\2\2TU\b\13\2\2U\27\3\2\2\2VZ\5\32\r\2WY\5\34\16\2XW\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2Z[\3\2\2\2[\31\3\2\2\2\\Z\3\2\2\2]^\t\5\2\2^\33\3\2\2\2"+
		"_b\5\32\r\2`b\t\6\2\2a_\3\2\2\2a`\3\2\2\2b\35\3\2\2\2ce\t\2\2\2dc\3\2"+
		"\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\17\3\2i\37\3\2\2\2jk"+
		"\5\b\4\2k!\3\2\2\2ln\5$\22\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p"+
		"#\3\2\2\2qr\7)\2\2rw\7)\2\2st\7&\2\2tw\7&\2\2uw\n\7\2\2vq\3\2\2\2vs\3"+
		"\2\2\2vu\3\2\2\2w%\3\2\2\2xy\7)\2\2yz\3\2\2\2z{\b\23\4\2{\'\3\2\2\2\16"+
		"\2\38EIKPZafov\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}