package academy.learnprogramming;

public class DesigningMethods {

    public void jump() {}

//    void public jump2() {} DNC return has to be right before name of function

    void jump3() {} // default access modifier is private

    public final void jump4() {}

    public static final void jump5() {}
    public final static void jump6() {} // final/static are the same type (specifier) so order of them doesn't matter

//    public modifier void jump7() {} // DNC does nothing because modifier is not a valid word

//    public String void jump8() {} // DNC because of 2 return types

    final public void jump9() {}

    final static public void jump10() {} // final can come first

//    String int public void jump11() {} // DNC 2 return types






}
