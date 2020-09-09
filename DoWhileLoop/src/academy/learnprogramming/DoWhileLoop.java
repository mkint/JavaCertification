package academy.learnprogramming;

public class DoWhileLoop {

    public static void main(String[] args) {

        int a = 0;

        do {
            a++;
        } while (false);

        // in practice it can be hard to tell when to use each type of while loop
        // it doesn't really matter, either can be converted to work
        // but sometimes one or the other will be less code
        // examples

        int x = 20;

        while (x > 10) x--;
        System.out.println("x= " + x);


        int x2 = 20;
    // confusing example but this compiles since the do is a single statement
        do x2--;
        while(x2 > 10);
        System.out.println("x= " + x2);


        int y = 10;
        int z = 5;
        while (y < 20)
            y++;
            z += 2;
            y += 10;

        System.out.println("x= " + x + " y= " + y + " z= " + z);


        int number = 10;

        while(number > 10){
            number--;
        }

        do {
            number--;
            
        } while(number < 10);

        System.out.println("number=" + number);

    }
}
