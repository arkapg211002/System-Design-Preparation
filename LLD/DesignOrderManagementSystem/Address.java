package LowLevelDesign.DesignOrderManagementSystem;

public class Address {

    int pinCode;
    String city;
    String state;

    Address(int pinCode, String city, String state){
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }
    //getters & setters methods


    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
