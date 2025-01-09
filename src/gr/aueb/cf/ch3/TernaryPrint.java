package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TernaryPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();

        System.out.printf("The abs of %d is %d", num, (num > 0) ? num : -num);
    }
}
