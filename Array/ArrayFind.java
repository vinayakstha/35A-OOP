package Array;

import java.util.Scanner;

public class ArrayFind {
    /* 2. Write a Java program to test if an array contains a specific value */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter the element of array: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("enter element to find: ");
        int find = scanner.nextInt();
        for (int element : arr) {
            if (element == find) {
                System.out.println("element found");
            }
        }
        scanner.close();
    }
}
