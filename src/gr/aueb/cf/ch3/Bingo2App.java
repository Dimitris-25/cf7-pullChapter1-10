package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Bingo2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        if (inputNum == key) {
            System.out.println("Bingo");
        }else {
            System.out.println("Try again");
        }
    }
}
