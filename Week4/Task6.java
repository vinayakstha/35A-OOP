package Week4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter width: ");
        int width = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= width; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
