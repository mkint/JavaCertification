package academy.learnprogramming;

public class MethodArguments {
    // arguments and parameters are used interchangeably BUT
    // they are not the same
   // parameters are up in the definition of the method
   // arguments are the actual values passed to a method while calling a method

   int getZero() { // 0 arguments (niladic)
       return 0;
   }

   int increment(int number) { // 1 argument (monadic)
       return number++;
   }

   int sum(int a, int b) { // 2 arguments (dyadic)
       return a + b;
   }

   int plusMinus(int a, int b, int c) { // 3 arguments (triadic) try to avoid anything more than 2 arguments
       return a + b - c;
   }

   double average(double a, double b, double c, double d) { // 4 arguments (polyadic) avoid this, needs pretty serious justification
       return (a+b+c+d)/4.0;
   }

//   void test {} // DNC no parentheses for arguments

//    void test(int a; int b) {} // DNC ; instead of ,

    void test(int a, int b) {}

//    void test2(int a); // DNC no method body (body can be empty with void though, but still need brackets


}
