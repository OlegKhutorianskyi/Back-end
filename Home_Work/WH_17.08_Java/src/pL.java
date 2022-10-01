/*
Реализуйте программу,которая выводит на экран результаты сложения,вычитания,
умножения и деления двух чисел. Каждая из арифметических операций
должна быть реализована как отдельный метод.
*/


import java.util.Scanner;

public class pL {

    int a;
    int b;
    int c;


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        pL a = new pL();
        pL b = new pL();
        pL c = new pL();
        System.out.println("Place, write integer one: ");
        a.a = scanner.nextInt();
        System.out.println("Place, write integer two: ");
        b.b = scanner.nextInt();
        System.out.println("Result: ");
        c.c = a.a + b.b;
        System.out.println(c.c);
    }

}
