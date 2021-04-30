package Homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        drawEqually();
        checkSumSign();
        drawEqually();
        printColor();
        drawEqually();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = -7;
        int b = 7;
        int sum = a+b;
        if(sum>=0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Cумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if(value<=0){
            System.out.println("Red");
        }else if(value>0 && value<=100){
            System.out.println("Yellow");
        }else if(value>100){
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        int a = 7;
        int b = 7;
        if(a>=b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }

    public static void drawEqually(){
        System.out.println("=====");
    }
}
