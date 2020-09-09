package academy.learnprogramming;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {
        for(int hours = 1; hours <= 6; hours++) {
            for(int minutes = 0; minutes < 60; minutes++)
                System.out.println(hours + ":" + minutes);
        }

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(myArray); //[[I@1b6d3586
        System.out.println(Arrays.toString(myArray)); //[[I@4554617c, [I@74a14482, [I@1540e19d]

        OUTER:
        for(int[] rowArray: myArray) {
            INNER:
            for(int i = 0; i < rowArray.length; i++) {
                if(rowArray[i] % 2 == 0) {
//                    break INNER;
                    continue INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        int x = 10;
        while(x > 0) {
            // 10,4,2
            do{
                x -= 1;
                // 9,8,7,6,5,3,1
            } while (x > 5);

            x--;
            System.out.println(x); // 4,2,0
        }
        for(int row = 1; row <= 3; row++)
            for(int col = 1; col <= 2; col++) {
                System.out.println(row + " " + col);
            }
        int[][] java = new int[5][];
        for (int i = 0; i < java.length; i++) {
            java[i] = new int[10];
            System.out.print(i + ": ");
            for(int j = 0; j < java[i].length; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        int[] random = {6, -4, 12, 0, -10};
        int pick = 12;
        int result = Arrays.binarySearch(random, pick);
        System.out.println(result);

        switch (8) {
            default:
                System.out.println("default");
            case 0:
            case 1:
                for (int x2: new int[5]) {

                }
                System.out.println("test");
            case 2:
                System.out.println("test2");
        }

    }


}
