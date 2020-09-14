package academy.learnprogramming;

public class Static {

    private String name = "Static";

    public static void one() {}
    public static void two() {}

    public static void three() {
        one();
        two();
//        four(); // DNC cannot call non-static method from static method
//        System.out.println(name); // DNC cannot call non-static field in static method
    }

    public void four() {
        one();
        two();
        three();
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
//        four(); // DNC - cannot call non-static variable from static main
        // so we can do this
        Static myInstance = new Static();
        myInstance.four();

        new Static().four(); // have to instantiate for non-static



    }
}
