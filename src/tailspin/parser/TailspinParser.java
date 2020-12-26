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
		From=62, StandAlone=63, Use=64, Program=65, Modify=66, Zero=67, PositiveInteger=68, 
		START_STRING=69, STATE_IDENTIFIER=70, IDENTIFIER=71, WS=72, Comment=73, 
		REGEX_TEXT=74, END_REGEX=75, StartCharacterCode=76, StartStringInterpolate=77, 
		STRING_TEXT=78, END_STRING=79, Bytes=80, Bytes_WS=81, EndBytes=82;
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
		RULE_moduleConfiguration = 88, RULE_moduleIdentifier = 89, RULE_useModule = 90, 
		RULE_programModification = 91;
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
			"useModule", "programModification"
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
			"'use'", "'program'", "'modify'", "'0'", null, null, null, null, null, 
			null, null, "'''", null, null, null, null, null, null, "'x]'"
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
			"From", "StandAlone", "Use", "Program", "Modify", "Zero", "PositiveInteger", 
			"START_STRING", "STATE_IDENTIFIER", "IDENTIFIER", "WS", "Comment", "REGEX_TEXT", 
			"END_REGEX", "StartCharacterCode", "StartStringInterpolate", "STRING_TEXT", 
			"END_STRING", "Bytes", "Bytes_WS", "EndBytes"
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
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					useModule();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					inclusion();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(196);
			statement();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(197);
				statement();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
			setState(205);
			match(Include);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(206);
				localIdentifier();
				setState(207);
				match(From);
				}
			}

			setState(211);
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
		public ProgramModificationContext programModification() {
			return getRuleContext(ProgramModificationContext.class,0);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(Def);
				setState(214);
				key();
				setState(215);
				valueProduction();
				setState(216);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				valueChain();
				setState(219);
				match(To);
				setState(220);
				sink();
				}
				break;
			case 3:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				localIdentifier();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(224);
					parameterDefinitions();
					}
				}

				setState(227);
				templatesBody();
				setState(228);
				match(EndDefinition);
				setState(229);
				localIdentifier();
				}
				break;
			case 4:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(StartProcessorDefinition);
				setState(232);
				localIdentifier();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(233);
					parameterDefinitions();
					}
				}

				setState(236);
				block();
				setState(237);
				match(EndDefinition);
				setState(238);
				localIdentifier();
				}
				break;
			case 5:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				match(StartComposerDefinition);
				setState(241);
				localIdentifier();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(242);
					parameterDefinitions();
					}
				}

				setState(245);
				composerBody();
				setState(246);
				match(EndDefinition);
				setState(247);
				localIdentifier();
				}
				break;
			case 6:
				_localctx = new TestDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(249);
				match(StartTestDefinition);
				setState(250);
				stringLiteral();
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(251);
						useModule();
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(257);
					programModification();
					}
					break;
				}
				setState(260);
				testBody();
				setState(261);
				match(EndDefinition);
				setState(262);
				stringLiteral();
				}
				break;
			case 7:
				_localctx = new OperatorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				match(StartOperatorDefinition);
				setState(265);
				match(LeftParen);
				setState(266);
				localIdentifier();
				setState(267);
				localIdentifier();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(268);
					parameterDefinitions();
					}
				}

				setState(271);
				localIdentifier();
				setState(272);
				match(RightParen);
				setState(273);
				templatesBody();
				setState(274);
				match(EndDefinition);
				setState(275);
				localIdentifier();
				}
				break;
			case 8:
				_localctx = new StereotypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(StereotypeDefinition);
				setState(278);
				localIdentifier();
				setState(279);
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
			setState(283);
			localIdentifier();
			setState(284);
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
			setState(286);
			match(And);
			setState(287);
			match(LeftBrace);
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				key();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(289);
					match(Comma);
					}
				}

				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(296);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				structureLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				bytesLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				match(LeftParen);
				setState(305);
				keyValue();
				setState(306);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				arithmeticExpression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(309);
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
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(SourceMarker);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(313);
					anyIdentifier();
					}
					break;
				}
				setState(316);
				reference();
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(317);
					match(Message);
					}
					break;
				}
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(320);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(DeleteMarker);
				setState(324);
				stateIdentifier();
				setState(325);
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
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(329);
				match(LeftParen);
				setState(330);
				arrayReference();
				setState(331);
				match(RightParen);
				}
				break;
			}
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					structureReference();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(341);
			match(FieldReference);
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(342);
				match(LeftParen);
				setState(343);
				arrayReference();
				setState(344);
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
			setState(348);
			dimensionReference();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(349);
				match(SemiColon);
				setState(350);
				dimensionReference();
				}
				}
				setState(355);
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
			setState(358);
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
				setState(356);
				simpleDimension();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
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
			setState(365);
			match(LeftBracket);
			setState(366);
			simpleDimension();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(367);
				match(Comma);
				setState(368);
				simpleDimension();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(LeftBracket);
				setState(377);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(LeftBracket);
				setState(379);
				valueProduction();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(380);
					match(Comma);
					setState(381);
					valueProduction();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
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
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
			setState(395);
			match(LeftBrace);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(396);
				keyValues();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(397);
					match(Comma);
					setState(398);
					keyValues();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(406);
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
			setState(408);
			match(StartBytes);
			setState(409);
			byteValue();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(410);
				byteValue();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
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
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bytes:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(Bytes);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
			setState(427);
			key();
			setState(428);
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
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				source();
				}
				break;
			case 2:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(Lambda);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(432);
					localIdentifier();
					}
				}

				setState(435);
				match(LeftParen);
				setState(436);
				templatesBody();
				setState(437);
				match(Lambda);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(438);
					localIdentifier();
					}
				}

				setState(441);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				match(Lambda);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(445);
					localIdentifier();
					}
				}

				setState(448);
				arrayIndexDecomposition();
				setState(449);
				match(LeftParen);
				setState(450);
				templatesBody();
				setState(451);
				match(Lambda);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(452);
					localIdentifier();
					}
				}

				setState(455);
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
			setState(459);
			match(LeftBracket);
			setState(460);
			localIdentifier();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(461);
				match(SemiColon);
				setState(462);
				localIdentifier();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
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
			setState(470);
			match(ResultMarker);
			setState(480);
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
			case Program:
			case Modify:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				{
				setState(471);
				anyIdentifier();
				setState(472);
				reference();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(473);
					match(Message);
					}
				}

				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(476);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(479);
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
			setState(482);
			anyIdentifier();
			setState(483);
			reference();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(484);
				match(Message);
				}
			}

			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(487);
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
			setState(490);
			match(And);
			setState(491);
			match(LeftBrace);
			setState(496); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(492);
				parameterValue();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(493);
					match(Comma);
					}
				}

				}
				}
				setState(498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(500);
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
			setState(502);
			key();
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(503);
				valueChain();
				}
				break;
			case 2:
				{
				setState(504);
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
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				block();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(508);
					matchTemplate();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(514);
					matchTemplate();
					}
					}
					setState(517); 
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
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				matcher();
				setState(522);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(524);
					match(When);
					}
				}

				setState(527);
				matcher();
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(528);
					match(Do);
					}
					break;
				}
				setState(531);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				match(Otherwise);
				setState(534);
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
			setState(544);
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
			case Program:
			case Modify:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(538); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(537);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(540); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(542);
				match(ResultMarker);
				setState(543);
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
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
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
			setState(552);
			valueChain();
			setState(553);
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
			setState(555);
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
			setState(557);
			valueChain();
			setState(558);
			match(To);
			setState(559);
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
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(561);
				valueChain();
				setState(562);
				match(To);
				}
				break;
			}
			setState(566);
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
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(568);
				match(Range);
				setState(569);
				match(Else);
				}
			}

			setState(572);
			stateIdentifier();
			setState(573);
			reference();
			setState(574);
			match(Colon);
			setState(575);
			valueProduction();
			setState(576);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				source();
				setState(580);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
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
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(To);
				setState(586);
				templates();
				setState(588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(587);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(Deconstructor);
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(591);
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
			setState(596);
			match(StartMatcher);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(597);
				match(Invert);
				}
			}

			setState(600);
			criterion();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(601);
				match(Else);
				setState(602);
				criterion();
				}
				}
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(608);
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
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(610);
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
			case Program:
			case Modify:
			case Zero:
			case PositiveInteger:
			case START_STRING:
			case IDENTIFIER:
				{
				setState(611);
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
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginCondition) {
				{
				{
				setState(614);
				condition();
				}
				}
				setState(619);
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
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				match(LeftBrace);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					{
					setState(623);
					key();
					setState(624);
					structureContentMatcher();
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(625);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(633);
						match(Comma);
						}
					}

					setState(636);
					match(Void);
					}
				}

				setState(639);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(LeftBracket);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(641);
					arrayContentMatcher();
					}
				}

				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(644);
						match(Comma);
						setState(645);
						arrayContentMatcher();
						}
						} 
					}
					setState(650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(651);
						match(Comma);
						}
					}

					setState(654);
					match(Void);
					}
				}

				setState(657);
				match(RightBracket);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(658);
					match(LeftParen);
					setState(661);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(659);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(660);
						arithmeticExpression(0);
						}
						break;
					}
					setState(663);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(667);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(668);
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
			setState(675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
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
			setState(677);
			matcher();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(678);
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
			setState(681);
			match(Equal);
			setState(682);
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
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(684);
				lowerBound();
				}
			}

			setState(687);
			match(Range);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Invert - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(688);
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
			setState(691);
			match(BeginCondition);
			setState(692);
			valueChain();
			setState(693);
			matcher();
			setState(694);
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
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(696);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(697);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(698);
				stringLiteral();
				}
				break;
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(701);
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
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(704);
				match(Invert);
				}
			}

			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(707);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(708);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(709);
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
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(712);
				lowerBound();
				}
			}

			setState(715);
			match(Range);
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(716);
				upperBound();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(719);
				match(Colon);
				setState(720);
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
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
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
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(727);
				additiveOperator();
				}
			}

			setState(730);
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
			setState(732);
			match(START_STRING);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (StartCharacterCode - 76)) | (1L << (StartStringInterpolate - 76)) | (1L << (STRING_TEXT - 76)))) != 0)) {
				{
				{
				setState(733);
				stringContent();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
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
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
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
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
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
			setState(749);
			match(StartCharacterCode);
			setState(750);
			arithmeticExpression(0);
			setState(751);
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
			setState(753);
			match(StartStringInterpolate);
			setState(766);
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
			case Program:
			case Modify:
			case STATE_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(754);
					anyIdentifier();
					}
				}

				setState(757);
				reference();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(758);
					match(Message);
					}
				}

				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(761);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(764);
				match(Colon);
				setState(765);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(768);
				transform();
				}
				break;
			}
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(771);
				match(To);
				setState(772);
				match(TemplateMatch);
				}
			}

			setState(775);
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
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(778);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(779);
				match(LeftParen);
				setState(780);
				arithmeticExpression(0);
				setState(781);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(783);
					additiveOperator();
					}
				}

				setState(786);
				sourceReference();
				}
				break;
			case 4:
				{
				setState(787);
				arithmeticContextKeyword();
				}
				break;
			case 5:
				{
				setState(788);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(791);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(792);
						multiplicativeOperator();
						setState(793);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(795);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(796);
						additiveOperator();
						setState(797);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(799);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(800);
						multiplicativeOperator();
						setState(801);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(803);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(804);
						additiveOperator();
						setState(805);
						term();
						}
						break;
					}
					} 
				}
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				term();
				setState(813);
				multiplicativeOperator();
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(814);
					term();
					}
					break;
				case 2:
					{
					setState(815);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				term();
				setState(819);
				additiveOperator();
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(820);
					term();
					}
					break;
				case 2:
					{
					setState(821);
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
			setState(826);
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
			setState(828);
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
			setState(830);
			match(LeftParen);
			setState(831);
			valueProduction();
			setState(832);
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
			setState(834);
			match(LeftParen);
			setState(835);
			operand();
			setState(836);
			templatesReference();
			setState(837);
			operand();
			setState(838);
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
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
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
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(844);
				stateAssignment();
				}
				break;
			}
			setState(847);
			compositionSequence();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(848);
				definedCompositionSequence();
				}
				}
				setState(853);
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
			setState(854);
			match(Rule);
			setState(855);
			key();
			setState(856);
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
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(859);
					compositionSkipRule();
					}
					}
					setState(862); 
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
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(866);
				compositionSkipRule();
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(872);
			compositionComponent();
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(873);
					match(Comma);
					}
				}

				setState(876);
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
			setState(879);
			compositionMatcher();
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(880);
				transform();
				}
				break;
			}
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(883);
					compositionSkipRule();
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(LeftBracket);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(891);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(892);
					compositionSkipRule();
					}
					break;
				}
				setState(895);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				match(LeftBrace);
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(897);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(898);
					compositionSkipRule();
					}
					break;
				}
				setState(901);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(902);
				sourceReference();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(903);
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
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(906);
				compositionSkipRule();
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(912);
			structureMemberMatcher();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(913);
					match(Comma);
					}
				}

				setState(916);
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
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(919);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(920);
				compositionKeyValue();
				}
				break;
			}
			setState(926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(923);
					compositionSkipRule();
					}
					} 
				}
				setState(928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
			setState(929);
			match(StartMatcher);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(930);
				match(Invert);
				}
			}

			setState(933);
			compositionToken();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(934);
				match(Else);
				setState(935);
				compositionToken();
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941);
			match(EndMatcher);
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(942);
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
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(945);
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
			case Program:
			case Modify:
			case IDENTIFIER:
				{
				setState(946);
				localIdentifier();
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
			setState(950);
			match(Equal);
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
				{
				setState(951);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(952);
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
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(958);
				match(Equal);
				setState(961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(959);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
					{
					setState(960);
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
			setState(965);
			match(LeftParen);
			setState(967); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(966);
				compositionCapture();
				}
				}
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (Zero - 64)) | (1L << (PositiveInteger - 64)) | (1L << (START_STRING - 64)) | (1L << (STATE_IDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
			setState(971);
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
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(973);
				match(Def);
				setState(974);
				key();
				setState(975);
				compositionMatcher();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(976);
					transform();
					}
				}

				setState(979);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(981);
				compositionMatcher();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(983);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(982);
						transform();
						}
						break;
					}
					setState(985);
					match(To);
					setState(986);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
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
			setState(994);
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
			case Program:
			case Modify:
			case IDENTIFIER:
				{
				setState(992);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(993);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(996);
				compositionSkipRule();
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
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
			setState(1004);
			tokenMatcher();
			setState(1005);
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
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
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
			case Program:
			case Modify:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
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
			setState(1011);
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
			setState(1013);
			localIdentifier();
			setState(1016); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1014);
					match(Slash);
					setState(1015);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1018); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1022);
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
			setState(1025);
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
		public TerminalNode Program() { return getToken(TailspinParser.Program, 0); }
		public TerminalNode Modify() { return getToken(TailspinParser.Modify, 0); }
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
			setState(1053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1034);
				match(StartOperatorDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1035);
				match(EndDefinition);
				}
				break;
			case StereotypeDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1036);
				match(StereotypeDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 11);
				{
				setState(1037);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 12);
				{
				setState(1038);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 13);
				{
				setState(1039);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 14);
				{
				setState(1040);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 15);
				{
				setState(1041);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 16);
				{
				setState(1042);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 17);
				{
				setState(1043);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 18);
				{
				setState(1044);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 19);
				{
				setState(1045);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 20);
				{
				setState(1046);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 21);
				{
				setState(1047);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 22);
				{
				setState(1048);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 23);
				{
				setState(1049);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 24);
				{
				setState(1050);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 25);
				{
				setState(1051);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 26);
				{
				setState(1052);
				match(Modify);
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
			setState(1056); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1055);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1058); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1060);
					statement();
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1067); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1066);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1069); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
			setState(1071);
			match(Assert);
			setState(1072);
			valueChain();
			setState(1073);
			matcher();
			setState(1074);
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
			setState(1076);
			match(With);
			setState(1078); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1077);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1080); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1082);
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
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1084);
					moduleIdentifier();
					setState(1085);
					match(From);
					}
					break;
				}
				setState(1089);
				match(Shadowed);
				setState(1090);
				moduleIdentifier();
				setState(1092);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1091);
					dependencyProvision();
					}
					break;
				}
				setState(1095); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1094);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1097); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1099);
				match(EndDefinition);
				setState(1100);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				moduleIdentifier();
				setState(1103);
				match(Inherited);
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1104);
					match(From);
					setState(1105);
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
				setState(1111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1108);
					moduleIdentifier();
					setState(1109);
					match(From);
					}
					break;
				}
				setState(1113);
				match(Modified);
				setState(1114);
				stringLiteral();
				setState(1116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1115);
					dependencyProvision();
					}
					break;
				}
				setState(1119); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1118);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1121); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1123);
				match(EndDefinition);
				setState(1124);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Use - 64)) | (1L << (Program - 64)) | (1L << (Modify - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(1126);
					moduleIdentifier();
					setState(1127);
					match(From);
					}
				}

				setState(1131);
				stringLiteral();
				setState(1134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1132);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1133);
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
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1138);
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
			case Program:
			case Modify:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
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
			setState(1142);
			match(Use);
			setState(1143);
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

	public static class ProgramModificationContext extends ParserRuleContext {
		public TerminalNode Modify() { return getToken(TailspinParser.Modify, 0); }
		public List<TerminalNode> Program() { return getTokens(TailspinParser.Program); }
		public TerminalNode Program(int i) {
			return getToken(TailspinParser.Program, i);
		}
		public TerminalNode EndDefinition() { return getToken(TailspinParser.EndDefinition, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramModificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programModification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProgramModification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramModificationContext programModification() throws RecognitionException {
		ProgramModificationContext _localctx = new ProgramModificationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_programModification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(Modify);
			setState(1146);
			match(Program);
			setState(1148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1147);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1152);
			match(EndDefinition);
			setState(1153);
			match(Program);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0486\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\7\2\u00bc"+
		"\n\2\f\2\16\2\u00bf\13\2\3\2\7\2\u00c2\n\2\f\2\16\2\u00c5\13\2\3\2\3\2"+
		"\7\2\u00c9\n\2\f\2\16\2\u00cc\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u00d4\n"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e4\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ed\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00f6\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ff\n\4\f\4\16\4\u0102"+
		"\13\4\3\4\5\4\u0105\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0110"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u011c\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6\u0125\n\6\6\6\u0127\n\6\r\6\16\6\u0128\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0139\n\7\3\b\3\b\5"+
		"\b\u013d\n\b\3\b\3\b\5\b\u0141\n\b\3\b\5\b\u0144\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u014a\n\b\3\t\3\t\3\t\3\t\5\t\u0150\n\t\3\t\7\t\u0153\n\t\f\t\16\t"+
		"\u0156\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u015d\n\n\3\13\3\13\3\13\7\13\u0162"+
		"\n\13\f\13\16\13\u0165\13\13\3\f\3\f\5\f\u0169\n\f\3\r\3\r\3\r\5\r\u016e"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u0174\n\16\f\16\16\16\u0177\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0181\n\17\f\17\16\17\u0184\13"+
		"\17\3\17\3\17\5\17\u0188\n\17\3\20\3\20\5\20\u018c\n\20\3\21\3\21\3\21"+
		"\3\21\7\21\u0192\n\21\f\21\16\21\u0195\13\21\5\21\u0197\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u019e\n\22\f\22\16\22\u01a1\13\22\3\22\3\22\3\23"+
		"\3\23\5\23\u01a7\n\23\3\24\3\24\3\24\5\24\u01ac\n\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u01b4\n\26\3\26\3\26\3\26\3\26\5\26\u01ba\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01c1\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01c8"+
		"\n\26\3\26\3\26\5\26\u01cc\n\26\3\27\3\27\3\27\3\27\7\27\u01d2\n\27\f"+
		"\27\16\27\u01d5\13\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u01dd\n\30\3"+
		"\30\5\30\u01e0\n\30\3\30\5\30\u01e3\n\30\3\31\3\31\3\31\5\31\u01e8\n\31"+
		"\3\31\5\31\u01eb\n\31\3\32\3\32\3\32\3\32\5\32\u01f1\n\32\6\32\u01f3\n"+
		"\32\r\32\16\32\u01f4\3\32\3\32\3\33\3\33\3\33\5\33\u01fc\n\33\3\34\3\34"+
		"\7\34\u0200\n\34\f\34\16\34\u0203\13\34\3\34\6\34\u0206\n\34\r\34\16\34"+
		"\u0207\5\34\u020a\n\34\3\35\3\35\3\35\3\35\5\35\u0210\n\35\3\35\3\35\5"+
		"\35\u0214\n\35\3\35\3\35\3\35\3\35\5\35\u021a\n\35\3\36\6\36\u021d\n\36"+
		"\r\36\16\36\u021e\3\36\3\36\5\36\u0223\n\36\3\37\3\37\3\37\3\37\5\37\u0229"+
		"\n\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0237\n#\3#\3#\3$\3$"+
		"\5$\u023d\n$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u024a\n%\3&\3&\3&\5&"+
		"\u024f\n&\3&\3&\5&\u0253\n&\5&\u0255\n&\3\'\3\'\5\'\u0259\n\'\3\'\3\'"+
		"\3\'\7\'\u025e\n\'\f\'\16\'\u0261\13\'\3\'\3\'\3(\3(\5(\u0267\n(\3(\7"+
		"(\u026a\n(\f(\16(\u026d\13(\3)\3)\3)\3)\3)\3)\5)\u0275\n)\7)\u0277\n)"+
		"\f)\16)\u027a\13)\3)\5)\u027d\n)\3)\5)\u0280\n)\3)\3)\3)\5)\u0285\n)\3"+
		")\3)\7)\u0289\n)\f)\16)\u028c\13)\3)\5)\u028f\n)\3)\5)\u0292\n)\3)\3)"+
		"\3)\3)\5)\u0298\n)\3)\3)\5)\u029c\n)\3)\3)\5)\u02a0\n)\5)\u02a2\n)\3*"+
		"\3*\5*\u02a6\n*\3+\3+\5+\u02aa\n+\3,\3,\3,\3-\5-\u02b0\n-\3-\3-\5-\u02b4"+
		"\n-\3.\3.\3.\3.\3.\3/\3/\3/\5/\u02be\n/\3/\5/\u02c1\n/\3\60\5\60\u02c4"+
		"\n\60\3\60\3\60\3\60\5\60\u02c9\n\60\3\61\5\61\u02cc\n\61\3\61\3\61\5"+
		"\61\u02d0\n\61\3\61\3\61\5\61\u02d4\n\61\3\62\3\62\5\62\u02d8\n\62\3\63"+
		"\5\63\u02db\n\63\3\63\3\63\3\64\3\64\7\64\u02e1\n\64\f\64\16\64\u02e4"+
		"\13\64\3\64\3\64\3\65\3\65\5\65\u02ea\n\65\3\66\3\66\5\66\u02ee\n\66\3"+
		"\67\3\67\3\67\3\67\38\38\58\u02f6\n8\38\38\58\u02fa\n8\38\58\u02fd\n8"+
		"\38\38\58\u0301\n8\38\58\u0304\n8\38\38\58\u0308\n8\38\38\39\39\39\39"+
		"\39\39\39\59\u0313\n9\39\39\39\59\u0318\n9\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\79\u032a\n9\f9\169\u032d\139\3:\3:\3:\3:\5:\u0333"+
		"\n:\3:\3:\3:\3:\5:\u0339\n:\5:\u033b\n:\3;\3;\3<\3<\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\5?\u034d\n?\3@\5@\u0350\n@\3@\3@\7@\u0354\n@\f@\16"+
		"@\u0357\13@\3A\3A\3A\3A\3B\3B\6B\u035f\nB\rB\16B\u0360\5B\u0363\nB\3C"+
		"\7C\u0366\nC\fC\16C\u0369\13C\3C\3C\5C\u036d\nC\3C\5C\u0370\nC\3D\3D\5"+
		"D\u0374\nD\3D\7D\u0377\nD\fD\16D\u037a\13D\3E\3E\3E\3E\5E\u0380\nE\3E"+
		"\3E\3E\3E\5E\u0386\nE\3E\3E\3E\5E\u038b\nE\3F\7F\u038e\nF\fF\16F\u0391"+
		"\13F\3F\3F\5F\u0395\nF\3F\5F\u0398\nF\3G\3G\5G\u039c\nG\3G\7G\u039f\n"+
		"G\fG\16G\u03a2\13G\3H\3H\5H\u03a6\nH\3H\3H\3H\7H\u03ab\nH\fH\16H\u03ae"+
		"\13H\3H\3H\5H\u03b2\nH\3I\3I\3I\5I\u03b7\nI\3J\3J\3J\5J\u03bc\nJ\3K\3"+
		"K\3K\3K\3K\3K\5K\u03c4\nK\5K\u03c6\nK\3L\3L\6L\u03ca\nL\rL\16L\u03cb\3"+
		"L\3L\3M\3M\3M\3M\5M\u03d4\nM\3M\3M\3M\3M\5M\u03da\nM\3M\3M\5M\u03de\n"+
		"M\3M\5M\u03e1\nM\3N\3N\5N\u03e5\nN\3N\7N\u03e8\nN\fN\16N\u03eb\13N\3N"+
		"\3N\3O\3O\3O\3P\3P\5P\u03f4\nP\3Q\3Q\3R\3R\3R\6R\u03fb\nR\rR\16R\u03fc"+
		"\3S\3S\3S\5S\u0402\nS\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0420\nU\3V\6V\u0423\nV\rV\16"+
		"V\u0424\3W\7W\u0428\nW\fW\16W\u042b\13W\3W\6W\u042e\nW\rW\16W\u042f\3"+
		"X\3X\3X\3X\3X\3Y\3Y\6Y\u0439\nY\rY\16Y\u043a\3Y\3Y\3Z\3Z\3Z\5Z\u0442\n"+
		"Z\3Z\3Z\3Z\5Z\u0447\nZ\3Z\6Z\u044a\nZ\rZ\16Z\u044b\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\5Z\u0455\nZ\3Z\3Z\3Z\5Z\u045a\nZ\3Z\3Z\3Z\5Z\u045f\nZ\3Z\6Z\u0462\n"+
		"Z\rZ\16Z\u0463\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u046c\nZ\3Z\3Z\3Z\5Z\u0471\nZ\5Z\u0473"+
		"\nZ\3[\3[\5[\u0477\n[\3\\\3\\\3\\\3]\3]\3]\6]\u047f\n]\r]\16]\u0480\3"+
		"]\3]\3]\3]\2\3p^\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\2\6\3\2\"$\3\2./\3\2\60\62\3\2*+\2\u050c\2\u00bd\3\2\2\2\4\u00cf\3\2"+
		"\2\2\6\u011b\3\2\2\2\b\u011d\3\2\2\2\n\u0120\3\2\2\2\f\u0138\3\2\2\2\16"+
		"\u0149\3\2\2\2\20\u014f\3\2\2\2\22\u0157\3\2\2\2\24\u015e\3\2\2\2\26\u0168"+
		"\3\2\2\2\30\u016d\3\2\2\2\32\u016f\3\2\2\2\34\u0187\3\2\2\2\36\u018b\3"+
		"\2\2\2 \u018d\3\2\2\2\"\u019a\3\2\2\2$\u01a6\3\2\2\2&\u01ab\3\2\2\2(\u01ad"+
		"\3\2\2\2*\u01cb\3\2\2\2,\u01cd\3\2\2\2.\u01d8\3\2\2\2\60\u01e4\3\2\2\2"+
		"\62\u01ec\3\2\2\2\64\u01f8\3\2\2\2\66\u0209\3\2\2\28\u0219\3\2\2\2:\u0222"+
		"\3\2\2\2<\u0228\3\2\2\2>\u022a\3\2\2\2@\u022d\3\2\2\2B\u022f\3\2\2\2D"+
		"\u0236\3\2\2\2F\u023c\3\2\2\2H\u0249\3\2\2\2J\u0254\3\2\2\2L\u0256\3\2"+
		"\2\2N\u0266\3\2\2\2P\u02a1\3\2\2\2R\u02a5\3\2\2\2T\u02a7\3\2\2\2V\u02ab"+
		"\3\2\2\2X\u02af\3\2\2\2Z\u02b5\3\2\2\2\\\u02bd\3\2\2\2^\u02c3\3\2\2\2"+
		"`\u02cb\3\2\2\2b\u02d7\3\2\2\2d\u02da\3\2\2\2f\u02de\3\2\2\2h\u02e9\3"+
		"\2\2\2j\u02ed\3\2\2\2l\u02ef\3\2\2\2n\u02f3\3\2\2\2p\u0317\3\2\2\2r\u033a"+
		"\3\2\2\2t\u033c\3\2\2\2v\u033e\3\2\2\2x\u0340\3\2\2\2z\u0344\3\2\2\2|"+
		"\u034c\3\2\2\2~\u034f\3\2\2\2\u0080\u0358\3\2\2\2\u0082\u0362\3\2\2\2"+
		"\u0084\u0367\3\2\2\2\u0086\u0371\3\2\2\2\u0088\u038a\3\2\2\2\u008a\u038f"+
		"\3\2\2\2\u008c\u039b\3\2\2\2\u008e\u03a3\3\2\2\2\u0090\u03b6\3\2\2\2\u0092"+
		"\u03b8\3\2\2\2\u0094\u03c5\3\2\2\2\u0096\u03c7\3\2\2\2\u0098\u03e0\3\2"+
		"\2\2\u009a\u03e4\3\2\2\2\u009c\u03ee\3\2\2\2\u009e\u03f3\3\2\2\2\u00a0"+
		"\u03f5\3\2\2\2\u00a2\u03f7\3\2\2\2\u00a4\u0401\3\2\2\2\u00a6\u0403\3\2"+
		"\2\2\u00a8\u041f\3\2\2\2\u00aa\u0422\3\2\2\2\u00ac\u0429\3\2\2\2\u00ae"+
		"\u0431\3\2\2\2\u00b0\u0436\3\2\2\2\u00b2\u0472\3\2\2\2\u00b4\u0476\3\2"+
		"\2\2\u00b6\u0478\3\2\2\2\u00b8\u047b\3\2\2\2\u00ba\u00bc\5\u00b6\\\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c3\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5\4\3\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\5\6\4\2\u00c7"+
		"\u00c9\5\6\4\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7\2\2\3\u00ce\3\3\2\2\2\u00cf\u00d3\7\4\2\2\u00d0\u00d1\5\u009e"+
		"P\2\u00d1\u00d2\7@\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5f\64\2\u00d6\5\3\2\2\2\u00d7"+
		"\u00d8\7\6\2\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\5\36\20\2\u00da\u00db\7"+
		"\25\2\2\u00db\u011c\3\2\2\2\u00dc\u00dd\5H%\2\u00dd\u00de\7\13\2\2\u00de"+
		"\u00df\5.\30\2\u00df\u011c\3\2\2\2\u00e0\u00e1\t\2\2\2\u00e1\u00e3\5\u009e"+
		"P\2\u00e2\u00e4\5\n\6\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\7(\2\2\u00e7\u00e8\5"+
		"\u009eP\2\u00e8\u011c\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea\u00ec\5\u009eP"+
		"\2\u00eb\u00ed\5\n\6\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\5:\36\2\u00ef\u00f0\7(\2\2\u00f0\u00f1\5\u009eP\2"+
		"\u00f1\u011c\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f5\5\u009eP\2\u00f4\u00f6"+
		"\5\n\6\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\5~@\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\5\u009eP\2\u00fa\u011c\3\2"+
		"\2\2\u00fb\u00fc\78\2\2\u00fc\u0100\5f\64\2\u00fd\u00ff\5\u00b6\\\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\5\u00b8]\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5\u00aa"+
		"V\2\u0107\u0108\7(\2\2\u0108\u0109\5f\64\2\u0109\u011c\3\2\2\2\u010a\u010b"+
		"\7\'\2\2\u010b\u010c\7\31\2\2\u010c\u010d\5\u009eP\2\u010d\u010f\5\u009e"+
		"P\2\u010e\u0110\5\n\6\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\5\u009eP\2\u0112\u0113\7\32\2\2\u0113\u0114"+
		"\5\66\34\2\u0114\u0115\7(\2\2\u0115\u0116\5\u009eP\2\u0116\u011c\3\2\2"+
		"\2\u0117\u0118\7\n\2\2\u0118\u0119\5\u009eP\2\u0119\u011a\5L\'\2\u011a"+
		"\u011c\3\2\2\2\u011b\u00d7\3\2\2\2\u011b\u00dc\3\2\2\2\u011b\u00e0\3\2"+
		"\2\2\u011b\u00e9\3\2\2\2\u011b\u00f2\3\2\2\2\u011b\u00fb\3\2\2\2\u011b"+
		"\u010a\3\2\2\2\u011b\u0117\3\2\2\2\u011c\7\3\2\2\2\u011d\u011e\5\u009e"+
		"P\2\u011e\u011f\7\21\2\2\u011f\t\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u0126"+
		"\7\35\2\2\u0122\u0124\5\b\5\2\u0123\u0125\7\26\2\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\7\36\2\2\u012b\13\3\2\2\2\u012c\u0139\5\16\b\2\u012d\u0139\5f\64"+
		"\2\u012e\u0139\5`\61\2\u012f\u0139\5\34\17\2\u0130\u0139\5 \21\2\u0131"+
		"\u0139\5\"\22\2\u0132\u0133\7\31\2\2\u0133\u0134\5(\25\2\u0134\u0135\7"+
		"\32\2\2\u0135\u0139\3\2\2\2\u0136\u0139\5p9\2\u0137\u0139\5z>\2\u0138"+
		"\u012c\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u012e\3\2\2\2\u0138\u012f\3\2"+
		"\2\2\u0138\u0130\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\r\3\2\2\2\u013a\u013c\7\r\2\2"+
		"\u013b\u013d\5\u00a4S\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0140\5\20\t\2\u013f\u0141\7\22\2\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0144\5\62\32\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014a\3\2\2\2\u0145\u0146\7\16"+
		"\2\2\u0146\u0147\5\u00a0Q\2\u0147\u0148\5\20\t\2\u0148\u014a\3\2\2\2\u0149"+
		"\u013a\3\2\2\2\u0149\u0145\3\2\2\2\u014a\17\3\2\2\2\u014b\u014c\7\31\2"+
		"\2\u014c\u014d\5\24\13\2\u014d\u014e\7\32\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014b\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u0153\5\22"+
		"\n\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\21\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015c\7\23\2"+
		"\2\u0158\u0159\7\31\2\2\u0159\u015a\5\24\13\2\u015a\u015b\7\32\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u015d\3\2\2\2\u015d\23\3\2\2"+
		"\2\u015e\u0163\5\26\f\2\u015f\u0160\7\25\2\2\u0160\u0162\5\26\f\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\25\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0169\5\30\r\2\u0167\u0169"+
		"\5\32\16\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\27\3\2\2\2\u016a"+
		"\u016e\5\16\b\2\u016b\u016e\5p9\2\u016c\u016e\5`\61\2\u016d\u016a\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\31\3\2\2\2\u016f\u0170"+
		"\7\33\2\2\u0170\u0175\5\30\r\2\u0171\u0172\7\26\2\2\u0172\u0174\5\30\r"+
		"\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\34\2\2"+
		"\u0179\33\3\2\2\2\u017a\u017b\7\33\2\2\u017b\u0188\7\34\2\2\u017c\u017d"+
		"\7\33\2\2\u017d\u0182\5\36\20\2\u017e\u017f\7\26\2\2\u017f\u0181\5\36"+
		"\20\2\u0180\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\34"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u017a\3\2\2\2\u0187\u017c\3\2\2\2\u0188"+
		"\35\3\2\2\2\u0189\u018c\5B\"\2\u018a\u018c\5H%\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\37\3\2\2\2\u018d\u0196\7\35\2\2\u018e\u0193\5&\24"+
		"\2\u018f\u0190\7\26\2\2\u0190\u0192\5&\24\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\7\36\2\2\u0199!\3\2\2\2\u019a\u019b\7\37\2"+
		"\2\u019b\u019f\5$\23\2\u019c\u019e\5$\23\2\u019d\u019c\3\2\2\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\7T\2\2\u01a3#\3\2\2\2\u01a4\u01a7\7R\2\2\u01a5"+
		"\u01a7\5x=\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7%\3\2\2\2\u01a8"+
		"\u01ac\5(\25\2\u01a9\u01ac\5\36\20\2\u01aa\u01ac\5\16\b\2\u01ab\u01a8"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\'\3\2\2\2\u01ad"+
		"\u01ae\5\b\5\2\u01ae\u01af\5\36\20\2\u01af)\3\2\2\2\u01b0\u01cc\5\f\7"+
		"\2\u01b1\u01b3\7!\2\2\u01b2\u01b4\5\u009eP\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\31\2\2\u01b6\u01b7\5"+
		"\66\34\2\u01b7\u01b9\7!\2\2\u01b8\u01ba\5\u009eP\2\u01b9\u01b8\3\2\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7\32\2\2\u01bc\u01cc"+
		"\3\2\2\2\u01bd\u01cc\5\60\31\2\u01be\u01c0\7!\2\2\u01bf\u01c1\5\u009e"+
		"P\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\5,\27\2\u01c3\u01c4\7\31\2\2\u01c4\u01c5\5\66\34\2\u01c5\u01c7"+
		"\7!\2\2\u01c6\u01c8\5\u009eP\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7\32\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01b0"+
		"\3\2\2\2\u01cb\u01b1\3\2\2\2\u01cb\u01bd\3\2\2\2\u01cb\u01be\3\2\2\2\u01cc"+
		"+\3\2\2\2\u01cd\u01ce\7\33\2\2\u01ce\u01d3\5\u009eP\2\u01cf\u01d0\7\25"+
		"\2\2\u01d0\u01d2\5\u009eP\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d7\7\34\2\2\u01d7-\3\2\2\2\u01d8\u01e2\7\f\2\2\u01d9\u01da"+
		"\5\u00a4S\2\u01da\u01dc\5\20\t\2\u01db\u01dd\7\22\2\2\u01dc\u01db\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5\62\32\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01e3\7\5"+
		"\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3/\3\2\2\2\u01e4\u01e5"+
		"\5\u00a4S\2\u01e5\u01e7\5\20\t\2\u01e6\u01e8\7\22\2\2\u01e7\u01e6\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01eb\5\62\32\2\u01ea"+
		"\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\61\3\2\2\2\u01ec\u01ed\7\17\2"+
		"\2\u01ed\u01f2\7\35\2\2\u01ee\u01f0\5\64\33\2\u01ef\u01f1\7\26\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01ee\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\7\36\2\2\u01f7\63\3\2\2\2\u01f8\u01fb\5\b\5"+
		"\2\u01f9\u01fc\5H%\2\u01fa\u01fc\5\60\31\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\65\3\2\2\2\u01fd\u0201\5:\36\2\u01fe\u0200\58\35\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u020a\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\58\35\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u01fd\3\2\2\2\u0209\u0205\3\2\2\2\u020a"+
		"\67\3\2\2\2\u020b\u020c\5L\'\2\u020c\u020d\5:\36\2\u020d\u021a\3\2\2\2"+
		"\u020e\u0210\7\7\2\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0213\5L\'\2\u0212\u0214\7\b\2\2\u0213\u0212\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5:\36\2\u0216\u021a\3\2"+
		"\2\2\u0217\u0218\7\t\2\2\u0218\u021a\5:\36\2\u0219\u020b\3\2\2\2\u0219"+
		"\u020f\3\2\2\2\u0219\u0217\3\2\2\2\u021a9\3\2\2\2\u021b\u021d\5<\37\2"+
		"\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u0221\7\f\2\2\u0221\u0223\7\5\2\2\u0222"+
		"\u021c\3\2\2\2\u0222\u0220\3\2\2\2\u0223;\3\2\2\2\u0224\u0229\5@!\2\u0225"+
		"\u0229\5D#\2\u0226\u0229\5B\"\2\u0227\u0229\5> \2\u0228\u0224\3\2\2\2"+
		"\u0228\u0225\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229=\3"+
		"\2\2\2\u022a\u022b\5H%\2\u022b\u022c\7\f\2\2\u022c?\3\2\2\2\u022d\u022e"+
		"\5\6\4\2\u022eA\3\2\2\2\u022f\u0230\5H%\2\u0230\u0231\7\13\2\2\u0231\u0232"+
		"\7,\2\2\u0232C\3\2\2\2\u0233\u0234\5H%\2\u0234\u0235\7\13\2\2\u0235\u0237"+
		"\3\2\2\2\u0236\u0233\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\5F$\2\u0239E\3\2\2\2\u023a\u023b\7-\2\2\u023b\u023d\7\65\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u00a0"+
		"Q\2\u023f\u0240\5\20\t\2\u0240\u0241\7\21\2\2\u0241\u0242\5\36\20\2\u0242"+
		"\u0243\7\25\2\2\u0243G\3\2\2\2\u0244\u024a\5\f\7\2\u0245\u0246\5\f\7\2"+
		"\u0246\u0247\5J&\2\u0247\u024a\3\2\2\2\u0248\u024a\5(\25\2\u0249\u0244"+
		"\3\2\2\2\u0249\u0245\3\2\2\2\u0249\u0248\3\2\2\2\u024aI\3\2\2\2\u024b"+
		"\u024c\7\13\2\2\u024c\u024e\5*\26\2\u024d\u024f\5J&\2\u024e\u024d\3\2"+
		"\2\2\u024e\u024f\3\2\2\2\u024f\u0255\3\2\2\2\u0250\u0252\7\27\2\2\u0251"+
		"\u0253\5J&\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2"+
		"\2\u0254\u024b\3\2\2\2\u0254\u0250\3\2\2\2\u0255K\3\2\2\2\u0256\u0258"+
		"\7 \2\2\u0257\u0259\7\30\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u025f\5N(\2\u025b\u025c\7\65\2\2\u025c\u025e\5N("+
		"\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0263\7\66\2\2"+
		"\u0263M\3\2\2\2\u0264\u0267\5V,\2\u0265\u0267\5P)\2\u0266\u0264\3\2\2"+
		"\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b\3\2\2\2\u0268\u026a"+
		"\5Z.\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026cO\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u02a2\5X-\2\u026f"+
		"\u02a2\5f\64\2\u0270\u0278\7\35\2\2\u0271\u0272\5\b\5\2\u0272\u0274\5"+
		"R*\2\u0273\u0275\7\26\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0271\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027f\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027d\7\26\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3"+
		"\2\2\2\u027e\u0280\7\5\2\2\u027f\u027c\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u02a2\7\36\2\2\u0282\u0284\7\33\2\2\u0283\u0285\5"+
		"T+\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a\3\2\2\2\u0286"+
		"\u0287\7\26\2\2\u0287\u0289\5T+\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0291\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u028f\7\26\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\7\5\2\2\u0291\u028e\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u029b\7\34\2\2\u0294\u0297\7"+
		"\31\2\2\u0295\u0298\5X-\2\u0296\u0298\5p9\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7\32\2\2\u029a\u029c\3"+
		"\2\2\2\u029b\u0294\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a2\3\2\2\2\u029d"+
		"\u02a0\5\u009eP\2\u029e\u02a0\5\u00a2R\2\u029f\u029d\3\2\2\2\u029f\u029e"+
		"\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u026e\3\2\2\2\u02a1\u026f\3\2\2\2\u02a1"+
		"\u0270\3\2\2\2\u02a1\u0282\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2Q\3\2\2\2"+
		"\u02a3\u02a6\5L\'\2\u02a4\u02a6\7\5\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a4"+
		"\3\2\2\2\u02a6S\3\2\2\2\u02a7\u02a9\5L\'\2\u02a8\u02aa\5\u0094K\2\u02a9"+
		"\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aaU\3\2\2\2\u02ab\u02ac\7\64\2\2"+
		"\u02ac\u02ad\5\f\7\2\u02adW\3\2\2\2\u02ae\u02b0\5\\/\2\u02af\u02ae\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7-\2\2\u02b2"+
		"\u02b4\5^\60\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4Y\3\2\2\2"+
		"\u02b5\u02b6\7\67\2\2\u02b6\u02b7\5H%\2\u02b7\u02b8\5L\'\2\u02b8\u02b9"+
		"\7\32\2\2\u02b9[\3\2\2\2\u02ba\u02be\5\16\b\2\u02bb\u02be\5p9\2\u02bc"+
		"\u02be\5f\64\2\u02bd\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2"+
		"\2\2\u02be\u02c0\3\2\2\2\u02bf\u02c1\7\30\2\2\u02c0\u02bf\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1]\3\2\2\2\u02c2\u02c4\7\30\2\2\u02c3\u02c2\3\2\2\2"+
		"\u02c3\u02c4\3\2\2\2\u02c4\u02c8\3\2\2\2\u02c5\u02c9\5\16\b\2\u02c6\u02c9"+
		"\5p9\2\u02c7\u02c9\5f\64\2\u02c8\u02c5\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c7\3\2\2\2\u02c9_\3\2\2\2\u02ca\u02cc\5\\/\2\u02cb\u02ca\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\7-\2\2\u02ce\u02d0\5^\60"+
		"\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d2"+
		"\7\21\2\2\u02d2\u02d4\5p9\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"a\3\2\2\2\u02d5\u02d8\7E\2\2\u02d6\u02d8\5d\63\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d6\3\2\2\2\u02d8c\3\2\2\2\u02d9\u02db\5t;\2\u02da\u02d9\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7F\2\2\u02dde\3\2\2\2\u02de"+
		"\u02e2\7G\2\2\u02df\u02e1\5h\65\2\u02e0\u02df\3\2\2\2\u02e1\u02e4\3\2"+
		"\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e6\7Q\2\2\u02e6g\3\2\2\2\u02e7\u02ea\5j\66\2\u02e8"+
		"\u02ea\7P\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2\2\2\u02eai\3\2\2\2\u02eb"+
		"\u02ee\5n8\2\u02ec\u02ee\5l\67\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2"+
		"\2\u02eek\3\2\2\2\u02ef\u02f0\7N\2\2\u02f0\u02f1\5p9\2\u02f1\u02f2\7\24"+
		"\2\2\u02f2m\3\2\2\2\u02f3\u0300\7O\2\2\u02f4\u02f6\5\u00a4S\2\u02f5\u02f4"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\5\20\t\2"+
		"\u02f8\u02fa\7\22\2\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc"+
		"\3\2\2\2\u02fb\u02fd\5\62\32\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2"+
		"\u02fd\u0301\3\2\2\2\u02fe\u02ff\7\21\2\2\u02ff\u0301\5\f\7\2\u0300\u02f5"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0304\5J&\2\u0303"+
		"\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0306\7\13"+
		"\2\2\u0306\u0308\7,\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030a\7\24\2\2\u030ao\3\2\2\2\u030b\u030c\b9\1\2"+
		"\u030c\u0318\5b\62\2\u030d\u030e\7\31\2\2\u030e\u030f\5p9\2\u030f\u0310"+
		"\7\32\2\2\u0310\u0318\3\2\2\2\u0311\u0313\5t;\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0318\5\16\b\2\u0315\u0318\5"+
		"\u00a6T\2\u0316\u0318\5r:\2\u0317\u030b\3\2\2\2\u0317\u030d\3\2\2\2\u0317"+
		"\u0312\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318\u032b\3\2"+
		"\2\2\u0319\u031a\f\b\2\2\u031a\u031b\5v<\2\u031b\u031c\5p9\t\u031c\u032a"+
		"\3\2\2\2\u031d\u031e\f\7\2\2\u031e\u031f\5t;\2\u031f\u0320\5p9\b\u0320"+
		"\u032a\3\2\2\2\u0321\u0322\f\5\2\2\u0322\u0323\5v<\2\u0323\u0324\5x=\2"+
		"\u0324\u032a\3\2\2\2\u0325\u0326\f\4\2\2\u0326\u0327\5t;\2\u0327\u0328"+
		"\5x=\2\u0328\u032a\3\2\2\2\u0329\u0319\3\2\2\2\u0329\u031d\3\2\2\2\u0329"+
		"\u0321\3\2\2\2\u0329\u0325\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2"+
		"\2\2\u032b\u032c\3\2\2\2\u032cq\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u032f"+
		"\5x=\2\u032f\u0332\5v<\2\u0330\u0333\5x=\2\u0331\u0333\5p9\2\u0332\u0330"+
		"\3\2\2\2\u0332\u0331\3\2\2\2\u0333\u033b\3\2\2\2\u0334\u0335\5x=\2\u0335"+
		"\u0338\5t;\2\u0336\u0339\5x=\2\u0337\u0339\5p9\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0337\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u032e\3\2\2\2\u033a\u0334\3\2"+
		"\2\2\u033bs\3\2\2\2\u033c\u033d\t\3\2\2\u033du\3\2\2\2\u033e\u033f\t\4"+
		"\2\2\u033fw\3\2\2\2\u0340\u0341\7\31\2\2\u0341\u0342\5\36\20\2\u0342\u0343"+
		"\7\32\2\2\u0343y\3\2\2\2\u0344\u0345\7\31\2\2\u0345\u0346\5|?\2\u0346"+
		"\u0347\5\60\31\2\u0347\u0348\5|?\2\u0348\u0349\7\32\2\2\u0349{\3\2\2\2"+
		"\u034a\u034d\5\f\7\2\u034b\u034d\5x=\2\u034c\u034a\3\2\2\2\u034c\u034b"+
		"\3\2\2\2\u034d}\3\2\2\2\u034e\u0350\5D#\2\u034f\u034e\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0355\5\u0082B\2\u0352\u0354\5\u0080"+
		"A\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\177\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7)\2"+
		"\2\u0359\u035a\5\b\5\2\u035a\u035b\5\u0082B\2\u035b\u0081\3\2\2\2\u035c"+
		"\u0363\5\u0084C\2\u035d\u035f\5\u0096L\2\u035e\u035d\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362"+
		"\u035c\3\2\2\2\u0362\u035e\3\2\2\2\u0363\u0083\3\2\2\2\u0364\u0366\5\u0096"+
		"L\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036f\5\u0086"+
		"D\2\u036b\u036d\7\26\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\5\u0084C\2\u036f\u036c\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0085\3\2\2\2\u0371\u0373\5\u0088E\2\u0372\u0374\5J&\2"+
		"\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0378\3\2\2\2\u0375\u0377"+
		"\5\u0096L\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2"+
		"\2\u0378\u0379\3\2\2\2\u0379\u0087\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u038b"+
		"\5\u008eH\2\u037c\u037f\7\33\2\2\u037d\u0380\5\u0082B\2\u037e\u0380\5"+
		"\u0096L\2\u037f\u037d\3\2\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2"+
		"\u0380\u0381\3\2\2\2\u0381\u038b\7\34\2\2\u0382\u0385\7\35\2\2\u0383\u0386"+
		"\5\u008aF\2\u0384\u0386\5\u0096L\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2"+
		"\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038b\7\36\2\2\u0388"+
		"\u038b\5\16\b\2\u0389\u038b\5\u009aN\2\u038a\u037b\3\2\2\2\u038a\u037c"+
		"\3\2\2\2\u038a\u0382\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u0389\3\2\2\2\u038b"+
		"\u0089\3\2\2\2\u038c\u038e\5\u0096L\2\u038d\u038c\3\2\2\2\u038e\u0391"+
		"\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0397\5\u008cG\2\u0393\u0395\7\26\2\2\u0394\u0393"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\5\u008aF"+
		"\2\u0397\u0394\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u008b\3\2\2\2\u0399\u039c"+
		"\5\u008eH\2\u039a\u039c\5\u009aN\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2"+
		"\2\2\u039c\u03a0\3\2\2\2\u039d\u039f\5\u0096L\2\u039e\u039d\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u008d\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a5\7 \2\2\u03a4\u03a6\7\30\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ac\5\u0090"+
		"I\2\u03a8\u03a9\7\65\2\2\u03a9\u03ab\5\u0090I\2\u03aa\u03a8\3\2\2\2\u03ab"+
		"\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2"+
		"\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b1\7\66\2\2\u03b0\u03b2\5\u0094K\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u008f\3\2\2\2\u03b3\u03b7\5\u0092"+
		"J\2\u03b4\u03b7\5\u009eP\2\u03b5\u03b7\5f\64\2\u03b6\u03b3\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u0091\3\2\2\2\u03b8\u03bb\7\64"+
		"\2\2\u03b9\u03bc\5\16\b\2\u03ba\u03bc\5f\64\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03ba\3\2\2\2\u03bc\u0093\3\2\2\2\u03bd\u03c6\7.\2\2\u03be\u03c6\7\60"+
		"\2\2\u03bf\u03c6\7\63\2\2\u03c0\u03c3\7\64\2\2\u03c1\u03c4\7F\2\2\u03c2"+
		"\u03c4\5\16\b\2\u03c3\u03c1\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4\u03c6\3"+
		"\2\2\2\u03c5\u03bd\3\2\2\2\u03c5\u03be\3\2\2\2\u03c5\u03bf\3\2\2\2\u03c5"+
		"\u03c0\3\2\2\2\u03c6\u0095\3\2\2\2\u03c7\u03c9\7\31\2\2\u03c8\u03ca\5"+
		"\u0098M\2\u03c9\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03c9\3\2\2\2"+
		"\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\7\32\2\2\u03ce\u0097"+
		"\3\2\2\2\u03cf\u03d0\7\6\2\2\u03d0\u03d1\5\b\5\2\u03d1\u03d3\5\u0088E"+
		"\2\u03d2\u03d4\5J&\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d6\7\25\2\2\u03d6\u03e1\3\2\2\2\u03d7\u03dd\5\u0088"+
		"E\2\u03d8\u03da\5J&\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03dc\7\13\2\2\u03dc\u03de\5F$\2\u03dd\u03d9\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03e1\5D#\2\u03e0\u03cf\3\2\2"+
		"\2\u03e0\u03d7\3\2\2\2\u03e0\u03df\3\2\2\2\u03e1\u0099\3\2\2\2\u03e2\u03e5"+
		"\5\b\5\2\u03e3\u03e5\5\u009cO\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3\3\2\2"+
		"\2\u03e5\u03e9\3\2\2\2\u03e6\u03e8\5\u0096L\2\u03e7\u03e6\3\2\2\2\u03e8"+
		"\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2"+
		"\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ed\5\u0086D\2\u03ed\u009b\3\2\2\2\u03ee"+
		"\u03ef\5\u008eH\2\u03ef\u03f0\7\21\2\2\u03f0\u009d\3\2\2\2\u03f1\u03f4"+
		"\7I\2\2\u03f2\u03f4\5\u00a8U\2\u03f3\u03f1\3\2\2\2\u03f3\u03f2\3\2\2\2"+
		"\u03f4\u009f\3\2\2\2\u03f5\u03f6\7H\2\2\u03f6\u00a1\3\2\2\2\u03f7\u03fa"+
		"\5\u009eP\2\u03f8\u03f9\7\20\2\2\u03f9\u03fb\5\u009eP\2\u03fa\u03f8\3"+
		"\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u00a3\3\2\2\2\u03fe\u0402\5\u00a0Q\2\u03ff\u0402\5\u009eP\2\u0400\u0402"+
		"\5\u00a2R\2\u0401\u03fe\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2"+
		"\2\u0402\u00a5\3\2\2\2\u0403\u0404\t\5\2\2\u0404\u00a7\3\2\2\2\u0405\u0420"+
		"\7\4\2\2\u0406\u0420\7\6\2\2\u0407\u0420\7\"\2\2\u0408\u0420\7#\2\2\u0409"+
		"\u0420\7$\2\2\u040a\u0420\7%\2\2\u040b\u0420\7&\2\2\u040c\u0420\7\'\2"+
		"\2\u040d\u0420\7(\2\2\u040e\u0420\7\n\2\2\u040f\u0420\7\62\2\2\u0410\u0420"+
		"\7)\2\2\u0411\u0420\7\7\2\2\u0412\u0420\7\b\2\2\u0413\u0420\7\t\2\2\u0414"+
		"\u0420\5\u00a6T\2\u0415\u0420\78\2\2\u0416\u0420\79\2\2\u0417\u0420\7"+
		";\2\2\u0418\u0420\7<\2\2\u0419\u0420\7=\2\2\u041a\u0420\7>\2\2\u041b\u0420"+
		"\7@\2\2\u041c\u0420\7B\2\2\u041d\u0420\7C\2\2\u041e\u0420\7D\2\2\u041f"+
		"\u0405\3\2\2\2\u041f\u0406\3\2\2\2\u041f\u0407\3\2\2\2\u041f\u0408\3\2"+
		"\2\2\u041f\u0409\3\2\2\2\u041f\u040a\3\2\2\2\u041f\u040b\3\2\2\2\u041f"+
		"\u040c\3\2\2\2\u041f\u040d\3\2\2\2\u041f\u040e\3\2\2\2\u041f\u040f\3\2"+
		"\2\2\u041f\u0410\3\2\2\2\u041f\u0411\3\2\2\2\u041f\u0412\3\2\2\2\u041f"+
		"\u0413\3\2\2\2\u041f\u0414\3\2\2\2\u041f\u0415\3\2\2\2\u041f\u0416\3\2"+
		"\2\2\u041f\u0417\3\2\2\2\u041f\u0418\3\2\2\2\u041f\u0419\3\2\2\2\u041f"+
		"\u041a\3\2\2\2\u041f\u041b\3\2\2\2\u041f\u041c\3\2\2\2\u041f\u041d\3\2"+
		"\2\2\u041f\u041e\3\2\2\2\u0420\u00a9\3\2\2\2\u0421\u0423\5\u00acW\2\u0422"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2"+
		"\2\2\u0425\u00ab\3\2\2\2\u0426\u0428\5\6\4\2\u0427\u0426\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042d\3\2"+
		"\2\2\u042b\u0429\3\2\2\2\u042c\u042e\5\u00aeX\2\u042d\u042c\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u00ad\3\2"+
		"\2\2\u0431\u0432\79\2\2\u0432\u0433\5H%\2\u0433\u0434\5L\'\2\u0434\u0435"+
		"\5f\64\2\u0435\u00af\3\2\2\2\u0436\u0438\7;\2\2\u0437\u0439\5\u00b2Z\2"+
		"\u0438\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\7<\2\2\u043d\u00b1\3\2\2\2\u043e"+
		"\u043f\5\u00b4[\2\u043f\u0440\7@\2\2\u0440\u0442\3\2\2\2\u0441\u043e\3"+
		"\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\7>\2\2\u0444"+
		"\u0446\5\u00b4[\2\u0445\u0447\5\u00b0Y\2\u0446\u0445\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u044a\5\6\4\2\u0449\u0448\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2"+
		"\2\2\u044d\u044e\7(\2\2\u044e\u044f\5\u00b4[\2\u044f\u0473\3\2\2\2\u0450"+
		"\u0451\5\u00b4[\2\u0451\u0454\7?\2\2\u0452\u0453\7@\2\2\u0453\u0455\5"+
		"\u00b4[\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0473\3\2\2\2"+
		"\u0456\u0457\5\u00b4[\2\u0457\u0458\7@\2\2\u0458\u045a\3\2\2\2\u0459\u0456"+
		"\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\7=\2\2\u045c"+
		"\u045e\5f\64\2\u045d\u045f\5\u00b0Y\2\u045e\u045d\3\2\2\2\u045e\u045f"+
		"\3\2\2\2\u045f\u0461\3\2\2\2\u0460\u0462\5\6\4\2\u0461\u0460\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2"+
		"\2\2\u0465\u0466\7(\2\2\u0466\u0467\5f\64\2\u0467\u0473\3\2\2\2\u0468"+
		"\u0469\5\u00b4[\2\u0469\u046a\7@\2\2\u046a\u046c\3\2\2\2\u046b\u0468\3"+
		"\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0470\5f\64\2\u046e"+
		"\u0471\7A\2\2\u046f\u0471\5\u00b0Y\2\u0470\u046e\3\2\2\2\u0470\u046f\3"+
		"\2\2\2\u0471\u0473\3\2\2\2\u0472\u0441\3\2\2\2\u0472\u0450\3\2\2\2\u0472"+
		"\u0459\3\2\2\2\u0472\u046b\3\2\2\2\u0473\u00b3\3\2\2\2\u0474\u0477\7:"+
		"\2\2\u0475\u0477\5\u009eP\2\u0476\u0474\3\2\2\2\u0476\u0475\3\2\2\2\u0477"+
		"\u00b5\3\2\2\2\u0478\u0479\7B\2\2\u0479\u047a\5\u00b2Z\2\u047a\u00b7\3"+
		"\2\2\2\u047b\u047c\7D\2\2\u047c\u047e\7C\2\2\u047d\u047f\5\6\4\2\u047e"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u0481\3\2"+
		"\2\2\u0481\u0482\3\2\2\2\u0482\u0483\7(\2\2\u0483\u0484\7C\2\2\u0484\u00b9"+
		"\3\2\2\2\u00a1\u00bd\u00c3\u00ca\u00d3\u00e3\u00ec\u00f5\u0100\u0104\u010f"+
		"\u011b\u0124\u0128\u0138\u013c\u0140\u0143\u0149\u014f\u0154\u015c\u0163"+
		"\u0168\u016d\u0175\u0182\u0187\u018b\u0193\u0196\u019f\u01a6\u01ab\u01b3"+
		"\u01b9\u01c0\u01c7\u01cb\u01d3\u01dc\u01df\u01e2\u01e7\u01ea\u01f0\u01f4"+
		"\u01fb\u0201\u0207\u0209\u020f\u0213\u0219\u021e\u0222\u0228\u0236\u023c"+
		"\u0249\u024e\u0252\u0254\u0258\u025f\u0266\u026b\u0274\u0278\u027c\u027f"+
		"\u0284\u028a\u028e\u0291\u0297\u029b\u029f\u02a1\u02a5\u02a9\u02af\u02b3"+
		"\u02bd\u02c0\u02c3\u02c8\u02cb\u02cf\u02d3\u02d7\u02da\u02e2\u02e9\u02ed"+
		"\u02f5\u02f9\u02fc\u0300\u0303\u0307\u0312\u0317\u0329\u032b\u0332\u0338"+
		"\u033a\u034c\u034f\u0355\u0360\u0362\u0367\u036c\u036f\u0373\u0378\u037f"+
		"\u0385\u038a\u038f\u0394\u0397\u039b\u03a0\u03a5\u03ac\u03b1\u03b6\u03bb"+
		"\u03c3\u03c5\u03cb\u03d3\u03d9\u03dd\u03e0\u03e4\u03e9\u03f3\u03fc\u0401"+
		"\u041f\u0424\u0429\u042f\u043a\u0441\u0446\u044b\u0454\u0459\u045e\u0463"+
		"\u046b\u0470\u0472\u0476\u0480";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}