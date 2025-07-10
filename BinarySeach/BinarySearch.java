package BinarySeach;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = { 1, 19, 26, 35, 41, 52, 69, 85 };

        int target = 69;
        int ans = binarySearch(numbers, target);
        System.out.println("The index is at " + ans);

    }

    public static int binarySearch(int[] num, int target) {

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

}
