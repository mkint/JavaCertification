package academy.learnprogramming;

public class WhileLoop {

    public static void main(String[] args) {
        int spaceOnHdd = 5;

        while(spaceOnHdd > 0) {
            spaceOnHdd--;
            System.out.println("spaceOnHdd= " + spaceOnHdd);
        }

        // exam style questions
        int a = 5;
        int b = 7;

        while (a > 6) {
            b += 2;
            a++;
        }

        a = a > 6 ? a++ : b--;

        System.out.println(a + ", " + b);
        // a > 6 is false (while loop never executed
        // a = 7, b = 6
    }
}
