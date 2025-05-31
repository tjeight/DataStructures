package LinearSearch;

public class SearchStrings {

    public static void main(String[] args) {

        String name = "Tejas";
        char target = 'e';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        System.out.println(search2(name, 'l'));

    }

    static boolean search(String name, char target) {
        // in arrays the lenght is the property or the varibale
        // but in string the lenght is a method
        if (name.length() == 0 || name == null) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            // here in java string is not accessible by name[i]
            // the character in each string only accessible
            // using the charAt method
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;

    }

    static boolean search2(String name, char target) {
        // in arrays the lenght is the property or the varibale
        // but in string the lenght is a method
        if (name.length() == 0 || name == null) {
            return false;
        }

        // the string is not the character array so it
        // needs to be converted into character array
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;

    }

}
