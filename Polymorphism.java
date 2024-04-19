class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method overloading
    public void getInfo(String name) {
        System.out.println(this.name);
    }

    public void getInfo(int age) {
        System.out.println(this.age);
    }

    public void getInfo(String name, int age) {
        System.out.println(this.name + "," + this.age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Vinayak", 19);
        s1.getInfo(s1.age);
        s1.getInfo(s1.name);
        s1.getInfo(s1.name, s1.age);
    }
}