package org.example.example_08_02;

import java.util.Arrays;
import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {
        //final
        final int number = 8;
        final int[] array = {1, 9, 2, 8, 5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // random class
        Random random= new Random();
        int someNumber = random.nextInt(10);
        System.out.println(someNumber);
        float someFloat = random.nextFloat();
        double someDouble = random.nextDouble();
        System.out.println(someFloat);
        System.out.println(someDouble);
    }
    public  static  int[]generateArray (int length){
        int[] array = new int [length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();

        }
        return  array;
    }
}
