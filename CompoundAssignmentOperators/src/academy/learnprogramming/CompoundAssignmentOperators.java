package academy.learnprogramming;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {
        // compound assignment operators calculate on the right side then store the operation in the left-hand side
        int x = 2;
        int z = 3;

        x = x * z; // simple assignment
        x *= z; // compound assignment, same as the line above

        System.out.println("x= " + x);

        // compound assignments can also save us from having to explicitly cast a value
//        int a += 5; // this does not compile because you cannot add to an undefined value

        // without explicit cast
        long a = 10;
        int b = 4;

//        b = b * a; // everything smaller than int gets auto assigned to int, but here we have int and long
        // int is not normally auto assigned to long, but since we are adding an int and a long it will
        // be autp casted into a long, therefore previding a long as a result (meaning this will not compile without
        // explicitly casting)
        b = (int) (b * a); // this fixes the above, but it's not the simplest thing we can do
        // compound version
        b *= a; // short form of b = (int) (b * a) -- does the cast for us

        System.out.println("b= " + b);

        // potential exam questions
        long c = 4;
        long d = c = 2; // compiles --> cleaner look is long d = (c = 2)
        // ^ above is short-hand for c = 2; long d = c; (not good practice to do the above line)

        System.out.println("c= " + c);
        System.out.println("d= " + d);

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e + 3 * (f = 3) - (h -= 2); // not great practice but will be on exam
        // 3 + 3 * 3 - -1;
        System.out.println("e= " + e);
        System.out.println("f= " + f);
        System.out.println("h= " + h);
        System.out.println("i= " + i);
        
    }
}
