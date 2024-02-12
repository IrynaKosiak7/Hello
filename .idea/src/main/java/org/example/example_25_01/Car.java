package org.example.example_25_01;

public class Car {
    public String brand;
    public int yearOfManufacture;
    public String model;
    public int maxSpeed;
    private boolean isMoving;

    public Car(String brand, int yearOfManufacture, String model, int maxSpeed) {
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }


    public void move() {
        isMoving = true;
        System.out.println(brand + " " + model + " поехалa со скоростью " + maxSpeed + " км/ч");
    }

    public void stop() {
        isMoving = false;
        System.out.println(brand + " " + model + " stop");
    }

    public void turnLeft() {
        if (isMoving == true) {
            System.out.println("Поворачиваю на лево");
        }
    }

    public void turnRight() {
        if (isMoving == true) {
            System.out.println("Поворачиваю на право");
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
