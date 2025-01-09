package gr.aueb.cf.ch6;

public class ArrayMinApp2 {
    public static void main(String[] args) {
        int[] arr = {4,6,3,8,9,8,2,11};
        // οριζουμε ως μινΒαλιου το μαξ-ιντ οποτε καποια στιγμη θα ειναι
        //μικροτερο απο τον μαξ-ιντ εκτος αν ολα τα στοιχεια του πινακα ειναι και μαξ-ιντ,
        // οποτε το ποζισιον παραμενει 0 που ειναι και το σωστο!
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min Value: %d, Min Position: %d", minValue, minPosition +1);
    }
}
