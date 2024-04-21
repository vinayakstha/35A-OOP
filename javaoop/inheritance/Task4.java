package javaoop.inheritance;

class Vehicle {
    public void startEngine() {
        System.out.println("engine started");
    }

    public void stopEngine() {
        System.out.println("engine stopped");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("drive");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("ride");
    }
}

public class Task4 {
    /*
     * 4. Design a class hierarchy for different types of vehicles. Create a base
     * class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two
     * classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car'
     * and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate
     * hierarchical inheritance and invoke the relevant methods for a car and a
     * motorcycle object.
     */
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();
        c1.startEngine();
    }
}
