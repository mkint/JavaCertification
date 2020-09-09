package academy.learnprogramming;

import java.util.*;

public class IteratingList1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
//            numbers.remove(i);
        }

        for (Integer number : numbers) {
            System.out.println("number= " + number);
//            numbers.remove(2); // concurrent modification exception
            // cannot remove and iterate at the same time in foreach
        }

        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }

        System.out.println(numbers);


        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        // list iterator has more methods than iterator
        // just use for loop unless you need to modify the list
        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());
            listIterator.remove();
        }
        // started at 3 then got all the previous ones
        System.out.println(numbers); // [4, 5, 6]







    }
}
