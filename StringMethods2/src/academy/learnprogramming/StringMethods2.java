package academy.learnprogramming;

public class StringMethods2 {

    public static void main(String[] args) {
        String str = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str2)); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startsWith / endsWith
        System.out.println(str.startsWith("j")); // true
        System.out.println(str.startsWith(str3)); // true
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("J".toLowerCase())); // true
        // String is the only class that you can call methods on literals ^^^
        System.out.println(str.endsWith("va")); // true

        // contains
        System.out.println(str.contains(str3)); // true
        System.out.println(str.contains("av")); // true
        System.out.println("Java".contains("j")); // false

        // replace
        String myString = "Java" + " " + "is" + " " + "cool";

        System.out.println(myString.replace('a', 'A')); // JAvA is cool
        System.out.println(myString.replace(" ", "_")); // Java_is_cool
        System.out.println(myString.replace("is", "_")); // Java _ cool
        System.out.println(myString); // Java is cool

        // trim
        System.out.println("Java".trim()); // 'Java'
        System.out.println(" Java is cool "); // ' Java is cool '
        System.out.println(" Java is cool ".trim()); // 'Java is cool'

        



    }
}
