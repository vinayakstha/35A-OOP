package Week7;

public class Task {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        r1.info();
    }
}

class Rectangle {
    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void info() {
        System.out.println("Length: " + length + "\nBreadth: " + breadth);
    }
}
