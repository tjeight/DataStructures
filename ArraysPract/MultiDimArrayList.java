package ArraysPract;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            numbers.add(new ArrayList<>());

        }

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {
                numbers.get(row).add(col);
            }

        }

        for (ArrayList<Integer> list : numbers) {
            System.out.println(list);
        }

        scanner.close();

    }

}
