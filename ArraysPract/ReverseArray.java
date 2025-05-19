package ArraysPract;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = { 2, 3, 45, 7, 89, 6 };
        System.out.println("Original array : " + Arrays.toString(numbers));
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            swap(numbers, start, end);
            start++;
            end--;
        }

        System.out.println(" Reverse array : " + Arrays.toString(numbers));

    }

    static void swap(int[] num, int start, int end) {
        // by using the two pointer approach

        num[start] = num[start] + num[end];
        num[end] = num[start] - num[end];
        num[start] = num[start] - num[end];

    }

}
