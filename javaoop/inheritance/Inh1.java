package javaoop.inheritance;

class Animal {
    String name, sound;

    Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getSound() {
        System.out.println(this.sound);
    }
}

class Dog extends Animal {
    Dog(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void getSound() {
        System.out.println("the dog barks");
    }
}

public class Inh1 {
    public static void main(String[] args) {
        Dog d1 = new Dog("chihuahua", "barks");
        d1.getSound();
        d1.getName();
    }
}
