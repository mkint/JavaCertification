package academy.learnprogramming;

public class DataEncapsulation {

    public static void main(String[] args) {
        Company company = new Company();
//        company.name = "MyCompany";
        company.setName("MyCompany");
//        company.employees.add("John");
        company.addEmployee("John");
//        company.employees.add("Anthony");
        company.addEmployee("Anthony");

        company.printSorted();

//        company.name = null;
        company.setName(null);
//        company.printSorted();

//        company.employees = null;
        company.addEmployee(null);
//        company.employees.add("Jimmy"); // compiles but null pointer exception
        company.printSorted(); // if we comment the above line out this causes null pointer exception

        // so we need data encapsulation to hide data implementation details from users and avoid mistakes like these


    }
}
