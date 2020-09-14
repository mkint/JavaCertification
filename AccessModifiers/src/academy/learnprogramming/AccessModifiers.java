package academy.learnprogramming;

import academy.learnprogramming.common.Common;

public class AccessModifiers {

    public static void main(String[] args) {
        /*
        Access Modifiers

        Modifier      | class   package subclass    world
        --------------------------------------------------
        public        | yes     yes     yes         yes
        protected     | yes     yes     yes         no
        none (default)| yes     yes     no          no
        private       | yes     no      no          no

         */

        Common common = new Common();
        common.publicPrint();
        // cannot access these 3
//        common.protectedPrint();
//        common.defaultPrint();
//        common.privatePrint();

        System.out.println("publicNumber= " + common.publicNumber);
//        System.out.println("publicNumber= " + common.protectedNumber); DNC CANNOT ACCESS
//        System.out.println("publicNumber= " + common.defaultNumber); DNC CANNOT ACCESS
//        System.out.println("publicNumber= " + common.privateNumber); DNC CANNOT ACCESS

    }
}
