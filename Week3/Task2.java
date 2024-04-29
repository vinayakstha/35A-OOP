package Week3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        scanner.close();
    }
}
