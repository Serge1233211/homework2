package Nonrun;

import Nonrun.Interface.*;

import java.util.List;

public class Office implements Identifiable {
    private Long id;
    private String name;

    public Office(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    // Method to find people by office
    public List<Person> findPeopleByOffice() {
        // Implement your logic here to retrieve people associated with this office
        // You can query a database or use any other data source
        // Return a list of Person objects
        // For demonstration purposes, I'll return an empty list
        return List.of();
    }
}
