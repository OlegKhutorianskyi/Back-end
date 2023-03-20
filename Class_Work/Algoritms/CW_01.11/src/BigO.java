public class BigO {
    public static void main(String [] args){
        algoritm(new int[] {1, 2, 3, 4, 5});

    }

    public static void algoritm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hellow world!" + i);
        }
        System.out.println("Hellow world!");
    }

    public static void fork(int n) {
        if (n < 5) {
            System.out.println("number < 5");
        } else {
            for(int i = 0; i < n; i++) {
                System.out.println(i + " ");
            }
        }
    }

}
