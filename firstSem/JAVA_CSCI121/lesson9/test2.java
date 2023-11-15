package lesson9;

import java.util.*;
import java.util.stream.*;
public class test2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Apple");
        a.add("Banana");
        a.add("Cherry");
        
        // a.forEach((x)->{
        //     if(x.length() == 6){
        //         System.out.println(x);
        //     }
        // });

        Stream<String> filered_data = a.stream().filter(x -> x.startsWith("A"));

        filered_data.forEach(c -> System.out.println(c));
}
}
