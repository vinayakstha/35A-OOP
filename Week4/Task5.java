package Week4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            int sum = 0;
            System.out.print("enter a positive non-zero integer: ");
            int num = scanner.nextInt();
            for (int i = num; i >= 1; i--) {
                sum += i;
            }
            System.out.println(sum);
            System.out.print("do you want to continue? Enter 'y' for yes or any other character for no.");
            choice = scanner.nextLine();
        } while (choice.equals("y"));
        scanner.close();
    }
}
