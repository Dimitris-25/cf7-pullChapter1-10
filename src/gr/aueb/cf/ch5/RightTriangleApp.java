package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.00005;

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        boolean isRight = false;

        System.out.println("Please insert a, b, c");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        System.out.printf("Triangle is right: %b", isRight);


    }
}
