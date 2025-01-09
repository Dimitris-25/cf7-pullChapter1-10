package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Big integer class item
 */

public class BigIntApp {
    public static void main(String[] args) {
        // Devlarations and initalizations
        BigInteger bigNum1 = new BigInteger("12345678998765432199990");
        BigInteger bigNum2 = new BigInteger("2341237896555555588");
        BigInteger result;

        result = bigNum1.add(bigNum2);

        System.out.printf("%d", result);

    }
}
