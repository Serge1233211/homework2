// A main class that shows everything in the code
public class Main {
    public static void main(String[] args) {
        // Creating some objects of different classes
        Employee alice = new Employee(1L, "Alice", new Office(1L, "Sales"), new Computer(1L, "Dell"));
        SecurityGuard bob = new SecurityGuard(2L, "Bob", new Office(2L, "Security"), new Computer(2L, "Lenovo"));
        Courier charlie = new Courier(3L, "Charlie");
        Office marketing = new Office(3L, "Marketing");
        Computer hp = new Computer(3L, "HP");

    }}
