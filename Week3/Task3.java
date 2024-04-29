package Week3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }
        scanner.close();
    }
}
