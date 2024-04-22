package javaoop.abstraction;

abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

public class Task1 {
    /*
     * Create an abstract class called Animal with an abstract method called
     * sound(). Implement two subclasses called Dog and Cat that inherit from
     * Animal. Override the sound() method in both subclasses to display the
     * specific sound made by each animal. Write the Java code to implement this
     * scenario.
     */
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();
    }
}
