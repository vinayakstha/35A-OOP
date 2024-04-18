package Array;

import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int arraySize = scanner.nextInt();

        // creating an array
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter array elements: ");
            int arrayElement = scanner.nextInt();
            arr[i] = arrayElement;
        }

        // sum of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum of the array is: " + sum);
        scanner.close();
    }
}