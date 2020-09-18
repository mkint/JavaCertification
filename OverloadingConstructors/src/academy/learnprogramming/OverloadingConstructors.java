package academy.learnprogramming;

class Dog {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
//        this.name = name;
//        breed = "husky";
//        weight = 30.0;

//        Dog(name, "husky"); // DNC
//        new Dog(name, "husky"); // compiles, but creates a second dog which is not what we want
        // this.name accesses instance vars, this() accesses instance constructors
//        System.out.println("will not compile with this here before this() call");
        this(name, "husky"); // we reduce repeated code this way
        // ^^ must be first non-commented line of code
        System.out.println("constructor 1");
    }

    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;
        this(name, breed, 30.0); // these this() statements are referred to as constructor chaining
        System.out.println("constructor 2");
    }

    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }
}

public class OverloadingConstructors {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jimmy");
        dog1.print();

        Dog dog2 = new Dog("Anthony", "shepard");
        dog2.print();

        Dog dog3 = new Dog("Rex", "german shepard", 40);
        dog3.print();
    }
}
