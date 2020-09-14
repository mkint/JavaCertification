package academy.learnprogramming;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Counter {

    public static int count;
    public int anotherCount;

    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        System.out.println(count); // 4
        System.out.println(one.count); // 4
        System.out.println(two.count); // 4
        System.out.println(three.count); // 4
        System.out.println(four.count); // 4

        one.count = 2;
        two.count = 3;
        three.count = 21;
        four.count = 5;

        System.out.println(one.count); // 5
        System.out.println(two.count); // 5
        System.out.println(three.count); // 5
        System.out.println(four.count); // 5

        one.anotherCount = 2;
        two.anotherCount = 3;
        three.anotherCount = 21;
        four.anotherCount = 5;

        System.out.println(one.anotherCount); // 2
        System.out.println(two.anotherCount); // 3
        System.out.println(three.anotherCount); // 21
        System.out.println(four.anotherCount); // 5

    }
}
