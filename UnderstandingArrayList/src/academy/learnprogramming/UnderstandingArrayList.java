package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnderstandingArrayList {

    public static void main(String[] args) {
        // part of java "collections" API
        // only part of this API that I need to
        // know for the exam
        ArrayList myList = new ArrayList(); // just makes it full of objects
        // like this
        ArrayList<Object> myList2 = new ArrayList<Object>();
        // ArrayList uses generics

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>(); // don't need anything
        // to have anything in the <> on right hand side since Java 5
        List<String> list3 = new ArrayList<>(); // using interface as type
        // List is an interface

//        ArrayList<String> list4 = new List<>(); DNC can't declare arraylist into interface
        
    }
}
