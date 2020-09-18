package academy.learnprogramming;

class Dog {
    // only one public class allowed per file

    private String color;

    public Dog(String color) {
        color = color; // refers to parameter rather than instance variable

        System.out.println("constructor");
        this.color = color;
    }

    public void printColor() {
        System.out.println("color= " + this.color); // this is not technically needed without a parameter
//        System.out.println("color= " + color); // prints the same as above

    }

    // public dog() {} // not a constructor (case sensitive)
    // public void Dog() {} // common trick, not a constructor because of return type
}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight) {
        // length = this.length // common trick, just sets parameter to instance variable (pointless)
        this.length = length;
        height = theHeight;
        color = "white";
    }

    public void printInfo() {
//        System.out.println("Cat length= " + this.length + " height= " + this.height + " color= " + this.color); // works but no need for this here
        System.out.println("Cat length= " + length + " height= " + height + " color= " + color);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {
        Dog dog = new Dog("gray");
        dog.printColor();

        Cat cat = new Cat(10, 12);
        cat.printInfo();
    }
}
