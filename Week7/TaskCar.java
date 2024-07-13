package Week7;

public class TaskCar {
    public static void main(String[] args) {
        Car c1 = new Car("david putra 2000cc", "dunia ka papa", "white", 2000);
        // c1.name = "david putra 2000cc";
        // c1.brand = "dunia ka papa";
        // c1.color = "white";
        // c1.year = 2000;
        System.out.println(c1.expiry());
        c1.modify("black");
        c1.start();
        c1.start();
        c1.details();
    }
}

class Car {
    String name, brand, color;
    int year;

    Car(String name, String brand, String color, int year) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    int expiry() {
        return year += 100;
    }

    void modify(String newColor) {
        color = newColor;
    }

    void start() {
        System.out.println(name + " is starting");
    }

    void stop() {
        System.out.println(name + " is stopping");
    }

    void details() {
        System.out.println("name: " + name + "\nbrand: " + brand + "\ncolor: " + color + "\nyear: " + year);
    }
}
