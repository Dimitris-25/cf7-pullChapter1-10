package gr.aueb.cf.ch6;

public class ArrayForEachApp {
    public static void main(String[] args) {
        int[] ages = {19,29,22,40};

        for (int age: ages) {
            System.out.print(age + " ");
        }
        System.out.println();
        for (int i : ages) {
            System.out.print(i + " ");
        }
    }
}
