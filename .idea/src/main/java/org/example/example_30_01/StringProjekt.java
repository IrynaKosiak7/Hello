package org.example.example_30_01;

import java.util.Arrays;

public class StringProjekt {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите слово: ");
        String string = "Hello9999";
        System.out.println(replaceNumbers(string));
        System.out.println(Arrays.toString(getIndexes("string with last s")));
        System.out.println(getSymbols("Hello World! How are you?"));
        System.out.println(Arrays.toString(getElements("Hello World! How are you?")));
        System.out.println(getThreeSymbols("Hell"));
        System.out.println(searchXW("Xay of life ?"));
    }

    public static String replaceNumbers(String string) {
        StringBuilder bilder = new StringBuilder();
        if (string.length() % 2 != 0) {
            return "Error!";
        }
        String numbers = string.substring(string.length() / 2);
        int index = 0;

        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                bilder.append(string.charAt(index));
            } else {
                bilder.append(numbers.charAt(index));
                index++;
            }
        }
        return bilder.toString();
    }

    public static int[] getIndexes(String string) {
        //4.Дана строка.Показать номера символов, совпадающих с последним символом строки.
        char lastChar = string.charAt(string.length() - 1);
        char[] charArray = string.toCharArray();
        int[] result = new int[string.length()];
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == lastChar) {
                result[counter] = i;
                counter++;
            }
        }
        result = Arrays.copyOf(result, counter);
        return result;
    }

    public static String getSymbols(String string) {
        //5.	Дана строка. Показать третий, шестой, девятый и так далее символы.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 3; i < string.length(); i = i + 3) {
            stringBuilder.append(string.charAt(i));
        }
        String result = stringBuilder.toString();
        return result;
    }

    public static char[] getElements(String string) {
        //5.	Дана строка. Показать третий, шестой, девятый и так далее символы.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 3; i < string.length(); i = i + 3) {
            stringBuilder.append(string.charAt(i));
        }
        String result = stringBuilder.toString();
        return result.toCharArray();
    }

    //6.Дана строка. Вывести первые три символа и последние три символа,если длина
    // строки больше 5.Иначе вывести первый символ столько раз, какова длина строки

    public static String getThreeSymbols(String string) {
        StringBuilder stringB = new StringBuilder();
        if (string.length() > 5) {
            String firstElem = string.substring(0, 3);
            String lastElem = string.substring(string.length() - 3);
            stringB.append(firstElem).append(lastElem);
        } else {
            char firstChar = string.charAt(0);
            for (int i = 0; i < string.length(); i++) {
                stringB.append(firstChar);
            }
        }
        return stringB.toString();
    }

    public static String searchXW(String string) {
        //7.Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'.
        // Если какого-то из символов нет, вывести сообщение об этом.
        String stringLowerCase = string.toLowerCase();
        int indexOfX = stringLowerCase.indexOf('x');
        int indexOfW = stringLowerCase.indexOf('w');
        if (indexOfX == -1) {
            return "There is no x";
        } else if (indexOfW == -1) {
            return "There is no w";
        } else if (indexOfX < indexOfW) {
            return "X appears earlier than W";
        } else {
            return "W appears earlier than X";
        }
    }
}
