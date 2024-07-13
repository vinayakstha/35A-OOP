public class AccessModifier {
    public static void main(String[] args) {
        HumanBeing human = new HumanBeing();
        human.name = "ram";
        // humanphNumber = "32234234";
        human.age = 30;
        // human.showPh();
        human.showName();
        human.showAge();
        human.func();

        human.setPhNumber("9808880750");
        System.out.println(human.getPhNumber());
    }
}

class HumanBeing {
    String name; // automatically default, used within the package/folder
    private String phNumber; // can only be used in this class scope aka HumanBeing
    public int age; // can be used anywhere

    // setter starts with set and continue with variable name
    void setPhNumber(String p) {
        phNumber = p;
    }

    // getter
    String getPhNumber() {
        return phNumber;
    }

    // same in applied in functions
    void showName() {
        System.out.println(name);
    }

    private void showPh() {
        System.out.println(phNumber);
    }

    public void showAge() {
        System.out.println(age);
    }

    void func() {
        System.out.println(phNumber);// private can only be accessed within the class
        showPh(); // same goes to private function
    }

}
