public class Condition {
    public static void main(String[] args) {
        /* if statement */
        if (true) {
            System.out.println("true statement");
        }
        // the parenthesis takes an boolean expression
        int num1 = 10, num2 = 20;
        if (num1 == num2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        // Note: else statement is always optional

        // if else if
        if (num1 == num2) {
            System.out.println("equal");
        } else if (num1 < num2) {
            System.out.println("lesser");
        } else if (num1 > num2) {
            System.out.println("greater");
        } else if (num1 != num2) {
            System.out.println("not equal");
        } else if (num1 > 0) {
            System.out.println("positive");
        } else {
            System.out.println("deafult statement");
        }
        if (num1 > 0) {
            if (num1 > num2) {
                System.out.println("positive greater");
            } else {
                System.out.println("positive lesser");
            }
        } else {
            if (num1 > num2) {
                System.out.println("negative greater");
            } else {
                System.out.println("negative lesser");
            }
        }
        // when the condition is matched it will skip all the remaining statement1
    }
}
