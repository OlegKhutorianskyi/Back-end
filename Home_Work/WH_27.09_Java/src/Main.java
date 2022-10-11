import java.util.Scanner;
//Необходимо написать метод, которая печатает все целые нечетные числа в диапазоне  между num1 и num2.
// Учтите, num1 может быть как меньше, так больше или равно  num2.
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter number one:   ");
        int num1 = console.nextInt();
        System.out.println("Please, enter number two:   ");
        int num2 = console.nextInt();
        System.out.println("Result");
        System.out.println(wholeNum(num1, num2));
    }

    public static int wholeNum(int num1, int num2) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = num1; i <= num2; i+=2){
             sum +=i;
            System.out.println(i);
        }
        System.out.println("Sum all numbers:    ");
        return sum;
    }
}