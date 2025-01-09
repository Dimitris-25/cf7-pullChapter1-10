package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Infinity while loop
 */

public class EternalWhile {
    public static void main(String[] args) {
        int i = 4;

        while (i < 0) {
            System.out.println("Never gets in");
        }

        while (i <= 1) {
            System.out.println("Only one iteration");
        }

        while (true) {
            System.out.println("Iam eternal");
        }

    }
}
