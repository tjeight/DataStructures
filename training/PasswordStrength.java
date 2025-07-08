import java.util.Scanner;

public class PasswordStrength {

    public static boolean isStrongPassword(String password) {
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                hasUpper = true;
            else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password :");
        String pwd = scanner.nextLine();

        if (isStrongPassword(pwd)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak Password");
        }

        scanner.close();

    }

}