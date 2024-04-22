package javaoop.abstraction;

abstract class Vehicle {
    public abstract void startEngine();

    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped!");
    }
}

public class Task3 {
    /*
     * Create an abstract class called Vehicle with abstract methods startEngine()
     * and stopEngine(). Implement two subclasses called Car and Motorcycle that
     * inherit from Vehicle. Implement the startEngine() and stopEngine() methods in
     * both subclasses to start and stop the engines of a car and a motorcycle,
     * respectively.
     */
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngine();
        c1.stopEngine();
    }
}
