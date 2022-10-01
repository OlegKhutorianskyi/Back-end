import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String LastName = "Khutorianskyi";
        int age = 24;

        String name = null;
        System.out.println((String) null);
        System.out.println(LastName);
        System.out.println(age);

        int x = 1;
        int y = x * 2;
        System.out.println(x);
        System.out.println(y);
        int a = 5;
        int b = a * 3;
        int c = a + b - 5;
        int d = c * 23;
        int e = d / 4;
        System.out.println(e);

        Scanner console = new Scanner(System.in);
        System.out.println("Write your name: ");
        name = console.nextLine();
        System.out.println("Write your age: ");
        int age = console.nextInt();

        System.out.println("Your name:" + name);
        System.out.println("Your age:" + age);

        System.out.println("Write two integer:");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = x + y;
        System.out.println("Result:" + (x + y));

        //Задание 1
        int years = 2505;
        int AgeFriends = 28;
        int YearsFriend = years - AgeFriends;
        System.out.println(YearsFriend);


        //Задание 2
        int six = 6;
        six++;
        six++;
        six++;
        System.out.println(six);

        //Задание 3
        Scanner console = new Scanner(System.in);
        System.out.println( "Write random number in 1 to 10: ");
        int num = console.nextInt();
        System.out.println("Your number " + num);

        Scanner console = new Scanner(System.in);
        System.out.println( "Write one number: ");
        int numOne = console.nextInt();
        System.out.println( "Write two number: ");
        int numTwo = console.nextInt();
        System.out.println( "Write three number: ");
        int numThree = console.nextInt();
        int plus = numOne + numTwo + numThree;
        int subtraction = numOne - numTwo - numThree;
        int dividing = numOne / numTwo / numThree;
        int multiplication = numOne * numTwo * numThree;
        System.out.println("Result addition: " + plus + " subtraction: " + subtraction + " dividing: " + dividing + " multiplication: " + multiplication);

    }
}