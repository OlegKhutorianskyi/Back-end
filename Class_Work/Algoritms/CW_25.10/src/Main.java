import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        long b = 15;
//
//
//        double c =239.56;
//
//
//        boolean v = true;
//        boolean p = false;
//
//        String str = "sdsdfsdsseswed";
//
//
//        int[] arr = new int[] {0, 1, 2, 3};
//        int[] arr2 = new int[5] ;
//
//        arr2[0] = 1;
//        arr2[1] = 1;
//        arr2[2] = 1;
//        arr2[3] = 1;
//        arr2[4] = 1;
//
//
//        System.out.println(arr.length);
//        System.out.println(arr2.length);
// todo:
//        Задача: сложить 3 целых числа и вывести их сумму в консоль
//        1. Объявить объект сканнера
//        2. Считать из сканнера 3 значения типа int (scanner.nextInt())
//        3. Объявить переменную для суммы (тоже типа int)
//        4. Произвести сложение
//        5. Вывести результаты в консоль

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num + num1 + num2;

        System.out.println(sum);

//todo
//        Задача: Написать алгоритм линейного поиска
//        Шаг 1: НАЧАТЬ
//        Шаг 2: Получить число для поиска x
//        Шаг 3: Начните с крайнего левого элемента arr[] и один за другим сравните x с каждым элементом arr[]
//        Шаг 4: Если x соответствует элементу Print True.
//        Шаг 5: Если x не совпадает ни с одним из элементов, выведите False.
//                Шаг 6: КОНЕЦ

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


        int x = scanner.nextInt();

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("True");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("False");
        }









    }
    public int solve(int x, String str) {
        return 0;
    }

}