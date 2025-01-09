package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e) {
            System.out.println("An error happened, try again...");
        }


    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive!");
            }
            balance +=  amount;
            System.out.println("Successfully deposited: " + amount); // log(den einai pros ton xristi)
        }catch (Exception e) {
            System.err.println("Error, " + e.getMessage()); // log
            throw e;
        }
    }

    public static void withDraw(double amount) throws Exception {
        try {
            if(amount <= 0) {
                throw new Exception("Your amount must be positive");
            }
            if (amount > balance) {
                throw new Exception("Amount must be less than the balance");
            }
            balance -= amount;
            System.out.println("Successfully withdraw: " + amount);
        }catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }

    }
}
