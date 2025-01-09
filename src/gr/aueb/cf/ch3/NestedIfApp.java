package gr.aueb.cf.ch3;

/**
 * Δεχεται ως εισοδο: 1) Συνολο βαθμολογιας
 * και 2) Πληθος μαθηματων και υπολογιζει
 * τον μεσο ορο. Στη συνεχεια δινει feedback
 * στον χρηστη : 9-10 Αριστα, 7-8 Καλως,
 * 5-6 Λιαν Καλως, κατω απο 5 Αποτυχια.
 */

import java.util.Scanner;

public class NestedIfApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int moduleCounts = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules' count");
        moduleCounts = in.nextInt();

        if (moduleCounts <= 0) {
            System.out.println("Modules' cannot be zero");
            System.exit(1);
        }

        /**
         *  Στο παραδειγμα του μαθηματος ηταν ετσι αλλα το αλλαξα γιατι με
         *  μονη εξαιρεση στο average οταν ειναι -0 ο κωδικας αν βαλει καποιος - στο grades
         *  και - στο modules εκτελειται κανονικα γιατι - / - βγαζει θετικο προσημο!
         *  if (moduleCounts <= 0) {
         *             System.out.println("Modules' cannot be zero");
         *             System.exit(1);
         *         }
         */

        average = totalMarks / moduleCounts;
        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very Good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        }else {
            System.out.println("Fail: " + average);
        }

    }
}
