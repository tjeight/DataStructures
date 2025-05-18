import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2; i * i < number; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.print(i + " ");
            }
        }

        if (number != 1) {
            System.out.print(number);
        }

        scanner.close();
    }

}
