package org.example.example_24_01;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int[] array3;
        int[] array4 = {10, 6, 1, 8, 2, 5, 8, 4, 5, 9};
        int[] array5 = {7, 6 ,5, 4, 0, 2, 1, 3};

        Arrays.fill(array1, 8);

        array3 = Arrays.copyOf(array2, 4);
        printArray(array3);
        // printArray(new int[]{0, 1, 2, 3, 4, 5, 6});

        array3 = Arrays.copyOfRange(array2, 3, 4);
        printArray(array3);

        Arrays.sort(array4);
        printArray(array4);

        System.out.println(Arrays.binarySearch(array4, 8));


        Arrays.sort(array5);
        System.out.println( Arrays.equals(array5, array2));

    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
