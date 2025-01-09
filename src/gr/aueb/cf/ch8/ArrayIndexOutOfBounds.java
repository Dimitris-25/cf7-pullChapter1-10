package gr.aueb.cf.ch8;

import java.util.Arrays;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
