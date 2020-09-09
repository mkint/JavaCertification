package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray(); // but doesn't keep String type
        System.out.println(namesArray.length);

        String[] stringArray = names.toArray(new String[0]); // keeps String type, it'll resize for you but do the next line instead
        String[] anotherStringArray = names.toArray(new String[names.size()]); // best practice

        String[] petsArray = {"dog", "cat", "parrot"};
//        List<String> petsList = Arrays.asList(petsArray);

        // the above 2 lines as one line
        List<String> petsList = Arrays.asList("dog", "cat", "parrot");
        // returns fixed size list
        System.out.println(petsList.size());

        petsList.set(0, "bird"); // effects both below
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "husky"; // effects both below too
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

//        petsList.add("newDog"); // Unsupported exception since this was returned a FIXED SIZE LIST
        // same with remove or other editing sized operations

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list);
//        list.add("four"); // unsupported again since it is a fixed size list





    }
}
