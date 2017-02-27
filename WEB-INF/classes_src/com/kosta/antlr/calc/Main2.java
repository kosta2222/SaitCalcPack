package com.kosta.antlr.calc;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

/**
 * Created by papa on 14.02.2017.
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("-repl")) {

            InputStream is = System.in;
            Reader r = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(r);
            String st = "";
            System.out.println("REPL input:");
            while (!st.equals("q")) {
                try {
                    st = br.readLine();
                } catch (Exception e) {

                    System.out.println("Error: " + e);
                }


                CharStream cs = new ANTLRInputStream(st);
                CalcLexer lexer = new CalcLexer(cs);

                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalcParser parser = new CalcParser(tokens);
               /// if (!st.equals("q")) {
                    ParseTree tree = parser.input(); // begin parsing at // rule
// print LISP-style tree
                    System.out.println(tree.toStringTree(parser));

                    CalcBaseVisitorImpl visitor = new CalcBaseVisitorImpl();


                    double result = visitor.visit(tree);
                    System.out.println("Result: " + result);

               ///}
            }
        } else {
            InputStream is = new FileInputStream(new File(args[0]));

            OutputStream os = new FileOutputStream(args[1], true);
            StringBuilder sb = new StringBuilder();
            int l = 0;
            int b = 0;
            while (is.available() > 0) {
                b = is.read();

                if (b == (int) '\n') {
                    //
                    l += 1;
                    CharStream cs = new ANTLRInputStream(sb.toString());
                    CalcLexer lexer = new CalcLexer(cs);
                /*lexer.reset();*/

                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    CalcParser parser = new CalcParser(tokens);
                    ParseTree tree = parser.input(); // begin parsing at // rule

                    System.out.println();


                    CalcBaseVisitorImpl visitor = new CalcBaseVisitorImpl();


                    double result = visitor.visit(tree);
                    String sD = sb.toString() + "=" + String.valueOf(result);
                    byte[] bytes = sD.getBytes();
                    os.write(bytes);
                    os.write((int) '\n');

                    sb.delete(0, sb.toString().length() - 1);
                    System.out.println("line:" + l);
                    continue;
                }

                sb.append((char) b);


            }
            is.close();
            os.close();

        }
    }



    }

