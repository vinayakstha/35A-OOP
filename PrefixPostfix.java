public class PrefixPostfix {
    public static void main(String[] args) {
        // prefix operator
        int prefixValue = 10;
        System.out.println("prefix value updates the value in this line" + ++prefixValue);
        System.out.println("it remains the same in next line " + prefixValue);

        // postfix operator
        int postfixValue = 20;
        System.out.println("postfix value updates the value in next line " + postfixValue++);
        System.out.println("the value changes in this line " + postfixValue);

        for (int index = 0; index < 4; index++) {
            System.out.println("looping " + index);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println("looping decrement " + i);
        }
    }
}
