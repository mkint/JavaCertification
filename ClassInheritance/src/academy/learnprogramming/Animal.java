package academy.learnprogramming;

public abstract class Animal {

    private int age;
    private String name; // children and classes in the same package can access

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public double getAverageWeight() {
        return 10.0;
    }

    protected abstract void printName();
//    protected void printDetails() { // won't work outside of package
    public void printDetails() {
        printName();
        System.out.println("age= " + age);
    }

    public void test() {
        System.out.println("test");
    }

//    public static abstract void run();// DNC - cannot have abstract/static at the same time
//    public abstract void run() {}; // DNC - cannot have body, even empty, for abstract methods

    public abstract int getWeight();





}
