package academy.learnprogramming;

//import java.util.Date;
//import java.sql.Date; compilation error since we just imported another Date ^
//common issue is found below, when we use a * import for both which will cause naming errors
//import java.util.*;
//import java.sql.*;

public class ConflictExample {

    public static void main(String[] args) {
        //java.util.Date date; or we can just import it then do the next line
        // Date date; //this will cause some issues as seen above
        java.util.Date utilDate;
        java.sql.Date sqlDate;
        System.out.println("test");

//        Main m = new Main(); //common error, you cannot import from default packages (aka src)
        // so its a good idea to have at least one root package ("academy" in this case) to store stuff if needed
    }
}
