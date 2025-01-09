package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoWhileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("Please guess the key number!");
            inputNum = in.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo! Greaqt guess");
            } else {
                System.out.println("Try again");
            }
        }while (!bingo);
    }
}
