package org.example.example_06_02.homework;

import java.util.Arrays;

public class Proba {
    public static void main(String[] args) {
        Algorithmid algorithmid = new Algorithmid(5,2,2);
        System.out.println(Arrays.toString(algorithmid.getResult()));
        Algorithmid algorithmid1 = new Algorithmid(9,-1,3);
        System.out.println(Arrays.toString(algorithmid1.getResult()));
    }
}
