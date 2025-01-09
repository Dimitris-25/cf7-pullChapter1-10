package gr.aueb.cf.ch4;

public class ForStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println('*');
        }
//        to paizw sto ena me i = 0 kai sto allo me i = 1, xekianei i metrhsh apo 0 opote ama theleis 10 asteria
//        pas i apo 0-9 i apo 1-10
        for (int i = 0; i <= 9; i++) {
            System.out.print('*');
        }
        for (int i = 1; i <= 10; i++) {
//            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
//        10 asteria asceding
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        10 asteria desceding
        for (int i = 1; i <=10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
