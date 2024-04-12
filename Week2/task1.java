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

        String a = age >= 18 ? "eligible" : "not eligible";
        System.out.println(a);
        scanner.close();
    }
}