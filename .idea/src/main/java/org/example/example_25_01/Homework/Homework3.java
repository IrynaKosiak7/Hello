package org.example.example_25_01.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();


        System.out.println(number + " -> " + Arrays.toString(calculateWithFor(number)));
        System.out.println("--------------------------------------------------------------");
        System.out.println(number + " -> " + Arrays.toString(calculateWithWhile(number)));
        System.out.println("--------------------------------------------------------------");
        System.out.println(number + " -> " + Arrays.toString(calculateWithDoWhile(number)));

    }

    private static int[] initArray(int number) {
        int[] fibanocci = new int[number];
        if (number > 1) {
            fibanocci[1] = 1;
        }
        return fibanocci;
    }

    public static int[] calculateWithFor(int number) {
        int[] fibanocci = initArray(number);
        for (int i = 2; i < fibanocci.length; i++) {
            fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
        }
        return fibanocci;
    }

    public static int[] calculateWithWhile(int number) {
        int[] fibanocci = initArray(number);
        int i = 2;
        while (i < fibanocci.length) {
            fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
            i++;
        }
        return fibanocci;
    }

    public static int[] calculateWithDoWhile(int number) {
        int[] fibanocci = initArray(number);
        int i = 2;
        if (number > 2) {
            do {
                fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
                i++;

            } while (i < fibanocci.length);
        }

        return fibanocci;
    }
}
