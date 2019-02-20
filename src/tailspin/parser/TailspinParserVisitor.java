// Generated from TailspinParser.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link TailspinParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(TailspinParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#dereferenceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereferenceValue(TailspinParser.DereferenceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureDereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDereference(TailspinParser.StructureDereferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayDereference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDereference(TailspinParser.ArrayDereferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TailspinParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#structureLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureLiteral(TailspinParser.StructureLiteralContext ctx);
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
	 * Visit a parse tree produced by the {@code inlineTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTemplates(TailspinParser.InlineTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callDefinedTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallDefinedTemplates(TailspinParser.CallDefinedTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTemplates}
	 * labeled alternative in {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTemplates(TailspinParser.ArrayTemplatesContext ctx);
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
	 * Visit a parse tree produced by the {@code resultValue}
	 * labeled alternative in {@link TailspinParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultValue(TailspinParser.ResultValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sendToTemplates}
	 * labeled alternative in {@link TailspinParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendToTemplates(TailspinParser.SendToTemplatesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement}
	 * labeled alternative in {@link TailspinParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TailspinParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stateAssignment}
	 * labeled alternative in {@link TailspinParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateAssignment(TailspinParser.StateAssignmentContext ctx);
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
	 * Visit a parse tree produced by the {@code integerEquals}
	 * labeled alternative in {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerEquals(TailspinParser.IntegerEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeMatch}
	 * labeled alternative in {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeMatch(TailspinParser.RangeMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpMatch}
	 * labeled alternative in {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpMatch(TailspinParser.RegexpMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureMatch}
	 * labeled alternative in {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureMatch(TailspinParser.StructureMatchContext ctx);
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
	 * Visit a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSink(TailspinParser.SinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TailspinParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx);
}