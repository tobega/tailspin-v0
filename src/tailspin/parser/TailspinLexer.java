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
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, START_STRING=7, 
		IDENTIFIER=8, WS=9, StringInterpolate=10, STRING_TEXT=11, END_STRING=12;
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
			"Stdout", "Def", "Dereference", "To", "Eol", "Colon", "START_STRING", 
			"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringInterpolate", 
			"STRING_TEXT", "STRING_CHAR", "END_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "'\n'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "START_STRING", 
			"IDENTIFIER", "WS", "StringInterpolate", "STRING_TEXT", "END_STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16a\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\n\3\n\3\13\3\13"+
		"\5\13I\n\13\3\f\6\fL\n\f\r\f\16\fM\3\f\3\f\3\r\3\r\3\16\6\16U\n\16\r\16"+
		"\16\16V\3\17\3\17\3\17\5\17\\\n\17\3\20\3\20\3\20\3\20\2\2\21\4\3\6\4"+
		"\b\5\n\6\f\7\16\b\20\t\22\n\24\2\26\2\30\13\32\f\34\r\36\2 \16\4\2\3\6"+
		"\5\2\13\f\17\17\"\"\4\2C\\c|\4\2\62;aa\3\2))\2a\2\4\3\2\2\2\2\6\3\2\2"+
		"\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3 \3\2\2\2\4\"\3\2\2\2"+
		"\6)\3\2\2\2\b/\3\2\2\2\n\62\3\2\2\2\f\65\3\2\2\2\16\67\3\2\2\2\209\3\2"+
		"\2\2\22=\3\2\2\2\24D\3\2\2\2\26H\3\2\2\2\30K\3\2\2\2\32Q\3\2\2\2\34T\3"+
		"\2\2\2\36[\3\2\2\2 ]\3\2\2\2\"#\7u\2\2#$\7v\2\2$%\7f\2\2%&\7q\2\2&\'\7"+
		"w\2\2\'(\7v\2\2(\5\3\2\2\2)*\7f\2\2*+\7g\2\2+,\7h\2\2,-\3\2\2\2-.\t\2"+
		"\2\2.\7\3\2\2\2/\60\7&\2\2\60\61\5\22\t\2\61\t\3\2\2\2\62\63\7/\2\2\63"+
		"\64\7@\2\2\64\13\3\2\2\2\65\66\7\f\2\2\66\r\3\2\2\2\678\7<\2\28\17\3\2"+
		"\2\29:\7)\2\2:;\3\2\2\2;<\b\b\2\2<\21\3\2\2\2=A\5\24\n\2>@\5\26\13\2?"+
		">\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\23\3\2\2\2CA\3\2\2\2DE\t\3\2"+
		"\2E\25\3\2\2\2FI\5\24\n\2GI\t\4\2\2HF\3\2\2\2HG\3\2\2\2I\27\3\2\2\2JL"+
		"\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\f\3\2P"+
		"\31\3\2\2\2QR\5\b\4\2R\33\3\2\2\2SU\5\36\17\2TS\3\2\2\2UV\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2W\35\3\2\2\2XY\7)\2\2Y\\\7)\2\2Z\\\n\5\2\2[X\3\2\2\2["+
		"Z\3\2\2\2\\\37\3\2\2\2]^\7)\2\2^_\3\2\2\2_`\b\20\4\2`!\3\2\2\2\t\2\3A"+
		"HMV[\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}