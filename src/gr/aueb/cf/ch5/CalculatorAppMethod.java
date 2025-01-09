package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CalculatorAppMethod {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choise = 0;
        int num1 = 0, num2 = 0, result = 0;

        do {
            printMenu();
            choise = getUserChoise();

            if (choise < 1 || choise > 6) {
                System.out.println("Λαθος επιλογη");
                continue;
            }
            System.out.println("Please insert two ints");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(choise,num1,num2);
            System.out.println("Result = " + result);

        } while (choise != 6);

    }

    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Προσθεση");
        System.out.println("2. Αφαιρεση");
        System.out.println("3. Πολλαπλασιασμος");
        System.out.println("4. Διαιρεση");
        System.out.println("5. Υπολοιπο Διαιρεσης");
        System.out.println("6. Εξοδος");
    }

    public static int getUserChoise() {
        return in.nextInt();
    }

    public static int getOneNumber() {
        return in.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number 0");
            return 0;
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number");
            return 0;
        }
        return a % b;
    }

    public static int getResult(int choise, int num1, int num2) {
        int result = 0;

        switch (choise) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
                System.out.println("Επιλεξατε εξοδο");
                break;
            default:
                System.out.println("Λάθος επιλογή!");
                break;
        }

        return result;



    }

}







