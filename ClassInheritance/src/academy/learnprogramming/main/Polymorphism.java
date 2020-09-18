package academy.learnprogramming.main;

import academy.learnprogramming.*;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Rex");

        Dog dog = husky; // upcasting--another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky;
        System.out.println("tailLength= " + hasTail.getTailLength());

        CanRun canRun = husky;
        Animal animal = husky;
        animal.printDetails();

        Object object = husky;

//        dog.printName();

//        Dog myDog = (Dog)animal;
//        myDog.printName(); // protected access
        Husky myDog = (Husky)animal;
        myDog.printName();

        Animal cat = new Cat(2);
//        Cat myCat = cat; // DNC - trying ot assign type of Animal to cat
        Cat myCat = (Cat) cat; // has to be cast
        ((Cat) cat).getSpeed();

//        Bear bear = (Bear)"test"; // not related in hierarchy

//            Dog newDog = (Dog)cat; // warning, may create classCastException
        // runtime error ^ cannot cast Dog to Cat
        // ^ this is because both extend animal and are on different "sides" of the hierarchy

        // bird is not polymorphic (doesn't extend anything) - classes are polymorphic when they can be assigned to more than two types, including itself and Object
        Bird bird = new Bird();
        Object birdObject = bird;

        // is polymorphic (can be assigned to more than itself and Object)
        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObject = eagle; // 3 types here, making it polymorphic all pointing to the same spot in memory

        System.out.println(eagle);
        System.out.println(eagleBird);
        System.out.println(eagleObject); // all 3 here have the same Object reference

        List<String> list = new ArrayList<>();

        // virtual methods are methods where we do not know the specific implementation until runtime
        // all methods that are not static, final, or private are considered virtual since they can be overridden

        Animal rabbitAnimal = new Rabbit();
        // at compile time, .printDetails() thinks we are calling from Animal
        // but, since this is overloaded it is Virtual, and during runtime it resolves .printDetails() to Rabbit's implementation
        rabbitAnimal.printDetails();




    }
}
