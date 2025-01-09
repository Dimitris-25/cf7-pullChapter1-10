package gr.aueb.cf.ch5;

public class SwapApp {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.printf("a = %d, b= %d\n", a, b);

        swap(a,b);
        System.out.printf("a = %d, b = %d", a, b);



    }
//    swaps a, b
//    a, the first in and b is the secd int
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

}
