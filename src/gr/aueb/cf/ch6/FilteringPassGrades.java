package gr.aueb.cf.ch6;

public class FilteringPassGrades {
    public static void main(String[] args) {
        // Δεδομένα
        int[] grades = new int[] {4, 9, 9, 8, 7, 2, 1, 4, 10};
        int PASS = 5;

        // Κλήση της μεθόδου και εκτύπωση αποτελεσμάτων
        int[] passedGrades = getPassGrades(grades, PASS);

        System.out.println("Grades that passed:");
        for (int grade : passedGrades) {
            System.out.print(grade + " ");
        }
    }

    public static int[] getPassGrades(int[] grades, int limit) {
        if (grades == null) return null; // Αν ο πίνακας είναι null, επιστρέφει null

        // Βρες πόσοι βαθμοί περνούν το όριο
        int count = 0;
        for (int grade : grades) {
            if (grade >= limit) {
                count++;
            }
        }

        // Δημιουργία πίνακα για τους βαθμούς που περνούν
        int[] passedOut = new int[count];
        int pivot = 0;

        // Γέμισμα του πίνακα με τους βαθμούς που περνούν
        for (int grade : grades) {
            if (grade >= limit) {
                passedOut[pivot++] = grade;
            }
        }

        return passedOut; // Επιστρέφει τον πίνακα με τους επιτυχόντες
    }
}
