package org.example.example_22_01;

public class Task {
    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        int intValue2 = 20;
        long longValue3 = 30;

        float floatValue = 123.456f;
        double doubleValue = 234.4867;

        char charValue = 'c';

        shortValue = byteValue;
        intValue2 = shortValue;
        longValue3 = intValue2;
        floatValue = longValue3;
        doubleValue = longValue3;
        System.out.println(doubleValue);

    }
}
