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
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, EndIdentifier=7, 
		Range=8, DecimalLiteral=9, START_STRING=10, IDENTIFIER=11, WS=12, StringInterpolate=13, 
		STRING_TEXT=14, END_STRING=15;
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
			"Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "DecimalLiteral", "Digits", "START_STRING", "IDENTIFIER", "IDENTIFIER_START", 
			"IDENTIFIER_PART", "WS", "StringInterpolate", "STRING_TEXT", "STRING_CHAR", 
			"END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "DecimalLiteral", "START_STRING", "IDENTIFIER", "WS", "StringInterpolate", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0081\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\5\nK\n\n\3\n\3\n\5\nO\n\n\5\nQ\n\n\3\13\6\13T\n\13"+
		"\r\13\16\13U\3\f\3\f\3\f\3\f\3\r\3\r\7\r^\n\r\f\r\16\ra\13\r\3\16\3\16"+
		"\3\17\3\17\5\17g\n\17\3\20\6\20j\n\20\r\20\16\20k\3\20\3\20\3\21\3\21"+
		"\3\22\6\22s\n\22\r\22\16\22t\3\23\3\23\3\23\3\23\3\23\5\23|\n\23\3\24"+
		"\3\24\3\24\3\24\2\2\25\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\2\30"+
		"\f\32\r\34\2\36\2 \16\"\17$\20&\2(\21\4\2\3\b\5\2\13\f\17\17\"\"\3\2\63"+
		";\3\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u0086\2\4\3\2\2\2\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2"+
		"\2\2\2\24\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2 \3\2\2\2\3\"\3\2\2\2\3$"+
		"\3\2\2\2\3(\3\2\2\2\4*\3\2\2\2\6\61\3\2\2\2\b\67\3\2\2\2\n<\3\2\2\2\f"+
		"?\3\2\2\2\16A\3\2\2\2\20C\3\2\2\2\22E\3\2\2\2\24P\3\2\2\2\26S\3\2\2\2"+
		"\30W\3\2\2\2\32[\3\2\2\2\34b\3\2\2\2\36f\3\2\2\2 i\3\2\2\2\"o\3\2\2\2"+
		"$r\3\2\2\2&{\3\2\2\2(}\3\2\2\2*+\7u\2\2+,\7v\2\2,-\7f\2\2-.\7q\2\2./\7"+
		"w\2\2/\60\7v\2\2\60\5\3\2\2\2\61\62\7f\2\2\62\63\7g\2\2\63\64\7h\2\2\64"+
		"\65\3\2\2\2\65\66\t\2\2\2\66\7\3\2\2\2\678\7&\2\28:\5\32\r\29;\7=\2\2"+
		":9\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<=\7/\2\2=>\7@\2\2>\13\3\2\2\2?@\7\f\2"+
		"\2@\r\3\2\2\2AB\7<\2\2B\17\3\2\2\2CD\7=\2\2D\21\3\2\2\2EF\7\60\2\2FG\7"+
		"\60\2\2G\23\3\2\2\2HQ\7\62\2\2IK\7/\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2"+
		"LN\t\3\2\2MO\5\26\13\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PH\3\2\2\2PJ\3\2\2"+
		"\2Q\25\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\27\3"+
		"\2\2\2WX\7)\2\2XY\3\2\2\2YZ\b\f\2\2Z\31\3\2\2\2[_\5\34\16\2\\^\5\36\17"+
		"\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\33\3\2\2\2a_\3\2\2\2bc\t"+
		"\5\2\2c\35\3\2\2\2dg\5\34\16\2eg\t\6\2\2fd\3\2\2\2fe\3\2\2\2g\37\3\2\2"+
		"\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\20"+
		"\3\2n!\3\2\2\2op\5\b\4\2p#\3\2\2\2qs\5&\23\2rq\3\2\2\2st\3\2\2\2tr\3\2"+
		"\2\2tu\3\2\2\2u%\3\2\2\2vw\7)\2\2w|\7)\2\2xy\7&\2\2y|\7&\2\2z|\n\7\2\2"+
		"{v\3\2\2\2{x\3\2\2\2{z\3\2\2\2|\'\3\2\2\2}~\7)\2\2~\177\3\2\2\2\177\u0080"+
		"\b\24\4\2\u0080)\3\2\2\2\16\2\3:JNPU_fkt{\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}