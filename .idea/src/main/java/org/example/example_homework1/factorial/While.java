package org.example.example_homework1.factorial;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        returnFactorial();
    }

    public static void returnFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n!:");
        int n = scanner.nextInt();
        int a = 1;
        int i = 1;
        while (i <= n) {
            a = a * i;
            i++;
        }
        System.out.println(n + "! = " + a);
    }
}
