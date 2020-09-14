package academy.learnprogramming;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public void jump1(int... numbers) {}

    public void jump2(int start, int... numbers) {}

//    public void jump3(int... numbers, int start) {} // DNC, VARARG PARAM MUST BE LAST IN LIST
    // otherwise how would the compiler know where numbers ands and start starts?

//    public void jump4(int... start, int... numbers) {} // again can't have one at the start if there is one at the end
    // how would it know where the first ends and the next starts

    public static void main(String[] args) {
        jump(1); // do not need to specify varargs
        jump(2, 3);
        jump(4, 5,6,7);
        jump(1, new int[] {4,5,6}); // compiles and runs, but redundant array creation
//        jump(1, null); // throws null pointer exception, cannot call .length on null
        // if we pass nothing, it will just create an empty array

        run();
        run(11, 22, 33, 44, 55, 66, 77, 88, 99);
    }

    public static void jump(int start, int... numbers) {
        System.out.println("start= " + start + " numbers.length= " + numbers.length);
    }

    public static void run(int... numbers) {
        for(int number: numbers) {
            System.out.println("number= " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
