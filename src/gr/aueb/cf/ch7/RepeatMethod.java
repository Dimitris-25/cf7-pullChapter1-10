package gr.aueb.cf.ch7;

public class RepeatMethod {
    public static void main(String[] args) {
        // 20 horizontal stars
        System.out.printf("*".repeat(20));
        System.out.println();

        // 10 x 10 stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*".repeat(10));
            //System.out.println("*"); edo tha ektypwsei ena ti fora opote to .repeat ousiastika antikathista ti deyteri for
        }
    }
}
