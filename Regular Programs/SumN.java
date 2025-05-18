public class SumN {
    public static void main(String[] args) {
     
        // SumN sumN =  new SumN();
         System.out.println(sumOfNNumbers(-3));
        
    }

    static int sumOfNNumbers(int n){

        if(n < 0 ){
            throw new IllegalArgumentException("Number cannot be negative");
        }


        return  n * (n+1)/2;
        
    
    }

}
