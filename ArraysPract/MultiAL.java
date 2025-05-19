package ArraysPract;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arraylist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // initialization
        for (int i = 0; i < 3; i++) {
            arraylist.add(new ArrayList<>());
        }

        for (int i = 0; i < arraylist.size(); i++) {

            for (int j = 0; j < 3; j++) {
                arraylist.get(i).add(scanner.nextInt());
            }

        }
        System.out.println(arraylist);

        scanner.close();
    }
}
