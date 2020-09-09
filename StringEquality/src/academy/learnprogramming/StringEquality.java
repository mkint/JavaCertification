package academy.learnprogramming;

public class StringEquality {

    public static void main(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";
        String newName = new String("John");

        // Java creates a string pool in memory with all strings
        // if you create a new string and it exists in the String pool,
        // then java will just return to reference to that existing string rather
        // than creating a new one. UNLESS YOU USE new String()
        // new String() will go straight on the Java Heap rather than the String Pool
        // String Pool is an object on the heap and those items are within it though
        System.out.println("name == anotherName -> " + (name == anotherName));
        System.out.println("name == john -> " + (name == john));
        System.out.println("john == newName -> " + (john == newName));
        // true then false for reasons above
        // == checks an objects reference, whereas == checks primitives values

        System.out.println("name.equals(anotherName) -> " + name.equals(anotherName));
        System.out.println("name.equals(john) -> " + name.equals(john));
        System.out.println("name.equals(newName) -> " + name.equals(newName));
        // ^^^ these are checking data within objects rather than object reference

        System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
        System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
        System.out.println("john - identityHashCode -> " + System.identityHashCode(john));
        System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));


        // another two rules to remember
        // when we concat two literals, that expression is computed at compile
        // time and treated as a literal
        // so "jo" + "hn" is treated as "john"

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        String str4 = "ab" + "c";

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true, because it's two string literals

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}
