package gr.aueb.cf.ch2;

public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Int.size: %d, Min: %,d, Max: %,d\n", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Byte.size: %d bits, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short.size: %d bits, Min: %d, Max: %d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Long.size: %d bits, Min: %,d, Max: %,d\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
