package Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        // we use it to compound the condition
        if (a == b && b == a) {
            System.out.println(true);
        }
        if (a == b || b >= a) {
            System.out.println(true);
        }

        if (!(a == b)) {
            System.out.println(true);
        }

    }

}
