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
		StartComment=1, Package=2, Import=3, Void=4, Def=5, To=6, ResultMarker=7, 
		SinkReference=8, At=9, NamedAt=10, Colon=11, Key=12, Message=13, FieldReference=14, 
		EndStringInterpolate=15, SemiColon=16, Comma=17, Deconstructor=18, Merge=19, 
		DeleteState=20, Invert=21, LeftParen=22, RightParen=23, LeftBracket=24, 
		RightBracket=25, LeftBrace=26, RightBrace=27, StartMatcher=28, StartTemplatesDefinition=29, 
		StartComposerDefinition=30, StartProcessorDefinition=31, EndDefinition=32, 
		TemplateMatch=33, Dereference=34, Range=35, Plus=36, Minus=37, Star=38, 
		Slash=39, Mod=40, Question=41, Equal=42, Zero=43, PositiveInteger=44, 
		START_STRING=45, IDENTIFIER=46, WS=47, Else=48, EndMatcher=49, BeginSuchThat=50, 
		Comment=51, REGEX_TEXT=52, END_REGEX=53, StartStringEvaluate=54, StartCharacterCode=55, 
		STRING_TEXT=56, END_STRING=57;
	public static final int
		RULE_program = 0, RULE_packageDefinition = 1, RULE_dependency = 2, RULE_statement = 3, 
		RULE_parameterDefinitions = 4, RULE_source = 5, RULE_dereferenceValue = 6, 
		RULE_reference = 7, RULE_structureReference = 8, RULE_arrayReference = 9, 
		RULE_dimensionReference = 10, RULE_message = 11, RULE_arrayLiteral = 12, 
		RULE_valueProduction = 13, RULE_structureLiteral = 14, RULE_keyValues = 15, 
		RULE_keyValue = 16, RULE_templates = 17, RULE_sink = 18, RULE_transformCall = 19, 
		RULE_parameterValues = 20, RULE_parameterValue = 21, RULE_templatesBody = 22, 
		RULE_matchTemplate = 23, RULE_block = 24, RULE_blockExpression = 25, RULE_resultValue = 26, 
		RULE_blockStatement = 27, RULE_sendToTemplates = 28, RULE_stateAssignment = 29, 
		RULE_valueChain = 30, RULE_transform = 31, RULE_matcher = 32, RULE_condition = 33, 
		RULE_typeMatch = 34, RULE_rangeBounds = 35, RULE_suchThat = 36, RULE_lowerBound = 37, 
		RULE_upperBound = 38, RULE_rangeLiteral = 39, RULE_integerLiteral = 40, 
		RULE_nonZeroInteger = 41, RULE_stringLiteral = 42, RULE_stringContent = 43, 
		RULE_stringInterpolate = 44, RULE_characterCode = 45, RULE_interpolateEvaluate = 46, 
		RULE_arithmeticExpression = 47, RULE_additiveOperator = 48, RULE_multiplicativeOperator = 49, 
		RULE_composerBody = 50, RULE_definedCompositionSequence = 51, RULE_compositionSequence = 52, 
		RULE_compositionMatcher = 53, RULE_structureMemberMatchers = 54, RULE_structureMemberMatcher = 55, 
		RULE_tokenMatcher = 56, RULE_compositionToken = 57, RULE_multiplier = 58, 
		RULE_compositionSkipRule = 59, RULE_compositionCapture = 60, RULE_compositionKeyValue = 61, 
		RULE_compositionKey = 62, RULE_compositionComponent = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "packageDefinition", "dependency", "statement", "parameterDefinitions", 
			"source", "dereferenceValue", "reference", "structureReference", "arrayReference", 
			"dimensionReference", "message", "arrayLiteral", "valueProduction", "structureLiteral", 
			"keyValues", "keyValue", "templates", "sink", "transformCall", "parameterValues", 
			"parameterValue", "templatesBody", "matchTemplate", "block", "blockExpression", 
			"resultValue", "blockStatement", "sendToTemplates", "stateAssignment", 
			"valueChain", "transform", "matcher", "condition", "typeMatch", "rangeBounds", 
			"suchThat", "lowerBound", "upperBound", "rangeLiteral", "integerLiteral", 
			"nonZeroInteger", "stringLiteral", "stringContent", "stringInterpolate", 
			"characterCode", "interpolateEvaluate", "arithmeticExpression", "additiveOperator", 
			"multiplicativeOperator", "composerBody", "definedCompositionSequence", 
			"compositionSequence", "compositionMatcher", "structureMemberMatchers", 
			"structureMemberMatcher", "tokenMatcher", "compositionToken", "multiplier", 
			"compositionSkipRule", "compositionCapture", "compositionKeyValue", "compositionKey", 
			"compositionComponent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'package'", "'import'", "'void'", null, "'->'", "'!'", 
			null, "'@'", null, "':'", null, null, null, null, "';'", "','", "'...'", 
			"'..|'", null, "'~'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", 
			"'templates'", "'composer'", "'processor'", "'end'", "'#'", null, "'..'", 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'?'", "'='", "'0'", null, null, 
			null, null, "'|'", "'>'", "'?('", null, null, null, "'$('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Package", "Import", "Void", "Def", "To", "ResultMarker", 
			"SinkReference", "At", "NamedAt", "Colon", "Key", "Message", "FieldReference", 
			"EndStringInterpolate", "SemiColon", "Comma", "Deconstructor", "Merge", 
			"DeleteState", "Invert", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "StartMatcher", "StartTemplatesDefinition", 
			"StartComposerDefinition", "StartProcessorDefinition", "EndDefinition", 
			"TemplateMatch", "Dereference", "Range", "Plus", "Minus", "Star", "Slash", 
			"Mod", "Question", "Equal", "Zero", "PositiveInteger", "START_STRING", 
			"IDENTIFIER", "WS", "Else", "EndMatcher", "BeginSuchThat", "Comment", 
			"REGEX_TEXT", "END_REGEX", "StartStringEvaluate", "StartCharacterCode", 
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
		public PackageDefinitionContext packageDefinition() {
			return getRuleContext(PackageDefinitionContext.class,0);
		}
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Package) {
				{
				setState(128);
				packageDefinition();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(131);
				dependency();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			statement();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << Key) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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

	public static class PackageDefinitionContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(TailspinParser.Package, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public PackageDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitPackageDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDefinitionContext packageDefinition() throws RecognitionException {
		PackageDefinitionContext _localctx = new PackageDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Package);
			setState(147);
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

	public static class DependencyContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(TailspinParser.Import, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dependency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Import);
			setState(150);
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
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(Def);
				setState(153);
				match(Key);
				setState(154);
				valueProduction();
				setState(155);
				match(SemiColon);
				}
				break;
			case Key:
			case DeleteState:
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
				setState(157);
				valueChain();
				setState(158);
				match(To);
				setState(159);
				sink();
				}
				break;
			case StartTemplatesDefinition:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(StartTemplatesDefinition);
				setState(162);
				match(IDENTIFIER);
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(163);
					parameterDefinitions();
					}
					break;
				}
				setState(166);
				templatesBody();
				setState(167);
				match(EndDefinition);
				setState(168);
				match(IDENTIFIER);
				}
				break;
			case StartProcessorDefinition:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(StartProcessorDefinition);
				setState(171);
				match(IDENTIFIER);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(172);
					parameterDefinitions();
					}
					break;
				}
				setState(175);
				block();
				setState(176);
				match(EndDefinition);
				setState(177);
				match(IDENTIFIER);
				}
				break;
			case StartComposerDefinition:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(StartComposerDefinition);
				setState(180);
				match(IDENTIFIER);
				setState(181);
				composerBody();
				setState(182);
				match(EndDefinition);
				setState(183);
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
		enterRule(_localctx, 8, RULE_parameterDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(At);
			setState(188);
			match(LeftBrace);
			setState(193); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(Key);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(190);
					match(Comma);
					}
				}

				}
				}
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Key );
			setState(197);
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
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
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
		enterRule(_localctx, 10, RULE_source);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				dereferenceValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				structureLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(LeftParen);
				setState(205);
				keyValue();
				setState(206);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Dereference() { return getToken(TailspinParser.Dereference, 0); }
		public TerminalNode DeleteState() { return getToken(TailspinParser.DeleteState, 0); }
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
		enterRule(_localctx, 12, RULE_dereferenceValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==DeleteState || _la==Dereference) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(212);
			reference();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(213);
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
		enterRule(_localctx, 14, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(216);
				match(LeftParen);
				setState(217);
				arrayReference();
				setState(218);
				match(RightParen);
				}
				break;
			}
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					structureReference();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 16, RULE_structureReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(FieldReference);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(229);
				match(LeftParen);
				setState(230);
				arrayReference();
				setState(231);
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
		enterRule(_localctx, 18, RULE_arrayReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			dimensionReference();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(236);
				match(SemiColon);
				setState(237);
				dimensionReference();
				}
				}
				setState(242);
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
		enterRule(_localctx, 20, RULE_dimensionReference);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				dereferenceValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
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
		enterRule(_localctx, 22, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(Message);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
				match(At);
				setState(251);
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
		enterRule(_localctx, 24, RULE_arrayLiteral);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(LeftBracket);
				setState(255);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(LeftBracket);
				setState(257);
				valueProduction();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(258);
					match(Comma);
					setState(259);
					valueProduction();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
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
		enterRule(_localctx, 26, RULE_valueProduction);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
		enterRule(_localctx, 28, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LeftBrace);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Key) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(274);
				keyValues();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(275);
					match(Comma);
					setState(276);
					keyValues();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(284);
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
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_keyValues);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
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
		enterRule(_localctx, 32, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Key);
			setState(292);
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
		enterRule(_localctx, 34, RULE_templates);
		int _la;
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				source();
				}
				break;
			case 2:
				_localctx = new InlineTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(LeftParen);
				setState(296);
				templatesBody();
				setState(297);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				transformCall();
				}
				break;
			case 4:
				_localctx = new ArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(LeftBracket);
				setState(301);
				match(IDENTIFIER);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(302);
					match(Comma);
					setState(303);
					match(IDENTIFIER);
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
				match(RightBracket);
				setState(310);
				match(LeftParen);
				setState(311);
				templatesBody();
				setState(312);
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

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode SinkReference() { return getToken(TailspinParser.SinkReference, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_sink);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SinkReference:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(316);
				match(SinkReference);
				setState(317);
				reference();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(318);
					message();
					}
				}

				}
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(Void);
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
		enterRule(_localctx, 38, RULE_transformCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IDENTIFIER);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==At) {
				{
				setState(325);
				match(At);
				setState(326);
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
		enterRule(_localctx, 40, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(LeftBrace);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330);
				parameterValue();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(331);
					match(Comma);
					}
				}

				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Key );
			setState(338);
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
		enterRule(_localctx, 42, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(Key);
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Key:
			case DeleteState:
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
				setState(341);
				valueChain();
				}
				break;
			case IDENTIFIER:
				{
				setState(342);
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
		enterRule(_localctx, 44, RULE_templatesBody);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
			case Def:
			case At:
			case NamedAt:
			case Key:
			case Merge:
			case DeleteState:
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
				setState(345);
				block();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StartMatcher) {
					{
					{
					setState(346);
					matchTemplate();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case StartMatcher:
				enterOuterAlt(_localctx, 2);
				{
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352);
					matchTemplate();
					}
					}
					setState(355); 
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
		enterRule(_localctx, 46, RULE_matchTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			matcher();
			setState(360);
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
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Def:
			case At:
			case NamedAt:
			case Key:
			case Merge:
			case DeleteState:
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
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(362);
					blockExpression();
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << At) | (1L << NamedAt) | (1L << Key) | (1L << Merge) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartTemplatesDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0) );
				}
				break;
			case Void:
				{
				setState(367);
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
		enterRule(_localctx, 50, RULE_blockExpression);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
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
		enterRule(_localctx, 52, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			valueChain();
			setState(377);
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
		enterRule(_localctx, 54, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		enterRule(_localctx, 56, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			valueChain();
			setState(382);
			match(To);
			setState(383);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TerminalNode At() { return getToken(TailspinParser.At, 0); }
		public TerminalNode NamedAt() { return getToken(TailspinParser.NamedAt, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode Merge() { return getToken(TailspinParser.Merge, 0); }
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
		enterRule(_localctx, 58, RULE_stateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Key) | (1L << DeleteState) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(385);
				valueChain();
				setState(386);
				match(To);
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Merge) {
				{
				setState(390);
				match(Merge);
				}
			}

			setState(393);
			_la = _input.LA(1);
			if ( !(_la==At || _la==NamedAt) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(394);
			reference();
			setState(395);
			match(Colon);
			setState(396);
			valueProduction();
			setState(397);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_valueChain);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				source();
				setState(401);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
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
		enterRule(_localctx, 62, RULE_transform);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(To);
				setState(407);
				templates();
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(408);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(Deconstructor);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(412);
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
		enterRule(_localctx, 64, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(StartMatcher);
			setState(418);
			condition();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(419);
				match(Else);
				setState(420);
				condition();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
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
		enterRule(_localctx, 66, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DeleteState) | (1L << Invert) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Dereference) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(428);
				typeMatch();
				}
			}

			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					suchThat();
					}
					} 
				}
				setState(436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public RangeBoundsContext rangeBounds() {
			return getRuleContext(RangeBoundsContext.class,0);
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
		public RangeBoundsContext rangeBounds() {
			return getRuleContext(RangeBoundsContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_typeMatch);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new ObjectEqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				dereferenceValue();
				}
				break;
			case 2:
				_localctx = new IntegerEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				arithmeticExpression(0);
				}
				break;
			case 3:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				rangeBounds();
				}
				break;
			case 4:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				match(LeftBrace);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Key) {
					{
					{
					setState(442);
					match(Key);
					setState(443);
					matcher();
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(444);
						match(Comma);
						}
					}

					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
				match(RightBrace);
				}
				break;
			case 6:
				_localctx = new InvertMatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(Invert);
				setState(454);
				condition();
				}
				break;
			case 7:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				match(LeftBracket);
				setState(456);
				match(RightBracket);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(457);
					match(LeftParen);
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(458);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(459);
						arithmeticExpression(0);
						}
						break;
					}
					setState(462);
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

	public static class RangeBoundsContext extends ParserRuleContext {
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeBounds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRangeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeBoundsContext rangeBounds() throws RecognitionException {
		RangeBoundsContext _localctx = new RangeBoundsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DeleteState) | (1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(468);
				lowerBound();
				}
			}

			setState(471);
			match(Range);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DeleteState) | (1L << Invert) | (1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(472);
				upperBound();
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
		enterRule(_localctx, 72, RULE_suchThat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(BeginSuchThat);
			setState(476);
			valueChain();
			setState(477);
			matcher();
			setState(478);
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
		enterRule(_localctx, 74, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(480);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(481);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(482);
				stringLiteral();
				}
				break;
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(485);
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
		enterRule(_localctx, 76, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(488);
				match(Invert);
				}
			}

			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(491);
				dereferenceValue();
				}
				break;
			case 2:
				{
				setState(492);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(493);
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
		enterRule(_localctx, 78, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DeleteState) | (1L << LeftParen) | (1L << Dereference) | (1L << Plus) | (1L << Minus) | (1L << Zero) | (1L << PositiveInteger) | (1L << START_STRING))) != 0)) {
				{
				setState(496);
				lowerBound();
				}
			}

			setState(499);
			match(Range);
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(500);
				upperBound();
				}
				break;
			}
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(503);
				match(Colon);
				setState(504);
				arithmeticExpression(0);
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
		enterRule(_localctx, 80, RULE_integerLiteral);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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
		enterRule(_localctx, 82, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(511);
				additiveOperator();
				}
			}

			setState(514);
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
		enterRule(_localctx, 84, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(START_STRING);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DeleteState) | (1L << Dereference) | (1L << StartStringEvaluate) | (1L << StartCharacterCode) | (1L << STRING_TEXT))) != 0)) {
				{
				{
				setState(517);
				stringContent();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
		enterRule(_localctx, 86, RULE_stringContent);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DeleteState:
			case Dereference:
			case StartStringEvaluate:
			case StartCharacterCode:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
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
		public CharacterCodeContext characterCode() {
			return getRuleContext(CharacterCodeContext.class,0);
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
		enterRule(_localctx, 88, RULE_stringInterpolate);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringEvaluate:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				interpolateEvaluate();
				}
				break;
			case DeleteState:
			case Dereference:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(530);
				dereferenceValue();
				setState(531);
				match(EndStringInterpolate);
				}
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				characterCode();
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

	public static class CharacterCodeContext extends ParserRuleContext {
		public TerminalNode StartCharacterCode() { return getToken(TailspinParser.StartCharacterCode, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode EndStringInterpolate() { return getToken(TailspinParser.EndStringInterpolate, 0); }
		public CharacterCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCharacterCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterCodeContext characterCode() throws RecognitionException {
		CharacterCodeContext _localctx = new CharacterCodeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(StartCharacterCode);
			setState(537);
			arithmeticExpression(0);
			setState(538);
			match(EndStringInterpolate);
			}
		}
		catch (RecognitionException re) {
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
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
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
		enterRule(_localctx, 92, RULE_interpolateEvaluate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(StartStringEvaluate);
			setState(541);
			valueProduction();
			setState(542);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(545);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(546);
				match(LeftParen);
				setState(547);
				valueProduction();
				setState(548);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(550);
					additiveOperator();
					}
				}

				setState(553);
				dereferenceValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(564);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(556);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(557);
						multiplicativeOperator();
						setState(558);
						arithmeticExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(560);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(561);
						additiveOperator();
						setState(562);
						arithmeticExpression(2);
						}
						break;
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 96, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 98, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		enterRule(_localctx, 100, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			compositionSequence();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Key) {
				{
				{
				setState(574);
				definedCompositionSequence();
				}
				}
				setState(579);
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
		enterRule(_localctx, 102, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Key);
			setState(581);
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
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
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
		enterRule(_localctx, 104, RULE_compositionSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					compositionSkipRule();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(589);
					compositionComponent();
					}
					}
					setState(592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher) | (1L << Dereference))) != 0) );
				}
				break;
			case 2:
				{
				setState(594);
				structureMemberMatchers();
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

	public static class CompositionMatcherContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
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
		enterRule(_localctx, 106, RULE_compositionMatcher);
		int _la;
		try {
			int _alt;
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				tokenMatcher();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(LeftBracket);
				setState(599);
				compositionSequence();
				setState(600);
				match(RightBracket);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(601);
					transform();
					}
				}

				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(LeftBrace);
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						compositionSkipRule();
						}
						} 
					}
					setState(610);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Key) | (1L << LeftParen) | (1L << StartMatcher))) != 0)) {
					{
					setState(611);
					structureMemberMatchers();
					}
				}

				setState(614);
				match(RightBrace);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(615);
					transform();
					}
				}

				}
				break;
			case Dereference:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(Dereference);
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

	public static class StructureMemberMatchersContext extends ParserRuleContext {
		public List<StructureMemberMatcherContext> structureMemberMatcher() {
			return getRuleContexts(StructureMemberMatcherContext.class);
		}
		public StructureMemberMatcherContext structureMemberMatcher(int i) {
			return getRuleContext(StructureMemberMatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public StructureMemberMatchersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureMemberMatchers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMemberMatchers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureMemberMatchersContext structureMemberMatchers() throws RecognitionException {
		StructureMemberMatchersContext _localctx = new StructureMemberMatchersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			structureMemberMatcher();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(622);
				match(Comma);
				setState(623);
				structureMemberMatcher();
				}
				}
				setState(628);
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

	public static class StructureMemberMatcherContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public CompositionKeyValueContext compositionKeyValue() {
			return getRuleContext(CompositionKeyValueContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public StructureMemberMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureMemberMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureMemberMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureMemberMatcherContext structureMemberMatcher() throws RecognitionException {
		StructureMemberMatcherContext _localctx = new StructureMemberMatcherContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_structureMemberMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(629);
				compositionSkipRule();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(635);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(636);
				compositionKeyValue();
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

	public static class TokenMatcherContext extends ParserRuleContext {
		public TerminalNode StartMatcher() { return getToken(TailspinParser.StartMatcher, 0); }
		public List<CompositionTokenContext> compositionToken() {
			return getRuleContexts(CompositionTokenContext.class);
		}
		public CompositionTokenContext compositionToken(int i) {
			return getRuleContext(CompositionTokenContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TokenMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTokenMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenMatcherContext tokenMatcher() throws RecognitionException {
		TokenMatcherContext _localctx = new TokenMatcherContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(StartMatcher);
			setState(640);
			compositionToken();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(641);
				match(Else);
				setState(642);
				compositionToken();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(EndMatcher);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(649);
				multiplier();
				}
			}

			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To || _la==Deconstructor) {
				{
				setState(652);
				transform();
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

	public static class CompositionTokenContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public CompositionTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionToken; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionTokenContext compositionToken() throws RecognitionException {
		CompositionTokenContext _localctx = new CompositionTokenContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compositionToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(655);
				match(Invert);
				}
			}

			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(658);
				match(IDENTIFIER);
				}
				break;
			case START_STRING:
				{
				setState(659);
				stringLiteral();
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
		enterRule(_localctx, 116, RULE_multiplier);
		int _la;
		try {
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(Equal);
				setState(666);
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
		enterRule(_localctx, 118, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(LeftParen);
			setState(671); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(670);
				compositionCapture();
				}
				}
				setState(673); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Def) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartMatcher) | (1L << Dereference))) != 0) );
			setState(675);
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
		enterRule(_localctx, 120, RULE_compositionCapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Def) {
				{
				setState(677);
				match(Def);
				setState(678);
				match(Key);
				}
			}

			setState(681);
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
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public TerminalNode Key() { return getToken(TailspinParser.Key, 0); }
		public CompositionKeyContext compositionKey() {
			return getRuleContext(CompositionKeyContext.class,0);
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
		enterRule(_localctx, 122, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Key:
				{
				setState(683);
				match(Key);
				}
				break;
			case StartMatcher:
				{
				setState(684);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					compositionSkipRule();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(693);
			compositionComponent();
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(694);
				match(Comma);
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

	public static class CompositionKeyContext extends ParserRuleContext {
		public TokenMatcherContext tokenMatcher() {
			return getRuleContext(TokenMatcherContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public CompositionKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionKey; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionKeyContext compositionKey() throws RecognitionException {
		CompositionKeyContext _localctx = new CompositionKeyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			tokenMatcher();
			setState(698);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
			case LeftBrace:
			case StartMatcher:
			case Dereference:
				{
				setState(700);
				compositionMatcher();
				}
				break;
			case LeftParen:
				{
				setState(701);
				compositionSkipRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					compositionSkipRule();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		case 47:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0084\n\2\3\2\7\2\u0087\n\2\f\2\16\2"+
		"\u008a\13\2\3\2\3\2\7\2\u008e\n\2\f\2\16\2\u0091\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a7"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00bc\n\5\3\6\3\6\3\6\3\6\5\6\u00c2\n\6\6\6\u00c4"+
		"\n\6\r\6\16\6\u00c5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00d4\n\7\3\b\3\b\3\b\5\b\u00d9\n\b\3\t\3\t\3\t\3\t\5\t\u00df\n\t\3"+
		"\t\7\t\u00e2\n\t\f\t\16\t\u00e5\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ec\n\n"+
		"\3\13\3\13\3\13\7\13\u00f1\n\13\f\13\16\13\u00f4\13\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00fa\n\f\3\r\3\r\3\r\5\r\u00ff\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0107\n\16\f\16\16\16\u010a\13\16\3\16\3\16\5\16\u010e\n\16\3\17"+
		"\3\17\5\17\u0112\n\17\3\20\3\20\3\20\3\20\7\20\u0118\n\20\f\20\16\20\u011b"+
		"\13\20\5\20\u011d\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u0124\n\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0133"+
		"\n\23\f\23\16\23\u0136\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u013d\n\23"+
		"\3\24\3\24\3\24\5\24\u0142\n\24\3\24\5\24\u0145\n\24\3\25\3\25\3\25\5"+
		"\25\u014a\n\25\3\26\3\26\3\26\5\26\u014f\n\26\6\26\u0151\n\26\r\26\16"+
		"\26\u0152\3\26\3\26\3\27\3\27\3\27\5\27\u015a\n\27\3\30\3\30\7\30\u015e"+
		"\n\30\f\30\16\30\u0161\13\30\3\30\6\30\u0164\n\30\r\30\16\30\u0165\5\30"+
		"\u0168\n\30\3\31\3\31\3\31\3\32\6\32\u016e\n\32\r\32\16\32\u016f\3\32"+
		"\5\32\u0173\n\32\3\33\3\33\3\33\3\33\5\33\u0179\n\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0187\n\37\3\37\5\37"+
		"\u018a\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0197\n \3"+
		"!\3!\3!\5!\u019c\n!\3!\3!\5!\u01a0\n!\5!\u01a2\n!\3\"\3\"\3\"\3\"\7\""+
		"\u01a8\n\"\f\"\16\"\u01ab\13\"\3\"\3\"\3#\5#\u01b0\n#\3#\7#\u01b3\n#\f"+
		"#\16#\u01b6\13#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c0\n$\7$\u01c2\n$\f$\16"+
		"$\u01c5\13$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01cf\n$\3$\3$\5$\u01d3\n$\5$\u01d5"+
		"\n$\3%\5%\u01d8\n%\3%\3%\5%\u01dc\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u01e6"+
		"\n\'\3\'\5\'\u01e9\n\'\3(\5(\u01ec\n(\3(\3(\3(\5(\u01f1\n(\3)\5)\u01f4"+
		"\n)\3)\3)\5)\u01f8\n)\3)\3)\5)\u01fc\n)\3*\3*\5*\u0200\n*\3+\5+\u0203"+
		"\n+\3+\3+\3,\3,\7,\u0209\n,\f,\16,\u020c\13,\3,\3,\3-\3-\5-\u0212\n-\3"+
		".\3.\3.\3.\3.\5.\u0219\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u022a\n\61\3\61\5\61\u022d\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0237\n\61\f\61\16\61\u023a\13\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u0242\n\64\f\64\16\64\u0245\13\64"+
		"\3\65\3\65\3\65\3\66\7\66\u024b\n\66\f\66\16\66\u024e\13\66\3\66\6\66"+
		"\u0251\n\66\r\66\16\66\u0252\3\66\5\66\u0256\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u025d\n\67\3\67\3\67\7\67\u0261\n\67\f\67\16\67\u0264\13\67"+
		"\3\67\5\67\u0267\n\67\3\67\3\67\5\67\u026b\n\67\3\67\5\67\u026e\n\67\3"+
		"8\38\38\78\u0273\n8\f8\168\u0276\138\39\79\u0279\n9\f9\169\u027c\139\3"+
		"9\39\59\u0280\n9\3:\3:\3:\3:\7:\u0286\n:\f:\16:\u0289\13:\3:\3:\5:\u028d"+
		"\n:\3:\5:\u0290\n:\3;\5;\u0293\n;\3;\3;\5;\u0297\n;\3<\3<\3<\3<\3<\5<"+
		"\u029e\n<\3=\3=\6=\u02a2\n=\r=\16=\u02a3\3=\3=\3>\3>\5>\u02aa\n>\3>\3"+
		">\3?\3?\5?\u02b0\n?\3?\7?\u02b3\n?\f?\16?\u02b6\13?\3?\3?\5?\u02ba\n?"+
		"\3@\3@\3@\3A\3A\5A\u02c1\nA\3A\7A\u02c4\nA\fA\16A\u02c7\13A\3A\2\3`B\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\7\4\2\26\26$$\3\2\13\f\3\2&\'\3\2("+
		"*\4\2$$..\2\u0302\2\u0083\3\2\2\2\4\u0094\3\2\2\2\6\u0097\3\2\2\2\b\u00bb"+
		"\3\2\2\2\n\u00bd\3\2\2\2\f\u00d3\3\2\2\2\16\u00d5\3\2\2\2\20\u00de\3\2"+
		"\2\2\22\u00e6\3\2\2\2\24\u00ed\3\2\2\2\26\u00f9\3\2\2\2\30\u00fb\3\2\2"+
		"\2\32\u010d\3\2\2\2\34\u0111\3\2\2\2\36\u0113\3\2\2\2 \u0123\3\2\2\2\""+
		"\u0125\3\2\2\2$\u013c\3\2\2\2&\u0144\3\2\2\2(\u0146\3\2\2\2*\u014b\3\2"+
		"\2\2,\u0156\3\2\2\2.\u0167\3\2\2\2\60\u0169\3\2\2\2\62\u0172\3\2\2\2\64"+
		"\u0178\3\2\2\2\66\u017a\3\2\2\28\u017d\3\2\2\2:\u017f\3\2\2\2<\u0186\3"+
		"\2\2\2>\u0196\3\2\2\2@\u01a1\3\2\2\2B\u01a3\3\2\2\2D\u01af\3\2\2\2F\u01d4"+
		"\3\2\2\2H\u01d7\3\2\2\2J\u01dd\3\2\2\2L\u01e5\3\2\2\2N\u01eb\3\2\2\2P"+
		"\u01f3\3\2\2\2R\u01ff\3\2\2\2T\u0202\3\2\2\2V\u0206\3\2\2\2X\u0211\3\2"+
		"\2\2Z\u0218\3\2\2\2\\\u021a\3\2\2\2^\u021e\3\2\2\2`\u022c\3\2\2\2b\u023b"+
		"\3\2\2\2d\u023d\3\2\2\2f\u023f\3\2\2\2h\u0246\3\2\2\2j\u024c\3\2\2\2l"+
		"\u026d\3\2\2\2n\u026f\3\2\2\2p\u027a\3\2\2\2r\u0281\3\2\2\2t\u0292\3\2"+
		"\2\2v\u029d\3\2\2\2x\u029f\3\2\2\2z\u02a9\3\2\2\2|\u02af\3\2\2\2~\u02bb"+
		"\3\2\2\2\u0080\u02c0\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0087\5\6\4\2\u0086\u0085\3\2"+
		"\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008f\5\b\5\2\u008c\u008e\5\b"+
		"\5\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\2"+
		"\2\3\u0093\3\3\2\2\2\u0094\u0095\7\4\2\2\u0095\u0096\7\60\2\2\u0096\5"+
		"\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5V,\2\u0099\7\3\2\2\2\u009a\u009b"+
		"\7\7\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5\34\17\2\u009d\u009e\7\22\2"+
		"\2\u009e\u00bc\3\2\2\2\u009f\u00a0\5> \2\u00a0\u00a1\7\b\2\2\u00a1\u00a2"+
		"\5&\24\2\u00a2\u00bc\3\2\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00a6\7\60\2\2"+
		"\u00a5\u00a7\5\n\6\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\5.\30\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7\60\2\2"+
		"\u00ab\u00bc\3\2\2\2\u00ac\u00ad\7!\2\2\u00ad\u00af\7\60\2\2\u00ae\u00b0"+
		"\5\n\6\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\5\62\32\2\u00b2\u00b3\7\"\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00bc"+
		"\3\2\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\5f\64\2\u00b8"+
		"\u00b9\7\"\2\2\u00b9\u00ba\7\60\2\2\u00ba\u00bc\3\2\2\2\u00bb\u009a\3"+
		"\2\2\2\u00bb\u009f\3\2\2\2\u00bb\u00a3\3\2\2\2\u00bb\u00ac\3\2\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bc\t\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00c3\7\34\2"+
		"\2\u00bf\u00c1\7\16\2\2\u00c0\u00c2\7\23\2\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7\35\2\2\u00c8\13\3\2\2\2\u00c9\u00d4\5\16\b\2\u00ca\u00d4\5V,"+
		"\2\u00cb\u00d4\5P)\2\u00cc\u00d4\5\32\16\2\u00cd\u00d4\5\36\20\2\u00ce"+
		"\u00cf\7\30\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\7\31\2\2\u00d1\u00d4"+
		"\3\2\2\2\u00d2\u00d4\5`\61\2\u00d3\u00c9\3\2\2\2\u00d3\u00ca\3\2\2\2\u00d3"+
		"\u00cb\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00ce\3\2"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d4\r\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6\u00d8"+
		"\5\20\t\2\u00d7\u00d9\5\30\r\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\17\3\2\2\2\u00da\u00db\7\30\2\2\u00db\u00dc\5\24\13\2\u00dc\u00dd"+
		"\7\31\2\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00e3\3\2\2\2\u00e0\u00e2\5\22\n\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\21\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00eb\7\20\2\2\u00e7\u00e8\7\30\2\2\u00e8\u00e9\5"+
		"\24\13\2\u00e9\u00ea\7\31\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00f2\5\26\f\2\u00ee\u00ef"+
		"\7\22\2\2\u00ef\u00f1\5\26\f\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\25\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00fa\5\16\b\2\u00f6\u00fa\5`\61\2\u00f7\u00fa\5P)\2\u00f8"+
		"\u00fa\5\32\16\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3"+
		"\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fe\7\17\2\2\u00fc"+
		"\u00fd\7\13\2\2\u00fd\u00ff\5*\26\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\31\3\2\2\2\u0100\u0101\7\32\2\2\u0101\u010e\7\33\2\2\u0102"+
		"\u0103\7\32\2\2\u0103\u0108\5\34\17\2\u0104\u0105\7\23\2\2\u0105\u0107"+
		"\5\34\17\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c"+
		"\7\33\2\2\u010c\u010e\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0102\3\2\2\2"+
		"\u010e\33\3\2\2\2\u010f\u0112\5:\36\2\u0110\u0112\5> \2\u0111\u010f\3"+
		"\2\2\2\u0111\u0110\3\2\2\2\u0112\35\3\2\2\2\u0113\u011c\7\34\2\2\u0114"+
		"\u0119\5 \21\2\u0115\u0116\7\23\2\2\u0116\u0118\5 \21\2\u0117\u0115\3"+
		"\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\35\2\2\u011f\37\3\2\2\2\u0120\u0124"+
		"\5\"\22\2\u0121\u0124\5\34\17\2\u0122\u0124\5\16\b\2\u0123\u0120\3\2\2"+
		"\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124!\3\2\2\2\u0125\u0126"+
		"\7\16\2\2\u0126\u0127\5\34\17\2\u0127#\3\2\2\2\u0128\u013d\5\f\7\2\u0129"+
		"\u012a\7\30\2\2\u012a\u012b\5.\30\2\u012b\u012c\7\31\2\2\u012c\u013d\3"+
		"\2\2\2\u012d\u013d\5(\25\2\u012e\u012f\7\32\2\2\u012f\u0134\7\60\2\2\u0130"+
		"\u0131\7\23\2\2\u0131\u0133\7\60\2\2\u0132\u0130\3\2\2\2\u0133\u0136\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0138\7\33\2\2\u0138\u0139\7\30\2\2\u0139\u013a\5"+
		".\30\2\u013a\u013b\7\31\2\2\u013b\u013d\3\2\2\2\u013c\u0128\3\2\2\2\u013c"+
		"\u0129\3\2\2\2\u013c\u012d\3\2\2\2\u013c\u012e\3\2\2\2\u013d%\3\2\2\2"+
		"\u013e\u013f\7\n\2\2\u013f\u0141\5\20\t\2\u0140\u0142\5\30\r\2\u0141\u0140"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0145\7\6\2\2\u0144"+
		"\u013e\3\2\2\2\u0144\u0143\3\2\2\2\u0145\'\3\2\2\2\u0146\u0149\7\60\2"+
		"\2\u0147\u0148\7\13\2\2\u0148\u014a\5*\26\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a)\3\2\2\2\u014b\u0150\7\34\2\2\u014c\u014e\5,\27\2"+
		"\u014d\u014f\7\23\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014c\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\35\2\2\u0155+\3\2\2\2"+
		"\u0156\u0159\7\16\2\2\u0157\u015a\5> \2\u0158\u015a\5(\25\2\u0159\u0157"+
		"\3\2\2\2\u0159\u0158\3\2\2\2\u015a-\3\2\2\2\u015b\u015f\5\62\32\2\u015c"+
		"\u015e\5\60\31\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0168\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0164\5\60\31\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u015b\3\2\2\2\u0167"+
		"\u0163\3\2\2\2\u0168/\3\2\2\2\u0169\u016a\5B\"\2\u016a\u016b\5\62\32\2"+
		"\u016b\61\3\2\2\2\u016c\u016e\5\64\33\2\u016d\u016c\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u0173\7\6\2\2\u0172\u016d\3\2\2\2\u0172\u0171\3\2\2\2\u0173\63\3\2\2"+
		"\2\u0174\u0179\58\35\2\u0175\u0179\5<\37\2\u0176\u0179\5:\36\2\u0177\u0179"+
		"\5\66\34\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2"+
		"\u0178\u0177\3\2\2\2\u0179\65\3\2\2\2\u017a\u017b\5> \2\u017b\u017c\7"+
		"\t\2\2\u017c\67\3\2\2\2\u017d\u017e\5\b\5\2\u017e9\3\2\2\2\u017f\u0180"+
		"\5> \2\u0180\u0181\7\b\2\2\u0181\u0182\7#\2\2\u0182;\3\2\2\2\u0183\u0184"+
		"\5> \2\u0184\u0185\7\b\2\2\u0185\u0187\3\2\2\2\u0186\u0183\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\7\25\2\2\u0189\u0188\3"+
		"\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\t\3\2\2\u018c"+
		"\u018d\5\20\t\2\u018d\u018e\7\r\2\2\u018e\u018f\5\34\17\2\u018f\u0190"+
		"\7\22\2\2\u0190=\3\2\2\2\u0191\u0197\5\f\7\2\u0192\u0193\5\f\7\2\u0193"+
		"\u0194\5@!\2\u0194\u0197\3\2\2\2\u0195\u0197\5\"\22\2\u0196\u0191\3\2"+
		"\2\2\u0196\u0192\3\2\2\2\u0196\u0195\3\2\2\2\u0197?\3\2\2\2\u0198\u0199"+
		"\7\b\2\2\u0199\u019b\5$\23\2\u019a\u019c\5@!\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01a2\3\2\2\2\u019d\u019f\7\24\2\2\u019e\u01a0\5"+
		"@!\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u0198\3\2\2\2\u01a1\u019d\3\2\2\2\u01a2A\3\2\2\2\u01a3\u01a4\7\36\2\2"+
		"\u01a4\u01a9\5D#\2\u01a5\u01a6\7\62\2\2\u01a6\u01a8\5D#\2\u01a7\u01a5"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\63\2\2\u01adC\3\2\2\2"+
		"\u01ae\u01b0\5F$\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4"+
		"\3\2\2\2\u01b1\u01b3\5J&\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5E\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b7\u01d5\5\16\b\2\u01b8\u01d5\5`\61\2\u01b9\u01d5\5H%\2\u01ba\u01d5"+
		"\5V,\2\u01bb\u01c3\7\34\2\2\u01bc\u01bd\7\16\2\2\u01bd\u01bf\5B\"\2\u01be"+
		"\u01c0\7\23\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3"+
		"\2\2\2\u01c1\u01bc\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01d5\7\35"+
		"\2\2\u01c7\u01c8\7\27\2\2\u01c8\u01d5\5D#\2\u01c9\u01ca\7\32\2\2\u01ca"+
		"\u01d2\7\33\2\2\u01cb\u01ce\7\30\2\2\u01cc\u01cf\5H%\2\u01cd\u01cf\5`"+
		"\61\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\7\31\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cb\3\2\2\2\u01d2\u01d3\3"+
		"\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01b7\3\2\2\2\u01d4\u01b8\3\2\2\2\u01d4"+
		"\u01b9\3\2\2\2\u01d4\u01ba\3\2\2\2\u01d4\u01bb\3\2\2\2\u01d4\u01c7\3\2"+
		"\2\2\u01d4\u01c9\3\2\2\2\u01d5G\3\2\2\2\u01d6\u01d8\5L\'\2\u01d7\u01d6"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\7%\2\2\u01da"+
		"\u01dc\5N(\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcI\3\2\2\2\u01dd"+
		"\u01de\7\64\2\2\u01de\u01df\5> \2\u01df\u01e0\5B\"\2\u01e0\u01e1\7\31"+
		"\2\2\u01e1K\3\2\2\2\u01e2\u01e6\5\16\b\2\u01e3\u01e6\5`\61\2\u01e4\u01e6"+
		"\5V,\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e9\7\27\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3"+
		"\2\2\2\u01e9M\3\2\2\2\u01ea\u01ec\7\27\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01f1\5\16\b\2\u01ee\u01f1\5`\61\2"+
		"\u01ef\u01f1\5V,\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef"+
		"\3\2\2\2\u01f1O\3\2\2\2\u01f2\u01f4\5L\'\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\7%\2\2\u01f6\u01f8\5N(\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01fa\7\r"+
		"\2\2\u01fa\u01fc\5`\61\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		"Q\3\2\2\2\u01fd\u0200\7-\2\2\u01fe\u0200\5T+\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200S\3\2\2\2\u0201\u0203\5b\62\2\u0202\u0201\3\2\2\2"+
		"\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\7.\2\2\u0205U\3\2"+
		"\2\2\u0206\u020a\7/\2\2\u0207\u0209\5X-\2\u0208\u0207\3\2\2\2\u0209\u020c"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u020e\7;\2\2\u020eW\3\2\2\2\u020f\u0212\5Z.\2\u0210"+
		"\u0212\7:\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212Y\3\2\2\2\u0213"+
		"\u0219\5^\60\2\u0214\u0215\5\16\b\2\u0215\u0216\7\21\2\2\u0216\u0219\3"+
		"\2\2\2\u0217\u0219\5\\/\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219[\3\2\2\2\u021a\u021b\79\2\2\u021b\u021c\5`\61\2\u021c"+
		"\u021d\7\21\2\2\u021d]\3\2\2\2\u021e\u021f\78\2\2\u021f\u0220\5\34\17"+
		"\2\u0220\u0221\7\31\2\2\u0221_\3\2\2\2\u0222\u0223\b\61\1\2\u0223\u022d"+
		"\5R*\2\u0224\u0225\7\30\2\2\u0225\u0226\5\34\17\2\u0226\u0227\7\31\2\2"+
		"\u0227\u022d\3\2\2\2\u0228\u022a\5b\62\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\5\16\b\2\u022c\u0222\3\2\2\2"+
		"\u022c\u0224\3\2\2\2\u022c\u0229\3\2\2\2\u022d\u0238\3\2\2\2\u022e\u022f"+
		"\f\4\2\2\u022f\u0230\5d\63\2\u0230\u0231\5`\61\5\u0231\u0237\3\2\2\2\u0232"+
		"\u0233\f\3\2\2\u0233\u0234\5b\62\2\u0234\u0235\5`\61\4\u0235\u0237\3\2"+
		"\2\2\u0236\u022e\3\2\2\2\u0236\u0232\3\2\2\2\u0237\u023a\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239a\3\2\2\2\u023a\u0238\3\2\2\2"+
		"\u023b\u023c\t\4\2\2\u023cc\3\2\2\2\u023d\u023e\t\5\2\2\u023ee\3\2\2\2"+
		"\u023f\u0243\5j\66\2\u0240\u0242\5h\65\2\u0241\u0240\3\2\2\2\u0242\u0245"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244g\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0247\7\16\2\2\u0247\u0248\5j\66\2\u0248i\3\2\2\2"+
		"\u0249\u024b\5x=\2\u024a\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0255\3\2\2\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0251\5\u0080A\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0256\5n8\2\u0255"+
		"\u0250\3\2\2\2\u0255\u0254\3\2\2\2\u0256k\3\2\2\2\u0257\u026e\5r:\2\u0258"+
		"\u0259\7\32\2\2\u0259\u025a\5j\66\2\u025a\u025c\7\33\2\2\u025b\u025d\5"+
		"@!\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u026e\3\2\2\2\u025e"+
		"\u0262\7\34\2\2\u025f\u0261\5x=\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0267\5n8\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u026a\7\35\2\2\u0269\u026b\5@!\2\u026a\u0269"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026e\7$\2\2\u026d"+
		"\u0257\3\2\2\2\u026d\u0258\3\2\2\2\u026d\u025e\3\2\2\2\u026d\u026c\3\2"+
		"\2\2\u026em\3\2\2\2\u026f\u0274\5p9\2\u0270\u0271\7\23\2\2\u0271\u0273"+
		"\5p9\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275o\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\5x=\2\u0278"+
		"\u0277\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u027f\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u0280\5r:\2\u027e\u0280"+
		"\5|?\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2\2\2\u0280q\3\2\2\2\u0281\u0282"+
		"\7\36\2\2\u0282\u0287\5t;\2\u0283\u0284\7\62\2\2\u0284\u0286\5t;\2\u0285"+
		"\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028c\7\63\2\2\u028b"+
		"\u028d\5v<\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2"+
		"\2\u028e\u0290\5@!\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290s\3"+
		"\2\2\2\u0291\u0293\7\27\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0297\7\60\2\2\u0295\u0297\5V,\2\u0296\u0294\3\2"+
		"\2\2\u0296\u0295\3\2\2\2\u0297u\3\2\2\2\u0298\u029e\7&\2\2\u0299\u029e"+
		"\7(\2\2\u029a\u029e\7+\2\2\u029b\u029c\7,\2\2\u029c\u029e\t\6\2\2\u029d"+
		"\u0298\3\2\2\2\u029d\u0299\3\2\2\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2"+
		"\2\2\u029ew\3\2\2\2\u029f\u02a1\7\30\2\2\u02a0\u02a2\5z>\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02a6\7\31\2\2\u02a6y\3\2\2\2\u02a7\u02a8\7\7\2\2"+
		"\u02a8\u02aa\7\16\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab"+
		"\3\2\2\2\u02ab\u02ac\5l\67\2\u02ac{\3\2\2\2\u02ad\u02b0\7\16\2\2\u02ae"+
		"\u02b0\5~@\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\u02b4\3\2\2"+
		"\2\u02b1\u02b3\5x=\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b9\5\u0080A\2\u02b8\u02ba\7\23\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba}\3\2\2\2\u02bb\u02bc\5r:\2\u02bc\u02bd\7\r\2\2\u02bd\177"+
		"\3\2\2\2\u02be\u02c1\5l\67\2\u02bf\u02c1\5x=\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c4\5x=\2\u02c3\u02c2\3\2\2"+
		"\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u0081"+
		"\3\2\2\2\u02c7\u02c5\3\2\2\2_\u0083\u0088\u008f\u00a6\u00af\u00bb\u00c1"+
		"\u00c5\u00d3\u00d8\u00de\u00e3\u00eb\u00f2\u00f9\u00fe\u0108\u010d\u0111"+
		"\u0119\u011c\u0123\u0134\u013c\u0141\u0144\u0149\u014e\u0152\u0159\u015f"+
		"\u0165\u0167\u016f\u0172\u0178\u0186\u0189\u0196\u019b\u019f\u01a1\u01a9"+
		"\u01af\u01b4\u01bf\u01c3\u01ce\u01d2\u01d4\u01d7\u01db\u01e5\u01e8\u01eb"+
		"\u01f0\u01f3\u01f7\u01fb\u01ff\u0202\u020a\u0211\u0218\u0229\u022c\u0236"+
		"\u0238\u0243\u024c\u0252\u0255\u025c\u0262\u0266\u026a\u026d\u0274\u027a"+
		"\u027f\u0287\u028c\u028f\u0292\u0296\u029d\u02a3\u02a9\u02af\u02b4\u02b9"+
		"\u02c0\u02c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}