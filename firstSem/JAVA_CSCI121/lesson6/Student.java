package lesson6;
import java.io.*;


public class Student implements Serializable {

    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
       return this.name;
    }

    public int getAge() {
        return this.age;
     }

     public char getGrade() {
        return this.grade;
     }

     public String toString() {
        return name+" is "+age+" years old and he got grade "+grade;
     }
    
}
