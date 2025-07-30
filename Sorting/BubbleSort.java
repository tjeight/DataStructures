package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = { 3, 2, 1, 5, 4 };
        bubble(num);
        System.out.println(Arrays.toString(num));

    }

    static void bubble(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
