package ArraysPract;

import java.util.Arrays;

public class SwapNum {

    public static void main(String[] args) {

        int num[] = { 1, 2, 3, 4, 6 };
        System.out.println("Original array : " + Arrays.toString(num));
        swap(num, 1, 2);
        System.out.println("After swap array : " + Arrays.toString(num));

    }

    static void swap(int[] num, int index1, int index2) {

        num[index1] = num[index1] + num[index2];
        num[index2] = num[index1] - num[index2];
        num[index1] = num[index1] - num[index2];

    }

}
