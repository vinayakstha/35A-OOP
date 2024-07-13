public class StaticFunction {
    public static int returnAdd(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String vendingMachine(int menu) {
        if (menu == 1) {
            return "coke";
        }
        if (menu == 3) {
            return "frooti";
        }
        return "invalid input";
    }

    public static void main(String[] args) {
        int returnValue = returnAdd(10, 20);
        System.out.println(returnValue);

        String iGet = vendingMachine(1);
        System.out.println(iGet);
    }
}
