public class Inh {
    public static void main(String[] args) {
        Labrader sagar = new Labrader();
        sagar.color = "black";
        sagar.size();
        sagar.barks();
    }
}

class Animal {
    String Name;

    void speak() {
        System.out.println("animal sound");
    }
}

class Mammal extends Animal {
    int legs;

    void fur() {
        System.out.println("i have fur");
    }
}

class Reptile extends Animal {
    int eggs;

    void shed() {
        System.out.println("I shed");
    }
}

class Dog extends Mammal {
    String diet;

    void barks() {
        System.out.println("barks");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("meow");
    }
}

class Labrader extends Dog {
    String color;

    void size() {
        System.out.println("small");
    }
}

class GermanShepard {
    String bread;

    void spotted() {
        System.out.println("spotted");
    }
}

class Amphibian {
    String gills;

    void breathe() {
        System.out.println("breathe");
    }
}