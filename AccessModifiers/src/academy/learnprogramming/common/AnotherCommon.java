package academy.learnprogramming.common;

public class AnotherCommon {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
//        common.privatePrint(); // DNC - private can't access
        // outside of same class

        System.out.println("publicNumber= " + common.publicNumber);
        System.out.println("publicNumber= " + common.protectedNumber);
        System.out.println("publicNumber= " + common.defaultNumber);
//        System.out.println("publicNumber= " + common.privateNumber); DNC cannot be accessed
    }
}
