// Generated from TailspinParser.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 */
	void enterSink(TailspinParser.SinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#sink}.
	 * @param ctx the parse tree
	 */
	void exitSink(TailspinParser.SinkContext ctx);
}