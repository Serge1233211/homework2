package Nonrun;

import Nonrun.Interface.*;

// An abstract class to represent a person
public abstract class Person implements Identifiable {
    // Fields for id and name
    private Long id;
    private String name;

    // A constructor to initialize the fields
    public Person(Long id, String name) {
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
    public void printname(){
        System.out.println("name: "+getName()+",id; "+getId());
    }
}
