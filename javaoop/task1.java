package javaoop;

class Circle {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRaduis(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        float area = 22 / 7 * (radius * radius);
        System.out.println(area);

    }
}

public class task1 {
    /*
     * 1. Write a Java program to create a class called "Circle" with a radius
     * attribute.
     * You can access this attribute using setter and getter method.
     * Calculate the area and circumference of the circle.
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println(c1.getRadius());
        c1.setRaduis(5);
        System.out.println(c1.getRadius());
        c1.calculateArea();
    }
}
