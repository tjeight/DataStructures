public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 2, 67, 33, 67, 99, 99, 44 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest number found.");
        } else {
            System.out.println("Second highest number: " + second);
        }

        System.err.println(Integer.MIN_VALUE);
    }
}
