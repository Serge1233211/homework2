// An abstract class to represent a person, which implements the Identifiable interface
public abstract class Person implements Identifiable {
    // A field to store the id of the person
    private long id;
    // A field to store the name of the person
    private String name;

    // A constructor to initialize the id and name of the person
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // A getter method to return the id of the person
    public long getId() {
        return id;
    }

    // A setter method to change the id of the person
    public void setId(long id) {
        this.id = id;
    }

    // A getter method to return the name of the person
    public String getName() {
        return name;
    }

    // A setter method to change the name of the person
    public void setName(String name) {
        this.name = name;
    }
}
