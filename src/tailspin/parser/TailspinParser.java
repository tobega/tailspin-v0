// Generated from TailspinParser.g4 by ANTLR 4.7.2
package tailspin.parser;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinParser extends Parser {
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
  public static final int RULE_program = 0,
      RULE_statement = 1,
      RULE_definition = 2,
      RULE_source = 3,
      RULE_templates = 4,
      RULE_rangeLiteral = 5,
      RULE_integerLiteral = 6,
      RULE_stringLiteral = 7,
      RULE_stringContent = 8,
      RULE_stringInterpolate = 9,
      RULE_sink = 10,
      RULE_arithmeticExpression = 11;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "statement",
      "definition",
      "source",
      "templates",
      "rangeLiteral",
      "integerLiteral",
      "stringLiteral",
      "stringContent",
      "stringInterpolate",
      "sink",
      "arithmeticExpression"
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

  @Override
  public String getGrammarFileName() {
    return "TailspinParser.g4";
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
  public ATN getATN() {
    return _ATN;
  }

  public TailspinParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  public static class ProgramContext extends ParserRuleContext {
    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public TerminalNode EOF() {
      return getToken(TailspinParser.EOF, 0);
    }

    public List<TerminalNode> Eol() {
      return getTokens(TailspinParser.Eol);
    }

    public TerminalNode Eol(int i) {
      return getToken(TailspinParser.Eol, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterProgram(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitProgram(this);
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(25);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Eol) {
          {
            setState(24);
            match(Eol);
          }
        }

        setState(27);
        statement();
        setState(32);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(28);
                match(Eol);
                setState(29);
                statement();
              }
            }
          }
          setState(34);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        }
        setState(36);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Eol) {
          {
            setState(35);
            match(Eol);
          }
        }

        setState(38);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StatementContext extends ParserRuleContext {
    public DefinitionContext definition() {
      return getRuleContext(DefinitionContext.class, 0);
    }

    public SourceContext source() {
      return getRuleContext(SourceContext.class, 0);
    }

    public TerminalNode To() {
      return getToken(TailspinParser.To, 0);
    }

    public SinkContext sink() {
      return getRuleContext(SinkContext.class, 0);
    }

    public List<TerminalNode> Eol() {
      return getTokens(TailspinParser.Eol);
    }

    public TerminalNode Eol(int i) {
      return getToken(TailspinParser.Eol, i);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitStatement(this);
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_statement);
    int _la;
    try {
      setState(51);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Def:
          enterOuterAlt(_localctx, 1);
          {
            setState(40);
            definition();
          }
          break;
        case Dereference:
        case Zero:
        case NonZeroInteger:
        case START_STRING:
          enterOuterAlt(_localctx, 2);
          {
            setState(41);
            source();
            setState(43);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Eol) {
              {
                setState(42);
                match(Eol);
              }
            }

            setState(45);
            match(To);
            setState(47);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Eol) {
              {
                setState(46);
                match(Eol);
              }
            }

            setState(49);
            sink();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class DefinitionContext extends ParserRuleContext {
    public TerminalNode Def() {
      return getToken(TailspinParser.Def, 0);
    }

    public TerminalNode IDENTIFIER() {
      return getToken(TailspinParser.IDENTIFIER, 0);
    }

    public TerminalNode Colon() {
      return getToken(TailspinParser.Colon, 0);
    }

    public SourceContext source() {
      return getRuleContext(SourceContext.class, 0);
    }

    public DefinitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_definition;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterDefinition(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitDefinition(this);
    }
  }

  public final DefinitionContext definition() throws RecognitionException {
    DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_definition);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(53);
        match(Def);
        setState(54);
        match(IDENTIFIER);
        setState(55);
        match(Colon);
        setState(56);
        source();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SourceContext extends ParserRuleContext {
    public TerminalNode Dereference() {
      return getToken(TailspinParser.Dereference, 0);
    }

    public StringLiteralContext stringLiteral() {
      return getRuleContext(StringLiteralContext.class, 0);
    }

    public ArithmeticExpressionContext arithmeticExpression() {
      return getRuleContext(ArithmeticExpressionContext.class, 0);
    }

    public RangeLiteralContext rangeLiteral() {
      return getRuleContext(RangeLiteralContext.class, 0);
    }

    public SourceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_source;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterSource(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitSource(this);
    }
  }

  public final SourceContext source() throws RecognitionException {
    SourceContext _localctx = new SourceContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_source);
    try {
      setState(62);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(58);
            match(Dereference);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(59);
            stringLiteral();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(60);
            arithmeticExpression(0);
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(61);
            rangeLiteral();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TemplatesContext extends ParserRuleContext {
    public StringLiteralContext stringLiteral() {
      return getRuleContext(StringLiteralContext.class, 0);
    }

    public TemplatesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_templates;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterTemplates(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitTemplates(this);
    }
  }

  public final TemplatesContext templates() throws RecognitionException {
    TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_templates);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(64);
        stringLiteral();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class RangeLiteralContext extends ParserRuleContext {
    public List<IntegerLiteralContext> integerLiteral() {
      return getRuleContexts(IntegerLiteralContext.class);
    }

    public IntegerLiteralContext integerLiteral(int i) {
      return getRuleContext(IntegerLiteralContext.class, i);
    }

    public TerminalNode Range() {
      return getToken(TailspinParser.Range, 0);
    }

    public TerminalNode Colon() {
      return getToken(TailspinParser.Colon, 0);
    }

    public TerminalNode NonZeroInteger() {
      return getToken(TailspinParser.NonZeroInteger, 0);
    }

    public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_rangeLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterRangeLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitRangeLiteral(this);
    }
  }

  public final RangeLiteralContext rangeLiteral() throws RecognitionException {
    RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_rangeLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(66);
        integerLiteral();
        setState(67);
        match(Range);
        setState(68);
        integerLiteral();
        setState(71);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Colon) {
          {
            setState(69);
            match(Colon);
            setState(70);
            match(NonZeroInteger);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IntegerLiteralContext extends ParserRuleContext {
    public TerminalNode Zero() {
      return getToken(TailspinParser.Zero, 0);
    }

    public TerminalNode NonZeroInteger() {
      return getToken(TailspinParser.NonZeroInteger, 0);
    }

    public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_integerLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterIntegerLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitIntegerLiteral(this);
    }
  }

  public final IntegerLiteralContext integerLiteral() throws RecognitionException {
    IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_integerLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(73);
        _la = _input.LA(1);
        if (!(_la == Zero || _la == NonZeroInteger)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StringLiteralContext extends ParserRuleContext {
    public TerminalNode START_STRING() {
      return getToken(TailspinParser.START_STRING, 0);
    }

    public TerminalNode END_STRING() {
      return getToken(TailspinParser.END_STRING, 0);
    }

    public List<StringContentContext> stringContent() {
      return getRuleContexts(StringContentContext.class);
    }

    public StringContentContext stringContent(int i) {
      return getRuleContext(StringContentContext.class, i);
    }

    public StringLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_stringLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterStringLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitStringLiteral(this);
    }
  }

  public final StringLiteralContext stringLiteral() throws RecognitionException {
    StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_stringLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(75);
        match(START_STRING);
        setState(79);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0
            && ((1L << _la)
                    & ((1L << StringEvaluate) | (1L << StringDereference) | (1L << STRING_TEXT)))
                != 0)) {
          {
            {
              setState(76);
              stringContent();
            }
          }
          setState(81);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(82);
        match(END_STRING);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StringContentContext extends ParserRuleContext {
    public StringInterpolateContext stringInterpolate() {
      return getRuleContext(StringInterpolateContext.class, 0);
    }

    public TerminalNode STRING_TEXT() {
      return getToken(TailspinParser.STRING_TEXT, 0);
    }

    public StringContentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_stringContent;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterStringContent(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitStringContent(this);
    }
  }

  public final StringContentContext stringContent() throws RecognitionException {
    StringContentContext _localctx = new StringContentContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_stringContent);
    try {
      setState(86);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case StringEvaluate:
        case StringDereference:
          enterOuterAlt(_localctx, 1);
          {
            setState(84);
            stringInterpolate();
          }
          break;
        case STRING_TEXT:
          enterOuterAlt(_localctx, 2);
          {
            setState(85);
            match(STRING_TEXT);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StringInterpolateContext extends ParserRuleContext {
    public TerminalNode StringDereference() {
      return getToken(TailspinParser.StringDereference, 0);
    }

    public TerminalNode StringEvaluate() {
      return getToken(TailspinParser.StringEvaluate, 0);
    }

    public SourceContext source() {
      return getRuleContext(SourceContext.class, 0);
    }

    public TerminalNode RightParen() {
      return getToken(TailspinParser.RightParen, 0);
    }

    public StringInterpolateContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_stringInterpolate;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterStringInterpolate(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitStringInterpolate(this);
    }
  }

  public final StringInterpolateContext stringInterpolate() throws RecognitionException {
    StringInterpolateContext _localctx = new StringInterpolateContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_stringInterpolate);
    try {
      setState(93);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case StringDereference:
          enterOuterAlt(_localctx, 1);
          {
            setState(88);
            match(StringDereference);
          }
          break;
        case StringEvaluate:
          enterOuterAlt(_localctx, 2);
          {
            setState(89);
            match(StringEvaluate);
            setState(90);
            source();
            setState(91);
            match(RightParen);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SinkContext extends ParserRuleContext {
    public TerminalNode Stdout() {
      return getToken(TailspinParser.Stdout, 0);
    }

    public TemplatesContext templates() {
      return getRuleContext(TemplatesContext.class, 0);
    }

    public TerminalNode To() {
      return getToken(TailspinParser.To, 0);
    }

    public SinkContext sink() {
      return getRuleContext(SinkContext.class, 0);
    }

    public SinkContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sink;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterSink(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitSink(this);
    }
  }

  public final SinkContext sink() throws RecognitionException {
    SinkContext _localctx = new SinkContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_sink);
    try {
      setState(100);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Stdout:
          enterOuterAlt(_localctx, 1);
          {
            setState(95);
            match(Stdout);
          }
          break;
        case START_STRING:
          enterOuterAlt(_localctx, 2);
          {
            setState(96);
            templates();
            setState(97);
            match(To);
            setState(98);
            sink();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArithmeticExpressionContext extends ParserRuleContext {
    public IntegerLiteralContext integerLiteral() {
      return getRuleContext(IntegerLiteralContext.class, 0);
    }

    public TerminalNode Dereference() {
      return getToken(TailspinParser.Dereference, 0);
    }

    public List<ArithmeticExpressionContext> arithmeticExpression() {
      return getRuleContexts(ArithmeticExpressionContext.class);
    }

    public ArithmeticExpressionContext arithmeticExpression(int i) {
      return getRuleContext(ArithmeticExpressionContext.class, i);
    }

    public TerminalNode AdditiveOperator() {
      return getToken(TailspinParser.AdditiveOperator, 0);
    }

    public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arithmeticExpression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).enterArithmeticExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof TailspinParserListener)
        ((TailspinParserListener) listener).exitArithmeticExpression(this);
    }
  }

  public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
    return arithmeticExpression(0);
  }

  private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
    ArithmeticExpressionContext _prevctx = _localctx;
    int _startState = 22;
    enterRecursionRule(_localctx, 22, RULE_arithmeticExpression, _p);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(105);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case Zero:
          case NonZeroInteger:
            {
              setState(103);
              integerLiteral();
            }
            break;
          case Dereference:
            {
              setState(104);
              match(Dereference);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        _ctx.stop = _input.LT(-1);
        setState(112);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              {
                _localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
                pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
                setState(107);
                if (!(precpred(_ctx, 1)))
                  throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                setState(108);
                match(AdditiveOperator);
                setState(109);
                arithmeticExpression(2);
              }
            }
          }
          setState(114);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 11:
        return arithmeticExpression_sempred((ArithmeticExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean arithmeticExpression_sempred(
      ArithmeticExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 1);
    }
    return true;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27v\4\2\t\2\4\3\t"
          + "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"
          + "\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\2"
          + "\5\2\'\n\2\3\2\3\2\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\5\3\62\n\3\3\3\3\3\5\3"
          + "\66\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\7\3\7\3"
          + "\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\3\t\3\t\3"
          + "\n\3\n\5\nY\n\n\3\13\3\13\3\13\3\13\3\13\5\13`\n\13\3\f\3\f\3\f\3\f\3"
          + "\f\5\fg\n\f\3\r\3\r\3\r\5\rl\n\r\3\r\3\r\3\r\7\rq\n\r\f\r\16\rt\13\r\3"
          + "\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\17\20\2y\2\33\3\2\2"
          + "\2\4\65\3\2\2\2\6\67\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16K\3\2"
          + "\2\2\20M\3\2\2\2\22X\3\2\2\2\24_\3\2\2\2\26f\3\2\2\2\30k\3\2\2\2\32\34"
          + "\7\7\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\"\5\4\3\2\36\37"
          + "\7\7\2\2\37!\5\4\3\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2"
          + "\2\2$\"\3\2\2\2%\'\7\7\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\2\2\3)"
          + "\3\3\2\2\2*\66\5\6\4\2+-\5\b\5\2,.\7\7\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2"
          + "\2/\61\7\6\2\2\60\62\7\7\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2"
          + "\63\64\5\26\f\2\64\66\3\2\2\2\65*\3\2\2\2\65+\3\2\2\2\66\5\3\2\2\2\67"
          + "8\7\4\2\289\7\22\2\29:\7\b\2\2:;\5\b\5\2;\7\3\2\2\2<A\7\5\2\2=A\5\20\t"
          + "\2>A\5\30\r\2?A\5\f\7\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2"
          + "\2\2BC\5\20\t\2C\13\3\2\2\2DE\5\16\b\2EF\7\r\2\2FI\5\16\b\2GH\7\b\2\2"
          + "HJ\7\20\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2KL\t\2\2\2L\17\3\2\2\2MQ\7\21"
          + "\2\2NP\5\22\n\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3"
          + "\2\2\2TU\7\27\2\2U\21\3\2\2\2VY\5\24\13\2WY\7\26\2\2XV\3\2\2\2XW\3\2\2"
          + "\2Y\23\3\2\2\2Z`\7\25\2\2[\\\7\24\2\2\\]\5\b\5\2]^\7\13\2\2^`\3\2\2\2"
          + "_Z\3\2\2\2_[\3\2\2\2`\25\3\2\2\2ag\7\3\2\2bc\5\n\6\2cd\7\6\2\2de\5\26"
          + "\f\2eg\3\2\2\2fa\3\2\2\2fb\3\2\2\2g\27\3\2\2\2hi\b\r\1\2il\5\16\b\2jl"
          + "\7\5\2\2kh\3\2\2\2kj\3\2\2\2lr\3\2\2\2mn\f\3\2\2no\7\16\2\2oq\5\30\r\4"
          + "pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\31\3\2\2\2tr\3\2\2\2\20\33\""
          + "&-\61\65@IQX_fkr";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
