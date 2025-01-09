package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MathPowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Παρακαλω δωστε εναν αριθμο");
        num = in.nextInt();

        System.out.printf("Square of num %d is  %d , cube of num %d is %d ", num, (int) Math.pow(num, 2), num,  (int) Math.pow(num, 3));

    }
}
