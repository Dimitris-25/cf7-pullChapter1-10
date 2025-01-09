package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβανει εναν αριθμο που συμβολιζει βαθμο απο τον χρηστη
 * και επιστρεφει το καταλληλο μυνημα
 */

public class FallThroughGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        choise = in.nextInt();
//        switch FallThrough
        switch (choise) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Failure");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good!");
                break;
            case 9:
            case 10:
                System.out.println("Excellent!!!");
                break;
            default:
                System.out.println("Please insert your grade from 1 - 10");
                break;



        }
    }
}
