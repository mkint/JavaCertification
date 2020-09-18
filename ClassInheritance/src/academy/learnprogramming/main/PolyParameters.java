package academy.learnprogramming.main;

import academy.learnprogramming.Animal;
import academy.learnprogramming.Cat;
import academy.learnprogramming.Husky;
import academy.learnprogramming.Rabbit;

public class PolyParameters {

    public static void main(String[] args) {

        Husky husky = new Husky(3);
        husky.setName("Rex");
        printDetails(husky);

        Rabbit rabbit = new Rabbit();
        rabbit.setName("Bunny");
        printDetails(rabbit);

        Cat cat = new Cat(2);
        cat.setName("Tom");
        printDetails(cat);

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);

        Animal kitty = createAnimal("Kitty", 3);
        printDetails(kitty);

        Animal bunny = createAnimal("Bunny", 2);
        printDetails(bunny);

        System.out.println(bunny instanceof Animal); // true
        System.out.println(bunny instanceof Rabbit); // true
        System.out.println(bunny instanceof Cat); // false
        cat.meow(); // meow method called without casting
        cat.test(); // test method (only in animal) called without casting

    }

//    public static void printDetails(Husky husky) {
//        husky.printDetails();
//    }
//
//    public static void printDetails(Rabbit rabbit) {
//        rabbit.printDetails();
//    }
//
//    public static void printDetails(Cat cat) {
//        cat.printDetails();
//    }

    // we can do this instead of what's above
    // saves code
    // at compile time it will think we are calling printDetails()
    // from Animal class, but at runtime it will overload with
    // virtualization
    public static void printDetails(Animal animal) {
        animal.printDetails();
    }

    public static Animal createAnimal(String name, int age) {
        if(name.equals("Rex")) {
            Animal animal = new Husky(age);
            animal.setName(name);
            // animal is now instance of Husky, but uses the Animal reference
            // any animal calls will be overloaded if exists at runtime
        } else if(name.equals("Kitty")) {
            Animal cat = new Cat(age);
            cat.setName(name);
            return cat;
        }

        Animal rabbit = new Rabbit(age);
        rabbit.setName(name);
        return rabbit;
    }
}
