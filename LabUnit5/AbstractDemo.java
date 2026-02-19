package LabUnit5;

abstract class Vehicle {
    // Abstract method (no body)
    abstract void move();

    // Regular method
    void horn() { System.out.println("Beep Beep!"); }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car moves on four wheels.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.horn();
    }
}
