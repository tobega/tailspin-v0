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
		StartComment=1, Stdout=2, Stdin=3, Void=4, Def=5, To=6, ResultMarker=7, 
		At=8, NamedAt=9, Colon=10, Key=11, Message=12, FieldReference=13, EndStringInterpolate=14, 
		SemiColon=15, Comma=16, Deconstructor=17, Invert=18, LeftParen=19, RightParen=20, 
		LeftBracket=21, RightBracket=22, LeftBrace=23, RightBrace=24, StartMatcher=25, 
		StartTemplatesDefinition=26, StartComposerDefinition=27, StartProcessorDefinition=28, 
		EndDefinition=29, TemplateMatch=30, Dereference=31, Range=32, Plus=33, 
		Minus=34, Star=35, Slash=36, Mod=37, Question=38, Equal=39, Zero=40, PositiveInteger=41, 
		START_STRING=42, IDENTIFIER=43, WS=44, Else=45, EndMatcher=46, BeginSuchThat=47, 
		Comment=48, REGEX_TEXT=49, END_REGEX=50, StartStringEvaluate=51, STRING_TEXT=52, 
		END_STRING=53;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_parameterDefinitions = 2, RULE_source = 3, 
		RULE_dereferenceValue = 4, RULE_reference = 5, RULE_structureReference = 6, 
		RULE_arrayReference = 7, RULE_dimensionReference = 8, RULE_message = 9, 
		RULE_arrayLiteral = 10, RULE_valueProduction = 11, RULE_structureLiteral = 12, 
		RULE_keyValues = 13, RULE_keyValue = 14, RULE_templates = 15, RULE_transformCall = 16, 
		RULE_parameterValues = 17, RULE_parameterValue = 18, RULE_templatesBody = 19, 
		RULE_matchTemplate = 20, RULE_block = 21, RULE_blockExpression = 22, RULE_resultValue = 23, 
		RULE_blockStatement = 24, RULE_sendToTemplates = 25, RULE_stateAssignment = 26, 
		RULE_valueChain = 27, RULE_transform = 28, RULE_matcher = 29, RULE_condition = 30, 
		RULE_typeMatch = 31, RULE_suchThat = 32, RULE_lowerBound = 33, RULE_upperBound = 34, 
		RULE_rangeLiteral = 35, RULE_integerLiteral = 36, RULE_nonZeroInteger = 37, 
		RULE_stringLiteral = 38, RULE_stringContent = 39, RULE_stringInterpolate = 40, 
		RULE_interpolateEvaluate = 41, RULE_sink = 42, RULE_arithmeticExpression = 43, 
		RULE_additiveOperator = 44, RULE_multiplicativeOperator = 45, RULE_composerBody = 46, 
		RULE_definedCompositionSequence = 47, RULE_compositionSequence = 48, RULE_compositionMatcher = 49, 
		RULE_multiplier = 50, RULE_compositionSkipRule = 51, RULE_compositionCapture = 52, 
		RULE_compositionKeyValue = 53, RULE_compositionComponent = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "parameterDefinitions", "source", "dereferenceValue", 
			"reference", "structureReference", "arrayReference", "dimensionReference", 
			"message", "arrayLiteral", "valueProduction", "structureLiteral", "keyValues", 
			"keyValue", "templates", "transformCall", "parameterValues", "parameterValue", 
			"templatesBody", "matchTemplate", "block", "blockExpression", "resultValue", 
			"blockStatement", "sendToTemplates", "stateAssignment", "valueChain", 
			"transform", "matcher", "condition", "typeMatch", "suchThat", "lowerBound", 
			"upperBound", "rangeLiteral", "integerLiteral", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "interpolateEvaluate", "sink", 
			"arithmeticExpression", "additiveOperator", "multiplicativeOperator", 
			"composerBody", "definedCompositionSequence", "compositionSequence", 
			"compositionMatcher", "multiplier", "compositionSkipRule", "compositionCapture", 
			"compositionKeyValue", "compositionComponent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, "'->'", "'!'", "'@'", 
			null, "':'", null, null, null, null, "';'", "','", "'...'", "'~'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'<'", "'templates'", "'composer'", 
			"'processor'", "'end'", "'#'", null, "'..'", "'+'", "'-'", "'*'", "'/'", 
			"'mod'", "'?'", "'='", "'0'", null, null, null, null, "'|'", "'>'", "'?('", 
			null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "To", "ResultMarker", 
			"At", "NamedAt", "Colon", "Key", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartMatcher", 
			"StartTemplatesDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"EndDefinition", "TemplateMatch", "Dereference", "Range", "Plus", "Minus", 
			"Star", "Slash", "Mod", "Question", "Equal", "Zero", "PositiveInteger", 
			"START_STRING", "IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", 
			"Comment", "REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "STRING_TEXT", 
			"END_STRING"
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
			setState(110);
			statement();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Key) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public ComposerBodyContext composerBody() {
			return getRuleContext(ComposerBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ComposerDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
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
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(Def);
				setState(120);
				match(Key);
				setState(121);
				valueChain();
				}
				break;
			case Stdin:
			case Key:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case Dereference:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				valueChain();
				setState(123);
				match(To);
				setState(124);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(StartTemplatesDefinition);
				setState(127);
				match(IDENTIFIER);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(128);
					parameterDefinitions();
					}
				}

				setState(131);
				templatesBody();
				setState(132);
				match(EndDefinition);
				setState(133);
				match(IDENTIFIER);
				}
				break;
			case StartProcessorDefinition:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(StartProcessorDefinition);
				setState(136);
				match(IDENTIFIER);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==At) {
					{
					setState(137);
					parameterDefinitions();
					}
				}

				setState(140);
				block();
				setState(141);
				match(EndDefinition);
				setState(142);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(StartComposerDefinition);
				setState(145);
				match(IDENTIFIER);
				setState(146);
				composerBody();
				setState(147);
				match(EndDefinition);
				setState(148);
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
		public List<TerminalNode> Key() { return getTokens(TailspinParser.Key); }
		public TerminalNode Key(int i) {
			return getToken(TailspinParser.Key, i);
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
			setState(152);
			match(At);
			setState(153);
			match(LeftBrace);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				match(Key);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(155);
					match(Comma);
					}
				}

				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Key );
			setState(162);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(Stdin);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				dereferenceValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				rangeLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(LeftParen);
				setState(171);
				valueChain();
				setState(172);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
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
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(Dereference);
			setState(178);
			reference();
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(179);
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayReferenceContext arrayReference() {
			return getRuleContext(ArrayReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<StructureReferenceContext> structureReference() {
			return getRuleContexts(StructureReferenceContext.class);
		}
		public StructureReferenceContext structureReference(int i) {
			return getRuleContext(StructureReferenceContext.class,i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(182);
				match(LeftParen);
				setState(183);
				arrayReference();
				setState(184);
				match(RightParen);
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					structureReference();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class StructureReferenceContext extends ParserRuleContext {
		public TerminalNode FieldReference() { return getToken(TailspinParser.FieldReference, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ArrayReferenceContext arrayReference() {
			return getRuleContext(ArrayReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public StructureReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureReferenceContext structureReference() throws RecognitionException {
		StructureReferenceContext _localctx = new StructureReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FieldReference);
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(195);
				match(LeftParen);
				setState(196);
				arrayReference();
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

	public static class ArrayReferenceContext extends ParserRuleContext {
		public List<DimensionReferenceContext> dimensionReference() {
			return getRuleContexts(DimensionReferenceContext.class);
		}
		public DimensionReferenceContext dimensionReference(int i) {
			return getRuleContext(DimensionReferenceContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public ArrayReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayReferenceContext arrayReference() throws RecognitionException {
		ArrayReferenceContext _localctx = new ArrayReferenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			dimensionReference();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(202);
				match(SemiColon);
				setState(203);
				dimensionReference();
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

	public static class DimensionReferenceContext extends ParserRuleContext {
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
		public DimensionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDimensionReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionReferenceContext dimensionReference() throws RecognitionException {
		DimensionReferenceContext _localctx = new DimensionReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dimensionReference);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
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
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Message);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(216);
				match(At);
				setState(217);
				parameterValues();
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
		enterRule(_localctx, 20, RULE_arrayLiteral);
		int _la;
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(LeftBracket);
				setState(221);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LeftBracket);
				setState(223);
				valueProduction();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(224);
					match(Comma);
					setState(225);
					valueProduction();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
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
		enterRule(_localctx, 22, RULE_valueProduction);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
		public List<KeyValuesContext> keyValues() {
			return getRuleContexts(KeyValuesContext.class);
		}
		public KeyValuesContext keyValues(int i) {
			return getRuleContext(KeyValuesContext.class,i);
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
		enterRule(_localctx, 24, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LeftBrace);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Key) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				{
				setState(240);
				keyValues();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(241);
					match(Comma);
					}
				}

				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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

	public static class KeyValuesContext extends ParserRuleContext {
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode Deconstructor() { return getToken(TailspinParser.Deconstructor, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public KeyValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuesContext keyValues() throws RecognitionException {
		KeyValuesContext _localctx = new KeyValuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyValues);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				valueChain();
				setState(253);
				match(Deconstructor);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				dereferenceValue();
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

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
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
		enterRule(_localctx, 28, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(Key);
			setState(259);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(TailspinParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TailspinParser.IDENTIFIER, i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
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
		enterRule(_localctx, 30, RULE_templates);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(LeftParen);
				setState(263);
				templatesBody();
				setState(264);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				transformCall();
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(LeftBracket);
				setState(268);
				match(IDENTIFIER);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(269);
					match(Comma);
					setState(270);
					match(IDENTIFIER);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(RightBracket);
				setState(277);
				match(LeftParen);
				setState(278);
				templatesBody();
				setState(279);
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
		enterRule(_localctx, 32, RULE_transformCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IDENTIFIER);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(284);
				match(At);
				setState(285);
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
		enterRule(_localctx, 34, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LeftBrace);
			setState(293); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				parameterValue();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(290);
					match(Comma);
					}
				}

				}
				}
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Key );
			setState(297);
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
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
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
		enterRule(_localctx, 36, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(Key);
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Key:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case Dereference:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				{
				setState(300);
				valueChain();
				}
				break;
			case IDENTIFIER:
				{
				setState(301);
				transformCall();
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
		enterRule(_localctx, 38, RULE_templatesBody);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Void:
			case Def:
			case Key:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case Dereference:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				block();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(305);
					matchTemplate();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(311);
					matchTemplate();
					}
					}
					setState(314); 
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
		enterRule(_localctx, 40, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			matcher();
			setState(319);
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
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Def:
			case Key:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case Dereference:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				{
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					blockExpression();
					}
					}
					setState(324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Key) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0) );
				}
				break;
			case Void:
				{
				setState(326);
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
		enterRule(_localctx, 44, RULE_blockExpression);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
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
		enterRule(_localctx, 46, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			valueChain();
			setState(336);
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
		enterRule(_localctx, 48, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		enterRule(_localctx, 50, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			valueChain();
			setState(341);
			match(To);
			setState(342);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode NamedAt() { return getToken(TailspinParser.NamedAt, 0); }
		public TerminalNode Deconstructor() { return getToken(TailspinParser.Deconstructor, 0); }
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
		enterRule(_localctx, 52, RULE_stateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			valueChain();
			setState(345);
			match(To);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Deconstructor) {
				{
				setState(346);
				match(Deconstructor);
				}
			}

			setState(349);
			_la = _input.LA(1);
			if ( !(_la==At || _la==NamedAt) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(350);
			reference();
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
		enterRule(_localctx, 54, RULE_valueChain);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				source();
				setState(354);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
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
		enterRule(_localctx, 56, RULE_transform);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(To);
				setState(360);
				templates();
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(361);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(Deconstructor);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(365);
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
		enterRule(_localctx, 58, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(StartMatcher);
			setState(371);
			condition();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(372);
				match(Else);
				setState(373);
				condition();
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
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
		enterRule(_localctx, 60, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(381);
				typeMatch();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(384);
					suchThat();
					}
					} 
				}
				setState(389);
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
		public List<TerminalNode> Key() { return getTokens(TailspinParser.Key); }
		public TerminalNode Key(int i) {
			return getToken(TailspinParser.Key, i);
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
		enterRule(_localctx, 62, RULE_typeMatch);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new ObjectEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				dereferenceValue();
				}
				break;
			case 2:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				arithmeticExpression(0);
				}
				break;
			case 3:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
					{
					setState(392);
					lowerBound();
					}
				}

				setState(395);
				match(Range);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Invert) | (1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
					{
					setState(396);
					upperBound();
					}
				}

				}
				break;
			case 4:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(400);
				match(LeftBrace);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Key) {
					{
					{
					setState(401);
					match(Key);
					setState(402);
					matcher();
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(403);
						match(Comma);
						}
					}

					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(RightBrace);
				}
				break;
			case 6:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(Invert);
				setState(413);
				condition();
				}
				break;
			case 7:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(414);
				match(LeftBracket);
				setState(415);
				match(RightBracket);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(416);
					match(LeftParen);
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(417);
						arithmeticExpression(0);
						}
						break;
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Range) {
						{
						setState(420);
						match(Range);
						}
					}

					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger))) != 0)) {
						{
						setState(423);
						arithmeticExpression(0);
						}
					}

					setState(426);
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
		enterRule(_localctx, 64, RULE_suchThat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(BeginSuchThat);
			setState(432);
			valueChain();
			setState(433);
			matcher();
			setState(434);
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
		enterRule(_localctx, 66, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(436);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(437);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(438);
				stringLiteral();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(441);
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
		enterRule(_localctx, 68, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(444);
				match(Invert);
				}
			}

			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(447);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(448);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(449);
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
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(452);
				lowerBound();
				}
			}

			setState(455);
			match(Range);
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(456);
				upperBound();
				}
				break;
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(459);
				match(Colon);
				setState(460);
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
		enterRule(_localctx, 72, RULE_integerLiteral);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
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
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(467);
				additiveOperator();
				}
			}

			setState(470);
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
		enterRule(_localctx, 76, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(START_STRING);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dereference) | (1L << StartStringEvaluate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(473);
				stringContent();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
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
		enterRule(_localctx, 78, RULE_stringContent);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
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
		enterRule(_localctx, 80, RULE_stringInterpolate);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				interpolateEvaluate();
				}
				break;
			case Dereference:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(486);
				dereferenceValue();
				setState(487);
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
		enterRule(_localctx, 82, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(StartStringEvaluate);
			setState(492);
			valueChain();
			setState(493);
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
		enterRule(_localctx, 84, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(498);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(499);
				match(LeftParen);
				setState(500);
				valueChain();
				setState(501);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(503);
					additiveOperator();
					}
				}

				setState(506);
				dereferenceValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(509);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(510);
						multiplicativeOperator();
						setState(511);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(513);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(514);
						additiveOperator();
						setState(515);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(521);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(TailspinParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TailspinParser.Minus, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(TailspinParser.Star, 0); }
		public TerminalNode Slash() { return getToken(TailspinParser.Slash, 0); }
		public TerminalNode Mod() { return getToken(TailspinParser.Mod, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Slash) | (1L << Mod))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			compositionSequence();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(527);
				definedCompositionSequence();
				}
				}
				setState(532);
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
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
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
		enterRule(_localctx, 94, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(Key);
			setState(534);
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
		enterRule(_localctx, 96, RULE_compositionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(536);
				compositionSkipRule();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
				compositionComponent();
				}
				}
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher) | (1L << Dereference))) != 0) );
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
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
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
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
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
		enterRule(_localctx, 98, RULE_compositionMatcher);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(StartMatcher);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Invert) {
					{
					setState(548);
					match(Invert);
					}
				}

				setState(551);
				match(IDENTIFIER);
				setState(552);
				match(EndMatcher);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
					{
					setState(553);
					multiplier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(StartMatcher);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Invert) {
					{
					setState(557);
					match(Invert);
					}
				}

				setState(560);
				stringLiteral();
				setState(561);
				match(EndMatcher);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
					{
					setState(562);
					multiplier();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				match(LeftBracket);
				setState(566);
				compositionSequence();
				setState(567);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				match(LeftBrace);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LeftParen) {
					{
					{
					setState(570);
					compositionSkipRule();
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(577); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(576);
					compositionKeyValue();
					}
					}
					setState(579); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Key );
				setState(581);
				match(RightBrace);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				match(Dereference);
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
		public TerminalNode Plus() { return getToken(TailspinParser.Plus, 0); }
		public TerminalNode Star() { return getToken(TailspinParser.Star, 0); }
		public TerminalNode Question() { return getToken(TailspinParser.Question, 0); }
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public TerminalNode PositiveInteger() { return getToken(TailspinParser.PositiveInteger, 0); }
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
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
		enterRule(_localctx, 100, RULE_multiplier);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(Equal);
				setState(590);
				_la = _input.LA(1);
				if ( !(_la==Dereference || _la==PositiveInteger) ) {
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
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 102, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(LeftParen);
			setState(595); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(594);
				compositionCapture();
				}
				}
				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher) | (1L << Dereference))) != 0) );
			setState(599);
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

	public static class CompositionCaptureContext extends ParserRuleContext {
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
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
		enterRule(_localctx, 104, RULE_compositionCapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Def) {
				{
				setState(601);
				match(Def);
				setState(602);
				match(Key);
				}
			}

			setState(605);
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
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
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
		enterRule(_localctx, 106, RULE_compositionKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(Key);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(608);
				compositionSkipRule();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			compositionComponent();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(615);
				match(Comma);
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
		enterRule(_localctx, 108, RULE_compositionComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			compositionMatcher();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(619);
				compositionSkipRule();
				}
				}
				setState(624);
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
		case 43:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0274\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u008d\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u0099\n\3\3\4\3\4\3\4\3\4\5\4\u009f\n\4\6\4\u00a1\n\4\r\4\16"+
		"\4\u00a2\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b2"+
		"\n\5\3\6\3\6\3\6\5\6\u00b7\n\6\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\7\7\u00c0"+
		"\n\7\f\7\16\7\u00c3\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00ca\n\b\3\t\3\t\3\t"+
		"\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\3\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\13"+
		"\3\13\3\13\5\13\u00dd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e5\n\f\f\f\16"+
		"\f\u00e8\13\f\3\f\3\f\5\f\u00ec\n\f\3\r\3\r\5\r\u00f0\n\r\3\16\3\16\3"+
		"\16\5\16\u00f5\n\16\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0103\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0112\n\21\f\21\16\21\u0115\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u011c\n\21\3\22\3\22\3\22\5\22\u0121"+
		"\n\22\3\23\3\23\3\23\5\23\u0126\n\23\6\23\u0128\n\23\r\23\16\23\u0129"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u0131\n\24\3\25\3\25\7\25\u0135\n\25\f"+
		"\25\16\25\u0138\13\25\3\25\6\25\u013b\n\25\r\25\16\25\u013c\5\25\u013f"+
		"\n\25\3\26\3\26\3\26\3\27\6\27\u0145\n\27\r\27\16\27\u0146\3\27\5\27\u014a"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0150\n\30\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u015e\n\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0168\n\35\3\36\3\36\3\36\5\36\u016d\n\36\3\36\3"+
		"\36\5\36\u0171\n\36\5\36\u0173\n\36\3\37\3\37\3\37\3\37\7\37\u0179\n\37"+
		"\f\37\16\37\u017c\13\37\3\37\3\37\3 \5 \u0181\n \3 \7 \u0184\n \f \16"+
		" \u0187\13 \3!\3!\3!\5!\u018c\n!\3!\3!\5!\u0190\n!\3!\3!\3!\3!\3!\5!\u0197"+
		"\n!\7!\u0199\n!\f!\16!\u019c\13!\3!\3!\3!\3!\3!\3!\3!\5!\u01a5\n!\3!\5"+
		"!\u01a8\n!\3!\5!\u01ab\n!\3!\5!\u01ae\n!\5!\u01b0\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\5#\u01ba\n#\3#\5#\u01bd\n#\3$\5$\u01c0\n$\3$\3$\3$\5$\u01c5"+
		"\n$\3%\5%\u01c8\n%\3%\3%\5%\u01cc\n%\3%\3%\5%\u01d0\n%\3&\3&\5&\u01d4"+
		"\n&\3\'\5\'\u01d7\n\'\3\'\3\'\3(\3(\7(\u01dd\n(\f(\16(\u01e0\13(\3(\3"+
		"(\3)\3)\5)\u01e6\n)\3*\3*\3*\3*\5*\u01ec\n*\3+\3+\3+\3+\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u01fb\n-\3-\5-\u01fe\n-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0208"+
		"\n-\f-\16-\u020b\13-\3.\3.\3/\3/\3\60\3\60\7\60\u0213\n\60\f\60\16\60"+
		"\u0216\13\60\3\61\3\61\3\61\3\62\7\62\u021c\n\62\f\62\16\62\u021f\13\62"+
		"\3\62\6\62\u0222\n\62\r\62\16\62\u0223\3\63\3\63\5\63\u0228\n\63\3\63"+
		"\3\63\3\63\5\63\u022d\n\63\3\63\3\63\5\63\u0231\n\63\3\63\3\63\3\63\5"+
		"\63\u0236\n\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u023e\n\63\f\63\16\63"+
		"\u0241\13\63\3\63\6\63\u0244\n\63\r\63\16\63\u0245\3\63\3\63\3\63\5\63"+
		"\u024b\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0252\n\64\3\65\3\65\6\65\u0256"+
		"\n\65\r\65\16\65\u0257\3\65\3\65\3\66\3\66\5\66\u025e\n\66\3\66\3\66\3"+
		"\67\3\67\7\67\u0264\n\67\f\67\16\67\u0267\13\67\3\67\3\67\5\67\u026b\n"+
		"\67\38\38\78\u026f\n8\f8\168\u0272\138\38\2\3X9\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\7"+
		"\3\2\n\13\4\2\4\4\6\6\3\2#$\3\2%\'\4\2!!++\2\u02ab\2p\3\2\2\2\4\u0098"+
		"\3\2\2\2\6\u009a\3\2\2\2\b\u00b1\3\2\2\2\n\u00b3\3\2\2\2\f\u00bc\3\2\2"+
		"\2\16\u00c4\3\2\2\2\20\u00cb\3\2\2\2\22\u00d7\3\2\2\2\24\u00d9\3\2\2\2"+
		"\26\u00eb\3\2\2\2\30\u00ef\3\2\2\2\32\u00f1\3\2\2\2\34\u0102\3\2\2\2\36"+
		"\u0104\3\2\2\2 \u011b\3\2\2\2\"\u011d\3\2\2\2$\u0122\3\2\2\2&\u012d\3"+
		"\2\2\2(\u013e\3\2\2\2*\u0140\3\2\2\2,\u0149\3\2\2\2.\u014f\3\2\2\2\60"+
		"\u0151\3\2\2\2\62\u0154\3\2\2\2\64\u0156\3\2\2\2\66\u015a\3\2\2\28\u0167"+
		"\3\2\2\2:\u0172\3\2\2\2<\u0174\3\2\2\2>\u0180\3\2\2\2@\u01af\3\2\2\2B"+
		"\u01b1\3\2\2\2D\u01b9\3\2\2\2F\u01bf\3\2\2\2H\u01c7\3\2\2\2J\u01d3\3\2"+
		"\2\2L\u01d6\3\2\2\2N\u01da\3\2\2\2P\u01e5\3\2\2\2R\u01eb\3\2\2\2T\u01ed"+
		"\3\2\2\2V\u01f1\3\2\2\2X\u01fd\3\2\2\2Z\u020c\3\2\2\2\\\u020e\3\2\2\2"+
		"^\u0210\3\2\2\2`\u0217\3\2\2\2b\u021d\3\2\2\2d\u024a\3\2\2\2f\u0251\3"+
		"\2\2\2h\u0253\3\2\2\2j\u025d\3\2\2\2l\u0261\3\2\2\2n\u026c\3\2\2\2pt\5"+
		"\4\3\2qs\5\4\3\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2wx\7\2\2\3x\3\3\2\2\2yz\7\7\2\2z{\7\r\2\2{\u0099\58\35\2|}\58\35"+
		"\2}~\7\b\2\2~\177\5V,\2\177\u0099\3\2\2\2\u0080\u0081\7\34\2\2\u0081\u0083"+
		"\7-\2\2\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5(\25\2\u0086\u0087\7\37\2\2\u0087\u0088\7"+
		"-\2\2\u0088\u0099\3\2\2\2\u0089\u008a\7\36\2\2\u008a\u008c\7-\2\2\u008b"+
		"\u008d\5\6\4\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\5,\27\2\u008f\u0090\7\37\2\2\u0090\u0091\7-\2\2\u0091"+
		"\u0099\3\2\2\2\u0092\u0093\7\35\2\2\u0093\u0094\7-\2\2\u0094\u0095\5^"+
		"\60\2\u0095\u0096\7\37\2\2\u0096\u0097\7-\2\2\u0097\u0099\3\2\2\2\u0098"+
		"y\3\2\2\2\u0098|\3\2\2\2\u0098\u0080\3\2\2\2\u0098\u0089\3\2\2\2\u0098"+
		"\u0092\3\2\2\2\u0099\5\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u00a0\7\31\2"+
		"\2\u009c\u009e\7\r\2\2\u009d\u009f\7\22\2\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\7\32\2\2\u00a5\7\3\2\2\2\u00a6\u00b2\7\5\2\2\u00a7\u00b2\5\n\6"+
		"\2\u00a8\u00b2\5N(\2\u00a9\u00b2\5H%\2\u00aa\u00b2\5\26\f\2\u00ab\u00b2"+
		"\5\32\16\2\u00ac\u00ad\7\25\2\2\u00ad\u00ae\58\35\2\u00ae\u00af\7\26\2"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\5X-\2\u00b1\u00a6\3\2\2\2\u00b1\u00a7"+
		"\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\t\3\2\2\2"+
		"\u00b3\u00b4\7!\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9"+
		"\u00ba\5\20\t\2\u00ba\u00bb\7\26\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\5\16\b\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\r\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\7\17\2\2\u00c5\u00c6"+
		"\7\25\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\7\26\2\2\u00c8\u00ca\3\2\2"+
		"\2\u00c9\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\17\3\2\2\2\u00cb\u00d0"+
		"\5\22\n\2\u00cc\u00cd\7\21\2\2\u00cd\u00cf\5\22\n\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\5\n\6\2\u00d4\u00d8\5X-\2\u00d5"+
		"\u00d8\5H%\2\u00d6\u00d8\5\26\f\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00dc"+
		"\7\16\2\2\u00da\u00db\7\n\2\2\u00db\u00dd\5$\23\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00ec"+
		"\7\30\2\2\u00e0\u00e1\7\27\2\2\u00e1\u00e6\5\30\r\2\u00e2\u00e3\7\22\2"+
		"\2\u00e3\u00e5\5\30\r\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7\30\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb"+
		"\u00e0\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00f0\5\64\33\2\u00ee\u00f0\58\35"+
		"\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f8"+
		"\7\31\2\2\u00f2\u00f4\5\34\17\2\u00f3\u00f5\7\22\2\2\u00f4\u00f3\3\2\2"+
		"\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7\u00fa"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc\33\3\2\2\2\u00fd\u0103\5\36"+
		"\20\2\u00fe\u00ff\58\35\2\u00ff\u0100\7\23\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u0103\5\n\6\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\35\3\2\2\2\u0104\u0105\7\r\2\2\u0105\u0106\5\30\r\2\u0106\37"+
		"\3\2\2\2\u0107\u011c\5\b\5\2\u0108\u0109\7\25\2\2\u0109\u010a\5(\25\2"+
		"\u010a\u010b\7\26\2\2\u010b\u011c\3\2\2\2\u010c\u011c\5\"\22\2\u010d\u010e"+
		"\7\27\2\2\u010e\u0113\7-\2\2\u010f\u0110\7\22\2\2\u0110\u0112\7-\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\30\2\2\u0117"+
		"\u0118\7\25\2\2\u0118\u0119\5(\25\2\u0119\u011a\7\26\2\2\u011a\u011c\3"+
		"\2\2\2\u011b\u0107\3\2\2\2\u011b\u0108\3\2\2\2\u011b\u010c\3\2\2\2\u011b"+
		"\u010d\3\2\2\2\u011c!\3\2\2\2\u011d\u0120\7-\2\2\u011e\u011f\7\n\2\2\u011f"+
		"\u0121\5$\23\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121#\3\2\2\2"+
		"\u0122\u0127\7\31\2\2\u0123\u0125\5&\24\2\u0124\u0126\7\22\2\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\7\32\2\2\u012c%\3\2\2\2\u012d\u0130\7\r\2\2\u012e\u0131"+
		"\58\35\2\u012f\u0131\5\"\22\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2"+
		"\u0131\'\3\2\2\2\u0132\u0136\5,\27\2\u0133\u0135\5*\26\2\u0134\u0133\3"+
		"\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013f\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5*\26\2\u013a\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u013a\3\2\2\2\u013f)\3\2\2\2"+
		"\u0140\u0141\5<\37\2\u0141\u0142\5,\27\2\u0142+\3\2\2\2\u0143\u0145\5"+
		".\30\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u014a\7\6\2\2\u0149\u0144\3\2"+
		"\2\2\u0149\u0148\3\2\2\2\u014a-\3\2\2\2\u014b\u0150\5\62\32\2\u014c\u0150"+
		"\5\66\34\2\u014d\u0150\5\64\33\2\u014e\u0150\5\60\31\2\u014f\u014b\3\2"+
		"\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"/\3\2\2\2\u0151\u0152\58\35\2\u0152\u0153\7\t\2\2\u0153\61\3\2\2\2\u0154"+
		"\u0155\5\4\3\2\u0155\63\3\2\2\2\u0156\u0157\58\35\2\u0157\u0158\7\b\2"+
		"\2\u0158\u0159\7 \2\2\u0159\65\3\2\2\2\u015a\u015b\58\35\2\u015b\u015d"+
		"\7\b\2\2\u015c\u015e\7\23\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f\u0160\t\2\2\2\u0160\u0161\5\f\7\2\u0161\67"+
		"\3\2\2\2\u0162\u0168\5\b\5\2\u0163\u0164\5\b\5\2\u0164\u0165\5:\36\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0168\5\36\20\2\u0167\u0162\3\2\2\2\u0167\u0163\3"+
		"\2\2\2\u0167\u0166\3\2\2\2\u01689\3\2\2\2\u0169\u016a\7\b\2\2\u016a\u016c"+
		"\5 \21\2\u016b\u016d\5:\36\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0173\3\2\2\2\u016e\u0170\7\23\2\2\u016f\u0171\5:\36\2\u0170\u016f\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0169\3\2\2\2\u0172"+
		"\u016e\3\2\2\2\u0173;\3\2\2\2\u0174\u0175\7\33\2\2\u0175\u017a\5> \2\u0176"+
		"\u0177\7/\2\2\u0177\u0179\5> \2\u0178\u0176\3\2\2\2\u0179\u017c\3\2\2"+
		"\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017d\u017e\7\60\2\2\u017e=\3\2\2\2\u017f\u0181\5@!\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0184\5B\"\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186?\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u01b0\5\n\6\2\u0189\u01b0"+
		"\5X-\2\u018a\u018c\5D#\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018f\7\"\2\2\u018e\u0190\5F$\2\u018f\u018e\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190\u01b0\3\2\2\2\u0191\u01b0\5N(\2\u0192\u019a"+
		"\7\31\2\2\u0193\u0194\7\r\2\2\u0194\u0196\5<\37\2\u0195\u0197\7\22\2\2"+
		"\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0193"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01b0\7\32\2\2\u019e\u019f\7"+
		"\24\2\2\u019f\u01b0\5> \2\u01a0\u01a1\7\27\2\2\u01a1\u01ad\7\30\2\2\u01a2"+
		"\u01a4\7\25\2\2\u01a3\u01a5\5X-\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a8\7\"\2\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01ab\5X-\2\u01aa\u01a9\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\7\26\2\2\u01ad"+
		"\u01a2\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u0188\3\2"+
		"\2\2\u01af\u0189\3\2\2\2\u01af\u018b\3\2\2\2\u01af\u0191\3\2\2\2\u01af"+
		"\u0192\3\2\2\2\u01af\u019e\3\2\2\2\u01af\u01a0\3\2\2\2\u01b0A\3\2\2\2"+
		"\u01b1\u01b2\7\61\2\2\u01b2\u01b3\58\35\2\u01b3\u01b4\5<\37\2\u01b4\u01b5"+
		"\7\26\2\2\u01b5C\3\2\2\2\u01b6\u01ba\5\n\6\2\u01b7\u01ba\5X-\2\u01b8\u01ba"+
		"\5N(\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01bd\7\24\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3"+
		"\2\2\2\u01bdE\3\2\2\2\u01be\u01c0\7\24\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c5\5\n\6\2\u01c2\u01c5\5X-\2\u01c3"+
		"\u01c5\5N(\2\u01c4\u01c1\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2"+
		"\2\u01c5G\3\2\2\2\u01c6\u01c8\5D#\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3"+
		"\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\"\2\2\u01ca\u01cc\5F$\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01ce\7\f"+
		"\2\2\u01ce\u01d0\5X-\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0I"+
		"\3\2\2\2\u01d1\u01d4\7*\2\2\u01d2\u01d4\5L\'\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4K\3\2\2\2\u01d5\u01d7\5Z.\2\u01d6\u01d5\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7+\2\2\u01d9M\3\2\2\2\u01da"+
		"\u01de\7,\2\2\u01db\u01dd\5P)\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2"+
		"\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e1\u01e2\7\67\2\2\u01e2O\3\2\2\2\u01e3\u01e6\5R*\2\u01e4\u01e6"+
		"\7\66\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6Q\3\2\2\2\u01e7"+
		"\u01ec\5T+\2\u01e8\u01e9\5\n\6\2\u01e9\u01ea\7\20\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01ecS\3\2\2\2\u01ed\u01ee"+
		"\7\65\2\2\u01ee\u01ef\58\35\2\u01ef\u01f0\7\26\2\2\u01f0U\3\2\2\2\u01f1"+
		"\u01f2\t\3\2\2\u01f2W\3\2\2\2\u01f3\u01f4\b-\1\2\u01f4\u01fe\5J&\2\u01f5"+
		"\u01f6\7\25\2\2\u01f6\u01f7\58\35\2\u01f7\u01f8\7\26\2\2\u01f8\u01fe\3"+
		"\2\2\2\u01f9\u01fb\5Z.\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\5\n\6\2\u01fd\u01f3\3\2\2\2\u01fd\u01f5\3\2"+
		"\2\2\u01fd\u01fa\3\2\2\2\u01fe\u0209\3\2\2\2\u01ff\u0200\f\4\2\2\u0200"+
		"\u0201\5\\/\2\u0201\u0202\5X-\5\u0202\u0208\3\2\2\2\u0203\u0204\f\3\2"+
		"\2\u0204\u0205\5Z.\2\u0205\u0206\5X-\4\u0206\u0208\3\2\2\2\u0207\u01ff"+
		"\3\2\2\2\u0207\u0203\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020aY\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\t\4\2\2"+
		"\u020d[\3\2\2\2\u020e\u020f\t\5\2\2\u020f]\3\2\2\2\u0210\u0214\5b\62\2"+
		"\u0211\u0213\5`\61\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215_\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\7\r\2\2\u0218\u0219\5b\62\2\u0219a\3\2\2\2\u021a\u021c\5h\65\2"+
		"\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5n8\2\u0221"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224c\3\2\2\2\u0225\u0227\7\33\2\2\u0226\u0228\7\24\2\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7-\2\2\u022a"+
		"\u022c\7\60\2\2\u022b\u022d\5f\64\2\u022c\u022b\3\2\2\2\u022c\u022d\3"+
		"\2\2\2\u022d\u024b\3\2\2\2\u022e\u0230\7\33\2\2\u022f\u0231\7\24\2\2\u0230"+
		"\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\5N"+
		"(\2\u0233\u0235\7\60\2\2\u0234\u0236\5f\64\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u024b\3\2\2\2\u0237\u0238\7\27\2\2\u0238\u0239\5"+
		"b\62\2\u0239\u023a\7\30\2\2\u023a\u024b\3\2\2\2\u023b\u023f\7\31\2\2\u023c"+
		"\u023e\5h\65\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0242"+
		"\u0244\5l\67\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7\32\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u024b\7!\2\2\u024a\u0225\3\2\2\2\u024a\u022e\3\2"+
		"\2\2\u024a\u0237\3\2\2\2\u024a\u023b\3\2\2\2\u024a\u0249\3\2\2\2\u024b"+
		"e\3\2\2\2\u024c\u0252\7#\2\2\u024d\u0252\7%\2\2\u024e\u0252\7(\2\2\u024f"+
		"\u0250\7)\2\2\u0250\u0252\t\6\2\2\u0251\u024c\3\2\2\2\u0251\u024d\3\2"+
		"\2\2\u0251\u024e\3\2\2\2\u0251\u024f\3\2\2\2\u0252g\3\2\2\2\u0253\u0255"+
		"\7\25\2\2\u0254\u0256\5j\66\2\u0255\u0254\3\2\2\2\u0256\u0257\3\2\2\2"+
		"\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a"+
		"\7\26\2\2\u025ai\3\2\2\2\u025b\u025c\7\7\2\2\u025c\u025e\7\r\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5d"+
		"\63\2\u0260k\3\2\2\2\u0261\u0265\7\r\2\2\u0262\u0264\5h\65\2\u0263\u0262"+
		"\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026a\5n8\2\u0269\u026b\7\22"+
		"\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026bm\3\2\2\2\u026c\u0270"+
		"\5d\63\2\u026d\u026f\5h\65\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271o\3\2\2\2\u0272\u0270\3\2\2\2"+
		"St\u0083\u008c\u0098\u009e\u00a2\u00b1\u00b6\u00bc\u00c1\u00c9\u00d0\u00d7"+
		"\u00dc\u00e6\u00eb\u00ef\u00f4\u00f8\u0102\u0113\u011b\u0120\u0125\u0129"+
		"\u0130\u0136\u013c\u013e\u0146\u0149\u014f\u015d\u0167\u016c\u0170\u0172"+
		"\u017a\u0180\u0185\u018b\u018f\u0196\u019a\u01a4\u01a7\u01aa\u01ad\u01af"+
		"\u01b9\u01bc\u01bf\u01c4\u01c7\u01cb\u01cf\u01d3\u01d6\u01de\u01e5\u01eb"+
		"\u01fa\u01fd\u0207\u0209\u0214\u021d\u0223\u0227\u022c\u0230\u0235\u023f"+
		"\u0245\u024a\u0251\u0257\u025d\u0265\u026a\u0270";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}