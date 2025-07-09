package LinearSearch;

public class RichestWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int[] n : accounts) {
            for (int num : n) {
                sum += num;
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
