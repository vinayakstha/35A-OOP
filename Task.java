import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks of 3 subjects: ");
        float sci = scanner.nextFloat();
        float maths = scanner.nextFloat();
        float eng = scanner.nextFloat();

        float average = (sci + maths + eng) / 3;
        System.out.println(average);

        if (sci < 35 || maths < 35 || eng < 35) {
            System.out.println("fail");
        } else if (average < 60) {
            System.out.println("third div");
        } else if (average < 70) {
            System.out.println("secind div");
        } else if (average < 80) {
            System.out.println("1st div");
        } else if (average > 80) {
            System.out.println("distinction");
        } else if (average < 0 || average > 100) {
            System.out.println("invalid marking");
        }

        scanner.close();

    }
}
