package gr.aueb.cf.ch7;

public class ConcatApp {
    public static void main(String[] args) {
        String firstname = "Athanasios";
        String lastname = "Androutsos";
        String title = "Dr.";
        String fullname1, fullname2,fullname3,fullname4;

        // + operator is overloaded in java
        // when applied to strings is considered concat

        fullname1 = firstname + lastname;
        fullname2 = title + firstname + lastname;

        fullname3 = firstname.concat(lastname);
        fullname4 = title.concat(firstname).concat(lastname);

        System.out.printf("Firstname: %s, Lastname: %s \n", firstname,lastname);
        System.out.printf("Fullname: %s\n", fullname1);
        System.out.printf("Fullname: %s\n", fullname2);
        System.out.printf("Fullname: %s\n", fullname3);
        System.out.printf("Fullname: %s\n", fullname4);
    }
}
