package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PositiveCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int positivesCount = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();
        while (num >= 0) {
            positivesCount++;
            System.out.println("Please insert a num (int)");
            num = in.nextInt();
        }
        System.out.println("Positives count = "+ positivesCount);
    }
}
