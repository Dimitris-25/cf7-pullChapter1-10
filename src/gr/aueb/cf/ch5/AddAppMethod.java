package gr.aueb.cf.ch5;

public class AddAppMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);

        System.out.println("Sum of a and b is " + sum);

    }

    public static int add(int a, int b) {
//        δηλωση και αρχικοποιηση!
        int sum = 0;
//        entoles
        sum = a + b;
//        epistrofi apotelesmatos
        return sum;
    }


}
