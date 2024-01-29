// A class to represent a computer
public class Computer implements Identifiable {
    // Fields for id and name
    private Long id;
    private String name;

    // A constructor to initialize the fields
    public Computer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters for the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
