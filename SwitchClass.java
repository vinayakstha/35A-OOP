public class SwitchClass {
    public static void main(String[] args) {
        char charValue = 'b';
        int intValue = 10;
        switch (charValue) {
            case 'a':
                System.out.println("apple");
                break;
            case 'b':
                switch (intValue) {
                    case 10:
                        System.out.println("ten");
                        break;
                    case 20:
                        System.out.println("twenty");
                        break;
                }
                System.out.println("ball");
                break;
            case 'c':
                System.out.println("cat");
                break;
            case 'd':
                System.out.println("dog");
                break;

            default:
                System.out.println("no word found");
                break;
        }
        int int1 = 2;
        switch (int1) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}
