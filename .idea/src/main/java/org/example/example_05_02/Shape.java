package org.example.example_05_02;

//Создайте абстрактный класс Shape и его наследники Circle, Square, Triangle.
// Класс Shape содержит метод draw() и переменную хранящую цвет.
// Классы Circle, Square, Triangle  содержат переменные радиус,
// сторона квадрата, сторона треугольника соответственно.
public class Shape {
    private String color;


    public Shape(String color) {
        this.color = color;
    }

    public void draw () {
        System.out.println("Рисуем фигуру " + color + " цвета");
    }
    public String getColor() {
        return color;
    }

}
