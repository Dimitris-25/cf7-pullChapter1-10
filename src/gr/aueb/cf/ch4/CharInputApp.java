package gr.aueb.cf.ch4;


import java.io.IOException;
import java.util.Scanner;

/**
 * Char input with System.in.read()
 */

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        int inputChar = ' '; //return the ordinal value of the char
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an ASCII char");
        inputChar = System.in.read();

        System.out.println("Char: " + (char) inputChar);
        System.out.println("Ordinal value: " + inputChar);
    }
}
