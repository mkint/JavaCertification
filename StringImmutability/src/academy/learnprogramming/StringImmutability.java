package academy.learnprogramming;

public class StringImmutability {

    public static void main(String[] args) {
        String hello = "hello";
        // strings are immutable (cannot be changed once they are assigned)
        // so what happens is when we "change" it, a new string is created instead
        String hi = hello + "world";
        hi = hello;
        System.out.println(hi + hello); // hellohello

        hello.toUpperCase(); // returns a NEW string, most string classes do
        System.out.println(hello);
        hello = hello.toUpperCase();
        // this dereferences hello's current string object and re-references it to another string
        System.out.println(hello);

        // concat
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");

        System.out.println(s1);
        System.out.println(s2);


    }
}
