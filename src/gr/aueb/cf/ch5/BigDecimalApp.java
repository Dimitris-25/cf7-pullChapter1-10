package gr.aueb.cf.ch5;
import java.math.BigDecimal;

public class BigDecimalApp {
    public static void main(String[] args) {
        BigDecimal actual = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");

        for (int i = 1; i <= 10; i++) {
            actual = actual.add(BigDecimal.valueOf(0));
        }

        System.out.println(actual);
        System.out.println(expected);

        if (actual.equals(expected)) System.out.println("Equal");
        else System.out.println("Not Equal");

    }
}
