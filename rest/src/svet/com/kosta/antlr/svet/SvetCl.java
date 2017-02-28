package com.kosta.antlr.svet;
/**
 * Created by papa on 03.02.2017.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class SvetCl
{
private static SvetCl instance=null;



    public double calculate(String st){

        CharStream cs = new ANTLRInputStream(st);
        svetLexer lexer = new svetLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        svetParser parser = new svetParser(tokens);

        ParseTree tree = parser.input(); // begin parsing at // rule
// print LISP-style tree
        System.out.println(tree.toStringTree(parser));

        svetBaseVisitorImpl visitor = new svetBaseVisitorImpl();
        double result= visitor.visit(tree);
        return result;



    }

    private SvetCl() {}
    public static SvetCl getInstance(){
        if(instance==null)
            instance=new SvetCl();
        return instance;
    }
}
