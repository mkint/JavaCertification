package academy.learnprogramming;

public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {
        // declaring and initializing in two lines
        int myNumber;
//        System.out.println("myNumber= " + myNumber); // does NOT work (not initialized)
        myNumber = 10;
        System.out.println("myNumber= " + myNumber);

        // one line
        double myDouble = 7.50;
        System.out.println("myDouble= " + myDouble);

        float myFloat1, myFloat2, myFloat3; // not the best practice but it compiles
        float myFloat4; float myFloat5; // also legal but not the best practice

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8; // legal
        boolean b1, b2;

//        double d1, double d2; // this does not compile because it has two type declarations
        // one statement, which is why it errors^
        double d1, d2; // this compiles as opposed to above ^

        int i1;
        int i2;
//        int i3; i4; // doesn't compile because of semicolon. In this example we'd need another int declaration
        // two statements ^
        // just treat each semi colon as a new line (duh) since they are new statements

//        int int = 10; // does not compile because we can't use java keywords for variable names
        char cHaR; // works because java is case sensitive, but don't do this ever since it's bad practice

        float okFloat;
        double $Ok2Double1; // variables can begin with $ or _
        double _alsoDouble;
        float __OkButNotNice$_123;

        // illegal examples
//        double 3Dpoint; // names cannot begin with numbers
//        double myA@street; // not a legal character for variable names -- remember only $ or _
//        float *$coffee; // same thing







    }
}
