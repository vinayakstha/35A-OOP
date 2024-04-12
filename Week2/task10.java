package Week2;

import java.util.*;

public class task10 {
    /*
     * 10. Write a program to calculate the total marks of four subjects of a
     * student and the total percentage secured.
     * And use the following conditions to generate the final result;
     * a. If equal to or more than 70 -> First Class
     * b. If more than 59 -> Upper Second Class
     * c. If more than 49 -> Second class
     * d. If more than 39 -> Third class and if below than 40 the result is fail.
     * Hint: Use ternary operator
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks of math: ");
        int maths = scanner.nextInt();

        System.out.print("Enter marks of english: ");
        int eng = scanner.nextInt();

        System.out.print("Enter marks of science: ");
        int sci = scanner.nextInt();

        System.out.print("Enter marks of nep: ");
        int nep = scanner.nextInt();

        int totalMarks = maths + eng + sci + nep;
        double percentage = (totalMarks / 400.0) * 100;

        String finalResult = (percentage >= 70) ? "first class"
                : (percentage > 59 && percentage < 70) ? "upper second class"
                        : (percentage > 49 && percentage <= 59) ? "second class"
                                : (percentage > 39 && percentage <= 49) ? "third class" : "fail";

        System.out.println(percentage);
        System.out.println(finalResult);
        scanner.close();

    }
}
