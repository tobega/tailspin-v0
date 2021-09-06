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
	 * Visit a parse tree produced by {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TailspinParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(TailspinParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#valueChainToSink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueChainToSink(TailspinParser.ValueChainToSinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#templatesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatesDefinition(TailspinParser.TemplatesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#processorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessorDefinition(TailspinParser.ProcessorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#typestateDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypestateDefinition(TailspinParser.TypestateDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#messageDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageDefinition(TailspinParser.MessageDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#composerDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposerDefinition(TailspinParser.ComposerDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#testDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestDefinition(TailspinParser.TestDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#operatorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorDefinition(TailspinParser.OperatorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#dataDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDeclaration(TailspinParser.DataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#dataDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDefinition(TailspinParser.DataDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#localDataDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDataDeclaration(TailspinParser.LocalDataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#localDataDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDataDefinition(TailspinParser.LocalDataDefinitionContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#lens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLens(TailspinParser.LensContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(TailspinParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(TailspinParser.GroupingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#collectedValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectedValue(TailspinParser.CollectedValueContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#relationLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationLiteral(TailspinParser.RelationLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#bytesLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytesLiteral(TailspinParser.BytesLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#byteValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByteValue(TailspinParser.ByteValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructures(TailspinParser.StructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayExpansion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpansion(TailspinParser.ArrayExpansionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureExpansion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureExpansion(TailspinParser.StructureExpansionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(TailspinParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callDefinedTransform}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallDefinedTransform(TailspinParser.CallDefinedTransformContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#collectorChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectorChain(TailspinParser.CollectorChainContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#membrane}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembrane(TailspinParser.MembraneContext ctx);
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
	 * Visit a parse tree produced by the {@code stereotypeMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStereotypeMatch(TailspinParser.StereotypeMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitMatch}
	 * labeled alternative in {@link TailspinParser#typeMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitMatch(TailspinParser.UnitMatchContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#sequenceMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceMatch(TailspinParser.SequenceMatchContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(TailspinParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#measureProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureProduct(TailspinParser.MeasureProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#measureDenominator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasureDenominator(TailspinParser.MeasureDenominatorContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#arithmeticValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticValue(TailspinParser.ArithmeticValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#termArithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermArithmeticOperation(TailspinParser.TermArithmeticOperationContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TailspinParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#operatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(TailspinParser.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(TailspinParser.OperandContext ctx);
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
	 * Visit a parse tree produced by the {@code moduleShadowing}
	 * labeled alternative in {@link TailspinParser#moduleConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleShadowing(TailspinParser.ModuleShadowingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inheritModule}
	 * labeled alternative in {@link TailspinParser#moduleConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritModule(TailspinParser.InheritModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleModification}
	 * labeled alternative in {@link TailspinParser#moduleConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleModification(TailspinParser.ModuleModificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduleImport}
	 * labeled alternative in {@link TailspinParser#moduleConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleImport(TailspinParser.ModuleImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#moduleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleIdentifier(TailspinParser.ModuleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#useModule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseModule(TailspinParser.UseModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#programModification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramModification(TailspinParser.ProgramModificationContext ctx);
}