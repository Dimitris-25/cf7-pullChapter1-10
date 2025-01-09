package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class IOIntDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/tmp/tmp2/integers.txt"));
        PrintStream ps = new PrintStream("C:/tmp/tmp2/integersOut.txt");
        String token;
        int num = 0,  sum = 0, count = 0;
        double average = 0.0;

        while (sc.hasNext()) {
            token = sc.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum+=num;  // sum = sum + num
            }
        }
        average = (double) sum / count;
        ps.printf("Το αθροισμα ειναι %d%n", sum);
        ps.printf(Locale.ENGLISH, "O μεσος ορος ειναι %.2f", average);

        System.out.println("To athroisma einai: " + sum);

        sc.close();
        ps.close();


    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException ne) {
            return false;
        }
    }
}
