package academy.learnprogramming;

public class Snake extends Reptile {

    @Override
    protected boolean hasLegs() {
        return false;
    }

    @Override
    public double getWeight() { // we can make this public if we want, but cannot go lower access than parent (in this case lower than protected)
        return 10;
    }
}
