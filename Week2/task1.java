package Week2;

import java.util.Scanner;

public class task1 {
    /*
     * 1. Write a program to check whether a person can cast a vote or not.
     * The condition is you must be over 18 years old to vote.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible");
        }
        scanner.close();
    }
}