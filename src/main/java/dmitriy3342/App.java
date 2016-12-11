package dmitriy3342;

import dmitriy3342.scaner_expression.ExpressionLexer;
import dmitriy3342.scaner_expression.ExpressionParser;
import dmitriy3342.scaner_expression.ExpressionVisitor;
import dmitriy3342.scaner_expression.ExpressionVisitorIml;
import dmitriy3342.scanner.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class App {
//    List<String> array_name = new ArrayList<String>();
//    List<Object> array_object;



    private static void printProg(String source) {
        // Get our lexer
        ExprLexer lexer = new ExprLexer(new ANTLRInputStream(source));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        ExprParser parser = new ExprParser(tokens);

        // Specify our entry point
        ExprParser.StartContext progeContext = parser.start();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrExprListner listener = new AntlrExprListner();

        walker.walk(listener, progeContext);
    }


    private static void visitProg(String source) {
        // Get our lexer
        ExprLexer lexer = new ExprLexer(new ANTLRInputStream(source));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        ExprParser parser = new ExprParser(tokens);

        // Specify our entry point
        ExprParser.StartContext progeContext = parser.start();


        ExprVisitor visitor = new ExprBaseVisitorImpl();
        Object result = visitor.visit(progeContext);
        System.out.println("Output : " + result);
    }


    public static void main(String[] args) {

       String expression = "" +
               "r=2^2;//asdfasfsdfasef\n" +
               "print(4^3);//asdfasfsdfasef\n" +
               "name=12*(5-6);\n" +
               "date(14.1);\n" +
               "accord(G#);\n" +
               "print(name);//yuioiyoi;";


        ANTLRInputStream in = new ANTLRInputStream(expression);
        ExpressionLexer lexer = new ExpressionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpressionParser parser = new ExpressionParser(tokens);

        ExpressionParser.StartContext progeContext = parser.start();

        ExpressionVisitor visitor = new ExpressionVisitorIml();

        visitor.visit(progeContext);

    }


}























