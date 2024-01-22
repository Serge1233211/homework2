// A class to represent a security guard, which is a subclass of employee
public class SecurityGuard extends Employee {
    // A constructor to initialize the id and name of the security guard
    public SecurityGuard(long id, String name) {
        // Calling the superclass constructor
        super(id, name);
    }

    // A method to perform the security check
    public void checkSecurity() {
        // Some code to implement the security check logic
        System.out.println("Security guard " + getName() + " is checking security.");
    }
}
