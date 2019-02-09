// Generated from TailspinParser.g4 by ANTLR 4.7.1
package tailspin.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TailspinParser}.
 */
public interface TailspinParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TailspinParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TailspinParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TailspinParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TailspinParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TailspinParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(TailspinParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(TailspinParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(TailspinParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(TailspinParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 */
	void enterTemplates(TailspinParser.TemplatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#templates}.
	 * @param ctx the parse tree
	 */
	void exitTemplates(TailspinParser.TemplatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#templatesBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplatesBody(TailspinParser.TemplatesBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#templatesBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplatesBody(TailspinParser.TemplatesBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBlock(TailspinParser.TemplateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#templateBlock}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBlock(TailspinParser.TemplateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TailspinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TailspinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#valueChain}.
	 * @param ctx the parse tree
	 */
	void enterValueChain(TailspinParser.ValueChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#valueChain}.
	 * @param ctx the parse tree
	 */
	void exitValueChain(TailspinParser.ValueChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransform(TailspinParser.TransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransform(TailspinParser.TransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterMatcher(TailspinParser.MatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitMatcher(TailspinParser.MatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TailspinParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TailspinParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRangeLiteral(TailspinParser.RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#rangeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRangeLiteral(TailspinParser.RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(TailspinParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(TailspinParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TailspinParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TailspinParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(TailspinParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(TailspinParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#stringInterpolate}.
	 * @param ctx the parse tree
	 */
	void enterStringInterpolate(TailspinParser.StringInterpolateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#stringInterpolate}.
	 * @param ctx the parse tree
	 */
	void exitStringInterpolate(TailspinParser.StringInterpolateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 */
	void enterSink(TailspinParser.SinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 */
	void exitSink(TailspinParser.SinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link TailspinParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(TailspinParser.ArithmeticExpressionContext ctx);
}