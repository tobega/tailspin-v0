// Generated from TailspinParser.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StartComment=1, Include=2, Void=3, Def=4, When=5, Do=6, Otherwise=7, StereotypeDefinition=8, 
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, And=13, Slash=14, 
		Colon=15, Message=16, FieldReference=17, EndStringInterpolate=18, SemiColon=19, 
		Comma=20, Deconstructor=21, Invert=22, LeftParen=23, RightParen=24, LeftBracket=25, 
		RightBracket=26, LeftBrace=27, RightBrace=28, StartBytes=29, StartMatcher=30, 
		Lambda=31, StartTemplatesDefinition=32, StartSourceDefinition=33, StartSinkDefinition=34, 
		StartComposerDefinition=35, StartProcessorDefinition=36, StartOperatorDefinition=37, 
		EndDefinition=38, Rule=39, First=40, Last=41, TemplateMatch=42, Range=43, 
		Plus=44, Minus=45, Star=46, TruncateDivide=47, Mod=48, Question=49, Equal=50, 
		Else=51, EndMatcher=52, BeginCondition=53, StartTestDefinition=54, Assert=55, 
		CoreSystem=56, With=57, Provided=58, Modified=59, Shadowed=60, Inherited=61, 
		From=62, StandAlone=63, Use=64, Zero=65, PositiveInteger=66, START_STRING=67, 
		STATE_IDENTIFIER=68, IDENTIFIER=69, WS=70, Comment=71, REGEX_TEXT=72, 
		END_REGEX=73, StartCharacterCode=74, StartStringInterpolate=75, STRING_TEXT=76, 
		END_STRING=77, Bytes=78, Bytes_WS=79, EndBytes=80;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_key = 3, 
		RULE_parameterDefinitions = 4, RULE_source = 5, RULE_sourceReference = 6, 
		RULE_reference = 7, RULE_structureReference = 8, RULE_arrayReference = 9, 
		RULE_dimensionReference = 10, RULE_simpleDimension = 11, RULE_multiValueDimension = 12, 
		RULE_arrayLiteral = 13, RULE_valueProduction = 14, RULE_structureLiteral = 15, 
		RULE_bytesLiteral = 16, RULE_byteValue = 17, RULE_keyValues = 18, RULE_keyValue = 19, 
		RULE_templates = 20, RULE_arrayIndexDecomposition = 21, RULE_sink = 22, 
		RULE_templatesReference = 23, RULE_parameterValues = 24, RULE_parameterValue = 25, 
		RULE_templatesBody = 26, RULE_matchTemplate = 27, RULE_block = 28, RULE_blockExpression = 29, 
		RULE_resultValue = 30, RULE_blockStatement = 31, RULE_sendToTemplates = 32, 
		RULE_stateAssignment = 33, RULE_stateSink = 34, RULE_valueChain = 35, 
		RULE_transform = 36, RULE_matcher = 37, RULE_criterion = 38, RULE_typeMatch = 39, 
		RULE_structureContentMatcher = 40, RULE_arrayContentMatcher = 41, RULE_literalMatch = 42, 
		RULE_rangeBounds = 43, RULE_condition = 44, RULE_lowerBound = 45, RULE_upperBound = 46, 
		RULE_rangeLiteral = 47, RULE_integerLiteral = 48, RULE_nonZeroInteger = 49, 
		RULE_stringLiteral = 50, RULE_stringContent = 51, RULE_stringInterpolate = 52, 
		RULE_characterCode = 53, RULE_interpolateEvaluate = 54, RULE_arithmeticExpression = 55, 
		RULE_termArithmeticOperation = 56, RULE_additiveOperator = 57, RULE_multiplicativeOperator = 58, 
		RULE_term = 59, RULE_operatorExpression = 60, RULE_operand = 61, RULE_composerBody = 62, 
		RULE_definedCompositionSequence = 63, RULE_compositionSequence = 64, RULE_compositionComponents = 65, 
		RULE_compositionComponent = 66, RULE_compositionMatcher = 67, RULE_structureMemberMatchers = 68, 
		RULE_structureMemberMatcher = 69, RULE_tokenMatcher = 70, RULE_compositionToken = 71, 
		RULE_literalComposition = 72, RULE_multiplier = 73, RULE_compositionSkipRule = 74, 
		RULE_compositionCapture = 75, RULE_compositionKeyValue = 76, RULE_compositionKey = 77, 
		RULE_localIdentifier = 78, RULE_stateIdentifier = 79, RULE_externalIdentifier = 80, 
		RULE_anyIdentifier = 81, RULE_arithmeticContextKeyword = 82, RULE_keyword = 83, 
		RULE_testBody = 84, RULE_testBlock = 85, RULE_assertion = 86, RULE_dependencyProvision = 87, 
		RULE_moduleConfiguration = 88, RULE_moduleIdentifier = 89, RULE_useModule = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "key", "parameterDefinitions", "source", 
			"sourceReference", "reference", "structureReference", "arrayReference", 
			"dimensionReference", "simpleDimension", "multiValueDimension", "arrayLiteral", 
			"valueProduction", "structureLiteral", "bytesLiteral", "byteValue", "keyValues", 
			"keyValue", "templates", "arrayIndexDecomposition", "sink", "templatesReference", 
			"parameterValues", "parameterValue", "templatesBody", "matchTemplate", 
			"block", "blockExpression", "resultValue", "blockStatement", "sendToTemplates", 
			"stateAssignment", "stateSink", "valueChain", "transform", "matcher", 
			"criterion", "typeMatch", "structureContentMatcher", "arrayContentMatcher", 
			"literalMatch", "rangeBounds", "condition", "lowerBound", "upperBound", 
			"rangeLiteral", "integerLiteral", "nonZeroInteger", "stringLiteral", 
			"stringContent", "stringInterpolate", "characterCode", "interpolateEvaluate", 
			"arithmeticExpression", "termArithmeticOperation", "additiveOperator", 
			"multiplicativeOperator", "term", "operatorExpression", "operand", "composerBody", 
			"definedCompositionSequence", "compositionSequence", "compositionComponents", 
			"compositionComponent", "compositionMatcher", "structureMemberMatchers", 
			"structureMemberMatcher", "tokenMatcher", "compositionToken", "literalComposition", 
			"multiplier", "compositionSkipRule", "compositionCapture", "compositionKeyValue", 
			"compositionKey", "localIdentifier", "stateIdentifier", "externalIdentifier", 
			"anyIdentifier", "arithmeticContextKeyword", "keyword", "testBody", "testBlock", 
			"assertion", "dependencyProvision", "moduleConfiguration", "moduleIdentifier", 
			"useModule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'include'", "'VOID'", "'def'", "'when'", "'do'", "'otherwise'", 
			"'stereotype'", "'->'", "'!'", "'$'", "'^'", "'&'", "'/'", "':'", null, 
			null, null, "';'", "','", "'...'", "'~'", null, null, "'['", "']'", "'{'", 
			"'}'", "'[x'", "'<'", "'\\'", "'templates'", "'source'", "'sink'", "'composer'", 
			"'processor'", "'operator'", "'end'", "'rule'", "'first'", "'last'", 
			"'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", "'?'", "'='", "'|'", 
			"'>'", null, "'test'", "'assert'", "'core-system/'", "'with'", "'provided'", 
			"'modified'", "'shadowed'", "'inherited'", "'from'", "'stand-alone'", 
			"'use'", "'0'", null, null, null, null, null, null, null, "'''", null, 
			null, null, null, null, null, "'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"StereotypeDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
			"SemiColon", "Comma", "Deconstructor", "Invert", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "StartBytes", 
			"StartMatcher", "Lambda", "StartTemplatesDefinition", "StartSourceDefinition", 
			"StartSinkDefinition", "StartComposerDefinition", "StartProcessorDefinition", 
			"StartOperatorDefinition", "EndDefinition", "Rule", "First", "Last", 
			"TemplateMatch", "Range", "Plus", "Minus", "Star", "TruncateDivide", 
			"Mod", "Question", "Equal", "Else", "EndMatcher", "BeginCondition", "StartTestDefinition", 
			"Assert", "CoreSystem", "With", "Provided", "Modified", "Shadowed", "Inherited", 
			"From", "StandAlone", "Use", "Zero", "PositiveInteger", "START_STRING", 
			"STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", "END_REGEX", 
			"StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", "END_STRING", 
			"Bytes", "Bytes_WS", "EndBytes"
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
		public List<UseModuleContext> useModule() {
			return getRuleContexts(UseModuleContext.class);
		}
		public UseModuleContext useModule(int i) {
			return getRuleContext(UseModuleContext.class,i);
		}
		public List<InclusionContext> inclusion() {
			return getRuleContexts(InclusionContext.class);
		}
		public InclusionContext inclusion(int i) {
			return getRuleContext(InclusionContext.class,i);
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
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					useModule();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					inclusion();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(194);
			statement();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(195);
				statement();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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

	public static class InclusionContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(TailspinParser.Include, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public InclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusionContext inclusion() throws RecognitionException {
		InclusionContext _localctx = new InclusionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Include);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
				{
				setState(204);
				localIdentifier();
				setState(205);
				match(From);
				}
			}

			setState(209);
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
	public static class StereotypeDefinitionContext extends StatementContext {
		public TerminalNode StereotypeDefinition() { return getToken(TailspinParser.StereotypeDefinition, 0); }
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public StereotypeDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStereotypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TemplatesDefinitionContext extends StatementContext {
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public TerminalNode StartSinkDefinition() { return getToken(TailspinParser.StartSinkDefinition, 0); }
		public TerminalNode StartSourceDefinition() { return getToken(TailspinParser.StartSourceDefinition, 0); }
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
	public static class OperatorDefinitionContext extends StatementContext {
		public TerminalNode StartOperatorDefinition() { return getToken(TailspinParser.StartOperatorDefinition, 0); }
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public OperatorDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperatorDefinition(this);
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
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public ComposerBodyContext composerBody() {
			return getRuleContext(ComposerBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ParameterDefinitionsContext parameterDefinitions() {
			return getRuleContext(ParameterDefinitionsContext.class,0);
		}
		public ComposerDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitComposerDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitionContext extends StatementContext {
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
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
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
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
	public static class TestDefinitionContext extends StatementContext {
		public TerminalNode StartTestDefinition() { return getToken(TailspinParser.StartTestDefinition, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TestBodyContext testBody() {
			return getRuleContext(TestBodyContext.class,0);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<UseModuleContext> useModule() {
			return getRuleContexts(UseModuleContext.class);
		}
		public UseModuleContext useModule(int i) {
			return getRuleContext(UseModuleContext.class,i);
		}
		public TestDefinitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(Def);
				setState(212);
				key();
				setState(213);
				valueProduction();
				setState(214);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				valueChain();
				setState(217);
				match(To);
				setState(218);
				sink();
				}
				break;
			case 3:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				localIdentifier();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(222);
					parameterDefinitions();
					}
				}

				setState(225);
				templatesBody();
				setState(226);
				match(EndDefinition);
				setState(227);
				localIdentifier();
				}
				break;
			case 4:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(StartProcessorDefinition);
				setState(230);
				localIdentifier();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(231);
					parameterDefinitions();
					}
				}

				setState(234);
				block();
				setState(235);
				match(EndDefinition);
				setState(236);
				localIdentifier();
				}
				break;
			case 5:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(StartComposerDefinition);
				setState(239);
				localIdentifier();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(240);
					parameterDefinitions();
					}
				}

				setState(243);
				composerBody();
				setState(244);
				match(EndDefinition);
				setState(245);
				localIdentifier();
				}
				break;
			case 6:
				_localctx = new TestDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(StartTestDefinition);
				setState(248);
				stringLiteral();
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						useModule();
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(255);
				testBody();
				setState(256);
				match(EndDefinition);
				setState(257);
				stringLiteral();
				}
				break;
			case 7:
				_localctx = new OperatorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(StartOperatorDefinition);
				setState(260);
				match(LeftParen);
				setState(261);
				localIdentifier();
				setState(262);
				localIdentifier();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(263);
					parameterDefinitions();
					}
				}

				setState(266);
				localIdentifier();
				setState(267);
				match(RightParen);
				setState(268);
				templatesBody();
				setState(269);
				match(EndDefinition);
				setState(270);
				localIdentifier();
				}
				break;
			case 8:
				_localctx = new StereotypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				match(StereotypeDefinition);
				setState(273);
				localIdentifier();
				setState(274);
				matcher();
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

	public static class KeyContext extends ParserRuleContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			localIdentifier();
			setState(279);
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

	public static class ParameterDefinitionsContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TailspinParser.And, 0); }
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
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
			setState(281);
			match(And);
			setState(282);
			match(LeftBrace);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(283);
				key();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(284);
					match(Comma);
					}
				}

				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER );
			setState(291);
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
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
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
		public BytesLiteralContext bytesLiteral() {
			return getRuleContext(BytesLiteralContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				structureLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				bytesLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(LeftParen);
				setState(300);
				keyValue();
				setState(301);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				arithmeticExpression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				operatorExpression();
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

	public static class SourceReferenceContext extends ParserRuleContext {
		public TerminalNode SourceMarker() { return getToken(TailspinParser.SourceMarker, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode DeleteMarker() { return getToken(TailspinParser.DeleteMarker, 0); }
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public SourceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSourceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceReferenceContext sourceReference() throws RecognitionException {
		SourceReferenceContext _localctx = new SourceReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sourceReference);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(SourceMarker);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(308);
					anyIdentifier();
					}
					break;
				}
				setState(311);
				reference();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(312);
					match(Message);
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(315);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(DeleteMarker);
				setState(319);
				stateIdentifier();
				setState(320);
				reference();
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(324);
				match(LeftParen);
				setState(325);
				arrayReference();
				setState(326);
				match(RightParen);
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(330);
					structureReference();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(336);
			match(FieldReference);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(337);
				match(LeftParen);
				setState(338);
				arrayReference();
				setState(339);
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
			setState(343);
			dimensionReference();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(344);
				match(SemiColon);
				setState(345);
				dimensionReference();
				}
				}
				setState(350);
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
		public SimpleDimensionContext simpleDimension() {
			return getRuleContext(SimpleDimensionContext.class,0);
		}
		public MultiValueDimensionContext multiValueDimension() {
			return getRuleContext(MultiValueDimensionContext.class,0);
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Zero:
			case PositiveInteger:
			case START_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				simpleDimension();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				multiValueDimension();
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

	public static class SimpleDimensionContext extends ParserRuleContext {
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public RangeLiteralContext rangeLiteral() {
			return getRuleContext(RangeLiteralContext.class,0);
		}
		public SimpleDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitSimpleDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDimensionContext simpleDimension() throws RecognitionException {
		SimpleDimensionContext _localctx = new SimpleDimensionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleDimension);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
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

	public static class MultiValueDimensionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<SimpleDimensionContext> simpleDimension() {
			return getRuleContexts(SimpleDimensionContext.class);
		}
		public SimpleDimensionContext simpleDimension(int i) {
			return getRuleContext(SimpleDimensionContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public MultiValueDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiValueDimension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitMultiValueDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiValueDimensionContext multiValueDimension() throws RecognitionException {
		MultiValueDimensionContext _localctx = new MultiValueDimensionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiValueDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LeftBracket);
			setState(361);
			simpleDimension();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(362);
				match(Comma);
				setState(363);
				simpleDimension();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
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
		enterRule(_localctx, 26, RULE_arrayLiteral);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(LeftBracket);
				setState(372);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(LeftBracket);
				setState(374);
				valueProduction();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(375);
					match(Comma);
					setState(376);
					valueProduction();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
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
		enterRule(_localctx, 28, RULE_valueProduction);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
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
		enterRule(_localctx, 30, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LeftBrace);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(391);
				keyValues();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(392);
					match(Comma);
					setState(393);
					keyValues();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(401);
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

	public static class BytesLiteralContext extends ParserRuleContext {
		public TerminalNode StartBytes() { return getToken(TailspinParser.StartBytes, 0); }
		public List<ByteValueContext> byteValue() {
			return getRuleContexts(ByteValueContext.class);
		}
		public ByteValueContext byteValue(int i) {
			return getRuleContext(ByteValueContext.class,i);
		}
		public TerminalNode EndBytes() { return getToken(TailspinParser.EndBytes, 0); }
		public BytesLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytesLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitBytesLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytesLiteralContext bytesLiteral() throws RecognitionException {
		BytesLiteralContext _localctx = new BytesLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bytesLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(StartBytes);
			setState(404);
			byteValue();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(405);
				byteValue();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(EndBytes);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByteValueContext extends ParserRuleContext {
		public TerminalNode Bytes() { return getToken(TailspinParser.Bytes, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ByteValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitByteValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByteValueContext byteValue() throws RecognitionException {
		ByteValueContext _localctx = new ByteValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_byteValue);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bytes:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(Bytes);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				term();
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

	public static class KeyValuesContext extends ParserRuleContext {
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
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
		enterRule(_localctx, 36, RULE_keyValues);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				sourceReference();
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
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			key();
			setState(423);
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
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public CallDefinedTransformContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCallDefinedTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaArrayTemplatesContext extends TemplatesContext {
		public List<TerminalNode> Lambda() { return getTokens(TailspinParser.Lambda); }
		public TerminalNode Lambda(int i) {
			return getToken(TailspinParser.Lambda, i);
		}
		public ArrayIndexDecompositionContext arrayIndexDecomposition() {
			return getRuleContext(ArrayIndexDecompositionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public LambdaArrayTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLambdaArrayTemplates(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaTemplatesContext extends TemplatesContext {
		public List<TerminalNode> Lambda() { return getTokens(TailspinParser.Lambda); }
		public TerminalNode Lambda(int i) {
			return getToken(TailspinParser.Lambda, i);
		}
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public TemplatesBodyContext templatesBody() {
			return getRuleContext(TemplatesBodyContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public LambdaTemplatesContext(TemplatesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLambdaTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_templates);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				source();
				}
				break;
			case 2:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(Lambda);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					setState(427);
					localIdentifier();
					}
				}

				setState(430);
				match(LeftParen);
				setState(431);
				templatesBody();
				setState(432);
				match(Lambda);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					setState(433);
					localIdentifier();
					}
				}

				setState(436);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				match(Lambda);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					setState(440);
					localIdentifier();
					}
				}

				setState(443);
				arrayIndexDecomposition();
				setState(444);
				match(LeftParen);
				setState(445);
				templatesBody();
				setState(446);
				match(Lambda);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					setState(447);
					localIdentifier();
					}
				}

				setState(450);
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

	public static class ArrayIndexDecompositionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public ArrayIndexDecompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexDecomposition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayIndexDecomposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexDecompositionContext arrayIndexDecomposition() throws RecognitionException {
		ArrayIndexDecompositionContext _localctx = new ArrayIndexDecompositionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LeftBracket);
			setState(455);
			localIdentifier();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(456);
				match(SemiColon);
				setState(457);
				localIdentifier();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
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

	public static class SinkContext extends ParserRuleContext {
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(ResultMarker);
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				{
				setState(466);
				anyIdentifier();
				setState(467);
				reference();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(468);
					match(Message);
					}
				}

				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(471);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(474);
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

	public static class TemplatesReferenceContext extends ParserRuleContext {
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TemplatesReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatesReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTemplatesReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesReferenceContext templatesReference() throws RecognitionException {
		TemplatesReferenceContext _localctx = new TemplatesReferenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			anyIdentifier();
			setState(478);
			reference();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(479);
				match(Message);
				}
			}

			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(482);
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
		public TerminalNode And() { return getToken(TailspinParser.And, 0); }
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
		enterRule(_localctx, 48, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(And);
			setState(486);
			match(LeftBrace);
			setState(491); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(487);
				parameterValue();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(488);
					match(Comma);
					}
				}

				}
				}
				setState(493); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER );
			setState(495);
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
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
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
		enterRule(_localctx, 50, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			key();
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(498);
				valueChain();
				}
				break;
			case 2:
				{
				setState(499);
				templatesReference();
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
		enterRule(_localctx, 52, RULE_templatesBody);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				block();
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(503);
					matchTemplate();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(509);
					matchTemplate();
					}
					}
					setState(512); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0) );
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

	public static class MatchTemplateContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode When() { return getToken(TailspinParser.When, 0); }
		public TerminalNode Do() { return getToken(TailspinParser.Do, 0); }
		public TerminalNode Otherwise() { return getToken(TailspinParser.Otherwise, 0); }
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
		enterRule(_localctx, 54, RULE_matchTemplate);
		int _la;
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				matcher();
				setState(517);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(519);
					match(When);
					}
				}

				setState(522);
				matcher();
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(523);
					match(Do);
					}
					break;
				}
				setState(526);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(Otherwise);
				setState(529);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode ResultMarker() { return getToken(TailspinParser.ResultMarker, 0); }
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
		enterRule(_localctx, 56, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartBytes:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(533); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(532);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(535); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(537);
				match(ResultMarker);
				setState(538);
				match(Void);
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
		enterRule(_localctx, 58, RULE_blockExpression);
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(544);
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
		enterRule(_localctx, 60, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			valueChain();
			setState(548);
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
		enterRule(_localctx, 62, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		enterRule(_localctx, 64, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			valueChain();
			setState(553);
			match(To);
			setState(554);
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
		public StateSinkContext stateSink() {
			return getRuleContext(StateSinkContext.class,0);
		}
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
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
		enterRule(_localctx, 66, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(556);
				valueChain();
				setState(557);
				match(To);
				}
				break;
			}
			setState(561);
			stateSink();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateSinkContext extends ParserRuleContext {
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TerminalNode Range() { return getToken(TailspinParser.Range, 0); }
		public TerminalNode Else() { return getToken(TailspinParser.Else, 0); }
		public StateSinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateSink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateSinkContext stateSink() throws RecognitionException {
		StateSinkContext _localctx = new StateSinkContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(563);
				match(Range);
				setState(564);
				match(Else);
				}
			}

			setState(567);
			stateIdentifier();
			setState(568);
			reference();
			setState(569);
			match(Colon);
			setState(570);
			valueProduction();
			setState(571);
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
		enterRule(_localctx, 70, RULE_valueChain);
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				source();
				setState(575);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
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
		enterRule(_localctx, 72, RULE_transform);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(To);
				setState(581);
				templates();
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(582);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(Deconstructor);
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(586);
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
		public List<CriterionContext> criterion() {
			return getRuleContexts(CriterionContext.class);
		}
		public CriterionContext criterion(int i) {
			return getRuleContext(CriterionContext.class,i);
		}
		public TerminalNode EndMatcher() { return getToken(TailspinParser.EndMatcher, 0); }
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
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
		enterRule(_localctx, 74, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(StartMatcher);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(592);
				match(Invert);
				}
			}

			setState(595);
			criterion();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(596);
				match(Else);
				setState(597);
				criterion();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
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

	public static class CriterionContext extends ParserRuleContext {
		public LiteralMatchContext literalMatch() {
			return getRuleContext(LiteralMatchContext.class,0);
		}
		public TypeMatchContext typeMatch() {
			return getRuleContext(TypeMatchContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public CriterionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criterion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCriterion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriterionContext criterion() throws RecognitionException {
		CriterionContext _localctx = new CriterionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_criterion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(605);
				literalMatch();
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case SourceMarker:
			case DeleteMarker:
			case LeftParen:
			case LeftBracket:
			case LeftBrace:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Range:
			case Plus:
			case Minus:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				{
				setState(606);
				typeMatch();
				}
				break;
			case Else:
			case EndMatcher:
			case BeginCondition:
				break;
			default:
				break;
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginCondition) {
				{
				{
				setState(609);
				condition();
				}
				}
				setState(614);
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
		public List<ArrayContentMatcherContext> arrayContentMatcher() {
			return getRuleContexts(ArrayContentMatcherContext.class);
		}
		public ArrayContentMatcherContext arrayContentMatcher(int i) {
			return getRuleContext(ArrayContentMatcherContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
	public static class StructureMatchContext extends TypeMatchContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<StructureContentMatcherContext> structureContentMatcher() {
			return getRuleContexts(StructureContentMatcherContext.class);
		}
		public StructureContentMatcherContext structureContentMatcher(int i) {
			return getRuleContext(StructureContentMatcherContext.class,i);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
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
	public static class StereotypeMatchContext extends TypeMatchContext {
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ExternalIdentifierContext externalIdentifier() {
			return getRuleContext(ExternalIdentifierContext.class,0);
		}
		public StereotypeMatchContext(TypeMatchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStereotypeMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMatchContext typeMatch() throws RecognitionException {
		TypeMatchContext _localctx = new TypeMatchContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(617);
				match(LeftBrace);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					{
					setState(618);
					key();
					setState(619);
					structureContentMatcher();
					setState(621);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(620);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(628);
						match(Comma);
						}
					}

					setState(631);
					match(Void);
					}
				}

				setState(634);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				match(LeftBracket);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(636);
					arrayContentMatcher();
					}
				}

				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(639);
						match(Comma);
						setState(640);
						arrayContentMatcher();
						}
						} 
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(646);
						match(Comma);
						}
					}

					setState(649);
					match(Void);
					}
				}

				setState(652);
				match(RightBracket);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(653);
					match(LeftParen);
					setState(656);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(654);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(655);
						arithmeticExpression(0);
						}
						break;
					}
					setState(658);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(662);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(663);
					externalIdentifier();
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

	public static class StructureContentMatcherContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode Void() { return getToken(TailspinParser.Void, 0); }
		public StructureContentMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureContentMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructureContentMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContentMatcherContext structureContentMatcher() throws RecognitionException {
		StructureContentMatcherContext _localctx = new StructureContentMatcherContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structureContentMatcher);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
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

	public static class ArrayContentMatcherContext extends ParserRuleContext {
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
		}
		public ArrayContentMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayContentMatcher; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArrayContentMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContentMatcherContext arrayContentMatcher() throws RecognitionException {
		ArrayContentMatcherContext _localctx = new ArrayContentMatcherContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			matcher();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(673);
				multiplier();
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

	public static class LiteralMatchContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public LiteralMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalMatch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralMatchContext literalMatch() throws RecognitionException {
		LiteralMatchContext _localctx = new LiteralMatchContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(Equal);
			setState(677);
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
		enterRule(_localctx, 86, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(679);
				lowerBound();
				}
			}

			setState(682);
			match(Range);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Invert - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(683);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode BeginCondition() { return getToken(TailspinParser.BeginCondition, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
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
		enterRule(_localctx, 88, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(BeginCondition);
			setState(687);
			valueChain();
			setState(688);
			matcher();
			setState(689);
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
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
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
		enterRule(_localctx, 90, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(691);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(692);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(693);
				stringLiteral();
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(696);
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
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
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
		enterRule(_localctx, 92, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(699);
				match(Invert);
				}
			}

			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(702);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(703);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(704);
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
		enterRule(_localctx, 94, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(707);
				lowerBound();
				}
			}

			setState(710);
			match(Range);
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(711);
				upperBound();
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(714);
				match(Colon);
				setState(715);
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
		enterRule(_localctx, 96, RULE_integerLiteral);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		enterRule(_localctx, 98, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(722);
				additiveOperator();
				}
			}

			setState(725);
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
		enterRule(_localctx, 100, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(START_STRING);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (StartCharacterCode - 74)) | (1L << (StartStringInterpolate - 74)) | (1L << (STRING_TEXT - 74)))) != 0)) {
				{
				{
				setState(728);
				stringContent();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(734);
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
		enterRule(_localctx, 102, RULE_stringContent);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
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
		enterRule(_localctx, 104, RULE_stringInterpolate);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
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
		enterRule(_localctx, 106, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(StartCharacterCode);
			setState(745);
			arithmeticExpression(0);
			setState(746);
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
		public TerminalNode StartStringInterpolate() { return getToken(TailspinParser.StartStringInterpolate, 0); }
		public TerminalNode EndStringInterpolate() { return getToken(TailspinParser.EndStringInterpolate, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TailspinParser.Colon, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public TerminalNode TemplateMatch() { return getToken(TailspinParser.TemplateMatch, 0); }
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
		}
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 108, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(StartStringInterpolate);
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case To:
			case And:
			case Message:
			case FieldReference:
			case EndStringInterpolate:
			case Deconstructor:
			case LeftParen:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(749);
					anyIdentifier();
					}
				}

				setState(752);
				reference();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(753);
					match(Message);
					}
				}

				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(756);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(759);
				match(Colon);
				setState(760);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(763);
				transform();
				}
				break;
			}
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(766);
				match(To);
				setState(767);
				match(TemplateMatch);
				}
			}

			setState(770);
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
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public ArithmeticContextKeywordContext arithmeticContextKeyword() {
			return getRuleContext(ArithmeticContextKeywordContext.class,0);
		}
		public TermArithmeticOperationContext termArithmeticOperation() {
			return getRuleContext(TermArithmeticOperationContext.class,0);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(773);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(774);
				match(LeftParen);
				setState(775);
				arithmeticExpression(0);
				setState(776);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(778);
					additiveOperator();
					}
				}

				setState(781);
				sourceReference();
				}
				break;
			case 4:
				{
				setState(782);
				arithmeticContextKeyword();
				}
				break;
			case 5:
				{
				setState(783);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(786);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(787);
						multiplicativeOperator();
						setState(788);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(790);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(791);
						additiveOperator();
						setState(792);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(794);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(795);
						multiplicativeOperator();
						setState(796);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(798);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(799);
						additiveOperator();
						setState(800);
						term();
						}
						break;
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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

	public static class TermArithmeticOperationContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator() {
			return getRuleContext(MultiplicativeOperatorContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public AdditiveOperatorContext additiveOperator() {
			return getRuleContext(AdditiveOperatorContext.class,0);
		}
		public TermArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termArithmeticOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTermArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermArithmeticOperationContext termArithmeticOperation() throws RecognitionException {
		TermArithmeticOperationContext _localctx = new TermArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_termArithmeticOperation);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				term();
				setState(808);
				multiplicativeOperator();
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(809);
					term();
					}
					break;
				case 2:
					{
					setState(810);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				term();
				setState(814);
				additiveOperator();
				setState(817);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(815);
					term();
					}
					break;
				case 2:
					{
					setState(816);
					arithmeticExpression(0);
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
		enterRule(_localctx, 114, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
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
		public TerminalNode TruncateDivide() { return getToken(TailspinParser.TruncateDivide, 0); }
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
		enterRule(_localctx, 116, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << TruncateDivide) | (1L << Mod))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(LeftParen);
			setState(826);
			valueProduction();
			setState(827);
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

	public static class OperatorExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TemplatesReferenceContext templatesReference() {
			return getRuleContext(TemplatesReferenceContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LeftParen);
			setState(830);
			operand();
			setState(831);
			templatesReference();
			setState(832);
			operand();
			setState(833);
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

	public static class OperandContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_operand);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				term();
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

	public static class ComposerBodyContext extends ParserRuleContext {
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
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
		enterRule(_localctx, 124, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(839);
				stateAssignment();
				}
				break;
			}
			setState(842);
			compositionSequence();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(843);
				definedCompositionSequence();
				}
				}
				setState(848);
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
		public TerminalNode Rule() { return getToken(TailspinParser.Rule, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(Rule);
			setState(850);
			key();
			setState(851);
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
		public CompositionComponentsContext compositionComponents() {
			return getRuleContext(CompositionComponentsContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
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
		enterRule(_localctx, 128, RULE_compositionSequence);
		int _la;
		try {
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(854);
					compositionSkipRule();
					}
					}
					setState(857); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
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

	public static class CompositionComponentsContext extends ParserRuleContext {
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public CompositionComponentsContext compositionComponents() {
			return getRuleContext(CompositionComponentsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
		public CompositionComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositionComponents; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitCompositionComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositionComponentsContext compositionComponents() throws RecognitionException {
		CompositionComponentsContext _localctx = new CompositionComponentsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_compositionComponents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(861);
				compositionSkipRule();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			compositionComponent();
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(868);
					match(Comma);
					}
				}

				setState(871);
				compositionComponents();
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

	public static class CompositionComponentContext extends ParserRuleContext {
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
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
		enterRule(_localctx, 132, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			compositionMatcher();
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(875);
				transform();
				}
				break;
			}
			setState(881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(878);
					compositionSkipRule();
					}
					} 
				}
				setState(883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public CompositionSequenceContext compositionSequence() {
			return getRuleContext(CompositionSequenceContext.class,0);
		}
		public CompositionSkipRuleContext compositionSkipRule() {
			return getRuleContext(CompositionSkipRuleContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public CompositionKeyValueContext compositionKeyValue() {
			return getRuleContext(CompositionKeyValueContext.class,0);
		}
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
		enterRule(_localctx, 134, RULE_compositionMatcher);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(LeftBracket);
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(886);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(887);
					compositionSkipRule();
					}
					break;
				}
				setState(890);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				match(LeftBrace);
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(892);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(893);
					compositionSkipRule();
					}
					break;
				}
				setState(896);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				sourceReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				compositionKeyValue();
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

	public static class StructureMemberMatchersContext extends ParserRuleContext {
		public StructureMemberMatcherContext structureMemberMatcher() {
			return getRuleContext(StructureMemberMatcherContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
		public StructureMemberMatchersContext structureMemberMatchers() {
			return getRuleContext(StructureMemberMatchersContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TailspinParser.Comma, 0); }
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
		enterRule(_localctx, 136, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(901);
				compositionSkipRule();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			structureMemberMatcher();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
				{
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(908);
					match(Comma);
					}
				}

				setState(911);
				structureMemberMatchers();
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
		enterRule(_localctx, 138, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(914);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(915);
				compositionKeyValue();
				}
				break;
			}
			setState(921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(918);
					compositionSkipRule();
					}
					} 
				}
				setState(923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
		public TerminalNode Invert() { return getToken(TailspinParser.Invert, 0); }
		public List<TerminalNode> Else() { return getTokens(TailspinParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(TailspinParser.Else, i);
		}
		public MultiplierContext multiplier() {
			return getRuleContext(MultiplierContext.class,0);
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
		enterRule(_localctx, 140, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(StartMatcher);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(925);
				match(Invert);
				}
			}

			setState(928);
			compositionToken();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(929);
				match(Else);
				setState(930);
				compositionToken();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			match(EndMatcher);
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(937);
				multiplier();
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

	public static class CompositionTokenContext extends ParserRuleContext {
		public LiteralCompositionContext literalComposition() {
			return getRuleContext(LiteralCompositionContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
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
		enterRule(_localctx, 142, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(940);
				literalComposition();
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case IDENTIFIER:
				{
				setState(941);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(942);
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

	public static class LiteralCompositionContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(TailspinParser.Equal, 0); }
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralCompositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalComposition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLiteralComposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralCompositionContext literalComposition() throws RecognitionException {
		LiteralCompositionContext _localctx = new LiteralCompositionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(Equal);
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
				{
				setState(946);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(947);
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
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_multiplier);
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(953);
				match(Equal);
				setState(956);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(954);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
					{
					setState(955);
					sourceReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 148, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(LeftParen);
			setState(962); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(961);
				compositionCapture();
				}
				}
				setState(964); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(966);
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
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public CompositionMatcherContext compositionMatcher() {
			return getRuleContext(CompositionMatcherContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(TailspinParser.SemiColon, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TerminalNode To() { return getToken(TailspinParser.To, 0); }
		public StateSinkContext stateSink() {
			return getRuleContext(StateSinkContext.class,0);
		}
		public StateAssignmentContext stateAssignment() {
			return getRuleContext(StateAssignmentContext.class,0);
		}
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
		enterRule(_localctx, 150, RULE_compositionCapture);
		int _la;
		try {
			setState(985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(968);
				match(Def);
				setState(969);
				key();
				setState(970);
				compositionMatcher();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(971);
					transform();
					}
				}

				setState(974);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(976);
				compositionMatcher();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
					case 1:
						{
						setState(977);
						transform();
						}
						break;
					}
					setState(980);
					match(To);
					setState(981);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				stateAssignment();
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

	public static class CompositionKeyValueContext extends ParserRuleContext {
		public CompositionComponentContext compositionComponent() {
			return getRuleContext(CompositionComponentContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public CompositionKeyContext compositionKey() {
			return getRuleContext(CompositionKeyContext.class,0);
		}
		public List<CompositionSkipRuleContext> compositionSkipRule() {
			return getRuleContexts(CompositionSkipRuleContext.class);
		}
		public CompositionSkipRuleContext compositionSkipRule(int i) {
			return getRuleContext(CompositionSkipRuleContext.class,i);
		}
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
		enterRule(_localctx, 152, RULE_compositionKeyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case IDENTIFIER:
				{
				setState(987);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(988);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(991);
				compositionSkipRule();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(997);
			compositionComponent();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			tokenMatcher();
			setState(1000);
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

	public static class LocalIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TailspinParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public LocalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLocalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalIdentifierContext localIdentifier() throws RecognitionException {
		LocalIdentifierContext _localctx = new LocalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_localIdentifier);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				match(IDENTIFIER);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				keyword();
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

	public static class StateIdentifierContext extends ParserRuleContext {
		public TerminalNode STATE_IDENTIFIER() { return getToken(TailspinParser.STATE_IDENTIFIER, 0); }
		public StateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStateIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateIdentifierContext stateIdentifier() throws RecognitionException {
		StateIdentifierContext _localctx = new StateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(STATE_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalIdentifierContext extends ParserRuleContext {
		public List<LocalIdentifierContext> localIdentifier() {
			return getRuleContexts(LocalIdentifierContext.class);
		}
		public LocalIdentifierContext localIdentifier(int i) {
			return getRuleContext(LocalIdentifierContext.class,i);
		}
		public List<TerminalNode> Slash() { return getTokens(TailspinParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(TailspinParser.Slash, i);
		}
		public ExternalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitExternalIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalIdentifierContext externalIdentifier() throws RecognitionException {
		ExternalIdentifierContext _localctx = new ExternalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			localIdentifier();
			setState(1011); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1009);
					match(Slash);
					setState(1010);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1013); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyIdentifierContext extends ParserRuleContext {
		public StateIdentifierContext stateIdentifier() {
			return getRuleContext(StateIdentifierContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ExternalIdentifierContext externalIdentifier() {
			return getRuleContext(ExternalIdentifierContext.class,0);
		}
		public AnyIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAnyIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyIdentifierContext anyIdentifier() throws RecognitionException {
		AnyIdentifierContext _localctx = new AnyIdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_anyIdentifier);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1017);
				externalIdentifier();
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

	public static class ArithmeticContextKeywordContext extends ParserRuleContext {
		public TerminalNode First() { return getToken(TailspinParser.First, 0); }
		public TerminalNode Last() { return getToken(TailspinParser.Last, 0); }
		public ArithmeticContextKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticContextKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitArithmeticContextKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContextKeywordContext arithmeticContextKeyword() throws RecognitionException {
		ArithmeticContextKeywordContext _localctx = new ArithmeticContextKeywordContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_la = _input.LA(1);
			if ( !(_la==First || _la==Last) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(TailspinParser.Include, 0); }
		public TerminalNode Def() { return getToken(TailspinParser.Def, 0); }
		public TerminalNode StartTemplatesDefinition() { return getToken(TailspinParser.StartTemplatesDefinition, 0); }
		public TerminalNode StartSourceDefinition() { return getToken(TailspinParser.StartSourceDefinition, 0); }
		public TerminalNode StartSinkDefinition() { return getToken(TailspinParser.StartSinkDefinition, 0); }
		public TerminalNode StartComposerDefinition() { return getToken(TailspinParser.StartComposerDefinition, 0); }
		public TerminalNode StartProcessorDefinition() { return getToken(TailspinParser.StartProcessorDefinition, 0); }
		public TerminalNode StartOperatorDefinition() { return getToken(TailspinParser.StartOperatorDefinition, 0); }
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode StereotypeDefinition() { return getToken(TailspinParser.StereotypeDefinition, 0); }
		public TerminalNode Mod() { return getToken(TailspinParser.Mod, 0); }
		public TerminalNode Rule() { return getToken(TailspinParser.Rule, 0); }
		public TerminalNode When() { return getToken(TailspinParser.When, 0); }
		public TerminalNode Do() { return getToken(TailspinParser.Do, 0); }
		public TerminalNode Otherwise() { return getToken(TailspinParser.Otherwise, 0); }
		public ArithmeticContextKeywordContext arithmeticContextKeyword() {
			return getRuleContext(ArithmeticContextKeywordContext.class,0);
		}
		public TerminalNode StartTestDefinition() { return getToken(TailspinParser.StartTestDefinition, 0); }
		public TerminalNode Assert() { return getToken(TailspinParser.Assert, 0); }
		public TerminalNode With() { return getToken(TailspinParser.With, 0); }
		public TerminalNode Provided() { return getToken(TailspinParser.Provided, 0); }
		public TerminalNode Modified() { return getToken(TailspinParser.Modified, 0); }
		public TerminalNode Shadowed() { return getToken(TailspinParser.Shadowed, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public TerminalNode Use() { return getToken(TailspinParser.Use, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_keyword);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1025);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1026);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1027);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1028);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1029);
				match(StartOperatorDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1030);
				match(EndDefinition);
				}
				break;
			case StereotypeDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1031);
				match(StereotypeDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 11);
				{
				setState(1032);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 12);
				{
				setState(1033);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 13);
				{
				setState(1034);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 14);
				{
				setState(1035);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 15);
				{
				setState(1036);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 16);
				{
				setState(1037);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 17);
				{
				setState(1038);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 18);
				{
				setState(1039);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 19);
				{
				setState(1040);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 20);
				{
				setState(1041);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 21);
				{
				setState(1042);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 22);
				{
				setState(1043);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 23);
				{
				setState(1044);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 24);
				{
				setState(1045);
				match(Use);
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

	public static class TestBodyContext extends ParserRuleContext {
		public List<TestBlockContext> testBlock() {
			return getRuleContexts(TestBlockContext.class);
		}
		public TestBlockContext testBlock(int i) {
			return getRuleContext(TestBlockContext.class,i);
		}
		public TestBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestBodyContext testBody() throws RecognitionException {
		TestBodyContext _localctx = new TestBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_testBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1048);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1051); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public TestBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitTestBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestBlockContext testBlock() throws RecognitionException {
		TestBlockContext _localctx = new TestBlockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_testBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1053);
					statement();
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1060); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1059);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1062); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode Assert() { return getToken(TailspinParser.Assert, 0); }
		public ValueChainContext valueChain() {
			return getRuleContext(ValueChainContext.class,0);
		}
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(Assert);
			setState(1065);
			valueChain();
			setState(1066);
			matcher();
			setState(1067);
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

	public static class DependencyProvisionContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(TailspinParser.With, 0); }
		public TerminalNode Provided() { return getToken(TailspinParser.Provided, 0); }
		public List<ModuleConfigurationContext> moduleConfiguration() {
			return getRuleContexts(ModuleConfigurationContext.class);
		}
		public ModuleConfigurationContext moduleConfiguration(int i) {
			return getRuleContext(ModuleConfigurationContext.class,i);
		}
		public DependencyProvisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencyProvision; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitDependencyProvision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyProvisionContext dependencyProvision() throws RecognitionException {
		DependencyProvisionContext _localctx = new DependencyProvisionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(With);
			setState(1071); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1070);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1073); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1075);
			match(Provided);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleConfigurationContext extends ParserRuleContext {
		public ModuleConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleConfiguration; }
	 
		public ModuleConfigurationContext() { }
		public void copyFrom(ModuleConfigurationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InheritModuleContext extends ModuleConfigurationContext {
		public List<ModuleIdentifierContext> moduleIdentifier() {
			return getRuleContexts(ModuleIdentifierContext.class);
		}
		public ModuleIdentifierContext moduleIdentifier(int i) {
			return getRuleContext(ModuleIdentifierContext.class,i);
		}
		public TerminalNode Inherited() { return getToken(TailspinParser.Inherited, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public InheritModuleContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitInheritModule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleModificationContext extends ModuleConfigurationContext {
		public TerminalNode Modified() { return getToken(TailspinParser.Modified, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ModuleModificationContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleModification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleShadowingContext extends ModuleConfigurationContext {
		public TerminalNode Shadowed() { return getToken(TailspinParser.Shadowed, 0); }
		public List<ModuleIdentifierContext> moduleIdentifier() {
			return getRuleContexts(ModuleIdentifierContext.class);
		}
		public ModuleIdentifierContext moduleIdentifier(int i) {
			return getRuleContext(ModuleIdentifierContext.class,i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ModuleShadowingContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleShadowing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleImportContext extends ModuleConfigurationContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode StandAlone() { return getToken(TailspinParser.StandAlone, 0); }
		public DependencyProvisionContext dependencyProvision() {
			return getRuleContext(DependencyProvisionContext.class,0);
		}
		public ModuleIdentifierContext moduleIdentifier() {
			return getRuleContext(ModuleIdentifierContext.class,0);
		}
		public TerminalNode From() { return getToken(TailspinParser.From, 0); }
		public ModuleImportContext(ModuleConfigurationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleConfigurationContext moduleConfiguration() throws RecognitionException {
		ModuleConfigurationContext _localctx = new ModuleConfigurationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_moduleConfiguration);
		int _la;
		try {
			int _alt;
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1077);
					moduleIdentifier();
					setState(1078);
					match(From);
					}
					break;
				}
				setState(1082);
				match(Shadowed);
				setState(1083);
				moduleIdentifier();
				setState(1085);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1084);
					dependencyProvision();
					}
					break;
				}
				setState(1088); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1087);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1090); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1092);
				match(EndDefinition);
				setState(1093);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				moduleIdentifier();
				setState(1096);
				match(Inherited);
				setState(1099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1097);
					match(From);
					setState(1098);
					moduleIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ModuleModificationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1101);
					moduleIdentifier();
					setState(1102);
					match(From);
					}
					break;
				}
				setState(1106);
				match(Modified);
				setState(1107);
				stringLiteral();
				setState(1109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1108);
					dependencyProvision();
					}
					break;
				}
				setState(1112); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1111);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1114); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1116);
				match(EndDefinition);
				setState(1117);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || _la==Use || _la==IDENTIFIER) {
					{
					setState(1119);
					moduleIdentifier();
					setState(1120);
					match(From);
					}
				}

				setState(1124);
				stringLiteral();
				setState(1127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1125);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1126);
					dependencyProvision();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ModuleIdentifierContext extends ParserRuleContext {
		public TerminalNode CoreSystem() { return getToken(TailspinParser.CoreSystem, 0); }
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public ModuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitModuleIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleIdentifierContext moduleIdentifier() throws RecognitionException {
		ModuleIdentifierContext _localctx = new ModuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_moduleIdentifier);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				match(CoreSystem);
				}
				break;
			case Include:
			case Def:
			case When:
			case Do:
			case Otherwise:
			case StereotypeDefinition:
			case StartTemplatesDefinition:
			case StartSourceDefinition:
			case StartSinkDefinition:
			case StartComposerDefinition:
			case StartProcessorDefinition:
			case StartOperatorDefinition:
			case EndDefinition:
			case Rule:
			case First:
			case Last:
			case Mod:
			case StartTestDefinition:
			case Assert:
			case With:
			case Provided:
			case Modified:
			case Shadowed:
			case From:
			case Use:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				localIdentifier();
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

	public static class UseModuleContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(TailspinParser.Use, 0); }
		public ModuleConfigurationContext moduleConfiguration() {
			return getRuleContext(ModuleConfigurationContext.class,0);
		}
		public UseModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useModule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitUseModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseModuleContext useModule() throws RecognitionException {
		UseModuleContext _localctx = new UseModuleContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(Use);
			setState(1136);
			moduleConfiguration();
			}
		}
		catch (RecognitionException re) {
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
		case 55:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0475\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\7\2\u00ba\n\2\f"+
		"\2\16\2\u00bd\13\2\3\2\7\2\u00c0\n\2\f\2\16\2\u00c3\13\2\3\2\3\2\7\2\u00c7"+
		"\n\2\f\2\16\2\u00ca\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00d2\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e2\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00eb\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f4"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00fd\n\4\f\4\16\4\u0100\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u010b\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\u0117\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0120\n"+
		"\6\6\6\u0122\n\6\r\6\16\6\u0123\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u0134\n\7\3\b\3\b\5\b\u0138\n\b\3\b\3\b\5\b\u013c"+
		"\n\b\3\b\5\b\u013f\n\b\3\b\3\b\3\b\3\b\5\b\u0145\n\b\3\t\3\t\3\t\3\t\5"+
		"\t\u014b\n\t\3\t\7\t\u014e\n\t\f\t\16\t\u0151\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0158\n\n\3\13\3\13\3\13\7\13\u015d\n\13\f\13\16\13\u0160\13\13\3"+
		"\f\3\f\5\f\u0164\n\f\3\r\3\r\3\r\5\r\u0169\n\r\3\16\3\16\3\16\3\16\7\16"+
		"\u016f\n\16\f\16\16\16\u0172\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u017c\n\17\f\17\16\17\u017f\13\17\3\17\3\17\5\17\u0183\n\17"+
		"\3\20\3\20\5\20\u0187\n\20\3\21\3\21\3\21\3\21\7\21\u018d\n\21\f\21\16"+
		"\21\u0190\13\21\5\21\u0192\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0199\n"+
		"\22\f\22\16\22\u019c\13\22\3\22\3\22\3\23\3\23\5\23\u01a2\n\23\3\24\3"+
		"\24\3\24\5\24\u01a7\n\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u01af\n\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01b5\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01bc"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c3\n\26\3\26\3\26\5\26\u01c7\n"+
		"\26\3\27\3\27\3\27\3\27\7\27\u01cd\n\27\f\27\16\27\u01d0\13\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\5\30\u01d8\n\30\3\30\5\30\u01db\n\30\3\30\5\30"+
		"\u01de\n\30\3\31\3\31\3\31\5\31\u01e3\n\31\3\31\5\31\u01e6\n\31\3\32\3"+
		"\32\3\32\3\32\5\32\u01ec\n\32\6\32\u01ee\n\32\r\32\16\32\u01ef\3\32\3"+
		"\32\3\33\3\33\3\33\5\33\u01f7\n\33\3\34\3\34\7\34\u01fb\n\34\f\34\16\34"+
		"\u01fe\13\34\3\34\6\34\u0201\n\34\r\34\16\34\u0202\5\34\u0205\n\34\3\35"+
		"\3\35\3\35\3\35\5\35\u020b\n\35\3\35\3\35\5\35\u020f\n\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0215\n\35\3\36\6\36\u0218\n\36\r\36\16\36\u0219\3\36\3"+
		"\36\5\36\u021e\n\36\3\37\3\37\3\37\3\37\5\37\u0224\n\37\3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0232\n#\3#\3#\3$\3$\5$\u0238\n$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0245\n%\3&\3&\3&\5&\u024a\n&\3&\3&\5&\u024e"+
		"\n&\5&\u0250\n&\3\'\3\'\5\'\u0254\n\'\3\'\3\'\3\'\7\'\u0259\n\'\f\'\16"+
		"\'\u025c\13\'\3\'\3\'\3(\3(\5(\u0262\n(\3(\7(\u0265\n(\f(\16(\u0268\13"+
		"(\3)\3)\3)\3)\3)\3)\5)\u0270\n)\7)\u0272\n)\f)\16)\u0275\13)\3)\5)\u0278"+
		"\n)\3)\5)\u027b\n)\3)\3)\3)\5)\u0280\n)\3)\3)\7)\u0284\n)\f)\16)\u0287"+
		"\13)\3)\5)\u028a\n)\3)\5)\u028d\n)\3)\3)\3)\3)\5)\u0293\n)\3)\3)\5)\u0297"+
		"\n)\3)\3)\5)\u029b\n)\5)\u029d\n)\3*\3*\5*\u02a1\n*\3+\3+\5+\u02a5\n+"+
		"\3,\3,\3,\3-\5-\u02ab\n-\3-\3-\5-\u02af\n-\3.\3.\3.\3.\3.\3/\3/\3/\5/"+
		"\u02b9\n/\3/\5/\u02bc\n/\3\60\5\60\u02bf\n\60\3\60\3\60\3\60\5\60\u02c4"+
		"\n\60\3\61\5\61\u02c7\n\61\3\61\3\61\5\61\u02cb\n\61\3\61\3\61\5\61\u02cf"+
		"\n\61\3\62\3\62\5\62\u02d3\n\62\3\63\5\63\u02d6\n\63\3\63\3\63\3\64\3"+
		"\64\7\64\u02dc\n\64\f\64\16\64\u02df\13\64\3\64\3\64\3\65\3\65\5\65\u02e5"+
		"\n\65\3\66\3\66\5\66\u02e9\n\66\3\67\3\67\3\67\3\67\38\38\58\u02f1\n8"+
		"\38\38\58\u02f5\n8\38\58\u02f8\n8\38\38\58\u02fc\n8\38\58\u02ff\n8\38"+
		"\38\58\u0303\n8\38\38\39\39\39\39\39\39\39\59\u030e\n9\39\39\39\59\u0313"+
		"\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u0325\n9\f9\16"+
		"9\u0328\139\3:\3:\3:\3:\5:\u032e\n:\3:\3:\3:\3:\5:\u0334\n:\5:\u0336\n"+
		":\3;\3;\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\5?\u0348\n?\3@\5@\u034b"+
		"\n@\3@\3@\7@\u034f\n@\f@\16@\u0352\13@\3A\3A\3A\3A\3B\3B\6B\u035a\nB\r"+
		"B\16B\u035b\5B\u035e\nB\3C\7C\u0361\nC\fC\16C\u0364\13C\3C\3C\5C\u0368"+
		"\nC\3C\5C\u036b\nC\3D\3D\5D\u036f\nD\3D\7D\u0372\nD\fD\16D\u0375\13D\3"+
		"E\3E\3E\3E\5E\u037b\nE\3E\3E\3E\3E\5E\u0381\nE\3E\3E\3E\5E\u0386\nE\3"+
		"F\7F\u0389\nF\fF\16F\u038c\13F\3F\3F\5F\u0390\nF\3F\5F\u0393\nF\3G\3G"+
		"\5G\u0397\nG\3G\7G\u039a\nG\fG\16G\u039d\13G\3H\3H\5H\u03a1\nH\3H\3H\3"+
		"H\7H\u03a6\nH\fH\16H\u03a9\13H\3H\3H\5H\u03ad\nH\3I\3I\3I\5I\u03b2\nI"+
		"\3J\3J\3J\5J\u03b7\nJ\3K\3K\3K\3K\3K\3K\5K\u03bf\nK\5K\u03c1\nK\3L\3L"+
		"\6L\u03c5\nL\rL\16L\u03c6\3L\3L\3M\3M\3M\3M\5M\u03cf\nM\3M\3M\3M\3M\5"+
		"M\u03d5\nM\3M\3M\5M\u03d9\nM\3M\5M\u03dc\nM\3N\3N\5N\u03e0\nN\3N\7N\u03e3"+
		"\nN\fN\16N\u03e6\13N\3N\3N\3O\3O\3O\3P\3P\5P\u03ef\nP\3Q\3Q\3R\3R\3R\6"+
		"R\u03f6\nR\rR\16R\u03f7\3S\3S\3S\5S\u03fd\nS\3T\3T\3U\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0419\nU\3V\6"+
		"V\u041c\nV\rV\16V\u041d\3W\7W\u0421\nW\fW\16W\u0424\13W\3W\6W\u0427\n"+
		"W\rW\16W\u0428\3X\3X\3X\3X\3X\3Y\3Y\6Y\u0432\nY\rY\16Y\u0433\3Y\3Y\3Z"+
		"\3Z\3Z\5Z\u043b\nZ\3Z\3Z\3Z\5Z\u0440\nZ\3Z\6Z\u0443\nZ\rZ\16Z\u0444\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u044e\nZ\3Z\3Z\3Z\5Z\u0453\nZ\3Z\3Z\3Z\5Z\u0458"+
		"\nZ\3Z\6Z\u045b\nZ\rZ\16Z\u045c\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0465\nZ\3Z\3Z\3"+
		"Z\5Z\u046a\nZ\5Z\u046c\nZ\3[\3[\5[\u0470\n[\3\\\3\\\3\\\3\\\2\3p]\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\6\3\2\"$\3\2./\3\2"+
		"\60\62\3\2*+\2\u04f8\2\u00bb\3\2\2\2\4\u00cd\3\2\2\2\6\u0116\3\2\2\2\b"+
		"\u0118\3\2\2\2\n\u011b\3\2\2\2\f\u0133\3\2\2\2\16\u0144\3\2\2\2\20\u014a"+
		"\3\2\2\2\22\u0152\3\2\2\2\24\u0159\3\2\2\2\26\u0163\3\2\2\2\30\u0168\3"+
		"\2\2\2\32\u016a\3\2\2\2\34\u0182\3\2\2\2\36\u0186\3\2\2\2 \u0188\3\2\2"+
		"\2\"\u0195\3\2\2\2$\u01a1\3\2\2\2&\u01a6\3\2\2\2(\u01a8\3\2\2\2*\u01c6"+
		"\3\2\2\2,\u01c8\3\2\2\2.\u01d3\3\2\2\2\60\u01df\3\2\2\2\62\u01e7\3\2\2"+
		"\2\64\u01f3\3\2\2\2\66\u0204\3\2\2\28\u0214\3\2\2\2:\u021d\3\2\2\2<\u0223"+
		"\3\2\2\2>\u0225\3\2\2\2@\u0228\3\2\2\2B\u022a\3\2\2\2D\u0231\3\2\2\2F"+
		"\u0237\3\2\2\2H\u0244\3\2\2\2J\u024f\3\2\2\2L\u0251\3\2\2\2N\u0261\3\2"+
		"\2\2P\u029c\3\2\2\2R\u02a0\3\2\2\2T\u02a2\3\2\2\2V\u02a6\3\2\2\2X\u02aa"+
		"\3\2\2\2Z\u02b0\3\2\2\2\\\u02b8\3\2\2\2^\u02be\3\2\2\2`\u02c6\3\2\2\2"+
		"b\u02d2\3\2\2\2d\u02d5\3\2\2\2f\u02d9\3\2\2\2h\u02e4\3\2\2\2j\u02e8\3"+
		"\2\2\2l\u02ea\3\2\2\2n\u02ee\3\2\2\2p\u0312\3\2\2\2r\u0335\3\2\2\2t\u0337"+
		"\3\2\2\2v\u0339\3\2\2\2x\u033b\3\2\2\2z\u033f\3\2\2\2|\u0347\3\2\2\2~"+
		"\u034a\3\2\2\2\u0080\u0353\3\2\2\2\u0082\u035d\3\2\2\2\u0084\u0362\3\2"+
		"\2\2\u0086\u036c\3\2\2\2\u0088\u0385\3\2\2\2\u008a\u038a\3\2\2\2\u008c"+
		"\u0396\3\2\2\2\u008e\u039e\3\2\2\2\u0090\u03b1\3\2\2\2\u0092\u03b3\3\2"+
		"\2\2\u0094\u03c0\3\2\2\2\u0096\u03c2\3\2\2\2\u0098\u03db\3\2\2\2\u009a"+
		"\u03df\3\2\2\2\u009c\u03e9\3\2\2\2\u009e\u03ee\3\2\2\2\u00a0\u03f0\3\2"+
		"\2\2\u00a2\u03f2\3\2\2\2\u00a4\u03fc\3\2\2\2\u00a6\u03fe\3\2\2\2\u00a8"+
		"\u0418\3\2\2\2\u00aa\u041b\3\2\2\2\u00ac\u0422\3\2\2\2\u00ae\u042a\3\2"+
		"\2\2\u00b0\u042f\3\2\2\2\u00b2\u046b\3\2\2\2\u00b4\u046f\3\2\2\2\u00b6"+
		"\u0471\3\2\2\2\u00b8\u00ba\5\u00b6\\\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c1\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c0\5\4\3\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c8\5\6\4\2\u00c5\u00c7\5\6\4\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\2\2\3\u00cc\3\3\2\2\2"+
		"\u00cd\u00d1\7\4\2\2\u00ce\u00cf\5\u009eP\2\u00cf\u00d0\7@\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\5f\64\2\u00d4\5\3\2\2\2\u00d5\u00d6\7\6\2\2\u00d6\u00d7\5\b\5\2"+
		"\u00d7\u00d8\5\36\20\2\u00d8\u00d9\7\25\2\2\u00d9\u0117\3\2\2\2\u00da"+
		"\u00db\5H%\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5.\30\2\u00dd\u0117\3\2"+
		"\2\2\u00de\u00df\t\2\2\2\u00df\u00e1\5\u009eP\2\u00e0\u00e2\5\n\6\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\66"+
		"\34\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\5\u009eP\2\u00e6\u0117\3\2\2\2\u00e7"+
		"\u00e8\7&\2\2\u00e8\u00ea\5\u009eP\2\u00e9\u00eb\5\n\6\2\u00ea\u00e9\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5:\36\2\u00ed"+
		"\u00ee\7(\2\2\u00ee\u00ef\5\u009eP\2\u00ef\u0117\3\2\2\2\u00f0\u00f1\7"+
		"%\2\2\u00f1\u00f3\5\u009eP\2\u00f2\u00f4\5\n\6\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5~@\2\u00f6\u00f7\7(\2"+
		"\2\u00f7\u00f8\5\u009eP\2\u00f8\u0117\3\2\2\2\u00f9\u00fa\78\2\2\u00fa"+
		"\u00fe\5f\64\2\u00fb\u00fd\5\u00b6\\\2\u00fc\u00fb\3\2\2\2\u00fd\u0100"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\5\u00aaV\2\u0102\u0103\7(\2\2\u0103\u0104\5"+
		"f\64\2\u0104\u0117\3\2\2\2\u0105\u0106\7\'\2\2\u0106\u0107\7\31\2\2\u0107"+
		"\u0108\5\u009eP\2\u0108\u010a\5\u009eP\2\u0109\u010b\5\n\6\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\u009eP"+
		"\2\u010d\u010e\7\32\2\2\u010e\u010f\5\66\34\2\u010f\u0110\7(\2\2\u0110"+
		"\u0111\5\u009eP\2\u0111\u0117\3\2\2\2\u0112\u0113\7\n\2\2\u0113\u0114"+
		"\5\u009eP\2\u0114\u0115\5L\'\2\u0115\u0117\3\2\2\2\u0116\u00d5\3\2\2\2"+
		"\u0116\u00da\3\2\2\2\u0116\u00de\3\2\2\2\u0116\u00e7\3\2\2\2\u0116\u00f0"+
		"\3\2\2\2\u0116\u00f9\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u0112\3\2\2\2\u0117"+
		"\7\3\2\2\2\u0118\u0119\5\u009eP\2\u0119\u011a\7\21\2\2\u011a\t\3\2\2\2"+
		"\u011b\u011c\7\17\2\2\u011c\u0121\7\35\2\2\u011d\u011f\5\b\5\2\u011e\u0120"+
		"\7\26\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2"+
		"\u0121\u011d\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\36\2\2\u0126\13\3\2\2\2\u0127"+
		"\u0134\5\16\b\2\u0128\u0134\5f\64\2\u0129\u0134\5`\61\2\u012a\u0134\5"+
		"\34\17\2\u012b\u0134\5 \21\2\u012c\u0134\5\"\22\2\u012d\u012e\7\31\2\2"+
		"\u012e\u012f\5(\25\2\u012f\u0130\7\32\2\2\u0130\u0134\3\2\2\2\u0131\u0134"+
		"\5p9\2\u0132\u0134\5z>\2\u0133\u0127\3\2\2\2\u0133\u0128\3\2\2\2\u0133"+
		"\u0129\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2"+
		"\2\2\u0133\u012d\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\r\3\2\2\2\u0135\u0137\7\r\2\2\u0136\u0138\5\u00a4S\2\u0137\u0136\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\5\20\t\2\u013a"+
		"\u013c\7\22\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3"+
		"\2\2\2\u013d\u013f\5\62\32\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0145\3\2\2\2\u0140\u0141\7\16\2\2\u0141\u0142\5\u00a0Q\2\u0142\u0143"+
		"\5\20\t\2\u0143\u0145\3\2\2\2\u0144\u0135\3\2\2\2\u0144\u0140\3\2\2\2"+
		"\u0145\17\3\2\2\2\u0146\u0147\7\31\2\2\u0147\u0148\5\24\13\2\u0148\u0149"+
		"\7\32\2\2\u0149\u014b\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014f\3\2\2\2\u014c\u014e\5\22\n\2\u014d\u014c\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\21\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0157\7\23\2\2\u0153\u0154\7\31\2\2\u0154\u0155\5"+
		"\24\13\2\u0155\u0156\7\32\2\2\u0156\u0158\3\2\2\2\u0157\u0153\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\23\3\2\2\2\u0159\u015e\5\26\f\2\u015a\u015b"+
		"\7\25\2\2\u015b\u015d\5\26\f\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\25\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\5\30\r\2\u0162\u0164\5\32\16\2\u0163\u0161\3\2\2"+
		"\2\u0163\u0162\3\2\2\2\u0164\27\3\2\2\2\u0165\u0169\5\16\b\2\u0166\u0169"+
		"\5p9\2\u0167\u0169\5`\61\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\31\3\2\2\2\u016a\u016b\7\33\2\2\u016b\u0170\5\30"+
		"\r\2\u016c\u016d\7\26\2\2\u016d\u016f\5\30\r\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\34\2\2\u0174\33\3\2\2\2\u0175\u0176"+
		"\7\33\2\2\u0176\u0183\7\34\2\2\u0177\u0178\7\33\2\2\u0178\u017d\5\36\20"+
		"\2\u0179\u017a\7\26\2\2\u017a\u017c\5\36\20\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\34\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0175\3\2\2\2\u0182\u0177\3\2\2\2\u0183\35\3\2\2\2\u0184\u0187\5B\"\2"+
		"\u0185\u0187\5H%\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\37\3"+
		"\2\2\2\u0188\u0191\7\35\2\2\u0189\u018e\5&\24\2\u018a\u018b\7\26\2\2\u018b"+
		"\u018d\5&\24\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0189\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\36"+
		"\2\2\u0194!\3\2\2\2\u0195\u0196\7\37\2\2\u0196\u019a\5$\23\2\u0197\u0199"+
		"\5$\23\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7R"+
		"\2\2\u019e#\3\2\2\2\u019f\u01a2\7P\2\2\u01a0\u01a2\5x=\2\u01a1\u019f\3"+
		"\2\2\2\u01a1\u01a0\3\2\2\2\u01a2%\3\2\2\2\u01a3\u01a7\5(\25\2\u01a4\u01a7"+
		"\5\36\20\2\u01a5\u01a7\5\16\b\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2"+
		"\2\u01a6\u01a5\3\2\2\2\u01a7\'\3\2\2\2\u01a8\u01a9\5\b\5\2\u01a9\u01aa"+
		"\5\36\20\2\u01aa)\3\2\2\2\u01ab\u01c7\5\f\7\2\u01ac\u01ae\7!\2\2\u01ad"+
		"\u01af\5\u009eP\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\7\31\2\2\u01b1\u01b2\5\66\34\2\u01b2\u01b4\7!\2\2"+
		"\u01b3\u01b5\5\u009eP\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\7\32\2\2\u01b7\u01c7\3\2\2\2\u01b8\u01c7\5"+
		"\60\31\2\u01b9\u01bb\7!\2\2\u01ba\u01bc\5\u009eP\2\u01bb\u01ba\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\5,\27\2\u01be\u01bf"+
		"\7\31\2\2\u01bf\u01c0\5\66\34\2\u01c0\u01c2\7!\2\2\u01c1\u01c3\5\u009e"+
		"P\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\7\32\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01ab\3\2\2\2\u01c6\u01ac\3"+
		"\2\2\2\u01c6\u01b8\3\2\2\2\u01c6\u01b9\3\2\2\2\u01c7+\3\2\2\2\u01c8\u01c9"+
		"\7\33\2\2\u01c9\u01ce\5\u009eP\2\u01ca\u01cb\7\25\2\2\u01cb\u01cd\5\u009e"+
		"P\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\34"+
		"\2\2\u01d2-\3\2\2\2\u01d3\u01dd\7\f\2\2\u01d4\u01d5\5\u00a4S\2\u01d5\u01d7"+
		"\5\20\t\2\u01d6\u01d8\7\22\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2"+
		"\u01d8\u01da\3\2\2\2\u01d9\u01db\5\62\32\2\u01da\u01d9\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01de\7\5\2\2\u01dd\u01d4\3\2\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de/\3\2\2\2\u01df\u01e0\5\u00a4S\2\u01e0\u01e2\5\20"+
		"\t\2\u01e1\u01e3\7\22\2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e6\5\62\32\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3"+
		"\2\2\2\u01e6\61\3\2\2\2\u01e7\u01e8\7\17\2\2\u01e8\u01ed\7\35\2\2\u01e9"+
		"\u01eb\5\64\33\2\u01ea\u01ec\7\26\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\7\36"+
		"\2\2\u01f2\63\3\2\2\2\u01f3\u01f6\5\b\5\2\u01f4\u01f7\5H%\2\u01f5\u01f7"+
		"\5\60\31\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\65\3\2\2\2\u01f8"+
		"\u01fc\5:\36\2\u01f9\u01fb\58\35\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0205\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0201\58\35\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u01f8\3\2\2\2\u0204\u0200\3\2\2\2\u0205\67\3\2\2\2\u0206\u0207\5L\'\2"+
		"\u0207\u0208\5:\36\2\u0208\u0215\3\2\2\2\u0209\u020b\7\7\2\2\u020a\u0209"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\5L\'\2\u020d"+
		"\u020f\7\b\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2"+
		"\2\2\u0210\u0211\5:\36\2\u0211\u0215\3\2\2\2\u0212\u0213\7\t\2\2\u0213"+
		"\u0215\5:\36\2\u0214\u0206\3\2\2\2\u0214\u020a\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u02159\3\2\2\2\u0216\u0218\5<\37\2\u0217\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021e\3\2\2\2\u021b"+
		"\u021c\7\f\2\2\u021c\u021e\7\5\2\2\u021d\u0217\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e;\3\2\2\2\u021f\u0224\5@!\2\u0220\u0224\5D#\2\u0221\u0224\5"+
		"B\"\2\u0222\u0224\5> \2\u0223\u021f\3\2\2\2\u0223\u0220\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224=\3\2\2\2\u0225\u0226\5H%\2\u0226"+
		"\u0227\7\f\2\2\u0227?\3\2\2\2\u0228\u0229\5\6\4\2\u0229A\3\2\2\2\u022a"+
		"\u022b\5H%\2\u022b\u022c\7\13\2\2\u022c\u022d\7,\2\2\u022dC\3\2\2\2\u022e"+
		"\u022f\5H%\2\u022f\u0230\7\13\2\2\u0230\u0232\3\2\2\2\u0231\u022e\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\5F$\2\u0234E"+
		"\3\2\2\2\u0235\u0236\7-\2\2\u0236\u0238\7\65\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5\u00a0Q\2\u023a\u023b"+
		"\5\20\t\2\u023b\u023c\7\21\2\2\u023c\u023d\5\36\20\2\u023d\u023e\7\25"+
		"\2\2\u023eG\3\2\2\2\u023f\u0245\5\f\7\2\u0240\u0241\5\f\7\2\u0241\u0242"+
		"\5J&\2\u0242\u0245\3\2\2\2\u0243\u0245\5(\25\2\u0244\u023f\3\2\2\2\u0244"+
		"\u0240\3\2\2\2\u0244\u0243\3\2\2\2\u0245I\3\2\2\2\u0246\u0247\7\13\2\2"+
		"\u0247\u0249\5*\26\2\u0248\u024a\5J&\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u0250\3\2\2\2\u024b\u024d\7\27\2\2\u024c\u024e\5J&\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0246\3\2"+
		"\2\2\u024f\u024b\3\2\2\2\u0250K\3\2\2\2\u0251\u0253\7 \2\2\u0252\u0254"+
		"\7\30\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2"+
		"\u0255\u025a\5N(\2\u0256\u0257\7\65\2\2\u0257\u0259\5N(\2\u0258\u0256"+
		"\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\7\66\2\2\u025eM\3\2\2\2"+
		"\u025f\u0262\5V,\2\u0260\u0262\5P)\2\u0261\u025f\3\2\2\2\u0261\u0260\3"+
		"\2\2\2\u0261\u0262\3\2\2\2\u0262\u0266\3\2\2\2\u0263\u0265\5Z.\2\u0264"+
		"\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2"+
		"\2\2\u0267O\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u029d\5X-\2\u026a\u029d"+
		"\5f\64\2\u026b\u0273\7\35\2\2\u026c\u026d\5\b\5\2\u026d\u026f\5R*\2\u026e"+
		"\u0270\7\26\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3"+
		"\2\2\2\u0271\u026c\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u027a\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0278\7\26"+
		"\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027b\7\5\2\2\u027a\u0277\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u029d\7\36\2\2\u027d\u027f\7\33\2\2\u027e\u0280\5T+\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0285\3\2\2\2\u0281\u0282\7\26"+
		"\2\2\u0282\u0284\5T+\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283"+
		"\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028c\3\2\2\2\u0287\u0285\3\2\2\2\u0288"+
		"\u028a\7\26\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3"+
		"\2\2\2\u028b\u028d\7\5\2\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0296\7\34\2\2\u028f\u0292\7\31\2\2\u0290\u0293\5"+
		"X-\2\u0291\u0293\5p9\2\u0292\u0290\3\2\2\2\u0292\u0291\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\7\32\2\2\u0295\u0297\3\2\2\2\u0296\u028f\3\2\2\2"+
		"\u0296\u0297\3\2\2\2\u0297\u029d\3\2\2\2\u0298\u029b\5\u009eP\2\u0299"+
		"\u029b\5\u00a2R\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029b\u029d"+
		"\3\2\2\2\u029c\u0269\3\2\2\2\u029c\u026a\3\2\2\2\u029c\u026b\3\2\2\2\u029c"+
		"\u027d\3\2\2\2\u029c\u029a\3\2\2\2\u029dQ\3\2\2\2\u029e\u02a1\5L\'\2\u029f"+
		"\u02a1\7\5\2\2\u02a0\u029e\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1S\3\2\2\2"+
		"\u02a2\u02a4\5L\'\2\u02a3\u02a5\5\u0094K\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5"+
		"\3\2\2\2\u02a5U\3\2\2\2\u02a6\u02a7\7\64\2\2\u02a7\u02a8\5\f\7\2\u02a8"+
		"W\3\2\2\2\u02a9\u02ab\5\\/\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ae\7-\2\2\u02ad\u02af\5^\60\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02afY\3\2\2\2\u02b0\u02b1\7\67\2\2\u02b1\u02b2"+
		"\5H%\2\u02b2\u02b3\5L\'\2\u02b3\u02b4\7\32\2\2\u02b4[\3\2\2\2\u02b5\u02b9"+
		"\5\16\b\2\u02b6\u02b9\5p9\2\u02b7\u02b9\5f\64\2\u02b8\u02b5\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02bc\7\30"+
		"\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc]\3\2\2\2\u02bd\u02bf"+
		"\7\30\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c3\3\2\2\2"+
		"\u02c0\u02c4\5\16\b\2\u02c1\u02c4\5p9\2\u02c2\u02c4\5f\64\2\u02c3\u02c0"+
		"\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4_\3\2\2\2\u02c5"+
		"\u02c7\5\\/\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02ca\7-\2\2\u02c9\u02cb\5^\60\2\u02ca\u02c9\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02cd\7\21\2\2\u02cd\u02cf\5"+
		"p9\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfa\3\2\2\2\u02d0\u02d3"+
		"\7C\2\2\u02d1\u02d3\5d\63\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3"+
		"c\3\2\2\2\u02d4\u02d6\5t;\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\7D\2\2\u02d8e\3\2\2\2\u02d9\u02dd\7E\2\2\u02da"+
		"\u02dc\5h\65\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0"+
		"\u02e1\7O\2\2\u02e1g\3\2\2\2\u02e2\u02e5\5j\66\2\u02e3\u02e5\7N\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5i\3\2\2\2\u02e6\u02e9\5n8\2\u02e7"+
		"\u02e9\5l\67\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9k\3\2\2\2"+
		"\u02ea\u02eb\7L\2\2\u02eb\u02ec\5p9\2\u02ec\u02ed\7\24\2\2\u02edm\3\2"+
		"\2\2\u02ee\u02fb\7M\2\2\u02ef\u02f1\5\u00a4S\2\u02f0\u02ef\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\5\20\t\2\u02f3\u02f5\7"+
		"\22\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02f8\5\62\32\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fc\3"+
		"\2\2\2\u02f9\u02fa\7\21\2\2\u02fa\u02fc\5\f\7\2\u02fb\u02f0\3\2\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ff\5J&\2\u02fe\u02fd\3\2\2"+
		"\2\u02fe\u02ff\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u0301\7\13\2\2\u0301"+
		"\u0303\7,\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0305\7\24\2\2\u0305o\3\2\2\2\u0306\u0307\b9\1\2\u0307\u0313"+
		"\5b\62\2\u0308\u0309\7\31\2\2\u0309\u030a\5p9\2\u030a\u030b\7\32\2\2\u030b"+
		"\u0313\3\2\2\2\u030c\u030e\5t;\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u030f\3\2\2\2\u030f\u0313\5\16\b\2\u0310\u0313\5\u00a6T\2\u0311"+
		"\u0313\5r:\2\u0312\u0306\3\2\2\2\u0312\u0308\3\2\2\2\u0312\u030d\3\2\2"+
		"\2\u0312\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0313\u0326\3\2\2\2\u0314\u0315"+
		"\f\b\2\2\u0315\u0316\5v<\2\u0316\u0317\5p9\t\u0317\u0325\3\2\2\2\u0318"+
		"\u0319\f\7\2\2\u0319\u031a\5t;\2\u031a\u031b\5p9\b\u031b\u0325\3\2\2\2"+
		"\u031c\u031d\f\5\2\2\u031d\u031e\5v<\2\u031e\u031f\5x=\2\u031f\u0325\3"+
		"\2\2\2\u0320\u0321\f\4\2\2\u0321\u0322\5t;\2\u0322\u0323\5x=\2\u0323\u0325"+
		"\3\2\2\2\u0324\u0314\3\2\2\2\u0324\u0318\3\2\2\2\u0324\u031c\3\2\2\2\u0324"+
		"\u0320\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327q\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\5x=\2\u032a\u032d"+
		"\5v<\2\u032b\u032e\5x=\2\u032c\u032e\5p9\2\u032d\u032b\3\2\2\2\u032d\u032c"+
		"\3\2\2\2\u032e\u0336\3\2\2\2\u032f\u0330\5x=\2\u0330\u0333\5t;\2\u0331"+
		"\u0334\5x=\2\u0332\u0334\5p9\2\u0333\u0331\3\2\2\2\u0333\u0332\3\2\2\2"+
		"\u0334\u0336\3\2\2\2\u0335\u0329\3\2\2\2\u0335\u032f\3\2\2\2\u0336s\3"+
		"\2\2\2\u0337\u0338\t\3\2\2\u0338u\3\2\2\2\u0339\u033a\t\4\2\2\u033aw\3"+
		"\2\2\2\u033b\u033c\7\31\2\2\u033c\u033d\5\36\20\2\u033d\u033e\7\32\2\2"+
		"\u033ey\3\2\2\2\u033f\u0340\7\31\2\2\u0340\u0341\5|?\2\u0341\u0342\5\60"+
		"\31\2\u0342\u0343\5|?\2\u0343\u0344\7\32\2\2\u0344{\3\2\2\2\u0345\u0348"+
		"\5\f\7\2\u0346\u0348\5x=\2\u0347\u0345\3\2\2\2\u0347\u0346\3\2\2\2\u0348"+
		"}\3\2\2\2\u0349\u034b\5D#\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u0350\5\u0082B\2\u034d\u034f\5\u0080A\2\u034e\u034d"+
		"\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\177\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7)\2\2\u0354\u0355\5\b\5"+
		"\2\u0355\u0356\5\u0082B\2\u0356\u0081\3\2\2\2\u0357\u035e\5\u0084C\2\u0358"+
		"\u035a\5\u0096L\2\u0359\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u0357\3\2\2\2\u035d"+
		"\u0359\3\2\2\2\u035e\u0083\3\2\2\2\u035f\u0361\5\u0096L\2\u0360\u035f"+
		"\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u036a\5\u0086D\2\u0366\u0368"+
		"\7\26\2\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2"+
		"\u0369\u036b\5\u0084C\2\u036a\u0367\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u0085\3\2\2\2\u036c\u036e\5\u0088E\2\u036d\u036f\5J&\2\u036e\u036d\3"+
		"\2\2\2\u036e\u036f\3\2\2\2\u036f\u0373\3\2\2\2\u0370\u0372\5\u0096L\2"+
		"\u0371\u0370\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374"+
		"\3\2\2\2\u0374\u0087\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0386\5\u008eH"+
		"\2\u0377\u037a\7\33\2\2\u0378\u037b\5\u0082B\2\u0379\u037b\5\u0096L\2"+
		"\u037a\u0378\3\2\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u0386\7\34\2\2\u037d\u0380\7\35\2\2\u037e\u0381\5\u008a"+
		"F\2\u037f\u0381\5\u0096L\2\u0380\u037e\3\2\2\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0386\7\36\2\2\u0383\u0386\5"+
		"\16\b\2\u0384\u0386\5\u009aN\2\u0385\u0376\3\2\2\2\u0385\u0377\3\2\2\2"+
		"\u0385\u037d\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386\u0089"+
		"\3\2\2\2\u0387\u0389\5\u0096L\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2"+
		"\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a"+
		"\3\2\2\2\u038d\u0392\5\u008cG\2\u038e\u0390\7\26\2\2\u038f\u038e\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\5\u008aF\2\u0392"+
		"\u038f\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u008b\3\2\2\2\u0394\u0397\5\u008e"+
		"H\2\u0395\u0397\5\u009aN\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397"+
		"\u039b\3\2\2\2\u0398\u039a\5\u0096L\2\u0399\u0398\3\2\2\2\u039a\u039d"+
		"\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u008d\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u03a0\7 \2\2\u039f\u03a1\7\30\2\2\u03a0\u039f\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a7\5\u0090I\2\u03a3"+
		"\u03a4\7\65\2\2\u03a4\u03a6\5\u0090I\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9"+
		"\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03aa\u03ac\7\66\2\2\u03ab\u03ad\5\u0094K\2\u03ac\u03ab"+
		"\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u008f\3\2\2\2\u03ae\u03b2\5\u0092J"+
		"\2\u03af\u03b2\5\u009eP\2\u03b0\u03b2\5f\64\2\u03b1\u03ae\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2\u0091\3\2\2\2\u03b3\u03b6\7\64"+
		"\2\2\u03b4\u03b7\5\16\b\2\u03b5\u03b7\5f\64\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u0093\3\2\2\2\u03b8\u03c1\7.\2\2\u03b9\u03c1\7\60"+
		"\2\2\u03ba\u03c1\7\63\2\2\u03bb\u03be\7\64\2\2\u03bc\u03bf\7D\2\2\u03bd"+
		"\u03bf\5\16\b\2\u03be\u03bc\3\2\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c1\3"+
		"\2\2\2\u03c0\u03b8\3\2\2\2\u03c0\u03b9\3\2\2\2\u03c0\u03ba\3\2\2\2\u03c0"+
		"\u03bb\3\2\2\2\u03c1\u0095\3\2\2\2\u03c2\u03c4\7\31\2\2\u03c3\u03c5\5"+
		"\u0098M\2\u03c4\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c4\3\2\2\2"+
		"\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\7\32\2\2\u03c9\u0097"+
		"\3\2\2\2\u03ca\u03cb\7\6\2\2\u03cb\u03cc\5\b\5\2\u03cc\u03ce\5\u0088E"+
		"\2\u03cd\u03cf\5J&\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d1\7\25\2\2\u03d1\u03dc\3\2\2\2\u03d2\u03d8\5\u0088"+
		"E\2\u03d3\u03d5\5J&\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\7\13\2\2\u03d7\u03d9\5F$\2\u03d8\u03d4\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03dc\5D#\2\u03db\u03ca\3\2\2"+
		"\2\u03db\u03d2\3\2\2\2\u03db\u03da\3\2\2\2\u03dc\u0099\3\2\2\2\u03dd\u03e0"+
		"\5\b\5\2\u03de\u03e0\5\u009cO\2\u03df\u03dd\3\2\2\2\u03df\u03de\3\2\2"+
		"\2\u03e0\u03e4\3\2\2\2\u03e1\u03e3\5\u0096L\2\u03e2\u03e1\3\2\2\2\u03e3"+
		"\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2"+
		"\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e8\5\u0086D\2\u03e8\u009b\3\2\2\2\u03e9"+
		"\u03ea\5\u008eH\2\u03ea\u03eb\7\21\2\2\u03eb\u009d\3\2\2\2\u03ec\u03ef"+
		"\7G\2\2\u03ed\u03ef\5\u00a8U\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2"+
		"\u03ef\u009f\3\2\2\2\u03f0\u03f1\7F\2\2\u03f1\u00a1\3\2\2\2\u03f2\u03f5"+
		"\5\u009eP\2\u03f3\u03f4\7\20\2\2\u03f4\u03f6\5\u009eP\2\u03f5\u03f3\3"+
		"\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u00a3\3\2\2\2\u03f9\u03fd\5\u00a0Q\2\u03fa\u03fd\5\u009eP\2\u03fb\u03fd"+
		"\5\u00a2R\2\u03fc\u03f9\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2"+
		"\2\u03fd\u00a5\3\2\2\2\u03fe\u03ff\t\5\2\2\u03ff\u00a7\3\2\2\2\u0400\u0419"+
		"\7\4\2\2\u0401\u0419\7\6\2\2\u0402\u0419\7\"\2\2\u0403\u0419\7#\2\2\u0404"+
		"\u0419\7$\2\2\u0405\u0419\7%\2\2\u0406\u0419\7&\2\2\u0407\u0419\7\'\2"+
		"\2\u0408\u0419\7(\2\2\u0409\u0419\7\n\2\2\u040a\u0419\7\62\2\2\u040b\u0419"+
		"\7)\2\2\u040c\u0419\7\7\2\2\u040d\u0419\7\b\2\2\u040e\u0419\7\t\2\2\u040f"+
		"\u0419\5\u00a6T\2\u0410\u0419\78\2\2\u0411\u0419\79\2\2\u0412\u0419\7"+
		";\2\2\u0413\u0419\7<\2\2\u0414\u0419\7=\2\2\u0415\u0419\7>\2\2\u0416\u0419"+
		"\7@\2\2\u0417\u0419\7B\2\2\u0418\u0400\3\2\2\2\u0418\u0401\3\2\2\2\u0418"+
		"\u0402\3\2\2\2\u0418\u0403\3\2\2\2\u0418\u0404\3\2\2\2\u0418\u0405\3\2"+
		"\2\2\u0418\u0406\3\2\2\2\u0418\u0407\3\2\2\2\u0418\u0408\3\2\2\2\u0418"+
		"\u0409\3\2\2\2\u0418\u040a\3\2\2\2\u0418\u040b\3\2\2\2\u0418\u040c\3\2"+
		"\2\2\u0418\u040d\3\2\2\2\u0418\u040e\3\2\2\2\u0418\u040f\3\2\2\2\u0418"+
		"\u0410\3\2\2\2\u0418\u0411\3\2\2\2\u0418\u0412\3\2\2\2\u0418\u0413\3\2"+
		"\2\2\u0418\u0414\3\2\2\2\u0418\u0415\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0417\3\2\2\2\u0419\u00a9\3\2\2\2\u041a\u041c\5\u00acW\2\u041b\u041a"+
		"\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u00ab\3\2\2\2\u041f\u0421\5\6\4\2\u0420\u041f\3\2\2\2\u0421\u0424\3\2"+
		"\2\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0426\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0425\u0427\5\u00aeX\2\u0426\u0425\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u00ad\3\2\2\2\u042a"+
		"\u042b\79\2\2\u042b\u042c\5H%\2\u042c\u042d\5L\'\2\u042d\u042e\5f\64\2"+
		"\u042e\u00af\3\2\2\2\u042f\u0431\7;\2\2\u0430\u0432\5\u00b2Z\2\u0431\u0430"+
		"\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\7<\2\2\u0436\u00b1\3\2\2\2\u0437\u0438\5\u00b4"+
		"[\2\u0438\u0439\7@\2\2\u0439\u043b\3\2\2\2\u043a\u0437\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\7>\2\2\u043d\u043f\5\u00b4[\2"+
		"\u043e\u0440\5\u00b0Y\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u0442\3\2\2\2\u0441\u0443\5\6\4\2\u0442\u0441\3\2\2\2\u0443\u0444\3\2"+
		"\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446"+
		"\u0447\7(\2\2\u0447\u0448\5\u00b4[\2\u0448\u046c\3\2\2\2\u0449\u044a\5"+
		"\u00b4[\2\u044a\u044d\7?\2\2\u044b\u044c\7@\2\2\u044c\u044e\5\u00b4[\2"+
		"\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u046c\3\2\2\2\u044f\u0450"+
		"\5\u00b4[\2\u0450\u0451\7@\2\2\u0451\u0453\3\2\2\2\u0452\u044f\3\2\2\2"+
		"\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\7=\2\2\u0455\u0457"+
		"\5f\64\2\u0456\u0458\5\u00b0Y\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2"+
		"\2\u0458\u045a\3\2\2\2\u0459\u045b\5\6\4\2\u045a\u0459\3\2\2\2\u045b\u045c"+
		"\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u045f\7(\2\2\u045f\u0460\5f\64\2\u0460\u046c\3\2\2\2\u0461\u0462\5\u00b4"+
		"[\2\u0462\u0463\7@\2\2\u0463\u0465\3\2\2\2\u0464\u0461\3\2\2\2\u0464\u0465"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469\5f\64\2\u0467\u046a\7A\2\2\u0468"+
		"\u046a\5\u00b0Y\2\u0469\u0467\3\2\2\2\u0469\u0468\3\2\2\2\u046a\u046c"+
		"\3\2\2\2\u046b\u043a\3\2\2\2\u046b\u0449\3\2\2\2\u046b\u0452\3\2\2\2\u046b"+
		"\u0464\3\2\2\2\u046c\u00b3\3\2\2\2\u046d\u0470\7:\2\2\u046e\u0470\5\u009e"+
		"P\2\u046f\u046d\3\2\2\2\u046f\u046e\3\2\2\2\u0470\u00b5\3\2\2\2\u0471"+
		"\u0472\7B\2\2\u0472\u0473\5\u00b2Z\2\u0473\u00b7\3\2\2\2\u009f\u00bb\u00c1"+
		"\u00c8\u00d1\u00e1\u00ea\u00f3\u00fe\u010a\u0116\u011f\u0123\u0133\u0137"+
		"\u013b\u013e\u0144\u014a\u014f\u0157\u015e\u0163\u0168\u0170\u017d\u0182"+
		"\u0186\u018e\u0191\u019a\u01a1\u01a6\u01ae\u01b4\u01bb\u01c2\u01c6\u01ce"+
		"\u01d7\u01da\u01dd\u01e2\u01e5\u01eb\u01ef\u01f6\u01fc\u0202\u0204\u020a"+
		"\u020e\u0214\u0219\u021d\u0223\u0231\u0237\u0244\u0249\u024d\u024f\u0253"+
		"\u025a\u0261\u0266\u026f\u0273\u0277\u027a\u027f\u0285\u0289\u028c\u0292"+
		"\u0296\u029a\u029c\u02a0\u02a4\u02aa\u02ae\u02b8\u02bb\u02be\u02c3\u02c6"+
		"\u02ca\u02ce\u02d2\u02d5\u02dd\u02e4\u02e8\u02f0\u02f4\u02f7\u02fb\u02fe"+
		"\u0302\u030d\u0312\u0324\u0326\u032d\u0333\u0335\u0347\u034a\u0350\u035b"+
		"\u035d\u0362\u0367\u036a\u036e\u0373\u037a\u0380\u0385\u038a\u038f\u0392"+
		"\u0396\u039b\u03a0\u03a7\u03ac\u03b1\u03b6\u03be\u03c0\u03c6\u03ce\u03d4"+
		"\u03d8\u03db\u03df\u03e4\u03ee\u03f7\u03fc\u0418\u041d\u0422\u0428\u0433"+
		"\u043a\u043f\u0444\u044d\u0452\u0457\u045c\u0464\u0469\u046b\u046f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}