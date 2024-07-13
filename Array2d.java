public class Array2d {
    public static void main(String[] args) {
        int[] oneDArray;
        int[][] twoDArray;
        int[][][] therrDArray;

        twoDArray = new int[2][3];
        // the first two is the number of array inside twoDArray
        // the second 3 is the number of value/length of inner Array
        /*
         * [
         * [0,0,0]
         * [0,0,0]
         * ]
         */
        twoDArray[0][0] = 100;
        twoDArray[0][1] = 200;
        twoDArray[1][2] = -100;
        twoDArray[1][1] = 100;
        int arrayValue = twoDArray[0][0];
        System.out.println(twoDArray[0][1]);

        int[][] arr1 = new int[5][2];
        arr1[4][0] = -10;
        arr1[4][1] = -20;
        System.out.println(arr1[4][0]);
        System.out.println(arr1[4][1]);

    }
}
