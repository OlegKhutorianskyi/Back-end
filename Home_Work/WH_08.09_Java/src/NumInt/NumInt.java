package NumInt;
import java.util.Scanner;

public class NumInt{

    public static boolean GetVol (int a) {
        Scanner console = new Scanner(System.in);
        a = console.nextInt();

        if ( a%2==0 && a%2!=0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        return false;
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        NumInt inte = new NumInt();
        System.out.println(inte.GetVol(console.nextInt()));




    }
}