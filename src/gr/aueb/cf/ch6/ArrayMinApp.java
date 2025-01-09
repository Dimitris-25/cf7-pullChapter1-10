package gr.aueb.cf.ch6;

import javax.swing.*;

/**
 * find the min value and the min position of an unsorted array
 */

public class ArrayMinApp {
    public static void main(String[] args) {
        int[] arr = {7,6,2,9,10,4,6,6,7};
        // estv oti to elaxisto stoixeio einai sti thesi 0

        int minPosition = 0;
        int minValue = arr[minPosition];

        // xekiname na elegxoume apo ti thesi 1. Kathe fora pou
        // vriskoume mikrotero stoixeio apo to minVaue,
        //ananeonoume minPosition kai minValue

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Min value: %d, Min position: %d", minValue, minPosition + 1);

    }



}
