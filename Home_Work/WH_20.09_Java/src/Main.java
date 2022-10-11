import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();
        int m = 18;
        if (age >= m) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}