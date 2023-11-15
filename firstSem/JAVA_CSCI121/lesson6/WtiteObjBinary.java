package lesson6;

import java.util.*;
import java.io.*;

public class WtiteObjBinary implements Serializable {

    private static final String filename = "obj.bin";
    public static void main(String[] args) {
        try {
            
           ObjectOutputStream x = new ObjectOutputStream(new FileOutputStream(filename));

           Student s1 = new Student("MGMG",23,'B');
           Student s2 = new Student("KOKO",24,'A');
            x.writeObject(s1);
            x.writeObject(s2);

            x.close();
            


        } catch (IOException e) {
            // TODO: handle exception
        }
    }
    
}
