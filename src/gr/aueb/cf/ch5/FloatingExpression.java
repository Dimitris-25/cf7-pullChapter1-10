package gr.aueb.cf.ch5;

import java.util.Arrays;

/**
 * Παραστασεις Φλοατινγκ ποιντ
 */

public class FloatingExpression {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum1 = 12.5D;
        double doubleNum2 = 2D;

        float floatResult = 0.0F;
        double doubleResult = 0.0;

//        Αν υπαρχει ενα float οι μικροτερου μεγεθους τυποι
//        μετατρεπονται σε float

        floatResult = floatNum + intNum;

//        Αν υπαρχει εστω και ενας double,
//        το intNum kai to floatNum μετατρεπονται σε double
        doubleResult = doubleNum1 + floatNum + intNum;

        System.out.printf("floatresult = %f\n", floatResult);
        System.out.printf("doubleresult = %f",doubleResult);

    }
}
