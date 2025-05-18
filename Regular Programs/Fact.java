public class Fact {

    public static void main(String[] args) {

        System.out.println(getFactorial(5));
        System.out.println(getFactorial(0));
    }


    static int getFactorial(int n){

        if(n==1 || n == 0 ){
            return 1;
        }

        int fact =1;

        for(int i = 2 ; i <=n;i++ ){
            fact *=i;
        }
        return fact;


    }
    
}
