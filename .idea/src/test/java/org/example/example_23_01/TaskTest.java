package org.example.example_23_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void getMaxNumber() {
        int[] array = { 1, 9, 2, 8, 3, 7, 4, 5};
        int expected = 9;
         //when
        int actual = Task.getMaxNumber(array);
         // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxEven() {
        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
        int expected = 4;
        //when
        int actual = Task.getMaxEven(array);
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPlusSum() {
        int[] array = { 1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int expected = 54;
        //when
        int actual = Task.getPlusSum(array);
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMedieumNumber() {
        int[] array = { 1, 9, 2, 8, 3, 7, 4, 5};
        double expected = 4.875;
        //when
        double actual = Task.getMedieumNumber(array);
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLessArithmetic() {
        int[] array = {1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int[] expected = {1,2,3,4};
        //when
        int[] actual = Task.getLessArithmetic(array);
        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getMinEven() {
        int[] array = { 1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int[] expected = {1,2};
        //when
        int[] actual = Task.getMinEven(array);
        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getModul() {
        int[] array = { 1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int expected = 79;
        //when
        int actual = Task.getModul(array);
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMinModul() {
        int[] array = { 1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int expected = 0;
        //when
        int actual = Task.getMinModul(array);
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNewList() {
        int[] array = { 1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int[] expected = {1,2, 3, 4, 5, 7, 8, 9, 14, 26};
        //when
        int[] actual = Task.getNewList(array);
        // then
        Assertions.assertArrayEquals(expected, actual);
    }
}