package gr.aueb.cf.ch6;

public class ArrayMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,7,8,4,6,4,22,43,11,23,};
        int minPosition = getMinPosition(arr);
        int maxPosition = getMaxposition(arr);

        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];



        System.out.printf("The min position of arr = %d and the min value of arr = %d\n", minPosition, minValue);
        System.out.printf("The max position of arr = %d and the maxValue of arr = %d", maxPosition,maxValue);

    }
    public static int getMinPosition(int [] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
    public static int getMaxposition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
