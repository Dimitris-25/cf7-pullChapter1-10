package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamApp {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/tmp/filout.txt");
            printMsg(ps,"Hello Coding Factory plus");
            printMsg(System.out, "Coding Factory");
        }catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }

    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
