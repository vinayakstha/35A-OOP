import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // while takes condition/boolean expression in ()
        int count = 0;
        while (count <= 5) {
            System.out.println("while iteration " + count);
            ++count;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int intInput = scanner.nextInt();
        while (intInput < 0 || intInput > 100) {
            System.out.println("please enter a number between 0-100");
            intInput = scanner.nextInt();
        }
        System.out.println("condition 0-100 number " + intInput);
        scanner.close();
        int num1 = 0;
        while (num1 < 0) {
            System.out.println("this will not execute");
        }
        do {
            System.out.println("this will execute");
        } while (num1 < 0);
    }
}
