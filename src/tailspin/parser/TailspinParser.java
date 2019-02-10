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
		RULE_program = 0, RULE_statement = 1, RULE_source = 2, RULE_templates = 3, 
		RULE_templatesBody = 4, RULE_templateBlock = 5, RULE_block = 6, RULE_valueChain = 7, 
		RULE_transform = 8, RULE_matcher = 9, RULE_condition = 10, RULE_rangeLiteral = 11, 
		RULE_integerLiteral = 12, RULE_stringLiteral = 13, RULE_stringContent = 14, 
		RULE_stringInterpolate = 15, RULE_sink = 16, RULE_arithmeticExpression = 17;
	public static final String[] ruleNames = {
		"program", "statement", "source", "templates", "templatesBody", "templateBlock", 
		"block", "valueChain", "transform", "matcher", "condition", "rangeLiteral", 
		"integerLiteral", "stringLiteral", "stringContent", "stringInterpolate", 
		"sink", "arithmeticExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'stdout'", null, null, null, "'\n'", "':'", "';'", "'('", "')'", 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(36);
				match(Eol);
				}
			}

			setState(39);
			statement();
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					match(Eol);
					setState(41);
					statement();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eol) {
				{
				setState(47);
				match(Eol);
				}
			}

			setState(50);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueChainToSinkContext extends StatementContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public SinkContext sink() {
			return getRuleContext(SinkContext.class,0);
		}
		public List<TerminalNode> Eol() { return getTokens(TailspinParser.Eol); }
		public TerminalNode Eol(int i) {
			return getToken(TailspinParser.Eol, i);
		}
		public ValueChainToSinkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChainToSink(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public DefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(Def);
				setState(53);
				match(IDENTIFIER);
				setState(54);
				match(Colon);
				setState(55);
				source();
				}
				break;
			case Dereference:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				valueChain();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eol) {
					{
					setState(57);
					match(Eol);
					}
				}

				setState(60);
				match(To);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eol) {
					{
					setState(61);
					match(Eol);
					}
				}

				setState(64);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_source);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(Dereference);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				arithmeticExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
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
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
	 
		public TemplatesContext() { }
		public void copyFrom(TemplatesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralTemplatesContext extends TemplatesContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringLiteralTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTemplatesContext extends TemplatesContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InlineTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInlineTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templates);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_STRING:
				_localctx = new StringLiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				stringLiteral();
				}
				break;
			case LeftParen:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(LeftParen);
				setState(76);
				templatesBody();
				setState(77);
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
		public TemplatesBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesBody; }
	 
		public TemplatesBodyContext() { }
		public void copyFrom(TemplatesBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TemplatesWithPrecursorContext extends TemplatesBodyContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public TemplatesWithPrecursorContext(TemplatesBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesWithPrecursor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TemplatesDirectMatchContext extends TemplatesBodyContext {
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public TemplatesDirectMatchContext(TemplatesBodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesDirectMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesBodyContext templatesBody() throws RecognitionException {
		TemplatesBodyContext _localctx = new TemplatesBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templatesBody);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case Dereference:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
				_localctx = new TemplatesWithPrecursorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				block();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(82);
					templateBlock();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				_localctx = new TemplatesDirectMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					templateBlock();
					}
					}
					setState(91); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templateBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			matcher();
			setState(96);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(98);
					valueChain();
					}
					break;
				case 2:
					{
					setState(99);
					statement();
					}
					break;
				}
				}
				setState(102); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueChainContext valueChain() throws RecognitionException {
		ValueChainContext _localctx = new ValueChainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueChain);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				source();
				setState(106);
				match(To);
				setState(107);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transform);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				templates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				templates();
				setState(113);
				match(To);
				setState(114);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(StartMatcher);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Zero || _la==NonZeroInteger) {
				{
				setState(119);
				condition();
				}
			}

			setState(122);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLiteralContext rangeLiteral() throws RecognitionException {
		RangeLiteralContext _localctx = new RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			integerLiteral();
			setState(127);
			match(Range);
			setState(128);
			integerLiteral();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(129);
				match(Colon);
				setState(130);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(START_STRING);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringEvaluate) | (1L << StringDereference) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(136);
				stringContent();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringContent);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringEvaluate:
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public StringInterpolateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringInterpolate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStringInterpolate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringInterpolateContext stringInterpolate() throws RecognitionException {
		StringInterpolateContext _localctx = new StringInterpolateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringInterpolate);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(StringDereference);
				}
				break;
			case StringEvaluate:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(StringEvaluate);
				setState(150);
				valueChain();
				setState(151);
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
		public SinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkContext sink() throws RecognitionException {
		SinkContext _localctx = new SinkContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Stdout);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(158);
				integerLiteral();
				}
				break;
			case Dereference:
				{
				setState(159);
				match(Dereference);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
					setState(162);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(163);
					match(AdditiveOperator);
					setState(164);
					arithmeticExpression(2);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\5\2(\n\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\5\2"+
		"\63\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\5\3A\n\3\3\3"+
		"\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3"+
		"\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\6\6\6\\\n\6\r\6\16\6]\5\6`\n\6\3\7\3"+
		"\7\3\7\3\b\3\b\6\bg\n\b\r\b\16\bh\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nw\n\n\3\13\3\13\5\13{\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0086\n\r\3\16\3\16\3\17\3\17\7\17\u008c\n\17\f\17\16\17"+
		"\u008f\13\17\3\17\3\17\3\20\3\20\5\20\u0095\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u009c\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u00a3\n\23\3\23\3\23"+
		"\3\23\7\23\u00a8\n\23\f\23\16\23\u00ab\13\23\3\23\2\3$\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\21\22\2\u00b2\2\'\3\2\2\2\4D\3"+
		"\2\2\2\6J\3\2\2\2\bQ\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16f\3\2\2\2\20o\3\2"+
		"\2\2\22v\3\2\2\2\24x\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0087\3\2"+
		"\2\2\34\u0089\3\2\2\2\36\u0094\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2\2\2"+
		"$\u00a2\3\2\2\2&(\7\7\2\2\'&\3\2\2\2\'(\3\2\2\2()\3\2\2\2).\5\4\3\2*+"+
		"\7\7\2\2+-\5\4\3\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\61\63\7\7\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2"+
		"\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\4\2\2\678\7\24\2\289\7\b\2\29E\5\6"+
		"\4\2:<\5\20\t\2;=\7\7\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\7\6\2\2?A\7"+
		"\7\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\"\22\2CE\3\2\2\2D\66\3\2\2\2"+
		"D:\3\2\2\2E\5\3\2\2\2FK\7\5\2\2GK\5\34\17\2HK\5$\23\2IK\5\30\r\2JF\3\2"+
		"\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LR\5\34\17\2MN\7\n\2\2NO"+
		"\5\n\6\2OP\7\13\2\2PR\3\2\2\2QL\3\2\2\2QM\3\2\2\2R\t\3\2\2\2SW\5\16\b"+
		"\2TV\5\f\7\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X`\3\2\2\2YW\3\2\2"+
		"\2Z\\\5\f\7\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_S\3\2"+
		"\2\2_[\3\2\2\2`\13\3\2\2\2ab\5\24\13\2bc\5\16\b\2c\r\3\2\2\2dg\5\20\t"+
		"\2eg\5\4\3\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\17\3\2"+
		"\2\2jp\5\6\4\2kl\5\6\4\2lm\7\6\2\2mn\5\22\n\2np\3\2\2\2oj\3\2\2\2ok\3"+
		"\2\2\2p\21\3\2\2\2qw\5\b\5\2rs\5\b\5\2st\7\6\2\2tu\5\22\n\2uw\3\2\2\2"+
		"vq\3\2\2\2vr\3\2\2\2w\23\3\2\2\2xz\7\f\2\2y{\5\26\f\2zy\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|}\7\r\2\2}\25\3\2\2\2~\177\5\32\16\2\177\27\3\2\2\2\u0080"+
		"\u0081\5\32\16\2\u0081\u0082\7\17\2\2\u0082\u0085\5\32\16\2\u0083\u0084"+
		"\7\b\2\2\u0084\u0086\7\22\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\31\3\2\2\2\u0087\u0088\t\2\2\2\u0088\33\3\2\2\2\u0089\u008d\7\23"+
		"\2\2\u008a\u008c\5\36\20\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\7\31\2\2\u0091\35\3\2\2\2\u0092\u0095\5 \21\2\u0093\u0095"+
		"\7\30\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\37\3\2\2\2\u0096"+
		"\u009c\7\27\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5\20\t\2\u0099\u009a"+
		"\7\13\2\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2"+
		"\u009c!\3\2\2\2\u009d\u009e\7\3\2\2\u009e#\3\2\2\2\u009f\u00a0\b\23\1"+
		"\2\u00a0\u00a3\5\32\16\2\u00a1\u00a3\7\5\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\f\3\2\2\u00a5\u00a6\7\20"+
		"\2\2\u00a6\u00a8\5$\23\4\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa%\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\30\'.\62<@DJQW]_fhovz\u0085\u008d\u0094\u009b\u00a2\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}