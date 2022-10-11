import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//// (___1___)
//// Реализуйте метод,
//// который получая 3 числа int определяет,
//// есть ли среди них такое, которое равно сумме двух других.
////        Scanner console = new Scanner(System.in);
////        System.out.println("Please enter number one: ");
////        int numb1 = console.nextInt();
////        System.out.println("Please enter number two: ");
////        int numb2 = console.nextInt();
////        System.out.println("Please enter number three: ");
////        int numb3 = console.nextInt();
////        System.out.println(sumTwoNumb(numb1,numb2,numb3));
//
//

//    }

////    public static boolean sumTwoNumb(int numb1, int numb2, int numb3) {
////
////        if (numb1 == numb2 + numb3) {
////            System.out.println("the number 1 is equal to the other two");
////        } else if (numb2 == numb1 + numb3) {
////            System.out.println("the number 1 is equal to the other two");
////        } else if (numb3 == numb1 + numb2) {
////            System.out.println("the number 1 is equal to the other two");
////        } else {
////            System.out.println("crashed");
////        }
////
////        return false;
//    }

//// (___2___)
////  Представьте, Вы пишите программу  для расчета штрафов за превышение скорости.
////  В качестве исходных данных у вас: ограничение скорости на данном участке дороги и скорость, с которой двигался автомобиль
////  Таблица штрафов такая:
////- превышение менее 10% от скоростного ограничения – не штрафуется
////- 10% - менее 20%   от скоростного ограничения – 50 евро
////- 20% - менее 30%   от скоростного ограничения – 150 евро
////- от 30% и выше  - 500 евро плюс
////Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран.
//        
//
public class Main {
        public static void main(String[] args) {
            int limitSpeed = 90;
            int speed = 105;
            System.out.println(finedShtrafSum(80));
        }
    public static int finedShtrafSum(double penaltyRes){
        if (penaltyRes <= 10) {
            return 0;
        }
        if (penaltyRes >= 10 && penaltyRes <= 20) {
            return 50;
        }
        if (penaltyRes >= 20 && penaltyRes <= 30) {
            return 150;
        }
        if (penaltyRes > 30) {
            return 500;
        }

return 0;
    }

}