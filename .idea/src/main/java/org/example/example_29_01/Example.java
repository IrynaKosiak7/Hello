package org.example.example_29_01;

public class Example {
    public static void main(String[] args) {
        //2.Дана строка. Вывести первый, последний и средний (если он есть) символы.
        //3.Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.
        //4.Дана строка. Показать номера символов, совпадающих с последним символом строки.
        //5.Дана строка. Показать третий, шестой, девятый и так далее символы.
        //6.Дана строка. Вывести первые три символа и последние три символа,если длина
        // строки больше 5.Иначе вывести первый символ столько раз, какова длина строки
        //7.Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'.
        // Если какого-то из символов нет, вывести сообщение об этом.

        System.out.println(String.join(",", "Hello", "Hello", "Hello"));
        System.out.println(getFirstMiddleLast("Hello World. How are you?"));

        //  System.out.println(getSplit(" "));
    }

    public static String get3Strings(String string) {
        //1.Дана строка. Вывести ее три раза через запятую и показать количество символов в ней.
        String string5 = string;
        return string5;
    }

    public static String getFirstMiddleLast(String string) {
        char[] chars = string.toCharArray();
        char first = chars[0];
        char last = chars[chars.length - 1];

        if (chars.length % 2 != 0) {
            char middle = chars[chars.length / 2];
            String result = new String(new char[]{first, middle, last});
            return result;
        }
        String result = new String(new char[]{first, last});
        return result;
    }

}
