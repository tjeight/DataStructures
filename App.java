public class App{
    
    public static void main(String[] args) {
          
        System.out.println(checkEvenOdd(4));
        System.out.println(checkEvenOdd(7));

    }

     static String checkEvenOdd(int n){
        return n%2==0 ? "Even" : "Odd";
    }


}