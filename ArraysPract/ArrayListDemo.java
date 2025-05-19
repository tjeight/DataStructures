package ArraysPract;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println(arrayList);

        scanner.close();
    }
}
