package Constructor.DeepCopyConstructor;

public class Address {
    String area;
    String city;
    int pinCode;

    Address(String area, String city, int pinCode) {
        super();
        this.area = area;
        this.city = city;
        this.pinCode = pinCode;
    }

    public Address(Address oldAddress) {
        super();
        this.area = oldAddress.area;
        this.city = oldAddress.city;
        this.pinCode = oldAddress.pinCode;
    }

    public void displayAddress() {
        System.out.println("Address [area = " + area + ", city= " + city + ", pinCode= " + pinCode + "]");
    }
}

