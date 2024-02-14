package org.example.example_06_02.homework;

public class Algorithmid {
    private int number;
    private int methodNumber;
    private int cycleNumber;

    public Algorithmid(int number, int methodNumber, int cycleNumber) {
        if (number >= 0) {
            this.number = number;
        } else {
            System.out.println("Error!");
        }
        if (methodNumber < 0 || methodNumber > 2) {
            System.out.println("Error!");
        }else {
            this.methodNumber = methodNumber;
        }
        if (cycleNumber < 0 || cycleNumber > 3) {
            System.out.println("Error!");
        }else {
            this.cycleNumber = cycleNumber;
        }
    }

    public int[] getResult() {
        if (methodNumber == 1) {
            return getFactorial();
        } else if (methodNumber == 2) {
            return getFibonacciSequence();
        } else {
            return new int[]{-1};
        }
    }
    public  int[] getFactorial() {
        int[] result = new int[1];
        Factorial factorial = new Factorial(number);
        if (cycleNumber == 1) {
            result[0] = factorial.calculateFactorialFor();
        } else if (cycleNumber == 2) {
            result[0] = factorial.calculateFactorialDoWhile();
        }else if (cycleNumber == 3) {
            result[0] = factorial.calculateFactorialWhile();
        } else {
            result[0] = -1;
        }
        return result;
    }
    public int[] getFibonacciSequence() {
        FibonacciSequence fibonacci = new FibonacciSequence(number);
        if (cycleNumber == 1) {
            return fibonacci.fibonacciSequenceFor();
        } else if (cycleNumber == 2) {
            return fibonacci.fibonacciSequenceWhile();
        }else if (cycleNumber == 3) {
            return fibonacci.fibonacciSequenceDoWhile();
        }
        return new int[]{-1};
    }

}
