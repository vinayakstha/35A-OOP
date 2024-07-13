public class ExceptionHandeling {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int num1 = 10;
        try {
            System.out.println(num1 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("end of exception handeling");
        }

        // array index out of bound
        int a[] = new int[2];
        try {
            a[100] = 200;
        } catch (Exception ex) {
            System.out.println("array index out of bound");
        }

        // nullpointer
        String data = null;
        try {
            System.out.println(data.length());
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        }

        System.out.println("program end");
    }
}
