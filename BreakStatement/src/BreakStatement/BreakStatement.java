package BreakStatement;

import java.sql.SQLOutput;

public class BreakStatement {

    public static void main(String[] args) {
        // labels aren't really good practice
        // can be added to
        // code blocks {}
        // looping statements
        // conditional statements
        // expressions
        // assignments
        // return statements
        // try blocks
        // throw statements

        // *** break statements always break the inner most loop
        // brings control back to whatever loop it is a part of

//        myLabel:
//        int[] myArray = {1, 2, 3}; // DNC can't be in declarations

        myLabel: {
            int[] myArray = {1, 2, 3}; // not good practice but it compiles
            // this is local to the code block obviously
        }

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for(String animal : animals) {
            System.out.println(animal);
        }

        // we can use break statements with
        // for, for each, while, do while loops
        // labels are optional
        MY_LOOP: for(String animal: animals) {
            if(animal.equals("Cat")) {
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        animal: for(String animal: animals) {
            if(animal.equals("Cat")) {
                break animal;
            }
            System.out.println(animal);
        }

        for(String animal : animals) {
            if(animals.equals("Lizard")) {
                break;
            }
            System.out.println(animal);
        }

        int index = 0;
        while(index < animals.length) {
            String animal = animals[index];

            if(animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;
        }
    }
}
