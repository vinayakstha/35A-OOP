package Week2;

import java.util.*;

public class task5 {
    /*
     * 5. Write a program to take two integer inputs from the user and print the sum
     * and product of them.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("enter another number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("the sum is " + sum);
        System.out.println("the product is " + product);
        scanner.close();
    }
}