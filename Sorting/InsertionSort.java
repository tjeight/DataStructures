package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] num = { 5, -3, 2, 1, 4 };
        insertionSort(num);
        System.out.println(Arrays.toString(num));

    }

    static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }

        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

}
