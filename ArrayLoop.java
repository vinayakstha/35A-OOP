public class ArrayLoop {
    public static void main(String[] args) {
        // int[] arrayExample = { 20, 40, 60, 80, 100, 120 };
        // int arrayExampleLength = arrayExample.length;
        // for (int i = 0; i < arrayExampleLength; i++) {
        // System.out.println("index " + i + " value " + arrayExample[i]);
        // }

        // for (int i = arrayExampleLength - 1; i >= 0; i--) {
        // System.out.println("index " + i + " value " + arrayExample[i]);
        // }

        // int[] arr = { -10, -20, -30, -40 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(-arr[i]);
        // }

        String[] names = { "Ram", "Shyam", "John", "Doe" };
        String finder = "John";

        for (int i = 0; i < names.length; i++) {
            if (names[i] == finder) {
                System.out.println(i);
                break;
            }
        }

    }
}
