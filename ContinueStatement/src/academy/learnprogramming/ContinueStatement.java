package academy.learnprogramming;

public class ContinueStatement {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for(String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP:
        for(String animal : animals) {
            if(animal.equals("Cat")) {
                continue MY_LOOP;
            }

            System.out.println(animal);
        }

        animal:
        for(String animal : animals) {
            if(animal.equals("Cat")) {
                System.out.println("EQUALS CAT");
                continue;
            }

            System.out.println(animal);
        }

        for(String animal: animals) {
            if(animal.equals("Lizard")) {
                continue;
            }

            System.out.println(animal);
        }

        int index = 0;
        while(index < animals.length) {
            String animal = animals[index];
            // index++ (fixes infinite loop) or put index++ in the
            // animals[index++] above
            if(animal.equals("Lizard")) {
                continue; // creates infinite loop (stays at "Lizard")
                // can be fixed by moving index++ to the top of the while loop or just
                // using a for loop with counter embedded in it.. duh
            }

            System.out.println(animal);
            index++;
        }
        /*

                Optional Labels     break       continue

        if          yes             no          no
        while       yes             yes         yes
        do while    yes             yes         yes
        for         yes             yes         yes
        switch      yes             yes         no

         */


    }
}
