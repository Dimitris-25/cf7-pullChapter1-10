package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoApp3 {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int num = 0;
                final int SECRET = 11;

                while (true) {
                    System.out.println("Please provide a secret num");
                    num = in.nextInt();

                    if (num != SECRET) {
                        System.out.println("Not very lucky, please try again");
                        continue;
                    }else {
                        System.out.println("Great!Bingo!");
                    }break;
                }


        }


}
