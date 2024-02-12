package org.example.example_29_01;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        String string = "Java";
        int[] array ={1, 2, 3};
        System.out.println(Arrays.toString(array));
        array[0] = 4;
        array[1]= 5;
        array[2]= 6;
        System.out.println(Arrays.toString(array));

        System.out.println(string);
        String string1 = string.replace('a', 'x');

        System.out.println(string1);

        String a= String.valueOf(1123L);
        System.out.println(a);
        string1.split("");


        String string4 = "Name Surname; age:18";
        String[] nameAndAge = string4.split("a");
        System.out.println(Arrays.toString(nameAndAge));


//        System.out.println(string4.substring(5, 12));
//        System.out.println("Java".toLowerCase());
//        System.out.println("fghjk".trim());
//        System.out.println(String.join());
    }
}
