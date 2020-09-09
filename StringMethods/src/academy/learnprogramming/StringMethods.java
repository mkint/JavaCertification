package academy.learnprogramming;

public class StringMethods {

    public static void main(String[] args) {
        // going over 13 methods that will be on exam but there
        // are more methods in String class
        // Strings are just arrays of chars (but more powerful)
        String str = "java is fun";

        // length
        System.out.println("length= " + str.length());

        // char at
        // query the string to find char at certain
        // position in string
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
//        System.out.println(str.charAt(12)); // out of bounds
        System.out.println(str.charAt(10));

        // index of
        // finds first index of first occurrence
        // of char or whole string
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun", 10));
        // ^ returns -1 since it couldn't find anything
        System.out.println(str.indexOf("fun", 2));

        // substring
        System.out.println(str.substring(8)); // index 8 until the end of String
        System.out.println(str.substring(0, 2)); // from index 0-1 (2 total)
        System.out.println(str.substring(4, 4)); // empty string

//        System.out.println(str.substring(4, 2)); // out of bounds exception
        // so end param needs to always be greater
        // or equal i guess but it'll be an empty string
//        System.out.println(str.substring(8, 14)); // error happens at runtime

        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
        dog.toUpperCase();
        System.out.println(dog); // Lucky
        dog = dog.toUpperCase();
        System.out.println(dog); // LUCKY










    }
}
