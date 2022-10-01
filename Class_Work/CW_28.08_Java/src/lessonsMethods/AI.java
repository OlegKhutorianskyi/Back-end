package lessonsMethods;

public class AI {
    public void sayHi(String name, int age, String professionals, int money) {
        System.out.println("Dobry den " + name + " kak dela?");

    }

    public static void main(String[] args) {
        AI sara = new AI();
        sara.sayHi("Sara", 24, "Programier", 108000);
    }
}
