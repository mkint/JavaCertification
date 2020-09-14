package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {

    private static final int SIZE; // dnc if there is no static initialization

    private static int one;
    private static final int two; // same as above comment
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();

    // static initializer (can have multiple but its better to have all in one block)
    static {
        System.out.println("first static init");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        // all of this code can be in the above initializer (and should be) but using this as an example
        System.out.println("second static init");
        one = 1;
        two = 2;
        one = three; // one is not final
//        three = 3; // dnc cannot re-assign final, even in static block
//        two = 2; // same as above comment
    }

    static {
        System.out.println("third static init");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    public static void main(String[] args) {
        // static initializers are called first
        // first static init
        // second static init
        // third static init
        System.out.println(NAMES); // [Jimmy, Timmy]

    }
}
