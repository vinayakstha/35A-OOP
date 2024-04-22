import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("this line breaks.");
        System.out.print("this line will not break");
        System.out.println("this will continue\n");

        // System.out.printf()
        // %s String, % Integer, %f floating point, %b boolean

        System.out.printf("hello %s, Good morning\n", "world");
        System.out.printf("this is a num %d", 10);

        // multiformat
        System.out.printf("both float %f and %b\n", 10.3f, true);

        Scanner scanner = new Scanner(System.in);
        System.out.print("the following takes sentence: ");
        String stringInput = scanner.nextLine();
        System.out.print("the following takes integer: ");
        int intInput = scanner.nextInt();
        System.out.print("the following takes boolean: ");
        boolean boolInput = scanner.nextBoolean();
        scanner.close();
    }
}
