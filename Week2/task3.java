package Week2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length: ");
        float l = scanner.nextInt();
        System.out.print("enter breadth: ");
        float b = scanner.nextInt();

        float area = l * b;
        float perimenter = 2 * (l + b);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimenter);
        scanner.close();
    }
}
