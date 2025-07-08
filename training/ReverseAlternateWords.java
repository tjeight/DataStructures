public class ReverseAlternateWords {

    public static String reverseAlternate(String sentence) {
        String[] words = sentence.split("");
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join("", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseAlternate("This is a TCS specific problem "));
    }
}