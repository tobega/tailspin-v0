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
		StartComment=1, Stdout=2, Stdin=3, Void=4, Def=5, Dereference=6, StartArrayDereference=7, 
		FieldDereference=8, FieldArrayDereference=9, To=10, ResultMarker=11, At=12, 
		Message=13, Colon=14, SemiColon=15, Comma=16, Deconstructor=17, Invert=18, 
		LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, LeftBrace=23, 
		RightBrace=24, Key=25, StartMatcher=26, StartTemplatesDefinition=27, StartComposerDefinition=28, 
		StartProcessorDefinition=29, EndDefinition=30, TemplateMatch=31, StartDereference=32, 
		Range=33, AdditiveOperator=34, MultiplicativeOperator=35, Zero=36, NonZeroInteger=37, 
		START_STRING=38, IDENTIFIER=39, WS=40, StartStringEvaluate=41, StartStringInterpolate=42, 
		STRING_TEXT=43, END_STRING=44, EndInterpolate=45, InterpolateArray=46, 
		InterpolateIdentifier=47, InterpolateField=48, Else=49, MatchComma=50, 
		StartSubMatcher=51, EndMatcher=52, InvertMatch=53, BeginSuchThat=54, MatchInteger=55, 
		RangeMatch=56, START_REGEXP=57, StartStructureMatch=58, EndStructureMatch=59, 
		StartArrayMatch=60, EndArrayMatch=61, StructureKey=62, MatchMessage=63, 
		MatchDereference=64, MatchArrayDereference=65, MatchFieldDereference=66, 
		MatcherIgnoreWS=67, Comment=68, ComposerEndDefinition=69, StartComposerMatch=70, 
		EndComposerMatch=71, InvertComposerMatch=72, SequenceKey=73, Multiplier=74, 
		START_REGEX=75, StartSkipRule=76, EndSkipRule=77, StartBuildArray=78, 
		EndBuildArray=79, ComposerId=80, ComposerIgnoreWS=81, REGEX_TEXT=82, END_REGEX=83;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_source = 2, RULE_dereferenceValue = 3, 
		RULE_structureDereference = 4, RULE_arrayDereference = 5, RULE_dimensionDereference = 6, 
		RULE_arrayLiteral = 7, RULE_valueProduction = 8, RULE_structureLiteral = 9, 
		RULE_keyValue = 10, RULE_templates = 11, RULE_templatesBody = 12, RULE_matchTemplate = 13, 
		RULE_block = 14, RULE_blockExpression = 15, RULE_resultValue = 16, RULE_blockStatement = 17, 
		RULE_sendToTemplates = 18, RULE_stateAssignment = 19, RULE_valueChain = 20, 
		RULE_transform = 21, RULE_collector = 22, RULE_matcher = 23, RULE_condition = 24, 
		RULE_typeMatch = 25, RULE_suchThat = 26, RULE_lowerBound = 27, RULE_upperBound = 28, 
		RULE_matchArithmeticExpression = 29, RULE_matchDereferenceValue = 30, 
		RULE_matchStructureDereference = 31, RULE_rangeLiteral = 32, RULE_integerLiteral = 33, 
		RULE_stringLiteral = 34, RULE_stringContent = 35, RULE_stringInterpolate = 36, 
		RULE_interpolateEvaluate = 37, RULE_interpolateDereferenceValue = 38, 
		RULE_interpolateStructureDereference = 39, RULE_sink = 40, RULE_arithmeticExpression = 41, 
		RULE_composerBody = 42, RULE_definedCompositionSequence = 43, RULE_compositionSequence = 44, 
		RULE_compositionMatcher = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "source", "dereferenceValue", "structureDereference", 
			"arrayDereference", "dimensionDereference", "arrayLiteral", "valueProduction", 
			"structureLiteral", "keyValue", "templates", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "valueChain", "transform", "collector", "matcher", 
			"condition", "typeMatch", "suchThat", "lowerBound", "upperBound", "matchArithmeticExpression", 
			"matchDereferenceValue", "matchStructureDereference", "rangeLiteral", 
			"integerLiteral", "stringLiteral", "stringContent", "stringInterpolate", 
			"interpolateEvaluate", "interpolateDereferenceValue", "interpolateStructureDereference", 
			"sink", "arithmeticExpression", "composerBody", "definedCompositionSequence", 
			"compositionSequence", "compositionMatcher"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'stdout'", "'stdin'", "'void'", null, null, null, null, 
			null, "'->'", "'!'", "'@'", null, "':'", null, null, "'...'", null, null, 
			null, null, null, "'{'", "'}'", null, null, "'templates'", "'composer'", 
			"'processor'", null, "'#'", null, "'..'", null, null, "'0'", null, null, 
			null, null, "'$('", null, null, null, null, null, null, null, "'|'", 
			null, null, null, null, "'?('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Stdout", "Stdin", "Void", "Def", "Dereference", 
			"StartArrayDereference", "FieldDereference", "FieldArrayDereference", 
			"To", "ResultMarker", "At", "Message", "Colon", "SemiColon", "Comma", 
			"Deconstructor", "Invert", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Key", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "StartDereference", "Range", "AdditiveOperator", "MultiplicativeOperator", 
			"Zero", "NonZeroInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "Else", 
			"MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
			"MatchInteger", "RangeMatch", "START_REGEXP", "StartStructureMatch", 
			"EndStructureMatch", "StartArrayMatch", "EndArrayMatch", "StructureKey", 
			"MatchMessage", "MatchDereference", "MatchArrayDereference", "MatchFieldDereference", 
			"MatcherIgnoreWS", "Comment", "ComposerEndDefinition", "StartComposerMatch", 
			"EndComposerMatch", "InvertComposerMatch", "SequenceKey", "Multiplier", 
			"START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", "EndBuildArray", 
			"ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
			setState(92);
			statement();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Key) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(Def);
				setState(102);
				match(Key);
				setState(103);
				valueChain();
				}
				break;
			case Stdin:
			case Dereference:
			case StartArrayDereference:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case Key:
			case AdditiveOperator:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				valueChain();
				setState(105);
				match(To);
				setState(106);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(StartTemplatesDefinition);
				setState(109);
				match(IDENTIFIER);
				setState(110);
				templatesBody();
				setState(111);
				match(EndDefinition);
				setState(112);
				match(IDENTIFIER);
				}
				break;
			case StartProcessorDefinition:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(StartProcessorDefinition);
				setState(115);
				match(IDENTIFIER);
				setState(116);
				block();
				setState(117);
				match(EndDefinition);
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(StartComposerDefinition);
				setState(121);
				match(ComposerId);
				setState(122);
				composerBody();
				setState(123);
				match(ComposerEndDefinition);
				setState(124);
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
		public TerminalNode Stdin() { return getToken(TailspinParser.Stdin, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
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
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(Stdin);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				dereferenceValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				arithmeticExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				rangeLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				arrayLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				structureLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
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

	public static class DereferenceValueContext extends ParserRuleContext {
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public List<StructureDereferenceContext> structureDereference() {
			return getRuleContexts(StructureDereferenceContext.class);
		}
		public StructureDereferenceContext structureDereference(int i) {
			return getRuleContext(StructureDereferenceContext.class,i);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public TerminalNode StartArrayDereference() { return getToken(TailspinParser.StartArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 6, RULE_dereferenceValue);
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(Dereference);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						structureDereference();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(145);
					match(Message);
					}
					break;
				}
				}
				break;
			case StartArrayDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(StartArrayDereference);
				setState(149);
				arrayDereference();
				setState(150);
				match(RightParen);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						structureDereference();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(157);
					match(Message);
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

	public static class StructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> FieldDereference() { return getTokens(TailspinParser.FieldDereference); }
		public TerminalNode FieldDereference(int i) {
			return getToken(TailspinParser.FieldDereference, i);
		}
		public TerminalNode FieldArrayDereference() { return getToken(TailspinParser.FieldArrayDereference, 0); }
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
		enterRule(_localctx, 8, RULE_structureDereference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					match(FieldDereference);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FieldDereference:
				{
				setState(168);
				match(FieldDereference);
				}
				break;
			case FieldArrayDereference:
				{
				{
				setState(169);
				match(FieldArrayDereference);
				setState(170);
				arrayDereference();
				setState(171);
				match(RightParen);
				}
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
		enterRule(_localctx, 10, RULE_arrayDereference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			dimensionDereference();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(176);
				match(SemiColon);
				setState(177);
				dimensionDereference();
				}
				}
				setState(182);
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
		public TerminalNode NonZeroInteger() { return getToken(TailspinParser.NonZeroInteger, 0); }
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
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
		enterRule(_localctx, 12, RULE_dimensionDereference);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(NonZeroInteger);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				rangeLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
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
		enterRule(_localctx, 14, RULE_arrayLiteral);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(LeftBracket);
				setState(190);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(LeftBracket);
				setState(192);
				valueProduction();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << Comma) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Key) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
					{
					{
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(193);
						match(Comma);
						}
					}

					setState(196);
					valueProduction();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
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
		enterRule(_localctx, 16, RULE_valueProduction);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		enterRule(_localctx, 18, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LeftBrace);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(211);
				keyValue();
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(212);
					match(Comma);
					}
				}

				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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
		enterRule(_localctx, 20, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Key);
			setState(223);
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
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 22, RULE_templates);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(LeftParen);
				setState(227);
				templatesBody();
				setState(228);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(LeftBracket);
				setState(232);
				match(IDENTIFIER);
				setState(233);
				match(RightBracket);
				setState(234);
				match(LeftParen);
				setState(235);
				templatesBody();
				setState(236);
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
		enterRule(_localctx, 24, RULE_templatesBody);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Stdin:
			case Def:
			case Dereference:
			case StartArrayDereference:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case Key:
			case StartTemplatesDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case AdditiveOperator:
			case Zero:
			case NonZeroInteger:
			case START_STRING:
			case START_REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				block();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher || _la==StartSubMatcher) {
					{
					{
					setState(241);
					matchTemplate();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
			case StartSubMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(247);
					matchTemplate();
					}
					}
					setState(250); 
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
		enterRule(_localctx, 26, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			matcher();
			setState(255);
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				blockExpression();
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Key) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0) );
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
		enterRule(_localctx, 30, RULE_blockExpression);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
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
		enterRule(_localctx, 32, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			valueChain();
			setState(269);
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
		enterRule(_localctx, 34, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 36, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			valueChain();
			setState(274);
			match(To);
			setState(275);
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
		enterRule(_localctx, 38, RULE_stateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			valueChain();
			setState(278);
			match(To);
			setState(279);
			match(At);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(280);
				match(IDENTIFIER);
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

	public static class ValueChainContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 40, RULE_valueChain);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(LeftParen);
				setState(285);
				source();
				setState(286);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				source();
				setState(289);
				transform();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(LeftParen);
				setState(292);
				source();
				setState(293);
				match(RightParen);
				setState(294);
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
		enterRule(_localctx, 42, RULE_transform);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(To);
				setState(299);
				templates();
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(300);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(Deconstructor);
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(304);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(To);
				setState(308);
				match(Deconstructor);
				setState(309);
				collector();
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(310);
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
		enterRule(_localctx, 44, RULE_collector);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
			case StartArrayDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				dereferenceValue();
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(START_STRING);
				setState(317);
				match(END_STRING);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public TerminalNode StartSubMatcher() { return getToken(TailspinParser.StartSubMatcher, 0); }
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
		enterRule(_localctx, 46, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==StartMatcher || _la==StartSubMatcher) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(322);
			condition();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(323);
				match(Else);
				setState(324);
				condition();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
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
		enterRule(_localctx, 48, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (START_STRING - 38)) | (1L << (InvertMatch - 38)) | (1L << (MatchInteger - 38)) | (1L << (RangeMatch - 38)) | (1L << (START_REGEXP - 38)) | (1L << (StartStructureMatch - 38)) | (1L << (StartArrayMatch - 38)) | (1L << (MatchDereference - 38)))) != 0)) {
				{
				setState(332);
				typeMatch();
				}
			}

			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					suchThat();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode RangeMatch() { return getToken(TailspinParser.RangeMatch, 0); }
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
		public TerminalNode StartArrayMatch() { return getToken(TailspinParser.StartArrayMatch, 0); }
		public TerminalNode EndArrayMatch() { return getToken(TailspinParser.EndArrayMatch, 0); }
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
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
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public IntegerEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitIntegerEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureMatchContext extends TypeMatchContext {
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
		public List<TerminalNode> MatchComma() { return getTokens(TailspinParser.MatchComma); }
		public TerminalNode MatchComma(int i) {
			return getToken(TailspinParser.MatchComma, i);
		}
		public StructureMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvertMatchContext extends TypeMatchContext {
		public TerminalNode InvertMatch() { return getToken(TailspinParser.InvertMatch, 0); }
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
		enterRule(_localctx, 50, RULE_typeMatch);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				matchArithmeticExpression();
				}
				break;
			case 2:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchInteger || _la==MatchDereference) {
					{
					setState(342);
					lowerBound();
					}
				}

				setState(345);
				match(RangeMatch);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (InvertMatch - 53)) | (1L << (MatchInteger - 53)) | (1L << (MatchDereference - 53)))) != 0)) {
					{
					setState(346);
					upperBound();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(StartStructureMatch);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StructureKey) {
					{
					{
					setState(351);
					match(StructureKey);
					setState(352);
					matcher();
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MatchComma) {
						{
						setState(353);
						match(MatchComma);
						}
					}

					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(EndStructureMatch);
				}
				break;
			case 5:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(InvertMatch);
				setState(363);
				condition();
				}
				break;
			case 6:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(StartArrayMatch);
				setState(365);
				match(EndArrayMatch);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchArrayDereference) {
					{
					setState(366);
					match(MatchArrayDereference);
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(367);
						arithmeticExpression(0);
						}
						break;
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Range) {
						{
						setState(370);
						match(Range);
						}
					}

					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << AdditiveOperator) | (1L << Zero) | (1L << NonZeroInteger))) != 0)) {
						{
						setState(373);
						arithmeticExpression(0);
						}
					}

					setState(376);
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
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
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
		enterRule(_localctx, 52, RULE_suchThat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(BeginSuchThat);
			setState(382);
			source();
			setState(383);
			matcher();
			setState(384);
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
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public TerminalNode InvertMatch() { return getToken(TailspinParser.InvertMatch, 0); }
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
		enterRule(_localctx, 54, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			matchArithmeticExpression();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InvertMatch) {
				{
				setState(387);
				match(InvertMatch);
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
		public MatchArithmeticExpressionContext matchArithmeticExpression() {
			return getRuleContext(MatchArithmeticExpressionContext.class,0);
		}
		public TerminalNode InvertMatch() { return getToken(TailspinParser.InvertMatch, 0); }
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
		enterRule(_localctx, 56, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InvertMatch) {
				{
				setState(390);
				match(InvertMatch);
				}
			}

			setState(393);
			matchArithmeticExpression();
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

	public static class MatchArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public MatchDereferenceValueContext matchDereferenceValue() {
			return getRuleContext(MatchDereferenceValueContext.class,0);
		}
		public MatchArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArithmeticExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArithmeticExpressionContext matchArithmeticExpression() throws RecognitionException {
		MatchArithmeticExpressionContext _localctx = new MatchArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_matchArithmeticExpression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MatchInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(MatchInteger);
				}
				break;
			case MatchDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				matchDereferenceValue();
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

	public static class MatchDereferenceValueContext extends ParserRuleContext {
		public TerminalNode MatchDereference() { return getToken(TailspinParser.MatchDereference, 0); }
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<MatchStructureDereferenceContext> matchStructureDereference() {
			return getRuleContexts(MatchStructureDereferenceContext.class);
		}
		public MatchStructureDereferenceContext matchStructureDereference(int i) {
			return getRuleContext(MatchStructureDereferenceContext.class,i);
		}
		public TerminalNode MatchMessage() { return getToken(TailspinParser.MatchMessage, 0); }
		public MatchDereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchDereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchDereferenceValueContext matchDereferenceValue() throws RecognitionException {
		MatchDereferenceValueContext _localctx = new MatchDereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_matchDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(MatchDereference);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(400);
				match(MatchArrayDereference);
				setState(401);
				arrayDereference();
				setState(402);
				match(RightParen);
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MatchFieldDereference) {
				{
				{
				setState(406);
				matchStructureDereference();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchMessage) {
				{
				setState(412);
				match(MatchMessage);
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

	public static class MatchStructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> MatchFieldDereference() { return getTokens(TailspinParser.MatchFieldDereference); }
		public TerminalNode MatchFieldDereference(int i) {
			return getToken(TailspinParser.MatchFieldDereference, i);
		}
		public TerminalNode MatchArrayDereference() { return getToken(TailspinParser.MatchArrayDereference, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public MatchStructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStructureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStructureDereferenceContext matchStructureDereference() throws RecognitionException {
		MatchStructureDereferenceContext _localctx = new MatchStructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_matchStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(415);
					match(MatchFieldDereference);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(418); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(420);
				match(MatchArrayDereference);
				setState(421);
				arrayDereference();
				setState(422);
				match(RightParen);
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
		enterRule(_localctx, 64, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			arithmeticExpression(0);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(427);
				match(Invert);
				}
			}

			setState(430);
			match(Range);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(431);
				match(Invert);
				}
			}

			setState(434);
			arithmeticExpression(0);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(435);
				match(Colon);
				setState(436);
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
		enterRule(_localctx, 66, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 68, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==START_STRING || _la==START_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartStringEvaluate) | (1L << StartStringInterpolate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(442);
				stringContent();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
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
		enterRule(_localctx, 70, RULE_stringContent);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
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
		public InterpolateDereferenceValueContext interpolateDereferenceValue() {
			return getRuleContext(InterpolateDereferenceValueContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_stringInterpolate);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				interpolateEvaluate();
				}
				break;
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				interpolateDereferenceValue();
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
		enterRule(_localctx, 74, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(StartStringEvaluate);
			setState(459);
			valueChain();
			setState(460);
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

	public static class InterpolateDereferenceValueContext extends ParserRuleContext {
		public TerminalNode StartStringInterpolate() { return getToken(TailspinParser.StartStringInterpolate, 0); }
		public TerminalNode InterpolateIdentifier() { return getToken(TailspinParser.InterpolateIdentifier, 0); }
		public TerminalNode EndInterpolate() { return getToken(TailspinParser.EndInterpolate, 0); }
		public TerminalNode InterpolateArray() { return getToken(TailspinParser.InterpolateArray, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<InterpolateStructureDereferenceContext> interpolateStructureDereference() {
			return getRuleContexts(InterpolateStructureDereferenceContext.class);
		}
		public InterpolateStructureDereferenceContext interpolateStructureDereference(int i) {
			return getRuleContext(InterpolateStructureDereferenceContext.class,i);
		}
		public InterpolateDereferenceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateDereferenceValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateDereferenceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateDereferenceValueContext interpolateDereferenceValue() throws RecognitionException {
		InterpolateDereferenceValueContext _localctx = new InterpolateDereferenceValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interpolateDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(StartStringInterpolate);
			setState(463);
			match(InterpolateIdentifier);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(464);
				match(InterpolateArray);
				setState(465);
				arrayDereference();
				setState(466);
				match(RightParen);
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==InterpolateField) {
				{
				{
				setState(470);
				interpolateStructureDereference();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(EndInterpolate);
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

	public static class InterpolateStructureDereferenceContext extends ParserRuleContext {
		public List<TerminalNode> InterpolateField() { return getTokens(TailspinParser.InterpolateField); }
		public TerminalNode InterpolateField(int i) {
			return getToken(TailspinParser.InterpolateField, i);
		}
		public TerminalNode InterpolateArray() { return getToken(TailspinParser.InterpolateArray, 0); }
		public ArrayDereferenceContext arrayDereference() {
			return getRuleContext(ArrayDereferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public InterpolateStructureDereferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolateStructureDereference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInterpolateStructureDereference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolateStructureDereferenceContext interpolateStructureDereference() throws RecognitionException {
		InterpolateStructureDereferenceContext _localctx = new InterpolateStructureDereferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interpolateStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(478);
					match(InterpolateField);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(483);
				match(InterpolateArray);
				setState(484);
				arrayDereference();
				setState(485);
				match(RightParen);
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
		enterRule(_localctx, 80, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public DereferenceValueContext dereferenceValue() {
			return getRuleContext(DereferenceValueContext.class,0);
		}
		public TerminalNode AdditiveOperator() { return getToken(TailspinParser.AdditiveOperator, 0); }
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
			case NonZeroInteger:
				{
				setState(492);
				integerLiteral();
				}
				break;
			case LeftParen:
				{
				setState(493);
				match(LeftParen);
				setState(494);
				arithmeticExpression(0);
				setState(495);
				match(RightParen);
				}
				break;
			case Dereference:
			case StartArrayDereference:
			case AdditiveOperator:
				{
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AdditiveOperator) {
					{
					setState(497);
					match(AdditiveOperator);
					}
				}

				setState(500);
				dereferenceValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(509);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(503);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(504);
						match(MultiplicativeOperator);
						setState(505);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(506);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(507);
						match(AdditiveOperator);
						setState(508);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(513);
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
		enterRule(_localctx, 84, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			compositionSequence();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SequenceKey) {
				{
				{
				setState(515);
				definedCompositionSequence();
				}
				}
				setState(520);
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
		enterRule(_localctx, 86, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(SequenceKey);
			setState(522);
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
		public List<CompositionMatcherContext> compositionMatcher() {
			return getRuleContexts(CompositionMatcherContext.class);
		}
		public CompositionMatcherContext compositionMatcher(int i) {
			return getRuleContext(CompositionMatcherContext.class,i);
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
		enterRule(_localctx, 88, RULE_compositionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(524);
				compositionMatcher();
				}
				}
				setState(527); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (StartComposerMatch - 70)) | (1L << (StartSkipRule - 70)) | (1L << (StartBuildArray - 70)))) != 0) );
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
		public TerminalNode Multiplier() { return getToken(TailspinParser.Multiplier, 0); }
		public TerminalNode START_REGEX() { return getToken(TailspinParser.START_REGEX, 0); }
		public TerminalNode REGEX_TEXT() { return getToken(TailspinParser.REGEX_TEXT, 0); }
		public TerminalNode END_REGEX() { return getToken(TailspinParser.END_REGEX, 0); }
		public TerminalNode StartSkipRule() { return getToken(TailspinParser.StartSkipRule, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode EndSkipRule() { return getToken(TailspinParser.EndSkipRule, 0); }
		public TerminalNode StartBuildArray() { return getToken(TailspinParser.StartBuildArray, 0); }
		public TerminalNode EndBuildArray() { return getToken(TailspinParser.EndBuildArray, 0); }
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
		enterRule(_localctx, 90, RULE_compositionMatcher);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(StartComposerMatch);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(530);
					match(InvertComposerMatch);
					}
				}

				setState(533);
				match(ComposerId);
				setState(534);
				match(EndComposerMatch);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier) {
					{
					setState(535);
					match(Multiplier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				match(StartComposerMatch);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(539);
					match(InvertComposerMatch);
					}
				}

				setState(542);
				match(START_REGEX);
				setState(543);
				match(REGEX_TEXT);
				setState(544);
				match(END_REGEX);
				setState(545);
				match(EndComposerMatch);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier) {
					{
					setState(546);
					match(Multiplier);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(StartSkipRule);
				setState(550);
				compositionSequence();
				setState(551);
				match(EndSkipRule);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(553);
				match(StartBuildArray);
				setState(554);
				compositionSequence();
				setState(555);
				match(EndBuildArray);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u0232\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u008b\n\4\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5\3\5\5\5\u0095\n"+
		"\5\3\5\3\5\3\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e\13\5\3\5\5\5\u00a1\n\5"+
		"\5\5\u00a3\n\5\3\6\7\6\u00a6\n\6\f\6\16\6\u00a9\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00b0\n\6\3\7\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\b\3\b"+
		"\3\b\3\b\5\b\u00be\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3\t\7\t\u00c8"+
		"\n\t\f\t\16\t\u00cb\13\t\3\t\3\t\5\t\u00cf\n\t\3\n\3\n\5\n\u00d3\n\n\3"+
		"\13\3\13\3\13\5\13\u00d8\n\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00f1\n\r\3\16\3\16\7\16\u00f5\n\16\f\16\16\16\u00f8\13\16\3\16"+
		"\6\16\u00fb\n\16\r\16\16\16\u00fc\5\16\u00ff\n\16\3\17\3\17\3\17\3\20"+
		"\6\20\u0105\n\20\r\20\16\20\u0106\3\21\3\21\3\21\3\21\5\21\u010d\n\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u011c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u012b\n\26\3\27\3\27\3\27\5\27\u0130\n\27\3\27\3\27\5\27\u0134"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u013a\n\27\5\27\u013c\n\27\3\30\3\30\3"+
		"\30\3\30\5\30\u0142\n\30\3\31\3\31\3\31\3\31\7\31\u0148\n\31\f\31\16\31"+
		"\u014b\13\31\3\31\3\31\3\32\5\32\u0150\n\32\3\32\7\32\u0153\n\32\f\32"+
		"\16\32\u0156\13\32\3\33\3\33\5\33\u015a\n\33\3\33\3\33\5\33\u015e\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0165\n\33\7\33\u0167\n\33\f\33\16\33\u016a"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0173\n\33\3\33\5\33\u0176"+
		"\n\33\3\33\5\33\u0179\n\33\3\33\5\33\u017c\n\33\5\33\u017e\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\5\35\u0187\n\35\3\36\5\36\u018a\n\36\3\36"+
		"\3\36\3\37\3\37\5\37\u0190\n\37\3 \3 \3 \3 \3 \5 \u0197\n \3 \7 \u019a"+
		"\n \f \16 \u019d\13 \3 \5 \u01a0\n \3!\6!\u01a3\n!\r!\16!\u01a4\3!\3!"+
		"\3!\3!\5!\u01ab\n!\3\"\3\"\5\"\u01af\n\"\3\"\3\"\5\"\u01b3\n\"\3\"\3\""+
		"\3\"\5\"\u01b8\n\"\3#\3#\3$\3$\7$\u01be\n$\f$\16$\u01c1\13$\3$\3$\3%\3"+
		"%\5%\u01c7\n%\3&\3&\5&\u01cb\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u01d7"+
		"\n(\3(\7(\u01da\n(\f(\16(\u01dd\13(\3(\3(\3)\6)\u01e2\n)\r)\16)\u01e3"+
		"\3)\3)\3)\3)\5)\u01ea\n)\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u01f5\n+\3+\5+"+
		"\u01f8\n+\3+\3+\3+\3+\3+\3+\7+\u0200\n+\f+\16+\u0203\13+\3,\3,\7,\u0207"+
		"\n,\f,\16,\u020a\13,\3-\3-\3-\3.\6.\u0210\n.\r.\16.\u0211\3/\3/\5/\u0216"+
		"\n/\3/\3/\3/\5/\u021b\n/\3/\3/\5/\u021f\n/\3/\3/\3/\3/\3/\5/\u0226\n/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0230\n/\3/\2\3T\60\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\4\2\34\34"+
		"\65\65\3\2&\'\4\2((;;\4\2\4\4\6\6\2\u0265\2^\3\2\2\2\4\u0080\3\2\2\2\6"+
		"\u008a\3\2\2\2\b\u00a2\3\2\2\2\n\u00a7\3\2\2\2\f\u00b1\3\2\2\2\16\u00bd"+
		"\3\2\2\2\20\u00ce\3\2\2\2\22\u00d2\3\2\2\2\24\u00d4\3\2\2\2\26\u00e0\3"+
		"\2\2\2\30\u00f0\3\2\2\2\32\u00fe\3\2\2\2\34\u0100\3\2\2\2\36\u0104\3\2"+
		"\2\2 \u010c\3\2\2\2\"\u010e\3\2\2\2$\u0111\3\2\2\2&\u0113\3\2\2\2(\u0117"+
		"\3\2\2\2*\u012a\3\2\2\2,\u013b\3\2\2\2.\u0141\3\2\2\2\60\u0143\3\2\2\2"+
		"\62\u014f\3\2\2\2\64\u017d\3\2\2\2\66\u017f\3\2\2\28\u0184\3\2\2\2:\u0189"+
		"\3\2\2\2<\u018f\3\2\2\2>\u0191\3\2\2\2@\u01a2\3\2\2\2B\u01ac\3\2\2\2D"+
		"\u01b9\3\2\2\2F\u01bb\3\2\2\2H\u01c6\3\2\2\2J\u01ca\3\2\2\2L\u01cc\3\2"+
		"\2\2N\u01d0\3\2\2\2P\u01e1\3\2\2\2R\u01eb\3\2\2\2T\u01f7\3\2\2\2V\u0204"+
		"\3\2\2\2X\u020b\3\2\2\2Z\u020f\3\2\2\2\\\u022f\3\2\2\2^b\5\4\3\2_a\5\4"+
		"\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2"+
		"\2\3f\3\3\2\2\2gh\7\7\2\2hi\7\33\2\2i\u0081\5*\26\2jk\5*\26\2kl\7\f\2"+
		"\2lm\5R*\2m\u0081\3\2\2\2no\7\35\2\2op\7)\2\2pq\5\32\16\2qr\7 \2\2rs\7"+
		")\2\2s\u0081\3\2\2\2tu\7\37\2\2uv\7)\2\2vw\5\36\20\2wx\7 \2\2xy\7)\2\2"+
		"y\u0081\3\2\2\2z{\7\36\2\2{|\7R\2\2|}\5V,\2}~\7G\2\2~\177\7)\2\2\177\u0081"+
		"\3\2\2\2\u0080g\3\2\2\2\u0080j\3\2\2\2\u0080n\3\2\2\2\u0080t\3\2\2\2\u0080"+
		"z\3\2\2\2\u0081\5\3\2\2\2\u0082\u008b\7\5\2\2\u0083\u008b\5\b\5\2\u0084"+
		"\u008b\5F$\2\u0085\u008b\5T+\2\u0086\u008b\5B\"\2\u0087\u008b\5\20\t\2"+
		"\u0088\u008b\5\24\13\2\u0089\u008b\5\26\f\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2"+
		"\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\7\3\2\2\2\u008c\u0090\7\b\2\2\u008d\u008f\5\n\6\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7\17\2\2\u0094\u0093\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u00a3\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098"+
		"\5\f\7\2\u0098\u009c\7\26\2\2\u0099\u009b\5\n\6\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u008c\3\2\2\2\u00a2\u0096"+
		"\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00af\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00b0\7\n\2\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"\u00ad\5\f\7\2\u00ad\u00ae\7\26\2\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3"+
		"\2\2\2\u00af\u00ab\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b6\5\16\b\2\u00b2"+
		"\u00b3\7\21\2\2\u00b3\u00b5\5\16\b\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\r\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00be\7\'\2\2\u00ba\u00be\5B\"\2\u00bb\u00be\5\20\t\2\u00bc"+
		"\u00be\5\b\5\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00cf"+
		"\7\30\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c9\5\22\n\2\u00c3\u00c5\7\22\2"+
		"\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\5\22\n\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\7\30\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c1\3\2\2\2"+
		"\u00cf\21\3\2\2\2\u00d0\u00d3\5&\24\2\u00d1\u00d3\5*\26\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00db\7\31\2\2\u00d5"+
		"\u00d7\5\26\f\2\u00d6\u00d8\7\22\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7\32\2\2\u00df\25\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1"+
		"\u00e2\5\22\n\2\u00e2\27\3\2\2\2\u00e3\u00f1\5\6\4\2\u00e4\u00e5\7\25"+
		"\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\7\26\2\2\u00e7\u00f1\3\2\2\2\u00e8"+
		"\u00f1\7)\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7\30"+
		"\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7\26\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e8\3\2"+
		"\2\2\u00f0\u00e9\3\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f6\5\36\20\2\u00f3"+
		"\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\5\34\17\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00ff\33\3\2\2\2\u0100\u0101\5\60\31\2\u0101\u0102\5\36"+
		"\20\2\u0102\35\3\2\2\2\u0103\u0105\5 \21\2\u0104\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\37\3\2\2\2\u0108"+
		"\u010d\5$\23\2\u0109\u010d\5(\25\2\u010a\u010d\5&\24\2\u010b\u010d\5\""+
		"\22\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d!\3\2\2\2\u010e\u010f\5*\26\2\u010f\u0110\7\r\2\2"+
		"\u0110#\3\2\2\2\u0111\u0112\5\4\3\2\u0112%\3\2\2\2\u0113\u0114\5*\26\2"+
		"\u0114\u0115\7\f\2\2\u0115\u0116\7!\2\2\u0116\'\3\2\2\2\u0117\u0118\5"+
		"*\26\2\u0118\u0119\7\f\2\2\u0119\u011b\7\16\2\2\u011a\u011c\7)\2\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c)\3\2\2\2\u011d\u012b\5\6\4\2"+
		"\u011e\u011f\7\25\2\2\u011f\u0120\5\6\4\2\u0120\u0121\7\26\2\2\u0121\u012b"+
		"\3\2\2\2\u0122\u0123\5\6\4\2\u0123\u0124\5,\27\2\u0124\u012b\3\2\2\2\u0125"+
		"\u0126\7\25\2\2\u0126\u0127\5\6\4\2\u0127\u0128\7\26\2\2\u0128\u0129\5"+
		",\27\2\u0129\u012b\3\2\2\2\u012a\u011d\3\2\2\2\u012a\u011e\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012a\u0125\3\2\2\2\u012b+\3\2\2\2\u012c\u012d\7\f\2\2"+
		"\u012d\u012f\5\30\r\2\u012e\u0130\5,\27\2\u012f\u012e\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u013c\3\2\2\2\u0131\u0133\7\23\2\2\u0132\u0134\5,\27\2"+
		"\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013c\3\2\2\2\u0135\u0136"+
		"\7\f\2\2\u0136\u0137\7\23\2\2\u0137\u0139\5.\30\2\u0138\u013a\5,\27\2"+
		"\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u012c"+
		"\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0135\3\2\2\2\u013c-\3\2\2\2\u013d"+
		"\u0142\5\b\5\2\u013e\u013f\7(\2\2\u013f\u0142\7.\2\2\u0140\u0142\5\24"+
		"\13\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"/\3\2\2\2\u0143\u0144\t\2\2\2\u0144\u0149\5\62\32\2\u0145\u0146\7\63\2"+
		"\2\u0146\u0148\5\62\32\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014d\7\66\2\2\u014d\61\3\2\2\2\u014e\u0150\5\64\33\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u0153\5\66"+
		"\34\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\63\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u017e\5<\37"+
		"\2\u0158\u015a\58\35\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015d\7:\2\2\u015c\u015e\5:\36\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u017e\3\2\2\2\u015f\u017e\5F$\2\u0160\u0168\7<\2"+
		"\2\u0161\u0162\7@\2\2\u0162\u0164\5\60\31\2\u0163\u0165\7\64\2\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0161\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u017e\7=\2\2\u016c\u016d\7\67"+
		"\2\2\u016d\u017e\5\62\32\2\u016e\u016f\7>\2\2\u016f\u017b\7?\2\2\u0170"+
		"\u0172\7C\2\2\u0171\u0173\5T+\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0175\3\2\2\2\u0174\u0176\7#\2\2\u0175\u0174\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\5T+\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\7\26\2\2\u017b\u0170\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0157\3\2\2\2\u017d"+
		"\u0159\3\2\2\2\u017d\u015f\3\2\2\2\u017d\u0160\3\2\2\2\u017d\u016c\3\2"+
		"\2\2\u017d\u016e\3\2\2\2\u017e\65\3\2\2\2\u017f\u0180\78\2\2\u0180\u0181"+
		"\5\6\4\2\u0181\u0182\5\60\31\2\u0182\u0183\7\26\2\2\u0183\67\3\2\2\2\u0184"+
		"\u0186\5<\37\2\u0185\u0187\7\67\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3"+
		"\2\2\2\u01879\3\2\2\2\u0188\u018a\7\67\2\2\u0189\u0188\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\5<\37\2\u018c;\3\2\2\2\u018d"+
		"\u0190\79\2\2\u018e\u0190\5> \2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2"+
		"\2\u0190=\3\2\2\2\u0191\u0196\7B\2\2\u0192\u0193\7C\2\2\u0193\u0194\5"+
		"\f\7\2\u0194\u0195\7\26\2\2\u0195\u0197\3\2\2\2\u0196\u0192\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u019b\3\2\2\2\u0198\u019a\5@!\2\u0199\u0198\3\2\2"+
		"\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7A\2\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0?\3\2\2\2\u01a1\u01a3\7D\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01aa\3\2"+
		"\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8\5\f\7\2\u01a8\u01a9\7\26\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abA\3\2\2\2"+
		"\u01ac\u01ae\5T+\2\u01ad\u01af\7\24\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\7#\2\2\u01b1\u01b3\7\24\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\5T"+
		"+\2\u01b5\u01b6\7\20\2\2\u01b6\u01b8\5T+\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8C\3\2\2\2\u01b9\u01ba\t\3\2\2\u01baE\3\2\2\2\u01bb\u01bf"+
		"\t\4\2\2\u01bc\u01be\5H%\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c2\u01c3\7.\2\2\u01c3G\3\2\2\2\u01c4\u01c7\5J&\2\u01c5\u01c7\7"+
		"-\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7I\3\2\2\2\u01c8\u01cb"+
		"\5L\'\2\u01c9\u01cb\5N(\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"K\3\2\2\2\u01cc\u01cd\7+\2\2\u01cd\u01ce\5*\26\2\u01ce\u01cf\7\26\2\2"+
		"\u01cfM\3\2\2\2\u01d0\u01d1\7,\2\2\u01d1\u01d6\7\61\2\2\u01d2\u01d3\7"+
		"\60\2\2\u01d3\u01d4\5\f\7\2\u01d4\u01d5\7\26\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d2\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01db\3\2\2\2\u01d8\u01da\5P"+
		")\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7/"+
		"\2\2\u01dfO\3\2\2\2\u01e0\u01e2\7\62\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e9\3\2\2\2\u01e5"+
		"\u01e6\7\60\2\2\u01e6\u01e7\5\f\7\2\u01e7\u01e8\7\26\2\2\u01e8\u01ea\3"+
		"\2\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaQ\3\2\2\2\u01eb\u01ec"+
		"\t\5\2\2\u01ecS\3\2\2\2\u01ed\u01ee\b+\1\2\u01ee\u01f8\5D#\2\u01ef\u01f0"+
		"\7\25\2\2\u01f0\u01f1\5T+\2\u01f1\u01f2\7\26\2\2\u01f2\u01f8\3\2\2\2\u01f3"+
		"\u01f5\7$\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f8\5\b\5\2\u01f7\u01ed\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7"+
		"\u01f4\3\2\2\2\u01f8\u0201\3\2\2\2\u01f9\u01fa\f\4\2\2\u01fa\u01fb\7%"+
		"\2\2\u01fb\u0200\5T+\5\u01fc\u01fd\f\3\2\2\u01fd\u01fe\7$\2\2\u01fe\u0200"+
		"\5T+\4\u01ff\u01f9\3\2\2\2\u01ff\u01fc\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202U\3\2\2\2\u0203\u0201\3\2\2\2"+
		"\u0204\u0208\5Z.\2\u0205\u0207\5X-\2\u0206\u0205\3\2\2\2\u0207\u020a\3"+
		"\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209W\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020c\7K\2\2\u020c\u020d\5Z.\2\u020dY\3\2\2\2\u020e\u0210"+
		"\5\\/\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212[\3\2\2\2\u0213\u0215\7H\2\2\u0214\u0216\7J\2\2\u0215"+
		"\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7R"+
		"\2\2\u0218\u021a\7I\2\2\u0219\u021b\7L\2\2\u021a\u0219\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\u0230\3\2\2\2\u021c\u021e\7H\2\2\u021d\u021f\7J\2\2\u021e"+
		"\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7M"+
		"\2\2\u0221\u0222\7T\2\2\u0222\u0223\7U\2\2\u0223\u0225\7I\2\2\u0224\u0226"+
		"\7L\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0230\3\2\2\2\u0227"+
		"\u0228\7N\2\2\u0228\u0229\5Z.\2\u0229\u022a\7O\2\2\u022a\u0230\3\2\2\2"+
		"\u022b\u022c\7P\2\2\u022c\u022d\5Z.\2\u022d\u022e\7Q\2\2\u022e\u0230\3"+
		"\2\2\2\u022f\u0213\3\2\2\2\u022f\u021c\3\2\2\2\u022f\u0227\3\2\2\2\u022f"+
		"\u022b\3\2\2\2\u0230]\3\2\2\2Jb\u0080\u008a\u0090\u0094\u009c\u00a0\u00a2"+
		"\u00a7\u00af\u00b6\u00bd\u00c4\u00c9\u00ce\u00d2\u00d7\u00db\u00f0\u00f6"+
		"\u00fc\u00fe\u0106\u010c\u011b\u012a\u012f\u0133\u0139\u013b\u0141\u0149"+
		"\u014f\u0154\u0159\u015d\u0164\u0168\u0172\u0175\u0178\u017b\u017d\u0186"+
		"\u0189\u018f\u0196\u019b\u019f\u01a4\u01aa\u01ae\u01b2\u01b7\u01bf\u01c6"+
		"\u01ca\u01d6\u01db\u01e3\u01e9\u01f4\u01f7\u01ff\u0201\u0208\u0211\u0215"+
		"\u021a\u021e\u0225\u022f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}