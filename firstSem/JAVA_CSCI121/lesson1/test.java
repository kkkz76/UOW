package lesson1;

import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner kb  = new Scanner(System.in);
        System.out.print("Enter Number:");
        int i = kb.nextInt();
        System.out.println("Number:"+i);
        String name = kb.nextLine();
        System.out.print("Enter Name:");
         name = kb.nextLine();
        System.out.println("Name:"+name);
        
    }
}
