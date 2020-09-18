package academy.learnprogramming;

public class Dog {

    public Dog(String name) {

    }

    private Dog() {
        // means constructor cannot be instantiated
        // useful for utility classes where you just use static methods
        // since the above constructor is public, we could still use that in this situation
    }
}
