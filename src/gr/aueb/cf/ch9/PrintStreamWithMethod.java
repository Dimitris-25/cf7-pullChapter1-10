package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file7-ps.txt",true),true, StandardCharsets.UTF_8)) {

//            PrintStream ps = new PrintStream("C:/tmp/file7-ps.txt", StandardCharsets.UTF_8);

            printMessage(ps, "Hello Coding Factory");
            printMessage(System.out, "Hello CF");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Generic printstream method.
     * <p>
     * param ps the input Printstream
     * param message the input message
     */

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
