package lesson3;

public class testone extends test {
    private String age;
    public testone(String name,String grade, String age){
        super(name, grade);
        this.age = age;

    }
    public String toString(){
        return "name: " + name+" grade: " + grade+" age: " + age;
    }
       
    public static void main(String[] args) {
        testone a = new testone("MgMg","B","20");
        System.out.println(a);
        
    }
}
