package practice;

abstract class BasicShape {
    float length, breadth, radius;

    BasicShape(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    BasicShape(float radius) {
        this.radius = radius;
    }

    public abstract float area();

    public abstract float perimeter();

    public abstract float shapeProperty();
}

class Circle extends BasicShape {
    Circle(float radius) {
        super(radius);
    }

    @Override
    public float area() {
        float area = (22 / 7) * this.radius * this.radius;
        return area;
    }

    @Override
    public float perimeter() {
        float peri = 2 * (22 / 7) * this.radius;
        return peri;
    }

    @Override
    public float shapeProperty() {
        float diameter = 2 * this.radius;
        return diameter;
    }
}

class Square extends BasicShape {
    Square(float length, float breadth) {
        super(length, breadth);
    }

    @Override
    public float area() {
        float area = length * breadth;
        return area;
    }

    @Override
    public float perimeter() {
        float perimeter = 4 * length;
        return perimeter;
    }

    @Override
    public float shapeProperty() {
        return length;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5f);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.shapeProperty());
    }
}