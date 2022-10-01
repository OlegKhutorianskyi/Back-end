//Задача 2.1
import java.util.Scanner;

public class Sum {

    public void getVolume(int a, int b, int c, int e) {
        Scanner console = new Scanner(System.in);
        System.out.println("Place write integer in 0 to 1000: ");
        int result;
        getVolume(console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt());
        result = a + b + c + e;
        System.out.println("Result: " + result);

    }

}
