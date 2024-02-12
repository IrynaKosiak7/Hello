package org.example.example_25_01;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Volvo",  2010,  "xc700", 200);
        myCar.move();
        Car car = new Car( "BMW",2015, "x5", 300);
        car.move();
        myCar.turnLeft();
        myCar.stop();
        myCar.turnRight();
        System.out.println(myCar.getBrand());
        System.out.println("*****************");

        System.out.println(myCar.maxSpeed);
        myCar.setMaxSpeed(300);
        System.out.println(myCar.getMaxSpeed());

    }
}
