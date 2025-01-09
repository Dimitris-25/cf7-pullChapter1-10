package gr.aueb.cf.ch8;

import java.io.PrintWriter;

import java.io.FileNotFoundException;

public class PrintWriter2 {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/tmp/fw.txt");){
            pw.println("Hello world");
            System.out.println("Helooooo");
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
