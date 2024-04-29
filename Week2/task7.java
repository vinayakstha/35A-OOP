package Week2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = scanner.nextLine();

        System.out.println("enter rollno: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter field of interest: ");
        String interest = scanner.nextLine();

        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNo
                + ". My field of interest are " + interest);
        scanner.close();
    }
}
