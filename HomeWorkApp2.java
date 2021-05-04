package Homework2;

public class HomeWorkApp2 {

    public static void main(String args[]){
        System.out.println(sumCheck(5,-15));
        whatNumber(-5);
        System.out.println(negativeOrPositiv(-1));
        textSeveralTimes("Wonderful evening",3);
        System.out.println(whatYear(1996));
    }

    public static boolean sumCheck(int a, int b){
        int sum;
        sum = a + b;
        if(sum >= 10 && sum <= 20){
            return true;
        }else
            return false;

    }

    public static void whatNumber(int a) {
        if (a<0) {
            System.out.println("Число отрицательное");
        }else if(a>=0){
            System.out.println("Число положительное");
        }
    }

    public static boolean negativeOrPositiv(int a){
        if (a<0){
            return true;
        }else
            return false;
    }

    public static void textSeveralTimes(String text, int a){
        for(int i = 0; i < a; i++){
            System.out.println(text);
        }
    }

    public static boolean whatYear(int year) {

            if (year % 4 == 0 || year % 400 == 00) {
                return true;
            }
            return false;
    }

}
