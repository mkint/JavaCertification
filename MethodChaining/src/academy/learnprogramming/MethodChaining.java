package academy.learnprogramming;

public class MethodChaining {

    public static void main(String[] args) {
        String start = "  Java  ";
        String trimmed = start.trim();
        System.out.println("trimmed= " + trimmed); // 'Java'

        String lowerCase = trimmed.toLowerCase();
        System.out.println("lowerCase= " + lowerCase); // java

        String result = lowerCase.replace('j', 'J');
        System.out.println("result= " + result); // Java

        // one liner for all this would involve chaining
        String anotherResult = "  Java  ".trim().toLowerCase().replace('j', 'J'); // Java
        System.out.println("anotherResult= " + anotherResult); // Java
        System.out.println(result.equals(anotherResult)); // true

        String a = "abc";
        String b = a.toUpperCase(); // produces new string, doesn't change a variable
        String c = b.replace('B', 'b').replace('C', 'c'); // produces new string
        System.out.println("a= " + a); // abc
        System.out.println("b= " + b); // ABC
        System.out.println("c= " + c); // Abc


        // exam style
        if(a.equalsIgnoreCase(b)) {
            System.out.println("Strings are equal"); // prints
        }

        if(a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
            System.out.println("Equal"); // prints
        }



    }
}
