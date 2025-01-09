package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchDoWhileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Please select one of the following choises!");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");
            System.out.println("4. exit");
            System.out.println("Please insert your choise");

            choise = in.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Start one player game");
                    break;
                case 2:
                    System.out.println("Start two players game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Error in choise");
                    break;
            }

        }while (choise != 4) ;

        System.out.println("Goodbye");
    }
}
