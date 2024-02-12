package org.example.example_18_01;

import java.util.Scanner;

public class Diap {
    public static void main(String[] args) {
        getNumbers();
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calculateResult(a, b, c);
    }

    //В диапазоне от 0 до 100
    // вывести на экран первые 25 чётных чисел, исключая “десятки”.
    public static void getNumbers() {
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                counter++;
            }
            if (counter == 25) {
                break;
            }
        }
    }

    //Создать программу которая принимает на вход 3 вещественных числа, и будет
// выводить на экран ТО число, чей остаток от деления на 1.5 -  меньше остальных.
// Для наглядности выводить и сам остаток.
    public static void calculateResult(double a, double b, double c) {
        double remainder1 = a % 1.5;
        double remainder2 = b % 1.5;
        double remainder3 = c % 1.5;
        if (remainder1 < remainder2 && remainder1 < remainder3) {
            System.out.println("Исходное значение " + a + ", остаток " + remainder1);
        } else if (remainder2 < remainder1 && remainder2 < remainder3) {
            System.out.println("Исходное значение " + b + ", остаток " + remainder2);
        } else {
            System.out.println("Исходное значение " + c + ", остаток " + remainder3);
        }
    }
}
