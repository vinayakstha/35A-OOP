package javaoop.abstraction;

import java.util.Scanner;

abstract class Shape {
    float radius;
    int length, breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(float radius) {
        this.radius = radius;
    }

    public abstract void calculateArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of the rectangle is " + this.length * this.breadth);
    }
}

class Circle extends Shape {
    float area = (22 / 7) * this.radius * this.radius;

    Circle(float radius) {
        super(radius);
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of the circle is " + area);
    }
}

public class Task2 {
    /*
     * Create an abstract class called Shape with an abstract method called
     * calculateArea(). Implement two subclasses called Rectangle and Circle that
     * inherit from Shape. Override the calculateArea() method in both subclasses to
     * calculate and return the area of a rectangle and a circle, respectively.
     * Write the Java code to implement this scenario with Scanner Input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length and breadth of a rectangle: ");
        int l = scanner.nextInt();
        int b = scanner.nextInt();
        Rectangle r1 = new Rectangle(l, b);
        r1.calculateArea();

        System.out.print("enter radius of a circle: ");
        float r = scanner.nextFloat();
        Circle c1 = new Circle(r);
        c1.calculateArea();

        scanner.close();
    }
}
