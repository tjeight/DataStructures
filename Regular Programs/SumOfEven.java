public class SumOfEven {

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sumEven(number));
    }

    static int sumEven(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sum += num[i];
            }
        }
        return sum;

    }
}