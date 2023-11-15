package lesson6;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;

public class ReadBin {
    
    private static final String filename = "test.bin";

    public static void main(String[] args) {

        boolean go = true;
        int counter= 0;
        

        try {
            InputStream is = new FileInputStream(filename);
            while(go == true) {
                int a =  is.read();
                counter++;

                if(a == -1){
                    go = false;
                }else{
                
                    if(counter >6){
                        byte[] bytes = {(byte)a};
                        String s = new String(bytes,Charset.forName("UTF-8"));
                        System.out.println(s);
                    }else{
                        System.out.println(a);
                    }
                }



            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ends");
        }
    }
}
