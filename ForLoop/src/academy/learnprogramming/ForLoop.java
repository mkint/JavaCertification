package academy.learnprogramming;

import java.sql.SQLOutput;

public class ForLoop {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        int a;
        for(a = 0; a < 10; a++){
            System.out.println(a + " ");
        }
        // can use a after loop since we declared it beforehand
        System.out.println();
        System.out.println("after the loop a= " + a);

//        for(;;) {
//            System.out.println("infinite loop");
//        }

        int x = 0;
        for(int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("y= " + y);
        }

        System.out.println("x= " + x);

        //
        int d = 10;
//        for(int e = 0, d = 0; e < 10 || d < 10; e++, d--) {
//            cannot compile because d is being re-declared in the for loop header
//        }


        

    }
}
