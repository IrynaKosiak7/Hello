package org.example.example_homework1.factorial;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        calculateFactorial();
    }

    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n!:");
        int n = scanner.nextInt();
        int a = 1;
        int i = 1;
        do {
            a = a * i;
            i++;
        } while (i <= n);
        System.out.println(n + "! = " + a);
    }
}
