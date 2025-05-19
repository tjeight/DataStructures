package ArraysPract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 2, 2 };
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add all elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check which elements in nums2 are also in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert resultSet to an array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
