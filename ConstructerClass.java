public class ConstructerClass {
    public static void main(String[] args) {
        ConstructerExample ce = new ConstructerExample(1, "d2");
        System.out.println("after object");

        ConstructerTwo c2 = new ConstructerTwo("vinayak", 99);
        c2.info();
    }
}

class ConstructerTwo {
    private String name;
    private int age;

    ConstructerTwo(String name2, int age2) {
        name = name2;
        age = age2;
    }

    void info() {
        System.out.println(name + " " + age);
    }
}

class ConstructerExample {
    public int data1;
    private String data2;

    ConstructerExample(int d1, String d2) {
        data1 = d1;
        data2 = d2;
        System.out.println("I run while making object");
    }
}
