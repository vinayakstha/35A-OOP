public class Forloop {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("2 x " + i + " = " + 2 * i);
        // }

        // nested loop
        // for (int outer = 0; outer < 2; outer++) {
        // for (int inner = 2; inner > 0; inner--) {
        // System.out.println("inner " + inner);
        // }
        // System.out.println("outer " + outer);
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
