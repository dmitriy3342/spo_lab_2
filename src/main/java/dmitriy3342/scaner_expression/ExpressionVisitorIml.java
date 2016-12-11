package dmitriy3342.scaner_expression;

import dmitriy3342.table_ids.TableIDs;

/**
 * Created by dmitr on 10.12.2016.
 */
public class ExpressionVisitorIml extends ExpressionBaseVisitor<Double> {

    TableIDs<Double> tableIDs = new TableIDs<Double>(100);

    @Override
    public Double visitStart(ExpressionParser.StartContext ctx) {
        return visit(ctx.exprBlock());
    }

    @Override
    public Double visitExprBlock(ExpressionParser.ExprBlockContext ctx) {
        return super.visitExprBlock(ctx);
    }

    @Override
    public Double visitExprLine(ExpressionParser.ExprLineContext ctx) {
        return super.visitExprLine(ctx);
    }

    @Override
    public Double visitDate(ExpressionParser.DateContext ctx) {

        String date = ctx.d.getText();
        String[] dateArr = date.split("\\.");
        Integer day =Integer.parseInt(dateArr[0]);
        Integer month =Integer.parseInt(dateArr[1]);

        if((day<=29&month==2) || (day<=31&month==1)){
            System.out.println("date: " + day + "." + month);
        }

        return defaultResult();

    }

    @Override
    public Double visitAccord(ExpressionParser.AccordContext ctx) {

        String accord = ctx.ac.getText();

        System.out.println("accord: " + accord);

        return defaultResult();
    }

    @Override
    public Double visitExpr(ExpressionParser.ExprContext ctx) {


        if (ctx.op != null && ctx.left != null && ctx.right != null) {

//            System.out.println("OP : " + ctx.op.getText());
            String op = ctx.op.getText();

            Double left = visit(ctx.left);
            Double right = visit(ctx.right);

            if (left != null && right != null) {

//                System.out.println("cleft : " + ctx.left.getText());
//                System.out.println("cright : " + ctx.right.getText());

//                System.out.println("left : " + left);
//                System.out.println("right : " + right);

                switch (op.charAt(0)) {
                    case '*':
//                        System.out.println('*');
                        return left * right;
                    case '/':
//                        System.out.println('/');
                        return left / right;
                    case '+':
//                        System.out.println('+');
                        return left + right;
                    case '-':
//                        System.out.println('-');
                        return left - right;
                    case '^':
                        return Math.pow(left, right);
                }
            }
        }

        if (ctx.exprCenter != null) {
            return visit(ctx.exprCenter);
        }
        return visitChildren(ctx);
    }

    @Override
    public Double visitElementAssignment(ExpressionParser.ElementAssignmentContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            Double tmp = visit(ctx.expr());
            String id = ctx.IDENTIFIER().getText();
            tableIDs.put(id, tmp);
            System.out.println("(visitElementAssignment) " + id + " = " + tmp + ";");
        }

        return defaultResult();
    }

    @Override
    public Double visitElementValue(ExpressionParser.ElementValueContext ctx) {
        if (ctx.IDENTIFIER() != null) {

            String id = ctx.IDENTIFIER().getText();
            Double tmp = tableIDs.get(id);
            if (tmp == null) {
                System.out.println("Error: " + id + " identifier no found...");
//                new Exception("Error: " + id + " identifier no found...");
            }
            System.out.println("(visitElementValue) " + id + " : " + tmp + ";");
            return tmp;
        }

        return defaultResult();
    }

    @Override
    public Double visitAtom(ExpressionParser.AtomContext ctx) {

        if (ctx.NUMBER() != null) {
            Double tmp = Double.parseDouble(ctx.getText());
            System.out.println("(visitAtom) " + tmp);
            return tmp;
        }
        return this.defaultResult();
    }

    @Override
    public Double visitPrint(ExpressionParser.PrintContext ctx) {

        System.out.println("print( " + ctx.expr().getText() + " );");

        Double tmp = visit(ctx.expr());

        if (tmp != null) {
            System.out.println(tmp);
        } else {
            System.out.println(ctx.expr().getText());
        }

        return defaultResult();
    }
}
