package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String getType() {
        return type;
    }
}

interface CheckAnimal {
    boolean check(Animal animal); // in this case, we are defining our implementations of this through lambdas rather than creating classes implementing this interface
}

//class CheckCanJump implements CheckAnimal {
//
//    @Override
//    public boolean check(Animal animal) {
//        return animal.canJump();
//    }
//}

// interfaces with 1 method are referred to as functional interfaces
// they, in other words, can be used in Java for functional programming
// lambdas work with single method interfaces or functional interfaces
interface AnotherCheck {
    boolean check(Animal first, Animal second);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));

//        print(animals, new CheckCanJump());

        print(animals, animal -> animal.canSwim());
        // ==
        print(animals, (Animal animal) -> {
            return animal.canSwim();
        });

        print(animals, (Animal animal) -> {
            System.out.println("checking animal= " + animal.getType());
            return animal.canJump();
        });

        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);

        print(fish, rabbit, (f, s) -> f.canJump() && s.canSwim());
        print(fish, dog, (f, s) -> f.canSwim() && f.canSwim());

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anthony");
        names.add("Jimmy");
        names.add("Timmy");

        System.out.println("names= " + names);

        names.removeIf(name -> name.charAt(0) == 'J'); // accepts Predicate
        // we can use anything in place of name (str -> str.charAt(0) == 'J');
        System.out.println("after filter names= " + names);

        // same as this, but it should be re-factored into lambda above
//        names.removeIf((String name) -> {
//          return name.charAt(0) == 'J';
//        });
        // remember that predicate interface has 1 method Test that accepts any type of parameter and returns a boolean
    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

    private static void print(List<Animal> animals, Predicate<Animal> filter) {
        for(Animal animal : animals) {
            if(filter.test(animal)) {
                System.out.println(animal.getType());
            }
        }
        System.out.println();
    }
}
