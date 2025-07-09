package LinearSearch;

// question is to find the number of numbers that contains even number of digits

public class OptimizedLeetCodEven {

    public static void main(String[] args) {
        int[] num = { 18, 247, 9, 176, 98 };
        int number = findNumbers(num);
        System.out.println(number);

    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums) {
            if (checkEven(number)) {
                count++;
            }
        }

        return count;

    }

    public static boolean checkEven(int num) {

        return countDigits(num) % 2 == 0;
    }

    public static int countDigits(int num) {

        return (int) (Math.log10(num)) + 1;
    }

}
