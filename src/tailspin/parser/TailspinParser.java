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
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TailspinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Stdout=2, Stdin=3, Void=4, Def=5, To=6, ResultMarker=7, 
		At=8, Colon=9, DoubleColon=10, Dot=11, EndStringInterpolate=12, SemiColon=13, 
		Comma=14, Deconstructor=15, Invert=16, LeftParen=17, RightParen=18, LeftBracket=19, 
		RightBracket=20, LeftBrace=21, RightBrace=22, StartMatcher=23, StartTemplatesDefinition=24, 
		StartComposerDefinition=25, StartProcessorDefinition=26, EndDefinition=27, 
		TemplateMatch=28, StartDereference=29, Range=30, AdditiveOperator=31, 
		MultiplicativeOperator=32, Zero=33, PositiveInteger=34, START_STRING=35, 
		IDENTIFIER=36, WS=37, Else=38, EndMatcher=39, BeginSuchThat=40, Comment=41, 
		ComposerEndDefinition=42, StartComposerMatch=43, EndComposerMatch=44, 
		InvertComposerMatch=45, SequenceKey=46, ValueSeparator=47, Multiplier=48, 
		CountMultiplier=49, ComposeInteger=50, START_REGEX=51, StartSkipRule=52, 
		EndSkipRule=53, StartBuildArray=54, EndBuildArray=55, StartBuildStructure=56, 
		EndBuildStructure=57, KeySeparator=58, ComposerDef=59, ComposeDereference=60, 
		ComposerId=61, ComposerIgnoreWS=62, REGEX_TEXT=63, END_REGEX=64, StartStringEvaluate=65, 
		STRING_TEXT=66, END_STRING=67;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_parameterDefinitions = 2, RULE_source = 3, 
		RULE_dereferenceValue = 4, RULE_structureDereference = 5, RULE_arrayDereference = 6, 
		RULE_dimensionDereference = 7, RULE_message = 8, RULE_arrayLiteral = 9, 
		RULE_valueProduction = 10, RULE_structureLiteral = 11, RULE_keyValue = 12, 
		RULE_templates = 13, RULE_transformCall = 14, RULE_parameterValues = 15, 
		RULE_parameterValue = 16, RULE_templatesBody = 17, RULE_matchTemplate = 18, 
		RULE_block = 19, RULE_blockExpression = 20, RULE_resultValue = 21, RULE_blockStatement = 22, 
		RULE_sendToTemplates = 23, RULE_stateAssignment = 24, RULE_valueChain = 25, 
		RULE_transform = 26, RULE_collector = 27, RULE_matcher = 28, RULE_condition = 29, 
		RULE_typeMatch = 30, RULE_suchThat = 31, RULE_lowerBound = 32, RULE_upperBound = 33, 
		RULE_rangeLiteral = 34, RULE_integerLiteral = 35, RULE_nonZeroInteger = 36, 
		RULE_stringLiteral = 37, RULE_stringContent = 38, RULE_stringInterpolate = 39, 
		RULE_interpolateEvaluate = 40, RULE_sink = 41, RULE_arithmeticExpression = 42, 
		RULE_composerBody = 43, RULE_definedCompositionSequence = 44, RULE_compositionSequence = 45, 
		RULE_compositionMatcher = 46, RULE_multiplier = 47, RULE_compositionSkipRule = 48, 
		RULE_compositionCapture = 49, RULE_compositionKeyValue = 50, RULE_compositionComponent = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "parameterDefinitions", "source", "dereferenceValue", 
			"structureDereference", "arrayDereference", "dimensionDereference", "message", 
			"arrayLiteral", "valueProduction", "structureLiteral", "keyValue", "templates", 
			"transformCall", "parameterValues", "parameterValue", "templatesBody", 
			"matchTemplate", "block", "blockExpression", "resultValue", "blockStatement", 
			"sendToTemplates", "stateAssignment", "valueChain", "transform", "collector", 
			"matcher", "condition", "typeMatch", "suchThat", "lowerBound", "upperBound", 
			"rangeLiteral", "integerLiteral", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "interpolateEvaluate", "sink", 
			"arithmeticExpression", "composerBody", "definedCompositionSequence", 
			"compositionSequence", "compositionMatcher", "multiplier", "compositionSkipRule", 
			"compositionCapture", "compositionKeyValue", "compositionComponent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, "'::'", "'.'", null, "';'", "','", "'...'", null, null, null, null, 
			null, null, null, null, "'templates'", "'composer'", "'processor'", null, 
			"'#'", "'$'", "'..'", null, null, "'0'", null, null, null, null, "'|'", 
			null, "'?('", null, null, null, null, null, null, null, null, "'='", 
			null, null, null, null, null, null, null, null, null, "'def'", null, 
			null, null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "Colon", "DoubleColon", "Dot", "EndStringInterpolate", "SemiColon", 
			"Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "Else", 
			"EndMatcher", "BeginSuchThat", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "ValueSeparator", 
			"Multiplier", "CountMultiplier", "ComposeInteger", "START_REGEX", "StartSkipRule", 
			"EndSkipRule", "StartBuildArray", "EndBuildArray", "StartBuildStructure", 
			"EndBuildStructure", "KeySeparator", "ComposerDef", "ComposeDereference", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX", "StartStringEvaluate", 
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
			setState(104);
			statement();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartDereference) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
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
	public static class ComposerDefinitionContext extends StatementContext {
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public TerminalNode ComposerId() { return getToken(TailspinParser.ComposerId, 0); }
		public ComposerBodyContext composerBody() {
			return getRuleContext(ComposerBodyContext.class,0);
		}
		public TerminalNode ComposerEndDefinition() { return getToken(TailspinParser.ComposerEndDefinition, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public ComposerDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
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
	public static class ProcessorDefinitionContext extends StatementContext {
		public TerminalNode StartProcessorDefinition() { return getToken(TailspinParser.StartProcessorDefinition, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ProcessorDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProcessorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(Def);
				setState(114);
				match(IDENTIFIER);
				setState(115);
				match(Colon);
				setState(116);
				valueChain();
				}
				break;
			case Stdin:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartDereference:
			case AdditiveOperator:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				valueChain();
				setState(118);
				match(To);
				setState(119);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(StartTemplatesDefinition);
				setState(122);
				match(IDENTIFIER);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(123);
					parameterDefinitions();
					}
				}

				setState(126);
				templatesBody();
				setState(127);
				match(EndDefinition);
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case StartProcessorDefinition:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(StartProcessorDefinition);
				setState(131);
				match(IDENTIFIER);
				setState(132);
				block();
				setState(133);
				match(EndDefinition);
				setState(134);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(StartComposerDefinition);
				setState(137);
				match(ComposerId);
				setState(138);
				composerBody();
				setState(139);
				match(ComposerEndDefinition);
				setState(140);
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

	public static class ParameterDefinitionsContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Colon() { return getTokens(TailspinParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TailspinParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ParameterDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDefinitionsContext parameterDefinitions() throws RecognitionException {
		ParameterDefinitionsContext _localctx = new ParameterDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(At);
			setState(145);
			match(LeftBrace);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(IDENTIFIER);
				setState(147);
				match(Colon);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(148);
					match(Comma);
					}
				}

				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(155);
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode Stdin() { return getToken(TailspinParser.Stdin, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_source);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(Stdin);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				dereferenceValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				rangeLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(LeftParen);
				setState(164);
				valueChain();
				setState(165);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				arithmeticExpression(0);
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

	public static class DereferenceValueContext extends ParserRuleContext {
		public TerminalNode StartDereference() { return getToken(TailspinParser.StartDereference, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<StructureDereferenceContext> structureDereference() {
			return getRuleContexts(StructureDereferenceContext.class);
		}
		public StructureDereferenceContext structureDereference(int i) {
			return getRuleContext(StructureDereferenceContext.class,i);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public DereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DereferenceValueContext dereferenceValue() throws RecognitionException {
		DereferenceValueContext _localctx = new DereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dereferenceValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(StartDereference);
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case At:
				{
				setState(171);
				match(At);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(172);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(175);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(178);
				match(LeftParen);
				setState(179);
				arrayDereference();
				setState(180);
				match(RightParen);
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					structureDereference();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(190);
				message();
				}
				break;
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

	public static class StructureDereferenceContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(TailspinParser.Dot, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public StructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDereferenceContext structureDereference() throws RecognitionException {
		StructureDereferenceContext _localctx = new StructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structureDereference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(Dot);
			setState(194);
			match(IDENTIFIER);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(195);
				match(LeftParen);
				setState(196);
				arrayDereference();
				setState(197);
				match(RightParen);
				}
				break;
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

	public static class ArrayDereferenceContext extends ParserRuleContext {
		public List<DimensionDereferenceContext> dimensionDereference() {
			return getRuleContexts(DimensionDereferenceContext.class);
		}
		public DimensionDereferenceContext dimensionDereference(int i) {
			return getRuleContext(DimensionDereferenceContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public ArrayDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDereferenceContext arrayDereference() throws RecognitionException {
		ArrayDereferenceContext _localctx = new ArrayDereferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDereference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			dimensionDereference();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(202);
				match(SemiColon);
				setState(203);
				dimensionDereference();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DimensionDereferenceContext extends ParserRuleContext {
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
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
		public DimensionDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDimensionDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionDereferenceContext dimensionDereference() throws RecognitionException {
		DimensionDereferenceContext _localctx = new DimensionDereferenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimensionDereference);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				dereferenceValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				arrayLiteral();
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

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(TailspinParser.DoubleColon, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DoubleColon);
			setState(216);
			match(IDENTIFIER);
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
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<ValueProductionContext> valueProduction() {
			return getRuleContexts(ValueProductionContext.class);
		}
		public ValueProductionContext valueProduction(int i) {
			return getRuleContext(ValueProductionContext.class,i);
		}
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
		enterRule(_localctx, 18, RULE_arrayLiteral);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(LeftBracket);
				setState(219);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(LeftBracket);
				setState(221);
				valueProduction();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(222);
					match(Comma);
					setState(223);
					valueProduction();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(RightBracket);
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

	public static class ValueProductionContext extends ParserRuleContext {
		public SendToTemplatesContext sendToTemplates() {
			return getRuleContext(SendToTemplatesContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public ValueProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueProduction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitValueProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueProductionContext valueProduction() throws RecognitionException {
		ValueProductionContext _localctx = new ValueProductionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueProduction);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				valueChain();
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
		enterRule(_localctx, 22, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LeftBrace);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(238);
				keyValue();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(239);
					match(Comma);
					}
				}

				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
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
		enterRule(_localctx, 24, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDENTIFIER);
			setState(250);
			match(Colon);
			setState(251);
			valueProduction();
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
	public static class LiteralTemplatesContext extends TemplatesContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public LiteralTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallDefinedTransformContext extends TemplatesContext {
		public TransformCallContext transformCall() {
			return getRuleContext(TransformCallContext.class,0);
		}
		public CallDefinedTransformContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCallDefinedTransform(this);
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
		enterRule(_localctx, 26, RULE_templates);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(LeftParen);
				setState(255);
				templatesBody();
				setState(256);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				transformCall();
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(LeftBracket);
				setState(260);
				match(IDENTIFIER);
				setState(261);
				match(RightBracket);
				setState(262);
				match(LeftParen);
				setState(263);
				templatesBody();
				setState(264);
				match(RightParen);
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

	public static class TransformCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TransformCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTransformCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformCallContext transformCall() throws RecognitionException {
		TransformCallContext _localctx = new TransformCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_transformCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(269);
				match(At);
				setState(270);
				parameterValues();
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

	public static class ParameterValuesContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<ParameterValueContext> parameterValue() {
			return getRuleContexts(ParameterValueContext.class);
		}
		public ParameterValueContext parameterValue(int i) {
			return getRuleContext(ParameterValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LeftBrace);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				parameterValue();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(275);
					match(Comma);
					}
				}

				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(282);
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

	public static class ParameterValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TransformCallContext transformCall() {
			return getRuleContext(TransformCallContext.class,0);
		}
		public ParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitParameterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IDENTIFIER);
			setState(285);
			match(Colon);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(286);
				valueChain();
				}
				break;
			case 2:
				{
				setState(287);
				transformCall();
				}
				break;
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
		enterRule(_localctx, 34, RULE_templatesBody);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Void:
			case Def:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartDereference:
			case AdditiveOperator:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				block();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(291);
					matchTemplate();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					matchTemplate();
					}
					}
					setState(300); 
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
		enterRule(_localctx, 36, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			matcher();
			setState(305);
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
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Def:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartDereference:
			case AdditiveOperator:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				{
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(307);
					blockExpression();
					}
					}
					setState(310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartDereference) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << IDENTIFIER))) != 0) );
				}
				break;
			case Void:
				{
				setState(312);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
		}
		public SendToTemplatesContext sendToTemplates() {
			return getRuleContext(SendToTemplatesContext.class,0);
		}
		public ResultValueContext resultValue() {
			return getRuleContext(ResultValueContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockExpression);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				resultValue();
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

	public static class ResultValueContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public ResultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitResultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultValueContext resultValue() throws RecognitionException {
		ResultValueContext _localctx = new ResultValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			valueChain();
			setState(322);
			match(ResultMarker);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			statement();
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

	public static class SendToTemplatesContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public SendToTemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendToTemplates; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSendToTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendToTemplatesContext sendToTemplates() throws RecognitionException {
		SendToTemplatesContext _localctx = new SendToTemplatesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			valueChain();
			setState(327);
			match(To);
			setState(328);
			match(TemplateMatch);
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

	public static class StateAssignmentContext extends ParserRuleContext {
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public StateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateAssignmentContext stateAssignment() throws RecognitionException {
		StateAssignmentContext _localctx = new StateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			valueChain();
			setState(331);
			match(To);
			setState(332);
			match(At);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(333);
				match(IDENTIFIER);
				}
				break;
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

	public static class ValueChainContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
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
		enterRule(_localctx, 50, RULE_valueChain);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				source();
				setState(338);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				keyValue();
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
		public CollectorContext collector() {
			return getRuleContext(CollectorContext.class,0);
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
		enterRule(_localctx, 52, RULE_transform);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(To);
				setState(344);
				templates();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(345);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(Deconstructor);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(349);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(To);
				setState(353);
				match(Deconstructor);
				setState(354);
				collector();
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(355);
					transform();
					}
					break;
				}
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

	public static class CollectorContext extends ParserRuleContext {
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode START_STRING() { return getToken(TailspinParser.START_STRING, 0); }
		public TerminalNode END_STRING() { return getToken(TailspinParser.END_STRING, 0); }
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public CollectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCollector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectorContext collector() throws RecognitionException {
		CollectorContext _localctx = new CollectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_collector);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				dereferenceValue();
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(START_STRING);
				setState(362);
				match(END_STRING);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				structureLiteral();
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
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
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
		enterRule(_localctx, 56, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(StartMatcher);
			setState(367);
			condition();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(368);
				match(Else);
				setState(369);
				condition();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
		public TypeMatchContext typeMatch() {
			return getRuleContext(TypeMatchContext.class,0);
		}
		public List<SuchThatContext> suchThat() {
			return getRuleContexts(SuchThatContext.class);
		}
		public SuchThatContext suchThat(int i) {
			return getRuleContext(SuchThatContext.class,i);
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
		enterRule(_localctx, 58, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartDereference) | (1L << Range) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(377);
				typeMatch();
				}
			}

			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					suchThat();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class TypeMatchContext extends ParserRuleContext {
		public TypeMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMatch; }
	 
		public TypeMatchContext() { }
		public void copyFrom(TypeMatchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RangeMatchContext extends TypeMatchContext {
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayMatchContext extends TypeMatchContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public ArrayMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexpMatchContext extends TypeMatchContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public RegexpMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRegexpMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerEqualsContext extends TypeMatchContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public IntegerEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureMatchContext extends TypeMatchContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Colon() { return getTokens(TailspinParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TailspinParser.Colon, i);
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
		public StructureMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectEqualsContext extends TypeMatchContext {
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public ObjectEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitObjectEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertMatchContext extends TypeMatchContext {
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InvertMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInvertMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMatchContext typeMatch() throws RecognitionException {
		TypeMatchContext _localctx = new TypeMatchContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeMatch);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new ObjectEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				dereferenceValue();
				}
				break;
			case 2:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				arithmeticExpression(0);
				}
				break;
			case 3:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << StartDereference) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
					{
					setState(388);
					lowerBound();
					}
				}

				setState(391);
				match(Range);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Invert) | (1L << LeftParen) | (1L << StartDereference) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
					{
					setState(392);
					upperBound();
					}
				}

				}
				break;
			case 4:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(LeftBrace);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(397);
					match(IDENTIFIER);
					setState(398);
					match(Colon);
					setState(399);
					matcher();
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(400);
						match(Comma);
						}
					}

					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(RightBrace);
				}
				break;
			case 6:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				match(Invert);
				setState(410);
				condition();
				}
				break;
			case 7:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(LeftBracket);
				setState(412);
				match(RightBracket);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(413);
					match(LeftParen);
					setState(415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(414);
						arithmeticExpression(0);
						}
						break;
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Range) {
						{
						setState(417);
						match(Range);
						}
					}

					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << StartDereference) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger))) != 0)) {
						{
						setState(420);
						arithmeticExpression(0);
						}
					}

					setState(423);
					match(RightParen);
					}
				}

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

	public static class SuchThatContext extends ParserRuleContext {
		public TerminalNode BeginSuchThat() { return getToken(TailspinParser.BeginSuchThat, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public SuchThatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suchThat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSuchThat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuchThatContext suchThat() throws RecognitionException {
		SuchThatContext _localctx = new SuchThatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_suchThat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(BeginSuchThat);
			setState(429);
			valueChain();
			setState(430);
			matcher();
			setState(431);
			match(RightParen);
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
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
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
		enterRule(_localctx, 64, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(433);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(434);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(435);
				stringLiteral();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(438);
				match(Invert);
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

	public static class UpperBoundContext extends ParserRuleContext {
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
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
		enterRule(_localctx, 66, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(441);
				match(Invert);
				}
			}

			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(444);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(445);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(446);
				stringLiteral();
				}
				break;
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

	public static class RangeLiteralContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public List<TerminalNode> Invert() { return getTokens(TailspinParser.Invert); }
		public TerminalNode Invert(int i) {
			return getToken(TailspinParser.Invert, i);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
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
		enterRule(_localctx, 68, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			arithmeticExpression(0);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(450);
				match(Invert);
				}
			}

			setState(453);
			match(Range);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(454);
				match(Invert);
				}
			}

			setState(457);
			arithmeticExpression(0);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(458);
				match(Colon);
				setState(459);
				arithmeticExpression(0);
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
		public NonZeroIntegerContext nonZeroInteger() {
			return getRuleContext(NonZeroIntegerContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_integerLiteral);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(Zero);
				}
				break;
			case AdditiveOperator:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				nonZeroInteger();
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

	public static class NonZeroIntegerContext extends ParserRuleContext {
		public TerminalNode PositiveInteger() { return getToken(TailspinParser.PositiveInteger, 0); }
		public TerminalNode AdditiveOperator() { return getToken(TailspinParser.AdditiveOperator, 0); }
		public NonZeroIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonZeroInteger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitNonZeroInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonZeroIntegerContext nonZeroInteger() throws RecognitionException {
		NonZeroIntegerContext _localctx = new NonZeroIntegerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AdditiveOperator) {
				{
				setState(466);
				match(AdditiveOperator);
				}
			}

			setState(469);
			match(PositiveInteger);
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
		enterRule(_localctx, 74, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(START_STRING);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (StartDereference - 29)) | (1L << (StartStringEvaluate - 29)) | (1L << (STRING_TEXT - 29)))) != 0)) {
				{
				{
				setState(472);
				stringContent();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
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
		enterRule(_localctx, 76, RULE_stringContent);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartDereference:
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		public InterpolateEvaluateContext interpolateEvaluate() {
			return getRuleContext(InterpolateEvaluateContext.class,0);
		}
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode EndStringInterpolate() { return getToken(TailspinParser.EndStringInterpolate, 0); }
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
		enterRule(_localctx, 78, RULE_stringInterpolate);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				interpolateEvaluate();
				}
				break;
			case StartDereference:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(485);
				dereferenceValue();
				setState(486);
				match(EndStringInterpolate);
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

	public static class InterpolateEvaluateContext extends ParserRuleContext {
		public TerminalNode StartStringEvaluate() { return getToken(TailspinParser.StartStringEvaluate, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InterpolateEvaluateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateEvaluate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateEvaluate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateEvaluateContext interpolateEvaluate() throws RecognitionException {
		InterpolateEvaluateContext _localctx = new InterpolateEvaluateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(StartStringEvaluate);
			setState(491);
			valueChain();
			setState(492);
			match(RightParen);
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
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
		enterRule(_localctx, 82, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==Stdout || _la==Void) ) {
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode AdditiveOperator() { return getToken(TailspinParser.AdditiveOperator, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode MultiplicativeOperator() { return getToken(TailspinParser.MultiplicativeOperator, 0); }
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(497);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(498);
				match(LeftParen);
				setState(499);
				valueChain();
				setState(500);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AdditiveOperator) {
					{
					setState(502);
					match(AdditiveOperator);
					}
				}

				setState(505);
				dereferenceValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(508);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(509);
						match(MultiplicativeOperator);
						setState(510);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(511);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(512);
						match(AdditiveOperator);
						setState(513);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	public static class ComposerBodyContext extends ParserRuleContext {
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public List<DefinedCompositionSequenceContext> definedCompositionSequence() {
			return getRuleContexts(DefinedCompositionSequenceContext.class);
		}
		public DefinedCompositionSequenceContext definedCompositionSequence(int i) {
			return getRuleContext(DefinedCompositionSequenceContext.class,i);
		}
		public ComposerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composerBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposerBodyContext composerBody() throws RecognitionException {
		ComposerBodyContext _localctx = new ComposerBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			compositionSequence();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SequenceKey) {
				{
				{
				setState(520);
				definedCompositionSequence();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefinedCompositionSequenceContext extends ParserRuleContext {
		public TerminalNode SequenceKey() { return getToken(TailspinParser.SequenceKey, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public DefinedCompositionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedCompositionSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDefinedCompositionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinedCompositionSequenceContext definedCompositionSequence() throws RecognitionException {
		DefinedCompositionSequenceContext _localctx = new DefinedCompositionSequenceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(SequenceKey);
			setState(527);
			compositionSequence();
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

	public static class CompositionSequenceContext extends ParserRuleContext {
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public List<CompositionComponentContext> compositionComponent() {
			return getRuleContexts(CompositionComponentContext.class);
		}
		public CompositionComponentContext compositionComponent(int i) {
			return getRuleContext(CompositionComponentContext.class,i);
		}
		public CompositionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionSequenceContext compositionSequence() throws RecognitionException {
		CompositionSequenceContext _localctx = new CompositionSequenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_compositionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartSkipRule) {
				{
				{
				setState(529);
				compositionSkipRule();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(535);
				compositionComponent();
				}
				}
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartComposerMatch) | (1L << StartBuildArray) | (1L << StartBuildStructure) | (1L << ComposeDereference))) != 0) );
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

	public static class CompositionMatcherContext extends ParserRuleContext {
		public TerminalNode StartComposerMatch() { return getToken(TailspinParser.StartComposerMatch, 0); }
		public TerminalNode ComposerId() { return getToken(TailspinParser.ComposerId, 0); }
		public TerminalNode EndComposerMatch() { return getToken(TailspinParser.EndComposerMatch, 0); }
		public TerminalNode InvertComposerMatch() { return getToken(TailspinParser.InvertComposerMatch, 0); }
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public TerminalNode START_REGEX() { return getToken(TailspinParser.START_REGEX, 0); }
		public TerminalNode REGEX_TEXT() { return getToken(TailspinParser.REGEX_TEXT, 0); }
		public TerminalNode END_REGEX() { return getToken(TailspinParser.END_REGEX, 0); }
		public TerminalNode StartBuildArray() { return getToken(TailspinParser.StartBuildArray, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode EndBuildArray() { return getToken(TailspinParser.EndBuildArray, 0); }
		public TerminalNode StartBuildStructure() { return getToken(TailspinParser.StartBuildStructure, 0); }
		public TerminalNode EndBuildStructure() { return getToken(TailspinParser.EndBuildStructure, 0); }
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public List<CompositionKeyValueContext> compositionKeyValue() {
			return getRuleContexts(CompositionKeyValueContext.class);
		}
		public CompositionKeyValueContext compositionKeyValue(int i) {
			return getRuleContext(CompositionKeyValueContext.class,i);
		}
		public TerminalNode ComposeDereference() { return getToken(TailspinParser.ComposeDereference, 0); }
		public CompositionMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionMatcherContext compositionMatcher() throws RecognitionException {
		CompositionMatcherContext _localctx = new CompositionMatcherContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_compositionMatcher);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(StartComposerMatch);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(541);
					match(InvertComposerMatch);
					}
				}

				setState(544);
				match(ComposerId);
				setState(545);
				match(EndComposerMatch);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier || _la==CountMultiplier) {
					{
					setState(546);
					multiplier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(StartComposerMatch);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(550);
					match(InvertComposerMatch);
					}
				}

				setState(553);
				match(START_REGEX);
				setState(554);
				match(REGEX_TEXT);
				setState(555);
				match(END_REGEX);
				setState(556);
				match(EndComposerMatch);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier || _la==CountMultiplier) {
					{
					setState(557);
					multiplier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(StartBuildArray);
				setState(561);
				compositionSequence();
				setState(562);
				match(EndBuildArray);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				match(StartBuildStructure);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartSkipRule) {
					{
					{
					setState(565);
					compositionSkipRule();
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(571);
					compositionKeyValue();
					}
					}
					setState(574); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SequenceKey );
				setState(576);
				match(EndBuildStructure);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				match(ComposeDereference);
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

	public static class MultiplierContext extends ParserRuleContext {
		public TerminalNode Multiplier() { return getToken(TailspinParser.Multiplier, 0); }
		public TerminalNode CountMultiplier() { return getToken(TailspinParser.CountMultiplier, 0); }
		public TerminalNode ComposeInteger() { return getToken(TailspinParser.ComposeInteger, 0); }
		public TerminalNode ComposeDereference() { return getToken(TailspinParser.ComposeDereference, 0); }
		public MultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplierContext multiplier() throws RecognitionException {
		MultiplierContext _localctx = new MultiplierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_multiplier);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiplier:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(Multiplier);
				}
				break;
			case CountMultiplier:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(CountMultiplier);
				setState(583);
				_la = _input.LA(1);
				if ( !(_la==ComposeInteger || _la==ComposeDereference) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class CompositionSkipRuleContext extends ParserRuleContext {
		public TerminalNode StartSkipRule() { return getToken(TailspinParser.StartSkipRule, 0); }
		public TerminalNode EndSkipRule() { return getToken(TailspinParser.EndSkipRule, 0); }
		public List<CompositionCaptureContext> compositionCapture() {
			return getRuleContexts(CompositionCaptureContext.class);
		}
		public CompositionCaptureContext compositionCapture(int i) {
			return getRuleContext(CompositionCaptureContext.class,i);
		}
		public CompositionSkipRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionSkipRule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionSkipRuleContext compositionSkipRule() throws RecognitionException {
		CompositionSkipRuleContext _localctx = new CompositionSkipRuleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(StartSkipRule);
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(587);
				compositionCapture();
				}
				}
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartComposerMatch) | (1L << StartBuildArray) | (1L << StartBuildStructure) | (1L << ComposerDef) | (1L << ComposeDereference))) != 0) );
			setState(592);
			match(EndSkipRule);
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

	public static class CompositionCaptureContext extends ParserRuleContext {
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TerminalNode ComposerDef() { return getToken(TailspinParser.ComposerDef, 0); }
		public TerminalNode SequenceKey() { return getToken(TailspinParser.SequenceKey, 0); }
		public CompositionCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionCapture; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionCaptureContext compositionCapture() throws RecognitionException {
		CompositionCaptureContext _localctx = new CompositionCaptureContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compositionCapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ComposerDef) {
				{
				setState(594);
				match(ComposerDef);
				setState(595);
				match(SequenceKey);
				}
			}

			setState(598);
			compositionMatcher();
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

	public static class CompositionKeyValueContext extends ParserRuleContext {
		public TerminalNode SequenceKey() { return getToken(TailspinParser.SequenceKey, 0); }
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public TerminalNode ValueSeparator() { return getToken(TailspinParser.ValueSeparator, 0); }
		public CompositionKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionKeyValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionKeyValueContext compositionKeyValue() throws RecognitionException {
		CompositionKeyValueContext _localctx = new CompositionKeyValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compositionKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(SequenceKey);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartSkipRule) {
				{
				{
				setState(601);
				compositionSkipRule();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			compositionComponent();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ValueSeparator) {
				{
				setState(608);
				match(ValueSeparator);
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

	public static class CompositionComponentContext extends ParserRuleContext {
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public CompositionComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionComponentContext compositionComponent() throws RecognitionException {
		CompositionComponentContext _localctx = new CompositionComponentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compositionComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			compositionMatcher();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==StartSkipRule) {
				{
				{
				setState(612);
				compositionSkipRule();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u026d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\177\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0091\n\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0098\n\4\6\4\u009a\n\4\r\4\16\4\u009b\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\6\3\6\3\6\5\6\u00b0\n\6\3\6\5"+
		"\6\u00b3\n\6\3\6\3\6\3\6\3\6\5\6\u00b9\n\6\3\6\7\6\u00bc\n\6\f\6\16\6"+
		"\u00bf\13\6\3\6\5\6\u00c2\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ca\n\7\3"+
		"\b\3\b\3\b\7\b\u00cf\n\b\f\b\16\b\u00d2\13\b\3\t\3\t\3\t\3\t\5\t\u00d8"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e3\n\13\f\13\16"+
		"\13\u00e6\13\13\3\13\3\13\5\13\u00ea\n\13\3\f\3\f\5\f\u00ee\n\f\3\r\3"+
		"\r\3\r\5\r\u00f3\n\r\7\r\u00f5\n\r\f\r\16\r\u00f8\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\5\20\u0112\n\20\3\21\3\21\3\21"+
		"\5\21\u0117\n\21\6\21\u0119\n\21\r\21\16\21\u011a\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u0123\n\22\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a"+
		"\13\23\3\23\6\23\u012d\n\23\r\23\16\23\u012e\5\23\u0131\n\23\3\24\3\24"+
		"\3\24\3\25\6\25\u0137\n\25\r\25\16\25\u0138\3\25\5\25\u013c\n\25\3\26"+
		"\3\26\3\26\3\26\5\26\u0142\n\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\5\32\u0151\n\32\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0158\n\33\3\34\3\34\3\34\5\34\u015d\n\34\3\34\3\34\5\34\u0161\n\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0167\n\34\5\34\u0169\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u016f\n\35\3\36\3\36\3\36\3\36\7\36\u0175\n\36\f\36\16\36\u0178"+
		"\13\36\3\36\3\36\3\37\5\37\u017d\n\37\3\37\7\37\u0180\n\37\f\37\16\37"+
		"\u0183\13\37\3 \3 \3 \5 \u0188\n \3 \3 \5 \u018c\n \3 \3 \3 \3 \3 \3 "+
		"\5 \u0194\n \7 \u0196\n \f \16 \u0199\13 \3 \3 \3 \3 \3 \3 \3 \5 \u01a2"+
		"\n \3 \5 \u01a5\n \3 \5 \u01a8\n \3 \5 \u01ab\n \5 \u01ad\n \3!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\5\"\u01b7\n\"\3\"\5\"\u01ba\n\"\3#\5#\u01bd\n#\3#\3"+
		"#\3#\5#\u01c2\n#\3$\3$\5$\u01c6\n$\3$\3$\5$\u01ca\n$\3$\3$\3$\5$\u01cf"+
		"\n$\3%\3%\5%\u01d3\n%\3&\5&\u01d6\n&\3&\3&\3\'\3\'\7\'\u01dc\n\'\f\'\16"+
		"\'\u01df\13\'\3\'\3\'\3(\3(\5(\u01e5\n(\3)\3)\3)\3)\5)\u01eb\n)\3*\3*"+
		"\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u01fa\n,\3,\5,\u01fd\n,\3,\3,\3,"+
		"\3,\3,\3,\7,\u0205\n,\f,\16,\u0208\13,\3-\3-\7-\u020c\n-\f-\16-\u020f"+
		"\13-\3.\3.\3.\3/\7/\u0215\n/\f/\16/\u0218\13/\3/\6/\u021b\n/\r/\16/\u021c"+
		"\3\60\3\60\5\60\u0221\n\60\3\60\3\60\3\60\5\60\u0226\n\60\3\60\3\60\5"+
		"\60\u022a\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0231\n\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\7\60\u0239\n\60\f\60\16\60\u023c\13\60\3\60\6\60\u023f"+
		"\n\60\r\60\16\60\u0240\3\60\3\60\3\60\5\60\u0246\n\60\3\61\3\61\3\61\5"+
		"\61\u024b\n\61\3\62\3\62\6\62\u024f\n\62\r\62\16\62\u0250\3\62\3\62\3"+
		"\63\3\63\5\63\u0257\n\63\3\63\3\63\3\64\3\64\7\64\u025d\n\64\f\64\16\64"+
		"\u0260\13\64\3\64\3\64\5\64\u0264\n\64\3\65\3\65\7\65\u0268\n\65\f\65"+
		"\16\65\u026b\13\65\3\65\2\3V\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\4\4\2\4\4\6\6\4\2\64"+
		"\64>>\2\u02a6\2j\3\2\2\2\4\u0090\3\2\2\2\6\u0092\3\2\2\2\b\u00aa\3\2\2"+
		"\2\n\u00ac\3\2\2\2\f\u00c3\3\2\2\2\16\u00cb\3\2\2\2\20\u00d7\3\2\2\2\22"+
		"\u00d9\3\2\2\2\24\u00e9\3\2\2\2\26\u00ed\3\2\2\2\30\u00ef\3\2\2\2\32\u00fb"+
		"\3\2\2\2\34\u010c\3\2\2\2\36\u010e\3\2\2\2 \u0113\3\2\2\2\"\u011e\3\2"+
		"\2\2$\u0130\3\2\2\2&\u0132\3\2\2\2(\u013b\3\2\2\2*\u0141\3\2\2\2,\u0143"+
		"\3\2\2\2.\u0146\3\2\2\2\60\u0148\3\2\2\2\62\u014c\3\2\2\2\64\u0157\3\2"+
		"\2\2\66\u0168\3\2\2\28\u016e\3\2\2\2:\u0170\3\2\2\2<\u017c\3\2\2\2>\u01ac"+
		"\3\2\2\2@\u01ae\3\2\2\2B\u01b6\3\2\2\2D\u01bc\3\2\2\2F\u01c3\3\2\2\2H"+
		"\u01d2\3\2\2\2J\u01d5\3\2\2\2L\u01d9\3\2\2\2N\u01e4\3\2\2\2P\u01ea\3\2"+
		"\2\2R\u01ec\3\2\2\2T\u01f0\3\2\2\2V\u01fc\3\2\2\2X\u0209\3\2\2\2Z\u0210"+
		"\3\2\2\2\\\u0216\3\2\2\2^\u0245\3\2\2\2`\u024a\3\2\2\2b\u024c\3\2\2\2"+
		"d\u0256\3\2\2\2f\u025a\3\2\2\2h\u0265\3\2\2\2jn\5\4\3\2km\5\4\3\2lk\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\2\2\3r\3"+
		"\3\2\2\2st\7\7\2\2tu\7&\2\2uv\7\13\2\2v\u0091\5\64\33\2wx\5\64\33\2xy"+
		"\7\b\2\2yz\5T+\2z\u0091\3\2\2\2{|\7\32\2\2|~\7&\2\2}\177\5\6\4\2~}\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5$\23\2\u0081\u0082\7"+
		"\35\2\2\u0082\u0083\7&\2\2\u0083\u0091\3\2\2\2\u0084\u0085\7\34\2\2\u0085"+
		"\u0086\7&\2\2\u0086\u0087\5(\25\2\u0087\u0088\7\35\2\2\u0088\u0089\7&"+
		"\2\2\u0089\u0091\3\2\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7?\2\2\u008c"+
		"\u008d\5X-\2\u008d\u008e\7,\2\2\u008e\u008f\7&\2\2\u008f\u0091\3\2\2\2"+
		"\u0090s\3\2\2\2\u0090w\3\2\2\2\u0090{\3\2\2\2\u0090\u0084\3\2\2\2\u0090"+
		"\u008a\3\2\2\2\u0091\5\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0099\7\27\2"+
		"\2\u0094\u0095\7&\2\2\u0095\u0097\7\13\2\2\u0096\u0098\7\20\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0094\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\7\30\2\2\u009e\7\3\2\2\2\u009f\u00ab\7\5\2"+
		"\2\u00a0\u00ab\5\n\6\2\u00a1\u00ab\5L\'\2\u00a2\u00ab\5F$\2\u00a3\u00ab"+
		"\5\24\13\2\u00a4\u00ab\5\30\r\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\5\64"+
		"\33\2\u00a7\u00a8\7\24\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\5V,\2\u00aa"+
		"\u009f\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\t\3\2\2\2\u00ac\u00b2\7\37\2\2\u00ad\u00af\7\n\2"+
		"\2\u00ae\u00b0\7&\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00b3\7&\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b8\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7"+
		"\24\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bd\3\2\2\2\u00ba\u00bc\5\f\7\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c2\5\22\n\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\13\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c9\7&\2\2\u00c5\u00c6"+
		"\7\23\2\2\u00c6\u00c7\5\16\b\2\u00c7\u00c8\7\24\2\2\u00c8\u00ca\3\2\2"+
		"\2\u00c9\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\r\3\2\2\2\u00cb\u00d0"+
		"\5\20\t\2\u00cc\u00cd\7\17\2\2\u00cd\u00cf\5\20\t\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\17"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\5\n\6\2\u00d4\u00d8\5V,\2\u00d5"+
		"\u00d8\5F$\2\u00d6\u00d8\5\24\13\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00da"+
		"\7\f\2\2\u00da\u00db\7&\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7\25\2\2\u00dd"+
		"\u00ea\7\26\2\2\u00de\u00df\7\25\2\2\u00df\u00e4\5\26\f\2\u00e0\u00e1"+
		"\7\20\2\2\u00e1\u00e3\5\26\f\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00dc\3\2\2\2"+
		"\u00e9\u00de\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ee\5\60\31\2\u00ec\u00ee"+
		"\5\64\33\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\27\3\2\2\2\u00ef"+
		"\u00f6\7\27\2\2\u00f0\u00f2\5\32\16\2\u00f1\u00f3\7\20\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\30\2\2\u00fa\31\3\2\2\2\u00fb\u00fc"+
		"\7&\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5\26\f\2\u00fe\33\3\2\2\2\u00ff"+
		"\u010d\5\b\5\2\u0100\u0101\7\23\2\2\u0101\u0102\5$\23\2\u0102\u0103\7"+
		"\24\2\2\u0103\u010d\3\2\2\2\u0104\u010d\5\36\20\2\u0105\u0106\7\25\2\2"+
		"\u0106\u0107\7&\2\2\u0107\u0108\7\26\2\2\u0108\u0109\7\23\2\2\u0109\u010a"+
		"\5$\23\2\u010a\u010b\7\24\2\2\u010b\u010d\3\2\2\2\u010c\u00ff\3\2\2\2"+
		"\u010c\u0100\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010d\35"+
		"\3\2\2\2\u010e\u0111\7&\2\2\u010f\u0110\7\n\2\2\u0110\u0112\5 \21\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\37\3\2\2\2\u0113\u0118\7\27\2"+
		"\2\u0114\u0116\5\"\22\2\u0115\u0117\7\20\2\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7\30\2\2\u011d!\3\2\2\2\u011e\u011f\7&\2\2\u011f\u0122\7\13\2\2"+
		"\u0120\u0123\5\64\33\2\u0121\u0123\5\36\20\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123#\3\2\2\2\u0124\u0128\5(\25\2\u0125\u0127\5&\24\2"+
		"\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0131\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\5&\24\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0131\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u012c\3\2\2\2\u0131"+
		"%\3\2\2\2\u0132\u0133\5:\36\2\u0133\u0134\5(\25\2\u0134\'\3\2\2\2\u0135"+
		"\u0137\5*\26\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u013c\7\6\2\2\u013b"+
		"\u0136\3\2\2\2\u013b\u013a\3\2\2\2\u013c)\3\2\2\2\u013d\u0142\5.\30\2"+
		"\u013e\u0142\5\62\32\2\u013f\u0142\5\60\31\2\u0140\u0142\5,\27\2\u0141"+
		"\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2"+
		"\2\2\u0142+\3\2\2\2\u0143\u0144\5\64\33\2\u0144\u0145\7\t\2\2\u0145-\3"+
		"\2\2\2\u0146\u0147\5\4\3\2\u0147/\3\2\2\2\u0148\u0149\5\64\33\2\u0149"+
		"\u014a\7\b\2\2\u014a\u014b\7\36\2\2\u014b\61\3\2\2\2\u014c\u014d\5\64"+
		"\33\2\u014d\u014e\7\b\2\2\u014e\u0150\7\n\2\2\u014f\u0151\7&\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\63\3\2\2\2\u0152\u0158\5\b\5"+
		"\2\u0153\u0154\5\b\5\2\u0154\u0155\5\66\34\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0158\5\32\16\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0156\3"+
		"\2\2\2\u0158\65\3\2\2\2\u0159\u015a\7\b\2\2\u015a\u015c\5\34\17\2\u015b"+
		"\u015d\5\66\34\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0169\3"+
		"\2\2\2\u015e\u0160\7\21\2\2\u015f\u0161\5\66\34\2\u0160\u015f\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\u0169\3\2\2\2\u0162\u0163\7\b\2\2\u0163\u0164"+
		"\7\21\2\2\u0164\u0166\58\35\2\u0165\u0167\5\66\34\2\u0166\u0165\3\2\2"+
		"\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0159\3\2\2\2\u0168\u015e"+
		"\3\2\2\2\u0168\u0162\3\2\2\2\u0169\67\3\2\2\2\u016a\u016f\5\n\6\2\u016b"+
		"\u016c\7%\2\2\u016c\u016f\7E\2\2\u016d\u016f\5\30\r\2\u016e\u016a\3\2"+
		"\2\2\u016e\u016b\3\2\2\2\u016e\u016d\3\2\2\2\u016f9\3\2\2\2\u0170\u0171"+
		"\7\31\2\2\u0171\u0176\5<\37\2\u0172\u0173\7(\2\2\u0173\u0175\5<\37\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7)\2\2\u017a"+
		";\3\2\2\2\u017b\u017d\5> \2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u0181\3\2\2\2\u017e\u0180\5@!\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2"+
		"\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182=\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0184\u01ad\5\n\6\2\u0185\u01ad\5V,\2\u0186\u0188\5B\"\2\u0187"+
		"\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\7 "+
		"\2\2\u018a\u018c\5D#\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u01ad"+
		"\3\2\2\2\u018d\u01ad\5L\'\2\u018e\u0197\7\27\2\2\u018f\u0190\7&\2\2\u0190"+
		"\u0191\7\13\2\2\u0191\u0193\5:\36\2\u0192\u0194\7\20\2\2\u0193\u0192\3"+
		"\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u018f\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u01ad\7\30\2\2\u019b\u019c\7\22\2\2\u019c"+
		"\u01ad\5<\37\2\u019d\u019e\7\25\2\2\u019e\u01aa\7\26\2\2\u019f\u01a1\7"+
		"\23\2\2\u01a0\u01a2\5V,\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\7 \2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\5V,\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\7\24\2\2\u01aa\u019f\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u0184\3\2\2\2\u01ac\u0185"+
		"\3\2\2\2\u01ac\u0187\3\2\2\2\u01ac\u018d\3\2\2\2\u01ac\u018e\3\2\2\2\u01ac"+
		"\u019b\3\2\2\2\u01ac\u019d\3\2\2\2\u01ad?\3\2\2\2\u01ae\u01af\7*\2\2\u01af"+
		"\u01b0\5\64\33\2\u01b0\u01b1\5:\36\2\u01b1\u01b2\7\24\2\2\u01b2A\3\2\2"+
		"\2\u01b3\u01b7\5\n\6\2\u01b4\u01b7\5V,\2\u01b5\u01b7\5L\'\2\u01b6\u01b3"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u01ba\7\22\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baC\3\2\2\2"+
		"\u01bb\u01bd\7\22\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1"+
		"\3\2\2\2\u01be\u01c2\5\n\6\2\u01bf\u01c2\5V,\2\u01c0\u01c2\5L\'\2\u01c1"+
		"\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2E\3\2\2\2"+
		"\u01c3\u01c5\5V,\2\u01c4\u01c6\7\22\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\7 \2\2\u01c8\u01ca\7\22\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\5V"+
		",\2\u01cc\u01cd\7\13\2\2\u01cd\u01cf\5V,\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cfG\3\2\2\2\u01d0\u01d3\7#\2\2\u01d1\u01d3\5J&\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3I\3\2\2\2\u01d4\u01d6\7!\2\2\u01d5\u01d4"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\7$\2\2\u01d8"+
		"K\3\2\2\2\u01d9\u01dd\7%\2\2\u01da\u01dc\5N(\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2"+
		"\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7E\2\2\u01e1M\3\2\2\2\u01e2\u01e5"+
		"\5P)\2\u01e3\u01e5\7D\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"O\3\2\2\2\u01e6\u01eb\5R*\2\u01e7\u01e8\5\n\6\2\u01e8\u01e9\7\16\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ebQ\3\2\2\2"+
		"\u01ec\u01ed\7C\2\2\u01ed\u01ee\5\64\33\2\u01ee\u01ef\7\24\2\2\u01efS"+
		"\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1U\3\2\2\2\u01f2\u01f3\b,\1\2\u01f3\u01fd"+
		"\5H%\2\u01f4\u01f5\7\23\2\2\u01f5\u01f6\5\64\33\2\u01f6\u01f7\7\24\2\2"+
		"\u01f7\u01fd\3\2\2\2\u01f8\u01fa\7!\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\5\n\6\2\u01fc\u01f2\3\2\2\2\u01fc"+
		"\u01f4\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fd\u0206\3\2\2\2\u01fe\u01ff\f\4"+
		"\2\2\u01ff\u0200\7\"\2\2\u0200\u0205\5V,\5\u0201\u0202\f\3\2\2\u0202\u0203"+
		"\7!\2\2\u0203\u0205\5V,\4\u0204\u01fe\3\2\2\2\u0204\u0201\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207W\3\2\2\2"+
		"\u0208\u0206\3\2\2\2\u0209\u020d\5\\/\2\u020a\u020c\5Z.\2\u020b\u020a"+
		"\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"Y\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7\60\2\2\u0211\u0212\5\\/\2"+
		"\u0212[\3\2\2\2\u0213\u0215\5b\62\2\u0214\u0213\3\2\2\2\u0215\u0218\3"+
		"\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u021b\5h\65\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d]\3\2\2\2\u021e\u0220"+
		"\7-\2\2\u021f\u0221\7/\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\7?\2\2\u0223\u0225\7.\2\2\u0224\u0226\5`\61"+
		"\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0246\3\2\2\2\u0227\u0229"+
		"\7-\2\2\u0228\u022a\7/\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\7\65\2\2\u022c\u022d\7A\2\2\u022d\u022e\7B"+
		"\2\2\u022e\u0230\7.\2\2\u022f\u0231\5`\61\2\u0230\u022f\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0246\3\2\2\2\u0232\u0233\78\2\2\u0233\u0234\5\\"+
		"/\2\u0234\u0235\79\2\2\u0235\u0246\3\2\2\2\u0236\u023a\7:\2\2\u0237\u0239"+
		"\5b\62\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f\5f"+
		"\64\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\7;\2\2\u0243\u0246\3\2"+
		"\2\2\u0244\u0246\7>\2\2\u0245\u021e\3\2\2\2\u0245\u0227\3\2\2\2\u0245"+
		"\u0232\3\2\2\2\u0245\u0236\3\2\2\2\u0245\u0244\3\2\2\2\u0246_\3\2\2\2"+
		"\u0247\u024b\7\62\2\2\u0248\u0249\7\63\2\2\u0249\u024b\t\3\2\2\u024a\u0247"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024ba\3\2\2\2\u024c\u024e\7\66\2\2\u024d"+
		"\u024f\5d\63\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7\67\2\2\u0253"+
		"c\3\2\2\2\u0254\u0255\7=\2\2\u0255\u0257\7\60\2\2\u0256\u0254\3\2\2\2"+
		"\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\5^\60\2\u0259e\3"+
		"\2\2\2\u025a\u025e\7\60\2\2\u025b\u025d\5b\62\2\u025c\u025b\3\2\2\2\u025d"+
		"\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2"+
		"\2\2\u0260\u025e\3\2\2\2\u0261\u0263\5h\65\2\u0262\u0264\7\61\2\2\u0263"+
		"\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264g\3\2\2\2\u0265\u0269\5^\60\2"+
		"\u0266\u0268\5b\62\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026ai\3\2\2\2\u026b\u0269\3\2\2\2Sn~\u0090"+
		"\u0097\u009b\u00aa\u00af\u00b2\u00b8\u00bd\u00c1\u00c9\u00d0\u00d7\u00e4"+
		"\u00e9\u00ed\u00f2\u00f6\u010c\u0111\u0116\u011a\u0122\u0128\u012e\u0130"+
		"\u0138\u013b\u0141\u0150\u0157\u015c\u0160\u0166\u0168\u016e\u0176\u017c"+
		"\u0181\u0187\u018b\u0193\u0197\u01a1\u01a4\u01a7\u01aa\u01ac\u01b6\u01b9"+
		"\u01bc\u01c1\u01c5\u01c9\u01ce\u01d2\u01d5\u01dd\u01e4\u01ea\u01f9\u01fc"+
		"\u0204\u0206\u020d\u0216\u021c\u0220\u0225\u0229\u0230\u023a\u0240\u0245"+
		"\u024a\u0250\u0256\u025e\u0263\u0269";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}