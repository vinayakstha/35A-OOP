package Week2;

import java.util.Scanner;

public class task2 {
    /*
     * 2. Write a program to calculate SI.
     * Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        System.out.print("Enter time: ");
        int time = scanner.nextInt();

        System.out.print("Enter rate: ");
        int rate = scanner.nextInt();

        int simpleInterest = (amount * time * rate) / 100;
        System.out.println(simpleInterest);
        scanner.close();
    }
}