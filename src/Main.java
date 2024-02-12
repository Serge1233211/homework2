import Nonrun.*;

// A main class that shows everything in the code
public class Main {
    public static void main(String[] args) {
        // Creating some objects of different classes
        Employee alice = new Employee(1L, "Alice", new Office(1L, "Sales"), new Computer(1L, "Dell"));
        SecurityGuard bob = new SecurityGuard(2L, "Bob", new Office(2L, "Security"), new Computer(2L, "Lenovo"));
        Courier charlie = new Courier(3L, "Charlie");
        Employee Gerald = new Employee(101L, "Gerald", new Office(1L, "Sales"), new Computer(1L, "Dell"));
        Office marketing = new Office(3L, "Marketing");
        Computer hp = new Computer(3L, "HP");
        alice.printname();
        bob.printname();
        charlie.printname();
        Gerald.printname();
        Office GO = Gerald.getOffice();
        System.out.println("Gerald works in the office: "+ GO.getName());

    }}
