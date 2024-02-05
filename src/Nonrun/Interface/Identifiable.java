package Nonrun.Interface;

// An interface to represent an identifiable entity
public interface Identifiable {
    // Methods to set and get the id
    void setId(Long id);
    Long getId();

    // Default method to compare objects
    default boolean equalTo(Identifiable identifiable) {
        return this.getClass().equals(identifiable.getClass()) && getId().equals(identifiable.getId());
    }
}

