public class Variable {
    /*
     * instance variable needs object to accessed
     * value is not shared
     */
    int instanceVariable = 10;
    /*
     * static variable does not need object to access
     * value is shared among objects
     */
    static int staticVariable = 100;

    public static void main(String[] args) {
        /*
         * premitive datatype
         * already defined in programming language(Java)
         */
        byte byteValue = 100;
        short shortValue = 200;
        int intValue = -199;
        long longValue = 10000;
        float floatValue = 2.15f;
        char charValue = 'l';
        boolean booleanValue = false;

        /*
         * non-primitive datatype
         * not defined by programming language except String
         * combination of primitive datatype
         */
        String stringValue = "this is a string value";
        int[] intArray = new int[5];
        Variable variabeObject = new Variable();

        // use of instance variable with variable object
        System.out.println(variabeObject.instanceVariable);
        // use of static variable with class itself
        System.out.println(Variable.staticVariable);

        // byte defaultByteValue;
        // System.out.println("defult byte value: " + defaultByteValue);
        /*
         * continue all and find the default value of all the
         * primitive datatype
         */
    }
}
