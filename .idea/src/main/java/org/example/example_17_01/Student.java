package org.example.example_17_01;

public class Student {
    String groupNumber;
    String name;
    int age;

    public Student(){
    }

    public Student(String groupNumber, String name, int age) {
        this.groupNumber = groupNumber;
        this.name = name;
        this.age = age;
    }

    public void learning(){
        System.out.println("Student " + this.name + " is learning Java");
    }
}
