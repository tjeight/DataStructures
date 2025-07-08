import java.util.Scanner;

public class ReverseAlternate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();
        scanner.close();

        String word = "";
        String result = "";
        int wordCount = 0;

        for (int i = 0; i <= input.length(); i++) {
            char ch = (i < input.length()) ? input.charAt(i) : ' '; // handle last word

            if (ch != ' ') {
                word += ch;
            } else {
                if (wordCount % 2 == 1) {
                    result += reverseString(word);
                } else {
                    result += word;
                }
                result += " ";
                word = "";
                wordCount++;
            }
        }

        System.out.println("Modified sentence: " + result.trim());
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}
