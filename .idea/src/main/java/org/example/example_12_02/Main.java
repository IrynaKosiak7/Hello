package org.example.example_12_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int algoritmId = 1;
        String string = "Hello World Test";
        AlgorithManager algorithManager= new AlgorithManager(algoritmId, string);
        System.out.println(Arrays.toString(algorithManager.getResult()));

    }
}
