package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamCharSetApp {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/tmp/fileUTF.txt");
            ps.println("Hello");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
