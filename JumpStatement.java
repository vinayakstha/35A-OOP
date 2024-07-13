public class JumpStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("index " + i);
        }
        System.out.println("this will execute after loop ends/break");

        int count = 0;
        while (count <= 3) {
            if (count == 2) {
                break;
            }
            System.out.println("while counter " + count);
            count++;
        }
        System.out.println("this will execute after while loop ends/break");
    }
}
