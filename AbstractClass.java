public class AbstractClass {
    public static void main(String[] args) {
        Nokia n = new Nokia();
        System.out.println(n.delivery("nokia message delivered"));
        n.message();

        Samsung s = new Samsung();
        System.out.println(s.delivery("samsung message delivered"));
        s.message();

        Apple a = new Apple();
        System.out.println(a.delivery("apple message delivered"));
        a.message();
    }
}

abstract class SmartPhone {
    abstract void call();

    abstract void message();

    abstract String delivery(String text);
}

class Nokia extends SmartPhone {
    @Override
    void call() {
        System.out.println("nokia calling");
    }

    @Override
    void message() {
        System.out.println("nokia messaging");
    }

    @Override
    String delivery(String text) {
        return text;
    }
}

class Samsung extends SmartPhone {
    @Override
    void call() {
        System.out.println("samsung calling");
    }

    @Override
    void message() {
        System.out.println("samsung message");
    }

    @Override
    String delivery(String text) {
        return text;
    }
}

class Apple extends SmartPhone {
    @Override
    void call() {
        System.out.println("Apple calling");
    }

    @Override
    void message() {
        System.out.println("Apple message");
    }

    @Override
    String delivery(String text) {
        return text;
    }
}
