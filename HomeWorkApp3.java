package Homework3;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String args[]) {
        firstArray();
        drawEq();
        arrayHundred();
        drawEq();
        secondArray();
        drawEq();
        squareArray();
        drawEq();
        for (int i = 0; i < twoArgument(7, 8).length; i++) {
            int arr[]=twoArgument(7, 8);
            System.out.print(arr[i]);
        }
//        второй вариант вывода по заданию 5
//        int[] arr =twoArgument(10,2);
//        System.out.println(Arrays.toString(arr));
        drawEq();
        minAndMaxElement();
        drawEq();
        int[] a = {1, 2, 3, 1, 5};
        System.out.println(equalParts(a));

    }

    public static void drawEq(){
        System.out.println();
        System.out.println("=====");
    }

    public static void firstArray() {
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;

            System.out.print(arr[i]);
        }
    }

    public static void arrayHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
        }
    }

    public static void secondArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]);
        }
    }

    public static void squareArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][arr.length - 1 - i] = 1;
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] twoArgument(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minAndMaxElement() {
        int arr[] = {2, 6, 1, 6, 3, 19, -9, 11, -6, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }

    public static boolean equalParts(int[] a) {
            int sumGeneral = 0;
            int sum = 0;

            for (int i = 0; i < a.length; i++) {
                sumGeneral += a[i];
            }

            for (int i = 0; i < a.length - 1; i++) {
                sum += a[i];
                if(sum == sumGeneral - sum) return true;
            } return false;
        }

    }
