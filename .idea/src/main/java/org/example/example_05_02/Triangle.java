package org.example.example_05_02;

import static javax.swing.UIManager.getColor;

public class Triangle extends Shape {
    private int sideOfTriangle;
    public Triangle(String color, int sideOfTriangle){
        super(color);
        this.sideOfTriangle = sideOfTriangle;
    }
    @Override
    public void draw(){
        System.out.println("Рисуй треугольник " + getColor() + " цвета со стороной "+ sideOfTriangle);
    }
}
