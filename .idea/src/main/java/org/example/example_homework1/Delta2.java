package org.example.example_homework1;

import java.util.Scanner;

public class Delta2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the length of a side of a triangle:");
        int a = in.nextInt();
        System.out.println("Write the height of a triangle:");
        int h = in.nextInt();
        double S = 0.5 * a * h;
        System.out.println("area:" + S);
    }
}
