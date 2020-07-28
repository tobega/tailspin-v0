// Generated from TailspinParser.g4 by ANTLR 4.8
package tailspin.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TailspinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TailspinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TailspinParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TailspinParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#inclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusion(TailspinParser.InclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definition}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(TailspinParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueChainToSink}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templatesDefinition}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatesDefinition(TailspinParser.TemplatesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code processorDefinition}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessorDefinition(TailspinParser.ProcessorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code composerDefinition}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposerDefinition(TailspinParser.ComposerDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testDefinition}
	 * labeled alternative in {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestDefinition(TailspinParser.TestDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(TailspinParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#parameterDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDefinitions(TailspinParser.ParameterDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(TailspinParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#sourceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceReference(TailspinParser.SourceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#deleteState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteState(TailspinParser.DeleteStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(TailspinParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureReference(TailspinParser.StructureReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayReference(TailspinParser.ArrayReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#dimensionReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionReference(TailspinParser.DimensionReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#simpleDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDimension(TailspinParser.SimpleDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#multiValueDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiValueDimension(TailspinParser.MultiValueDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#valueProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueProduction(TailspinParser.ValueProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureLiteral(TailspinParser.StructureLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#keyValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValues(TailspinParser.KeyValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(TailspinParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralTemplates(TailspinParser.LiteralTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaTemplates(TailspinParser.LambdaTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callDefinedTransform}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallDefinedTransform(TailspinParser.CallDefinedTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaArrayTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaArrayTemplates(TailspinParser.LambdaArrayTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayIndexDecomposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndexDecomposition(TailspinParser.ArrayIndexDecompositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSink(TailspinParser.SinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#templatesReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatesReference(TailspinParser.TemplatesReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#parameterValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterValues(TailspinParser.ParameterValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#parameterValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterValue(TailspinParser.ParameterValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#templatesBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatesBody(TailspinParser.TemplatesBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#matchTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchTemplate(TailspinParser.MatchTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TailspinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(TailspinParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#resultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultValue(TailspinParser.ResultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TailspinParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#sendToTemplates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stateAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateAssignment(TailspinParser.StateAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stateSink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSink(TailspinParser.StateSinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#valueChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueChain(TailspinParser.ValueChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransform(TailspinParser.TransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#matcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatcher(TailspinParser.MatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#criterion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriterion(TailspinParser.CriterionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeMatch(TailspinParser.RangeMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpMatch(TailspinParser.RegexpMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureMatch(TailspinParser.StructureMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMatch(TailspinParser.ArrayMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureContentMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureContentMatcher(TailspinParser.StructureContentMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayContentMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayContentMatcher(TailspinParser.ArrayContentMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#literalMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralMatch(TailspinParser.LiteralMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#rangeBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeBounds(TailspinParser.RangeBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TailspinParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#lowerBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerBound(TailspinParser.LowerBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#upperBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpperBound(TailspinParser.UpperBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#rangeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeLiteral(TailspinParser.RangeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#nonZeroInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonZeroInteger(TailspinParser.NonZeroIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TailspinParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(TailspinParser.StringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stringInterpolate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInterpolate(TailspinParser.StringInterpolateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#characterCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterCode(TailspinParser.CharacterCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#interpolateEvaluate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolateEvaluate(TailspinParser.InterpolateEvaluateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(TailspinParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(TailspinParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#composerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposerBody(TailspinParser.ComposerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#definedCompositionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedCompositionSequence(TailspinParser.DefinedCompositionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionSequence(TailspinParser.CompositionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionComponents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionComponents(TailspinParser.CompositionComponentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionComponent(TailspinParser.CompositionComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionMatcher(TailspinParser.CompositionMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureMemberMatchers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureMemberMatchers(TailspinParser.StructureMemberMatchersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureMemberMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureMemberMatcher(TailspinParser.StructureMemberMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#tokenMatcher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenMatcher(TailspinParser.TokenMatcherContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionToken(TailspinParser.CompositionTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#literalComposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralComposition(TailspinParser.LiteralCompositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#multiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplier(TailspinParser.MultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionSkipRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionSkipRule(TailspinParser.CompositionSkipRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionCapture(TailspinParser.CompositionCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionKeyValue(TailspinParser.CompositionKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#compositionKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositionKey(TailspinParser.CompositionKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#localIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalIdentifier(TailspinParser.LocalIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#stateIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateIdentifier(TailspinParser.StateIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#externalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalIdentifier(TailspinParser.ExternalIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#anyIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyIdentifier(TailspinParser.AnyIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arithmeticContextKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticContextKeyword(TailspinParser.ArithmeticContextKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(TailspinParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#testBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestBody(TailspinParser.TestBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#testBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestBlock(TailspinParser.TestBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(TailspinParser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#dependencyProvision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencyProvision(TailspinParser.DependencyProvisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#moduleConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfiguration(TailspinParser.ModuleConfigurationContext ctx);
}