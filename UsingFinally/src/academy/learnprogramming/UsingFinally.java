package academy.learnprogramming;

public class UsingFinally {

    public static void main(String[] args) {
        String[] array = new String[5]; // objects (string) initialized to null
        array[0] = "John";
//        String element = firstToUppercase(array);
//        System.out.println("element= " + element);
        // null pointer exception [null, null, null, null, null]

        try {
            // need brackets in all try/catch/finally blocks
            String element = firstToUppercase(array);
            System.out.println("element= " + element);
        } catch (NullPointerException npe) {
            System.out.println("Error message= " + npe.getMessage());
        } finally {
            System.out.println("finally block");
        }

        // exam tricks
        String str = "";
        try {
            str += "a";
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";
        System.out.println(str); // acd

        str = "";
        try {
            int result = 10/0;
            str += "a";
        } catch (Exception e) {
            System.out.println(e.toString());
            str += "b";
        } finally {
            str += "c";
        }

        str += "d";
        System.out.println(str); // bcd
    }

    public static String firstToUppercase(String[] array) {
        return array[0].toUpperCase();
    }
}
