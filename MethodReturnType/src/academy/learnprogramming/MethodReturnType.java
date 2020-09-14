package academy.learnprogramming;

public class MethodReturnType {

    public void jump() {} // return type void
    public void jump2() {
        return; // return type void
    }

    public String jump3() { return ""; }

//    public String jump4() {} // DNC need return statement

//    public jump5() {} // DNC did not specify return type

//    String jump6(int a) {
//        if(a == 5) {
//            return "";
//        }
//    } DNC need another possible return statement
    // "MISSING RETURN STATEMENT"

    int getInt() {
        return 5;
    }

    int getLong() {
//        return 9L; // DNC, long is not assignmable to int
        return (int) 9L;
    }

    int expanded() {
//        int temp = 10;
//        return temp;
        return 10;
    }

    boolean isTrue() {
        return 5 < 10;
    }

    public void test() {}
//    public void 2test() {} // DNC cannot have method name starting with numbers
//    public void void() {} // DNC cannot use keywords for method names

    public void $test() {} // valid
    public void _test() {} // valid

    





}
