package org.example.example_06_02.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmidTest {

    @Test
    void getResult() {
        int number = 9;
        int methodNumber = -2;
        int cycleNumber = 3;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();
        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFactorial() {

    }

    @Test
    void getFibonacciSequence() {

    }
}