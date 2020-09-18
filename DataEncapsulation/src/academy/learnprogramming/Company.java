package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// classes with getters/setters where we are hiding data
// are also referred to as
// POJOs (plain old java objects) -- normal class with data encapsulation
// properties are private with getters/setters and isBlank() with bools
// promotes re-usability with edits that do not cause other code to break when edited

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName= " + name);
        Collections.sort(employees);
        System.out.println("sorted= " + employees);
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("cannot set name to null/empty string");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String name) {
        if(name == null) {
            System.out.println("cannot add null employee");
            return;
        }

        employees.add(name);
    }
}
