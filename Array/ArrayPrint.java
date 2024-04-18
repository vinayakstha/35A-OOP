package Array;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            } else if (i == arr.length - 1) {
                System.out.print("]");
            }
        }
    }
}
