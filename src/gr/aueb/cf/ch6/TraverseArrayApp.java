package gr.aueb.cf.ch6;

public class TraverseArrayApp {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2}, {3,4,5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // deyteros tropos

        for (int[] row : arr) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
