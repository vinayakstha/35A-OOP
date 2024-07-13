public class Jump {
    public static void main(String[] args) {
        // if the number is positive end the loop
        for (int i = -5; i <= 5; i++) {
            if (i > 0) {
                break;
            }
            System.out.println(i);
        }

        // print the even number from 0 to 20
        for (int j = 1; j <= 20; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.println(j);
        }
    }
}
