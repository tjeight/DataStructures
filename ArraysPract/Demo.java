package ArraysPract;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the matrix elements : ");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        // for (int row = 0; row < matrix.length; row++) {
        // for (int col = 0; col < matrix[row].length; col++) {
        // System.out.print(matrix[row][col] + " ");
        // }
        // System.out.println();

        // }

        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
        scanner.close();
    }
}
