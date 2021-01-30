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
		To=9, ResultMarker=10, SourceMarker=11, DeleteMarker=12, Reflexive=13, 
		And=14, Slash=15, Colon=16, Message=17, FieldReference=18, EndStringInterpolate=19, 
		SemiColon=20, Comma=21, Deconstructor=22, Invert=23, LeftParen=24, RightParen=25, 
		LeftBracket=26, RightBracket=27, LeftBrace=28, RightBrace=29, StartBytes=30, 
		StartMatcher=31, Lambda=32, StartTemplatesDefinition=33, StartSourceDefinition=34, 
		StartSinkDefinition=35, StartComposerDefinition=36, StartProcessorDefinition=37, 
		StartOperatorDefinition=38, EndDefinition=39, Rule=40, First=41, Last=42, 
		TemplateMatch=43, Range=44, Plus=45, Minus=46, Star=47, TruncateDivide=48, 
		Mod=49, Question=50, Equal=51, Else=52, EndMatcher=53, BeginCondition=54, 
		StartTestDefinition=55, Assert=56, CoreSystem=57, With=58, Provided=59, 
		Modified=60, Shadowed=61, Inherited=62, From=63, StandAlone=64, Use=65, 
		Program=66, Modify=67, Zero=68, PositiveInteger=69, START_STRING=70, STATE_IDENTIFIER=71, 
		IDENTIFIER=72, WS=73, Comment=74, REGEX_TEXT=75, END_REGEX=76, StartCharacterCode=77, 
		StartStringInterpolate=78, STRING_TEXT=79, END_STRING=80, Bytes=81, Bytes_WS=82, 
		EndBytes=83;
	public static final int
		RULE_program = 0, RULE_inclusion = 1, RULE_statement = 2, RULE_key = 3, 
		RULE_parameterDefinitions = 4, RULE_source = 5, RULE_sourceReference = 6, 
		RULE_reference = 7, RULE_structureReference = 8, RULE_lens = 9, RULE_dimensionReference = 10, 
		RULE_simpleDimension = 11, RULE_multiValueDimension = 12, RULE_projection = 13, 
		RULE_arrayLiteral = 14, RULE_valueProduction = 15, RULE_structureLiteral = 16, 
		RULE_relationLiteral = 17, RULE_bytesLiteral = 18, RULE_byteValue = 19, 
		RULE_structures = 20, RULE_keyValues = 21, RULE_keyValue = 22, RULE_templates = 23, 
		RULE_arrayIndexDecomposition = 24, RULE_sink = 25, RULE_templatesReference = 26, 
		RULE_parameterValues = 27, RULE_parameterValue = 28, RULE_templatesBody = 29, 
		RULE_matchTemplate = 30, RULE_block = 31, RULE_blockExpression = 32, RULE_resultValue = 33, 
		RULE_blockStatement = 34, RULE_sendToTemplates = 35, RULE_stateAssignment = 36, 
		RULE_stateSink = 37, RULE_valueChain = 38, RULE_transform = 39, RULE_matcher = 40, 
		RULE_criterion = 41, RULE_typeMatch = 42, RULE_structureContentMatcher = 43, 
		RULE_arrayContentMatcher = 44, RULE_literalMatch = 45, RULE_rangeBounds = 46, 
		RULE_condition = 47, RULE_lowerBound = 48, RULE_upperBound = 49, RULE_rangeLiteral = 50, 
		RULE_integerLiteral = 51, RULE_nonZeroInteger = 52, RULE_stringLiteral = 53, 
		RULE_stringContent = 54, RULE_stringInterpolate = 55, RULE_characterCode = 56, 
		RULE_interpolateEvaluate = 57, RULE_arithmeticExpression = 58, RULE_termArithmeticOperation = 59, 
		RULE_additiveOperator = 60, RULE_multiplicativeOperator = 61, RULE_term = 62, 
		RULE_operatorExpression = 63, RULE_operand = 64, RULE_composerBody = 65, 
		RULE_definedCompositionSequence = 66, RULE_compositionSequence = 67, RULE_compositionComponents = 68, 
		RULE_compositionComponent = 69, RULE_compositionMatcher = 70, RULE_structureMemberMatchers = 71, 
		RULE_structureMemberMatcher = 72, RULE_tokenMatcher = 73, RULE_compositionToken = 74, 
		RULE_literalComposition = 75, RULE_multiplier = 76, RULE_compositionSkipRule = 77, 
		RULE_compositionCapture = 78, RULE_compositionKeyValue = 79, RULE_compositionKey = 80, 
		RULE_localIdentifier = 81, RULE_stateIdentifier = 82, RULE_externalIdentifier = 83, 
		RULE_anyIdentifier = 84, RULE_arithmeticContextKeyword = 85, RULE_keyword = 86, 
		RULE_testBody = 87, RULE_testBlock = 88, RULE_assertion = 89, RULE_dependencyProvision = 90, 
		RULE_moduleConfiguration = 91, RULE_moduleIdentifier = 92, RULE_useModule = 93, 
		RULE_programModification = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "inclusion", "statement", "key", "parameterDefinitions", "source", 
			"sourceReference", "reference", "structureReference", "lens", "dimensionReference", 
			"simpleDimension", "multiValueDimension", "projection", "arrayLiteral", 
			"valueProduction", "structureLiteral", "relationLiteral", "bytesLiteral", 
			"byteValue", "structures", "keyValues", "keyValue", "templates", "arrayIndexDecomposition", 
			"sink", "templatesReference", "parameterValues", "parameterValue", "templatesBody", 
			"matchTemplate", "block", "blockExpression", "resultValue", "blockStatement", 
			"sendToTemplates", "stateAssignment", "stateSink", "valueChain", "transform", 
			"matcher", "criterion", "typeMatch", "structureContentMatcher", "arrayContentMatcher", 
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
			"'stereotype'", "'->'", "'!'", "'$'", "'^'", "'\u00A7'", "'&'", "'/'", 
			"':'", null, null, null, "';'", "','", "'...'", "'~'", null, null, "'['", 
			"']'", "'{'", "'}'", "'[x'", "'<'", "'\\'", "'templates'", "'source'", 
			"'sink'", "'composer'", "'processor'", "'operator'", "'end'", "'rule'", 
			"'first'", "'last'", "'#'", "'..'", "'+'", "'-'", "'*'", "'~/'", "'mod'", 
			"'?'", "'='", "'|'", "'>'", null, "'test'", "'assert'", "'core-system/'", 
			"'with'", "'provided'", "'modified'", "'shadowed'", "'inherited'", "'from'", 
			"'stand-alone'", "'use'", "'program'", "'modify'", "'0'", null, null, 
			null, null, null, null, null, "'''", null, null, null, null, null, null, 
			"'x]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "StartComment", "Include", "Void", "Def", "When", "Do", "Otherwise", 
			"StereotypeDefinition", "To", "ResultMarker", "SourceMarker", "DeleteMarker", 
			"Reflexive", "And", "Slash", "Colon", "Message", "FieldReference", "EndStringInterpolate", 
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
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					useModule();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					inclusion();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(202);
			statement();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				{
				setState(203);
				statement();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
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
			setState(211);
			match(Include);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(212);
				localIdentifier();
				setState(213);
				match(From);
				}
			}

			setState(217);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(Def);
				setState(220);
				key();
				setState(221);
				valueProduction();
				setState(222);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new ValueChainToSinkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				valueChain();
				setState(225);
				match(To);
				setState(226);
				sink();
				}
				break;
			case 3:
				_localctx = new TemplatesDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				localIdentifier();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(230);
					parameterDefinitions();
					}
				}

				setState(233);
				templatesBody();
				setState(234);
				match(EndDefinition);
				setState(235);
				localIdentifier();
				}
				break;
			case 4:
				_localctx = new ProcessorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(StartProcessorDefinition);
				setState(238);
				localIdentifier();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(239);
					parameterDefinitions();
					}
				}

				setState(242);
				block();
				setState(243);
				match(EndDefinition);
				setState(244);
				localIdentifier();
				}
				break;
			case 5:
				_localctx = new ComposerDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(StartComposerDefinition);
				setState(247);
				localIdentifier();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(248);
					parameterDefinitions();
					}
				}

				setState(251);
				composerBody();
				setState(252);
				match(EndDefinition);
				setState(253);
				localIdentifier();
				}
				break;
			case 6:
				_localctx = new TestDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(StartTestDefinition);
				setState(256);
				stringLiteral();
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(257);
						useModule();
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(263);
					programModification();
					}
					break;
				}
				setState(266);
				testBody();
				setState(267);
				match(EndDefinition);
				setState(268);
				stringLiteral();
				}
				break;
			case 7:
				_localctx = new OperatorDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(StartOperatorDefinition);
				setState(271);
				match(LeftParen);
				setState(272);
				localIdentifier();
				setState(273);
				localIdentifier();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(274);
					parameterDefinitions();
					}
				}

				setState(277);
				localIdentifier();
				setState(278);
				match(RightParen);
				setState(279);
				templatesBody();
				setState(280);
				match(EndDefinition);
				setState(281);
				localIdentifier();
				}
				break;
			case 8:
				_localctx = new StereotypeDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				match(StereotypeDefinition);
				setState(284);
				localIdentifier();
				setState(285);
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
			setState(289);
			localIdentifier();
			setState(290);
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
			setState(292);
			match(And);
			setState(293);
			match(LeftBrace);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				key();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(295);
					match(Comma);
					}
				}

				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(302);
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
		public RelationLiteralContext relationLiteral() {
			return getRuleContext(RelationLiteralContext.class,0);
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
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				stringLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				rangeLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				arrayLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				relationLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				structureLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				bytesLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(LeftParen);
				setState(312);
				keyValue();
				setState(313);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(315);
				arithmeticExpression(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(316);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode SourceMarker() { return getToken(TailspinParser.SourceMarker, 0); }
		public TerminalNode Reflexive() { return getToken(TailspinParser.Reflexive, 0); }
		public TerminalNode Message() { return getToken(TailspinParser.Message, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public AnyIdentifierContext anyIdentifier() {
			return getRuleContext(AnyIdentifierContext.class,0);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case Reflexive:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SourceMarker:
					{
					setState(319);
					match(SourceMarker);
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(320);
						anyIdentifier();
						}
						break;
					}
					}
					break;
				case Reflexive:
					{
					setState(323);
					match(Reflexive);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				reference();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(327);
					match(Message);
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(330);
					parameterValues();
					}
					break;
				}
				}
				break;
			case DeleteMarker:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(DeleteMarker);
				setState(334);
				stateIdentifier();
				setState(335);
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
		public LensContext lens() {
			return getRuleContext(LensContext.class,0);
		}
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
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(339);
				lens();
				}
				break;
			}
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					structureReference();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public LensContext lens() {
			return getRuleContext(LensContext.class,0);
		}
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
			setState(348);
			match(FieldReference);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(349);
				lens();
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

	public static class LensContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TailspinParser.LeftParen, 0); }
		public List<DimensionReferenceContext> dimensionReference() {
			return getRuleContexts(DimensionReferenceContext.class);
		}
		public DimensionReferenceContext dimensionReference(int i) {
			return getRuleContext(DimensionReferenceContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(TailspinParser.RightParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(TailspinParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(TailspinParser.SemiColon, i);
		}
		public LensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lens; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitLens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LensContext lens() throws RecognitionException {
		LensContext _localctx = new LensContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LeftParen);
			setState(353);
			dimensionReference();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(354);
				match(SemiColon);
				setState(355);
				dimensionReference();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
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

	public static class DimensionReferenceContext extends ParserRuleContext {
		public SimpleDimensionContext simpleDimension() {
			return getRuleContext(SimpleDimensionContext.class,0);
		}
		public MultiValueDimensionContext multiValueDimension() {
			return getRuleContext(MultiValueDimensionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
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
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				simpleDimension();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				multiValueDimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				projection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				key();
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
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
			setState(374);
			match(LeftBracket);
			setState(375);
			simpleDimension();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(376);
				match(Comma);
				setState(377);
				simpleDimension();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
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

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
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
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LeftBrace);
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(386);
					key();
					}
					break;
				case 2:
					{
					setState(387);
					keyValue();
					}
					break;
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(390);
					match(Comma);
					}
				}

				}
				}
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(397);
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
		enterRule(_localctx, 28, RULE_arrayLiteral);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(LeftBracket);
				setState(400);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(LeftBracket);
				setState(402);
				valueProduction();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(403);
					match(Comma);
					setState(404);
					valueProduction();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
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
		enterRule(_localctx, 30, RULE_valueProduction);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
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
		enterRule(_localctx, 32, RULE_structureLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(LeftBrace);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(419);
				keyValues();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(420);
					match(Comma);
					setState(421);
					keyValues();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
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

	public static class RelationLiteralContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TailspinParser.LeftBrace, 0); }
		public TerminalNode LeftBracket() { return getToken(TailspinParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TailspinParser.RightBracket, 0); }
		public TerminalNode RightBrace() { return getToken(TailspinParser.RightBrace, 0); }
		public List<StructuresContext> structures() {
			return getRuleContexts(StructuresContext.class);
		}
		public StructuresContext structures(int i) {
			return getRuleContext(StructuresContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TailspinParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TailspinParser.Comma, i);
		}
		public RelationLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitRelationLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationLiteralContext relationLiteral() throws RecognitionException {
		RelationLiteralContext _localctx = new RelationLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(LeftBrace);
			setState(432);
			match(LeftBracket);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(433);
				structures();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(434);
					match(Comma);
					setState(435);
					structures();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
			match(RightBracket);
			setState(444);
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
		enterRule(_localctx, 36, RULE_bytesLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(StartBytes);
			setState(447);
			byteValue();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(448);
				byteValue();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
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
		enterRule(_localctx, 38, RULE_byteValue);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bytes:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(Bytes);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
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

	public static class StructuresContext extends ParserRuleContext {
		public StructureLiteralContext structureLiteral() {
			return getRuleContext(StructureLiteralContext.class,0);
		}
		public ValueProductionContext valueProduction() {
			return getRuleContext(ValueProductionContext.class,0);
		}
		public SourceReferenceContext sourceReference() {
			return getRuleContext(SourceReferenceContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TailspinParserVisitor ) return ((TailspinParserVisitor<? extends T>)visitor).visitStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structures);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				structureLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
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
		enterRule(_localctx, 42, RULE_keyValues);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
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
		enterRule(_localctx, 44, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			key();
			setState(471);
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
		enterRule(_localctx, 46, RULE_templates);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				source();
				}
				break;
			case 2:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(Lambda);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(475);
					localIdentifier();
					}
				}

				setState(478);
				match(LeftParen);
				setState(479);
				templatesBody();
				setState(480);
				match(Lambda);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(481);
					localIdentifier();
					}
				}

				setState(484);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(Lambda);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(488);
					localIdentifier();
					}
				}

				setState(491);
				arrayIndexDecomposition();
				setState(492);
				match(LeftParen);
				setState(493);
				templatesBody();
				setState(494);
				match(Lambda);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(495);
					localIdentifier();
					}
				}

				setState(498);
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
		enterRule(_localctx, 48, RULE_arrayIndexDecomposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(LeftBracket);
			setState(503);
			localIdentifier();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(504);
				match(SemiColon);
				setState(505);
				localIdentifier();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
		enterRule(_localctx, 50, RULE_sink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(ResultMarker);
			setState(523);
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
				setState(514);
				anyIdentifier();
				setState(515);
				reference();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(516);
					match(Message);
					}
				}

				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(519);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(522);
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
		enterRule(_localctx, 52, RULE_templatesReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			anyIdentifier();
			setState(526);
			reference();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(527);
				match(Message);
				}
			}

			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(530);
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
		enterRule(_localctx, 54, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(And);
			setState(534);
			match(LeftBrace);
			setState(539); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(535);
				parameterValue();
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(536);
					match(Comma);
					}
				}

				}
				}
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(543);
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
		enterRule(_localctx, 56, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			key();
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(546);
				valueChain();
				}
				break;
			case 2:
				{
				setState(547);
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
		enterRule(_localctx, 58, RULE_templatesBody);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				block();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(551);
					matchTemplate();
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(557);
					matchTemplate();
					}
					}
					setState(560); 
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
		enterRule(_localctx, 60, RULE_matchTemplate);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				matcher();
				setState(565);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(567);
					match(When);
					}
				}

				setState(570);
				matcher();
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(571);
					match(Do);
					}
					break;
				}
				setState(574);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(Otherwise);
				setState(577);
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
		enterRule(_localctx, 62, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
			case Reflexive:
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
				setState(581); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(580);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(583); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(585);
				match(ResultMarker);
				setState(586);
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
		enterRule(_localctx, 64, RULE_blockExpression);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
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
		enterRule(_localctx, 66, RULE_resultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			valueChain();
			setState(596);
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
		enterRule(_localctx, 68, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
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
		enterRule(_localctx, 70, RULE_sendToTemplates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			valueChain();
			setState(601);
			match(To);
			setState(602);
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
		enterRule(_localctx, 72, RULE_stateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(604);
				valueChain();
				setState(605);
				match(To);
				}
				break;
			}
			setState(609);
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
		enterRule(_localctx, 74, RULE_stateSink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(611);
				match(Range);
				setState(612);
				match(Else);
				}
			}

			setState(615);
			stateIdentifier();
			setState(616);
			reference();
			setState(617);
			match(Colon);
			setState(618);
			valueProduction();
			setState(619);
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
		enterRule(_localctx, 76, RULE_valueChain);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				source();
				setState(623);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
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
		enterRule(_localctx, 78, RULE_transform);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(To);
				setState(629);
				templates();
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(630);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(Deconstructor);
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(634);
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
		enterRule(_localctx, 80, RULE_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(StartMatcher);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(640);
				match(Invert);
				}
			}

			setState(643);
			criterion();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(644);
				match(Else);
				setState(645);
				criterion();
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(651);
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
		enterRule(_localctx, 82, RULE_criterion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(653);
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
			case Reflexive:
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
				setState(654);
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
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginCondition) {
				{
				{
				setState(657);
				condition();
				}
				}
				setState(662);
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
		enterRule(_localctx, 84, RULE_typeMatch);
		int _la;
		try {
			int _alt;
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(LeftBrace);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(666);
					key();
					setState(667);
					structureContentMatcher();
					setState(669);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(668);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(676);
						match(Comma);
						}
					}

					setState(679);
					match(Void);
					}
				}

				setState(682);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				match(LeftBracket);
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(684);
					arrayContentMatcher();
					}
				}

				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(687);
						match(Comma);
						setState(688);
						arrayContentMatcher();
						}
						} 
					}
					setState(693);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(694);
						match(Comma);
						}
					}

					setState(697);
					match(Void);
					}
				}

				setState(700);
				match(RightBracket);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(701);
					match(LeftParen);
					setState(704);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(702);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(703);
						arithmeticExpression(0);
						}
						break;
					}
					setState(706);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(710);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(711);
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
		enterRule(_localctx, 86, RULE_structureContentMatcher);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
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
		enterRule(_localctx, 88, RULE_arrayContentMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			matcher();
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(721);
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
		enterRule(_localctx, 90, RULE_literalMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(Equal);
			setState(725);
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
		enterRule(_localctx, 92, RULE_rangeBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(727);
				lowerBound();
				}
			}

			setState(730);
			match(Range);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (Invert - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(731);
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
		enterRule(_localctx, 94, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(BeginCondition);
			setState(735);
			valueChain();
			setState(736);
			matcher();
			setState(737);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		enterRule(_localctx, 96, RULE_lowerBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(739);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(740);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(741);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(742);
				term();
				}
				break;
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(745);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		enterRule(_localctx, 98, RULE_upperBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(748);
				match(Invert);
				}
			}

			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(751);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(752);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(753);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(754);
				term();
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
		enterRule(_localctx, 100, RULE_rangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(757);
				lowerBound();
				}
			}

			setState(760);
			match(Range);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(761);
				upperBound();
				}
				break;
			}
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(764);
				match(Colon);
				setState(765);
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
		enterRule(_localctx, 102, RULE_integerLiteral);
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
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
		enterRule(_localctx, 104, RULE_nonZeroInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(772);
				additiveOperator();
				}
			}

			setState(775);
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
		enterRule(_localctx, 106, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(START_STRING);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (StartCharacterCode - 77)) | (1L << (StartStringInterpolate - 77)) | (1L << (STRING_TEXT - 77)))) != 0)) {
				{
				{
				setState(778);
				stringContent();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
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
		enterRule(_localctx, 108, RULE_stringContent);
		try {
			setState(788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
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
		enterRule(_localctx, 110, RULE_stringInterpolate);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
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
		enterRule(_localctx, 112, RULE_characterCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(StartCharacterCode);
			setState(795);
			arithmeticExpression(0);
			setState(796);
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
		enterRule(_localctx, 114, RULE_interpolateEvaluate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(StartStringInterpolate);
			setState(811);
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
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(799);
					anyIdentifier();
					}
				}

				setState(802);
				reference();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(803);
					match(Message);
					}
				}

				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(806);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(809);
				match(Colon);
				setState(810);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(813);
				transform();
				}
				break;
			}
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(816);
				match(To);
				setState(817);
				match(TemplateMatch);
				}
			}

			setState(820);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(823);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(824);
				match(LeftParen);
				setState(825);
				arithmeticExpression(0);
				setState(826);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(828);
					additiveOperator();
					}
				}

				setState(831);
				sourceReference();
				}
				break;
			case 4:
				{
				setState(832);
				arithmeticContextKeyword();
				}
				break;
			case 5:
				{
				setState(833);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(836);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(837);
						multiplicativeOperator();
						setState(838);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(840);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(841);
						additiveOperator();
						setState(842);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(844);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(845);
						multiplicativeOperator();
						setState(846);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(848);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(849);
						additiveOperator();
						setState(850);
						term();
						}
						break;
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		enterRule(_localctx, 118, RULE_termArithmeticOperation);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				term();
				setState(858);
				multiplicativeOperator();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(859);
					term();
					}
					break;
				case 2:
					{
					setState(860);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				term();
				setState(864);
				additiveOperator();
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(865);
					term();
					}
					break;
				case 2:
					{
					setState(866);
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
		enterRule(_localctx, 120, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
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
		enterRule(_localctx, 122, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
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
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
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
		enterRule(_localctx, 124, RULE_term);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				match(LeftParen);
				setState(876);
				valueProduction();
				setState(877);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
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
		enterRule(_localctx, 126, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LeftParen);
			setState(883);
			operand();
			setState(884);
			templatesReference();
			setState(885);
			operand();
			setState(886);
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
		enterRule(_localctx, 128, RULE_operand);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
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
		enterRule(_localctx, 130, RULE_composerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(892);
				stateAssignment();
				}
				break;
			}
			setState(895);
			compositionSequence();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(896);
				definedCompositionSequence();
				}
				}
				setState(901);
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
		enterRule(_localctx, 132, RULE_definedCompositionSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(Rule);
			setState(903);
			key();
			setState(904);
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
		enterRule(_localctx, 134, RULE_compositionSequence);
		int _la;
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(907);
					compositionSkipRule();
					}
					}
					setState(910); 
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
		enterRule(_localctx, 136, RULE_compositionComponents);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(914);
					compositionSkipRule();
					}
					} 
				}
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(920);
			compositionComponent();
			setState(925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(921);
					match(Comma);
					}
				}

				setState(924);
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
		enterRule(_localctx, 138, RULE_compositionComponent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			compositionMatcher();
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(928);
				transform();
				}
				break;
			}
			setState(934);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(931);
					compositionSkipRule();
					}
					} 
				}
				setState(936);
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
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
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
		enterRule(_localctx, 140, RULE_compositionMatcher);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(LeftBracket);
				setState(941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(939);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(940);
					compositionSkipRule();
					}
					break;
				}
				setState(943);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(LeftBrace);
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(945);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(946);
					compositionSkipRule();
					}
					break;
				}
				setState(949);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(951);
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
		enterRule(_localctx, 142, RULE_structureMemberMatchers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(954);
				compositionSkipRule();
				}
				}
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			structureMemberMatcher();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(961);
					match(Comma);
					}
				}

				setState(964);
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
		enterRule(_localctx, 144, RULE_structureMemberMatcher);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(967);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(968);
				compositionKeyValue();
				}
				break;
			}
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(971);
					compositionSkipRule();
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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
		enterRule(_localctx, 146, RULE_tokenMatcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(StartMatcher);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(978);
				match(Invert);
				}
			}

			setState(981);
			compositionToken();
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(982);
				match(Else);
				setState(983);
				compositionToken();
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
			match(EndMatcher);
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(990);
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
		enterRule(_localctx, 148, RULE_compositionToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(993);
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
				setState(994);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(995);
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
		enterRule(_localctx, 150, RULE_literalComposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(Equal);
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
				{
				setState(999);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(1000);
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
		enterRule(_localctx, 152, RULE_multiplier);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(1003);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(1005);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(1006);
				match(Equal);
				setState(1009);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(1007);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
					{
					setState(1008);
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
		enterRule(_localctx, 154, RULE_compositionSkipRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(LeftParen);
			setState(1015); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1014);
				compositionCapture();
				}
				}
				setState(1017); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(1019);
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
		enterRule(_localctx, 156, RULE_compositionCapture);
		int _la;
		try {
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1021);
				match(Def);
				setState(1022);
				key();
				setState(1023);
				compositionMatcher();
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1024);
					transform();
					}
				}

				setState(1027);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1029);
				compositionMatcher();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1031);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(1030);
						transform();
						}
						break;
					}
					setState(1033);
					match(To);
					setState(1034);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
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
		enterRule(_localctx, 158, RULE_compositionKeyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
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
				setState(1040);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(1041);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1044);
					compositionSkipRule();
					}
					} 
				}
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1050);
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
		enterRule(_localctx, 160, RULE_compositionKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			tokenMatcher();
			setState(1053);
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
		enterRule(_localctx, 162, RULE_localIdentifier);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
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
				setState(1056);
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
		enterRule(_localctx, 164, RULE_stateIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
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
		enterRule(_localctx, 166, RULE_externalIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			localIdentifier();
			setState(1064); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1062);
					match(Slash);
					setState(1063);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1066); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		enterRule(_localctx, 168, RULE_anyIdentifier);
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
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
		enterRule(_localctx, 170, RULE_arithmeticContextKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
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
		enterRule(_localctx, 172, RULE_keyword);
		try {
			setState(1101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1079);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1080);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1082);
				match(StartOperatorDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1083);
				match(EndDefinition);
				}
				break;
			case StereotypeDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1084);
				match(StereotypeDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 11);
				{
				setState(1085);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 12);
				{
				setState(1086);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 13);
				{
				setState(1087);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 14);
				{
				setState(1088);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 15);
				{
				setState(1089);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 16);
				{
				setState(1090);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 17);
				{
				setState(1091);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 18);
				{
				setState(1092);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 19);
				{
				setState(1093);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 20);
				{
				setState(1094);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 21);
				{
				setState(1095);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 22);
				{
				setState(1096);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 23);
				{
				setState(1097);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 24);
				{
				setState(1098);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 25);
				{
				setState(1099);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 26);
				{
				setState(1100);
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
		enterRule(_localctx, 174, RULE_testBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1103);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		enterRule(_localctx, 176, RULE_testBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1108);
					statement();
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1114);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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
		enterRule(_localctx, 178, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(Assert);
			setState(1120);
			valueChain();
			setState(1121);
			matcher();
			setState(1122);
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
		enterRule(_localctx, 180, RULE_dependencyProvision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(With);
			setState(1126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1125);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1130);
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
		enterRule(_localctx, 182, RULE_moduleConfiguration);
		int _la;
		try {
			int _alt;
			setState(1184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1132);
					moduleIdentifier();
					setState(1133);
					match(From);
					}
					break;
				}
				setState(1137);
				match(Shadowed);
				setState(1138);
				moduleIdentifier();
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1139);
					dependencyProvision();
					}
					break;
				}
				setState(1143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1142);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1147);
				match(EndDefinition);
				setState(1148);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				moduleIdentifier();
				setState(1151);
				match(Inherited);
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1152);
					match(From);
					setState(1153);
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
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1156);
					moduleIdentifier();
					setState(1157);
					match(From);
					}
					break;
				}
				setState(1161);
				match(Modified);
				setState(1162);
				stringLiteral();
				setState(1164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1163);
					dependencyProvision();
					}
					break;
				}
				setState(1167); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1166);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1169); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1171);
				match(EndDefinition);
				setState(1172);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1174);
					moduleIdentifier();
					setState(1175);
					match(From);
					}
				}

				setState(1179);
				stringLiteral();
				setState(1182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1180);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1181);
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
		enterRule(_localctx, 184, RULE_moduleIdentifier);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
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
				setState(1187);
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
		enterRule(_localctx, 186, RULE_useModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(Use);
			setState(1191);
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
		enterRule(_localctx, 188, RULE_programModification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(Modify);
			setState(1194);
			match(Program);
			setState(1196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1195);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1200);
			match(EndDefinition);
			setState(1201);
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
		case 58:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u04b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\7\2\u00c2\n\2\f\2\16\2\u00c5\13\2\3\2\7\2\u00c8\n\2\f\2\16\2"+
		"\u00cb\13\2\3\2\3\2\7\2\u00cf\n\2\f\2\16\2\u00d2\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3\u00da\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00ea\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f3\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\u00fc\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0105"+
		"\n\4\f\4\16\4\u0108\13\4\3\4\5\4\u010b\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0116\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0122"+
		"\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u012b\n\6\6\6\u012d\n\6\r\6\16\6"+
		"\u012e\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0140\n\7\3\b\3\b\5\b\u0144\n\b\3\b\5\b\u0147\n\b\3\b\3\b\5\b\u014b\n"+
		"\b\3\b\5\b\u014e\n\b\3\b\3\b\3\b\3\b\5\b\u0154\n\b\3\t\5\t\u0157\n\t\3"+
		"\t\7\t\u015a\n\t\f\t\16\t\u015d\13\t\3\n\3\n\5\n\u0161\n\n\3\13\3\13\3"+
		"\13\3\13\7\13\u0167\n\13\f\13\16\13\u016a\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\5\f\u0172\n\f\3\r\3\r\3\r\5\r\u0177\n\r\3\16\3\16\3\16\3\16\7\16"+
		"\u017d\n\16\f\16\16\16\u0180\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u0187"+
		"\n\17\3\17\5\17\u018a\n\17\6\17\u018c\n\17\r\17\16\17\u018d\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0198\n\20\f\20\16\20\u019b\13\20"+
		"\3\20\3\20\5\20\u019f\n\20\3\21\3\21\5\21\u01a3\n\21\3\22\3\22\3\22\3"+
		"\22\7\22\u01a9\n\22\f\22\16\22\u01ac\13\22\5\22\u01ae\n\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u01b7\n\23\f\23\16\23\u01ba\13\23\5\23\u01bc"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u01c4\n\24\f\24\16\24\u01c7\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u01cd\n\25\3\26\3\26\3\26\5\26\u01d2\n\26"+
		"\3\27\3\27\3\27\5\27\u01d7\n\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01df"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u01e5\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01ec\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u01f3\n\31\3\31\3\31\5\31\u01f7"+
		"\n\31\3\32\3\32\3\32\3\32\7\32\u01fd\n\32\f\32\16\32\u0200\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u0208\n\33\3\33\5\33\u020b\n\33\3\33\5"+
		"\33\u020e\n\33\3\34\3\34\3\34\5\34\u0213\n\34\3\34\5\34\u0216\n\34\3\35"+
		"\3\35\3\35\3\35\5\35\u021c\n\35\6\35\u021e\n\35\r\35\16\35\u021f\3\35"+
		"\3\35\3\36\3\36\3\36\5\36\u0227\n\36\3\37\3\37\7\37\u022b\n\37\f\37\16"+
		"\37\u022e\13\37\3\37\6\37\u0231\n\37\r\37\16\37\u0232\5\37\u0235\n\37"+
		"\3 \3 \3 \3 \5 \u023b\n \3 \3 \5 \u023f\n \3 \3 \3 \3 \5 \u0245\n \3!"+
		"\6!\u0248\n!\r!\16!\u0249\3!\3!\5!\u024e\n!\3\"\3\"\3\"\3\"\5\"\u0254"+
		"\n\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\5&\u0262\n&\3&\3&\3\'\3\'\5\'"+
		"\u0268\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0275\n(\3)\3)\3"+
		")\5)\u027a\n)\3)\3)\5)\u027e\n)\5)\u0280\n)\3*\3*\5*\u0284\n*\3*\3*\3"+
		"*\7*\u0289\n*\f*\16*\u028c\13*\3*\3*\3+\3+\5+\u0292\n+\3+\7+\u0295\n+"+
		"\f+\16+\u0298\13+\3,\3,\3,\3,\3,\3,\5,\u02a0\n,\7,\u02a2\n,\f,\16,\u02a5"+
		"\13,\3,\5,\u02a8\n,\3,\5,\u02ab\n,\3,\3,\3,\5,\u02b0\n,\3,\3,\7,\u02b4"+
		"\n,\f,\16,\u02b7\13,\3,\5,\u02ba\n,\3,\5,\u02bd\n,\3,\3,\3,\3,\5,\u02c3"+
		"\n,\3,\3,\5,\u02c7\n,\3,\3,\5,\u02cb\n,\5,\u02cd\n,\3-\3-\5-\u02d1\n-"+
		"\3.\3.\5.\u02d5\n.\3/\3/\3/\3\60\5\60\u02db\n\60\3\60\3\60\5\60\u02df"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u02ea\n\62\3\62"+
		"\5\62\u02ed\n\62\3\63\5\63\u02f0\n\63\3\63\3\63\3\63\3\63\5\63\u02f6\n"+
		"\63\3\64\5\64\u02f9\n\64\3\64\3\64\5\64\u02fd\n\64\3\64\3\64\5\64\u0301"+
		"\n\64\3\65\3\65\5\65\u0305\n\65\3\66\5\66\u0308\n\66\3\66\3\66\3\67\3"+
		"\67\7\67\u030e\n\67\f\67\16\67\u0311\13\67\3\67\3\67\38\38\58\u0317\n"+
		"8\39\39\59\u031b\n9\3:\3:\3:\3:\3;\3;\5;\u0323\n;\3;\3;\5;\u0327\n;\3"+
		";\5;\u032a\n;\3;\3;\5;\u032e\n;\3;\5;\u0331\n;\3;\3;\5;\u0335\n;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\5<\u0340\n<\3<\3<\3<\5<\u0345\n<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u0357\n<\f<\16<\u035a\13<\3=\3="+
		"\3=\3=\5=\u0360\n=\3=\3=\3=\3=\5=\u0366\n=\5=\u0368\n=\3>\3>\3?\3?\3@"+
		"\3@\3@\3@\3@\5@\u0373\n@\3A\3A\3A\3A\3A\3A\3B\3B\5B\u037d\nB\3C\5C\u0380"+
		"\nC\3C\3C\7C\u0384\nC\fC\16C\u0387\13C\3D\3D\3D\3D\3E\3E\6E\u038f\nE\r"+
		"E\16E\u0390\5E\u0393\nE\3F\7F\u0396\nF\fF\16F\u0399\13F\3F\3F\5F\u039d"+
		"\nF\3F\5F\u03a0\nF\3G\3G\5G\u03a4\nG\3G\7G\u03a7\nG\fG\16G\u03aa\13G\3"+
		"H\3H\3H\3H\5H\u03b0\nH\3H\3H\3H\3H\5H\u03b6\nH\3H\3H\3H\5H\u03bb\nH\3"+
		"I\7I\u03be\nI\fI\16I\u03c1\13I\3I\3I\5I\u03c5\nI\3I\5I\u03c8\nI\3J\3J"+
		"\5J\u03cc\nJ\3J\7J\u03cf\nJ\fJ\16J\u03d2\13J\3K\3K\5K\u03d6\nK\3K\3K\3"+
		"K\7K\u03db\nK\fK\16K\u03de\13K\3K\3K\5K\u03e2\nK\3L\3L\3L\5L\u03e7\nL"+
		"\3M\3M\3M\5M\u03ec\nM\3N\3N\3N\3N\3N\3N\5N\u03f4\nN\5N\u03f6\nN\3O\3O"+
		"\6O\u03fa\nO\rO\16O\u03fb\3O\3O\3P\3P\3P\3P\5P\u0404\nP\3P\3P\3P\3P\5"+
		"P\u040a\nP\3P\3P\5P\u040e\nP\3P\5P\u0411\nP\3Q\3Q\5Q\u0415\nQ\3Q\7Q\u0418"+
		"\nQ\fQ\16Q\u041b\13Q\3Q\3Q\3R\3R\3R\3S\3S\5S\u0424\nS\3T\3T\3U\3U\3U\6"+
		"U\u042b\nU\rU\16U\u042c\3V\3V\3V\5V\u0432\nV\3W\3W\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0450\n"+
		"X\3Y\6Y\u0453\nY\rY\16Y\u0454\3Z\7Z\u0458\nZ\fZ\16Z\u045b\13Z\3Z\6Z\u045e"+
		"\nZ\rZ\16Z\u045f\3[\3[\3[\3[\3[\3\\\3\\\6\\\u0469\n\\\r\\\16\\\u046a\3"+
		"\\\3\\\3]\3]\3]\5]\u0472\n]\3]\3]\3]\5]\u0477\n]\3]\6]\u047a\n]\r]\16"+
		"]\u047b\3]\3]\3]\3]\3]\3]\3]\5]\u0485\n]\3]\3]\3]\5]\u048a\n]\3]\3]\3"+
		"]\5]\u048f\n]\3]\6]\u0492\n]\r]\16]\u0493\3]\3]\3]\3]\3]\3]\5]\u049c\n"+
		"]\3]\3]\3]\5]\u04a1\n]\5]\u04a3\n]\3^\3^\5^\u04a7\n^\3_\3_\3_\3`\3`\3"+
		"`\6`\u04af\n`\r`\16`\u04b0\3`\3`\3`\3`\2\3va\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\6\3\2#%\3\2/\60\3\2"+
		"\61\63\3\2+,\2\u0547\2\u00c3\3\2\2\2\4\u00d5\3\2\2\2\6\u0121\3\2\2\2\b"+
		"\u0123\3\2\2\2\n\u0126\3\2\2\2\f\u013f\3\2\2\2\16\u0153\3\2\2\2\20\u0156"+
		"\3\2\2\2\22\u015e\3\2\2\2\24\u0162\3\2\2\2\26\u0171\3\2\2\2\30\u0176\3"+
		"\2\2\2\32\u0178\3\2\2\2\34\u0183\3\2\2\2\36\u019e\3\2\2\2 \u01a2\3\2\2"+
		"\2\"\u01a4\3\2\2\2$\u01b1\3\2\2\2&\u01c0\3\2\2\2(\u01cc\3\2\2\2*\u01d1"+
		"\3\2\2\2,\u01d6\3\2\2\2.\u01d8\3\2\2\2\60\u01f6\3\2\2\2\62\u01f8\3\2\2"+
		"\2\64\u0203\3\2\2\2\66\u020f\3\2\2\28\u0217\3\2\2\2:\u0223\3\2\2\2<\u0234"+
		"\3\2\2\2>\u0244\3\2\2\2@\u024d\3\2\2\2B\u0253\3\2\2\2D\u0255\3\2\2\2F"+
		"\u0258\3\2\2\2H\u025a\3\2\2\2J\u0261\3\2\2\2L\u0267\3\2\2\2N\u0274\3\2"+
		"\2\2P\u027f\3\2\2\2R\u0281\3\2\2\2T\u0291\3\2\2\2V\u02cc\3\2\2\2X\u02d0"+
		"\3\2\2\2Z\u02d2\3\2\2\2\\\u02d6\3\2\2\2^\u02da\3\2\2\2`\u02e0\3\2\2\2"+
		"b\u02e9\3\2\2\2d\u02ef\3\2\2\2f\u02f8\3\2\2\2h\u0304\3\2\2\2j\u0307\3"+
		"\2\2\2l\u030b\3\2\2\2n\u0316\3\2\2\2p\u031a\3\2\2\2r\u031c\3\2\2\2t\u0320"+
		"\3\2\2\2v\u0344\3\2\2\2x\u0367\3\2\2\2z\u0369\3\2\2\2|\u036b\3\2\2\2~"+
		"\u0372\3\2\2\2\u0080\u0374\3\2\2\2\u0082\u037c\3\2\2\2\u0084\u037f\3\2"+
		"\2\2\u0086\u0388\3\2\2\2\u0088\u0392\3\2\2\2\u008a\u0397\3\2\2\2\u008c"+
		"\u03a1\3\2\2\2\u008e\u03ba\3\2\2\2\u0090\u03bf\3\2\2\2\u0092\u03cb\3\2"+
		"\2\2\u0094\u03d3\3\2\2\2\u0096\u03e6\3\2\2\2\u0098\u03e8\3\2\2\2\u009a"+
		"\u03f5\3\2\2\2\u009c\u03f7\3\2\2\2\u009e\u0410\3\2\2\2\u00a0\u0414\3\2"+
		"\2\2\u00a2\u041e\3\2\2\2\u00a4\u0423\3\2\2\2\u00a6\u0425\3\2\2\2\u00a8"+
		"\u0427\3\2\2\2\u00aa\u0431\3\2\2\2\u00ac\u0433\3\2\2\2\u00ae\u044f\3\2"+
		"\2\2\u00b0\u0452\3\2\2\2\u00b2\u0459\3\2\2\2\u00b4\u0461\3\2\2\2\u00b6"+
		"\u0466\3\2\2\2\u00b8\u04a2\3\2\2\2\u00ba\u04a6\3\2\2\2\u00bc\u04a8\3\2"+
		"\2\2\u00be\u04ab\3\2\2\2\u00c0\u00c2\5\u00bc_\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5\4\3\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d0\5\6\4\2\u00cd\u00cf\5\6\4\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\2\2\3\u00d4"+
		"\3\3\2\2\2\u00d5\u00d9\7\4\2\2\u00d6\u00d7\5\u00a4S\2\u00d7\u00d8\7A\2"+
		"\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\5l\67\2\u00dc\5\3\2\2\2\u00dd\u00de\7\6\2\2\u00de"+
		"\u00df\5\b\5\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7\26\2\2\u00e1\u0122\3"+
		"\2\2\2\u00e2\u00e3\5N(\2\u00e3\u00e4\7\13\2\2\u00e4\u00e5\5\64\33\2\u00e5"+
		"\u0122\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7\u00e9\5\u00a4S\2\u00e8\u00ea"+
		"\5\n\6\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\5<\37\2\u00ec\u00ed\7)\2\2\u00ed\u00ee\5\u00a4S\2\u00ee\u0122\3"+
		"\2\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f2\5\u00a4S\2\u00f1\u00f3\5\n\6\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\5@!\2\u00f5\u00f6\7)\2\2\u00f6\u00f7\5\u00a4S\2\u00f7\u0122\3\2\2\2\u00f8"+
		"\u00f9\7&\2\2\u00f9\u00fb\5\u00a4S\2\u00fa\u00fc\5\n\6\2\u00fb\u00fa\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5\u0084C\2"+
		"\u00fe\u00ff\7)\2\2\u00ff\u0100\5\u00a4S\2\u0100\u0122\3\2\2\2\u0101\u0102"+
		"\79\2\2\u0102\u0106\5l\67\2\u0103\u0105\5\u00bc_\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5\u00be`\2\u010a\u0109\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\u00b0Y\2\u010d"+
		"\u010e\7)\2\2\u010e\u010f\5l\67\2\u010f\u0122\3\2\2\2\u0110\u0111\7(\2"+
		"\2\u0111\u0112\7\32\2\2\u0112\u0113\5\u00a4S\2\u0113\u0115\5\u00a4S\2"+
		"\u0114\u0116\5\n\6\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\5\u00a4S\2\u0118\u0119\7\33\2\2\u0119\u011a\5<\37"+
		"\2\u011a\u011b\7)\2\2\u011b\u011c\5\u00a4S\2\u011c\u0122\3\2\2\2\u011d"+
		"\u011e\7\n\2\2\u011e\u011f\5\u00a4S\2\u011f\u0120\5R*\2\u0120\u0122\3"+
		"\2\2\2\u0121\u00dd\3\2\2\2\u0121\u00e2\3\2\2\2\u0121\u00e6\3\2\2\2\u0121"+
		"\u00ef\3\2\2\2\u0121\u00f8\3\2\2\2\u0121\u0101\3\2\2\2\u0121\u0110\3\2"+
		"\2\2\u0121\u011d\3\2\2\2\u0122\7\3\2\2\2\u0123\u0124\5\u00a4S\2\u0124"+
		"\u0125\7\22\2\2\u0125\t\3\2\2\2\u0126\u0127\7\20\2\2\u0127\u012c\7\36"+
		"\2\2\u0128\u012a\5\b\5\2\u0129\u012b\7\27\2\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\7\37\2\2\u0131\13\3\2\2\2\u0132\u0140\5\16\b\2\u0133\u0140\5l\67"+
		"\2\u0134\u0140\5f\64\2\u0135\u0140\5\36\20\2\u0136\u0140\5$\23\2\u0137"+
		"\u0140\5\"\22\2\u0138\u0140\5&\24\2\u0139\u013a\7\32\2\2\u013a\u013b\5"+
		".\30\2\u013b\u013c\7\33\2\2\u013c\u0140\3\2\2\2\u013d\u0140\5v<\2\u013e"+
		"\u0140\5\u0080A\2\u013f\u0132\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0134"+
		"\3\2\2\2\u013f\u0135\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u0137\3\2\2\2\u013f"+
		"\u0138\3\2\2\2\u013f\u0139\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140\r\3\2\2\2\u0141\u0143\7\r\2\2\u0142\u0144\5\u00aaV\2\u0143"+
		"\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0147\7\17"+
		"\2\2\u0146\u0141\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\5\20\t\2\u0149\u014b\7\23\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\58\35\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0154\3\2\2\2\u014f\u0150\7\16\2\2\u0150\u0151\5"+
		"\u00a6T\2\u0151\u0152\5\20\t\2\u0152\u0154\3\2\2\2\u0153\u0146\3\2\2\2"+
		"\u0153\u014f\3\2\2\2\u0154\17\3\2\2\2\u0155\u0157\5\24\13\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015b\3\2\2\2\u0158\u015a\5\22\n\2"+
		"\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\21\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7\24\2\2\u015f"+
		"\u0161\5\24\13\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\23\3\2"+
		"\2\2\u0162\u0163\7\32\2\2\u0163\u0168\5\26\f\2\u0164\u0165\7\26\2\2\u0165"+
		"\u0167\5\26\f\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7\33\2\2\u016c\25\3\2\2\2\u016d\u0172\5\30\r\2\u016e\u0172\5\32"+
		"\16\2\u016f\u0172\5\34\17\2\u0170\u0172\5\b\5\2\u0171\u016d\3\2\2\2\u0171"+
		"\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\27\3\2\2"+
		"\2\u0173\u0177\5\16\b\2\u0174\u0177\5v<\2\u0175\u0177\5f\64\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\31\3\2\2\2\u0178"+
		"\u0179\7\34\2\2\u0179\u017e\5\30\r\2\u017a\u017b\7\27\2\2\u017b\u017d"+
		"\5\30\r\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182"+
		"\7\35\2\2\u0182\33\3\2\2\2\u0183\u018b\7\36\2\2\u0184\u0187\5\b\5\2\u0185"+
		"\u0187\5.\30\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u018a\7\27\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0186\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\7\37\2\2\u0190"+
		"\35\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u019f\7\35\2\2\u0193\u0194\7\34"+
		"\2\2\u0194\u0199\5 \21\2\u0195\u0196\7\27\2\2\u0196\u0198\5 \21\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\35\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u0191\3\2\2\2\u019e\u0193\3\2\2\2\u019f\37\3\2\2"+
		"\2\u01a0\u01a3\5H%\2\u01a1\u01a3\5N(\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3!\3\2\2\2\u01a4\u01ad\7\36\2\2\u01a5\u01aa\5,\27\2\u01a6"+
		"\u01a7\7\27\2\2\u01a7\u01a9\5,\27\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3"+
		"\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\7\37\2\2\u01b0#\3\2\2\2\u01b1\u01b2\7\36\2\2\u01b2\u01bb"+
		"\7\34\2\2\u01b3\u01b8\5*\26\2\u01b4\u01b5\7\27\2\2\u01b5\u01b7\5*\26\2"+
		"\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\35\2\2\u01be\u01bf\7"+
		"\37\2\2\u01bf%\3\2\2\2\u01c0\u01c1\7 \2\2\u01c1\u01c5\5(\25\2\u01c2\u01c4"+
		"\5(\25\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7U"+
		"\2\2\u01c9\'\3\2\2\2\u01ca\u01cd\7S\2\2\u01cb\u01cd\5~@\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd)\3\2\2\2\u01ce\u01d2\5\"\22\2\u01cf"+
		"\u01d2\5 \21\2\u01d0\u01d2\5\16\b\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3"+
		"\2\2\2\u01d1\u01d0\3\2\2\2\u01d2+\3\2\2\2\u01d3\u01d7\5.\30\2\u01d4\u01d7"+
		"\5 \21\2\u01d5\u01d7\5\16\b\2\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2"+
		"\u01d6\u01d5\3\2\2\2\u01d7-\3\2\2\2\u01d8\u01d9\5\b\5\2\u01d9\u01da\5"+
		" \21\2\u01da/\3\2\2\2\u01db\u01f7\5\f\7\2\u01dc\u01de\7\"\2\2\u01dd\u01df"+
		"\5\u00a4S\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2"+
		"\2\u01e0\u01e1\7\32\2\2\u01e1\u01e2\5<\37\2\u01e2\u01e4\7\"\2\2\u01e3"+
		"\u01e5\5\u00a4S\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e7\7\33\2\2\u01e7\u01f7\3\2\2\2\u01e8\u01f7\5\66\34"+
		"\2\u01e9\u01eb\7\"\2\2\u01ea\u01ec\5\u00a4S\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5\62\32\2\u01ee\u01ef\7"+
		"\32\2\2\u01ef\u01f0\5<\37\2\u01f0\u01f2\7\"\2\2\u01f1\u01f3\5\u00a4S\2"+
		"\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5"+
		"\7\33\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01db\3\2\2\2\u01f6\u01dc\3\2\2\2"+
		"\u01f6\u01e8\3\2\2\2\u01f6\u01e9\3\2\2\2\u01f7\61\3\2\2\2\u01f8\u01f9"+
		"\7\34\2\2\u01f9\u01fe\5\u00a4S\2\u01fa\u01fb\7\26\2\2\u01fb\u01fd\5\u00a4"+
		"S\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\35"+
		"\2\2\u0202\63\3\2\2\2\u0203\u020d\7\f\2\2\u0204\u0205\5\u00aaV\2\u0205"+
		"\u0207\5\20\t\2\u0206\u0208\7\23\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3"+
		"\2\2\2\u0208\u020a\3\2\2\2\u0209\u020b\58\35\2\u020a\u0209\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020e\7\5\2\2\u020d\u0204\3\2"+
		"\2\2\u020d\u020c\3\2\2\2\u020e\65\3\2\2\2\u020f\u0210\5\u00aaV\2\u0210"+
		"\u0212\5\20\t\2\u0211\u0213\7\23\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3"+
		"\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\58\35\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\67\3\2\2\2\u0217\u0218\7\20\2\2\u0218\u021d\7\36"+
		"\2\2\u0219\u021b\5:\36\2\u021a\u021c\7\27\2\2\u021b\u021a\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u0219\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\7\37\2\2\u02229\3\2\2\2\u0223\u0226\5\b\5\2\u0224\u0227\5N(\2\u0225"+
		"\u0227\5\66\34\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227;\3\2\2"+
		"\2\u0228\u022c\5@!\2\u0229\u022b\5> \2\u022a\u0229\3\2\2\2\u022b\u022e"+
		"\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0235\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0231\5> \2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2"+
		"\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0228"+
		"\3\2\2\2\u0234\u0230\3\2\2\2\u0235=\3\2\2\2\u0236\u0237\5R*\2\u0237\u0238"+
		"\5@!\2\u0238\u0245\3\2\2\2\u0239\u023b\7\7\2\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\5R*\2\u023d\u023f\7\b\2"+
		"\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241"+
		"\5@!\2\u0241\u0245\3\2\2\2\u0242\u0243\7\t\2\2\u0243\u0245\5@!\2\u0244"+
		"\u0236\3\2\2\2\u0244\u023a\3\2\2\2\u0244\u0242\3\2\2\2\u0245?\3\2\2\2"+
		"\u0246\u0248\5B\"\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024e\3\2\2\2\u024b\u024c\7\f\2\2\u024c"+
		"\u024e\7\5\2\2\u024d\u0247\3\2\2\2\u024d\u024b\3\2\2\2\u024eA\3\2\2\2"+
		"\u024f\u0254\5F$\2\u0250\u0254\5J&\2\u0251\u0254\5H%\2\u0252\u0254\5D"+
		"#\2\u0253\u024f\3\2\2\2\u0253\u0250\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0252\3\2\2\2\u0254C\3\2\2\2\u0255\u0256\5N(\2\u0256\u0257\7\f\2\2\u0257"+
		"E\3\2\2\2\u0258\u0259\5\6\4\2\u0259G\3\2\2\2\u025a\u025b\5N(\2\u025b\u025c"+
		"\7\13\2\2\u025c\u025d\7-\2\2\u025dI\3\2\2\2\u025e\u025f\5N(\2\u025f\u0260"+
		"\7\13\2\2\u0260\u0262\3\2\2\2\u0261\u025e\3\2\2\2\u0261\u0262\3\2\2\2"+
		"\u0262\u0263\3\2\2\2\u0263\u0264\5L\'\2\u0264K\3\2\2\2\u0265\u0266\7."+
		"\2\2\u0266\u0268\7\66\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\5\u00a6T\2\u026a\u026b\5\20\t\2\u026b\u026c"+
		"\7\22\2\2\u026c\u026d\5 \21\2\u026d\u026e\7\26\2\2\u026eM\3\2\2\2\u026f"+
		"\u0275\5\f\7\2\u0270\u0271\5\f\7\2\u0271\u0272\5P)\2\u0272\u0275\3\2\2"+
		"\2\u0273\u0275\5.\30\2\u0274\u026f\3\2\2\2\u0274\u0270\3\2\2\2\u0274\u0273"+
		"\3\2\2\2\u0275O\3\2\2\2\u0276\u0277\7\13\2\2\u0277\u0279\5\60\31\2\u0278"+
		"\u027a\5P)\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0280\3\2\2"+
		"\2\u027b\u027d\7\30\2\2\u027c\u027e\5P)\2\u027d\u027c\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0276\3\2\2\2\u027f\u027b\3\2\2\2\u0280"+
		"Q\3\2\2\2\u0281\u0283\7!\2\2\u0282\u0284\7\31\2\2\u0283\u0282\3\2\2\2"+
		"\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a\5T+\2\u0286\u0287"+
		"\7\66\2\2\u0287\u0289\5T+\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028a\3\2"+
		"\2\2\u028d\u028e\7\67\2\2\u028eS\3\2\2\2\u028f\u0292\5\\/\2\u0290\u0292"+
		"\5V,\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0296\3\2\2\2\u0293\u0295\5`\61\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297U\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0299\u02cd\5^\60\2\u029a\u02cd\5l\67\2\u029b\u02a3\7\36\2\2"+
		"\u029c\u029d\5\b\5\2\u029d\u029f\5X-\2\u029e\u02a0\7\27\2\2\u029f\u029e"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029c\3\2\2\2\u02a2"+
		"\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02aa\3\2"+
		"\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8\7\27\2\2\u02a7\u02a6\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7\5\2\2\u02aa\u02a7\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02cd\7\37\2\2\u02ad"+
		"\u02af\7\34\2\2\u02ae\u02b0\5Z.\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2"+
		"\2\2\u02b0\u02b5\3\2\2\2\u02b1\u02b2\7\27\2\2\u02b2\u02b4\5Z.\2\u02b3"+
		"\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02bc\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02ba\7\27\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7\5"+
		"\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c6\7\35\2\2\u02bf\u02c2\7\32\2\2\u02c0\u02c3\5^\60\2\u02c1\u02c3\5"+
		"v<\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\7\33\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02bf\3\2\2\2\u02c6\u02c7\3"+
		"\2\2\2\u02c7\u02cd\3\2\2\2\u02c8\u02cb\5\u00a4S\2\u02c9\u02cb\5\u00a8"+
		"U\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u0299\3\2\2\2\u02cc\u029a\3\2\2\2\u02cc\u029b\3\2\2\2\u02cc\u02ad\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cdW\3\2\2\2\u02ce\u02d1\5R*\2\u02cf\u02d1"+
		"\7\5\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1Y\3\2\2\2\u02d2"+
		"\u02d4\5R*\2\u02d3\u02d5\5\u009aN\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3"+
		"\2\2\2\u02d5[\3\2\2\2\u02d6\u02d7\7\65\2\2\u02d7\u02d8\5\f\7\2\u02d8]"+
		"\3\2\2\2\u02d9\u02db\5b\62\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02de\7.\2\2\u02dd\u02df\5d\63\2\u02de\u02dd\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df_\3\2\2\2\u02e0\u02e1\78\2\2\u02e1\u02e2"+
		"\5N(\2\u02e2\u02e3\5R*\2\u02e3\u02e4\7\33\2\2\u02e4a\3\2\2\2\u02e5\u02ea"+
		"\5\16\b\2\u02e6\u02ea\5v<\2\u02e7\u02ea\5l\67\2\u02e8\u02ea\5~@\2\u02e9"+
		"\u02e5\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02e8\3\2"+
		"\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02ed\7\31\2\2\u02ec\u02eb\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02edc\3\2\2\2\u02ee\u02f0\7\31\2\2\u02ef\u02ee\3\2\2\2"+
		"\u02ef\u02f0\3\2\2\2\u02f0\u02f5\3\2\2\2\u02f1\u02f6\5\16\b\2\u02f2\u02f6"+
		"\5v<\2\u02f3\u02f6\5l\67\2\u02f4\u02f6\5~@\2\u02f5\u02f1\3\2\2\2\u02f5"+
		"\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6e\3\2\2\2"+
		"\u02f7\u02f9\5b\62\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u02fc\7.\2\2\u02fb\u02fd\5d\63\2\u02fc\u02fb\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02ff\7\22\2\2\u02ff\u0301\5"+
		"v<\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301g\3\2\2\2\u0302\u0305"+
		"\7F\2\2\u0303\u0305\5j\66\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305"+
		"i\3\2\2\2\u0306\u0308\5z>\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030a\7G\2\2\u030ak\3\2\2\2\u030b\u030f\7H\2\2\u030c"+
		"\u030e\5n8\2\u030d\u030c\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2"+
		"\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313"+
		"\7R\2\2\u0313m\3\2\2\2\u0314\u0317\5p9\2\u0315\u0317\7Q\2\2\u0316\u0314"+
		"\3\2\2\2\u0316\u0315\3\2\2\2\u0317o\3\2\2\2\u0318\u031b\5t;\2\u0319\u031b"+
		"\5r:\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2\2\2\u031bq\3\2\2\2\u031c\u031d"+
		"\7O\2\2\u031d\u031e\5v<\2\u031e\u031f\7\25\2\2\u031fs\3\2\2\2\u0320\u032d"+
		"\7P\2\2\u0321\u0323\5\u00aaV\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2"+
		"\u0323\u0324\3\2\2\2\u0324\u0326\5\20\t\2\u0325\u0327\7\23\2\2\u0326\u0325"+
		"\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u032a\58\35\2\u0329"+
		"\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032e\3\2\2\2\u032b\u032c\7\22"+
		"\2\2\u032c\u032e\5\f\7\2\u032d\u0322\3\2\2\2\u032d\u032b\3\2\2\2\u032e"+
		"\u0330\3\2\2\2\u032f\u0331\5P)\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2"+
		"\2\u0331\u0334\3\2\2\2\u0332\u0333\7\13\2\2\u0333\u0335\7-\2\2\u0334\u0332"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\7\25\2\2"+
		"\u0337u\3\2\2\2\u0338\u0339\b<\1\2\u0339\u0345\5h\65\2\u033a\u033b\7\32"+
		"\2\2\u033b\u033c\5v<\2\u033c\u033d\7\33\2\2\u033d\u0345\3\2\2\2\u033e"+
		"\u0340\5z>\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2"+
		"\2\u0341\u0345\5\16\b\2\u0342\u0345\5\u00acW\2\u0343\u0345\5x=\2\u0344"+
		"\u0338\3\2\2\2\u0344\u033a\3\2\2\2\u0344\u033f\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0344\u0343\3\2\2\2\u0345\u0358\3\2\2\2\u0346\u0347\f\b\2\2\u0347"+
		"\u0348\5|?\2\u0348\u0349\5v<\t\u0349\u0357\3\2\2\2\u034a\u034b\f\7\2\2"+
		"\u034b\u034c\5z>\2\u034c\u034d\5v<\b\u034d\u0357\3\2\2\2\u034e\u034f\f"+
		"\5\2\2\u034f\u0350\5|?\2\u0350\u0351\5~@\2\u0351\u0357\3\2\2\2\u0352\u0353"+
		"\f\4\2\2\u0353\u0354\5z>\2\u0354\u0355\5~@\2\u0355\u0357\3\2\2\2\u0356"+
		"\u0346\3\2\2\2\u0356\u034a\3\2\2\2\u0356\u034e\3\2\2\2\u0356\u0352\3\2"+
		"\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"w\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\5~@\2\u035c\u035f\5|?\2\u035d"+
		"\u0360\5~@\2\u035e\u0360\5v<\2\u035f\u035d\3\2\2\2\u035f\u035e\3\2\2\2"+
		"\u0360\u0368\3\2\2\2\u0361\u0362\5~@\2\u0362\u0365\5z>\2\u0363\u0366\5"+
		"~@\2\u0364\u0366\5v<\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u0368"+
		"\3\2\2\2\u0367\u035b\3\2\2\2\u0367\u0361\3\2\2\2\u0368y\3\2\2\2\u0369"+
		"\u036a\t\3\2\2\u036a{\3\2\2\2\u036b\u036c\t\4\2\2\u036c}\3\2\2\2\u036d"+
		"\u036e\7\32\2\2\u036e\u036f\5 \21\2\u036f\u0370\7\33\2\2\u0370\u0373\3"+
		"\2\2\2\u0371\u0373\5\u0080A\2\u0372\u036d\3\2\2\2\u0372\u0371\3\2\2\2"+
		"\u0373\177\3\2\2\2\u0374\u0375\7\32\2\2\u0375\u0376\5\u0082B\2\u0376\u0377"+
		"\5\66\34\2\u0377\u0378\5\u0082B\2\u0378\u0379\7\33\2\2\u0379\u0081\3\2"+
		"\2\2\u037a\u037d\5\f\7\2\u037b\u037d\5~@\2\u037c\u037a\3\2\2\2\u037c\u037b"+
		"\3\2\2\2\u037d\u0083\3\2\2\2\u037e\u0380\5J&\2\u037f\u037e\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0385\5\u0088E\2\u0382\u0384"+
		"\5\u0086D\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2"+
		"\2\u0385\u0386\3\2\2\2\u0386\u0085\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0389"+
		"\7*\2\2\u0389\u038a\5\b\5\2\u038a\u038b\5\u0088E\2\u038b\u0087\3\2\2\2"+
		"\u038c\u0393\5\u008aF\2\u038d\u038f\5\u009cO\2\u038e\u038d\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\3\2"+
		"\2\2\u0392\u038c\3\2\2\2\u0392\u038e\3\2\2\2\u0393\u0089\3\2\2\2\u0394"+
		"\u0396\5\u009cO\2\u0395\u0394\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\3\2\2\2\u0399\u0397\3\2\2\2\u039a"+
		"\u039f\5\u008cG\2\u039b\u039d\7\27\2\2\u039c\u039b\3\2\2\2\u039c\u039d"+
		"\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\5\u008aF\2\u039f\u039c\3\2\2"+
		"\2\u039f\u03a0\3\2\2\2\u03a0\u008b\3\2\2\2\u03a1\u03a3\5\u008eH\2\u03a2"+
		"\u03a4\5P)\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a8\3\2\2"+
		"\2\u03a5\u03a7\5\u009cO\2\u03a6\u03a5\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u008d\3\2\2\2\u03aa\u03a8\3\2"+
		"\2\2\u03ab\u03bb\5\u0094K\2\u03ac\u03af\7\34\2\2\u03ad\u03b0\5\u0088E"+
		"\2\u03ae\u03b0\5\u009cO\2\u03af\u03ad\3\2\2\2\u03af\u03ae\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03bb\7\35\2\2\u03b2\u03b5\7"+
		"\36\2\2\u03b3\u03b6\5\u0090I\2\u03b4\u03b6\5\u009cO\2\u03b5\u03b3\3\2"+
		"\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03bb\7\37\2\2\u03b8\u03bb\5\f\7\2\u03b9\u03bb\5\u00a0Q\2\u03ba\u03ab"+
		"\3\2\2\2\u03ba\u03ac\3\2\2\2\u03ba\u03b2\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba"+
		"\u03b9\3\2\2\2\u03bb\u008f\3\2\2\2\u03bc\u03be\5\u009cO\2\u03bd\u03bc"+
		"\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c2\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03c7\5\u0092J\2\u03c3\u03c5"+
		"\7\27\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2"+
		"\u03c6\u03c8\5\u0090I\2\u03c7\u03c4\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u0091\3\2\2\2\u03c9\u03cc\5\u0094K\2\u03ca\u03cc\5\u00a0Q\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03d0\3\2\2\2\u03cd\u03cf\5\u009cO"+
		"\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u0093\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d5\7!\2\2\u03d4"+
		"\u03d6\7\31\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3"+
		"\2\2\2\u03d7\u03dc\5\u0096L\2\u03d8\u03d9\7\66\2\2\u03d9\u03db\5\u0096"+
		"L\2\u03da\u03d8\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e1\7\67"+
		"\2\2\u03e0\u03e2\5\u009aN\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u0095\3\2\2\2\u03e3\u03e7\5\u0098M\2\u03e4\u03e7\5\u00a4S\2\u03e5\u03e7"+
		"\5l\67\2\u03e6\u03e3\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7"+
		"\u0097\3\2\2\2\u03e8\u03eb\7\65\2\2\u03e9\u03ec\5\16\b\2\u03ea\u03ec\5"+
		"l\67\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ec\u0099\3\2\2\2\u03ed"+
		"\u03f6\7/\2\2\u03ee\u03f6\7\61\2\2\u03ef\u03f6\7\64\2\2\u03f0\u03f3\7"+
		"\65\2\2\u03f1\u03f4\7G\2\2\u03f2\u03f4\5\16\b\2\u03f3\u03f1\3\2\2\2\u03f3"+
		"\u03f2\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03ed\3\2\2\2\u03f5\u03ee\3\2"+
		"\2\2\u03f5\u03ef\3\2\2\2\u03f5\u03f0\3\2\2\2\u03f6\u009b\3\2\2\2\u03f7"+
		"\u03f9\7\32\2\2\u03f8\u03fa\5\u009eP\2\u03f9\u03f8\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03fe\7\33\2\2\u03fe\u009d\3\2\2\2\u03ff\u0400\7\6\2\2\u0400\u0401\5"+
		"\b\5\2\u0401\u0403\5\u008eH\2\u0402\u0404\5P)\2\u0403\u0402\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7\26\2\2\u0406\u0411\3"+
		"\2\2\2\u0407\u040d\5\u008eH\2\u0408\u040a\5P)\2\u0409\u0408\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7\13\2\2\u040c\u040e\5"+
		"L\'\2\u040d\u0409\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0411\3\2\2\2\u040f"+
		"\u0411\5J&\2\u0410\u03ff\3\2\2\2\u0410\u0407\3\2\2\2\u0410\u040f\3\2\2"+
		"\2\u0411\u009f\3\2\2\2\u0412\u0415\5\b\5\2\u0413\u0415\5\u00a2R\2\u0414"+
		"\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u0419\3\2\2\2\u0416\u0418\5\u009c"+
		"O\2\u0417\u0416\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\5\u008c"+
		"G\2\u041d\u00a1\3\2\2\2\u041e\u041f\5\u0094K\2\u041f\u0420\7\22\2\2\u0420"+
		"\u00a3\3\2\2\2\u0421\u0424\7J\2\2\u0422\u0424\5\u00aeX\2\u0423\u0421\3"+
		"\2\2\2\u0423\u0422\3\2\2\2\u0424\u00a5\3\2\2\2\u0425\u0426\7I\2\2\u0426"+
		"\u00a7\3\2\2\2\u0427\u042a\5\u00a4S\2\u0428\u0429\7\21\2\2\u0429\u042b"+
		"\5\u00a4S\2\u042a\u0428\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042a\3\2\2"+
		"\2\u042c\u042d\3\2\2\2\u042d\u00a9\3\2\2\2\u042e\u0432\5\u00a6T\2\u042f"+
		"\u0432\5\u00a4S\2\u0430\u0432\5\u00a8U\2\u0431\u042e\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u00ab\3\2\2\2\u0433\u0434\t\5\2\2\u0434"+
		"\u00ad\3\2\2\2\u0435\u0450\7\4\2\2\u0436\u0450\7\6\2\2\u0437\u0450\7#"+
		"\2\2\u0438\u0450\7$\2\2\u0439\u0450\7%\2\2\u043a\u0450\7&\2\2\u043b\u0450"+
		"\7\'\2\2\u043c\u0450\7(\2\2\u043d\u0450\7)\2\2\u043e\u0450\7\n\2\2\u043f"+
		"\u0450\7\63\2\2\u0440\u0450\7*\2\2\u0441\u0450\7\7\2\2\u0442\u0450\7\b"+
		"\2\2\u0443\u0450\7\t\2\2\u0444\u0450\5\u00acW\2\u0445\u0450\79\2\2\u0446"+
		"\u0450\7:\2\2\u0447\u0450\7<\2\2\u0448\u0450\7=\2\2\u0449\u0450\7>\2\2"+
		"\u044a\u0450\7?\2\2\u044b\u0450\7A\2\2\u044c\u0450\7C\2\2\u044d\u0450"+
		"\7D\2\2\u044e\u0450\7E\2\2\u044f\u0435\3\2\2\2\u044f\u0436\3\2\2\2\u044f"+
		"\u0437\3\2\2\2\u044f\u0438\3\2\2\2\u044f\u0439\3\2\2\2\u044f\u043a\3\2"+
		"\2\2\u044f\u043b\3\2\2\2\u044f\u043c\3\2\2\2\u044f\u043d\3\2\2\2\u044f"+
		"\u043e\3\2\2\2\u044f\u043f\3\2\2\2\u044f\u0440\3\2\2\2\u044f\u0441\3\2"+
		"\2\2\u044f\u0442\3\2\2\2\u044f\u0443\3\2\2\2\u044f\u0444\3\2\2\2\u044f"+
		"\u0445\3\2\2\2\u044f\u0446\3\2\2\2\u044f\u0447\3\2\2\2\u044f\u0448\3\2"+
		"\2\2\u044f\u0449\3\2\2\2\u044f\u044a\3\2\2\2\u044f\u044b\3\2\2\2\u044f"+
		"\u044c\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u044e\3\2\2\2\u0450\u00af\3\2"+
		"\2\2\u0451\u0453\5\u00b2Z\2\u0452\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u00b1\3\2\2\2\u0456\u0458\5\6"+
		"\4\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3\2\2\2\u0459"+
		"\u045a\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045e\5\u00b4"+
		"[\2\u045d\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u00b3\3\2\2\2\u0461\u0462\7:\2\2\u0462\u0463\5N("+
		"\2\u0463\u0464\5R*\2\u0464\u0465\5l\67\2\u0465\u00b5\3\2\2\2\u0466\u0468"+
		"\7<\2\2\u0467\u0469\5\u00b8]\2\u0468\u0467\3\2\2\2\u0469\u046a\3\2\2\2"+
		"\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d"+
		"\7=\2\2\u046d\u00b7\3\2\2\2\u046e\u046f\5\u00ba^\2\u046f\u0470\7A\2\2"+
		"\u0470\u0472\3\2\2\2\u0471\u046e\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473"+
		"\3\2\2\2\u0473\u0474\7?\2\2\u0474\u0476\5\u00ba^\2\u0475\u0477\5\u00b6"+
		"\\\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478"+
		"\u047a\5\6\4\2\u0479\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u0479\3\2"+
		"\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\7)\2\2\u047e"+
		"\u047f\5\u00ba^\2\u047f\u04a3\3\2\2\2\u0480\u0481\5\u00ba^\2\u0481\u0484"+
		"\7@\2\2\u0482\u0483\7A\2\2\u0483\u0485\5\u00ba^\2\u0484\u0482\3\2\2\2"+
		"\u0484\u0485\3\2\2\2\u0485\u04a3\3\2\2\2\u0486\u0487\5\u00ba^\2\u0487"+
		"\u0488\7A\2\2\u0488\u048a\3\2\2\2\u0489\u0486\3\2\2\2\u0489\u048a\3\2"+
		"\2\2\u048a\u048b\3\2\2\2\u048b\u048c\7>\2\2\u048c\u048e\5l\67\2\u048d"+
		"\u048f\5\u00b6\\\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0491"+
		"\3\2\2\2\u0490\u0492\5\6\4\2\u0491\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\7)"+
		"\2\2\u0496\u0497\5l\67\2\u0497\u04a3\3\2\2\2\u0498\u0499\5\u00ba^\2\u0499"+
		"\u049a\7A\2\2\u049a\u049c\3\2\2\2\u049b\u0498\3\2\2\2\u049b\u049c\3\2"+
		"\2\2\u049c\u049d\3\2\2\2\u049d\u04a0\5l\67\2\u049e\u04a1\7B\2\2\u049f"+
		"\u04a1\5\u00b6\\\2\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\u04a3"+
		"\3\2\2\2\u04a2\u0471\3\2\2\2\u04a2\u0480\3\2\2\2\u04a2\u0489\3\2\2\2\u04a2"+
		"\u049b\3\2\2\2\u04a3\u00b9\3\2\2\2\u04a4\u04a7\7;\2\2\u04a5\u04a7\5\u00a4"+
		"S\2\u04a6\u04a4\3\2\2\2\u04a6\u04a5\3\2\2\2\u04a7\u00bb\3\2\2\2\u04a8"+
		"\u04a9\7C\2\2\u04a9\u04aa\5\u00b8]\2\u04aa\u00bd\3\2\2\2\u04ab\u04ac\7"+
		"E\2\2\u04ac\u04ae\7D\2\2\u04ad\u04af\5\6\4\2\u04ae\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2"+
		"\2\2\u04b2\u04b3\7)\2\2\u04b3\u04b4\7D\2\2\u04b4\u00bf\3\2\2\2\u00a9\u00c3"+
		"\u00c9\u00d0\u00d9\u00e9\u00f2\u00fb\u0106\u010a\u0115\u0121\u012a\u012e"+
		"\u013f\u0143\u0146\u014a\u014d\u0153\u0156\u015b\u0160\u0168\u0171\u0176"+
		"\u017e\u0186\u0189\u018d\u0199\u019e\u01a2\u01aa\u01ad\u01b8\u01bb\u01c5"+
		"\u01cc\u01d1\u01d6\u01de\u01e4\u01eb\u01f2\u01f6\u01fe\u0207\u020a\u020d"+
		"\u0212\u0215\u021b\u021f\u0226\u022c\u0232\u0234\u023a\u023e\u0244\u0249"+
		"\u024d\u0253\u0261\u0267\u0274\u0279\u027d\u027f\u0283\u028a\u0291\u0296"+
		"\u029f\u02a3\u02a7\u02aa\u02af\u02b5\u02b9\u02bc\u02c2\u02c6\u02ca\u02cc"+
		"\u02d0\u02d4\u02da\u02de\u02e9\u02ec\u02ef\u02f5\u02f8\u02fc\u0300\u0304"+
		"\u0307\u030f\u0316\u031a\u0322\u0326\u0329\u032d\u0330\u0334\u033f\u0344"+
		"\u0356\u0358\u035f\u0365\u0367\u0372\u037c\u037f\u0385\u0390\u0392\u0397"+
		"\u039c\u039f\u03a3\u03a8\u03af\u03b5\u03ba\u03bf\u03c4\u03c7\u03cb\u03d0"+
		"\u03d5\u03dc\u03e1\u03e6\u03eb\u03f3\u03f5\u03fb\u0403\u0409\u040d\u0410"+
		"\u0414\u0419\u0423\u042c\u0431\u044f\u0454\u0459\u045f\u046a\u0471\u0476"+
		"\u047b\u0484\u0489\u048e\u0493\u049b\u04a0\u04a2\u04a6\u04b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}