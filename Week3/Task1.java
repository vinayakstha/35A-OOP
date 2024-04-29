package Week3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the greatest number");
            } else {
                System.out.println(num3 + " is the greatest number");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is the greatest number");
            } else {
                System.out.println(num3 + " is the greatest number");
            }
        }
        scanner.close();
    }
}
