import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = scanner.nextLine();

        System.out.print("over 18? ");
        boolean status = scanner.nextBoolean();

        System.out.print("how many siblings? ");
        int siblings = scanner.nextInt();

        System.out.println("hello " + name);
        System.out.println("over 18? " + status);
        System.out.println("you have " + siblings + " number of siblings.");
        scanner.close();
    }
}
