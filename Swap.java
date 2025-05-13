public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before: a = " + a + ", b = " + b);
        swapNumbers(a, b);
    }

    static void swapNumbers(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After: a = " + a + ", b = " + b);
    }
}