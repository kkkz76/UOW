package lesson6;

import java.util.*;
import java.io.*;

public class ReadCsv {
    private static final String filename = "test.csv";

    public static void main(String[] args) {

        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            String header = sc.nextLine();

            while(sc.hasNextLine()) {

                String a = sc.nextLine().trim();
                if(a.equals("")){
                    continue;
                }
                String [] data = a.split(",");
                String name = data[0].trim();
                int age =Integer.parseInt(data[1].trim());
                char grade = data[2].trim().charAt(0);
                System.out.println(name+" is "+age +" years old and his grade is "+grade);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        }
        
        
    }

}
