package academy.learnprogramming;
// What are wrapper types?
// Boxing, unboxing, and autoboxing?

public class WrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        // boxing (converting primitive to wrapper)
        Integer myInteger = new Integer(10); // wrapper class that wraps a primitive inside of it
        // autoboxing (automatically converting primitive to wrapper using assignment of primitive)
        Integer myInteger2 = 20; // a way of fixing above warning
        // boxing
        Integer myInteger3 = Integer.valueOf(10);
        // boxing
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null; // since Integer is an object we can do this
//        int myInt2 = null; // can't work since int is primitive
        
        System.out.println("myInteger= " + myInteger);
        System.out.println("myInteger2= " + myInteger2);
        System.out.println("myInteger3= " + myInteger3);
        System.out.println("myInteger4= " + myInteger4);
        System.out.println("myInteger5= " + myInteger5);

        // unboxing -> converting wrapper to primitive
        int myInt3 = myInteger3;
//        int myInt4 = myInteger5; // be careful! myInteger5 is initialized to null so we will get an error @ runtime (null pointer exception) since primitives cannot contain null

        // boxing -> converting primitive to wrapper
        Integer myInteger6 = new Integer(10);
        Integer myInteger7 = myInt;

        // autoboxing -> (done by java and its compiler) converting primitive directly to wrapper
        Integer myIntegerAuto = 12;
        printSum(1, 5); // printSum will autobox these


        printSum(myInteger, myInteger2); // not autoboxed since they're already Integer wrappers
    }

    private static void printSum(Integer first, Integer second) {
        System.out.println("sum= " + (first + second));
//        System.out.println("sum= " + first + second); // works but logical error-- it will concat strings. so if 1,5 is passed it will print 15 instead of 6
    }
}
