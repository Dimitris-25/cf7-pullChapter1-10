package gr.aueb.cf.ch5;

public class OverLoadingApp {
    public static void main(String[] args) {
        int a = 5, b = 6;

        int sum1, sum3;
        long sum2, sum4;

        sum1 = add(1, 2);
        sum2 = add(1L, 2L);
        sum3 = add(1,2,12);
        sum4 = add(1,2,12L);
        System.out.printf(sum1 + " " + sum2 + " " + sum3 + " " + sum4);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(int a, int b, long c) {
        return a + b + c;
    }
}
