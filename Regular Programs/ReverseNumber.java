public class ReverseNumber {

    public static void main(String[] args) {
        
         System.out.println(reverseNumberMethod(100));

    }
    
    static int reverseNumberMethod(int n){

        int rev = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        return rev;

    }
}
