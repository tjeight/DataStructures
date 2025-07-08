public class VowelsConsonants {

    public static void main(String[] args) {
        int countVowel = 0;
        int countConsonent = 0;

        String str = "aaaaappppp ppppp";
        String lower = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (lower.charAt(i) == 'i' || lower.charAt(i) == 'o' || lower.charAt(i) == 'e' || lower.charAt(i) == 'a'
                    || lower.charAt(i) == 'u') {
                countVowel++;
            } else {
                countConsonent++;
            }

        }

        System.out.println("Vowel: " + countVowel);
        System.out.println("Consonent: " + countConsonent);
    }
}