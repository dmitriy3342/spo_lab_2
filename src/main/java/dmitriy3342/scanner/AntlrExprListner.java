package dmitriy3342.scanner;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by dmitr on 07.12.2016.
 */
public class AntlrExprListner extends ExprBaseListener {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStart(ExprParser.StartContext ctx) {
        System.out.println("enterProg");
        System.out.println(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStart(ExprParser.StartContext ctx) {
        System.out.println("exitProg");
        System.out.println(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpr(ExprParser.ExprContext ctx) {
        System.out.println("enterExpr");
        System.out.println(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpr(ExprParser.ExprContext ctx) {
        System.out.println("exitExpr");
        System.out.println(ctx.getText());
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule");
        System.out.println(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule");
        System.out.println(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) {
        System.out.println("visitTerminal");
        System.out.println(node.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) {
        System.out.println("visitErrorNode");
        System.out.println(node.getText());
    }
}
