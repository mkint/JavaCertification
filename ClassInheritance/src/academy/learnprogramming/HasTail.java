package academy.learnprogramming;

public interface HasTail {

//    public static final int DEFAULT_TAIL_LENGTH = 2; // compiles but is redundant, all are public static final automatically
    int DEFAULT_TAIL_LENGTH = 2;

    // every method inside of interface is automatically public and abstract
//    public abstract int getTailLength(); // compiles but is again redundant
    int getTailLength();

//    int getWeight() {}; // DNC - cannot have body even if empty (just like abstract methods)


}
