package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

    public static void main(String[] args) {
        // sorting array list or list
        List<String> numsList = new ArrayList<>();
        numsList.add("50");
        numsList.add("10");
        numsList.add("9");
        numsList.add("500");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);
        // [10, 40, 50, 500, 9]

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        // sort arrays with Arrays class
        // collections sorts with collections (arraylist and list)





    }
}
