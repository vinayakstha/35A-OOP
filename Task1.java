public class Task1 {
    public static String eligibleTest(String name, int age) {
        if (age < 0 || age > 200) {
            return "invalid age";
        } else if (age < 18) {
            return "hello " + name + ", you are ineligible";
        } else {
            return "congratulations " + name + ", you are eligible";
        }
    }

    public static void main(String[] args) {
        System.out.println(eligibleTest("Vinayak", 19));
    }
}
