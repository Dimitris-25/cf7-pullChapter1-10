package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuIfFeedbackApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω η 5 για εξοδο");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Αναζητηση");
            System.out.println("3. Διαγραφη");
            System.out.println("4. Ενημερωση");
            System.out.println("5. Εξοδος");
            choise = in.nextInt();

            if (choise == 1) {
                System.out.println("Επιτυχης εισαγωγη");
            }
            if (choise == 2) {
                System.out.println("Επιτυχης αναζητηση");
            }

            if (choise == 3) {
                System.out.println("Επιτυχης διαγραφη");
            }
            if (choise == 1) {
                System.out.println("Επιτυχης ενημερωση");
            }

            if (choise == 1) {
                System.out.println("Επιλεξατε αξοδος");
            }
        }while (choise!=5);

        System.out.println("Goodbye");
    }
}
