public class Task69 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();

        Circle c = new Circle();
        c.area();
        c.perimeter();

        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }
}

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Rectangle extends Shape {
    double l = 20;
    double b = 30;

    @Override
    double area() {
        return l * b;
    }

    @Override
    double perimeter() {
        return 2 * (l * b);
    }
}

class Circle extends Shape {
    double r = 10;

    @Override
    double area() {
        return 22 / 7 * r * r;
    }

    @Override
    double perimeter() {
        return 2 * 22 / 7 * r;
    }
}

class Triangle extends Shape {
    double b = 10;
    double h = 20;
    double x = 7, y = 8;

    @Override
    double area() {
        return 1 / 2 * b * h;
    }

    @Override
    double perimeter() {
        return x + y + b;
    }
}