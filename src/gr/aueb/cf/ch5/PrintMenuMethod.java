package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PrintMenuMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            printMenu();
            choise = in.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Επιτυχης εισαγωγη");
                    break;
                case 2:
                    System.out.println("Επιτυχης διαγραφη");
                    break;
                case 3:
                    System.out.println("Επιτυχης ενημερωση");
                    break;
                case 4:
                    System.out.println("Επιτυχης αναζητηση");
                    break;
                case 5:
                    System.out.println("Επιτυχης εξοδο");
                    break;
                default:
                    System.out.println("Λαθος επιλογη");
                    break;
            }
        }while (choise!=5);
    }
    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη");
        System.out.println("2. Διαγραφη");
        System.out.println("3. Αναζητηση");
        System.out.println("4. Ενημερωση");
        System.out.println("5. Εξοδος");
    }
}
