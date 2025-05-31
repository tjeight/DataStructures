package LinearSearch;

public class BasicLinearSearch {
    public static void main(String[] args) {

        int[] num = { 10, 20, 30, 56, 95, 12 };

        System.out.println(linearSearch(num, 30));
        System.out.println(linearSearch2(num, 30));
        System.out.println(linearSearch3(num, 65));

    }

    // This method returns the index of the element if found
    // or it returns -1
    static int linearSearch(int[] num, int target) {
        if (num.length == 0) {
            return -1;
        }

        for (int index = 0; index < num.length; index++) {
            if (num[index] == target) {
                return index;
            }
        }

        return -1;

    }

    // this method return the element if found
    static int linearSearch2(int[] num, int target) {
        if (num.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < num.length; index++) {
            if (num[index] == target) {
                return num[index];
            }
        }

        return Integer.MAX_VALUE;

    }

    // this method returns true if found
    // and false if not found
    static boolean linearSearch3(int[] num, int target) {
        if (num.length == 0) {
            return false;
        }

        for (int index = 0; index < num.length; index++) {
            if (num[index] == target) {
                return true;
            }
        }

        return false;

    }

}
