package Operators;

public class BitwiseOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a >> 1);
        System.out.println(a << 1);
        System.out.println(~a);

    }

}
