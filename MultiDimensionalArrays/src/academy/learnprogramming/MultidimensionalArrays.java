package academy.learnprogramming;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        // 1d array
        int[] myArray = new int[] {0, 1};
        // int[] myArray = {0, 1}; // works too

        int[][] array = new int[2][4]; // 2 rows and 4 columns
        int anotherArray[][] = new int[2][4];

        int[] myIntArray[] = new int[2][4]; // this works but bad practice and don't use it

        String[][] my2dArray = new String[][] {
                {"one", "two"}, // 1st row 2 elements
                {"three", "four", "five"}, // 2nd row
                {"six", "seven", "eight", "nine"}, // 3rd row 4 elements
                null // last row is null, works
        }; // need this obviously

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;


        // 3d array
        // pages(planes), rows, columns
        int[][][] threeArray = new int[3][3][3];
        int oneMoreThreeArray[][][] = new int[3][3][3];

        int[][][] anotherThreeArray = new int[3][3][3]; // works but bad practice again

        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
    }
}
