package org.example.example_17_01;

public class ClassWork {
    public static void main(String[] args) {
        Student student1 = new Student("211123-m", "Tatiana", 30);
        Student student2 = new Student("211123-m", "Masha", 30);
        Student student3 = new Student();

        System.out.println(student1.name);
        System.out.println(student3.age);
    }
}
