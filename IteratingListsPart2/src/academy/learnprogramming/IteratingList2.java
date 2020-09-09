package academy.learnprogramming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

    public static void main(String[] args) {
        // if i just need to print, use for loop
        // if i need to just remove elements forward, use iterator
        // if i need to set, go backward, set, remove.. use list iterator
        List<String> list = Arrays.asList(createArray());


        // measure for loop
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totalTime= " + totalTime + " ms");

        // measure for each
        startTime = System.currentTimeMillis();

        // when for each loop gets compiled it looks like this
        // it is basically the same as using iterator, but we don't have access to its iterator
//        String str;
//        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next()) {};

        for(String temp : list) {}

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for each loop totalTime= " + totalTime + " ms");

        // iterator
        startTime = System.currentTimeMillis();

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime= " + totalTime + " ms");


        // list iterator
        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator totalTime= " + totalTime + " ms");
    }


    private static String[] createArray() {
        String[] stringArray = new String[10_000_000];

        for(int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }

        return stringArray;
    }
}