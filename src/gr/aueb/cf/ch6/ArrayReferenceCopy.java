package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayReferenceCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrRefCopy = arr;

        for (int i = 0; i < arrRefCopy.length; i++) {
            System.out.print(arrRefCopy[i] + " ");
        }
        System.out.println();

        arrRefCopy[4] = 100;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
