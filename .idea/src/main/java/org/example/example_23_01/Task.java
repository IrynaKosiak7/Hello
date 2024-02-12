package org.example.example_23_01;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] myList = {5, 24, 15, -10, 0, 12, 55, -4, 35, -43, 75};
        System.out.println("Наибольшее значение:" + getMaxNumber(myList));
        System.out.println("Наибольшее значение с четным индексом:" + getMaxEven(myList));
        System.out.println("Cуммa четных положительных элементов: " + getPlusSum(myList));
        System.out.println("среднее арифметическое от всех элементов массива " + getMedieumNumber(myList));
        System.out.println("меньше среднего арифметического " + Arrays.toString(getLessArithmetic(myList)));
        System.out.println("два наименьших элемента " + Arrays.toString(getMinEven(myList)));
        System.out.println("сумму модулей элементов массива " + getModul(myList));
        System.out.println(" номер минимального по модулю элемента массива " + getMinModul(myList));
        System.out.println(Arrays.toString(getNewList(myList)));
    }

    public static int getMaxNumber(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }

    public static int getMaxEven(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i = i + 2) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        return max;
    }

    public static int getPlusSum(int[] myList) {
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > 0 && myList[i] % 2 == 0) {
                sum += myList[i];
            }
        }
        return sum;
    }

    public static double getMedieumNumber(int[] myList) {
        double sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        double medium = sum / myList.length;
        return medium;
    }

    public static int[] getLessArithmetic(int[] myList) {
        int[] array1 = new int[myList.length];
        int counter = 0;
        for (int j = 0; j < myList.length; j++) {
            if (myList[j] < getMedieumNumber(myList)) {

                array1[counter] = myList[j];

            }
        }
        int[] result = Arrays.copyOf(array1, counter);
        return result;
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

    public static int getModul(int[] myList) {
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum += Math.abs(myList[i]);
        }
        return sum;
    }

    public static int getMinModul(int[] myList) {
        int number = 0;
        int min = Math.abs(myList[0]);
        for (int i = 0; i < myList.length; i++) {
            if (Math.abs(myList[i]) < min) {
                min = Math.abs(myList[i]);
                number = i;
            }
        }
        return number;
    }

    public static int[] getNewList(int[] myList) {
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
}
