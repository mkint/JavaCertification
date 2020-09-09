package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("dog");
        list.add(5);

        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);

        pets.add(0, "cat");
        System.out.println(pets);

//        pets.add(5); // DNC can't add int to String list
        pets.add(1, "parrot");
        pets.add(0, "husky");
        pets.add(1, "bird");
        System.out.println(pets);
        // [husky, bird, cat, parrot, dog]

        // remove
        pets.remove("parrot");
        System.out.println(pets);

        pets.remove(2);
        System.out.println(pets);

        pets.set(0, "newBird");
        System.out.println(pets);

        pets.set(6, "myDog"); // out of bounds exception
        










    }
}
