package gr.aueb.cf.ch7;

import java.util.ArrayList;

public class dokimastiko {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing: από int σε Integer
        numbers.add(10);
        numbers.add(20);

        // Unboxing: από Integer σε int
        int sum = numbers.get(0) + numbers.get(1);

        System.out.println("Sum = " + sum);
    }
}



