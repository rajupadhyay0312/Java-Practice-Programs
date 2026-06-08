package OOPS.Relationship.Has_a_Relationship.AggregationExampleCar;

public class Driver {
    private String name;
    private long contact;
    private String licence;

    public Driver(String name, long contact, String licence) {
        this.name = name;
        this.contact = contact;
        this.licence = licence;
    }
    public void getDriverInfo(){
        System.out.println("Driver [name = " +name +", contact = "+contact+", licence = "+licence+ "]");
    }
}
