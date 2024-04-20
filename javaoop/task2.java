package javaoop;

class SimpleInterest {
    private float p, t, r;

    public void setter(float p, float t, float r) {
        this.p = p;
        this.t = t;
        this.r = r;
    }

    public float getter() {
        float si = (p * t * r) / 100;
        return si;
    }
}

public class task2 {
    /*
     * 2. Write a Java program to create a class called “Simple Interest” with a
     * data fields principle, time and rate, using setter getter method and print
     * the values.
     */
    public static void main(String[] args) {
        SimpleInterest si1 = new SimpleInterest();
        si1.setter(1000, 2, 10);
        System.out.println(si1.getter());
    }
}
