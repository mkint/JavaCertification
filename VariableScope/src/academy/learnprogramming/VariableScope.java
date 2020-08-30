package academy.learnprogramming;

public class VariableScope {

    // "global" within the class because it is static
    static int myNewInt = 5;

    public static void main(String[] args) {
        int myLocalInt = 10; // only available within this method.

        {
            int myOtherInt = 20;
            System.out.println("myOtherInt= " + myOtherInt);
            // only available within this little code block
        }

        System.out.println(myLocalInt); // works (within scope)
//        System.out.println(myOtherInt); // does not work (out of scope) - and also wouldn't print 30
        // from line 21 since the declaration has yet to come

        int myOtherInt = 30; // can declare this variable since the other one is out of scope
        System.out.println("myOtherInt= " + myOtherInt); // prints 30 instead of 20 since 20 is out of scope
    }

    public static void myMethod() {
//        myLocalInt = 12; // does not work because it is out of scope
        System.out.println(myNewInt);
        // ^ works because it is not out of scope
    }
}
