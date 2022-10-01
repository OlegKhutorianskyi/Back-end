/*
Реализуйте программу,которая выводит на экран результаты сложения,вычитания,
умножения и деления двух чисел. Каждая из арифметических операций
должна быть реализована как отдельный метод.
*/


import java.util.Scanner;

public class subtraction {
    int g;
    int h;
    int i;

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        subtraction g = new subtraction();
        subtraction h = new subtraction();
        subtraction i = new subtraction();
        System.out.println("Place, write integer one: ");
        g.g = scanner.nextInt();
        System.out.println("Place, write integer two: ");
        h.h = scanner.nextInt();
        System.out.println("Result: ");
        i.i = g.g - h.h;
        System.out.println(i.i);
    }
}