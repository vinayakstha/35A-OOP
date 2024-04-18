public class OperatorClass {
    public static void main(String[] args) {
        /* arithematic operator */
        int num1 = 10, num2 = 20;
        int sum = num1 + num2;// here + is an arithimetic operator
        System.out.println("num1 + num2 is " + sum);
        System.out.println("num1 - num2 is " + (num1 - num2));
        System.out.println("num1 x num2 is " + (num1 * num2));
        System.out.println("num1 / num2 is " + (num1 / num2));
        System.out.println("num1 % num2 is " + (num1 % num2));

        // assignment operator
        int aNum1 = 200;// = is an assignment operator
        System.out.println(aNum1);
        System.out.println("aNum1+=can be " + (aNum1 += 2));
        System.out.println("aNum1-=can be " + (aNum1 -= 10));
        System.out.println("aNum1*=can be " + (aNum1 *= 3));
        System.out.println("aNum1/=can be " + (aNum1 /= 3));
        System.out.println("aNum1%=can be " + (aNum1 %= 2));

        // relational operator
        int rnum1 = 20, rnum2 = 21;
        boolean rExpression = rnum1 == rnum2;
        System.out.println("is the rnum1 equal to rnum2 " + rExpression);
        System.out.println("is the rnum1 greater than rnum2 " + (rnum1 > rnum2));
        System.out.println("is the rnum1 less or equal to rnum2 " + (rnum1 <= rnum2));
        System.out.println("is the rnum1 not equal to than rnum2 " + (rnum1 != rnum2));

        // logical operator
        boolean roperator1 = false, roperator2 = true;
        System.out.println("roperator1 && roperator2 " + (roperator1 && roperator2));
        System.out.println("roperator1 or roperator2 " + (roperator1 || roperator2));
        System.out.println("not roperator2 " + (!roperator2));

        // unary operator
        int uNum1 = 10;
        uNum1++;// equivalent to unum1=uNum1+1and changes the value from next line
        ++uNum1;// equivalent to unum1 =unum2+1 and changes the value in this line
        System.out.println(uNum1);

        // ternary operator
        int a = 10, b = 20;
        /*
         * here ternary operator takes expression? true statement:false statement
         * if the expression is true it takes the statement after the ?
         * if the expression is false it takse the statement afte the :
         */
        String output = a > b ? "true statement" : "false statement";
        System.out.println(output);
    }
}
