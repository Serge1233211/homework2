// A class to represent an employee, which is a subclass of person
public class Employee extends Person {
    // A constructor to initialize the id and name of the employee
    public Employee(long id, String name) {
        // Calling the superclass constructor
        super(id, name);
    }

    // A method to perform the work
    public void work() {
        // Some code to implement the work logic
        System.out.println("Employee " + getName() + " is working.");
    }
}
