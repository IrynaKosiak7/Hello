package org.example.example_18_01;

import java.util.Scanner;

public class OutPut {
    //Написать программу которая принаем на вход числа X и У в диапазоне от 1 до 3.
    // Посторить логику такими образом, чтобы при вызове вашей программы происходило следующее:
    //при значении Х равным 2 или 3, выводилось значение Х, а если Х=1, выводить значение Y.
    //Пример: myMethod(x = 3, y = 2) – output: X=3
    //                 myMethod(x = 2, y = 2) – output: X=2
    //	     myMethod(x = 1, y = 2) – output: Y=2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write x:");
        int x = scan.nextInt();
        System.out.println("Write y:");
        int y = scan.nextInt();
        String result = getResult(x, y);
        System.out.println(result);
    }

    public static String getResult(int x, int y) {
        if (x < 1 || x > 3 && y < 1 || y > 3){
            return "Error";
        }
        if (x == 2 || x == 3) {
            return "X = " + x;
        }else {
            return "Y =" + y;
        }

    }
}
