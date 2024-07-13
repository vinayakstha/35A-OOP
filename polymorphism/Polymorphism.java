package polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.makeShape();
        Oval o = new Oval();
        o.makeShape();

        Student s1 = new Student();
        s1.information();
        s1.information(19.5);
        s1.information("xyz", "abc");

    }
}

class Shape {
    void makeShape() {
        System.out.println("making shape");
    }
}

class Oval extends Shape {
    @Override
    void makeShape() {
        System.out.println("making oval");
    }
}

class Student {
    void information() {
        System.out.println("student without information without params");
    }

    void information(int age) {
        System.out.println("student age is: " + age);
    }

    void information(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    String information(double age) {
        return "Student age as double is" + age;
    }
}