public class CheckFreq {

    public static void main(String[] args) {


        CheckFreq checkFreq = new CheckFreq();
        System.out.println(checkFreq.getFreq("Hello",   'l'));
        
    }   


    int getFreq(String str,char ch){
        int count = 0;
         for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
         } 

         return count;

    }
    
}
