package lesson8;

public class Rec {
    
    public static int fact(int n){

        if(n==0) return 1;
        else return n*fact(n-1);
    }

    public static void main(String[] args) {
        int ans = fact(12);
        System.out.println(ans);
    }
}
