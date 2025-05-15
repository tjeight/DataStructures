import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // find no of digits
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp /= 10;
            nod++;
        }

        // for the egde cases
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        // get the multiplier and divisor
        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, nod - k);

        // get the quotient
        int quotient = n / divisor;
        int remainder = n % divisor;

        int rotatedNumber = (remainder * multiplier) + quotient;

        System.out.println(rotatedNumber);
        scanner.close();
    }

}
