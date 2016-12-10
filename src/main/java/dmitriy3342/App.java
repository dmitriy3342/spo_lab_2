package dmitriy3342;

import dmitriy3342.scanner.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;


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

       String expression = "(5-2)*(6-4)-2;";
        visitProg(expression);

    }


}























