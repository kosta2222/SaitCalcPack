/**
 * Created by papa on 03.02.2017.
 */
//<%@ page import="com.kosta.antlr.calc.CalcCl" %> !-->
package com.kosta.antlr;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class CalcCl
{
    private static CalcCl instance=null;




    public double calculate(String st){

        CharStream cs = new ANTLRInputStream(st);
        CalculatorLexer lexer = new CalculatorLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);

        ParseTree tree = parser.input(); // begin parsing at // rule
// print LISP-style tree
        System.out.println(tree.toStringTree(parser));

        CalculatorBaseVisitorImpl visitor = new CalculatorBaseVisitorImpl();
        double result= visitor.visit(tree);
        return result;



    }

    private CalcCl() {}
    public static CalcCl getInstance(){
        if(instance==null)
            instance=new CalcCl();
        return instance;
    }

}
