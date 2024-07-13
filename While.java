import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("enter a number: ");
            input = scanner.nextInt();
        } while (input > 0);
        scanner.close();
    }
}
