package academy.learnprogramming;

public class CommonArrayProblems {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int i = 1; i < numbers.length; i++) {
            // first element not printed
            System.out.println(i + " - " + numbers[i]);
        }

//        for(int i = 1; i <= numbers.length; i++) {
//            System.out.println(i + " - " + numbers[i]); // throws out of bounds exception
//        }

//        int[20] nums; // cannot do this on the left side
        int[] nums = new int[20]; // fixes here

//        int size = numbers.length() // does not compile since its not a method
        int size = numbers.length;
//        numbers.length = 10; // DNC can't set length outside of initialization
    }
}
