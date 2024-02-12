package org.example.example_homework1;

import java.util.Scanner;

public class Trapezium1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the length of the side 1:");
        int a = in.nextInt();
        System.out.println("Write the length of the side 2:");
        int b = in.nextInt();
        System.out.println("Write the length of the side 3:");
        int c = in.nextInt();
        System.out.println("Write the length of the side 4:");
        int d = in.nextInt();
        int per = a + b + c + d;

        System.out.println("Trapezoidal perimeter: " + per);
    }

}
