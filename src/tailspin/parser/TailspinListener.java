// Generated from Tailspin.g4 by ANTLR 4.7.2
package tailspin.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TailspinParser}.
 */
public interface TailspinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TailspinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TailspinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TailspinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TailspinParser.ProgContext ctx);
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
}