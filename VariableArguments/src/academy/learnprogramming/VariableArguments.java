package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {

//    public static void main(String[] args) {
//        // Variable arguments (varargs)
//
//    }

    public static void main(String... args) {
        // varargs can also be represented as ...
        // this is valid
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        print(args);
        print("Java");
        print("This", "is", "my", "string", "array");
        print(new String[] {"this", "test", "test2"}); // works but unnecessary to create new array since it'd be an array anyways like the line above
        // BUT ^this is necessary when you use String[] args instead of String... args
        String[] test = {"this", "is", "a", "test"};
        print(test);
        print("variable", "arguments", "are", "nice", "and", "useful", "feature");

    }

    private static void print(String... myArguments) {
        // need it to be static to call from main method
        // will learn about static later
        System.out.println(Arrays.toString(myArguments));
    }
}
