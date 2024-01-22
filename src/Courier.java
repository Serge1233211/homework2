// A class to represent a courier, which is a subclass of employee
public class Courier extends Employee {
    // A constructor to initialize the id and name of the courier
    public Courier(long id, String name) {
        // Calling the superclass constructor
        super(id, name);
    }

    // A method to deliver the package
    public void deliverPackage() {
        // Some code to implement the delivery logic
        System.out.println("Courier " + getName() + " is delivering the package.");
    }
}
