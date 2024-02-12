package org.example.example_17_01;

public class Calc2 {
    public static void main(String[] args) {
        char znak = '/';
        double a = 4;
        double b = 13;

        switch (znak) {
            case '+' :
                System.out.println(a + b);
                break;
            case '-' :
                System.out.println(a - b);
                break;
            case '*' :
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Error");

        }
    }
}
