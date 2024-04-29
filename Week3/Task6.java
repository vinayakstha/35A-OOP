package Week3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an alphabet: ");
        String alpha = scanner.nextLine().toLowerCase();// converts to lowercase

        if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || alpha.equals("o") || alpha.equals("u")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
        scanner.close();

    }
}
