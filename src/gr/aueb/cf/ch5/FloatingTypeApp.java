package gr.aueb.cf.ch5;

public class FloatingTypeApp {
    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %d, min_value: %e, max_value: %e\n", Float.TYPE,Float.SIZE,Float.MIN_VALUE,Float.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d, min_value: %e, max_value: %e", Double.TYPE,Double.SIZE,Double.MIN_VALUE,Double.MAX_VALUE);
    }
}
