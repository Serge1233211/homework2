// An interface to represent an office-supportable entity
public interface OfficeSupportEntity extends ComputerSupportable {
    // Methods to get and set the office
    Office getOffice();

    void setOffice(Office o);
}
