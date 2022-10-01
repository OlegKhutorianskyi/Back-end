import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sum(3,5,3,d,e);

    }


    public static void sum(int a, int b, int c, int d, int e) {
        Scanner console = new Scanner(System.in);
        a = 3;
        b = 5;
        c = 3;
        d = a + b;
        e = a + c;


        if (a == b && a!=b) {
            System.out.println(d * 2);
        } else if (a == c && a != c){
            System.out.println(e * 2);
        }
    }


}