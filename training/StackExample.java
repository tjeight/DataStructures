import java.util.*;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Typed ' Hello ");
        stack.push("Bolded text");
        stack.push("Deleted a line");
        System.out.println("Undo Action : " + stack.pop());
        System.out.println("Last Action : " + stack.peek());

    }
}