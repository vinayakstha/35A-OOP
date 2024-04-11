package Week2;

import java.util.Scanner;

public class task2 {
    /*
     * 2. Write a program to calculate SI.
     * Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
     */
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter time: ");
        int time = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter rate: ");
        int rate = scanner3.nextInt();

        int simpleInterest = (amount * time * rate) / 100;
        System.out.println(simpleInterest);
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}