package academy.learnprogramming;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class EqualityOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a == b; // boolean c = false
        boolean d = a != b; // boolean c = true

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);

//        boolean g = true == 0; // does not compile (cannot compare numbers with booleans)
//        boolean h = false != "test"; // does not compile for same reason as above

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false); // notice these are assignment operators, not equality operators
        // boolean z = true && false --> boolean z = false

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);




    }
}
