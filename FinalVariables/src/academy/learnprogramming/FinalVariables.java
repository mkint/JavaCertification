package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>(); // we can call methods on this but cannot assign it to a new object

    public static void main(String[] args) {
        // finals are constants
        int[] myArray = new int[SIZE];

//        SIZE = 11; // DNC - final values cannot be changed
        int doubleSize = 2 * SIZE;

        for(int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("changed");
//        VALUES = new ArrayList<>(); // DNC cannot point to new object on finals

        final int myNumber = 10;
//        myNumber = 11; // DNC
        



    }
}
