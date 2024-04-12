package Week4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("hello " + name);
        }
        scanner.close();
    }
}
