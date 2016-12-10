package dmitriy3342.scanner;

import com.sun.istack.internal.NotNull;

/**
 * Created by dmitr on 07.12.2016.
 */
public class ExprBaseVisitorImpl extends ExprBaseVisitor<Integer> {


//    private Integer op(){
//
//    }

    @Override
    public Integer visitProg(@NotNull ExprParser.ProgContext context) {



      //  if(context.NEWLINE() != null) return this.defaultResult();
        System.out.println("visitProg : " + context.getText());
        Integer result = visit(context.expr());
        System.out.println("result : " + result);
        return result;
    }

    @Override
    public Integer visitExpr(@NotNull ExprParser.ExprContext context) {


        if (context.op != null && context.left!=null && context.right!=null) {
            System.out.println("OP : " + context.op.getText());
            String op = context.op.getText();

            Integer left = visit(context.left);
            Integer right = visit(context.right);


            System.out.println("cleft : " + context.left.getText());
            System.out.println("cright : " + context.right.getText());

            System.out.println("left : " + left);
            System.out.println("right : " + right);

            switch (op.charAt(0)) {
                case '*':
                    System.out.println('*');
                    return left * right;
                case '/':
                    System.out.println('/');
                    return left / right;
                case '+':
                    System.out.println('+');
                    return left + right;
                case '-':
                    System.out.println('-');
                    return left - right;
            }
        }



        System.out.println("expr : " + context.getText());
        System.out.println("int : " + context.NUMBER());


//        System.out.println("mul_or_del : " + context.);
//        System.out.println("PLUS : " + context.PLUS());
//        System.out.println("MINUS : " + context.MINUS());
        System.out.println();

        //Integer.parseInt(context.INT().getText());

        if (context.NUMBER() != null)
            return Integer.parseInt(context.NUMBER().getText());
        // visitChildren(context);
        Integer result = visit(context.getChild(1));
        System.out.println("result : " + result);
        return result;
    }





    //    @Override
//    public Integer visitTerminal(TerminalNode node) {
//        System.out.println("node : " + node.getText());
//
//
//        return super.visitTerminal(node);
//    }
//
//
//    @Override
//    public Integer visit(ParseTree tree) {
//        System.out.println("tree : " + tree.getText());
//
//        return super.visit(tree);
//    }
}

