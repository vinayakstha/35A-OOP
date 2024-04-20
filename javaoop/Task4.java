package javaoop;

class Employee {
    private String name, jobTitle;
    private int salary;

    public void setInfo(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getInfo() {
        return salary;
    }
}

public class Task4 {
    /*
     * 4. Write a Java program to create a class called "Employee" with a name, job
     * title, and salary attributes, and methods to calculate and update salary.
     */
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setInfo("vinayak", "ceo", 1);
        System.out.println(e1.getInfo());
    }
}
