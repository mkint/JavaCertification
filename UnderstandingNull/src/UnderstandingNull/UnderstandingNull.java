package UnderstandingNull;

public class UnderstandingNull {

    static Object myObject = new Object(); // every class extends object so we normally don't need to do this
    static Object myOtherObject; // by default all objects are initialized to null
    // primitives are not objects, so they initialize differently (as I saw in the earlier lesson)

//    static Object newObject = null; // redundant because outside of methods these are initialized to null
//    static int myInt = 0; // redundant because outside of methods these are init to 0

    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject= " + myObject);
        System.out.println("myOtherObject= " + myOtherObject);
        System.out.println("myLocalObject= " + myLocalObject);
//        System.out.println("anotherLocalObject= " + anotherLocalObject); // doesn't compile because anotherLocalObject was not initialized

        System.out.println("name= " + name);
        System.out.println("anotherName= " + anotherName);

        myString = "Java"; // added later

        System.out.println("myString= " + myString); // added this because of null pointer exception to see "why we got it"
        // we see it is null so we can add line @ 29
        myString.toLowerCase(); // will cause null pointer exception @ runtime since myString is null, we can add above line to test

        System.out.println("myString= " + myString);

    }
}
