package Nonrun;

import Nonrun.Interface.*;

// A class to represent an employee
public class Employee extends Person implements OfficeSupportEntity, ComputerSupportable {
    // Fields for the office and the computer
    private Office office;
    private Computer computer;

    // A constructor to initialize the fields
    public Employee(Long id, String name, Office office, Computer computer) {
        super(id, name); // Calling the superclass constructor
        this.office = office;
        this.computer = computer;
    }

    // Getters and setters for the office and the computer
    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
