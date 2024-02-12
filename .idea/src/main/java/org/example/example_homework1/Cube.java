package org.example.example_homework1;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the length of the side:");
        int c = in.nextInt();
        System.out.println("volume" + Math.pow(c, 3));
    }
}
