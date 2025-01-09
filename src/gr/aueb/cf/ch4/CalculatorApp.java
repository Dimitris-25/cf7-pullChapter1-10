package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int choise = 0;
        int result = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert an integer an operator and a second integer");
        num1 = in.nextInt();
        operator = in.next().charAt(0);
        num2 = in.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                }

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    break;
                }

            default:
                System.out.println("Error in operator");
                isError = true;
                break;


        }
        if (!isError) {
            System.out.printf("%d %c %d = %d", num1, operator, num2, result);
        }
    }
}
