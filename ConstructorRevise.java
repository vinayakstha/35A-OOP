public class ConstructorRevise {
    public static void main(String[] args) {
        ParamConstructor pc = new ParamConstructor("Kathmandu", "9000000000", 'M');
        System.out.println(pc.getGender());
    }
}

class ParamConstructor {
    String address;
    private String phNo;
    private char gender;

    ParamConstructor(String address, String phNo, char gender) {
        System.out.println("this also runs when creating object");
        this.address = address;
        this.phNo = phNo;
        this.gender = gender;
    }

    char getGender() {
        return this.gender;
    }
}

class NonParanConstructor {
    String name;
    private int age;

    // non parameterized constructor does not take any argument/parameters
    NonParanConstructor() {
        System.out.println("runs when creating objectd");
        // can be used to set defunlt value
        this.age = 20;
        this.name = "Default name";
    }
}
