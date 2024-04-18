package Array;

import java.util.Scanner;

public class ArrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array length: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter array element: ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
                if (i != arr.length - 1) {
                    System.out.print(",");
                } else {
                    System.out.println("]");
                }
            }

        }
        scanner.close();
    }
}
