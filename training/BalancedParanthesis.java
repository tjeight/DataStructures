import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string ");
        String str = scanner.next();
        for (char ch : str.toCharArray()) {
            stack.push(ch);

        }

        scanner.close();

    }
}