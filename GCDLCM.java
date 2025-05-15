import java.util.Scanner;

public class GCDLCM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int number2 = scanner.nextInt();

        System.out.println("GCD is " + getGCDLCM(number1, number2));
        System.out.println("LCM is " + (number1 * number2) / getGCDLCM(number1, number2));
        scanner.close();
    }

    static int getGCDLCM(int number1, int number2) {

        while (number1 % number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        return number2;

    }

}
