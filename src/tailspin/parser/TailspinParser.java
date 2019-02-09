// Generated from TailspinParser.g4 by ANTLR 4.7.1
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
		RULE_program = 0, RULE_statement = 1, RULE_definition = 2, RULE_source = 3, 
		RULE_templates = 4, RULE_templatesBody = 5, RULE_templateBlock = 6, RULE_block = 7, 
		RULE_valueChain = 8, RULE_transform = 9, RULE_matcher = 10, RULE_condition = 11, 
		RULE_rangeLiteral = 12, RULE_integerLiteral = 13, RULE_stringLiteral = 14, 
		RULE_stringContent = 15, RULE_stringInterpolate = 16, RULE_sink = 17, 
		RULE_arithmeticExpression = 18;
	public static final String[] ruleNames = {
		"program", "statement", "definition", "source", "templates", "templatesBody", 
		"templateBlock", "block", "valueChain", "transform", "matcher", "condition", 
		"rangeLiteral", "integerLiteral", "stringLiteral", "stringContent", "stringInterpolate", 
		"sink", "arithmeticExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, "'->'", "'\n'", "':'", "';'", "'('", "')'", 
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(38);
				match(Eol);
				}
			}

			setState(41);
			statement();
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					match(Eol);
					setState(43);
					statement();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(49);
				match(Eol);
				}
			}

			setState(52);
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
		public List<TerminalNode> Eol() { return getTokens(TailspinParser.Eol); }
		public TerminalNode Eol(int i) {
			return getToken(TailspinParser.Eol, i);
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
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				definition();
				}
				break;
			case Dereference:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				source();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eol) {
					{
					setState(56);
					match(Eol);
					}
				}

				setState(59);
				match(To);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eol) {
					{
					setState(60);
					match(Eol);
					}
				}

				setState(63);
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
			setState(67);
			match(Def);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(Colon);
			setState(70);
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
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(Dereference);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				arithmeticExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				stringLiteral();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LeftParen);
				setState(80);
				templatesBody();
				setState(81);
				match(RightParen);
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

	public static class TemplatesBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public TemplatesBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterTemplatesBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitTemplatesBody(this);
		}
	}

	public final TemplatesBodyContext templatesBody() throws RecognitionException {
		TemplatesBodyContext _localctx = new TemplatesBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templatesBody);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case Dereference:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				block();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(86);
					templateBlock();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					templateBlock();
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StartMatcher );
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

	public static class TemplateBlockContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TemplateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterTemplateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitTemplateBlock(this);
		}
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_templateBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			matcher();
			setState(100);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<ValueChainContext> valueChain() {
			return getRuleContexts(ValueChainContext.class);
		}
		public ValueChainContext valueChain(int i) {
			return getRuleContext(ValueChainContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(102);
					valueChain();
					}
					break;
				case 2:
					{
					setState(103);
					statement();
					}
					break;
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << Dereference) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING))) != 0) );
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

	public static class ValueChainContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public ValueChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterValueChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitValueChain(this);
		}
	}

	public final ValueChainContext valueChain() throws RecognitionException {
		ValueChainContext _localctx = new ValueChainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valueChain);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				source();
				setState(110);
				match(To);
				setState(111);
				transform();
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

	public static class TransformContext extends ParserRuleContext {
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitTransform(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transform);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				templates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				templates();
				setState(117);
				match(To);
				setState(118);
				transform();
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

	public static class MatcherContext extends ParserRuleContext {
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public MatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitMatcher(this);
		}
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(StartMatcher);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Zero || _la==NonZeroInteger) {
				{
				setState(123);
				condition();
				}
			}

			setState(126);
			match(EndMatcher);
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

	public static class ConditionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			integerLiteral();
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
		enterRule(_localctx, 24, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			integerLiteral();
			setState(131);
			match(Range);
			setState(132);
			integerLiteral();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(133);
				match(Colon);
				setState(134);
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
		enterRule(_localctx, 26, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 28, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(START_STRING);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringEvaluate) | (1L << StringDereference) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(140);
				stringContent();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
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
		public StringInterpolateContext stringInterpolate() {
			return getRuleContext(StringInterpolateContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_stringContent);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringEvaluate:
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(STRING_TEXT);
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

	public static class StringInterpolateContext extends ParserRuleContext {
		public TerminalNode StringDereference() { return getToken(TailspinParser.StringDereference, 0); }
		public TerminalNode StringEvaluate() { return getToken(TailspinParser.StringEvaluate, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public StringInterpolateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringInterpolate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterStringInterpolate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitStringInterpolate(this);
		}
	}

	public final StringInterpolateContext stringInterpolate() throws RecognitionException {
		StringInterpolateContext _localctx = new StringInterpolateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringInterpolate);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(StringDereference);
				}
				break;
			case StringEvaluate:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(StringEvaluate);
				setState(154);
				source();
				setState(155);
				match(RightParen);
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
		enterRule(_localctx, 34, RULE_sink);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdout:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(Stdout);
				}
				break;
			case LeftParen:
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				templates();
				setState(161);
				match(To);
				setState(162);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode AdditiveOperator() { return getToken(TailspinParser.AdditiveOperator, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TailspinParserListener ) ((TailspinParserListener)listener).exitArithmeticExpression(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(167);
				integerLiteral();
				}
				break;
			case Dereference:
				{
				setState(168);
				match(Dereference);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(171);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(172);
					match(AdditiveOperator);
					setState(173);
					arithmeticExpression(2);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\5\3@\n\3\3\3\3"+
		"\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6V\n\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\6\7`\n\7\r\7\16\7"+
		"a\5\7d\n\7\3\b\3\b\3\b\3\t\3\t\6\tk\n\t\r\t\16\tl\3\n\3\n\3\n\3\n\3\n"+
		"\5\nt\n\n\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\5\f\177\n\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\20\3"+
		"\20\7\20\u0090\n\20\f\20\16\20\u0093\13\20\3\20\3\20\3\21\3\21\5\21\u0099"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a0\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00a7\n\23\3\24\3\24\3\24\5\24\u00ac\n\24\3\24\3\24\3\24\7\24\u00b1"+
		"\n\24\f\24\16\24\u00b4\13\24\3\24\2\3&\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\3\3\2\21\22\2\u00bb\2)\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2"+
		"\bN\3\2\2\2\nU\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20j\3\2\2\2\22s\3\2\2\2"+
		"\24z\3\2\2\2\26|\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u008b\3"+
		"\2\2\2\36\u008d\3\2\2\2 \u0098\3\2\2\2\"\u009f\3\2\2\2$\u00a6\3\2\2\2"+
		"&\u00ab\3\2\2\2(*\7\7\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+\60\5\4\3\2,-"+
		"\7\7\2\2-/\5\4\3\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\63\65\7\7\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\28D\5\6\4\29;\5\b\5\2:<\7\7\2\2;"+
		":\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\7\6\2\2>@\7\7\2\2?>\3\2\2\2?@\3\2\2\2"+
		"@A\3\2\2\2AB\5$\23\2BD\3\2\2\2C8\3\2\2\2C9\3\2\2\2D\5\3\2\2\2EF\7\4\2"+
		"\2FG\7\24\2\2GH\7\b\2\2HI\5\b\5\2I\7\3\2\2\2JO\7\5\2\2KO\5\36\20\2LO\5"+
		"&\24\2MO\5\32\16\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2"+
		"PV\5\36\20\2QR\7\n\2\2RS\5\f\7\2ST\7\13\2\2TV\3\2\2\2UP\3\2\2\2UQ\3\2"+
		"\2\2V\13\3\2\2\2W[\5\20\t\2XZ\5\16\b\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2["+
		"\\\3\2\2\2\\d\3\2\2\2][\3\2\2\2^`\5\16\b\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2bd\3\2\2\2cW\3\2\2\2c_\3\2\2\2d\r\3\2\2\2ef\5\26\f\2fg\5\20"+
		"\t\2g\17\3\2\2\2hk\5\22\n\2ik\5\4\3\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lj"+
		"\3\2\2\2lm\3\2\2\2m\21\3\2\2\2nt\5\b\5\2op\5\b\5\2pq\7\6\2\2qr\5\24\13"+
		"\2rt\3\2\2\2sn\3\2\2\2so\3\2\2\2t\23\3\2\2\2u{\5\n\6\2vw\5\n\6\2wx\7\6"+
		"\2\2xy\5\24\13\2y{\3\2\2\2zu\3\2\2\2zv\3\2\2\2{\25\3\2\2\2|~\7\f\2\2}"+
		"\177\5\30\r\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\r"+
		"\2\2\u0081\27\3\2\2\2\u0082\u0083\5\34\17\2\u0083\31\3\2\2\2\u0084\u0085"+
		"\5\34\17\2\u0085\u0086\7\17\2\2\u0086\u0089\5\34\17\2\u0087\u0088\7\b"+
		"\2\2\u0088\u008a\7\22\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\33\3\2\2\2\u008b\u008c\t\2\2\2\u008c\35\3\2\2\2\u008d\u0091\7\23\2\2"+
		"\u008e\u0090\5 \21\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\31\2\2\u0095\37\3\2\2\2\u0096\u0099\5\"\22\2\u0097\u0099\7\30"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099!\3\2\2\2\u009a\u00a0"+
		"\7\27\2\2\u009b\u009c\7\26\2\2\u009c\u009d\5\b\5\2\u009d\u009e\7\13\2"+
		"\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u00a0#"+
		"\3\2\2\2\u00a1\u00a7\7\3\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\7\6\2\2\u00a4"+
		"\u00a5\5$\23\2\u00a5\u00a7\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a7%\3\2\2\2\u00a8\u00a9\b\24\1\2\u00a9\u00ac\5\34\17\2\u00aa\u00ac"+
		"\7\5\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b2\3\2\2\2\u00ad"+
		"\u00ae\f\3\2\2\u00ae\u00af\7\20\2\2\u00af\u00b1\5&\24\4\u00b0\u00ad\3"+
		"\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\'\3\2\2\2\u00b4\u00b2\3\2\2\2\31)\60\64;?CNU[acjlsz~\u0089\u0091\u0098"+
		"\u009f\u00a6\u00ab\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}