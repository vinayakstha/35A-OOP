public class ArrayClass {
    public static void main(String[] args) {
        int[] myFirstArray;
        myFirstArray = new int[2];
        int[] mySecondArray = new int[3];
        int[] myThirdArray = { 10, 20, 30, 40, 50 };
        int myThirdArrayLength = myThirdArray.length;
        System.out.println("third array has " + myThirdArrayLength);

        int[] arrayExample = new int[5];
        arrayExample[0] = 10;
        arrayExample[1] = 20;
        System.out.println(arrayExample[0]);

        int[] myFifthArray = new int[4];
        myFifthArray[0] = -40;
        myFifthArray[1] = -50;
        myFifthArray[2] = -60;
        myFifthArray[3] = -70;

        System.out.println(myFifthArray[0] + " " + myFifthArray[1] + " " + myFifthArray[2] + " " + myFifthArray[3]);

        for (int i = 0; i < 4; i++) {
            System.out.print(myFifthArray[i] + (-100));
            if (i < 3) {
                System.out.print(",");
            }
        }
    }
}
