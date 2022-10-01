package lessonsMethods;

public class Cat {

    String name;
    int age;

    public void seyMeow() {
        System.out.println("Meow!");
    }
    public void jump() {
        System.out.println("jump-jump");
    }
    public static void main(String[] args) {

       // Scanner scanner = new Scanner(System.in);
        Cat vasya = new Cat();
        Cat barsik = new Cat();
        Cat pushok = new Cat();
        vasya.name = "Vasya";
        barsik.name = "Barsik";
        pushok.name = "pushok";

        pushok.age = 12;
        barsik.age = 14;
        vasya.age = 10;


        vasya.seyMeow();
        barsik.jump();

        System.out.println(vasya.name + " " + vasya.age + " ");
        vasya.seyMeow();
    }

}
