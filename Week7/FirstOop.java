package Week7;

public class FirstOop {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "vinayak";
        p1.age = 19;
        p1.address = "Kathmandu";
        p1.gender = 'M';

        p1.greet();

        Person p2 = new Person();
        p2.name = "Ram";
        p2.age = 1;
        p2.address = "Bhaktapur";
        p2.gender = 'M';

        p2.greet();

        Square s1 = new Square();
        s1.side = 5;
        System.out.println(s1.area());
    }
}

class Square {
    double side;

    double area() {
        return side * side;
    }
}

class Person {
    String name;
    int age;
    String address;
    char gender;

    void greet() {
        System.out.println("Name " + name + " Age " + age);
    }

    void sleep() {
        System.out.println("Person in sleeping");
    }
}