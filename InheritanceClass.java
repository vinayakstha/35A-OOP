public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastName = "Ronaldo";
        cc.firstName = "Cristiano";
        cc.address = "123";
        cc.savings = 2;
        cc.initials();
        cc.info();

        GrandChildClass gc = new GrandChildClass();
        gc.firstName = "lionel";
        gc.middleName = "bottle";
        gc.lastName = "pessi";
        gc.initials();
        gc.detail();
    }
}

class ParentClass {
    String lastName;
    private int salary;
    // the inherited class can use any properties except for private
    // as previously studied private is only class based
    protected int savings;
    public String address;

    void initials() {
        System.out.println("LastName: " + lastName);
    }
}

// extends keyword is used to inherit other class
// single level contains one parent ans one child
class ChildClass extends ParentClass {
    String firstName;

    void info() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

// multilevel inheritance
class GrandChildClass extends ChildClass {
    String middleName;

    void detail() {
        System.out.println("name: " + firstName + " " + middleName + " " + lastName);
    }
}