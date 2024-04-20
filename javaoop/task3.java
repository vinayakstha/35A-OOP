package javaoop;

class Dog {
    private String name, breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public void getDogInfo() {
        System.out.println(this.name + "," + this.breed);
    }
}

public class task3 {
    /*
     * Write a Java program to create a class called "Dog" with a name and breed
     * attribute. Create two instances of the "Dog" class, set their attributes
     * using the constructor and modify the attributes using the setter methods and
     * print the updated values
     */
    public static void main(String[] args) {
        Dog d1 = new Dog("cupcake", "pitbull");
        Dog d2 = new Dog("Destroyer", "chihuahua");
        d1.getDogInfo();
        d2.getDogInfo();
    }
}
