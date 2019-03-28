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
		Range=33, AdditiveOperator=34, MultiplicativeOperator=35, Zero=36, PositiveInteger=37, 
		START_STRING=38, IDENTIFIER=39, WS=40, StartStringEvaluate=41, StartStringInterpolate=42, 
		STRING_TEXT=43, END_STRING=44, EndInterpolate=45, InterpolateArray=46, 
		InterpolateIdentifier=47, InterpolateField=48, Else=49, MatchComma=50, 
		StartSubMatcher=51, EndMatcher=52, InvertMatch=53, BeginSuchThat=54, MatchInteger=55, 
		MatchAdditiveOperator=56, RangeMatch=57, START_REGEXP=58, StartStructureMatch=59, 
		EndStructureMatch=60, StartArrayMatch=61, EndArrayMatch=62, StructureKey=63, 
		MatchMessage=64, MatchDereference=65, MatchArrayDereference=66, MatchFieldDereference=67, 
		MatcherIgnoreWS=68, Comment=69, ComposerEndDefinition=70, StartComposerMatch=71, 
		EndComposerMatch=72, InvertComposerMatch=73, SequenceKey=74, Multiplier=75, 
		START_REGEX=76, StartSkipRule=77, EndSkipRule=78, StartBuildArray=79, 
		EndBuildArray=80, ComposerId=81, ComposerIgnoreWS=82, REGEX_TEXT=83, END_REGEX=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_source = 2, RULE_dereferenceValue = 3, 
		RULE_structureDereference = 4, RULE_arrayDereference = 5, RULE_dimensionDereference = 6, 
		RULE_arrayLiteral = 7, RULE_valueProduction = 8, RULE_structureLiteral = 9, 
		RULE_keyValue = 10, RULE_templates = 11, RULE_templatesBody = 12, RULE_matchTemplate = 13, 
		RULE_block = 14, RULE_blockExpression = 15, RULE_resultValue = 16, RULE_blockStatement = 17, 
		RULE_sendToTemplates = 18, RULE_stateAssignment = 19, RULE_valueChain = 20, 
		RULE_transform = 21, RULE_collector = 22, RULE_matcher = 23, RULE_condition = 24, 
		RULE_typeMatch = 25, RULE_suchThat = 26, RULE_lowerBound = 27, RULE_upperBound = 28, 
		RULE_matchArithmeticExpression = 29, RULE_matchIntegerLiteral = 30, RULE_matchDereferenceValue = 31, 
		RULE_matchStructureDereference = 32, RULE_rangeLiteral = 33, RULE_integerLiteral = 34, 
		RULE_nonZeroInteger = 35, RULE_stringLiteral = 36, RULE_stringContent = 37, 
		RULE_stringInterpolate = 38, RULE_interpolateEvaluate = 39, RULE_interpolateDereferenceValue = 40, 
		RULE_interpolateStructureDereference = 41, RULE_sink = 42, RULE_arithmeticExpression = 43, 
		RULE_composerBody = 44, RULE_definedCompositionSequence = 45, RULE_compositionSequence = 46, 
		RULE_compositionMatcher = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "source", "dereferenceValue", "structureDereference", 
			"arrayDereference", "dimensionDereference", "arrayLiteral", "valueProduction", 
			"structureLiteral", "keyValue", "templates", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "valueChain", "transform", "collector", "matcher", 
			"condition", "typeMatch", "suchThat", "lowerBound", "upperBound", "matchArithmeticExpression", 
			"matchIntegerLiteral", "matchDereferenceValue", "matchStructureDereference", 
			"rangeLiteral", "integerLiteral", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "interpolateEvaluate", "interpolateDereferenceValue", 
			"interpolateStructureDereference", "sink", "arithmeticExpression", "composerBody", 
			"definedCompositionSequence", "compositionSequence", "compositionMatcher"
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
			"Zero", "PositiveInteger", "START_STRING", "IDENTIFIER", "WS", "StartStringEvaluate", 
			"StartStringInterpolate", "STRING_TEXT", "END_STRING", "EndInterpolate", 
			"InterpolateArray", "InterpolateIdentifier", "InterpolateField", "Else", 
			"MatchComma", "StartSubMatcher", "EndMatcher", "InvertMatch", "BeginSuchThat", 
			"MatchInteger", "MatchAdditiveOperator", "RangeMatch", "START_REGEXP", 
			"StartStructureMatch", "EndStructureMatch", "StartArrayMatch", "EndArrayMatch", 
			"StructureKey", "MatchMessage", "MatchDereference", "MatchArrayDereference", 
			"MatchFieldDereference", "MatcherIgnoreWS", "Comment", "ComposerEndDefinition", 
			"StartComposerMatch", "EndComposerMatch", "InvertComposerMatch", "SequenceKey", 
			"Multiplier", "START_REGEX", "StartSkipRule", "EndSkipRule", "StartBuildArray", 
			"EndBuildArray", "ComposerId", "ComposerIgnoreWS", "REGEX_TEXT", "END_REGEX"
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
			setState(96);
			statement();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Key) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(Def);
				setState(106);
				match(Key);
				setState(107);
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
			case PositiveInteger:
			case START_STRING:
			case START_REGEXP:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				valueChain();
				setState(109);
				match(To);
				setState(110);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(StartTemplatesDefinition);
				setState(113);
				match(IDENTIFIER);
				setState(114);
				templatesBody();
				setState(115);
				match(EndDefinition);
				setState(116);
				match(IDENTIFIER);
				}
				break;
			case StartProcessorDefinition:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(StartProcessorDefinition);
				setState(119);
				match(IDENTIFIER);
				setState(120);
				block();
				setState(121);
				match(EndDefinition);
				setState(122);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(StartComposerDefinition);
				setState(125);
				match(ComposerId);
				setState(126);
				composerBody();
				setState(127);
				match(ComposerEndDefinition);
				setState(128);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(Stdin);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				dereferenceValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				arithmeticExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				rangeLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				arrayLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				structureLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(Dereference);
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						structureDereference();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(149);
					match(Message);
					}
					break;
				}
				}
				break;
			case StartArrayDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(StartArrayDereference);
				setState(153);
				arrayDereference();
				setState(154);
				match(RightParen);
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						structureDereference();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(161);
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
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(FieldDereference);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FieldDereference:
				{
				setState(172);
				match(FieldDereference);
				}
				break;
			case FieldArrayDereference:
				{
				{
				setState(173);
				match(FieldArrayDereference);
				setState(174);
				arrayDereference();
				setState(175);
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
			setState(179);
			dimensionDereference();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(180);
				match(SemiColon);
				setState(181);
				dimensionDereference();
				}
				}
				setState(186);
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
		public NonZeroIntegerContext nonZeroInteger() {
			return getRuleContext(NonZeroIntegerContext.class,0);
		}
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				nonZeroInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				rangeLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
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
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(LeftBracket);
				setState(194);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(LeftBracket);
				setState(196);
				valueProduction();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(197);
					match(Comma);
					setState(198);
					valueProduction();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
			setState(212);
			match(LeftBrace);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(213);
				keyValue();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(214);
					match(Comma);
					}
				}

				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			setState(224);
			match(Key);
			setState(225);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(LeftParen);
				setState(229);
				templatesBody();
				setState(230);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(LeftBracket);
				setState(234);
				match(IDENTIFIER);
				setState(235);
				match(RightBracket);
				setState(236);
				match(LeftParen);
				setState(237);
				templatesBody();
				setState(238);
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
			setState(254);
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
			case PositiveInteger:
			case START_STRING:
			case START_REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				block();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher || _la==StartSubMatcher) {
					{
					{
					setState(243);
					matchTemplate();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
			case StartSubMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(249);
					matchTemplate();
					}
					}
					setState(252); 
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
			setState(256);
			matcher();
			setState(257);
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
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				blockExpression();
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Stdin) | (1L << Def) | (1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Key) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING) | (1L << START_REGEXP))) != 0) );
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
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
			setState(270);
			valueChain();
			setState(271);
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
			setState(273);
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
			setState(275);
			valueChain();
			setState(276);
			match(To);
			setState(277);
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
			setState(279);
			valueChain();
			setState(280);
			match(To);
			setState(281);
			match(At);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(282);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(LeftParen);
				setState(287);
				source();
				setState(288);
				match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				source();
				setState(291);
				transform();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(LeftParen);
				setState(294);
				source();
				setState(295);
				match(RightParen);
				setState(296);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(To);
				setState(301);
				templates();
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(302);
					transform();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(Deconstructor);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(306);
					transform();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(To);
				setState(310);
				match(Deconstructor);
				setState(311);
				collector();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(312);
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dereference:
			case StartArrayDereference:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				dereferenceValue();
				}
				break;
			case START_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(START_STRING);
				setState(319);
				match(END_STRING);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
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
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==StartMatcher || _la==StartSubMatcher) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(324);
			condition();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(325);
				match(Else);
				setState(326);
				condition();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (START_STRING - 38)) | (1L << (InvertMatch - 38)) | (1L << (MatchInteger - 38)) | (1L << (MatchAdditiveOperator - 38)) | (1L << (RangeMatch - 38)) | (1L << (START_REGEXP - 38)) | (1L << (StartStructureMatch - 38)) | (1L << (StartArrayMatch - 38)) | (1L << (MatchDereference - 38)))) != 0)) {
				{
				setState(334);
				typeMatch();
				}
			}

			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					suchThat();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class ObjectEqualsContext extends TypeMatchContext {
		public MatchDereferenceValueContext matchDereferenceValue() {
			return getRuleContext(MatchDereferenceValueContext.class,0);
		}
		public ObjectEqualsContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitObjectEquals(this);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new ObjectEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				matchDereferenceValue();
				}
				break;
			case 2:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				matchArithmeticExpression();
				}
				break;
			case 3:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (MatchInteger - 55)) | (1L << (MatchAdditiveOperator - 55)) | (1L << (MatchDereference - 55)))) != 0)) {
					{
					setState(345);
					lowerBound();
					}
				}

				setState(348);
				match(RangeMatch);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (InvertMatch - 53)) | (1L << (MatchInteger - 53)) | (1L << (MatchAdditiveOperator - 53)) | (1L << (MatchDereference - 53)))) != 0)) {
					{
					setState(349);
					upperBound();
					}
				}

				}
				break;
			case 4:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(StartStructureMatch);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StructureKey) {
					{
					{
					setState(354);
					match(StructureKey);
					setState(355);
					matcher();
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MatchComma) {
						{
						setState(356);
						match(MatchComma);
						}
					}

					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(EndStructureMatch);
				}
				break;
			case 6:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				match(InvertMatch);
				setState(366);
				condition();
				}
				break;
			case 7:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				match(StartArrayMatch);
				setState(368);
				match(EndArrayMatch);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MatchArrayDereference) {
					{
					setState(369);
					match(MatchArrayDereference);
					setState(371);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(370);
						arithmeticExpression(0);
						}
						break;
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Range) {
						{
						setState(373);
						match(Range);
						}
					}

					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dereference) | (1L << StartArrayDereference) | (1L << LeftParen) | (1L << AdditiveOperator) | (1L << Zero) | (1L << PositiveInteger))) != 0)) {
						{
						setState(376);
						arithmeticExpression(0);
						}
					}

					setState(379);
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
			setState(384);
			match(BeginSuchThat);
			setState(385);
			source();
			setState(386);
			matcher();
			setState(387);
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
			setState(389);
			matchArithmeticExpression();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InvertMatch) {
				{
				setState(390);
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
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InvertMatch) {
				{
				setState(393);
				match(InvertMatch);
				}
			}

			setState(396);
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
		public MatchIntegerLiteralContext matchIntegerLiteral() {
			return getRuleContext(MatchIntegerLiteralContext.class,0);
		}
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
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MatchInteger:
			case MatchAdditiveOperator:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				matchIntegerLiteral();
				}
				break;
			case MatchDereference:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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

	public static class MatchIntegerLiteralContext extends ParserRuleContext {
		public TerminalNode MatchInteger() { return getToken(TailspinParser.MatchInteger, 0); }
		public TerminalNode MatchAdditiveOperator() { return getToken(TailspinParser.MatchAdditiveOperator, 0); }
		public MatchIntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchIntegerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMatchIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchIntegerLiteralContext matchIntegerLiteral() throws RecognitionException {
		MatchIntegerLiteralContext _localctx = new MatchIntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_matchIntegerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchAdditiveOperator) {
				{
				setState(402);
				match(MatchAdditiveOperator);
				}
			}

			setState(405);
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
		enterRule(_localctx, 62, RULE_matchDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(MatchDereference);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(408);
				match(MatchArrayDereference);
				setState(409);
				arrayDereference();
				setState(410);
				match(RightParen);
				}
			}

			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MatchFieldDereference) {
				{
				{
				setState(414);
				matchStructureDereference();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchMessage) {
				{
				setState(420);
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
		enterRule(_localctx, 64, RULE_matchStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(423);
					match(MatchFieldDereference);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(426); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MatchArrayDereference) {
				{
				setState(428);
				match(MatchArrayDereference);
				setState(429);
				arrayDereference();
				setState(430);
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
		enterRule(_localctx, 66, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			arithmeticExpression(0);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(435);
				match(Invert);
				}
			}

			setState(438);
			match(Range);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(439);
				match(Invert);
				}
			}

			setState(442);
			arithmeticExpression(0);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(443);
				match(Colon);
				setState(444);
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
		enterRule(_localctx, 68, RULE_integerLiteral);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Zero);
				}
				break;
			case AdditiveOperator:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
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
		enterRule(_localctx, 70, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AdditiveOperator) {
				{
				setState(451);
				match(AdditiveOperator);
				}
			}

			setState(454);
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
		enterRule(_localctx, 72, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==START_STRING || _la==START_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartStringEvaluate) | (1L << StartStringInterpolate) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(457);
				stringContent();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
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
		enterRule(_localctx, 74, RULE_stringContent);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
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
		enterRule(_localctx, 76, RULE_stringInterpolate);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				interpolateEvaluate();
				}
				break;
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
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
		enterRule(_localctx, 78, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(StartStringEvaluate);
			setState(474);
			valueChain();
			setState(475);
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
		enterRule(_localctx, 80, RULE_interpolateDereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(StartStringInterpolate);
			setState(478);
			match(InterpolateIdentifier);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(479);
				match(InterpolateArray);
				setState(480);
				arrayDereference();
				setState(481);
				match(RightParen);
				}
			}

			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==InterpolateField) {
				{
				{
				setState(485);
				interpolateStructureDereference();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
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
		enterRule(_localctx, 82, RULE_interpolateStructureDereference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(493);
					match(InterpolateField);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(496); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==InterpolateArray) {
				{
				setState(498);
				match(InterpolateArray);
				setState(499);
				arrayDereference();
				setState(500);
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
		enterRule(_localctx, 84, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(507);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(508);
				match(LeftParen);
				setState(509);
				arithmeticExpression(0);
				setState(510);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AdditiveOperator) {
					{
					setState(512);
					match(AdditiveOperator);
					}
				}

				setState(515);
				dereferenceValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(518);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(519);
						match(MultiplicativeOperator);
						setState(520);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(521);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(522);
						match(AdditiveOperator);
						setState(523);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 88, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			compositionSequence();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SequenceKey) {
				{
				{
				setState(530);
				definedCompositionSequence();
				}
				}
				setState(535);
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
		enterRule(_localctx, 90, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(SequenceKey);
			setState(537);
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
		enterRule(_localctx, 92, RULE_compositionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(539);
				compositionMatcher();
				}
				}
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (StartComposerMatch - 71)) | (1L << (StartSkipRule - 71)) | (1L << (StartBuildArray - 71)))) != 0) );
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
		enterRule(_localctx, 94, RULE_compositionMatcher);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(StartComposerMatch);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(545);
					match(InvertComposerMatch);
					}
				}

				setState(548);
				match(ComposerId);
				setState(549);
				match(EndComposerMatch);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier) {
					{
					setState(550);
					match(Multiplier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(StartComposerMatch);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==InvertComposerMatch) {
					{
					setState(554);
					match(InvertComposerMatch);
					}
				}

				setState(557);
				match(START_REGEX);
				setState(558);
				match(REGEX_TEXT);
				setState(559);
				match(END_REGEX);
				setState(560);
				match(EndComposerMatch);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Multiplier) {
					{
					setState(561);
					match(Multiplier);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
				match(StartSkipRule);
				setState(565);
				compositionSequence();
				setState(566);
				match(EndSkipRule);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(StartBuildArray);
				setState(569);
				compositionSequence();
				setState(570);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0241\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\7\2e\n\2\f\2\16\2h"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096"+
		"\13\5\3\5\5\5\u0099\n\5\3\5\3\5\3\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13"+
		"\5\3\5\5\5\u00a5\n\5\5\5\u00a7\n\5\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\3\7\7\7\u00b9\n\7\f\7\16"+
		"\7\u00bc\13\7\3\b\3\b\3\b\3\b\5\b\u00c2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\5\n\u00d5"+
		"\n\n\3\13\3\13\3\13\5\13\u00da\n\13\7\13\u00dc\n\13\f\13\16\13\u00df\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00f3\n\r\3\16\3\16\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16"+
		"\3\16\6\16\u00fd\n\16\r\16\16\16\u00fe\5\16\u0101\n\16\3\17\3\17\3\17"+
		"\3\20\6\20\u0107\n\20\r\20\16\20\u0108\3\21\3\21\3\21\3\21\5\21\u010f"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\5\25\u011e\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u012d\n\26\3\27\3\27\3\27\5\27\u0132\n\27\3\27\3\27\5"+
		"\27\u0136\n\27\3\27\3\27\3\27\3\27\5\27\u013c\n\27\5\27\u013e\n\27\3\30"+
		"\3\30\3\30\3\30\5\30\u0144\n\30\3\31\3\31\3\31\3\31\7\31\u014a\n\31\f"+
		"\31\16\31\u014d\13\31\3\31\3\31\3\32\5\32\u0152\n\32\3\32\7\32\u0155\n"+
		"\32\f\32\16\32\u0158\13\32\3\33\3\33\3\33\5\33\u015d\n\33\3\33\3\33\5"+
		"\33\u0161\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u0168\n\33\7\33\u016a\n\33"+
		"\f\33\16\33\u016d\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0176"+
		"\n\33\3\33\5\33\u0179\n\33\3\33\5\33\u017c\n\33\3\33\5\33\u017f\n\33\5"+
		"\33\u0181\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u018a\n\35\3\36"+
		"\5\36\u018d\n\36\3\36\3\36\3\37\3\37\5\37\u0193\n\37\3 \5 \u0196\n \3"+
		" \3 \3!\3!\3!\3!\3!\5!\u019f\n!\3!\7!\u01a2\n!\f!\16!\u01a5\13!\3!\5!"+
		"\u01a8\n!\3\"\6\"\u01ab\n\"\r\"\16\"\u01ac\3\"\3\"\3\"\3\"\5\"\u01b3\n"+
		"\"\3#\3#\5#\u01b7\n#\3#\3#\5#\u01bb\n#\3#\3#\3#\5#\u01c0\n#\3$\3$\5$\u01c4"+
		"\n$\3%\5%\u01c7\n%\3%\3%\3&\3&\7&\u01cd\n&\f&\16&\u01d0\13&\3&\3&\3\'"+
		"\3\'\5\'\u01d6\n\'\3(\3(\5(\u01da\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*"+
		"\u01e6\n*\3*\7*\u01e9\n*\f*\16*\u01ec\13*\3*\3*\3+\6+\u01f1\n+\r+\16+"+
		"\u01f2\3+\3+\3+\3+\5+\u01f9\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-\u0204\n-"+
		"\3-\5-\u0207\n-\3-\3-\3-\3-\3-\3-\7-\u020f\n-\f-\16-\u0212\13-\3.\3.\7"+
		".\u0216\n.\f.\16.\u0219\13.\3/\3/\3/\3\60\6\60\u021f\n\60\r\60\16\60\u0220"+
		"\3\61\3\61\5\61\u0225\n\61\3\61\3\61\3\61\5\61\u022a\n\61\3\61\3\61\5"+
		"\61\u022e\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0235\n\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u023f\n\61\3\61\2\3X\62\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2"+
		"\5\4\2\34\34\65\65\4\2((<<\4\2\4\4\6\6\2\u0275\2b\3\2\2\2\4\u0084\3\2"+
		"\2\2\6\u008e\3\2\2\2\b\u00a6\3\2\2\2\n\u00ab\3\2\2\2\f\u00b5\3\2\2\2\16"+
		"\u00c1\3\2\2\2\20\u00d0\3\2\2\2\22\u00d4\3\2\2\2\24\u00d6\3\2\2\2\26\u00e2"+
		"\3\2\2\2\30\u00f2\3\2\2\2\32\u0100\3\2\2\2\34\u0102\3\2\2\2\36\u0106\3"+
		"\2\2\2 \u010e\3\2\2\2\"\u0110\3\2\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u0119"+
		"\3\2\2\2*\u012c\3\2\2\2,\u013d\3\2\2\2.\u0143\3\2\2\2\60\u0145\3\2\2\2"+
		"\62\u0151\3\2\2\2\64\u0180\3\2\2\2\66\u0182\3\2\2\28\u0187\3\2\2\2:\u018c"+
		"\3\2\2\2<\u0192\3\2\2\2>\u0195\3\2\2\2@\u0199\3\2\2\2B\u01aa\3\2\2\2D"+
		"\u01b4\3\2\2\2F\u01c3\3\2\2\2H\u01c6\3\2\2\2J\u01ca\3\2\2\2L\u01d5\3\2"+
		"\2\2N\u01d9\3\2\2\2P\u01db\3\2\2\2R\u01df\3\2\2\2T\u01f0\3\2\2\2V\u01fa"+
		"\3\2\2\2X\u0206\3\2\2\2Z\u0213\3\2\2\2\\\u021a\3\2\2\2^\u021e\3\2\2\2"+
		"`\u023e\3\2\2\2bf\5\4\3\2ce\5\4\3\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\2\2\3j\3\3\2\2\2kl\7\7\2\2lm\7\33\2\2m"+
		"\u0085\5*\26\2no\5*\26\2op\7\f\2\2pq\5V,\2q\u0085\3\2\2\2rs\7\35\2\2s"+
		"t\7)\2\2tu\5\32\16\2uv\7 \2\2vw\7)\2\2w\u0085\3\2\2\2xy\7\37\2\2yz\7)"+
		"\2\2z{\5\36\20\2{|\7 \2\2|}\7)\2\2}\u0085\3\2\2\2~\177\7\36\2\2\177\u0080"+
		"\7S\2\2\u0080\u0081\5Z.\2\u0081\u0082\7H\2\2\u0082\u0083\7)\2\2\u0083"+
		"\u0085\3\2\2\2\u0084k\3\2\2\2\u0084n\3\2\2\2\u0084r\3\2\2\2\u0084x\3\2"+
		"\2\2\u0084~\3\2\2\2\u0085\5\3\2\2\2\u0086\u008f\7\5\2\2\u0087\u008f\5"+
		"\b\5\2\u0088\u008f\5J&\2\u0089\u008f\5X-\2\u008a\u008f\5D#\2\u008b\u008f"+
		"\5\20\t\2\u008c\u008f\5\24\13\2\u008d\u008f\5\26\f\2\u008e\u0086\3\2\2"+
		"\2\u008e\u0087\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a"+
		"\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\7\3\2\2\2\u0090\u0094\7\b\2\2\u0091\u0093\5\n\6\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u00a7\3\2\2\2\u009a\u009b\7\t\2\2\u009b\u009c"+
		"\5\f\7\2\u009c\u00a0\7\26\2\2\u009d\u009f\5\n\6\2\u009e\u009d\3\2\2\2"+
		"\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0090\3\2\2\2\u00a6\u009a"+
		"\3\2\2\2\u00a7\t\3\2\2\2\u00a8\u00aa\7\n\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b4\7\n\2\2\u00af\u00b0\7\13\2\2\u00b0"+
		"\u00b1\5\f\7\2\u00b1\u00b2\7\26\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3"+
		"\2\2\2\u00b3\u00af\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00ba\5\16\b\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b9\5\16\b\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\r\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c2\5H%\2\u00be\u00c2\5D#\2\u00bf\u00c2\5\20\t\2\u00c0"+
		"\u00c2\5\b\5\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00d1"+
		"\7\30\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00cb\5\22\n\2\u00c7\u00c8\7\22\2"+
		"\2\u00c8\u00ca\5\22\n\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c3\3\2\2\2\u00d0"+
		"\u00c5\3\2\2\2\u00d1\21\3\2\2\2\u00d2\u00d5\5&\24\2\u00d3\u00d5\5*\26"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\23\3\2\2\2\u00d6\u00dd"+
		"\7\31\2\2\u00d7\u00d9\5\26\f\2\u00d8\u00da\7\22\2\2\u00d9\u00d8\3\2\2"+
		"\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7\32\2\2\u00e1\25\3\2\2\2\u00e2\u00e3\7\33"+
		"\2\2\u00e3\u00e4\5\22\n\2\u00e4\27\3\2\2\2\u00e5\u00f3\5\6\4\2\u00e6\u00e7"+
		"\7\25\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7\26\2\2\u00e9\u00f3\3\2\2"+
		"\2\u00ea\u00f3\7)\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ed\7)\2\2\u00ed\u00ee"+
		"\7\30\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7\26"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e5\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f8\5\36\20"+
		"\2\u00f5\u00f7\5\34\17\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0101\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\5\34\17\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00f4\3\2"+
		"\2\2\u0100\u00fc\3\2\2\2\u0101\33\3\2\2\2\u0102\u0103\5\60\31\2\u0103"+
		"\u0104\5\36\20\2\u0104\35\3\2\2\2\u0105\u0107\5 \21\2\u0106\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\37\3\2\2\2\u010a\u010f\5$\23\2\u010b\u010f\5(\25\2\u010c\u010f\5&\24"+
		"\2\u010d\u010f\5\"\22\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f!\3\2\2\2\u0110\u0111\5*\26\2"+
		"\u0111\u0112\7\r\2\2\u0112#\3\2\2\2\u0113\u0114\5\4\3\2\u0114%\3\2\2\2"+
		"\u0115\u0116\5*\26\2\u0116\u0117\7\f\2\2\u0117\u0118\7!\2\2\u0118\'\3"+
		"\2\2\2\u0119\u011a\5*\26\2\u011a\u011b\7\f\2\2\u011b\u011d\7\16\2\2\u011c"+
		"\u011e\7)\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e)\3\2\2\2\u011f"+
		"\u012d\5\6\4\2\u0120\u0121\7\25\2\2\u0121\u0122\5\6\4\2\u0122\u0123\7"+
		"\26\2\2\u0123\u012d\3\2\2\2\u0124\u0125\5\6\4\2\u0125\u0126\5,\27\2\u0126"+
		"\u012d\3\2\2\2\u0127\u0128\7\25\2\2\u0128\u0129\5\6\4\2\u0129\u012a\7"+
		"\26\2\2\u012a\u012b\5,\27\2\u012b\u012d\3\2\2\2\u012c\u011f\3\2\2\2\u012c"+
		"\u0120\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0127\3\2\2\2\u012d+\3\2\2\2"+
		"\u012e\u012f\7\f\2\2\u012f\u0131\5\30\r\2\u0130\u0132\5,\27\2\u0131\u0130"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u013e\3\2\2\2\u0133\u0135\7\23\2\2"+
		"\u0134\u0136\5,\27\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013e"+
		"\3\2\2\2\u0137\u0138\7\f\2\2\u0138\u0139\7\23\2\2\u0139\u013b\5.\30\2"+
		"\u013a\u013c\5,\27\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e"+
		"\3\2\2\2\u013d\u012e\3\2\2\2\u013d\u0133\3\2\2\2\u013d\u0137\3\2\2\2\u013e"+
		"-\3\2\2\2\u013f\u0144\5\b\5\2\u0140\u0141\7(\2\2\u0141\u0144\7.\2\2\u0142"+
		"\u0144\5\24\13\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0142\3"+
		"\2\2\2\u0144/\3\2\2\2\u0145\u0146\t\2\2\2\u0146\u014b\5\62\32\2\u0147"+
		"\u0148\7\63\2\2\u0148\u014a\5\62\32\2\u0149\u0147\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\66\2\2\u014f\61\3\2\2\2\u0150\u0152\5\64"+
		"\33\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153"+
		"\u0155\5\66\34\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\63\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u0181\5@!\2\u015a\u0181\5<\37\2\u015b\u015d\58\35\2\u015c\u015b\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\7;\2\2\u015f\u0161"+
		"\5:\36\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0181\3\2\2\2\u0162"+
		"\u0181\5J&\2\u0163\u016b\7=\2\2\u0164\u0165\7A\2\2\u0165\u0167\5\60\31"+
		"\2\u0166\u0168\7\64\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0181\7>\2\2\u016f\u0170\7\67\2\2\u0170\u0181\5\62\32\2\u0171\u0172\7"+
		"?\2\2\u0172\u017e\7@\2\2\u0173\u0175\7D\2\2\u0174\u0176\5X-\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0179\7#\2\2\u0178"+
		"\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\5X"+
		"-\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\7\26\2\2\u017e\u0173\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3"+
		"\2\2\2\u0180\u0159\3\2\2\2\u0180\u015a\3\2\2\2\u0180\u015c\3\2\2\2\u0180"+
		"\u0162\3\2\2\2\u0180\u0163\3\2\2\2\u0180\u016f\3\2\2\2\u0180\u0171\3\2"+
		"\2\2\u0181\65\3\2\2\2\u0182\u0183\78\2\2\u0183\u0184\5\6\4\2\u0184\u0185"+
		"\5\60\31\2\u0185\u0186\7\26\2\2\u0186\67\3\2\2\2\u0187\u0189\5<\37\2\u0188"+
		"\u018a\7\67\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a9\3\2\2\2"+
		"\u018b\u018d\7\67\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018f\5<\37\2\u018f;\3\2\2\2\u0190\u0193\5> \2\u0191\u0193"+
		"\5@!\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193=\3\2\2\2\u0194\u0196"+
		"\7:\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\79\2\2\u0198?\3\2\2\2\u0199\u019e\7C\2\2\u019a\u019b\7D\2\2\u019b"+
		"\u019c\5\f\7\2\u019c\u019d\7\26\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3"+
		"\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\5B\"\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7B\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8A\3\2\2\2\u01a9\u01ab\7E\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01b2\3\2\2\2\u01ae\u01af\7D\2\2\u01af\u01b0\5\f\7\2\u01b0"+
		"\u01b1\7\26\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3C\3\2\2\2\u01b4\u01b6\5X-\2\u01b5\u01b7\7\24\2\2\u01b6\u01b5"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7#\2\2\u01b9"+
		"\u01bb\7\24\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\u01bf\5X-\2\u01bd\u01be\7\20\2\2\u01be\u01c0\5X-\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0E\3\2\2\2\u01c1\u01c4\7&\2\2\u01c2"+
		"\u01c4\5H%\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4G\3\2\2\2\u01c5"+
		"\u01c7\7$\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\7\'\2\2\u01c9I\3\2\2\2\u01ca\u01ce\t\3\2\2\u01cb\u01cd"+
		"\5L\'\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7."+
		"\2\2\u01d2K\3\2\2\2\u01d3\u01d6\5N(\2\u01d4\u01d6\7-\2\2\u01d5\u01d3\3"+
		"\2\2\2\u01d5\u01d4\3\2\2\2\u01d6M\3\2\2\2\u01d7\u01da\5P)\2\u01d8\u01da"+
		"\5R*\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01daO\3\2\2\2\u01db\u01dc"+
		"\7+\2\2\u01dc\u01dd\5*\26\2\u01dd\u01de\7\26\2\2\u01deQ\3\2\2\2\u01df"+
		"\u01e0\7,\2\2\u01e0\u01e5\7\61\2\2\u01e1\u01e2\7\60\2\2\u01e2\u01e3\5"+
		"\f\7\2\u01e3\u01e4\7\26\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01ea\3\2\2\2\u01e7\u01e9\5T+\2\u01e8\u01e7\3\2\2"+
		"\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed"+
		"\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7/\2\2\u01eeS\3\2\2\2\u01ef\u01f1"+
		"\7\62\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2"+
		"\u01f2\u01f3\3\2\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f5\7\60\2\2\u01f5\u01f6"+
		"\5\f\7\2\u01f6\u01f7\7\26\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f4\3\2\2\2"+
		"\u01f8\u01f9\3\2\2\2\u01f9U\3\2\2\2\u01fa\u01fb\t\4\2\2\u01fbW\3\2\2\2"+
		"\u01fc\u01fd\b-\1\2\u01fd\u0207\5F$\2\u01fe\u01ff\7\25\2\2\u01ff\u0200"+
		"\5X-\2\u0200\u0201\7\26\2\2\u0201\u0207\3\2\2\2\u0202\u0204\7$\2\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\5\b"+
		"\5\2\u0206\u01fc\3\2\2\2\u0206\u01fe\3\2\2\2\u0206\u0203\3\2\2\2\u0207"+
		"\u0210\3\2\2\2\u0208\u0209\f\4\2\2\u0209\u020a\7%\2\2\u020a\u020f\5X-"+
		"\5\u020b\u020c\f\3\2\2\u020c\u020d\7$\2\2\u020d\u020f\5X-\4\u020e\u0208"+
		"\3\2\2\2\u020e\u020b\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211Y\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0217\5^\60\2"+
		"\u0214\u0216\5\\/\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218[\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021b\7L\2\2\u021b\u021c\5^\60\2\u021c]\3\2\2\2\u021d\u021f\5`\61\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221_\3\2\2\2\u0222\u0224\7I\2\2\u0223\u0225\7K\2\2\u0224\u0223"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7S\2\2\u0227"+
		"\u0229\7J\2\2\u0228\u022a\7M\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2"+
		"\2\u022a\u023f\3\2\2\2\u022b\u022d\7I\2\2\u022c\u022e\7K\2\2\u022d\u022c"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7N\2\2\u0230"+
		"\u0231\7U\2\2\u0231\u0232\7V\2\2\u0232\u0234\7J\2\2\u0233\u0235\7M\2\2"+
		"\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023f\3\2\2\2\u0236\u0237"+
		"\7O\2\2\u0237\u0238\5^\60\2\u0238\u0239\7P\2\2\u0239\u023f\3\2\2\2\u023a"+
		"\u023b\7Q\2\2\u023b\u023c\5^\60\2\u023c\u023d\7R\2\2\u023d\u023f\3\2\2"+
		"\2\u023e\u0222\3\2\2\2\u023e\u022b\3\2\2\2\u023e\u0236\3\2\2\2\u023e\u023a"+
		"\3\2\2\2\u023fa\3\2\2\2Lf\u0084\u008e\u0094\u0098\u00a0\u00a4\u00a6\u00ab"+
		"\u00b3\u00ba\u00c1\u00cb\u00d0\u00d4\u00d9\u00dd\u00f2\u00f8\u00fe\u0100"+
		"\u0108\u010e\u011d\u012c\u0131\u0135\u013b\u013d\u0143\u014b\u0151\u0156"+
		"\u015c\u0160\u0167\u016b\u0175\u0178\u017b\u017e\u0180\u0189\u018c\u0192"+
		"\u0195\u019e\u01a3\u01a7\u01ac\u01b2\u01b6\u01ba\u01bf\u01c3\u01c6\u01ce"+
		"\u01d5\u01d9\u01e5\u01ea\u01f2\u01f8\u0203\u0206\u020e\u0210\u0217\u0220"+
		"\u0224\u0229\u022d\u0234\u023e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}