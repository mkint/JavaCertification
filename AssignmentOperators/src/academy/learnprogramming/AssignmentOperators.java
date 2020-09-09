package academy.learnprogramming;

public class AssignmentOperators {

    public static void main(String[] args) {
//        int x = 1.0; // does not compile
//        short y = 19812345; // does not compile (trying to assign int into short variable)
//        int z = 9f; // does not compile, trying to assign float into int
//        long t = 1923012345678910; // cannot work because we are assigning a literal (integer) to long

        // how to fix them
        int x = (int)1.0;
        short y = (short)19812345;
        int z = (int)9f;
//        long t = (long)1923012345678910; // doens't work have to add L like line below since the int is too large to cast
        long t = 1923012345678910L;
        System.out.println("x= " + x);
        System.out.println("y= " + y); // overflow
        System.out.println("z= " + z);
        System.out.println("t= " + t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println("myByte= " + myByte);
        System.out.println("mySecondByte= " + mySecondByte);

//        myByte = myByte + 1; // my byte is auto promoted to int here so it doesn't compile
//        myByte = (byte) (myByte + 1); // works but the next line is simpler for this case
        myByte++; // will increment without the need for casting
        mySecondByte--;

        System.out.println("myByte= " + myByte);
        System.out.println("mySecondByte= " + mySecondByte);

        short a = 10;
        short b = 20;
//        short c = a * b; // java auto promotes all smaller values to int
//        short c = (short) a * (short) b; // does not work because java will make a and b shorts but the result will
//         still be int
        short c = (short) (a * b);

        System.out.println("c= " + c);





    }
}
