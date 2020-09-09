package academy.learnprogramming;

public class IfElseStatement {

    public static void main(String[] args) {

        int x = 1;
/*        if(x=3) {
        does not compile, cannot assign in an evaluation
        }*/

        int testScore = 76;
        char grade;

        if(testScore >= 90) {
            grade = 'A';
        } else if(testScore >= 80) {
            grade = 'B';
        } //etc

    // we don't technically need the brackets in if statements but it is good practice
        // if you DONT PUT BRACKETS THEN IT CAN ONLY RUN ONE STATEMENT AND ANY MORE WILL CAUSE AN ERROR
        // BUT IF ITS THE LAST ELSE AND INDENTED ONLY THE FIRST STATEMENT WILL RUN
        // exam examples
        int hoursOfDay = 10;
        if(hoursOfDay < 11) System.out.println("morning"); else if (hoursOfDay < 17) System.out.println("evening");
            else System.out.println("day");
            hoursOfDay++; // always runs, doesn't run in the else because there are no brackets


        
    }
}
