package org.example.example_25_01.Homework;

import java.util.Arrays;

public class Homework2 {
    //Отсортировать массив целых чисел по возрастанию
    //и по убыванию (2 отдельных метода),не используя Arrays.sort()


    //написать программу, которая принимает от пользователя целое число n.
    //программа должна посчитать и вывести n чисел Фибоначчи.
    //
    //написать 3 варианта реализации ('3 метода'):
    //1.используя цикл while
    //2.используя цикл do-while
    //3.используя цикл for
    //
    //Пример: ввод пользователя 9 -> вывод [0, 1, 1, 2, 3, 5, 8, 13, 21],
    //                  ввод пользователя 5 -> вывод [0, 1, 1, 2, 3]

    public static void main(String[] args) {
        int[] myList = {5, -4, 24, 15, 0, -30, 12, 55, 4, 35, -10, 43, -75};
        System.out.println("два наименьших элемента " + Arrays.toString(getMinEven(myList)));
        System.out.println("Массив по возрастанию" + Arrays.toString(getArrayIncrement(myList)));
        System.out.println("Массив по убыванию" + Arrays.toString(getArrayDescending(myList)));
    }

    public static int[] getMinEven(int[] myList) {
        int min1 = myList[0];
        int minIndex = 0;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < myList.length; i++) {
            if (min1 > myList[i]) {
                min1 = myList[i];
                minIndex = i;
            }
        }
        for (int j = 0; j < myList.length; j++) {
            if ((j != minIndex) && (myList[j] < min2)) {
                min2 = myList[j];
            }
        }
        int[] array = new int[]{min1, min2};
        return array;
    }

    public static int[] getArrayIncrement(int[] myList) {
        for (int j = 0; j < myList.length; j++) {
            for (int i = 0; i < myList.length - j - 1; i++) {
                if (myList[i] > myList[i + 1]) {
                    int temp = myList[i];
                    myList[i] = myList[i + 1];
                    myList[i + 1] = temp;
                }
            }
        }
        return myList;
    }

    public static int[] getArrayDescending(int[] myList) {
        for (int j = 0; j < myList.length; j++) {
            for (int i = 0; i < myList.length - j - 1; i++) {
                if (myList[i] < myList[i + 1]) {
                    int temp = myList[i];
                    myList[i] = myList[i + 1];
                    myList[i + 1] = temp;
                }
            }
        }
        return myList;
    }
}
