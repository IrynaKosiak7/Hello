package org.example.example_22_01;

public class Group {
    public static void main(String[] args) {
        //Напишите программу, которая выводит на экран числа от 1 до 100.
        // При этом вместо чисел, кратных трем, программа должна
        //выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz
        //Если число кратно трём и пяти одновременно,
        // то программа должна выводить слово FizzBuzz.

        for (int number = 1; number < 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (number % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (number % 3 == 0) {
                System.out.print("Fizz, ");
            } else {
                System.out.print(number + ", ");
            }
        }
        //Вывести на экран “равнобедренный треугольник”, всё “рёбра”
        // которого состоят из единиц,“медиана” равна 14,
        // а вся “площадь” заполнена нулями
        int mediana = 14;
        for (int i = 0; i <= mediana; i++) {
            if (i == 0) {
                System.out.println("1");
            } else {
                System.out.print("1");
            }
            for (int j = 0; j <= i - 2; j++) {
                System.out.print("0");
            }

            System.out.println("1");

        }
        for (int k = mediana; k >= 0; k--) {
            if (k == 0) {
                System.out.println("1");
            } else {
                System.out.print("1");
                for (int l = 0; l < k - 1; l++) {
                    System.out.print("0");
                }
                System.out.println("1");
            }
        }
    }
}
