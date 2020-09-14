package academy.learnprogramming;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        // java is a pass-by-value language
        int number = 4;
        System.out.println("number= " + number); // 4

        newNumber(number);
        System.out.println("number= " + number); // still 4

        String name = "Jimmy";
        System.out.println("name= " + name); // Jimmy
        newName(name);
        System.out.println("name= " + name); // still Jimmy

        StringBuilder sb = new StringBuilder();
        // sb = ""
        build(sb); // sb = "Tom"
        System.out.println("stringBuilder= " + sb);
        // this is just like doing the following:
        // StringBuilder s = sb;
        // s.append("Anthony");
        // now sb and s = "Anthony"
    }

    public static void newNumber(int number) {
        System.out.println("in newNumber number= " + number); // 4
        number = 10;
        System.out.println("in newNumber number= " + number); // 10
    }

    public static void newName(String name) {
        System.out.println("in newName name= " + name); // Jimmy
        name = "Timmy";
        System.out.println("in newName name= " + name); // Timmy
    }

    public static void build(StringBuilder s) {
        // this is still pass-by-value
        // BUT the new object here is also pointing to the same part of memory as parameter
        // so anything we do to s will also effect sb
        s.append("Tom"); // sb and s now equal "Tom"

        // if we DONT want this to happen
        // we sould just assign s to new string builder
        // s = new StringBuilder(); // at the start of the method
    }
}
