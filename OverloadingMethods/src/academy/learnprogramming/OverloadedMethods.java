package academy.learnprogramming;

import java.util.Arrays;

public class OverloadedMethods {

    public void walk(int miles) {

    }

    public void walk(short feet) {

    }

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {

    }

    public void walk(float miles) {

    }

//    public int walk(float miles_float) {
//      DNC - cannot have same name and argument types
//    }

    public void walk(int[] lengths) {

    }

//    public void walk(int... vars) {
//        DNC - int... = int[]
//    }


    public static void run(int length) {}
    public static void run(Integer length) {}
    public static void run(double kilometers) {}

    public static void jump(String s) {
        System.out.println("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }

    public static void main(String[] args) {
        run(1.0); // float gets auto promoted to double
        run (1);
        run (9L); // long is promoted to double in this case

        jump(25); // integer is not found so it's cast to object

        sum(1, 2);
        count(true,true,true);
        count(true, new boolean[]{true, true});
        /*
         by priority of existence:
         calls int sum
         calls long sum
         calls Integer sum
         calls var args sum
        */
    }

    public static int count(boolean b, boolean... b2) {
        System.out.println(b2.length);
        return b2.length;
    }

    public static int sum(int a, int b) {
        System.out.println("int sum");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.println("long sum");
        return a + b;
    }

    public static Integer sum(Integer a, Integer b) {
        System.out.println("integer sum");
        return a + b;
    }


    public static int sum(int... numbers) {
        System.out.println("var args sum");

        int sum = 0;

        for(int i : numbers) {
            sum += i;
        }

        return sum;
    }
}
