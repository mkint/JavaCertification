package academy.learnprogramming;

import java.util.Arrays;

public class UnderstandingArrays {

    public static void main(String[] args) {
        int[] one = new int[3]; // empty array with 3 elements (all 0 when uninitialized)
        int[] two = new int[] {10, 11, 12}; // initialized array with 3 elements

//        double[] a = new double[2.55]; // size must be int DNC
        double[] b = new double[4 * 5 / 2]; // creates array with 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[x * y]; // array with 16 elements (empty)
        int[] three = {10, 11, 12}; // don't need type on right side, this is referred
        // to as an "anonymous array" ^
        int[] four = {}; // empty anonymous array with size of 0 because
        // we didn't specify size or elements
        int[] a1;
        int[] a2;
        int a3[]; // works too, but most people do first thing

        int[] ids, types; // creates 2 arrays, best practice
        int ids2[], types2; // bad practice, creates array and single int
        int ids3[], types3[];

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals; // same ref as animals
        String[] otherAnimals = {"Parrot", "Dog", "Cat"}; // new reference

        System.out.println(animals.equals(myAnimals)); // true, checks reference
        System.out.println(animals == myAnimals); // true
        System.out.println(Arrays.equals(animals, myAnimals)); // true

        System.out.println(animals.equals(otherAnimals)); // false
        System.out.println(animals == otherAnimals); // false
        System.out.println(Arrays.equals(animals, otherAnimals)); // true

        System.out.println(animals); // doesn't print array, but prints object code
        System.out.println(animals.toString()); // same thing as above

        System.out.println(Arrays.toString(animals)); // [Parrot, Dog, Cat]




    }
}
