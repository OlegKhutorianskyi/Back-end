/*
Реализуйте программу,которая выводит на экран результаты сложения,вычитания,
умножения и деления двух чисел. Каждая из арифметических операций
должна быть реализована как отдельный метод.
*/


import java.util.Scanner;

public class division {
    int d;
    int e;
    int f;


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        division d = new division();
        division e = new division();
        division f = new division();
        System.out.println("Place, write integer one: ");
        d.d = scanner.nextInt();
        System.out.println("Place, write integer two: ");
        e.e = scanner.nextInt();
        System.out.println("Result: ");
        f.f = d.d / e.e;
        System.out.println(f.f);
    }
}
