// Generated from TailspinLexer.g4 by ANTLR 4.7.2
package tailspin.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int Stdout = 1,
      Def = 2,
      Dereference = 3,
      To = 4,
      Eol = 5,
      Colon = 6,
      EndIdentifier = 7,
      LeftParen = 8,
      RightParen = 9,
      StartDereference = 10,
      Range = 11,
      AdditiveOperator = 12,
      Zero = 13,
      NonZeroInteger = 14,
      START_STRING = 15,
      IDENTIFIER = 16,
      WS = 17,
      StringEvaluate = 18,
      StringDereference = 19,
      STRING_TEXT = 20,
      END_STRING = 21;
  public static final int IN_STRING = 1;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE", "IN_STRING"};

  private static String[] makeRuleNames() {
    return new String[] {
      "Stdout",
      "Def",
      "Dereference",
      "To",
      "Eol",
      "Colon",
      "EndIdentifier",
      "LeftParen",
      "RightParen",
      "StartDereference",
      "Range",
      "AdditiveOperator",
      "Zero",
      "NonZeroInteger",
      "Digits",
      "START_STRING",
      "IDENTIFIER",
      "IDENTIFIER_START",
      "IDENTIFIER_PART",
      "WS",
      "StringEvaluate",
      "StringDereference",
      "STRING_TEXT",
      "STRING_CHAR",
      "END_STRING"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "'stdout'",
      null,
      null,
      "'->'",
      "'\n'",
      "':'",
      "';'",
      "'('",
      "')'",
      "'$'",
      "'..'",
      null,
      "'0'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "Stdout",
      "Def",
      "Dereference",
      "To",
      "Eol",
      "Colon",
      "EndIdentifier",
      "LeftParen",
      "RightParen",
      "StartDereference",
      "Range",
      "AdditiveOperator",
      "Zero",
      "NonZeroInteger",
      "START_STRING",
      "IDENTIFIER",
      "WS",
      "StringEvaluate",
      "StringDereference",
      "STRING_TEXT",
      "END_STRING"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /** @deprecated Use {@link #VOCABULARY} instead. */
  @Deprecated public static final String[] tokenNames;

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
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "TailspinLexer.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009b\b\1\b\1"
          + "\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"
          + "\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"
          + "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"
          + "\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"
          + "\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"
          + "\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17b\n\17\3"
          + "\17\3\17\5\17f\n\17\3\20\6\20i\n\20\r\20\16\20j\3\21\3\21\3\21\3\21\3"
          + "\22\3\22\7\22s\n\22\f\22\16\22v\13\22\3\23\3\23\3\24\3\24\5\24|\n\24\3"
          + "\25\6\25\177\n\25\r\25\16\25\u0080\3\25\3\25\3\26\3\26\3\26\3\26\3\26"
          + "\3\27\3\27\3\30\6\30\u008d\n\30\r\30\16\30\u008e\3\31\3\31\3\31\3\31\3"
          + "\31\5\31\u0096\n\31\3\32\3\32\3\32\3\32\2\2\33\4\3\6\4\b\5\n\6\f\7\16"
          + "\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \2\"\21$\22&\2(\2*\23,"
          + "\24.\25\60\26\62\2\64\27\4\2\3\t\5\2\13\f\17\17\"\"\4\2--//\3\2\63;\3"
          + "\2\62;\4\2C\\c|\4\2\62;aa\4\2&&))\2\u009f\2\4\3\2\2\2\2\6\3\2\2\2\2\b"
          + "\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2"
          + "\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2"
          + "\36\3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3"
          + "\60\3\2\2\2\3\64\3\2\2\2\4\66\3\2\2\2\6=\3\2\2\2\bC\3\2\2\2\nH\3\2\2\2"
          + "\fK\3\2\2\2\16M\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24S\3\2\2\2\26W\3\2\2"
          + "\2\30Y\3\2\2\2\32\\\3\2\2\2\34^\3\2\2\2\36a\3\2\2\2 h\3\2\2\2\"l\3\2\2"
          + "\2$p\3\2\2\2&w\3\2\2\2({\3\2\2\2*~\3\2\2\2,\u0084\3\2\2\2.\u0089\3\2\2"
          + "\2\60\u008c\3\2\2\2\62\u0095\3\2\2\2\64\u0097\3\2\2\2\66\67\7u\2\2\67"
          + "8\7v\2\289\7f\2\29:\7q\2\2:;\7w\2\2;<\7v\2\2<\5\3\2\2\2=>\7f\2\2>?\7g"
          + "\2\2?@\7h\2\2@A\3\2\2\2AB\t\2\2\2B\7\3\2\2\2CD\5\26\13\2DF\5$\22\2EG\5"
          + "\20\b\2FE\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HI\7/\2\2IJ\7@\2\2J\13\3\2\2\2K"
          + "L\7\f\2\2L\r\3\2\2\2MN\7<\2\2N\17\3\2\2\2OP\7=\2\2P\21\3\2\2\2QR\7*\2"
          + "\2R\23\3\2\2\2ST\7+\2\2TU\3\2\2\2UV\b\n\2\2V\25\3\2\2\2WX\7&\2\2X\27\3"
          + "\2\2\2YZ\7\60\2\2Z[\7\60\2\2[\31\3\2\2\2\\]\t\3\2\2]\33\3\2\2\2^_\7\62"
          + "\2\2_\35\3\2\2\2`b\7/\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\t\4\2\2df\5"
          + " \20\2ed\3\2\2\2ef\3\2\2\2f\37\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2j"
          + "h\3\2\2\2jk\3\2\2\2k!\3\2\2\2lm\7)\2\2mn\3\2\2\2no\b\21\3\2o#\3\2\2\2"
          + "pt\5&\23\2qs\5(\24\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u%\3\2\2\2"
          + "vt\3\2\2\2wx\t\6\2\2x\'\3\2\2\2y|\5&\23\2z|\t\7\2\2{y\3\2\2\2{z\3\2\2"
          + "\2|)\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"
          + "\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\25\4\2\u0083+\3\2\2\2"
          + "\u0084\u0085\5\26\13\2\u0085\u0086\5\22\t\2\u0086\u0087\3\2\2\2\u0087"
          + "\u0088\b\26\5\2\u0088-\3\2\2\2\u0089\u008a\5\b\4\2\u008a/\3\2\2\2\u008b"
          + "\u008d\5\62\31\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3"
          + "\2\2\2\u008e\u008f\3\2\2\2\u008f\61\3\2\2\2\u0090\u0091\7)\2\2\u0091\u0096"
          + "\7)\2\2\u0092\u0093\7&\2\2\u0093\u0096\7&\2\2\u0094\u0096\n\b\2\2\u0095"
          + "\u0090\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0094\3\2\2\2\u0096\63\3\2\2"
          + "\2\u0097\u0098\7)\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\32\2\2\u009a\65"
          + "\3\2\2\2\r\2\3Faejt{\u0080\u008e\u0095\6\6\2\2\7\3\2\b\2\2\7\2\2";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
