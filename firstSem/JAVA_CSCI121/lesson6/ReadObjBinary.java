package lesson6;

import java.util.*;
import java.io.*;

public class ReadObjBinary {
    private static final String filename = "obj.bin";

    public static void main(String[] args) {

        ArrayList<Student> s = new ArrayList<Student>();

        try {
            ObjectInputStream x = new ObjectInputStream(new FileInputStream(filename));
            boolean EndofFile = true;
            while (EndofFile == true) {

                try {
                    Student s1 = (Student) x.readObject();
                    s.add(s1);

                } catch (EOFException e) {
                    EndofFile = false;
                    // TODO: handle exception
                }

               
             
        
            }

            x.close();
        } catch ( ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
 
        } catch (FileNotFoundException ex){

            System.out.println(ex.getMessage());
        } catch(IOException e){
            System.out.println(e.getMessage());

        }


        for(Student z : s) {
            System.out.println(z);
        }

   
    }
    
}
