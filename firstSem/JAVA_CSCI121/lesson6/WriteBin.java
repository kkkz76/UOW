package lesson6;

import java.util.*;
import java.io.*;

public class WriteBin {
    private static final String filename = "test.bin";
    
    public static void main(String[] args) {
    
        int []i = {1, 2, 3, 4, 5, 6};
        char []j = {'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            OutputStream os = new FileOutputStream(filename);

            for(int x:i){
                os.write(x);
            }

            for(char a:j){
                os.write(a);
            }

            os.close();

            

        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } 

           
    }
}
