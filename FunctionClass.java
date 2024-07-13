public class FunctionClass {
    // function should be created in class scope
    void printSomething() {
        System.out.println("this function prints");
    }

    int returnInt() {
        int data = 10;
        return data;
    }

    double returnDouble() {
        return 10.2d;
    }

    // void is considered a datatype that return nothing
    public static void main(String[] args) {
        FunctionClass fc = new FunctionClass();
        fc.printSomething();

        System.out.println(fc.returnInt());

        double d = fc.returnDouble();
        System.out.println(d);
    }
}
