import java.util.Scanner;

public class InverseOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to inverse :  ");
        int num = scanner.nextInt();

        int org_pos = 1;
        int inverse_number = 0;

        while (num > 0) {
            int org_digit = num % 10;
            int inverted_digit = org_pos;
            int inverted_position = org_digit;

            inverse_number = inverse_number + inverted_digit * (int) Math.pow(10, inverted_position - 1);
            num /= 10;
            org_pos++;

        }
        System.out.println(inverse_number);

        scanner.close();
    }
}