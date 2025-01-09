package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two integers from the
 * std input (keyboard) and calculates the result.
 */

public class ScannerAddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολες

        System.out.println("Please insert two integers for the exercise");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτυπωση των αποτελεσματων

        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με %d", num1,num2,sum);





    }
}
