package gr.aueb.cf.ch7;

public class ContainsStringApp {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

        if (s.contains("Economics")) System.out.println("Bingo");

        index = s.indexOf("Uni");
        System.out.println("Start index of Uni: " + index);

        index = s.indexOf("t");
        System.out.println("Start index of 't':  " + index);

        index = s.lastIndexOf("t");
        System.out.println("Start index of 't':  " + index);

        index = s.indexOf("s");
        System.out.println("Start index of 's':  " + index);

        index = s.indexOf("s",7);
        System.out.println("Start index of 's':  " + index);

        if (s.startsWith("Athens")) System.out.println("Bongo");
        if (s.startsWith("Uni", 7)) System.out.println("Bingo");
    }
}
