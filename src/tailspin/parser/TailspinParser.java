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
		RULE_program = 0, RULE_statement = 1, RULE_source = 2, RULE_arrayLiteral = 3, 
		RULE_structureLiteral = 4, RULE_keyValue = 5, RULE_templates = 6, RULE_templatesBody = 7, 
		RULE_matchTemplate = 8, RULE_block = 9, RULE_blockExpression = 10, RULE_valueChain = 11, 
		RULE_transform = 12, RULE_matcher = 13, RULE_condition = 14, RULE_lowerBound = 15, 
		RULE_upperBound = 16, RULE_rangeLiteral = 17, RULE_integerLiteral = 18, 
		RULE_stringLiteral = 19, RULE_stringContent = 20, RULE_stringInterpolate = 21, 
		RULE_sink = 22, RULE_arithmeticExpression = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "source", "arrayLiteral", "structureLiteral", 
			"keyValue", "templates", "templatesBody", "matchTemplate", "block", "blockExpression", 
			"valueChain", "transform", "matcher", "condition", "lowerBound", "upperBound", 
			"rangeLiteral", "integerLiteral", "stringLiteral", "stringContent", "stringInterpolate", 
			"sink", "arithmeticExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'stdout'", null, null, null, "'->'", "':'", "','", "'...'", "';'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", null, null, "'templates'", 
			"'end'", "'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, 
			null, null, null, null, null, "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			statement();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << Dereference) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
	public static class TemplatesDefinitionContext extends StatementContext {
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TemplatesDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesDefinition(this);
			else return visitor.visitChildren(this);
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
		public ValueChainToSinkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueChainToSink(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
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
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(Def);
				setState(58);
				match(Key);
				setState(59);
				valueChain();
				}
				break;
			case Dereference:
			case LeftBracket:
			case LeftBrace:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				valueChain();
				setState(61);
				match(To);
				setState(62);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(StartTemplatesDefinition);
				setState(65);
				match(IDENTIFIER);
				setState(66);
				templatesBody();
				setState(67);
				match(EndDefinition);
				setState(68);
				match(IDENTIFIER);
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
		public List<TerminalNode> FieldDereference() { return getTokens(TailspinParser.FieldDereference); }
		public TerminalNode FieldDereference(int i) {
			return getToken(TailspinParser.FieldDereference, i);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
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
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(Dereference);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FieldDereference) {
					{
					{
					setState(73);
					match(FieldDereference);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				arithmeticExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				rangeLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				structureLiteral();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<ValueChainContext> valueChain() {
			return getRuleContexts(ValueChainContext.class);
		}
		public ValueChainContext valueChain(int i) {
			return getRuleContext(ValueChainContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LeftBracket);
			setState(87);
			valueChain();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dereference) | (1L << Comma) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(88);
					match(Comma);
					}
				}

				setState(91);
				valueChain();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RightBracket);
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

	public static class StructureLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureLiteralContext structureLiteral() throws RecognitionException {
		StructureLiteralContext _localctx = new StructureLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LeftBrace);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(100);
				keyValue();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(101);
					match(Comma);
					}
				}

				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RightBrace);
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

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Key);
			setState(112);
			valueChain();
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
	public static class CallDefinedTemplatesContext extends TemplatesContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public CallDefinedTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCallDefinedTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTemplatesContext extends TemplatesContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArrayTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayTemplates(this);
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
		enterRule(_localctx, 12, RULE_templates);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_STRING:
			case START_REGEXP:
				_localctx = new StringLiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				stringLiteral();
				}
				break;
			case LeftParen:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(LeftParen);
				setState(116);
				templatesBody();
				setState(117);
				match(RightParen);
				}
				break;
			case IDENTIFIER:
				_localctx = new CallDefinedTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(IDENTIFIER);
				}
				break;
			case LeftBracket:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(LeftBracket);
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(RightBracket);
				setState(123);
				match(LeftParen);
				setState(124);
				templatesBody();
				setState(125);
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
		public List<MatchTemplateContext> matchTemplate() {
			return getRuleContexts(MatchTemplateContext.class);
		}
		public MatchTemplateContext matchTemplate(int i) {
			return getRuleContext(MatchTemplateContext.class,i);
		}
		public TemplatesBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesBodyContext templatesBody() throws RecognitionException {
		TemplatesBodyContext _localctx = new TemplatesBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_templatesBody);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case Dereference:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				block();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher || _la==StartSubMatcher) {
					{
					{
					setState(130);
					matchTemplate();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
			case StartSubMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					matchTemplate();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StartMatcher || _la==StartSubMatcher );
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

	public static class MatchTemplateContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MatchTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchTemplate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchTemplateContext matchTemplate() throws RecognitionException {
		MatchTemplateContext _localctx = new MatchTemplateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			matcher();
			setState(144);
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
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				blockExpression();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << Dereference) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0) );
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
	 
		public BlockExpressionContext() { }
		public void copyFrom(BlockExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SendToTemplatesContext extends BlockExpressionContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public SendToTemplatesContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSendToTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultValueContext extends BlockExpressionContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public ResultValueContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitResultValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends BlockExpressionContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(BlockExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockExpression);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ResultValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				valueChain();
				}
				break;
			case 2:
				_localctx = new SendToTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				valueChain();
				setState(153);
				match(To);
				setState(154);
				match(TemplateMatch);
				}
				break;
			case 3:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				statement();
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

	public static class ValueChainContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_valueChain);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				source();
				setState(161);
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
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode Deconstructor() { return getToken(TailspinParser.Deconstructor, 0); }
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
		enterRule(_localctx, 24, RULE_transform);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(To);
				setState(166);
				templates();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(167);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(Deconstructor);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(171);
					transform();
					}
					break;
				}
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

	public static class MatcherContext extends ParserRuleContext {
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode StartSubMatcher() { return getToken(TailspinParser.StartSubMatcher, 0); }
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
		enterRule(_localctx, 26, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==StartMatcher || _la==StartSubMatcher) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START_STRING) | (1L << MatchInteger) | (1L << RangeMatch) | (1L << START_REGEXP) | (1L << StartStructureMatch))) != 0)) {
				{
				setState(177);
				condition();
				}
			}

			setState(180);
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeMatchContext extends ConditionContext {
		public TerminalNode RangeMatch() { return getToken(TailspinParser.RangeMatch, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexpMatchContext extends ConditionContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RegexpMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRegexpMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerEqualsContext extends ConditionContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public IntegerEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureMatchContext extends ConditionContext {
		public TerminalNode StartStructureMatch() { return getToken(TailspinParser.StartStructureMatch, 0); }
		public TerminalNode EndStructureMatch() { return getToken(TailspinParser.EndStructureMatch, 0); }
		public List<TerminalNode> StructureKey() { return getTokens(TailspinParser.StructureKey); }
		public TerminalNode StructureKey(int i) {
			return getToken(TailspinParser.StructureKey, i);
		}
		public List<MatcherContext> matcher() {
			return getRuleContexts(MatcherContext.class);
		}
		public MatcherContext matcher(int i) {
			return getRuleContext(MatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureMatchContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(MatchInteger);
				}
				break;
			case 2:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger) {
					{
					setState(183);
					lowerBound();
					}
				}

				setState(186);
				match(RangeMatch);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger) {
					{
					setState(187);
					upperBound();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(StartStructureMatch);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StructureKey) {
					{
					{
					setState(192);
					match(StructureKey);
					setState(193);
					matcher();
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(194);
						match(Comma);
						}
					}

					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(EndStructureMatch);
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

	public static class LowerBoundContext extends ParserRuleContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLowerBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(MatchInteger);
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

	public static class UpperBoundContext extends ParserRuleContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUpperBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_upperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(MatchInteger);
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
		enterRule(_localctx, 34, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			integerLiteral();
			setState(210);
			match(Range);
			setState(211);
			integerLiteral();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(212);
				match(Colon);
				setState(213);
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
		enterRule(_localctx, 36, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode START_REGEXP() { return getToken(TailspinParser.START_REGEXP, 0); }
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
		enterRule(_localctx, 38, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==START_STRING || _la==START_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringEvaluate) | (1L << StringDereference) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(219);
				stringContent();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
		enterRule(_localctx, 40, RULE_stringContent);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringEvaluate:
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		enterRule(_localctx, 42, RULE_stringInterpolate);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(StringDereference);
				}
				break;
			case StringEvaluate:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(StringEvaluate);
				setState(233);
				valueChain();
				setState(234);
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
		enterRule(_localctx, 44, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		public TerminalNode MultiplicativeOperator() { return getToken(TailspinParser.MultiplicativeOperator, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(241);
				integerLiteral();
				}
				break;
			case Dereference:
				{
				setState(242);
				match(Dereference);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						match(MultiplicativeOperator);
						setState(247);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(248);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(249);
						match(AdditiveOperator);
						setState(250);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		case 23:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\5\5\\\n\5\3\5\7\5_\n\5\f\5\16\5"+
		"b\13\5\3\5\3\5\3\6\3\6\3\6\5\6i\n\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082"+
		"\n\b\3\t\3\t\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\t\6\t\u008c\n\t\r\t\16"+
		"\t\u008d\5\t\u0090\n\t\3\n\3\n\3\n\3\13\6\13\u0096\n\13\r\13\16\13\u0097"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3"+
		"\16\3\16\3\16\5\16\u00ab\n\16\3\16\3\16\5\16\u00af\n\16\5\16\u00b1\n\16"+
		"\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3\20\3\20\5\20\u00bb\n\20\3\20\3"+
		"\20\5\20\u00bf\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\7\20\u00c8"+
		"\n\20\f\20\16\20\u00cb\13\20\3\20\5\20\u00ce\n\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00d9\n\23\3\24\3\24\3\25\3\25\7\25\u00df"+
		"\n\25\f\25\16\25\u00e2\13\25\3\25\3\25\3\26\3\26\5\26\u00e8\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00ef\n\27\3\30\3\30\3\31\3\31\3\31\5\31\u00f6"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00fe\n\31\f\31\16\31\u0101\13"+
		"\31\3\31\2\3\60\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\2\5\4\2\23\23$$\3\2\33\34\4\2\35\35((\2\u0113\2\62\3\2\2\2\4H\3\2\2\2"+
		"\6V\3\2\2\2\bX\3\2\2\2\ne\3\2\2\2\fq\3\2\2\2\16\u0081\3\2\2\2\20\u008f"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\u0095\3\2\2\2\26\u009f\3\2\2\2\30\u00a5\3"+
		"\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2"+
		"\2\"\u00d1\3\2\2\2$\u00d3\3\2\2\2&\u00da\3\2\2\2(\u00dc\3\2\2\2*\u00e7"+
		"\3\2\2\2,\u00ee\3\2\2\2.\u00f0\3\2\2\2\60\u00f5\3\2\2\2\62\66\5\4\3\2"+
		"\63\65\5\4\3\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"9\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7\4\2\2<=\7\22\2\2=I\5\30"+
		"\r\2>?\5\30\r\2?@\7\7\2\2@A\5.\30\2AI\3\2\2\2BC\7\24\2\2CD\7\36\2\2DE"+
		"\5\20\t\2EF\7\25\2\2FG\7\36\2\2GI\3\2\2\2H;\3\2\2\2H>\3\2\2\2HB\3\2\2"+
		"\2I\5\3\2\2\2JN\7\5\2\2KM\7\6\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OW\3\2\2\2PN\3\2\2\2QW\5(\25\2RW\5\60\31\2SW\5$\23\2TW\5\b\5\2UW\5"+
		"\n\6\2VJ\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\7"+
		"\3\2\2\2XY\7\16\2\2Y`\5\30\r\2Z\\\7\t\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2"+
		"\2\2]_\5\30\r\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3"+
		"\2\2\2cd\7\17\2\2d\t\3\2\2\2el\7\20\2\2fh\5\f\7\2gi\7\t\2\2hg\3\2\2\2"+
		"hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2op\7\21\2\2p\13\3\2\2\2qr\7\22\2\2rs\5\30\r\2s\r\3\2\2\2t\u0082"+
		"\5(\25\2uv\7\f\2\2vw\5\20\t\2wx\7\r\2\2x\u0082\3\2\2\2y\u0082\7\36\2\2"+
		"z{\7\16\2\2{|\7\36\2\2|}\7\17\2\2}~\7\f\2\2~\177\5\20\t\2\177\u0080\7"+
		"\r\2\2\u0080\u0082\3\2\2\2\u0081t\3\2\2\2\u0081u\3\2\2\2\u0081y\3\2\2"+
		"\2\u0081z\3\2\2\2\u0082\17\3\2\2\2\u0083\u0087\5\24\13\2\u0084\u0086\5"+
		"\22\n\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0090\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\22"+
		"\n\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u008b\3\2"+
		"\2\2\u0090\21\3\2\2\2\u0091\u0092\5\34\17\2\u0092\u0093\5\24\13\2\u0093"+
		"\23\3\2\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25\3\2\2\2\u0099\u00a0"+
		"\5\30\r\2\u009a\u009b\5\30\r\2\u009b\u009c\7\7\2\2\u009c\u009d\7\26\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u00a0\5\4\3\2\u009f\u0099\3\2\2\2\u009f\u009a"+
		"\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a6\5\6\4\2\u00a2"+
		"\u00a3\5\6\4\2\u00a3\u00a4\5\32\16\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3"+
		"\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a8\7\7\2\2\u00a8"+
		"\u00aa\5\16\b\2\u00a9\u00ab\5\32\16\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00ae\7\n\2\2\u00ad\u00af\5\32\16\2"+
		"\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a7"+
		"\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b4\t\2\2\2\u00b3"+
		"\u00b5\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\7%\2\2\u00b7\35\3\2\2\2\u00b8\u00ce\7&\2\2\u00b9\u00bb"+
		"\5 \21\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\7\'\2\2\u00bd\u00bf\5\"\22\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00ce\3\2\2\2\u00c0\u00ce\5(\25\2\u00c1\u00c9\7)\2\2\u00c2"+
		"\u00c3\7+\2\2\u00c3\u00c5\5\34\17\2\u00c4\u00c6\7\t\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\7*\2\2\u00cd\u00b8\3\2\2\2\u00cd"+
		"\u00ba\3\2\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c1\3\2\2\2\u00ce\37\3\2\2"+
		"\2\u00cf\u00d0\7&\2\2\u00d0!\3\2\2\2\u00d1\u00d2\7&\2\2\u00d2#\3\2\2\2"+
		"\u00d3\u00d4\5&\24\2\u00d4\u00d5\7\30\2\2\u00d5\u00d8\5&\24\2\u00d6\u00d7"+
		"\7\b\2\2\u00d7\u00d9\7\34\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9%\3\2\2\2\u00da\u00db\t\3\2\2\u00db\'\3\2\2\2\u00dc\u00e0\t\4\2"+
		"\2\u00dd\u00df\5*\26\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7#\2\2\u00e4)\3\2\2\2\u00e5\u00e8\5,\27\2\u00e6\u00e8\7\"\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00ef\7!\2\2\u00ea"+
		"\u00eb\7 \2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\7\r\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef-\3\2\2\2\u00f0\u00f1"+
		"\7\3\2\2\u00f1/\3\2\2\2\u00f2\u00f3\b\31\1\2\u00f3\u00f6\5&\24\2\u00f4"+
		"\u00f6\7\5\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00ff\3\2"+
		"\2\2\u00f7\u00f8\f\4\2\2\u00f8\u00f9\7\32\2\2\u00f9\u00fe\5\60\31\5\u00fa"+
		"\u00fb\f\3\2\2\u00fb\u00fc\7\31\2\2\u00fc\u00fe\5\60\31\4\u00fd\u00f7"+
		"\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\61\3\2\2\2\u0101\u00ff\3\2\2\2!\66HNV[`hl\u0081\u0087"+
		"\u008d\u008f\u0097\u009f\u00a5\u00aa\u00ae\u00b0\u00b4\u00ba\u00be\u00c5"+
		"\u00c9\u00cd\u00d8\u00e0\u00e7\u00ee\u00f5\u00fd\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}