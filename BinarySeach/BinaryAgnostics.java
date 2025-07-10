package BinarySeach;

/**
 * This Programs first checks whether the array iss ascending and desending
 */

public class BinaryAgnostics {

    public static void main(String[] args) {
        int[] num = { -56, -45, 1, 19, 23, 36, 96 };
        int target = 23;

        System.out.println(binarySearch(num, target));

        // or descnedingly sorted

    }

    public static int binarySearch(int[] num, int target) {

        int start = 0;
        int end = num.length - 1;

        // check first and last element to check whether the array is ascendingly sorted
        boolean isAsc = num[start] < num[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (num[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < num[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < num[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;

    }

}
