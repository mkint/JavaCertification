package academy.learnprogramming;
// classes can extend only 1 class but multiple interfaces
public abstract class Dog extends Animal implements HasTail, CanRun {

    public Dog(int age) {
        // compiler adds Super() if no parameters
        super(age); // must be first line in constructor, similar to this()
        System.out.println("Dog");
    }

    @Override // override annotation-just tells the compiler to let us know if we mess up the override.. ie overload on accident or something
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }

    @Override
    public double getAverageWeight() {
//        return 30; works
        return super.getAverageWeight() + 20;
//        return getAverageWeight() + 20; // compiles but calls local getAverageWeight recursively causing stack overflow
    }

    protected abstract void printName();

    @Override
    public int getTailLength() {
        return 5;
    }
}
