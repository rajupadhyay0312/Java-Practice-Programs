package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Address {
    private String area;
    private String city;
    private String state;
    private int pinCode;

    public Address(String area, String city, String state, int pinCode) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }
    public void getAddress(){
        System.out.println("\n *** Address ***");
        System.out.println("Area : "+area);
        System.out.println("City : "+city);
        System.out.println("State : "+city);
        System.out.println("Pin Code : "+pinCode);
    }
}
