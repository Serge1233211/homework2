// A class to represent a computer, which implements the Identifiable interface
public class Computer implements Identifiable {
    // A field to store the id of the computer
    private long id;
    // A field to store the name of the computer
    private String name;

    // A constructor to initialize the id and name of the computer
    public Computer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setId(Long id) {
        
    }

    // A getter method to return the id of the computer
    public long getId() {
        return id;
    }

    // A setter method to change the id of the computer
    public void setId(long id) {
        this.id = id;
    }

    // A getter method to return the name of the computer
    public String getName() {
        return name;
    }

    // A setter method to change the name of the computer
    public void setName(String name) {
        this.name = name;
    }
}
