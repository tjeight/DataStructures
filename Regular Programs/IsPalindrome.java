import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        System.out.println(isNumberPalindrome(num));

        scanner.close();
    }

    static boolean isNumberPalindrome(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative ");
        }

        int org = number;
        int rev = 0;
        while (number > 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number /= 10;

        }
        if (rev == org) {
            return true;
        }
        return false;

    }

}