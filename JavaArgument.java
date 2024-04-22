public class JavaArgument {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("provide args");
            return;
        }
        System.out.println("firstargs " + args[0]);
        System.out.println("secondargs " + args[1]);
        int parsedValuse = Integer.parseInt(args[1]);
    }
}
