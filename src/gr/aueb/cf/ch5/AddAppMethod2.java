package gr.aueb.cf.ch5;

public class AddAppMethod2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int sum = 0;

        sum = add(a,b);

        System.out.println("Sum of a,b = " + sum);

    }

    /**
     * add two integers
     * @param a the first int
     * @param b the second int
     * @return a+b the result
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
