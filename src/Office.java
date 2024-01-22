// A class to represent an office
public class Office implements Identifiable {
    // A field to store the id of the office
    private long id;
    // A field to store the name of the office
    private String name;
    // A field to store an array of employees in the office
    private Employee[] employees;

    // A constructor to initialize the id, name, and employees of the office
    public Office(long id, String name, Employee[] employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    // A getter method to return the id of the office
    public long getId() {
        return id;
    }

    // A setter method to change the id of the office
    public void setId(long id) {
        this.id = id;
    }

    // A getter method to return the name of the office
    public String getName() {
        return name;
    }

    // A setter method to change the name of the office
    public void setName(String name) {
        this.name = name;
    }

    // A getter method to return the array of employees in the office
    public Employee[] getEmployees() {
        return employees;
    }

    // A setter method to change the array of employees in the office
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
