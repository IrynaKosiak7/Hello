package org.example.example_05_02;

import static javax.swing.UIManager.getColor;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor() + " цвета с радиусом " + radius);
    }
}
