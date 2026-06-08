package Constructor.ShallowCopyConstructor;

public class Address {
    String area;
    String city;
    int pinCode;

    Address(String area, String city, int pinCode){
        super();
        this.area = area;
        this.city= city;
        this.pinCode=pinCode;
    }
    public void displayAddress(){
        System.out.println("Address [area =" + area+ "city=" + city +" pinCode=" + pinCode +"]");
    }
}
