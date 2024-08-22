package problems.zoomcar;

public class Location {
    String Address;
    String City;
    String State;
    String Country;
    String PinCode;
    String Landmark;

    public Location(String address, String city, String state, String country, String pinCode, String landmark) {
        Address = address;
        City = city;
        State = state;
        Country = country;
        PinCode = pinCode;
        Landmark = landmark;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPinCode() {
        return PinCode;
    }

    public void setPinCode(String pinCode) {
        PinCode = pinCode;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }
}
