package org.example.example_01_02;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        calculateFactorial();
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n!:");
        int n = scanner.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println( n + " - "+ a );
    }
}
