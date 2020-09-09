package academy.learnprogramming;

public class UnaryOperators {

    public static void main(String[] args) {
        int x = +3; // plus sign is redundant but still compiles
        System.out.println("x= " + x);

        double y = -x;
        System.out.println("x= " + x + " y= " + y);

        y = -y; // -1 * y
        System.out.println("x= " + x + " y= " + y);

        boolean a = true;
        boolean b = !a;
        System.out.println("a= " + a + " b= " + b);

        b = !b;
        System.out.println("a= " + a + " b= " + b);

//        int myInt = !5; // doesn't compile because ! only works with booleans (int and true/false have no relation)
//        boolean myBoolean = -true; // +- cannot be applied to boolean
//        boolean z = !0; // does not compile either, booleans in java are not 0 and 1, so this doesn't work.

        // increment and decrement be careful, have higher order than (+,-,*,/,...)
        int myInt = 5;
        int otherInt = ++myInt;
        // outputs 6 and 6
        System.out.println("myInt= " + myInt + " otherInt= " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++;
        // outputs 6 and 5
        System.out.println("newInt= " + newInt + " newOtherInt= " + newOtherInt);

        int count = 0;
        System.out.println(count); // 0
        System.out.println(++count); // increments count then prints it
        System.out.println(count); // 1
        System.out.println(count--); // print 1 then decrements count to 0
        System.out.println(count); // 0

        // exam questions
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // ++e -> increments e by 1 (4) then uses it
        // e-- -> uses e (4) then decrements to (3)
        // --e -> decrements e to (2) then uses it
        // 4 * 5 / 4 + 2
        // e = 2 at the end
        // f = 20/4 + 2
        // f = 5 + 2
        // f = 7
        // e = 2, f = 7
        System.out.println("e= " + e + " f= " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // ++h -> increments h then uses it (3) --> returns h = 3
        // --g -> decrements g then uses it (5) --> returns g = 5
        // g++ -> uses g (5) then increments it --> returns g = 6
        // h-- -> uses h (3) then decrements it --> returns h = 2
        // --g -> decrements g then uses it (5) --> returns g = 5
        // i = 3 + 5 * 3 + 2 * 5 - 3 % 5
        // i = 3 + 15 + 10 - 3 --> (3 % 5 = 3 bc 3/5 is 0.6 aka 0 with 3 remainder)
        // i = 25
        // g = 5, h = 2, i = 25
        System.out.println("g= " + g + " h= " + h + " i=" + i);


    }
}
