package gr.aueb.cf.ch7;

public class LengthIsEmptyApp {
    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "";
        boolean isEmpty;

        System.out.printf("String: %s, Length: %s\n", s1, s1.length());


        isEmpty = s2.isEmpty();
        System.out.printf("s2 is empty: %s, s2 Length is: %d", isEmpty, s2.length());
    }
}
