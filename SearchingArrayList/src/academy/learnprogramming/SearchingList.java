package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {

    public static void main(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index); // undefined/not sorted (but works but we say undefined)

        Collections.sort(numsList);
        System.out.println(numsList);
        index = Collections.binarySearch(numsList, "10");
        System.out.println(index); // 0
        index = Collections.binarySearch(numsList, "9");
        System.out.println(index); // 4

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);

        index = Collections.binarySearch(numbers, 7);
        System.out.println(index); // undefined/meaningless value not sorted

        Collections.sort(numbers);
        System.out.println(numbers);

        index = Collections.binarySearch(numbers, 7);
        System.out.println(index); // 3
        









    }
}
