package academy.learnprogramming;

public class Bear extends Animal implements Omnivore {

//    @Override
//    public void eatPlants() {
//        System.out.println("bear eating plants");
//    } // will compile because eatPlants has a default in herbivore

    @Override
    public void eatMeat() {
        System.out.println("bear eating meat");
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public void printName() {
        System.out.println("Bear");
    }
}
