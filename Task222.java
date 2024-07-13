public class Task222 {
    public static String monthCalculator(int num) {
        String[] arr = { "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec" };
        return arr[num];
    }

    public static void main(String[] args) {
        System.out.println(monthCalculator(1));
    }
}
