package academy.learnprogramming;

public class Rabbit extends Animal implements Herbivore, Hop {

    public Rabbit() {
//        super; // DNC - not a statement. Should be super.example or super()
//        super().setAge(3); // DNC - should be super.setAge(3)

        super();
//        super.setAge(3);
//        this.setAge(3);
        setAge(3); // this is the same as calling the above two in this situation
    }

    @Override
    public void printName() {

    }

    public Rabbit(int age) {
//        this(age); // DNC recursive call
//        this(); // works since Rabbit() calls super only

        // this() and super() must be the first calls if used in a constructor, so you cannot have either together like this
        // DNC if there are multiple, here it DNC on line 22, but if we comment out 21, it DNC on line 23
//        this();
//        super();
//        this();

        super(3);

    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printDetails() {
//        System.out.println("Rabbit average jump height is= " + getAverageJumpHeight()); // DNC - with static methods we have to invoke the class/interface name
        System.out.println("Rabbit average jump height is= " + Hop.getAverageJumpHeight());
    }
}
