package academy.learnprogramming;

public class StringConcatenation {

    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println(2 + 3); // 5
        System.out.println("a" + "b"); // ab
        System.out.println(1 + 2 + "d"); // 3d

        int three = 3;
        String four = "4";

        System.out.println(1 + 2 + three + four); // 64

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result= " + number + anotherNumber); // result= 1020
        // this happens because String is coming before the numbers
        // it goes "result= " + "10" (does string concatenation)
        // then it goes "result= 10" + "20" (does another concatenation)

        System.out.println("result= " + (number + anotherNumber)); // this way we do the math first then concat the
        // two sections of the print statement into a single string

        String str = "";
        for(int i = 0; i < 10; i++) {
            str += i; // += is not the best practice because
            // we create a new string each time
        }
        System.out.println("str=" + str);

        String hello = "hello";
        String world = "world";
        String helloWord = hello + world;

    }
}
