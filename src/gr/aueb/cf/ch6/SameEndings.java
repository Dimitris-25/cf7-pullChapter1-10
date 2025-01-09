package gr.aueb.cf.ch6;

import java.util.Scanner;

public class SameEndings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the elements of the array (space-separated):");
        String input = in.nextLine();

        String[] tokens = input.split(" ");
        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        // Εμφανίζει τον πίνακα
        System.out.println("The array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        boolean sameEndings  = moreThanTwoSameEndings(arr);
        System.out.printf("The sameEndings numbers are: ", sameEndings);



    }

    public static boolean moreThanTwoSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEndings = false;

        for (int item: arr) {
            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item >= 3) {
                hasSameEndings = true;
                break;

            }
        }
        return hasSameEndings;
    }
}
