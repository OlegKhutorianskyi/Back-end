/*Написать метод возведения числа в квадрат. И далее к результату прибавить число 2. Например,
        если Вы ввели число 2, тогда в консоль должно быть выведено число 4 и 6
        если Вы ввели число 3, тогда в консоль должно быть выведено число 9 и 11
        если Вы ввели число 5, тогда в консоль должно быть выведено число 25 и 27*/


import java.util.Scanner;

public class intT {

    int wi;
    int quad;
    int plus;




    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        intT intW = new intT();

        System.out.println("Place, write integer: ");
        intW.wi = scanner.nextInt();
        System.out.println("Result: ");
        intW.quad = intW.wi * intW.wi;
        System.out.println(intW.quad);
        System.out.println("Result plus '2': ");
        intW.plus = intW.quad + 2;
        System.out.println(intW.plus);

}
}
