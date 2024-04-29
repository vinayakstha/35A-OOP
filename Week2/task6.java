package Week2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println(sum);
        System.out.println(product);
        System.out.println((double) sum / product);
        scanner.close();
    }
}
