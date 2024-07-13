package Week4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter width: ");
        int width = scanner.nextInt();
        scanner.close();

        for (int i = width; i >= 1; i--) {
            for (int j = width; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
