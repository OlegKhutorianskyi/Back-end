/*
Реализуйте программу,которая выводит на экран результаты сложения,вычитания,
умножения и деления двух чисел. Каждая из арифметических операций
должна быть реализована как отдельный метод.
*/


import java.util.Scanner;

public class multiplication {
    int j;
    int k;
    int l;

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        multiplication j = new multiplication();
        multiplication k = new multiplication();
        multiplication l = new multiplication();
        System.out.println("Place, write integer one: ");
        j.j = scanner.nextInt();
        System.out.println("Place, write integer two: ");
        k.k = scanner.nextInt();
        System.out.println("Result: ");
        l.l = j.j * k.k;
        System.out.println(l.l);
    }
}
