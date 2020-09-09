package academy.learnprogramming;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;
        // 3 - 2 + 4 + 3
        // 1 + 4 + 3
        // 5 + 3
        // 8
        System.out.println("result= " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        // 2 + 1 - 4 * 2 + 10
        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10
        // 5

        System.out.println("result= " + result);

        int a = 4;
        int b = 3 - 2 * --a; // DECREMENT then use. if it was a-- then we would USE then DECREMENT
        // 3 - 6
        // -3

        // a = 3 now and b = -3. a = 3 now because --a // a-- --> a=a-1
        System.out.println("a= " + a + " b= " + b);

        a = 4;
        b = 3 - 2 * a--;
        // 3 - 2 * 4
        // 3 - 8
        // -5
        // a is decremented AFTER use, so a = 3 now

        // a = 3, b = -5
        System.out.println("a= " + a + " b= " + b);

        long c = 2;
        long d = 4 + 3 * c++;

        // c = 3
        // d = 4 + 3 * 2 (incremented after use)
        // d = 10

        System.out.println("c= " + c + " d= " + d);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1
        // 0

        System.out.println("result= " + result);

        int i = 10;
        int j = 3;

        int k = i % j;
        int e = 10 % 2;
        // k = 1
        // e = 0

        System.out.println("k= " + k + " e= " + e);

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;

        // f / 2 - 10 % 7 - 2 * f % g - h * 3;
        // 6 - 3 - 24 % g - 6;
        // 6 - 3 - 4 - 6
        // -7

        System.out.println("m= " + m);



    }
}
