public class App {

    public static void main(String[] args) {
        int[] number = { 2, 7, 11, 15 };
        int[] result = twoSum(number, 9);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }
    }

    static String checkEvenOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Create and return the array directly
                }
            }
        }
        return null; // Return null if no pair is found
    }
}
