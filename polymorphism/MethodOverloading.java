package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {

    }
}

class MathOperation {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    // method overloading
    // 1. same function with different in number of parameter
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // 2. same function with different in datatype
    double add(double num1, double num2) {
        return num1 + num2;
    }

    double add(double num1, int num2) {
        return num1 + num2;
    }
    // illegal operation
    // 1. overloading look for the parameter sata type not the variable name
}
