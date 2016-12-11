// Generated from D:/Учёба/4 Курс/СПО/lab_2/src/main/java\Expression.g4 by ANTLR 4.5.3
package dmitriy3342.scaner_expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpressionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#exprBlock}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(ExpressionParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#exprBlock}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(ExpressionParser.ExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#exprLine}.
	 * @param ctx the parse tree
	 */
	void enterExprLine(ExpressionParser.ExprLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#exprLine}.
	 * @param ctx the parse tree
	 */
	void exitExprLine(ExpressionParser.ExprLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#elementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterElementAssignment(ExpressionParser.ElementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#elementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitElementAssignment(ExpressionParser.ElementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(ExpressionParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(ExpressionParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(ExpressionParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(ExpressionParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#accord}.
	 * @param ctx the parse tree
	 */
	void enterAccord(ExpressionParser.AccordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#accord}.
	 * @param ctx the parse tree
	 */
	void exitAccord(ExpressionParser.AccordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExpressionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExpressionParser.AtomContext ctx);
}