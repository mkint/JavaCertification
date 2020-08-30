package academy.learnprogramming;

public class DefaultInitialization {

    // for now, assume static just means that it lets us use it in the main method
    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
        // local variables are variables declared within our method
        int localInt;
//        System.out.println("localInt= " + localInt); // must initialize local variables first
        
        System.out.println("myBoolean= " + myBoolean);
        System.out.println("myByte= " + myByte);
        System.out.println("myShort= " + myShort);
        System.out.println("myInt= " + myInt);
        System.out.println("myLong= " + myLong);
        System.out.println("myFloat= " + myFloat);
        System.out.println("myDouble= " + myDouble);
        System.out.println("myChar= " + myChar);

    }
}
