// Generated from TailspinParser.g4 by ANTLR 4.7.2
package tailspin.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Stdout=1, Def=2, Dereference=3, To=4, Eol=5, Colon=6, EndIdentifier=7, 
		Range=8, Zero=9, NonZeroInteger=10, START_STRING=11, IDENTIFIER=12, WS=13, 
		StringInterpolate=14, STRING_TEXT=15, END_STRING=16;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_definition = 2, RULE_source = 3, 
		RULE_templates = 4, RULE_rangeLiteral = 5, RULE_integerLiteral = 6, RULE_stringLiteral = 7, 
		RULE_stringContent = 8, RULE_sink = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "definition", "source", "templates", "rangeLiteral", 
			"integerLiteral", "stringLiteral", "stringContent", "sink"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'..'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Stdout", "Def", "Dereference", "To", "Eol", "Colon", "EndIdentifier", 
			"Range", "Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", 
			"StringInterpolate", "STRING_TEXT", "END_STRING"
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

	@Override
	public String getGrammarFileName() { return "TailspinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TailspinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TailspinParser.EOF, 0); }
		public List<TerminalNode> Eol() { return getTokens(TailspinParser.Eol); }
		public TerminalNode Eol(int i) {
			return getToken(TailspinParser.Eol, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitProgram(this);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(20);
				match(Eol);
				}
			}

			setState(23);
			statement();
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					match(Eol);
					setState(25);
					statement();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(31);
				match(Eol);
				}
			}

			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public SinkContext sink() {
			return getRuleContext(SinkContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				definition();
				}
				break;
			case Dereference:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				source();
				setState(38);
				match(To);
				setState(39);
				sink();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(Def);
			setState(44);
			match(IDENTIFIER);
			setState(45);
			match(Colon);
			setState(46);
			source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_source);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(Dereference);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				integerLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				rangeLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatesContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterTemplates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitTemplates(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeLiteralContext extends ParserRuleContext {
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public TerminalNode NonZeroInteger() { return getToken(TailspinParser.NonZeroInteger, 0); }
		public RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterRangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitRangeLiteral(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			integerLiteral();
			setState(57);
			match(Range);
			setState(58);
			integerLiteral();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(59);
				match(Colon);
				setState(60);
				match(NonZeroInteger);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode Zero() { return getToken(TailspinParser.Zero, 0); }
		public TerminalNode NonZeroInteger() { return getToken(TailspinParser.NonZeroInteger, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==Zero || _la==NonZeroInteger) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(START_STRING);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StringInterpolate || _la==STRING_TEXT) {
				{
				{
				setState(66);
				stringContent();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(END_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContentContext extends ParserRuleContext {
		public TerminalNode StringInterpolate() { return getToken(TailspinParser.StringInterpolate, 0); }
		public TerminalNode STRING_TEXT() { return getToken(TailspinParser.STRING_TEXT, 0); }
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitStringContent(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==StringInterpolate || _la==STRING_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode Stdout() { return getToken(TailspinParser.Stdout, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public SinkContext sink() {
			return getRuleContext(SinkContext.class,0);
		}
		public SinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterSink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitSink(this);
		}
	}

	public final SinkContext sink() throws RecognitionException {
		SinkContext _localctx = new SinkContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sink);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdout:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Stdout);
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				templates();
				setState(78);
				match(To);
				setState(79);
				sink();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\5\2\30\n\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\5\2#\n\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\t\3\t\7\tF\n"+
		"\t\f\t\16\tI\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13T\n\13"+
		"\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\13\f\3\2\20\21\2U\2\27\3\2"+
		"\2\2\4+\3\2\2\2\6-\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16A\3\2"+
		"\2\2\20C\3\2\2\2\22L\3\2\2\2\24S\3\2\2\2\26\30\7\7\2\2\27\26\3\2\2\2\27"+
		"\30\3\2\2\2\30\31\3\2\2\2\31\36\5\4\3\2\32\33\7\7\2\2\33\35\5\4\3\2\34"+
		"\32\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3"+
		"\2\2\2!#\7\7\2\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2"+
		"&,\5\6\4\2\'(\5\b\5\2()\7\6\2\2)*\5\24\13\2*,\3\2\2\2+&\3\2\2\2+\'\3\2"+
		"\2\2,\5\3\2\2\2-.\7\4\2\2./\7\16\2\2/\60\7\b\2\2\60\61\5\b\5\2\61\7\3"+
		"\2\2\2\62\67\7\5\2\2\63\67\5\20\t\2\64\67\5\16\b\2\65\67\5\f\7\2\66\62"+
		"\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\289\5\20"+
		"\t\29\13\3\2\2\2:;\5\16\b\2;<\7\n\2\2<?\5\16\b\2=>\7\b\2\2>@\7\f\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\r\3\2\2\2AB\t\2\2\2B\17\3\2\2\2CG\7\r\2\2DF\5\22"+
		"\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\22"+
		"\2\2K\21\3\2\2\2LM\t\3\2\2M\23\3\2\2\2NT\7\3\2\2OP\5\n\6\2PQ\7\6\2\2Q"+
		"R\5\24\13\2RT\3\2\2\2SN\3\2\2\2SO\3\2\2\2T\25\3\2\2\2\n\27\36\"+\66?G"+
		"S";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}