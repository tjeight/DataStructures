import java.util.Scanner;

public class AgeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String email;
        System.out.println("Enter your age : ");
        age = scanner.nextInt();
        System.out.println("Enter your email : ");
        email = scanner.next();
        System.out.println(checkAge(age) + "\n" + email);
        scanner.close();
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "You are eligible for Voting";
        } else {
            return "You are not eligible for Voting";
        }
    }

}