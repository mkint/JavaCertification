package academy.learnprogramming;

public class ForEachLoop {

    public static void main(String[] args) {
        // For Each loop is also known as enhanced for loop
        String[] names = {"Jimmy", "John", "Tom", "Anthony"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("name= " + names[i]);
        }

        for(String name: names) {
            System.out.println("name= " + name);
            // we can see here how we cannot modify the elements since we
            // are creating a local string
            name = "new"; // won't change anything in array
        }

        for(String name: names) {
            System.out.println("name= " + name);
        }

        // BUT with objects we are passed the reference, so it works to edit
        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder(("Loop"))
        };

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for (StringBuilder builder : builders) {
            builder.append("123");
        }

        for(StringBuilder builder: builders) {
            System.out.println(builder);
        }

        String pets = "Parrots";

//        for(String pet : pets) {
//            // DNC for each does not work on single Strings
//        }

//        for(int name : names) {
//            // DNC name has to be String since names is String[]
//        }

        // but this will work
        for(char c : pets.toCharArray()) {
            System.out.println(c);
        }

        for(int i = 0; i < pets.length(); i++) {
            System.out.println(pets.charAt(i));
        }

    }
}
