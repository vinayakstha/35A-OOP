package Week3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("leap year");
            }
        } else {
            System.out.println("not leap year");
        }
        scanner.close();
    }
}
