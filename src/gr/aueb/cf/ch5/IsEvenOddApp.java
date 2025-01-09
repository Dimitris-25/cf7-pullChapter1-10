package gr.aueb.cf.ch5;

import java.util.Scanner;

public class IsEvenOddApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.println("Please insert an integer");
        a = in.nextInt();

        System.out.printf("o %d%s ειναι αρτιος", a, isEven(a) ? " " : "δεν" );

    }
    public static boolean isEven(int a) {
        return (a % 2 == 0);
        }

    public static boolean isOdd(int a) {
        return !isEven(a);
    }
}


