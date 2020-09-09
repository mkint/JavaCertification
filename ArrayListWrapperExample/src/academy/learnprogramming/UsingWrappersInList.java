package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {

    public static void main(String[] args) {
//        List<double> doubleList = new ArrayList<>(); DNC cant use primitives
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.10)); // boxing, but unnecessary since java will auto box if we
        // just type 55.10
        doubleList.remove(55.10); // autoboxing
        double first = doubleList.get(0); // unboxing to primitive

        System.out.println(doubleList);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        System.out.println(numbers); // [null]

//        int number = numbers.get(0); // null pointer exception
        // ^ since primitives cannot hold null (but wrappers can)

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.remove(1); // removes at INDEX 1
        System.out.println(nums); // prints [1]

        nums.add(2);

        nums.remove(new Integer(1));
        System.out.println(nums); // removes object with value of 1, so prints [2]




    }
}
