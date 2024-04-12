package Week2;

import java.util.Scanner;

public class task9 {
    /*
     * 9. Ask user to give two double input for length and breadth of a rectangle
     * and
     * print area type casted to int.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length: ");
        double length = scanner.nextDouble();

        System.out.print("enter breadth: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println((int) area);

        scanner.close();
    }
}
