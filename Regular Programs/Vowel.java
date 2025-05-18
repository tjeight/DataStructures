public class Vowel {
    public static void main(String[] args) {

        Vowel vowel = new Vowel();

        System.out.println(vowel.checkVowelConsonant('a'));
        System.out.println(vowel.checkVowelConsonant('b'));
        
    }

    String checkVowelConsonant(char ch){

        if(Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' ||Character.toLowerCase(ch) == 'u' ){
            return "Vowel";
        }else{
            return "Consonant";
        }


    }
    
}
