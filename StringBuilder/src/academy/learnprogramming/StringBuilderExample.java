package academy.learnprogramming;

public class StringBuilderExample {

    public static void main(String[] args) {
        String myString = "";

        for(char c = 'a'; c <= 'z'; c++) {
            myString += c;
        }

        System.out.println(myString);

        // String builder is NOT immutable
        // you can also chain with String Builder
        // BUT!!! It will NOT produce new objects

        // with String Builder
        StringBuilder sb = new StringBuilder(); // creating new StringBUilder instance

        for(char c = 'a'; c <= 'z'; c++) {
//            sb += c; // have to use append with string builder
            sb.append(c); // this will not create a new string every iteration
        }

        System.out.println(sb);

        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); // start-middle -- it will return reference to same string builder
        System.out.println(builder); // start-middle
        StringBuilder anotherBuilder = builder.append("-end");

        System.out.println(builder); // start-middle-end (same reference)
        System.out.println(anotherBuilder); // start-middle-end (same reference)

        System.out.println(builder == anotherBuilder); // true
        System.out.println(System.identityHashCode(builder)); // same as below
        System.out.println(System.identityHashCode(anotherBuilder)); // same as above

        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity()); // 16, by default but java will increase as necessary

        myBuilder = new StringBuilder(100);
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        myBuilder.append("MyNewTest");
        System.out.println("size= " + myBuilder.length());
        System.out.println("capacity= " + myBuilder.capacity());

        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);
        System.out.println(b);

        
    }
}
