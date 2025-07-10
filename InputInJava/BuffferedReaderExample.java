
package InputInJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffferedReaderExample {

    public static void main(String[] args) {

        String namr = "";
        int chararcters = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.reset();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Enter your name: ");
        try {
            chararcters = bufferedReader.read();

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(chararcters);

    }
}