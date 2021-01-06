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
		RULE_reference = 7, RULE_structureReference = 8, RULE_arrayReference = 9, 
		RULE_dimensionReference = 10, RULE_simpleDimension = 11, RULE_multiValueDimension = 12, 
		RULE_projection = 13, RULE_arrayLiteral = 14, RULE_valueProduction = 15, 
		RULE_structureLiteral = 16, RULE_relationLiteral = 17, RULE_bytesLiteral = 18, 
		RULE_byteValue = 19, RULE_structures = 20, RULE_keyValues = 21, RULE_keyValue = 22, 
		RULE_templates = 23, RULE_arrayIndexDecomposition = 24, RULE_sink = 25, 
		RULE_templatesReference = 26, RULE_parameterValues = 27, RULE_parameterValue = 28, 
		RULE_templatesBody = 29, RULE_matchTemplate = 30, RULE_block = 31, RULE_blockExpression = 32, 
		RULE_resultValue = 33, RULE_blockStatement = 34, RULE_sendToTemplates = 35, 
		RULE_stateAssignment = 36, RULE_stateSink = 37, RULE_valueChain = 38, 
		RULE_transform = 39, RULE_matcher = 40, RULE_criterion = 41, RULE_typeMatch = 42, 
		RULE_structureContentMatcher = 43, RULE_arrayContentMatcher = 44, RULE_literalMatch = 45, 
		RULE_rangeBounds = 46, RULE_condition = 47, RULE_lowerBound = 48, RULE_upperBound = 49, 
		RULE_rangeLiteral = 50, RULE_integerLiteral = 51, RULE_nonZeroInteger = 52, 
		RULE_stringLiteral = 53, RULE_stringContent = 54, RULE_stringInterpolate = 55, 
		RULE_characterCode = 56, RULE_interpolateEvaluate = 57, RULE_arithmeticExpression = 58, 
		RULE_termArithmeticOperation = 59, RULE_additiveOperator = 60, RULE_multiplicativeOperator = 61, 
		RULE_term = 62, RULE_operatorExpression = 63, RULE_operand = 64, RULE_composerBody = 65, 
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
			"sourceReference", "reference", "structureReference", "arrayReference", 
			"dimensionReference", "simpleDimension", "multiValueDimension", "projection", 
			"arrayLiteral", "valueProduction", "structureLiteral", "relationLiteral", 
			"bytesLiteral", "byteValue", "structures", "keyValues", "keyValue", "templates", 
			"arrayIndexDecomposition", "sink", "templatesReference", "parameterValues", 
			"parameterValue", "templatesBody", "matchTemplate", "block", "blockExpression", 
			"resultValue", "blockStatement", "sendToTemplates", "stateAssignment", 
			"stateSink", "valueChain", "transform", "matcher", "criterion", "typeMatch", 
			"structureContentMatcher", "arrayContentMatcher", "literalMatch", "rangeBounds", 
			"condition", "lowerBound", "upperBound", "rangeLiteral", "integerLiteral", 
			"nonZeroInteger", "stringLiteral", "stringContent", "stringInterpolate", 
			"characterCode", "interpolateEvaluate", "arithmeticExpression", "termArithmeticOperation", 
			"additiveOperator", "multiplicativeOperator", "term", "operatorExpression", 
			"operand", "composerBody", "definedCompositionSequence", "compositionSequence", 
			"compositionComponents", "compositionComponent", "compositionMatcher", 
			"structureMemberMatchers", "structureMemberMatcher", "tokenMatcher", 
			"compositionToken", "literalComposition", "multiplier", "compositionSkipRule", 
			"compositionCapture", "compositionKeyValue", "compositionKey", "localIdentifier", 
			"stateIdentifier", "externalIdentifier", "anyIdentifier", "arithmeticContextKeyword", 
			"keyword", "testBody", "testBlock", "assertion", "dependencyProvision", 
			"moduleConfiguration", "moduleIdentifier", "useModule", "programModification"
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
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(339);
				match(LeftParen);
				setState(340);
				arrayReference();
				setState(341);
				match(RightParen);
				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					structureReference();
					}
					} 
				}
				setState(350);
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
			setState(351);
			match(FieldReference);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(352);
				match(LeftParen);
				setState(353);
				arrayReference();
				setState(354);
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
			setState(358);
			dimensionReference();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(359);
				match(SemiColon);
				setState(360);
				dimensionReference();
				}
				}
				setState(365);
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
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
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
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
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
				setState(366);
				simpleDimension();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				multiValueDimension();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				projection();
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
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				sourceReference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
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
			setState(376);
			match(LeftBracket);
			setState(377);
			simpleDimension();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(378);
				match(Comma);
				setState(379);
				simpleDimension();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
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
			setState(387);
			match(LeftBrace);
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(388);
					key();
					}
					break;
				case 2:
					{
					setState(389);
					keyValue();
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(392);
					match(Comma);
					}
				}

				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(399);
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
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(LeftBracket);
				setState(402);
				match(RightBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(LeftBracket);
				setState(404);
				valueProduction();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(405);
					match(Comma);
					setState(406);
					valueProduction();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
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
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				sendToTemplates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
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
			setState(420);
			match(LeftBrace);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(421);
				keyValues();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(422);
					match(Comma);
					setState(423);
					keyValues();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(431);
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
			setState(433);
			match(LeftBrace);
			setState(434);
			match(LeftBracket);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(435);
				structures();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(436);
					match(Comma);
					setState(437);
					structures();
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(445);
			match(RightBracket);
			setState(446);
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
			setState(448);
			match(StartBytes);
			setState(449);
			byteValue();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen || _la==Bytes) {
				{
				{
				setState(450);
				byteValue();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
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
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bytes:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(Bytes);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
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
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				structureLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
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
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				keyValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				valueProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
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
			setState(472);
			key();
			setState(473);
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
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new LiteralTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				source();
				}
				break;
			case 2:
				_localctx = new LambdaTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				match(Lambda);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(477);
					localIdentifier();
					}
				}

				setState(480);
				match(LeftParen);
				setState(481);
				templatesBody();
				setState(482);
				match(Lambda);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(483);
					localIdentifier();
					}
				}

				setState(486);
				match(RightParen);
				}
				break;
			case 3:
				_localctx = new CallDefinedTransformContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				templatesReference();
				}
				break;
			case 4:
				_localctx = new LambdaArrayTemplatesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(Lambda);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(490);
					localIdentifier();
					}
				}

				setState(493);
				arrayIndexDecomposition();
				setState(494);
				match(LeftParen);
				setState(495);
				templatesBody();
				setState(496);
				match(Lambda);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(497);
					localIdentifier();
					}
				}

				setState(500);
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
			setState(504);
			match(LeftBracket);
			setState(505);
			localIdentifier();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(506);
				match(SemiColon);
				setState(507);
				localIdentifier();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
			setState(515);
			match(ResultMarker);
			setState(525);
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
				setState(516);
				anyIdentifier();
				setState(517);
				reference();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(518);
					match(Message);
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(521);
					parameterValues();
					}
				}

				}
				}
				break;
			case Void:
				{
				setState(524);
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
			setState(527);
			anyIdentifier();
			setState(528);
			reference();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Message) {
				{
				setState(529);
				match(Message);
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(532);
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
			setState(535);
			match(And);
			setState(536);
			match(LeftBrace);
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(537);
				parameterValue();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(538);
					match(Comma);
					}
				}

				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(545);
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
			setState(547);
			key();
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(548);
				valueChain();
				}
				break;
			case 2:
				{
				setState(549);
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
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				block();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << When) | (1L << Otherwise) | (1L << StartMatcher))) != 0)) {
					{
					{
					setState(553);
					matchTemplate();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(559);
					matchTemplate();
					}
					}
					setState(562); 
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
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				matcher();
				setState(567);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==When) {
					{
					setState(569);
					match(When);
					}
				}

				setState(572);
				matcher();
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(573);
					match(Do);
					}
					break;
				}
				setState(576);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(Otherwise);
				setState(579);
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
			setState(589);
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
				setState(583); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(582);
						blockExpression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(585); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ResultMarker:
				{
				{
				setState(587);
				match(ResultMarker);
				setState(588);
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
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				stateAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				sendToTemplates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
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
			setState(597);
			valueChain();
			setState(598);
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
			setState(600);
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
			setState(602);
			valueChain();
			setState(603);
			match(To);
			setState(604);
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
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(606);
				valueChain();
				setState(607);
				match(To);
				}
				break;
			}
			setState(611);
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
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Range) {
				{
				setState(613);
				match(Range);
				setState(614);
				match(Else);
				}
			}

			setState(617);
			stateIdentifier();
			setState(618);
			reference();
			setState(619);
			match(Colon);
			setState(620);
			valueProduction();
			setState(621);
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
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				source();
				setState(625);
				transform();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
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
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case To:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(To);
				setState(631);
				templates();
				setState(633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(632);
					transform();
					}
					break;
				}
				}
				break;
			case Deconstructor:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				match(Deconstructor);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(636);
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
			setState(641);
			match(StartMatcher);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(642);
				match(Invert);
				}
			}

			setState(645);
			criterion();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(646);
				match(Else);
				setState(647);
				criterion();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
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
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(655);
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
				setState(656);
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
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginCondition) {
				{
				{
				setState(659);
				condition();
				}
				}
				setState(664);
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
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new RangeMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				rangeBounds();
				}
				break;
			case 2:
				_localctx = new RegexpMatchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new StructureMatchContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				match(LeftBrace);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(668);
					key();
					setState(669);
					structureContentMatcher();
					setState(671);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(670);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(678);
						match(Comma);
						}
					}

					setState(681);
					match(Void);
					}
				}

				setState(684);
				match(RightBrace);
				}
				break;
			case 4:
				_localctx = new ArrayMatchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				match(LeftBracket);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StartMatcher) {
					{
					setState(686);
					arrayContentMatcher();
					}
				}

				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(689);
						match(Comma);
						setState(690);
						arrayContentMatcher();
						}
						} 
					}
					setState(695);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Void || _la==Comma) {
					{
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(696);
						match(Comma);
						}
					}

					setState(699);
					match(Void);
					}
				}

				setState(702);
				match(RightBracket);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(703);
					match(LeftParen);
					setState(706);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(704);
						rangeBounds();
						}
						break;
					case 2:
						{
						setState(705);
						arithmeticExpression(0);
						}
						break;
					}
					setState(708);
					match(RightParen);
					}
				}

				}
				break;
			case 5:
				_localctx = new StereotypeMatchContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(712);
					localIdentifier();
					}
					break;
				case 2:
					{
					setState(713);
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
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartMatcher:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				matcher();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
			setState(722);
			matcher();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Star) | (1L << Question) | (1L << Equal))) != 0)) {
				{
				setState(723);
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
			setState(726);
			match(Equal);
			setState(727);
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
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(729);
				lowerBound();
				}
			}

			setState(732);
			match(Range);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (Invert - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(733);
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
			setState(736);
			match(BeginCondition);
			setState(737);
			valueChain();
			setState(738);
			matcher();
			setState(739);
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
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(741);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(742);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(743);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(744);
				term();
				}
				break;
			}
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(747);
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
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(750);
				match(Invert);
				}
			}

			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(753);
				sourceReference();
				}
				break;
			case 2:
				{
				setState(754);
				arithmeticExpression(0);
				}
				break;
			case 3:
				{
				setState(755);
				stringLiteral();
				}
				break;
			case 4:
				{
				setState(756);
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
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SourceMarker - 11)) | (1L << (DeleteMarker - 11)) | (1L << (Reflexive - 11)) | (1L << (LeftParen - 11)) | (1L << (First - 11)) | (1L << (Last - 11)) | (1L << (Plus - 11)) | (1L << (Minus - 11)) | (1L << (Zero - 11)) | (1L << (PositiveInteger - 11)) | (1L << (START_STRING - 11)))) != 0)) {
				{
				setState(759);
				lowerBound();
				}
			}

			setState(762);
			match(Range);
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(763);
				upperBound();
				}
				break;
			}
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(766);
				match(Colon);
				setState(767);
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
			setState(772);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Zero:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				match(Zero);
				}
				break;
			case Plus:
			case Minus:
			case PositiveInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
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
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(774);
				additiveOperator();
				}
			}

			setState(777);
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
			setState(779);
			match(START_STRING);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (StartCharacterCode - 77)) | (1L << (StartStringInterpolate - 77)) | (1L << (STRING_TEXT - 77)))) != 0)) {
				{
				{
				setState(780);
				stringContent();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
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
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartCharacterCode:
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				stringInterpolate();
				}
				break;
			case STRING_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
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
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartStringInterpolate:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				interpolateEvaluate();
				}
				break;
			case StartCharacterCode:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
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
			setState(796);
			match(StartCharacterCode);
			setState(797);
			arithmeticExpression(0);
			setState(798);
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
			setState(800);
			match(StartStringInterpolate);
			setState(813);
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
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(801);
					anyIdentifier();
					}
				}

				setState(804);
				reference();
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Message) {
					{
					setState(805);
					match(Message);
					}
				}

				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(808);
					parameterValues();
					}
				}

				}
				break;
			case Colon:
				{
				setState(811);
				match(Colon);
				setState(812);
				source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(815);
				transform();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==To) {
				{
				setState(818);
				match(To);
				setState(819);
				match(TemplateMatch);
				}
			}

			setState(822);
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
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(825);
				integerLiteral();
				}
				break;
			case 2:
				{
				setState(826);
				match(LeftParen);
				setState(827);
				arithmeticExpression(0);
				setState(828);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(830);
					additiveOperator();
					}
				}

				setState(833);
				sourceReference();
				}
				break;
			case 4:
				{
				setState(834);
				arithmeticContextKeyword();
				}
				break;
			case 5:
				{
				setState(835);
				termArithmeticOperation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(838);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(839);
						multiplicativeOperator();
						setState(840);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(842);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(843);
						additiveOperator();
						setState(844);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(846);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(847);
						multiplicativeOperator();
						setState(848);
						term();
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(850);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(851);
						additiveOperator();
						setState(852);
						term();
						}
						break;
					}
					} 
				}
				setState(858);
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
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				term();
				setState(860);
				multiplicativeOperator();
				setState(863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(861);
					term();
					}
					break;
				case 2:
					{
					setState(862);
					arithmeticExpression(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				term();
				setState(866);
				additiveOperator();
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(867);
					term();
					}
					break;
				case 2:
					{
					setState(868);
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
			setState(873);
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
			setState(875);
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
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(LeftParen);
				setState(878);
				valueProduction();
				setState(879);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
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
			setState(884);
			match(LeftParen);
			setState(885);
			operand();
			setState(886);
			templatesReference();
			setState(887);
			operand();
			setState(888);
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
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
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
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(894);
				stateAssignment();
				}
				break;
			}
			setState(897);
			compositionSequence();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Rule) {
				{
				{
				setState(898);
				definedCompositionSequence();
				}
				}
				setState(903);
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
			setState(904);
			match(Rule);
			setState(905);
			key();
			setState(906);
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
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				compositionComponents();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(909);
					compositionSkipRule();
					}
					}
					setState(912); 
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
			setState(919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(916);
					compositionSkipRule();
					}
					} 
				}
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(922);
			compositionComponent();
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(923);
					match(Comma);
					}
				}

				setState(926);
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
			setState(929);
			compositionMatcher();
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(930);
				transform();
				}
				break;
			}
			setState(936);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					compositionSkipRule();
					}
					} 
				}
				setState(938);
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
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				tokenMatcher();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(LeftBracket);
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(941);
					compositionSequence();
					}
					break;
				case 2:
					{
					setState(942);
					compositionSkipRule();
					}
					break;
				}
				setState(945);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				match(LeftBrace);
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(947);
					structureMemberMatchers();
					}
					break;
				case 2:
					{
					setState(948);
					compositionSkipRule();
					}
					break;
				}
				setState(951);
				match(RightBrace);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(953);
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
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftParen) {
				{
				{
				setState(956);
				compositionSkipRule();
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(962);
			structureMemberMatcher();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << Comma) | (1L << LeftParen) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(963);
					match(Comma);
					}
				}

				setState(966);
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
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(969);
				tokenMatcher();
				}
				break;
			case 2:
				{
				setState(970);
				compositionKeyValue();
				}
				break;
			}
			setState(976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(973);
					compositionSkipRule();
					}
					} 
				}
				setState(978);
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
			setState(979);
			match(StartMatcher);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Invert) {
				{
				setState(980);
				match(Invert);
				}
			}

			setState(983);
			compositionToken();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(984);
				match(Else);
				setState(985);
				compositionToken();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			match(EndMatcher);
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(992);
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
			setState(998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(995);
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
				setState(996);
				localIdentifier();
				}
				break;
			case START_STRING:
				{
				setState(997);
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
			setState(1000);
			match(Equal);
			setState(1003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SourceMarker:
			case DeleteMarker:
			case Reflexive:
				{
				setState(1001);
				sourceReference();
				}
				break;
			case START_STRING:
				{
				setState(1002);
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
			setState(1013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				match(Plus);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(Star);
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				match(Question);
				}
				break;
			case Equal:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				match(Equal);
				setState(1011);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PositiveInteger:
					{
					setState(1009);
					match(PositiveInteger);
					}
					break;
				case SourceMarker:
				case DeleteMarker:
				case Reflexive:
					{
					setState(1010);
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
			setState(1015);
			match(LeftParen);
			setState(1017); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1016);
				compositionCapture();
				}
				}
				setState(1019); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << SourceMarker) | (1L << DeleteMarker) | (1L << Reflexive) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << StartBytes) | (1L << StartMatcher) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Range) | (1L << Plus) | (1L << Minus) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (Zero - 65)) | (1L << (PositiveInteger - 65)) | (1L << (START_STRING - 65)) | (1L << (STATE_IDENTIFIER - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
			setState(1021);
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
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1023);
				match(Def);
				setState(1024);
				key();
				setState(1025);
				compositionMatcher();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1026);
					transform();
					}
				}

				setState(1029);
				match(SemiColon);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1031);
				compositionMatcher();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==To || _la==Deconstructor) {
					{
					setState(1033);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(1032);
						transform();
						}
						break;
					}
					setState(1035);
					match(To);
					setState(1036);
					stateSink();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039);
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
			setState(1044);
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
				setState(1042);
				key();
				}
				break;
			case StartMatcher:
				{
				setState(1043);
				compositionKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					compositionSkipRule();
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1052);
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
			setState(1054);
			tokenMatcher();
			setState(1055);
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
			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
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
				setState(1058);
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
			setState(1061);
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
			setState(1063);
			localIdentifier();
			setState(1066); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1064);
					match(Slash);
					setState(1065);
					localIdentifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1068); 
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
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				stateIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				localIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
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
			setState(1075);
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
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Include:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				match(Include);
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
				match(Def);
				}
				break;
			case StartTemplatesDefinition:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				match(StartTemplatesDefinition);
				}
				break;
			case StartSourceDefinition:
				enterOuterAlt(_localctx, 4);
				{
				setState(1080);
				match(StartSourceDefinition);
				}
				break;
			case StartSinkDefinition:
				enterOuterAlt(_localctx, 5);
				{
				setState(1081);
				match(StartSinkDefinition);
				}
				break;
			case StartComposerDefinition:
				enterOuterAlt(_localctx, 6);
				{
				setState(1082);
				match(StartComposerDefinition);
				}
				break;
			case StartProcessorDefinition:
				enterOuterAlt(_localctx, 7);
				{
				setState(1083);
				match(StartProcessorDefinition);
				}
				break;
			case StartOperatorDefinition:
				enterOuterAlt(_localctx, 8);
				{
				setState(1084);
				match(StartOperatorDefinition);
				}
				break;
			case EndDefinition:
				enterOuterAlt(_localctx, 9);
				{
				setState(1085);
				match(EndDefinition);
				}
				break;
			case StereotypeDefinition:
				enterOuterAlt(_localctx, 10);
				{
				setState(1086);
				match(StereotypeDefinition);
				}
				break;
			case Mod:
				enterOuterAlt(_localctx, 11);
				{
				setState(1087);
				match(Mod);
				}
				break;
			case Rule:
				enterOuterAlt(_localctx, 12);
				{
				setState(1088);
				match(Rule);
				}
				break;
			case When:
				enterOuterAlt(_localctx, 13);
				{
				setState(1089);
				match(When);
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 14);
				{
				setState(1090);
				match(Do);
				}
				break;
			case Otherwise:
				enterOuterAlt(_localctx, 15);
				{
				setState(1091);
				match(Otherwise);
				}
				break;
			case First:
			case Last:
				enterOuterAlt(_localctx, 16);
				{
				setState(1092);
				arithmeticContextKeyword();
				}
				break;
			case StartTestDefinition:
				enterOuterAlt(_localctx, 17);
				{
				setState(1093);
				match(StartTestDefinition);
				}
				break;
			case Assert:
				enterOuterAlt(_localctx, 18);
				{
				setState(1094);
				match(Assert);
				}
				break;
			case With:
				enterOuterAlt(_localctx, 19);
				{
				setState(1095);
				match(With);
				}
				break;
			case Provided:
				enterOuterAlt(_localctx, 20);
				{
				setState(1096);
				match(Provided);
				}
				break;
			case Modified:
				enterOuterAlt(_localctx, 21);
				{
				setState(1097);
				match(Modified);
				}
				break;
			case Shadowed:
				enterOuterAlt(_localctx, 22);
				{
				setState(1098);
				match(Shadowed);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 23);
				{
				setState(1099);
				match(From);
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 24);
				{
				setState(1100);
				match(Use);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 25);
				{
				setState(1101);
				match(Program);
				}
				break;
			case Modify:
				enterOuterAlt(_localctx, 26);
				{
				setState(1102);
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
			setState(1106); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1105);
					testBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1108); 
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
			setState(1113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1110);
					statement();
					}
					} 
				}
				setState(1115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1117); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1116);
					assertion();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1119); 
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
			setState(1121);
			match(Assert);
			setState(1122);
			valueChain();
			setState(1123);
			matcher();
			setState(1124);
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
			setState(1126);
			match(With);
			setState(1128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1127);
					moduleConfiguration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1132);
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
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				_localctx = new ModuleShadowingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1134);
					moduleIdentifier();
					setState(1135);
					match(From);
					}
					break;
				}
				setState(1139);
				match(Shadowed);
				setState(1140);
				moduleIdentifier();
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1141);
					dependencyProvision();
					}
					break;
				}
				setState(1145); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1144);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1147); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1149);
				match(EndDefinition);
				setState(1150);
				moduleIdentifier();
				}
				break;
			case 2:
				_localctx = new InheritModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				moduleIdentifier();
				setState(1153);
				match(Inherited);
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1154);
					match(From);
					setState(1155);
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
				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1158);
					moduleIdentifier();
					setState(1159);
					match(From);
					}
					break;
				}
				setState(1163);
				match(Modified);
				setState(1164);
				stringLiteral();
				setState(1166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1165);
					dependencyProvision();
					}
					break;
				}
				setState(1169); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1168);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1171); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1173);
				match(EndDefinition);
				setState(1174);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new ModuleImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Include) | (1L << Def) | (1L << When) | (1L << Do) | (1L << Otherwise) | (1L << StereotypeDefinition) | (1L << StartTemplatesDefinition) | (1L << StartSourceDefinition) | (1L << StartSinkDefinition) | (1L << StartComposerDefinition) | (1L << StartProcessorDefinition) | (1L << StartOperatorDefinition) | (1L << EndDefinition) | (1L << Rule) | (1L << First) | (1L << Last) | (1L << Mod) | (1L << StartTestDefinition) | (1L << Assert) | (1L << CoreSystem) | (1L << With) | (1L << Provided) | (1L << Modified) | (1L << Shadowed) | (1L << From))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Use - 65)) | (1L << (Program - 65)) | (1L << (Modify - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1176);
					moduleIdentifier();
					setState(1177);
					match(From);
					}
				}

				setState(1181);
				stringLiteral();
				setState(1184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StandAlone:
					{
					setState(1182);
					match(StandAlone);
					}
					break;
				case With:
					{
					setState(1183);
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
			setState(1190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CoreSystem:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
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
				setState(1189);
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
			setState(1192);
			match(Use);
			setState(1193);
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
			setState(1195);
			match(Modify);
			setState(1196);
			match(Program);
			setState(1198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1197);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1202);
			match(EndDefinition);
			setState(1203);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u04b8\4\2\t\2\4"+
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
		"\b\3\b\5\b\u014e\n\b\3\b\3\b\3\b\3\b\5\b\u0154\n\b\3\t\3\t\3\t\3\t\5\t"+
		"\u015a\n\t\3\t\7\t\u015d\n\t\f\t\16\t\u0160\13\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0167\n\n\3\13\3\13\3\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\f"+
		"\3\f\3\f\5\f\u0174\n\f\3\r\3\r\3\r\5\r\u0179\n\r\3\16\3\16\3\16\3\16\7"+
		"\16\u017f\n\16\f\16\16\16\u0182\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u0189"+
		"\n\17\3\17\5\17\u018c\n\17\6\17\u018e\n\17\r\17\16\17\u018f\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u019a\n\20\f\20\16\20\u019d\13\20"+
		"\3\20\3\20\5\20\u01a1\n\20\3\21\3\21\5\21\u01a5\n\21\3\22\3\22\3\22\3"+
		"\22\7\22\u01ab\n\22\f\22\16\22\u01ae\13\22\5\22\u01b0\n\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u01b9\n\23\f\23\16\23\u01bc\13\23\5\23\u01be"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u01c6\n\24\f\24\16\24\u01c9\13"+
		"\24\3\24\3\24\3\25\3\25\5\25\u01cf\n\25\3\26\3\26\3\26\5\26\u01d4\n\26"+
		"\3\27\3\27\3\27\5\27\u01d9\n\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u01e1"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u01e7\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01ee\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u01f5\n\31\3\31\3\31\5\31\u01f9"+
		"\n\31\3\32\3\32\3\32\3\32\7\32\u01ff\n\32\f\32\16\32\u0202\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u020a\n\33\3\33\5\33\u020d\n\33\3\33\5"+
		"\33\u0210\n\33\3\34\3\34\3\34\5\34\u0215\n\34\3\34\5\34\u0218\n\34\3\35"+
		"\3\35\3\35\3\35\5\35\u021e\n\35\6\35\u0220\n\35\r\35\16\35\u0221\3\35"+
		"\3\35\3\36\3\36\3\36\5\36\u0229\n\36\3\37\3\37\7\37\u022d\n\37\f\37\16"+
		"\37\u0230\13\37\3\37\6\37\u0233\n\37\r\37\16\37\u0234\5\37\u0237\n\37"+
		"\3 \3 \3 \3 \5 \u023d\n \3 \3 \5 \u0241\n \3 \3 \3 \3 \5 \u0247\n \3!"+
		"\6!\u024a\n!\r!\16!\u024b\3!\3!\5!\u0250\n!\3\"\3\"\3\"\3\"\5\"\u0256"+
		"\n\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\5&\u0264\n&\3&\3&\3\'\3\'\5\'"+
		"\u026a\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0277\n(\3)\3)\3"+
		")\5)\u027c\n)\3)\3)\5)\u0280\n)\5)\u0282\n)\3*\3*\5*\u0286\n*\3*\3*\3"+
		"*\7*\u028b\n*\f*\16*\u028e\13*\3*\3*\3+\3+\5+\u0294\n+\3+\7+\u0297\n+"+
		"\f+\16+\u029a\13+\3,\3,\3,\3,\3,\3,\5,\u02a2\n,\7,\u02a4\n,\f,\16,\u02a7"+
		"\13,\3,\5,\u02aa\n,\3,\5,\u02ad\n,\3,\3,\3,\5,\u02b2\n,\3,\3,\7,\u02b6"+
		"\n,\f,\16,\u02b9\13,\3,\5,\u02bc\n,\3,\5,\u02bf\n,\3,\3,\3,\3,\5,\u02c5"+
		"\n,\3,\3,\5,\u02c9\n,\3,\3,\5,\u02cd\n,\5,\u02cf\n,\3-\3-\5-\u02d3\n-"+
		"\3.\3.\5.\u02d7\n.\3/\3/\3/\3\60\5\60\u02dd\n\60\3\60\3\60\5\60\u02e1"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u02ec\n\62\3\62"+
		"\5\62\u02ef\n\62\3\63\5\63\u02f2\n\63\3\63\3\63\3\63\3\63\5\63\u02f8\n"+
		"\63\3\64\5\64\u02fb\n\64\3\64\3\64\5\64\u02ff\n\64\3\64\3\64\5\64\u0303"+
		"\n\64\3\65\3\65\5\65\u0307\n\65\3\66\5\66\u030a\n\66\3\66\3\66\3\67\3"+
		"\67\7\67\u0310\n\67\f\67\16\67\u0313\13\67\3\67\3\67\38\38\58\u0319\n"+
		"8\39\39\59\u031d\n9\3:\3:\3:\3:\3;\3;\5;\u0325\n;\3;\3;\5;\u0329\n;\3"+
		";\5;\u032c\n;\3;\3;\5;\u0330\n;\3;\5;\u0333\n;\3;\3;\5;\u0337\n;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\5<\u0342\n<\3<\3<\3<\5<\u0347\n<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u0359\n<\f<\16<\u035c\13<\3=\3="+
		"\3=\3=\5=\u0362\n=\3=\3=\3=\3=\5=\u0368\n=\5=\u036a\n=\3>\3>\3?\3?\3@"+
		"\3@\3@\3@\3@\5@\u0375\n@\3A\3A\3A\3A\3A\3A\3B\3B\5B\u037f\nB\3C\5C\u0382"+
		"\nC\3C\3C\7C\u0386\nC\fC\16C\u0389\13C\3D\3D\3D\3D\3E\3E\6E\u0391\nE\r"+
		"E\16E\u0392\5E\u0395\nE\3F\7F\u0398\nF\fF\16F\u039b\13F\3F\3F\5F\u039f"+
		"\nF\3F\5F\u03a2\nF\3G\3G\5G\u03a6\nG\3G\7G\u03a9\nG\fG\16G\u03ac\13G\3"+
		"H\3H\3H\3H\5H\u03b2\nH\3H\3H\3H\3H\5H\u03b8\nH\3H\3H\3H\5H\u03bd\nH\3"+
		"I\7I\u03c0\nI\fI\16I\u03c3\13I\3I\3I\5I\u03c7\nI\3I\5I\u03ca\nI\3J\3J"+
		"\5J\u03ce\nJ\3J\7J\u03d1\nJ\fJ\16J\u03d4\13J\3K\3K\5K\u03d8\nK\3K\3K\3"+
		"K\7K\u03dd\nK\fK\16K\u03e0\13K\3K\3K\5K\u03e4\nK\3L\3L\3L\5L\u03e9\nL"+
		"\3M\3M\3M\5M\u03ee\nM\3N\3N\3N\3N\3N\3N\5N\u03f6\nN\5N\u03f8\nN\3O\3O"+
		"\6O\u03fc\nO\rO\16O\u03fd\3O\3O\3P\3P\3P\3P\5P\u0406\nP\3P\3P\3P\3P\5"+
		"P\u040c\nP\3P\3P\5P\u0410\nP\3P\5P\u0413\nP\3Q\3Q\5Q\u0417\nQ\3Q\7Q\u041a"+
		"\nQ\fQ\16Q\u041d\13Q\3Q\3Q\3R\3R\3R\3S\3S\5S\u0426\nS\3T\3T\3U\3U\3U\6"+
		"U\u042d\nU\rU\16U\u042e\3V\3V\3V\5V\u0434\nV\3W\3W\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0452\n"+
		"X\3Y\6Y\u0455\nY\rY\16Y\u0456\3Z\7Z\u045a\nZ\fZ\16Z\u045d\13Z\3Z\6Z\u0460"+
		"\nZ\rZ\16Z\u0461\3[\3[\3[\3[\3[\3\\\3\\\6\\\u046b\n\\\r\\\16\\\u046c\3"+
		"\\\3\\\3]\3]\3]\5]\u0474\n]\3]\3]\3]\5]\u0479\n]\3]\6]\u047c\n]\r]\16"+
		"]\u047d\3]\3]\3]\3]\3]\3]\3]\5]\u0487\n]\3]\3]\3]\5]\u048c\n]\3]\3]\3"+
		"]\5]\u0491\n]\3]\6]\u0494\n]\r]\16]\u0495\3]\3]\3]\3]\3]\3]\5]\u049e\n"+
		"]\3]\3]\3]\5]\u04a3\n]\5]\u04a5\n]\3^\3^\5^\u04a9\n^\3_\3_\3_\3`\3`\3"+
		"`\6`\u04b1\n`\r`\16`\u04b2\3`\3`\3`\3`\2\3va\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\6\3\2#%\3\2/\60\3\2"+
		"\61\63\3\2+,\2\u0548\2\u00c3\3\2\2\2\4\u00d5\3\2\2\2\6\u0121\3\2\2\2\b"+
		"\u0123\3\2\2\2\n\u0126\3\2\2\2\f\u013f\3\2\2\2\16\u0153\3\2\2\2\20\u0159"+
		"\3\2\2\2\22\u0161\3\2\2\2\24\u0168\3\2\2\2\26\u0173\3\2\2\2\30\u0178\3"+
		"\2\2\2\32\u017a\3\2\2\2\34\u0185\3\2\2\2\36\u01a0\3\2\2\2 \u01a4\3\2\2"+
		"\2\"\u01a6\3\2\2\2$\u01b3\3\2\2\2&\u01c2\3\2\2\2(\u01ce\3\2\2\2*\u01d3"+
		"\3\2\2\2,\u01d8\3\2\2\2.\u01da\3\2\2\2\60\u01f8\3\2\2\2\62\u01fa\3\2\2"+
		"\2\64\u0205\3\2\2\2\66\u0211\3\2\2\28\u0219\3\2\2\2:\u0225\3\2\2\2<\u0236"+
		"\3\2\2\2>\u0246\3\2\2\2@\u024f\3\2\2\2B\u0255\3\2\2\2D\u0257\3\2\2\2F"+
		"\u025a\3\2\2\2H\u025c\3\2\2\2J\u0263\3\2\2\2L\u0269\3\2\2\2N\u0276\3\2"+
		"\2\2P\u0281\3\2\2\2R\u0283\3\2\2\2T\u0293\3\2\2\2V\u02ce\3\2\2\2X\u02d2"+
		"\3\2\2\2Z\u02d4\3\2\2\2\\\u02d8\3\2\2\2^\u02dc\3\2\2\2`\u02e2\3\2\2\2"+
		"b\u02eb\3\2\2\2d\u02f1\3\2\2\2f\u02fa\3\2\2\2h\u0306\3\2\2\2j\u0309\3"+
		"\2\2\2l\u030d\3\2\2\2n\u0318\3\2\2\2p\u031c\3\2\2\2r\u031e\3\2\2\2t\u0322"+
		"\3\2\2\2v\u0346\3\2\2\2x\u0369\3\2\2\2z\u036b\3\2\2\2|\u036d\3\2\2\2~"+
		"\u0374\3\2\2\2\u0080\u0376\3\2\2\2\u0082\u037e\3\2\2\2\u0084\u0381\3\2"+
		"\2\2\u0086\u038a\3\2\2\2\u0088\u0394\3\2\2\2\u008a\u0399\3\2\2\2\u008c"+
		"\u03a3\3\2\2\2\u008e\u03bc\3\2\2\2\u0090\u03c1\3\2\2\2\u0092\u03cd\3\2"+
		"\2\2\u0094\u03d5\3\2\2\2\u0096\u03e8\3\2\2\2\u0098\u03ea\3\2\2\2\u009a"+
		"\u03f7\3\2\2\2\u009c\u03f9\3\2\2\2\u009e\u0412\3\2\2\2\u00a0\u0416\3\2"+
		"\2\2\u00a2\u0420\3\2\2\2\u00a4\u0425\3\2\2\2\u00a6\u0427\3\2\2\2\u00a8"+
		"\u0429\3\2\2\2\u00aa\u0433\3\2\2\2\u00ac\u0435\3\2\2\2\u00ae\u0451\3\2"+
		"\2\2\u00b0\u0454\3\2\2\2\u00b2\u045b\3\2\2\2\u00b4\u0463\3\2\2\2\u00b6"+
		"\u0468\3\2\2\2\u00b8\u04a4\3\2\2\2\u00ba\u04a8\3\2\2\2\u00bc\u04aa\3\2"+
		"\2\2\u00be\u04ad\3\2\2\2\u00c0\u00c2\5\u00bc_\2\u00c1\u00c0\3\2\2\2\u00c2"+
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
		"\u0153\u014f\3\2\2\2\u0154\17\3\2\2\2\u0155\u0156\7\32\2\2\u0156\u0157"+
		"\5\24\13\2\u0157\u0158\7\33\2\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015e\3\2\2\2\u015b\u015d\5\22\n\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\21\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0166\7\24\2\2\u0162\u0163"+
		"\7\32\2\2\u0163\u0164\5\24\13\2\u0164\u0165\7\33\2\2\u0165\u0167\3\2\2"+
		"\2\u0166\u0162\3\2\2\2\u0166\u0167\3\2\2\2\u0167\23\3\2\2\2\u0168\u016d"+
		"\5\26\f\2\u0169\u016a\7\26\2\2\u016a\u016c\5\26\f\2\u016b\u0169\3\2\2"+
		"\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\25"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0174\5\30\r\2\u0171\u0174\5\32\16"+
		"\2\u0172\u0174\5\34\17\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\27\3\2\2\2\u0175\u0179\5\16\b\2\u0176\u0179\5v<\2"+
		"\u0177\u0179\5f\64\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177"+
		"\3\2\2\2\u0179\31\3\2\2\2\u017a\u017b\7\34\2\2\u017b\u0180\5\30\r\2\u017c"+
		"\u017d\7\27\2\2\u017d\u017f\5\30\r\2\u017e\u017c\3\2\2\2\u017f\u0182\3"+
		"\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0184\7\35\2\2\u0184\33\3\2\2\2\u0185\u018d\7\36"+
		"\2\2\u0186\u0189\5\b\5\2\u0187\u0189\5.\30\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\7\27\2\2\u018b\u018a\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0188\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\7\37\2\2\u0192\35\3\2\2\2\u0193\u0194\7\34\2\2\u0194"+
		"\u01a1\7\35\2\2\u0195\u0196\7\34\2\2\u0196\u019b\5 \21\2\u0197\u0198\7"+
		"\27\2\2\u0198\u019a\5 \21\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019e\u019f\7\35\2\2\u019f\u01a1\3\2\2\2\u01a0\u0193\3\2\2\2\u01a0"+
		"\u0195\3\2\2\2\u01a1\37\3\2\2\2\u01a2\u01a5\5H%\2\u01a3\u01a5\5N(\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5!\3\2\2\2\u01a6\u01af\7\36\2\2"+
		"\u01a7\u01ac\5,\27\2\u01a8\u01a9\7\27\2\2\u01a9\u01ab\5,\27\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01a7\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7\37\2\2\u01b2#\3\2\2\2\u01b3\u01b4"+
		"\7\36\2\2\u01b4\u01bd\7\34\2\2\u01b5\u01ba\5*\26\2\u01b6\u01b7\7\27\2"+
		"\2\u01b7\u01b9\5*\26\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01b5\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\35"+
		"\2\2\u01c0\u01c1\7\37\2\2\u01c1%\3\2\2\2\u01c2\u01c3\7 \2\2\u01c3\u01c7"+
		"\5(\25\2\u01c4\u01c6\5(\25\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cb\7U\2\2\u01cb\'\3\2\2\2\u01cc\u01cf\7S\2\2\u01cd\u01cf"+
		"\5~@\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf)\3\2\2\2\u01d0\u01d4"+
		"\5\"\22\2\u01d1\u01d4\5 \21\2\u01d2\u01d4\5\16\b\2\u01d3\u01d0\3\2\2\2"+
		"\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4+\3\2\2\2\u01d5\u01d9\5"+
		".\30\2\u01d6\u01d9\5 \21\2\u01d7\u01d9\5\16\b\2\u01d8\u01d5\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9-\3\2\2\2\u01da\u01db\5\b\5\2"+
		"\u01db\u01dc\5 \21\2\u01dc/\3\2\2\2\u01dd\u01f9\5\f\7\2\u01de\u01e0\7"+
		"\"\2\2\u01df\u01e1\5\u00a4S\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7\32\2\2\u01e3\u01e4\5<\37\2\u01e4\u01e6"+
		"\7\"\2\2\u01e5\u01e7\5\u00a4S\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2"+
		"\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\33\2\2\u01e9\u01f9\3\2\2\2\u01ea"+
		"\u01f9\5\66\34\2\u01eb\u01ed\7\"\2\2\u01ec\u01ee\5\u00a4S\2\u01ed\u01ec"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\5\62\32\2"+
		"\u01f0\u01f1\7\32\2\2\u01f1\u01f2\5<\37\2\u01f2\u01f4\7\"\2\2\u01f3\u01f5"+
		"\5\u00a4S\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u01f7\7\33\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01dd\3\2\2\2\u01f8"+
		"\u01de\3\2\2\2\u01f8\u01ea\3\2\2\2\u01f8\u01eb\3\2\2\2\u01f9\61\3\2\2"+
		"\2\u01fa\u01fb\7\34\2\2\u01fb\u0200\5\u00a4S\2\u01fc\u01fd\7\26\2\2\u01fd"+
		"\u01ff\5\u00a4S\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\7\35\2\2\u0204\63\3\2\2\2\u0205\u020f\7\f\2\2\u0206\u0207\5\u00aa"+
		"V\2\u0207\u0209\5\20\t\2\u0208\u020a\7\23\2\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d\58\35\2\u020c\u020b\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u0210\7\5\2\2\u020f"+
		"\u0206\3\2\2\2\u020f\u020e\3\2\2\2\u0210\65\3\2\2\2\u0211\u0212\5\u00aa"+
		"V\2\u0212\u0214\5\20\t\2\u0213\u0215\7\23\2\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\58\35\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\67\3\2\2\2\u0219\u021a\7\20\2\2\u021a\u021f"+
		"\7\36\2\2\u021b\u021d\5:\36\2\u021c\u021e\7\27\2\2\u021d\u021c\3\2\2\2"+
		"\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021b\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0224\7\37\2\2\u02249\3\2\2\2\u0225\u0228\5\b\5\2\u0226\u0229\5N(\2\u0227"+
		"\u0229\5\66\34\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229;\3\2\2"+
		"\2\u022a\u022e\5@!\2\u022b\u022d\5> \2\u022c\u022b\3\2\2\2\u022d\u0230"+
		"\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0237\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\5> \2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u022a"+
		"\3\2\2\2\u0236\u0232\3\2\2\2\u0237=\3\2\2\2\u0238\u0239\5R*\2\u0239\u023a"+
		"\5@!\2\u023a\u0247\3\2\2\2\u023b\u023d\7\7\2\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\5R*\2\u023f\u0241\7\b\2"+
		"\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243"+
		"\5@!\2\u0243\u0247\3\2\2\2\u0244\u0245\7\t\2\2\u0245\u0247\5@!\2\u0246"+
		"\u0238\3\2\2\2\u0246\u023c\3\2\2\2\u0246\u0244\3\2\2\2\u0247?\3\2\2\2"+
		"\u0248\u024a\5B\"\2\u0249\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0250\3\2\2\2\u024d\u024e\7\f\2\2\u024e"+
		"\u0250\7\5\2\2\u024f\u0249\3\2\2\2\u024f\u024d\3\2\2\2\u0250A\3\2\2\2"+
		"\u0251\u0256\5F$\2\u0252\u0256\5J&\2\u0253\u0256\5H%\2\u0254\u0256\5D"+
		"#\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0256C\3\2\2\2\u0257\u0258\5N(\2\u0258\u0259\7\f\2\2\u0259"+
		"E\3\2\2\2\u025a\u025b\5\6\4\2\u025bG\3\2\2\2\u025c\u025d\5N(\2\u025d\u025e"+
		"\7\13\2\2\u025e\u025f\7-\2\2\u025fI\3\2\2\2\u0260\u0261\5N(\2\u0261\u0262"+
		"\7\13\2\2\u0262\u0264\3\2\2\2\u0263\u0260\3\2\2\2\u0263\u0264\3\2\2\2"+
		"\u0264\u0265\3\2\2\2\u0265\u0266\5L\'\2\u0266K\3\2\2\2\u0267\u0268\7."+
		"\2\2\u0268\u026a\7\66\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\5\u00a6T\2\u026c\u026d\5\20\t\2\u026d\u026e"+
		"\7\22\2\2\u026e\u026f\5 \21\2\u026f\u0270\7\26\2\2\u0270M\3\2\2\2\u0271"+
		"\u0277\5\f\7\2\u0272\u0273\5\f\7\2\u0273\u0274\5P)\2\u0274\u0277\3\2\2"+
		"\2\u0275\u0277\5.\30\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0276\u0275"+
		"\3\2\2\2\u0277O\3\2\2\2\u0278\u0279\7\13\2\2\u0279\u027b\5\60\31\2\u027a"+
		"\u027c\5P)\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0282\3\2\2"+
		"\2\u027d\u027f\7\30\2\2\u027e\u0280\5P)\2\u027f\u027e\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u0278\3\2\2\2\u0281\u027d\3\2\2\2\u0282"+
		"Q\3\2\2\2\u0283\u0285\7!\2\2\u0284\u0286\7\31\2\2\u0285\u0284\3\2\2\2"+
		"\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028c\5T+\2\u0288\u0289"+
		"\7\66\2\2\u0289\u028b\5T+\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2"+
		"\2\2\u028f\u0290\7\67\2\2\u0290S\3\2\2\2\u0291\u0294\5\\/\2\u0292\u0294"+
		"\5V,\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0298\3\2\2\2\u0295\u0297\5`\61\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299U\3\2\2\2\u029a\u0298"+
		"\3\2\2\2\u029b\u02cf\5^\60\2\u029c\u02cf\5l\67\2\u029d\u02a5\7\36\2\2"+
		"\u029e\u029f\5\b\5\2\u029f\u02a1\5X-\2\u02a0\u02a2\7\27\2\2\u02a1\u02a0"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u029e\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02ac\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\7\27\2\2\u02a9\u02a8\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\7\5\2\2\u02ac\u02a9\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02cf\7\37\2\2\u02af"+
		"\u02b1\7\34\2\2\u02b0\u02b2\5Z.\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2"+
		"\2\2\u02b2\u02b7\3\2\2\2\u02b3\u02b4\7\27\2\2\u02b4\u02b6\5Z.\2\u02b5"+
		"\u02b3\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02be\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bc\7\27\2\2\u02bb"+
		"\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\7\5"+
		"\2\2\u02be\u02bb\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c8\7\35\2\2\u02c1\u02c4\7\32\2\2\u02c2\u02c5\5^\60\2\u02c3\u02c5\5"+
		"v<\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c7\7\33\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c1\3\2\2\2\u02c8\u02c9\3"+
		"\2\2\2\u02c9\u02cf\3\2\2\2\u02ca\u02cd\5\u00a4S\2\u02cb\u02cd\5\u00a8"+
		"U\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce"+
		"\u029b\3\2\2\2\u02ce\u029c\3\2\2\2\u02ce\u029d\3\2\2\2\u02ce\u02af\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cfW\3\2\2\2\u02d0\u02d3\5R*\2\u02d1\u02d3"+
		"\7\5\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3Y\3\2\2\2\u02d4"+
		"\u02d6\5R*\2\u02d5\u02d7\5\u009aN\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3"+
		"\2\2\2\u02d7[\3\2\2\2\u02d8\u02d9\7\65\2\2\u02d9\u02da\5\f\7\2\u02da]"+
		"\3\2\2\2\u02db\u02dd\5b\62\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e0\7.\2\2\u02df\u02e1\5d\63\2\u02e0\u02df\3\2"+
		"\2\2\u02e0\u02e1\3\2\2\2\u02e1_\3\2\2\2\u02e2\u02e3\78\2\2\u02e3\u02e4"+
		"\5N(\2\u02e4\u02e5\5R*\2\u02e5\u02e6\7\33\2\2\u02e6a\3\2\2\2\u02e7\u02ec"+
		"\5\16\b\2\u02e8\u02ec\5v<\2\u02e9\u02ec\5l\67\2\u02ea\u02ec\5~@\2\u02eb"+
		"\u02e7\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2"+
		"\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02ef\7\31\2\2\u02ee\u02ed\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02efc\3\2\2\2\u02f0\u02f2\7\31\2\2\u02f1\u02f0\3\2\2\2"+
		"\u02f1\u02f2\3\2\2\2\u02f2\u02f7\3\2\2\2\u02f3\u02f8\5\16\b\2\u02f4\u02f8"+
		"\5v<\2\u02f5\u02f8\5l\67\2\u02f6\u02f8\5~@\2\u02f7\u02f3\3\2\2\2\u02f7"+
		"\u02f4\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8e\3\2\2\2"+
		"\u02f9\u02fb\5b\62\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fe\7.\2\2\u02fd\u02ff\5d\63\2\u02fe\u02fd\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u0301\7\22\2\2\u0301\u0303\5"+
		"v<\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303g\3\2\2\2\u0304\u0307"+
		"\7F\2\2\u0305\u0307\5j\66\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"i\3\2\2\2\u0308\u030a\5z>\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030c\7G\2\2\u030ck\3\2\2\2\u030d\u0311\7H\2\2\u030e"+
		"\u0310\5n8\2\u030f\u030e\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2"+
		"\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315"+
		"\7R\2\2\u0315m\3\2\2\2\u0316\u0319\5p9\2\u0317\u0319\7Q\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0317\3\2\2\2\u0319o\3\2\2\2\u031a\u031d\5t;\2\u031b\u031d"+
		"\5r:\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031dq\3\2\2\2\u031e\u031f"+
		"\7O\2\2\u031f\u0320\5v<\2\u0320\u0321\7\25\2\2\u0321s\3\2\2\2\u0322\u032f"+
		"\7P\2\2\u0323\u0325\5\u00aaV\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2"+
		"\u0325\u0326\3\2\2\2\u0326\u0328\5\20\t\2\u0327\u0329\7\23\2\2\u0328\u0327"+
		"\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u032c\58\35\2\u032b"+
		"\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0330\3\2\2\2\u032d\u032e\7\22"+
		"\2\2\u032e\u0330\5\f\7\2\u032f\u0324\3\2\2\2\u032f\u032d\3\2\2\2\u0330"+
		"\u0332\3\2\2\2\u0331\u0333\5P)\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2"+
		"\2\u0333\u0336\3\2\2\2\u0334\u0335\7\13\2\2\u0335\u0337\7-\2\2\u0336\u0334"+
		"\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\7\25\2\2"+
		"\u0339u\3\2\2\2\u033a\u033b\b<\1\2\u033b\u0347\5h\65\2\u033c\u033d\7\32"+
		"\2\2\u033d\u033e\5v<\2\u033e\u033f\7\33\2\2\u033f\u0347\3\2\2\2\u0340"+
		"\u0342\5z>\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2"+
		"\2\u0343\u0347\5\16\b\2\u0344\u0347\5\u00acW\2\u0345\u0347\5x=\2\u0346"+
		"\u033a\3\2\2\2\u0346\u033c\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0346\u0345\3\2\2\2\u0347\u035a\3\2\2\2\u0348\u0349\f\b\2\2\u0349"+
		"\u034a\5|?\2\u034a\u034b\5v<\t\u034b\u0359\3\2\2\2\u034c\u034d\f\7\2\2"+
		"\u034d\u034e\5z>\2\u034e\u034f\5v<\b\u034f\u0359\3\2\2\2\u0350\u0351\f"+
		"\5\2\2\u0351\u0352\5|?\2\u0352\u0353\5~@\2\u0353\u0359\3\2\2\2\u0354\u0355"+
		"\f\4\2\2\u0355\u0356\5z>\2\u0356\u0357\5~@\2\u0357\u0359\3\2\2\2\u0358"+
		"\u0348\3\2\2\2\u0358\u034c\3\2\2\2\u0358\u0350\3\2\2\2\u0358\u0354\3\2"+
		"\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"w\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u035e\5~@\2\u035e\u0361\5|?\2\u035f"+
		"\u0362\5~@\2\u0360\u0362\5v<\2\u0361\u035f\3\2\2\2\u0361\u0360\3\2\2\2"+
		"\u0362\u036a\3\2\2\2\u0363\u0364\5~@\2\u0364\u0367\5z>\2\u0365\u0368\5"+
		"~@\2\u0366\u0368\5v<\2\u0367\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u036a"+
		"\3\2\2\2\u0369\u035d\3\2\2\2\u0369\u0363\3\2\2\2\u036ay\3\2\2\2\u036b"+
		"\u036c\t\3\2\2\u036c{\3\2\2\2\u036d\u036e\t\4\2\2\u036e}\3\2\2\2\u036f"+
		"\u0370\7\32\2\2\u0370\u0371\5 \21\2\u0371\u0372\7\33\2\2\u0372\u0375\3"+
		"\2\2\2\u0373\u0375\5\u0080A\2\u0374\u036f\3\2\2\2\u0374\u0373\3\2\2\2"+
		"\u0375\177\3\2\2\2\u0376\u0377\7\32\2\2\u0377\u0378\5\u0082B\2\u0378\u0379"+
		"\5\66\34\2\u0379\u037a\5\u0082B\2\u037a\u037b\7\33\2\2\u037b\u0081\3\2"+
		"\2\2\u037c\u037f\5\f\7\2\u037d\u037f\5~@\2\u037e\u037c\3\2\2\2\u037e\u037d"+
		"\3\2\2\2\u037f\u0083\3\2\2\2\u0380\u0382\5J&\2\u0381\u0380\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0387\5\u0088E\2\u0384\u0386"+
		"\5\u0086D\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2"+
		"\2\u0387\u0388\3\2\2\2\u0388\u0085\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b"+
		"\7*\2\2\u038b\u038c\5\b\5\2\u038c\u038d\5\u0088E\2\u038d\u0087\3\2\2\2"+
		"\u038e\u0395\5\u008aF\2\u038f\u0391\5\u009cO\2\u0390\u038f\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2"+
		"\2\2\u0394\u038e\3\2\2\2\u0394\u0390\3\2\2\2\u0395\u0089\3\2\2\2\u0396"+
		"\u0398\5\u009cO\2\u0397\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c"+
		"\u03a1\5\u008cG\2\u039d\u039f\7\27\2\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\5\u008aF\2\u03a1\u039e\3\2\2"+
		"\2\u03a1\u03a2\3\2\2\2\u03a2\u008b\3\2\2\2\u03a3\u03a5\5\u008eH\2\u03a4"+
		"\u03a6\5P)\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03aa\3\2\2"+
		"\2\u03a7\u03a9\5\u009cO\2\u03a8\u03a7\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u008d\3\2\2\2\u03ac\u03aa\3\2"+
		"\2\2\u03ad\u03bd\5\u0094K\2\u03ae\u03b1\7\34\2\2\u03af\u03b2\5\u0088E"+
		"\2\u03b0\u03b2\5\u009cO\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03bd\7\35\2\2\u03b4\u03b7\7"+
		"\36\2\2\u03b5\u03b8\5\u0090I\2\u03b6\u03b8\5\u009cO\2\u03b7\u03b5\3\2"+
		"\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03bd\7\37\2\2\u03ba\u03bd\5\f\7\2\u03bb\u03bd\5\u00a0Q\2\u03bc\u03ad"+
		"\3\2\2\2\u03bc\u03ae\3\2\2\2\u03bc\u03b4\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc"+
		"\u03bb\3\2\2\2\u03bd\u008f\3\2\2\2\u03be\u03c0\5\u009cO\2\u03bf\u03be"+
		"\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c9\5\u0092J\2\u03c5\u03c7"+
		"\7\27\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2"+
		"\u03c8\u03ca\5\u0090I\2\u03c9\u03c6\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u0091\3\2\2\2\u03cb\u03ce\5\u0094K\2\u03cc\u03ce\5\u00a0Q\2\u03cd\u03cb"+
		"\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03d2\3\2\2\2\u03cf\u03d1\5\u009cO"+
		"\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u0093\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d7\7!\2\2\u03d6"+
		"\u03d8\7\31\2\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3"+
		"\2\2\2\u03d9\u03de\5\u0096L\2\u03da\u03db\7\66\2\2\u03db\u03dd\5\u0096"+
		"L\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e3\7\67"+
		"\2\2\u03e2\u03e4\5\u009aN\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u0095\3\2\2\2\u03e5\u03e9\5\u0098M\2\u03e6\u03e9\5\u00a4S\2\u03e7\u03e9"+
		"\5l\67\2\u03e8\u03e5\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u0097\3\2\2\2\u03ea\u03ed\7\65\2\2\u03eb\u03ee\5\16\b\2\u03ec\u03ee\5"+
		"l\67\2\u03ed\u03eb\3\2\2\2\u03ed\u03ec\3\2\2\2\u03ee\u0099\3\2\2\2\u03ef"+
		"\u03f8\7/\2\2\u03f0\u03f8\7\61\2\2\u03f1\u03f8\7\64\2\2\u03f2\u03f5\7"+
		"\65\2\2\u03f3\u03f6\7G\2\2\u03f4\u03f6\5\16\b\2\u03f5\u03f3\3\2\2\2\u03f5"+
		"\u03f4\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03ef\3\2\2\2\u03f7\u03f0\3\2"+
		"\2\2\u03f7\u03f1\3\2\2\2\u03f7\u03f2\3\2\2\2\u03f8\u009b\3\2\2\2\u03f9"+
		"\u03fb\7\32\2\2\u03fa\u03fc\5\u009eP\2\u03fb\u03fa\3\2\2\2\u03fc\u03fd"+
		"\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0400\7\33\2\2\u0400\u009d\3\2\2\2\u0401\u0402\7\6\2\2\u0402\u0403\5"+
		"\b\5\2\u0403\u0405\5\u008eH\2\u0404\u0406\5P)\2\u0405\u0404\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7\26\2\2\u0408\u0413\3"+
		"\2\2\2\u0409\u040f\5\u008eH\2\u040a\u040c\5P)\2\u040b\u040a\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\7\13\2\2\u040e\u0410\5"+
		"L\'\2\u040f\u040b\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0413\3\2\2\2\u0411"+
		"\u0413\5J&\2\u0412\u0401\3\2\2\2\u0412\u0409\3\2\2\2\u0412\u0411\3\2\2"+
		"\2\u0413\u009f\3\2\2\2\u0414\u0417\5\b\5\2\u0415\u0417\5\u00a2R\2\u0416"+
		"\u0414\3\2\2\2\u0416\u0415\3\2\2\2\u0417\u041b\3\2\2\2\u0418\u041a\5\u009c"+
		"O\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b"+
		"\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u041f\5\u008c"+
		"G\2\u041f\u00a1\3\2\2\2\u0420\u0421\5\u0094K\2\u0421\u0422\7\22\2\2\u0422"+
		"\u00a3\3\2\2\2\u0423\u0426\7J\2\2\u0424\u0426\5\u00aeX\2\u0425\u0423\3"+
		"\2\2\2\u0425\u0424\3\2\2\2\u0426\u00a5\3\2\2\2\u0427\u0428\7I\2\2\u0428"+
		"\u00a7\3\2\2\2\u0429\u042c\5\u00a4S\2\u042a\u042b\7\21\2\2\u042b\u042d"+
		"\5\u00a4S\2\u042c\u042a\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042c\3\2\2"+
		"\2\u042e\u042f\3\2\2\2\u042f\u00a9\3\2\2\2\u0430\u0434\5\u00a6T\2\u0431"+
		"\u0434\5\u00a4S\2\u0432\u0434\5\u00a8U\2\u0433\u0430\3\2\2\2\u0433\u0431"+
		"\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u00ab\3\2\2\2\u0435\u0436\t\5\2\2\u0436"+
		"\u00ad\3\2\2\2\u0437\u0452\7\4\2\2\u0438\u0452\7\6\2\2\u0439\u0452\7#"+
		"\2\2\u043a\u0452\7$\2\2\u043b\u0452\7%\2\2\u043c\u0452\7&\2\2\u043d\u0452"+
		"\7\'\2\2\u043e\u0452\7(\2\2\u043f\u0452\7)\2\2\u0440\u0452\7\n\2\2\u0441"+
		"\u0452\7\63\2\2\u0442\u0452\7*\2\2\u0443\u0452\7\7\2\2\u0444\u0452\7\b"+
		"\2\2\u0445\u0452\7\t\2\2\u0446\u0452\5\u00acW\2\u0447\u0452\79\2\2\u0448"+
		"\u0452\7:\2\2\u0449\u0452\7<\2\2\u044a\u0452\7=\2\2\u044b\u0452\7>\2\2"+
		"\u044c\u0452\7?\2\2\u044d\u0452\7A\2\2\u044e\u0452\7C\2\2\u044f\u0452"+
		"\7D\2\2\u0450\u0452\7E\2\2\u0451\u0437\3\2\2\2\u0451\u0438\3\2\2\2\u0451"+
		"\u0439\3\2\2\2\u0451\u043a\3\2\2\2\u0451\u043b\3\2\2\2\u0451\u043c\3\2"+
		"\2\2\u0451\u043d\3\2\2\2\u0451\u043e\3\2\2\2\u0451\u043f\3\2\2\2\u0451"+
		"\u0440\3\2\2\2\u0451\u0441\3\2\2\2\u0451\u0442\3\2\2\2\u0451\u0443\3\2"+
		"\2\2\u0451\u0444\3\2\2\2\u0451\u0445\3\2\2\2\u0451\u0446\3\2\2\2\u0451"+
		"\u0447\3\2\2\2\u0451\u0448\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u044a\3\2"+
		"\2\2\u0451\u044b\3\2\2\2\u0451\u044c\3\2\2\2\u0451\u044d\3\2\2\2\u0451"+
		"\u044e\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0450\3\2\2\2\u0452\u00af\3\2"+
		"\2\2\u0453\u0455\5\u00b2Z\2\u0454\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u00b1\3\2\2\2\u0458\u045a\5\6"+
		"\4\2\u0459\u0458\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u0460\5\u00b4"+
		"[\2\u045f\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u045f\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u00b3\3\2\2\2\u0463\u0464\7:\2\2\u0464\u0465\5N("+
		"\2\u0465\u0466\5R*\2\u0466\u0467\5l\67\2\u0467\u00b5\3\2\2\2\u0468\u046a"+
		"\7<\2\2\u0469\u046b\5\u00b8]\2\u046a\u0469\3\2\2\2\u046b\u046c\3\2\2\2"+
		"\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f"+
		"\7=\2\2\u046f\u00b7\3\2\2\2\u0470\u0471\5\u00ba^\2\u0471\u0472\7A\2\2"+
		"\u0472\u0474\3\2\2\2\u0473\u0470\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\7?\2\2\u0476\u0478\5\u00ba^\2\u0477\u0479\5\u00b6"+
		"\\\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a"+
		"\u047c\5\6\4\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047b\3\2"+
		"\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\7)\2\2\u0480"+
		"\u0481\5\u00ba^\2\u0481\u04a5\3\2\2\2\u0482\u0483\5\u00ba^\2\u0483\u0486"+
		"\7@\2\2\u0484\u0485\7A\2\2\u0485\u0487\5\u00ba^\2\u0486\u0484\3\2\2\2"+
		"\u0486\u0487\3\2\2\2\u0487\u04a5\3\2\2\2\u0488\u0489\5\u00ba^\2\u0489"+
		"\u048a\7A\2\2\u048a\u048c\3\2\2\2\u048b\u0488\3\2\2\2\u048b\u048c\3\2"+
		"\2\2\u048c\u048d\3\2\2\2\u048d\u048e\7>\2\2\u048e\u0490\5l\67\2\u048f"+
		"\u0491\5\u00b6\\\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493"+
		"\3\2\2\2\u0492\u0494\5\6\4\2\u0493\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\7)"+
		"\2\2\u0498\u0499\5l\67\2\u0499\u04a5\3\2\2\2\u049a\u049b\5\u00ba^\2\u049b"+
		"\u049c\7A\2\2\u049c\u049e\3\2\2\2\u049d\u049a\3\2\2\2\u049d\u049e\3\2"+
		"\2\2\u049e\u049f\3\2\2\2\u049f\u04a2\5l\67\2\u04a0\u04a3\7B\2\2\u04a1"+
		"\u04a3\5\u00b6\\\2\u04a2\u04a0\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u04a5"+
		"\3\2\2\2\u04a4\u0473\3\2\2\2\u04a4\u0482\3\2\2\2\u04a4\u048b\3\2\2\2\u04a4"+
		"\u049d\3\2\2\2\u04a5\u00b9\3\2\2\2\u04a6\u04a9\7;\2\2\u04a7\u04a9\5\u00a4"+
		"S\2\u04a8\u04a6\3\2\2\2\u04a8\u04a7\3\2\2\2\u04a9\u00bb\3\2\2\2\u04aa"+
		"\u04ab\7C\2\2\u04ab\u04ac\5\u00b8]\2\u04ac\u00bd\3\2\2\2\u04ad\u04ae\7"+
		"E\2\2\u04ae\u04b0\7D\2\2\u04af\u04b1\5\6\4\2\u04b0\u04af\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b5\7)\2\2\u04b5\u04b6\7D\2\2\u04b6\u00bf\3\2\2\2\u00a9\u00c3"+
		"\u00c9\u00d0\u00d9\u00e9\u00f2\u00fb\u0106\u010a\u0115\u0121\u012a\u012e"+
		"\u013f\u0143\u0146\u014a\u014d\u0153\u0159\u015e\u0166\u016d\u0173\u0178"+
		"\u0180\u0188\u018b\u018f\u019b\u01a0\u01a4\u01ac\u01af\u01ba\u01bd\u01c7"+
		"\u01ce\u01d3\u01d8\u01e0\u01e6\u01ed\u01f4\u01f8\u0200\u0209\u020c\u020f"+
		"\u0214\u0217\u021d\u0221\u0228\u022e\u0234\u0236\u023c\u0240\u0246\u024b"+
		"\u024f\u0255\u0263\u0269\u0276\u027b\u027f\u0281\u0285\u028c\u0293\u0298"+
		"\u02a1\u02a5\u02a9\u02ac\u02b1\u02b7\u02bb\u02be\u02c4\u02c8\u02cc\u02ce"+
		"\u02d2\u02d6\u02dc\u02e0\u02eb\u02ee\u02f1\u02f7\u02fa\u02fe\u0302\u0306"+
		"\u0309\u0311\u0318\u031c\u0324\u0328\u032b\u032f\u0332\u0336\u0341\u0346"+
		"\u0358\u035a\u0361\u0367\u0369\u0374\u037e\u0381\u0387\u0392\u0394\u0399"+
		"\u039e\u03a1\u03a5\u03aa\u03b1\u03b7\u03bc\u03c1\u03c6\u03c9\u03cd\u03d2"+
		"\u03d7\u03de\u03e3\u03e8\u03ed\u03f5\u03f7\u03fd\u0405\u040b\u040f\u0412"+
		"\u0416\u041b\u0425\u042e\u0433\u0451\u0456\u045b\u0461\u046c\u0473\u0478"+
		"\u047d\u0486\u048b\u0490\u0495\u049d\u04a2\u04a4\u04a8\u04b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}