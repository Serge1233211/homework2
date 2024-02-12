package Nonrun;

import Nonrun.Interface.*;

// A class to represent a courier
public class Courier extends Person implements ComputerSupportable {
    Computer computer;
    // A constructor to initialize the fields
    public Courier(Long id, String name, Office office) {
        super(id, name); // Calling the superclass constructor
    }
    public Computer getComputer() {
        return null;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}