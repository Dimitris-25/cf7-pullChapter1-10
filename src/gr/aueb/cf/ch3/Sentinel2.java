package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int positivesCount = 0;

        System.out.println("Please insert a num (int)");

        while ((inputNum = in.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("Please insert a num (int)");
        }

        System.out.println("Positive count = " + positivesCount);
    }
}
