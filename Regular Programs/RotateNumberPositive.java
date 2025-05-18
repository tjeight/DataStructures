import java.util.Scanner;

public class RotateNumberPositive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(rotateNumber(number, k));
        scanner.close();
    }

    static int rotateNumber(int n, int k) {

        int remainder = n % (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, k + 1);
        int quotient = n / (int) Math.pow(10, k);

        return (remainder * multiplier) + quotient;

    }

}
