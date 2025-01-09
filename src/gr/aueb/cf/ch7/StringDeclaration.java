package gr.aueb.cf.ch7;

public class StringDeclaration {
    public static void main(String[] args) {
        String alice = "Alice";
        String bob = new String("Bob");

        System.out.println(alice + " and " + bob);
        System.out.println("Total length = " + (alice.length() + bob.length()));
    }
}
