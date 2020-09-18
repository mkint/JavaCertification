package academy.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Johnson");
    }

    public Person(String firstName, String last) {
//        this(); // DNC, recursive constructors not allowed --> person() -> person(x,y) -> person() -> etc
        this.firstName = firstName;
//        this.lastName = last; // this is optional since parameter name is different
        lastName = last;
    }

    public void setFirstName(String firstName) {
//        this(); // DNC, this() can only be used in constructors
        firstName = firstName; // compiles but does nothing, sets parameter to itself (does not use instance variable)
        this.firstName = firstName; // fixes above issue
    }

    public String getFirstName() {
        return firstName;
//        return this.firstName; // unnecessary but depends on style
    }

    public String getFullName() {
//        return this.firstName + " " + this.lastName;
        return firstName + lastName;
    }

    public static void main(String[] args) {

    }
}
