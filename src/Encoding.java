import java.util.* ;
import java.io.*;
public class Encoding {
    public static String encode(String message) {
        // Write your code here.
        int counter = 0;
        char d = message.charAt (0);
        char c;
        String stEncoded= "";
        for (int i = 0; i < message.length(); i++){
            // System.out.println (message.charAt (i));
            c = message.charAt (i);


            if(d==c){
                counter++;
            }else{
                stEncoded = stEncoded + d + counter;
                d=c;
                counter = 1;
            }
        }
        //laast character entry was missing in the for loop
        stEncoded = stEncoded + d +counter;
        //System.out.println(stEncoded);
        return stEncoded;
    }

    public static void main(String[] args) {
        String st = encode("ddaaahhq");
        System.out.println(st);
    }

}