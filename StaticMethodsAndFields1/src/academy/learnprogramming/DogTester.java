package academy.learnprogramming;

public class DogTester {

    public static void main(String[] args) {
        Dog husky = new Dog();

        System.out.println(husky.count); // warning because we are accessing static variable from an instance, when
        // we could just do Dog.count (what we should do with static)
        System.out.println(Dog.count);

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter(); // same thing as above comment ^^
        // just do this next line because
        // we shouldn't call static methods/variables from instances
        Dog.incrementCounter();

        System.out.println(Dog.count);

        husky = null;
        anotherDog = null;
        // we can actually access static values/methods from
        // null instances
        // but we still shouldn't call them from instances
        System.out.println(Dog.count);
        System.out.println(husky.count);
        System.out.println(anotherDog.count);

        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dog2 = new Dog();
        newDog.count = 5;
        newDog.count = 11;

        System.out.println(Dog.count); // 11
        System.out.println(newDog.count); // 11
        System.out.println(dog2.count); // 11
        // even though we have set count to 11 from an instance, it changes it since it's static








    }
}
