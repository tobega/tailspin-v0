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
		Stdout=1, Def=2, Dereference=3, FieldDereference=4, To=5, Colon=6, Comma=7, 
		Deconstructor=8, EndIdentifier=9, LeftParen=10, RightParen=11, LeftBracket=12, 
		RightBracket=13, LeftBrace=14, RightBrace=15, Key=16, StartMatcher=17, 
		StartTemplatesDefinition=18, EndDefinition=19, TemplateMatch=20, StartDereference=21, 
		Range=22, AdditiveOperator=23, MultiplicativeOperator=24, Zero=25, NonZeroInteger=26, 
		START_STRING=27, IDENTIFIER=28, WS=29, StringEvaluate=30, StringDereference=31, 
		STRING_TEXT=32, END_STRING=33, StartSubMatcher=34, EndMatcher=35, MatchInteger=36, 
		RangeMatch=37, START_REGEXP=38, StartStructureMatch=39, EndStructureMatch=40, 
		StructureKey=41, MatcherIgnoreWS=42;
	public static final int
		IN_STRING=1, MATCHER=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "MATCHER"
	};

	public static final String[] ruleNames = {
		"Stdout", "Def", "Dereference", "FieldDereference", "To", "Colon", "Comma", 
		"Deconstructor", "EndIdentifier", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
		"EndDefinition", "TemplateMatch", "StartDereference", "Range", "AdditiveOperator", 
		"MultiplicativeOperator", "Zero", "NonZeroInteger", "Digits", "START_STRING", 
		"IDENTIFIER", "IDENTIFIER_START", "IDENTIFIER_PART", "WS", "StringEvaluate", 
		"StringDereference", "STRING_TEXT", "STRING_CHAR", "END_STRING", "StartSubMatcher", 
		"EndMatcher", "MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
		"EndStructureMatch", "StructureKey", "MatcherIgnoreWS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, null, "'->'", "':'", "','", "'...'", "';'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", "'end'", 
		"'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, null, 
		null, null, null, null, "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Stdout", "Def", "Dereference", "FieldDereference", "To", "Colon", 
		"Comma", "Deconstructor", "EndIdentifier", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", 
		"StartTemplatesDefinition", "EndDefinition", "TemplateMatch", "StartDereference", 
		"Range", "AdditiveOperator", "MultiplicativeOperator", "Zero", "NonZeroInteger", 
		"START_STRING", "IDENTIFIER", "WS", "StringEvaluate", "StringDereference", 
		"STRING_TEXT", "END_STRING", "StartSubMatcher", "EndMatcher", "MatchInteger", 
		"RangeMatch", "START_REGEXP", "StartStructureMatch", "EndStructureMatch", 
		"StructureKey", "MatcherIgnoreWS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0116\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4r\n\4\3\4\3\4\5\4v\n\4\5\4x\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\5\31\u00bc\n\31\3\32\3\32\3\33\5\33\u00c1\n\33\3"+
		"\33\3\33\5\33\u00c5\n\33\3\34\6\34\u00c8\n\34\r\34\16\34\u00c9\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\7\36\u00d2\n\36\f\36\16\36\u00d5\13\36\3\37\3"+
		"\37\3 \3 \5 \u00db\n \3!\6!\u00de\n!\r!\16!\u00df\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3$\6$\u00ec\n$\r$\16$\u00ed\3%\3%\3%\3%\3%\5%\u00f5\n%\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\5)\u0105\n)\3*\3*\3+\3+\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\2\2\60\5\3\7\4\t\5\13\6\r\7\17\b\21"+
		"\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27"+
		"/\30\61\31\63\32\65\33\67\349\2;\35=\36?\2A\2C\37E G!I\"K\2M#O$Q%S&U\'"+
		"W(Y)[*]+_,\5\2\3\4\n\5\2\13\f\17\17\"\"\4\2--//\4\2,,\61\61\3\2\63;\3"+
		"\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u011d\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3"+
		"I\3\2\2\2\3M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\4W\3"+
		"\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\5a\3\2\2\2\7h\3\2\2"+
		"\2\tn\3\2\2\2\13y\3\2\2\2\r|\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23"+
		"\u0083\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008d\3\2\2\2\33\u0091"+
		"\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2"+
		"\2%\u009c\3\2\2\2\'\u00a0\3\2\2\2)\u00aa\3\2\2\2+\u00ae\3\2\2\2-\u00b0"+
		"\3\2\2\2/\u00b2\3\2\2\2\61\u00b5\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2"+
		"\2\2\67\u00c0\3\2\2\29\u00c7\3\2\2\2;\u00cb\3\2\2\2=\u00cf\3\2\2\2?\u00d6"+
		"\3\2\2\2A\u00da\3\2\2\2C\u00dd\3\2\2\2E\u00e3\3\2\2\2G\u00e8\3\2\2\2I"+
		"\u00eb\3\2\2\2K\u00f4\3\2\2\2M\u00f6\3\2\2\2O\u00fa\3\2\2\2Q\u00fe\3\2"+
		"\2\2S\u0104\3\2\2\2U\u0106\3\2\2\2W\u0108\3\2\2\2Y\u010c\3\2\2\2[\u010e"+
		"\3\2\2\2]\u0110\3\2\2\2_\u0112\3\2\2\2ab\7u\2\2bc\7v\2\2cd\7f\2\2de\7"+
		"q\2\2ef\7w\2\2fg\7v\2\2g\6\3\2\2\2hi\7f\2\2ij\7g\2\2jk\7h\2\2kl\3\2\2"+
		"\2lm\t\2\2\2m\b\3\2\2\2nw\5-\26\2oq\5\17\7\2pr\5=\36\2qp\3\2\2\2qr\3\2"+
		"\2\2rx\3\2\2\2su\5=\36\2tv\5\25\n\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wo\3"+
		"\2\2\2ws\3\2\2\2x\n\3\2\2\2yz\7\60\2\2z{\5=\36\2{\f\3\2\2\2|}\7/\2\2}"+
		"~\7@\2\2~\16\3\2\2\2\177\u0080\7<\2\2\u0080\20\3\2\2\2\u0081\u0082\7."+
		"\2\2\u0082\22\3\2\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7\60\2\2\u0085"+
		"\u0086\7\60\2\2\u0086\24\3\2\2\2\u0087\u0088\7=\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\13\2\2\u008c\30\3\2\2"+
		"\2\u008d\u008e\7+\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\f\3\2\u0090\32"+
		"\3\2\2\2\u0091\u0092\7]\2\2\u0092\34\3\2\2\2\u0093\u0094\7_\2\2\u0094"+
		"\36\3\2\2\2\u0095\u0096\7}\2\2\u0096 \3\2\2\2\u0097\u0098\7\177\2\2\u0098"+
		"\"\3\2\2\2\u0099\u009a\5=\36\2\u009a\u009b\5\17\7\2\u009b$\3\2\2\2\u009c"+
		"\u009d\7>\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\22\4\2\u009f&\3\2\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4"+
		"\7r\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\u00ad\7f\2\2\u00ad*\3\2\2\2\u00ae\u00af\7%\2\2\u00af"+
		",\3\2\2\2\u00b0\u00b1\7&\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7\60\2\2\u00b3"+
		"\u00b4\7\60\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6\62\3\2\2\2"+
		"\u00b7\u00bc\t\4\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bc"+
		"\7f\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\64\3\2\2\2\u00bd"+
		"\u00be\7\62\2\2\u00be\66\3\2\2\2\u00bf\u00c1\7/\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c5"+
		"\59\34\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c58\3\2\2\2\u00c6"+
		"\u00c8\t\6\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\b\35\5\2\u00ce<\3\2\2\2\u00cf\u00d3\5?\37\2\u00d0"+
		"\u00d2\5A \2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d3\u00d4\3\2\2\2\u00d4>\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\t\7\2\2\u00d7@\3\2\2\2\u00d8\u00db\5?\37\2\u00d9\u00db\t\b\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00dbB\3\2\2\2\u00dc\u00de\t\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b!\6\2\u00e2D\3\2\2\2\u00e3\u00e4"+
		"\5-\26\2\u00e4\u00e5\5\27\13\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\"\2\2"+
		"\u00e7F\3\2\2\2\u00e8\u00e9\5\t\4\2\u00e9H\3\2\2\2\u00ea\u00ec\5K%\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0\u00f5\7)\2\2\u00f1\u00f2"+
		"\7&\2\2\u00f2\u00f5\7&\2\2\u00f3\u00f5\n\t\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\b&\3\2\u00f9N\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\b\'\4\2\u00fdP\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\b(\3\2\u0101R\3\2\2\2\u0102\u0105\5\65\32\2"+
		"\u0103\u0105\5\67\33\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105T"+
		"\3\2\2\2\u0106\u0107\5/\27\2\u0107V\3\2\2\2\u0108\u0109\7)\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\b+\5\2\u010bX\3\2\2\2\u010c\u010d\5\37\17\2\u010d"+
		"Z\3\2\2\2\u010e\u010f\5!\20\2\u010f\\\3\2\2\2\u0110\u0111\5#\21\2\u0111"+
		"^\3\2\2\2\u0112\u0113\5C!\2\u0113\u0114\3\2\2\2\u0114\u0115\b/\6\2\u0115"+
		"`\3\2\2\2\22\2\3\4quw\u00bb\u00c0\u00c4\u00c9\u00d3\u00da\u00df\u00ed"+
		"\u00f4\u0104\7\7\2\2\6\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}