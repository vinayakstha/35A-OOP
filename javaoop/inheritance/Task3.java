package javaoop.inheritance;

class Shape {
    int length, breadth, radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    public void getArea() {
        System.out.println(length * breadth);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    public void getArea() {
        System.out.println(22 / 7 * (radius * radius));
    }
}

public class Task3 {
    /*
     * Imagine you are building a geometry calculator program. You need to implement
     * the calculation of areas for different shapes, including rectangles, squares,
     * and circles. To achieve this, you decide to use a multilevel inheritance
     * hierarchy.
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 10);
        r1.getArea();
        Circle c1 = new Circle(5);
        c1.getArea();
    }
}
