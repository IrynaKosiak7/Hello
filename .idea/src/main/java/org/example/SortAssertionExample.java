package org.example.example_08_02;

import org.example.example_25_01.BubbleSort;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class SortAssertionExample {
    public static void main(String[] args) {
        int[] array1 = ClassWork.generateArray(100000);
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println(Arrays.equals(array2, array1));
        LocalDateTime timeStart = LocalDateTime.now();
        Arrays.sort(array1);
        LocalDateTime timeEnd = LocalDateTime.now();
        System.out.println("Quick sort time: " + Duration.between(timeStart, timeEnd).getSeconds());
        timeStart = LocalDateTime.now();
        BubbleSort.bubbleSort(array2);
        timeEnd = LocalDateTime.now();
        System.out.println("BubbleSort time = " + Duration.between(timeStart, timeEnd).getSeconds());

    }
}
