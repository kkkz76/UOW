package lesson6;

import java.util.*;
import java.io.*;

public class WriteText {
    private static final String filename = "text.txt";
    public static void main(String[] args) {
        try {
            PrintWriter w = new PrintWriter(filename);
            w.write("apple");
            w.write("banana");

            w.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
