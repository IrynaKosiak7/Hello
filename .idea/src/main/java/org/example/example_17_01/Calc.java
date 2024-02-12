package org.example.example_17_01;

public class Calc {
    public static void main(String[] args) {
        char znak = '/';
        double a = 12.3;
        double b = 10.4;

        switch (znak) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("undefeind");
                break;
        }

    }
}