package academy.learnprogramming;

public class ObjectEquality {

    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println(myInteger == myAnotherInteger); // true

        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        System.out.println("128 == 128: " + (128 == 128)); // true

        myInteger = 128;
        myAnotherInteger = 128;

        System.out.println("myInteger hash: " + System.identityHashCode(myInteger));
        System.out.println("myAnotherInteger hash: " + System.identityHashCode(myAnotherInteger));

        System.out.println("myInteger= " + myInteger);
        System.out.println("myAnotherInteger= " + myAnotherInteger);
        System.out.println(myInteger == myAnotherInteger); // false -- why? check below

        // myInteger = 128; --> what happens during this? check below
        // automatically calls the valueOf method
        Integer.valueOf(128); // check valueOf method. if value is not between -128 and 127 then it does new Integer(i)

        // further testing
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;

        System.out.println("int1 == int2: " + (int1 == int2)); // false == just checks reference
        System.out.println("int1 == int3: " + (int1 == int3)); // false
        System.out.println("int2 == int3: " + (int2 == int3)); // false

        System.out.println("int1.equals(int2): " + int1.equals(int2)); // true, bypasses reference to check values in container
        System.out.println("int1.equals(int3): " + int1.equals(int3)); // true
        System.out.println("int2.equals(int3): " + int2.equals(int3)); // true

        System.out.println("int1 hash= " + System.identityHashCode(int1)); // (what the == checks)
        System.out.println("int2 hash= " + System.identityHashCode(int2));
        System.out.println("int3 hash= " + System.identityHashCode(int3));

        int1 = Integer.valueOf(1);
        int2 = Integer.valueOf(1);
        int3 = 1; // same as calling integer.valueOf
        System.out.println("int1 == int2: " + (int1 == int2)); // true (within cache) -- so it doesn't call new Integer()
        System.out.println("int1 == int3: " + (int1 == int3)); // true (within cache) -- "
        System.out.println("int2 == int3: " + (int2 == int3)); // true (within cache) -- "

        System.out.println("int1 hash= " + System.identityHashCode(int1));
        System.out.println("int2 hash= " + System.identityHashCode(int2));
        System.out.println("int3 hash= " + System.identityHashCode(int3));


        // THIS IS WHY IT IS ALWAYS BETTER TO COMPARE OBJECTS WITH .equals(Obj o) METHOD!!
        // EVEN THOUGH EQUALITY OPERATORS WORK "CORRECTLY" WITH -128 TO 127 HASHED VALUES, THAT STILL WOULD BE HARD
        // TO CHECK FOR. JUST USE .equals()!



    }
}
