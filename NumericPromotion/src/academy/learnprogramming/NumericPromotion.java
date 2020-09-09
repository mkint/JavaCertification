package academy.learnprogramming;

public class NumericPromotion {

    public static void main(String[] args) {
        // promotion is converting "smaller" type to "bigger" type
        int x = 5;
        double y = 10.55;
        // sum makes x promote to double, therefore result is double
        System.out.println("x + y = " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.5;
        double result = b + c + d;

        System.out.println("result= " + result);

        // casting is converting "bigger" type to "smaller" type
        double myDouble = 5.55;
//        int myInt = 4 + myDouble; // 4 gets promoted to double, so result is double, meaning it can't be assigned to an int
        // since the result on the right half is a double, we have to convert the right side to int if we
        // want to assign it to an int
        // or we can cast myDouble to an int (removing the decimal places)
        int myInt = 4 + (int) myDouble;
        // myDouble is now 5 ^
        System.out.println("myInt= " + myInt);


        int anotherInt = 125;
        byte myByte = 15;
        int intResult = anotherInt + myByte; // no error since myByte can successfully be promoted to int
//        byte byteResult = anotherInt + myByte; // same issue as line 21
        // we can convert the result into byte by making the right side a byte direcly
        int byteResult = (byte) (anotherInt + myByte);

        System.out.println("intResult= " + intResult);
        System.out.println("byteResult= " + byteResult); // "should" be same as intResult but we get an overflow converting
        // the result to byte



    }
}
