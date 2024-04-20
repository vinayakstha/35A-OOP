package javaoop.inheritance;

class Employee {
    public void work() {
        System.out.println("Employee works");
    }

    public void getSalary() {

    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HRmanager works");
    }
}

public class Task2 {
    /*
     * Write a Java program to create a class called Employee with methods called
     * work() and getSalary(). Create a subclass called HRManager that overrides the
     * work() method.
     */
    public static void main(String[] args) {
        HRManager h1 = new HRManager();
        h1.work();
    }
}
