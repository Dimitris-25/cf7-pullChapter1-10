package gr.aueb.cf.ch5;

public class DeclarationApp {
    public static void main(String[] args) {
        float f = 31.4F;
        float age = 23F;

        double d = 9.17;
        double price = 17D;

        final float LIGHT_SPEED = 3.0E5F;
        final double PI = 3.1415;

        System.out.printf("final float %s, final double %s",LIGHT_SPEED, PI);
    }
}
