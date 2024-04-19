package Array;

import java.util.Scanner;

public class ArrAvg {
    /* 1. Write a Java program to calculate the average value of array element. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter array elements: ");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = sum / arr.length;
        System.out.println(avg);
        scanner.close();
    }

}
