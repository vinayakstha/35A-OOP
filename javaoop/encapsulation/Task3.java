package javaoop.encapsulation;

class Student {
    private String sName;
    private int sID;
    private float sGpa;

    Student(String sName, int sID, float sGpa) {
        this.sName = sName;
        this.sID = sID;
        this.sGpa = sGpa;
    }

    public String getName() {
        return this.sName;
    }

    public int getID() {
        return this.sID;
    }

    public float getGPA() {
        return sGpa;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public void setID(int sID) {
        this.sID = sID;
    }
}

public class Task3 {
    /*
     * 3. You are working on a student information system and need to create a
     * Student class. The student class should have private instance variables for
     * the student's name, ID number, and grade point average (GPA). Implement
     * getter and setter methods for the name and ID number, ensuring that they can
     * be accessed and modified only through these methods. However, the GPA should
     * be read-only and can only be set within the class constructor.
     */
    public static void main(String[] args) {
        Student s1 = new Student("Vinayak", 10, 4.00f);
        System.out.println(s1.getGPA());
    }
}
