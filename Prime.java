// import java.math.*;

public class Prime {

    public static void main(String[] args) {

        // Prime prime = new Prime();

        System.out.println(checkPrime(7));
        System.out.println(checkPrime(4));

    }

    static String checkPrime(int n){

        if(n <=1){
            return "Not Prime";
        }

        for(int i = 2; i <=(int)Math.sqrt(n);i++){
            if(n%i ==0){
            
                return "Not Prime";
            }
        }

        return "Prime";

    }
}