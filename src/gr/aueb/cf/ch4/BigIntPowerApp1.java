package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;
import java.text.NumberFormat;

public class BigIntPowerApp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two integers");
        base = BigInteger.valueOf(in.nextInt());
        power = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }

        // Μορφοποίηση του αποτελέσματος με κόμματα
        NumberFormat numberFormat = NumberFormat.getInstance();

        System.out.printf("%s^%s = %s", base.toString(), power.toString(), numberFormat.format(result));
    }
}
