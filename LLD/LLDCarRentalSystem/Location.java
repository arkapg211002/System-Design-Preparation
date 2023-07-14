package LowLevelDesign.LLDCarRentalSystem;

public class Location {

    String address;
    int pincode;
    String city;
    String state;
    String country;

    Location(int pincode, String city, String state, String country) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;

    }
}
