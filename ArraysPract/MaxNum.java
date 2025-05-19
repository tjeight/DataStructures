package ArraysPract;

public class MaxNum {

    public static void main(String[] args) {

        int[] num = { 1, 6, 8, 5, 45, 96, 32 };

        System.out.println(max(num, 1, 5));

    }

    static int max(int[] num, int start, int end) {

        if (end < start) {
            return -1;

        }

        if (num.length == 0) {
            return -1;
        }

        int maximum = num[start];
        for (int i = start; i <= end; i++) {
            if (num[i] > maximum) {
                maximum = num[i];
            }
        }
        return maximum;

    }

}
