package gr.aueb.cf.ch6;

import java.io.InvalidClassException;
import java.util.Scanner;


public class MoreThanTwoEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = userArray(in);
        boolean twoEvens = moreThanTwoEvens(arr);
        boolean twoOdds = moreThanTwoOdds(arr);

        // Έλεγχος και εμφάνιση αποτελεσμάτων
        if (twoEvens) {
            System.out.println("The array has more than two even numbers.");
        } else {
            System.out.println("The array does not have more than two even numbers.");
        }

        if (twoOdds) {
            System.out.println("The array has more than two odd numbers.");
        } else {
            System.out.println("The array does not have more than two odd numbers.");
        }



    }

    public static boolean moreThanTwoEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;

        for (int item : arr) {
            if (item % 2 ==0) {
                evens++;
            }
        }
        return evens > 2;
    }
    public static boolean moreThanTwoOdds(int[] arr) {
        if (arr == null) return false;
        int odds =0;

        for (int item : arr) {
            if (item % 2 !=0) {
                odds++;
            }
        }
        return odds > 2;
    }



    public static int[] userArray(Scanner in)  {
        System.out.println("Insert how many numbers the array will include?");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Put the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("Element %d: ", i + 1);
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
