package academy.learnprogramming;

public class TernaryOperator {

    public static void main(String[] args) {
        // first operand should be a boolean, then any expression that returns
        // a value
        int x = 10;
        int y;

        if(x > 5) {
            y = 2 * x;
        } else {
            y = 4 * x;
        }

        System.out.println("y= " + y);

        // ternary operator
        y = x > 5 ? 2 * x : 4 * x;
        // brackets example
        y = (x > 5) ? (2 * x) : (4 * x); // if left side is true, take left side of colon
        // if left side is false take the right side of colon
        System.out.println("y= " + y);
        // have to use same data types in assignment ( here it is ints )

        // not same data type example
        y = 1;
        System.out.println(y > 5 ? 10 : "Test");
//        int myInt = y < 10 ? 5 : "Test"; will not compile because we are using an assignment operator so we need the same type on the returns


        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;

        System.out.println(a + ", " + b + ", " + c);

        int d = 1;
        int e = 2;
        int f = 3;

        if(d < 10){
            f = d++ < 1 ? e++ : f++;
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }

        // normally f would now be 4, but since we do f = f++, it stays 3
        System.out.println(d + ", " + e + ", " + f);

    }
}
