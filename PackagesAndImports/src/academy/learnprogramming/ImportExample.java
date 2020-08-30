package academy.learnprogramming;

import a.b.c.d.ExampleClass;
import a.b.c.d.MyClass;
// or just import a.b.c.d.* to do all in d child package

import java.util.Random;
//import java.lang. redundant since its already imported by default

public class ImportExample {

    public static void main(String[] args) {
        ExampleClass ex = new ExampleClass();
        MyClass mc = new MyClass();
        Random random = new Random();
        System.out.println(random.nextInt(5));
    }
}
