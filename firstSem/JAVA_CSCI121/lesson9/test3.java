package lesson9;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class test3 {
   
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        // int[] numbers = {1,2,3,4,5,6,7};

        System.out.print("Original numbers: ");
        
        IntStream.of(numbers).forEach(a -> System.out.print(a+" "));

        long count = IntStream.of(numbers).count();
        int a = IntStream.of(numbers).min().getAsInt();
        int b = IntStream.of(numbers).max().getAsInt();
        int sum = IntStream.of(numbers).sum();
        double avg = IntStream.of(numbers).average().getAsDouble();


        System.out.println(count);
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        System.out.println(avg);
    }
}
