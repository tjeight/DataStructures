import java.util.Arrays;

public class EmptyPacket {
    public static void main(String[] args) {
        int[] num = { 5, 0, 4, 0, 3, 3, 0, 1 };

        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            if (num[left] == 0 && num[right] != 0) {
                // Swap using temp variable
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            } else {
                if (num[left] != 0)
                    left++;
                if (num[right] == 0)
                    right--;
            }
        }

        System.out.println(Arrays.toString(num));
    }
}
