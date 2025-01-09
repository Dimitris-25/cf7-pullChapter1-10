package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangleAppAI {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.00005;

        double a, b, c;

        System.out.println("Please insert sides a, b, c:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        // Βρίσκουμε τη μεγαλύτερη πλευρά (υποτείνουσα)
        double max = Math.max(a, Math.max(b, c));
        double other1, other2;

        if (max == a) {
            other1 = b;
            other2 = c;
        } else if (max == b) {
            other1 = a;
            other2 = c;
        } else {
            other1 = a;
            other2 = b;
        }

        // Έλεγχος αν είναι ορθογώνιο τρίγωνο
        boolean isRight = (Math.abs(max * max - (other1 * other1 + other2 * other2)) <= EPSILON);

        System.out.printf("Triangle is right: %b%n", isRight);
    }
}

