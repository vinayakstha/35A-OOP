package Array;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 7, 8, 9, 4 };
        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
