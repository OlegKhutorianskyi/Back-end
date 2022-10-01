package lessonsMethods;

import java.util.Scanner;

public class Truck {
    public int getVolume(int length, int height, int width){
        int result;
        result = length * width * height;
        return result;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Truck mercedes = new Truck();
        System.out.println(mercedes.getVolume(console.nextInt(), 43, 87 ));

    }
}
