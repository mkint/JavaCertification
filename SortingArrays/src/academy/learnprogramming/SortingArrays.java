package academy.learnprogramming;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        // these sorting methods
        // are called "Utility Methods"
        // and they are in the Arrays class
        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println(numbers); // pritns mem address
        System.out.println(Arrays.toString(numbers)); // [2, 5, 10]

        String[] strings = {"50", "9", "500"};
        Arrays.sort(strings);

        System.out.println(Arrays.toString(strings)); // [50, 500, 9] (because it sorted the strings, not ints, so its alphabetical sort
        
    }
}
