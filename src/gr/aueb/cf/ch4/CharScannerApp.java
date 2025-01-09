package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβαζει char με σκαννερ
 */

public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        // H nextline επιστρεφει ολη τη γραμμη μεχρι το \n
        // H charΑΤ(0) επιστρεφει τον πρωτο char ως utf-16

        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " + inputChar);


    }
}
