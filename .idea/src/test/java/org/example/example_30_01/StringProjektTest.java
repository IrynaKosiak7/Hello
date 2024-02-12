package org.example.example_30_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProjektTest {

    @Test
    void replaceNumbers() {
        String string = "java99";
        String expected = "jav9a9";
        String actual = StringProjekt.replaceNumbers(null);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getIndexes() {
    }

    @Test
    void getSymbols() {
    }

    @Test
    void getElements() {
    }

    @Test
    void getThreeSymbols() {
    }

    @Test
    void searchXW() {
    }
}