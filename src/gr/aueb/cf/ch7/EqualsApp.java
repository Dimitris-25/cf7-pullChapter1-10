package gr.aueb.cf.ch7;

public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = "London";
        String s4 = "ATHENS";

        boolean isEqual;
        boolean isEqual1;
        boolean isEqual2;

        isEqual1 = s1.equals(s2);
        isEqual2 = s1.equals(s3);
        isEqual = s1.equalsIgnoreCase(s4);

        System.out.println(isEqual);
        System.out.println(isEqual1);
        System.out.println(isEqual2);

    }
}
