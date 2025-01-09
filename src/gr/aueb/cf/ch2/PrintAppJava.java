package gr.aueb.cf.ch2;

public class PrintAppJava {
    public static void main(String[] args) {
        int day = 7;
        int month = 8;
        int year = 2024;

        System.out.println("Η ημερομηνια ειναι: " + day + "/" + month + "/" + year);
        System.out.printf("H ημερομηνια ειναι : %02d/%02d/%d", day, month, year);
    }
}
