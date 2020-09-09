package academy.learnprogamming;

import java.util.Arrays;

public class SearchingArrays {

    public static void main(String[] args) {
        // binary search rules:
        // --------------------
        // Scenario                         Result
        // Element found (sorted array)     Index of element that was found
        // Element not found (sorted array) Negative value, showing 1 smaller than the negaive of index, where a match needs to be inserted to preserve sorted order
        // Unsorted array                   Result not predictable/undefined result


        // on exam you don't need to know what a binary search is (just that it searches the array)
        // but you have to know what the method returns in those 3 different scenarios above
        // don't worry about the algorithm
        // array has to be sorted for binary search
        // ^ otherwise it will get an undefined result

        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2)); // -2 (means it is not in there, and should be inserted at spot 2
        System.out.println(Arrays.binarySearch(numbers, 5)); // 2
        System.out.println(Arrays.binarySearch(numbers, 7)); // 4
        System.out.println(Arrays.binarySearch(numbers, 1)); // 0
        System.out.println(Arrays.binarySearch(numbers, 3)); // 1
        System.out.println(Arrays.binarySearch(numbers, 6)); // 3
        System.out.println(Arrays.binarySearch(numbers, 4)); // -3 (means it is not in the array and should be inserted at spot 3

        int[] notSortedNumbers = {5, 4, 10, 8, 6};

        System.out.println(Arrays.binarySearch(notSortedNumbers, 5)); // 0 unpredictable result
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); // -3 unpredictable result

        Arrays.sort(notSortedNumbers);
        System.out.println(Arrays.toString(notSortedNumbers)); // [4, 5, 6, 8, 10]

        System.out.println(Arrays.binarySearch(notSortedNumbers, 5)); // 1
        System.out.println(Arrays.binarySearch(notSortedNumbers, 8)); // 3
        






    }
}
