package gr.aueb.cf.ch2;

public class TypeCast {
    public static void main(String[] args) {
        int num1 = 10; // int literals -> 32-bit
        long num2 = 20L;

        num1 = (int) num2;
        //num2 = (long) num1;
        System.out.println(num1);
        System.out.println(num2);
    }
}
