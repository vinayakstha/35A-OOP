package polymorphism;

public class Poly {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println(g.calculateArea(10));
        System.out.println(g.calculateArea(10, 20));
        System.out.println(g.calculateArea(20, 30, true));
    }
}

class Geometry {
    double calculateArea(double radius) {
        return 22 / 7 * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }
}
