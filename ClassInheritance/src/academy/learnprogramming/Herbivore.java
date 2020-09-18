package academy.learnprogramming;

public interface Herbivore {

    default void eatPlants() {
        System.out.println("Eating plants");
    }

//    default int getRequiredPlantAmoutn(); // DNC - body is required in default
//    public int getRequiredPlantAmount() {
//        return 0;
//    } // DNC - needs default keyword if we have body





}
