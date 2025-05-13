public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("level"));
        System.out.println(checkPalindrome("Tejass"));
    }

    static String checkPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }

        str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return "Not Palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";

    }

}
