package academy.learnprogramming;

public class Husky extends Dog {

    public Husky(int age) {
        // compiler adds super();
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        super.eat(); // dont have to call this, but it would allow us to use the logic from parent classes
        // ^ if we take this line away it would just print "Husky eating"
        System.out.println("Husky eating");
//         super.eat(); // can also be called anywhere in this code

    }

    // FINAL METHODS CANNOT BE BE OVERRIDDEN




    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public int getTailLength() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed= " + speed);
    }

    @Override
    public void printName() {
        System.out.println("Husky name= " + getName());
    }
}
