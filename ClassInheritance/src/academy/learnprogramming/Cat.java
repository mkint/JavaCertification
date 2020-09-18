package academy.learnprogramming;

//public class Cat extends Animal implements Walk, Run { // DNC when Run/Walk both have the same getSpeed() (multiple inheritance)public class Cat extends Animal implements Walk, Run {
public class Cat extends Animal implements Run { // now we have changed Run to extend Walk to fix this problem


    public Cat(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public void printName() {

    }

    public void meow() {
        System.out.println("meow");
    }

    // dont need getSpeed since we have defaults in interface
    // or we can override it

    @Override
    public int getSpeed() {
        return 15;
    }
}
