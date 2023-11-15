package lesson9;

public class Test1 {
    
public static void main(String[] args) {
    Speak s = () -> {
        return "Hello, world";
    };

    System.out.println(s.getSound());
}

}
