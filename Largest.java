public class Largest {

    public static void main(String[] args) {
        
        Largest largest =  new Largest();
        int[] num = {3,5,2,9,1};

        System.out.println(largest.largetNum(num));

    }

    int largetNum(int[] num){

        int max = num[0];

        for(int number : num){
            if (max < number) {
                max = number;
            }
        }

        return max ;



    }
    
}
