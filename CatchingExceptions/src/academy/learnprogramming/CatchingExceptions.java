package academy.learnprogramming;

class MuseumClosed extends RuntimeException {
}

class MuseumClosedForLunch extends MuseumClosed {
}

public class CatchingExceptions {

    public static void main(String[] args) {
        // be able to recognize if exception is checked or unchecked
        // also recognize if a given exception is a subclass of another
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) { // subclass
            System.out.println("Closed for lunch come back in 2 hours");
        } catch (MuseumClosed mc) { // superclass
            System.out.println("Closed");
        } // compiles properly (subclass caught before superclass)
//        } catch (MuseumClosed mc) { // superclass
//            System.out.println("Closed");
//        } catch (MuseumClosedForLunch mc) { // DNC - "has already been caught" (subclass after superclass)
//            System.out.println("Closed for lunch come back in 2 hours");
//        }
        System.out.println(calculate());
    }

    public static String calculate() {
        String result = "";
        String str = null;
        // nested try catch blocks
        try {
            try {
                result += "start";
                str.length();
                result += "end";
            } catch (NullPointerException e) {
                result += "npe";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
         result += "finished";
        }

        return result;
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if(b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }
}
