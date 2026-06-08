package OOPS.Relationship.Has_a_Relationship.AggregationBusTicketApplication;

public class Driver {
    private String name;
    private long contact;
    private String licence;
    private Address address;

    public Driver(String name, long contact, String licence) {
        this.name = name;
        this.contact = contact;
        this.licence = licence;
        this.address = new Address("Viman Nagar","pune","Maharashtra",440011);
    }
    public void getDriverInfo(){
        System.out.println("\n **** Driver Details ****");
        System.out.println("Name : "+name);
        System.out.println("Contact : "+contact);
        System.out.println("Licence : "+licence);
    }
}
