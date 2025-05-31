package ArraysPract;

public class RemoveDuplicats {
    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Example 2
        int k = removeDuplicates(nums);
        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0; // Handle empty array

        int k = 1; // Initialize k to 1 (first element is always unique)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // If current element is different from the last unique element
                nums[k] = nums[i]; // Place it at position k
                k++; // Increment k
            }
        }
        return k; // Return the number of unique elements
    }
}