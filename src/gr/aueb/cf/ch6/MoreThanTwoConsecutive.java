package gr.aueb.cf.ch6;

public class MoreThanTwoConsecutive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 9, 10};
        boolean hasTwoConsecutiveSequences = hasTwoConsecutive(arr);

        if (hasTwoConsecutiveSequences) {
            System.out.println("The array has at least two sets of three consecutive numbers.");
        } else {
            System.out.println("The array does not have at least two sets of three consecutive numbers.");
        }
    }

    public static boolean hasTwoConsecutive(int[] arr) {
        if (arr == null || arr.length < 3) return false; // Έλεγχος αν ο πίνακας είναι άκυρος

        int count = 0; // Αριθμός ακολουθιών τριών διαδοχικών αριθμών

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i + 1] == arr[i] + 1) && (arr[i + 2] == arr[i] + 2)) {
                count++;
                i += 2; // Προχωράμε στο επόμενο μη-επικαλυπτόμενο σετ
            }
        }

        return count >= 2;
    }
}

