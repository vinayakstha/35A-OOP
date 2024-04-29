package Week3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        scanner.close();
    }
}
