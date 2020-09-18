package academy.learnprogramming;

class Example {
    private String name = "dog";

    {
        // instance initializer (just not static, called right before constructor so essentially pointless and bad practice)
        // called second
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        // called first
        System.out.println(COUNT);
    }

    {
        // called third
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example() {
        // called fourth
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }
}

public class OrderOfInitialization {


    public static void main(String[] args) {
        // static -> instance initializers -> constructors
        Example example = new Example(); // 0, dog, 10, constructor

        new Demo(); // 2 4 6 8 5 6 8 5
        // in this order
        // add(2)
        // add(4)
        // static { new Demo() } WAITING - is called, but constructor waits until other statics are done
        // add(6)
        // add(8)
        // earlier WAITING call gets called -> add(5)
        // now original constructor is called, but first it has to do instance initializers
        // add(6)
        // add(8)
        // add(5)
        // 2 4 6 8 5 6 8 5
    }
}
