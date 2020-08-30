package academy.learnprogramming;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static academy.learnprogramming.Config.printConfig;
import static academy.learnprogramming.Config.NAME;

public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5,7);
        out.println("min= " + min);
        out.println(PI);

//        Config.printConfig(); // without static import
        printConfig();
        out.println(NAME);

    }
}
