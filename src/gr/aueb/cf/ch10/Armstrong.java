package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Paradeigma aritmon armstrong
 * 153 => (1 ^ 3) + (5 ^ 3) + (3 ^ 3) an isxyei ayto tote onomazetai armstrong
 */

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits;
        int originalNUm;
        int digit;

        System.out.println("Please insert a number(int) for check");
        num = in.nextInt();
        numberOfDigits = String.valueOf(num).length(); // value of transform a primitive to String.
        originalNUm = num;

        originalNUm = num;

        while (num !=0) {
            digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10; // num = num / 10;
        }
        System.out.printf("%d%s Armstrong", originalNUm, (sum == originalNUm) ? " is " : " is not");


    }

}
