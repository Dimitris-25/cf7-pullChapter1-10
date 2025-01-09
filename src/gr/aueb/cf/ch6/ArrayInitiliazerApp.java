package gr.aueb.cf.ch6;

public class ArrayInitiliazerApp {
    public static void main(String[] args) {
        int [] ages;

        ages = new int[] {1,2,3,4};

        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]);
        }
    }
}
