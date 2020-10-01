package academy.learnprogramming;

public class CheckedVsUnchecked {

    public static void main(String[] args) throws Exception {
        myMethod(); // DNC, unhandled exception (needs to be checked)
        // or we can add throws Exception in main, which I'll do here but it is bad practice
        anotherMethod();

    }

    public static void myMethod() throws Exception { // required declaration
        throw new Exception("Failed to load");
    }

    public static void anotherMethod() throws RuntimeException { // don't have to declare, but can
        throw new RuntimeException("Wrong parameter");
    }
}
