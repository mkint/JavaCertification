package academy.learnprogramming;

public class CharacterArithmetic {

    public static void main(String[] args) {
        // char is 0 - 65535
        char myCharA = 'A';
        char myCharNum = '1';
        // all primitive types have wrapper types -- this one is Character
        System.out.println("myCharA= " + myCharA);
        System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
        System.out.println("myCharA isDigit= " + Character.isDigit(myCharA));
        System.out.println("myCharNum= " + myCharNum);
        System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
        System.out.println("myCharNum isDigit= " + Character.isDigit(myCharNum));

        // exam examples
        char letter = 65; // A
        int myInt = letter + 3;
        char myNewLetter = (char)myInt;

        System.out.println("letter= " + letter + " myInt= " + myInt + " myNewLetter= " + myNewLetter);

        char myChar = 65; // A
        char newChar = (char)(myChar + 1); // newChar = B -- have to cast because characters are auto converted to ints
        boolean b = (newChar == 'B'); // b = true
        boolean c = (newChar++ == 'C'); // false checks 66 == 67, then increments newChar to 67 afterward

        System.out.println("myChar= " + myChar + " newChar= " + newChar + " b= " + b + " c= " + c);



    }
}
