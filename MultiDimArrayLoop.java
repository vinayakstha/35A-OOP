public class MultiDimArrayLoop {
    public static void main(String[] args) {
        int[][] arrayTwo = {
                { 10, -10 },
                { 20, -20 },
                { 30, -30 }
        };
        int arrayTwoLength = arrayTwo.length;
        for (int outer = 0; outer < arrayTwoLength; outer++) {
            int innerLength = arrayTwo[outer].length;
            for (int inner = 0; inner < innerLength; inner++) {
                System.out.println(arrayTwo[outer][inner]);
            }
        }
        String[][] arrayOne = {
                { "sagarGayGod", "vinayakSigma", "sagarGay" },
                { "sagarTheRealGay", "sagarGayy", "sagarChakka" },
                { "sugarGay", "heroVinayak", "sagarThey/Them" }
        };
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                if (arrayOne[i][j].equals("sagarGayy")) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
