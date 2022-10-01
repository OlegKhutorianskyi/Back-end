public class Main {
    public static void main(String[] args) {
        int temp1=110;
        int temp2=120;
        checkDevice(temp1,temp2);

    }

    public static void checkDevice(int temp1, int temp2){
        boolean isCorrect = (temp1>100 && temp2>100) || (temp1<70 && temp2<70);
        if (isCorrect){
            System.out.println("temp1= " + temp1 + " temp2= " + temp2 + " correct");
        } else {
            System.out.println("temp1= " + temp1 + " temp2= " + temp2 + " incorrect");
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//        String lang = "ru"; // en
//
//
//        int temp1=160;
//        int temp2=102;
//        //---------------------------------------------------------
//        boolean res= checkDevice(temp1,temp2);
//        printResult(lang, res);
//
//    }
//
//    public static void printResult(String lang, boolean result){
//        if(lang.equals("ru")){
//            System.out.println( result? "корректно":"не корректно"    );
//        } else {
//            System.out.println( result? "correct":"not correct"    );
//        }
//    }
//
//    public static boolean checkDevice (int temp1, int temp2){
//        return (temp1>100  &&  temp2>100) ||  (temp1<70  &&  temp2<70);
//    }
//}
