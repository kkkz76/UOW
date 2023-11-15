package lesson6;

import java.util.*;
import java.io.*;

public class ReadText {
    private static final String filename = "text.txt";
    public static void main(String[] args) {
        try {
            File file = new File(filename);
            Scanner s = new Scanner(file);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
