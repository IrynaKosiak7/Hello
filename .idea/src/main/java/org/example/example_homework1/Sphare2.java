package org.example.example_homework1;

import java.util.Scanner;

public class Sphare2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write the radius of a sphere:");
        double r = in.nextInt();
        double s = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Area:" + s);
    }
}
