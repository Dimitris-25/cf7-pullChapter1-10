package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("C:/tmp/file7.txt");

       try (Scanner in = new Scanner(file)) {
           char ch = (char) System.in.read();
           int num = in.nextInt();
       }catch (FileNotFoundException | InputMismatchException e) {
           System.err.println("Error file not found" + e.getMessage());
           throw e;
       }catch (IOException e) {
           System.err.println("IO Exception" + e.getMessage());
//           throw e;
       }catch (Exception e) {
           System.err.println("Generic Error" + e.getMessage());
           e.printStackTrace();
       }
    }
}
