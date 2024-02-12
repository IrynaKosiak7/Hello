package org.example.example_15_01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        char c = '1';
        byte a = 10;
        int w = 12345;
        long l = 123456l;
        boolean bool = false;
        float f = 5487f;
        double g = 123.524;
        String str = "Hello world";
        short s = 500;

        System.out.println(f);
        System.out.println(g);
        System.out.println(a % 3);
        System.out.println(s <= a);

        System.out.println(s != a);

        int i = 0;
        while (i <= a) {
            System.out.println("Виконується дія");
            i = i + 1;
        }

        System.out.println(i);
        do {
            System.out.println("Виконується дія do-while");
        } while (i <= a);


        int step = 0;
        while (step <= 100) {
            System.out.print(step + ",");
            step = step + 1;
        }

        System.out.println();
        System.out.println("111111");





    }
}
