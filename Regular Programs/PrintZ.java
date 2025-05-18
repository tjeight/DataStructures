import java.util.Scanner;

public class PrintZ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        // int count = 0;
        int org_pos = 1;
        int inv = 0;
        while (num > 0) {
            int org_digit = num % 10;
            int inverted_position = org_digit;
            int inverted_digit = org_pos;

            inv = inv + inverted_digit * (int) Math.pow(10, inverted_position - 1);
            num /= 10;
            org_pos++;

        }
        System.out.println(inv);

        scanner.close();
    }
}