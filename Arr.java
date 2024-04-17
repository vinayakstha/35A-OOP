import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size of your array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("enter array elements: ");
            arr[i] = scanner.nextInt();
        }

        // print array element
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i != (size - 1)) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }

        // print the index of the given element
        System.out.print("enter element to get index: ");
        int element = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                System.out.println("the index is: " + i);
            }
        }

        scanner.close();
    }
}