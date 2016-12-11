// Generated from D:/Учёба/4 Курс/СПО/lab_2/src/main/java\Expression.g4 by ANTLR 4.5.3
package dmitriy3342.scaner_expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpressionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#exprBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlock(ExpressionParser.ExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#exprLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLine(ExpressionParser.ExprLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#elementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAssignment(ExpressionParser.ElementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ExpressionParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(ExpressionParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#accord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccord(ExpressionParser.AccordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExpressionParser.AtomContext ctx);
}