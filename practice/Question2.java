package practice;

import java.util.Scanner;

public class Question2 {
    static int[] arr = new int[10];// static variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter array elements: ");
            arr[i] = scanner.nextInt();
        }
        findMax();
        System.out.println(indexOfLargest());
        scanner.close();

    }

    public static void findMax() {
        int maxValue = arr[0];
        for (int elements : arr) {
            if (elements > maxValue) {
                maxValue = elements;
            }
        }
        System.out.println(maxValue);
    }

    public static int indexOfLargest() {
        int largestIndex = 0;
        int max = arr[0];
        int i;
        for (i = largestIndex; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

}
